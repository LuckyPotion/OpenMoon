package moom;


public abstract class G4 {

protected moom.G2 a;

protected moom.bs b;

protected int c;

private static net.minecraft.entity.Entity[] d;

private static final long s;

private static final long v;

public G4() {
super();
}


protected G4(int p0) {
super();
    this.c = p0;
}


static {
s = ((long)(((moom._a)(moom._c.a(((long)(-948797482401239632L)), ((long)(-8390145443808339264L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(72257922457721L)))));
    net.minecraft.entity.Entity[] __sourceSpill544_6 = new net.minecraft.entity.Entity[4];
    long local0_life7 = (moom.G4.s ^ 97052767211483L);
    moom.G4.b(((net.minecraft.entity.Entity[])(__sourceSpill544_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill544_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill544_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill544_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill544_15 = new byte[8];
    (__sourceSpill544_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill544_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation544_17 = __sourceSpill544_15;
    ((javax.crypto.Cipher)(__sourceSpill544_12)).init(((int)(__sourceSpill544_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill544_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation544_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = 1919269061867839304L;
    byte[] __sourceSpill544_21 = new byte[8];
    (__sourceSpill544_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill544_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill544_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill544_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill544_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill544_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill544_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill544_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill544_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill544_22)).doFinal(((byte[])(__sourceSpill544_21)));
    v = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


protected abstract void b(net.minecraft.nbt.NBTTagCompound p0);

protected void b(net.minecraft.world.World p0, net.minecraft.block.state.IBlockState p1, int p2, int p3, int p4, moom.G2 p5) {
int forestValue265_57_0;
    int forestValue265_71_0;
    int forestValue265_76_0;
    int forestValue265_94_0;
    int forestValue265_108_0;
    net.minecraft.entity.Entity[] spill265_0;
    boolean spill265_1;
    boolean spill265_2;
    boolean spill265_3;
    boolean spill265_4;
    long life7_3;
    int life10_8;
    int life11_13;
    net.minecraft.entity.Entity[] life9_14;
    int life12_19;
    forest_join_122: {
    forest_join_76: {
    life7_3 = (moom.G4.s ^ 101935163967491L);
    life10_8 = this.a(((int)(p2)), ((int)(p4)));
    spill265_0 = moom.G4.b();
    life11_13 = this.a(((int)(p3)));
    life9_14 = spill265_0;
    life12_19 = this.b(((int)(p2)), ((int)(p4)));
    spill265_1 = ((moom.G2)(p5)).a(((moom.DS)(new moom.DT(life10_8, life11_13, life12_19))));
    if (!((life9_14 != null))) {
        forestValue265_76_0 = ((spill265_1) ? 1 : 0);
        break forest_join_76;
    }
    if (!(spill265_1)) {
        break forest_join_122;
    }
    forest_cycle_31: while (true) {
    forest_join_71: {
    forest_join_57: {
    forest_join_56: {
    if (!((!((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(new moom.DT(life10_8, life11_13, life12_19))))))) {
        break forest_join_56;
    }
    spill265_2 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(new moom.DT(life10_8, life11_13, life12_19)))))).a__ch())).a__fn())).a__Boolean();
    if (!((life9_14 != null))) {
        forestValue265_57_0 = ((spill265_2) ? 1 : 0);
        break forest_join_57;
    }
    if (!((life9_14 != null))) {
        forestValue265_57_0 = ((spill265_2) ? 1 : 0);
        break forest_join_57;
    }
    if (!(spill265_2)) {
        break forest_join_122;
    }
    }
    forestValue265_57_0 = life11_13;
    }
    if (!((life9_14 != null))) {
        forestValue265_71_0 = forestValue265_57_0;
        break forest_join_71;
    }
    if (!((forestValue265_57_0 > 1))) {
        break forest_join_122;
    }
    forestValue265_71_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(new moom.DT(life10_8, life11_13, life12_19))), ((net.minecraft.block.state.IBlockState)(p1)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue265_71_0);
    life11_13 += -1;
    if (!((life9_14 == null))) {
        continue forest_cycle_31;
    }
    break forest_cycle_31;
    }
    break forest_join_122;
    }
    forest_cycle_76: while (true) {
    forest_join_113: {
    forest_join_108: {
    forest_join_94: {
    forest_join_93: {
    if (!((forestValue265_76_0 == 0))) {
        break forest_join_93;
    }
    spill265_3 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(new moom.DT(life10_8, life11_13, life12_19)))))).a__ch())).a__fn())).a__Boolean();
    if (!((life9_14 != null))) {
        forestValue265_94_0 = ((spill265_3) ? 1 : 0);
        break forest_join_94;
    }
    if (!((life9_14 != null))) {
        forestValue265_94_0 = ((spill265_3) ? 1 : 0);
        break forest_join_94;
    }
    if (!(spill265_3)) {
        break forest_join_122;
    }
    }
    forestValue265_94_0 = life11_13;
    }
    if (!((life9_14 != null))) {
        forestValue265_108_0 = forestValue265_94_0;
        break forest_join_108;
    }
    if (!((forestValue265_94_0 > 1))) {
        break forest_join_122;
    }
    forestValue265_108_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(new moom.DT(life10_8, life11_13, life12_19))), ((net.minecraft.block.state.IBlockState)(p1)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue265_108_0);
    life11_13 += -1;
    if (!((life9_14 == null))) {
        break forest_join_113;
    }
    break forest_join_122;
    }
    spill265_4 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(new moom.DT(life10_8, life11_13, life12_19))));
    forestValue265_76_0 = ((spill265_4) ? 1 : 0);
    continue forest_cycle_76;
    }
    }
    return;
}


protected int b(int p0, int p1) {
int forwardValue200_38_0;
    int spill200_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_38: {
    forward_join_37: {
    forward_join_31: {
    forward_join_25: {
    forward_join_19: {
    forward_join_11: {
    life3_3 = (moom.G4.s ^ 28900808191602L);
    life5_5 = moom.G4.b();
    if (!((this.b == null))) {
        break forward_join_11;
    }
    return p1;
    }
    spill200_0 = (moom.H8.a)[((moom.bs)(this.b)).ordinal()];
    if (!((life5_5 != null))) {
        forwardValue200_38_0 = spill200_0;
        break forward_join_38;
    }
    switch (spill200_0) {
case 1:
{
        break forward_join_19;
    }
case 2:
{
        break forward_join_25;
    }
case 3:
case 4:
{
        break forward_join_31;
    }
default:
{
        break forward_join_37;
    }
}
    }
    return (((moom.G2)(this.a)).f - p1);
    }
    return (((moom.G2)(this.a)).c + p1);
    }
    return (((moom.G2)(this.a)).c + p0);
    }
    forwardValue200_38_0 = p1;
    }
    return forwardValue200_38_0;
}


public static void b(net.minecraft.entity.Entity[] p0) {
moom.G4.d = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return moom.G4.d;
}


private static moom.Oo d(moom.Oo p0) {
return p0;
}


protected void a__Void(net.minecraft.world.World p0, int p1, int p2, int p3, moom.G2 p4) {
int forestValue264_44_0;
    int forestValue264_51_0;
    int forestValue264_65_0;
    net.minecraft.entity.Entity[] spill264_0;
    boolean spill264_1;
    int spill264_2;
    int spill264_3;
    boolean spill264_4;
    long life6_3;
    moom.DT life9_19;
    net.minecraft.entity.Entity[] life8_20;
    forest_join_76: {
    forest_join_51: {
    life6_3 = (moom.G4.s ^ 58231510516783L);
    spill264_0 = moom.G4.b();
    life9_19 = new moom.DT(this.a(((int)(p1)), ((int)(p3))), this.a(((int)(p2))), this.b(((int)(p1)), ((int)(p3))));
    life8_20 = spill264_0;
    spill264_1 = ((moom.G2)(p4)).a(((moom.DS)(life9_19)));
    if (!((life8_20 != null))) {
        forestValue264_51_0 = ((spill264_1) ? 1 : 0);
        break forest_join_51;
    }
    if (!(spill264_1)) {
        break forest_join_76;
    }
    forest_cycle_27: while (true) {
    forest_join_44: {
    if (!((!((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life9_19)))))) {
        break forest_join_76;
    }
    spill264_2 = ((moom.DT)(life9_19)).b();
    if (!((life8_20 != null))) {
        forestValue264_44_0 = spill264_2;
        break forest_join_44;
    }
    if (!((spill264_2 < ((int) moom.G4.v)))) {
        break forest_join_76;
    }
    forestValue264_44_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life9_19)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue264_44_0);
    life9_19 = ((moom.DT)(life9_19)).a__DT();
    if (!((life8_20 == null))) {
        continue forest_cycle_27;
    }
    break forest_cycle_27;
    }
    break forest_join_76;
    }
    forest_cycle_51: while (true) {
    forest_join_72: {
    forest_join_65: {
    if (!((forestValue264_51_0 == 0))) {
        break forest_join_76;
    }
    spill264_3 = ((moom.DT)(life9_19)).b();
    if (!((life8_20 != null))) {
        forestValue264_65_0 = spill264_3;
        break forest_join_65;
    }
    if (!((spill264_3 < ((int) moom.G4.v)))) {
        break forest_join_76;
    }
    forestValue264_65_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life9_19)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue264_65_0);
    life9_19 = ((moom.DT)(life9_19)).a__DT();
    if (!((life8_20 == null))) {
        break forest_join_72;
    }
    break forest_join_76;
    }
    spill264_4 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life9_19)));
    forestValue264_51_0 = ((spill264_4) ? 1 : 0);
    continue forest_cycle_51;
    }
    }
    return;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
return;
}


protected boolean a(net.minecraft.world.World p0, moom.G2 p1, java.util.Random p2, int p3, int p4, int p5, java.util.List<moom.D5> p6, int p7) {
net.minecraft.block.state.IBlockState forwardValue1974_37_0;
    int forwardValue1974_64_0;
    int forwardValue1974_66_0;
    net.minecraft.entity.Entity[] spill1974_0;
    boolean spill1974_1;
    net.minecraft.block.state.IBlockState spill1974_2;
    int spill1974_3;
    long life9_3;
    moom.DT life12_19;
    net.minecraft.entity.Entity[] life11_20;
    net.minecraft.block.state.IBlockState life13_49;
    net.minecraft.tileentity.TileEntity life14_63;
    forward_join_66: {
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_37: {
    life9_3 = (moom.G4.s ^ 37003876944487L);
    spill1974_0 = moom.G4.b();
    life12_19 = new moom.DT(this.a(((int)(p3)), ((int)(p5))), this.a(((int)(p4))), this.b(((int)(p3)), ((int)(p5))));
    life11_20 = spill1974_0;
    spill1974_1 = ((moom.G2)(p1)).a(((moom.DS)(life12_19)));
    if (!((life11_20 != null))) {
        forwardValue1974_66_0 = ((spill1974_1) ? 1 : 0);
        break forward_join_66;
    }
    if (!(spill1974_1)) {
        break forward_join_65;
    }
    spill1974_2 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life12_19)));
    if (!((life11_20 != null))) {
        forwardValue1974_37_0 = spill1974_2;
        break forward_join_37;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill1974_2)).a__ch() != net.minecraft.init.Blocks.ae))) {
        break forward_join_65;
    }
    forwardValue1974_37_0 = ((moom.cZ)(net.minecraft.init.Blocks.ae)).a__fE();
    }
    life13_49 = forwardValue1974_37_0;
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life12_19)), ((net.minecraft.block.state.IBlockState)(((moom.cZ)(net.minecraft.init.Blocks.ae)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(life12_19)), ((net.minecraft.block.state.IBlockState)(life13_49))))), ((int)(2)));
    life14_63 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(life12_19)));
    spill1974_3 = ((life14_63 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0);
    if (!((life11_20 != null))) {
        forwardValue1974_64_0 = spill1974_3;
        break forward_join_64;
    }
    if (!((spill1974_3 != 0))) {
        break forward_join_63;
    }
    moom.D5.a(((java.util.Random)(p2)), ((java.util.List)(p6)), ((net.minecraft.inventory.IInventory)(((net.minecraft.tileentity.TileEntityChest)(life14_63)))), ((int)(p7)));
    }
    forwardValue1974_64_0 = 1;
    }
    return ((forwardValue1974_64_0) != 0);
    }
    forwardValue1974_66_0 = 0;
    }
    return ((forwardValue1974_66_0) != 0);
}


protected boolean a(net.minecraft.world.World p0, moom.G2 p1, java.util.Random p2, int p3, int p4, int p5, int p6, java.util.List<moom.D5> p7, int p8) {
net.minecraft.world.World forwardValue1973_48_0;
    moom.DT forwardValue1973_48_1;
    int forwardValue1973_62_0;
    int forwardValue1973_64_0;
    net.minecraft.entity.Entity[] spill1973_0;
    boolean spill1973_1;
    net.minecraft.world.World spill1973_2;
    moom.DT spill1973_3;
    int spill1973_4;
    long life10_3;
    moom.DT life13_19;
    net.minecraft.entity.Entity[] life12_20;
    net.minecraft.tileentity.TileEntity life14_61;
    forward_join_64: {
    forward_join_63: {
    forward_join_62: {
    forward_join_61: {
    forward_join_48: {
    life10_3 = (moom.G4.s ^ 114591784525832L);
    spill1973_0 = moom.G4.b();
    life13_19 = new moom.DT(this.a(((int)(p3)), ((int)(p5))), this.a(((int)(p4))), this.b(((int)(p3)), ((int)(p5))));
    life12_20 = spill1973_0;
    spill1973_1 = ((moom.G2)(p1)).a(((moom.DS)(life13_19)));
    if (!((life12_20 != null))) {
        forwardValue1973_64_0 = ((spill1973_1) ? 1 : 0);
        break forward_join_64;
    }
    if (!(spill1973_1)) {
        break forward_join_63;
    }
    spill1973_2 = p0;
    spill1973_3 = life13_19;
    if (!((life12_20 != null))) {
        forwardValue1973_48_0 = spill1973_2;
        forwardValue1973_48_1 = spill1973_3;
        break forward_join_48;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill1973_2)).a__fE(((moom.DT)(spill1973_3))))).a__ch() != net.minecraft.init.Blocks.z))) {
        break forward_join_63;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life13_19)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.z)).b__fE(((int)(this.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.z)), ((int)(p6)))))))), ((int)(2)));
    forwardValue1973_48_0 = p0;
    forwardValue1973_48_1 = life13_19;
    }
    life14_61 = ((net.minecraft.world.World)(forwardValue1973_48_0)).a__B9(((moom.DT)(forwardValue1973_48_1)));
    spill1973_4 = ((life14_61 instanceof moom.Cm) ? 1 : 0);
    if (!((life12_20 != null))) {
        forwardValue1973_62_0 = spill1973_4;
        break forward_join_62;
    }
    if (!((spill1973_4 != 0))) {
        break forward_join_61;
    }
    moom.D5.a(((java.util.Random)(p2)), ((java.util.List)(p7)), ((moom.Cm)(((moom.Cm)(life14_61)))), ((int)(p8)));
    }
    forwardValue1973_62_0 = 1;
    }
    return ((forwardValue1973_62_0) != 0);
    }
    forwardValue1973_64_0 = 0;
    }
    return ((forwardValue1973_64_0) != 0);
}


protected void a(net.minecraft.world.World p0, moom.G2 p1, int p2, int p3, int p4, int p5, int p6, int p7, net.minecraft.block.state.IBlockState p8, boolean p9) {
int forestValue632_44_0;
    int forestValue632_56_0;
    net.minecraft.entity.Entity[] spill632_0;
    int spill632_1;
    boolean spill632_2;
    long life11_3;
    float life14_11;
    net.minecraft.entity.Entity[] life13_12;
    float life15_19;
    float life16_26;
    float life17_33;
    float life18_40;
    int life19_42;
    float life20_52;
    int life21_54;
    float life22_66;
    int life23_70;
    float life24_82;
    float life25_110;
    forest_join_133: {
    life11_3 = (moom.G4.s ^ 38247565415175L);
    spill632_0 = moom.G4.b();
    life14_11 = ((float) ((p5 - p2) + 1));
    life13_12 = spill632_0;
    life15_19 = ((float) ((p6 - p3) + 1));
    life16_26 = ((float) ((p7 - p4) + 1));
    life17_33 = (((float) p2) + (life14_11 / 0x1.0p1f));
    life18_40 = (((float) p4) + (life16_26 / 0x1.0p1f));
    life19_42 = p3;
    forest_cycle_43: while (true) {
    forest_join_130: {
    forestValue632_44_0 = life19_42;
    forest_cycle_44: while (true) {
    if (!((forestValue632_44_0 <= p6))) {
        break forest_join_133;
    }
    life20_52 = (((float) (life19_42 - p3)) / life15_19);
    life21_54 = p2;
    forest_cycle_55: while (true) {
    forest_join_127: {
    forestValue632_56_0 = life21_54;
    forest_cycle_56: while (true) {
    if (!((forestValue632_56_0 <= p5))) {
        break forest_join_130;
    }
    life22_66 = ((((float) life21_54) - life17_33) / (life14_11 * 0x1.0p-1f));
    spill632_1 = p4;
    if (!((life13_12 != null))) {
        forestValue632_44_0 = spill632_1;
        continue forest_cycle_44;
    }
    life23_70 = spill632_1;
    forest_cycle_71: while (true) {
    forest_join_125: {
    forest_join_124: {
    forest_join_98: {
    if (!((life23_70 <= p7))) {
        break forest_join_127;
    }
    life24_82 = ((((float) life23_70) - life18_40) / (life16_26 * 0x1.0p-1f));
    spill632_2 = p9;
    if (!((life13_12 != null))) {
        forestValue632_56_0 = ((spill632_2) ? 1 : 0);
        continue forest_cycle_56;
    }
    if (!(spill632_2)) {
        break forest_join_98;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(this.a(((net.minecraft.world.World)(p0)), ((int)(life21_54)), ((int)(life19_42)), ((int)(life23_70)), ((moom.G2)(p1))))).a__ch())).a__fn() != moom.fn.a))) {
        break forest_join_124;
    }
    }
    life25_110 = (((life22_66 * life22_66) + (life20_52 * life20_52)) + (life24_82 * life24_82));
    if (!((life13_12 != null))) {
        break forest_join_125;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life25_110)), ((float)(0x1.0cccccp0f))) <= 0))) {
        break forest_join_124;
    }
    this.a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(p8)), ((int)(life21_54)), ((int)(life19_42)), ((int)(life23_70)), ((moom.G2)(p1)));
    }
    life23_70 += 1;
    }
    if (!((life13_12 == null))) {
        continue forest_cycle_71;
    }
    break forest_cycle_71;
    }
    break forest_cycle_56;
    }
    }
    life21_54 += 1;
    if (!((life13_12 == null))) {
        continue forest_cycle_55;
    }
    break forest_cycle_55;
    }
    break forest_cycle_44;
    }
    }
    life19_42 += 1;
    if (!((life13_12 == null))) {
        continue forest_cycle_43;
    }
    break forest_cycle_43;
    }
    }
    return;
}


protected void a(net.minecraft.world.World p0, moom.G2 p1, java.util.Random p2, float p3, int p4, int p5, int p6, net.minecraft.block.state.IBlockState p7) {
long local9 = (moom.G4.s ^ 36246054990914L);
    if ((((java.util.Random)(p2)).nextFloat() < p3)) {
        this.a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(p7)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.G2)(p1)));
    }
    return;
}


protected void a(net.minecraft.world.World p0, moom.G2 p1, java.util.Random p2, float p3, int p4, int p5, int p6, int p7, int p8, int p9, net.minecraft.block.state.IBlockState p10, net.minecraft.block.state.IBlockState p11, boolean p12) {
int forestValue633_9_0;
    int forestValue633_14_0;
    int forestValue633_33_0;
    int forestValue633_48_0;
    int forestValue633_54_0;
    int forestValue633_54_1;
    int forestValue633_59_0;
    int forestValue633_59_1;
    int forestValue633_64_0;
    int forestValue633_64_1;
    int forestValue633_69_0;
    int forestValue633_69_1;
    int forestValue633_74_0;
    int forestValue633_74_1;
    net.minecraft.entity.Entity[] spill633_0;
    int spill633_1;
    int spill633_2;
    int spill633_3;
    long life14_3;
    int life17_6;
    net.minecraft.entity.Entity[] life16_7;
    int life18_12;
    int life19_19;
    forest_join_102: {
    life14_3 = (moom.G4.s ^ 139759721724125L);
    spill633_0 = moom.G4.b();
    life17_6 = p5;
    life16_7 = spill633_0;
    forest_cycle_8: while (true) {
    forest_join_99: {
    forestValue633_9_0 = life17_6;
    forest_cycle_9: while (true) {
    if (!((forestValue633_9_0 <= p8))) {
        break forest_join_102;
    }
    life18_12 = p4;
    forest_cycle_13: while (true) {
    forest_join_96: {
    forestValue633_14_0 = life18_12;
    forest_cycle_14: while (true) {
    if (!((forestValue633_14_0 <= p7))) {
        break forest_join_99;
    }
    spill633_1 = p6;
    if (!((life16_7 != null))) {
        forestValue633_9_0 = spill633_1;
        continue forest_cycle_9;
    }
    life19_19 = spill633_1;
    forest_cycle_20: while (true) {
    forest_join_93: {
    forest_join_85: {
    forest_join_74: {
    forest_join_69: {
    forest_join_64: {
    forest_join_59: {
    forest_join_54: {
    forest_join_48: {
    forest_join_47: {
    forest_join_33: {
    if (!((life19_19 <= p9))) {
        break forest_join_96;
    }
    spill633_2 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(p2)).nextFloat())), ((float)(p3)));
    if (!((life16_7 != null))) {
        forestValue633_14_0 = spill633_2;
        continue forest_cycle_14;
    }
    if (!((life16_7 != null))) {
        forestValue633_33_0 = spill633_2;
        break forest_join_33;
    }
    if (!((spill633_2 <= 0))) {
        break forest_join_93;
    }
    forestValue633_33_0 = ((p12) ? 1 : 0);
    }
    if (!((life16_7 != null))) {
        forestValue633_48_0 = forestValue633_33_0;
        break forest_join_48;
    }
    if (!((forestValue633_33_0 != 0))) {
        break forest_join_47;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(this.a(((net.minecraft.world.World)(p0)), ((int)(life18_12)), ((int)(life17_6)), ((int)(life19_19)), ((moom.G2)(p1))))).a__ch())).a__fn() != moom.fn.a))) {
        break forest_join_93;
    }
    }
    forestValue633_48_0 = life17_6;
    }
    spill633_3 = p5;
    if (!((life16_7 != null))) {
        forestValue633_54_0 = forestValue633_48_0;
        forestValue633_54_1 = spill633_3;
        break forest_join_54;
    }
    if (!((forestValue633_48_0 != spill633_3))) {
        break forest_join_85;
    }
    forestValue633_54_0 = life17_6;
    forestValue633_54_1 = p8;
    }
    if (!((life16_7 != null))) {
        forestValue633_59_0 = forestValue633_54_0;
        forestValue633_59_1 = forestValue633_54_1;
        break forest_join_59;
    }
    if (!((forestValue633_54_0 != forestValue633_54_1))) {
        break forest_join_85;
    }
    forestValue633_59_0 = life18_12;
    forestValue633_59_1 = p4;
    }
    if (!((life16_7 != null))) {
        forestValue633_64_0 = forestValue633_59_0;
        forestValue633_64_1 = forestValue633_59_1;
        break forest_join_64;
    }
    if (!((forestValue633_59_0 != forestValue633_59_1))) {
        break forest_join_85;
    }
    forestValue633_64_0 = life18_12;
    forestValue633_64_1 = p7;
    }
    if (!((life16_7 != null))) {
        forestValue633_69_0 = forestValue633_64_0;
        forestValue633_69_1 = forestValue633_64_1;
        break forest_join_69;
    }
    if (!((forestValue633_64_0 != forestValue633_64_1))) {
        break forest_join_85;
    }
    forestValue633_69_0 = life19_19;
    forestValue633_69_1 = p6;
    }
    if (!((life16_7 != null))) {
        forestValue633_74_0 = forestValue633_69_0;
        forestValue633_74_1 = forestValue633_69_1;
        break forest_join_74;
    }
    if (!((forestValue633_69_0 != forestValue633_69_1))) {
        break forest_join_85;
    }
    forestValue633_74_0 = life19_19;
    forestValue633_74_1 = p9;
    }
    if (!((forestValue633_74_0 != forestValue633_74_1))) {
        break forest_join_85;
    }
    this.a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(p11)), ((int)(life18_12)), ((int)(life17_6)), ((int)(life19_19)), ((moom.G2)(p1)));
    if (!((life16_7 == null))) {
        break forest_join_93;
    }
    }
    this.a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(p10)), ((int)(life18_12)), ((int)(life17_6)), ((int)(life19_19)), ((moom.G2)(p1)));
    }
    life19_19 += 1;
    if (!((life16_7 == null))) {
        continue forest_cycle_20;
    }
    break forest_cycle_20;
    }
    break forest_cycle_14;
    }
    }
    life18_12 += 1;
    if (!((life16_7 == null))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    break forest_cycle_9;
    }
    }
    life17_6 += 1;
    if (!((life16_7 == null))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    }
    return;
}


protected void a(net.minecraft.world.World p0, net.minecraft.block.state.IBlockState p1, int p2, int p3, int p4, moom.G2 p5) {
int forwardValue1975_32_0;
    net.minecraft.entity.Entity[] spill1975_0;
    boolean spill1975_1;
    long life7_3;
    moom.DT life10_19;
    net.minecraft.entity.Entity[] life9_20;
    forward_join_33: {
    forward_join_32: {
    life7_3 = (moom.G4.s ^ 105361300368452L);
    spill1975_0 = moom.G4.b();
    life10_19 = new moom.DT(this.a(((int)(p2)), ((int)(p4))), this.a(((int)(p3))), this.b(((int)(p2)), ((int)(p4))));
    life9_20 = spill1975_0;
    spill1975_1 = ((moom.G2)(p5)).a(((moom.DS)(life10_19)));
    if (!((life9_20 != null))) {
        forwardValue1975_32_0 = ((spill1975_1) ? 1 : 0);
        break forward_join_32;
    }
    if (!(spill1975_1)) {
        break forward_join_33;
    }
    forwardValue1975_32_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life10_19)), ((net.minecraft.block.state.IBlockState)(p1)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue1975_32_0);
    }
    return;
}


public net.minecraft.nbt.NBTTagCompound a__yw() {
net.minecraft.nbt.NBTTagCompound forwardValue1978_30_0;
    java.lang.String forwardValue1978_30_1;
    net.minecraft.nbt.NBTTagCompound forwardValue1978_32_0;
    java.lang.String forwardValue1978_32_1;
    moom.bs forwardValue1978_32_2;
    net.minecraft.nbt.NBTTagCompound forwardValue1978_33_0;
    java.lang.String forwardValue1978_33_1;
    int forwardValue1978_33_2;
    net.minecraft.entity.Entity[] spill1978_0;
    net.minecraft.nbt.NBTTagCompound spill1978_1;
    java.lang.String spill1978_2;
    moom.bs spill1978_3;
    long life1_3;
    net.minecraft.nbt.NBTTagCompound life4_7;
    net.minecraft.entity.Entity[] life3_20;
    forward_join_33: {
    forward_join_32: {
    forward_join_30: {
    life1_3 = (moom.G4.s ^ 50128341573402L);
    life4_7 = new net.minecraft.nbt.NBTTagCompound();
    spill1978_0 = moom.G4.b();
    ((net.minecraft.nbt.NBTTagCompound)(life4_7)).a(((java.lang.String)("id")), ((java.lang.String)(moom.G1.a(((moom.G4)(this))))));
    ((net.minecraft.nbt.NBTTagCompound)(life4_7)).a(((java.lang.String)("BB")), ((net.minecraft.nbt.NBTBase)(((moom.G2)(this.a)).a__yy())));
    life3_20 = spill1978_0;
    spill1978_1 = life4_7;
    spill1978_2 = "O";
    spill1978_3 = this.b;
    if (!((life3_20 != null))) {
        forwardValue1978_32_0 = spill1978_1;
        forwardValue1978_32_1 = spill1978_2;
        forwardValue1978_32_2 = spill1978_3;
        break forward_join_32;
    }
    if (!((spill1978_3 == null))) {
        forwardValue1978_30_0 = spill1978_1;
        forwardValue1978_30_1 = spill1978_2;
        break forward_join_30;
    }
    forwardValue1978_33_0 = spill1978_1;
    forwardValue1978_33_1 = spill1978_2;
    forwardValue1978_33_2 = -1;
    break forward_join_33;
    }
    forwardValue1978_32_0 = forwardValue1978_30_0;
    forwardValue1978_32_1 = forwardValue1978_30_1;
    forwardValue1978_32_2 = this.b;
    }
    forwardValue1978_33_0 = forwardValue1978_32_0;
    forwardValue1978_33_1 = forwardValue1978_32_1;
    forwardValue1978_33_2 = ((moom.bs)(forwardValue1978_32_2)).b();
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue1978_33_0)).a__Void(((java.lang.String)(forwardValue1978_33_1)), ((int)(forwardValue1978_33_2)));
    ((net.minecraft.nbt.NBTTagCompound)(life4_7)).a__Void(((java.lang.String)("GD")), ((int)(this.c)));
    this.a(((net.minecraft.nbt.NBTTagCompound)(life4_7)));
    return life4_7;
}


protected abstract void a(net.minecraft.nbt.NBTTagCompound p0);

public void a(net.minecraft.world.World p0, net.minecraft.nbt.NBTTagCompound p1) {
int forwardValue1976_23_0;
    moom.G4 forwardValue1976_32_0;
    moom.G4 forwardValue1976_33_0;
    int forwardValue1976_33_1;
    moom.G4 forwardValue1976_34_0;
    moom.bs forwardValue1976_34_1;
    boolean spill1976_0;
    moom.G4 spill1976_1;
    int spill1976_2;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_29;
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_23: {
    forward_join_20: {
    life3_3 = (moom.G4.s ^ 139429736928786L);
    life5_5 = moom.G4.b();
    spill1976_0 = ((net.minecraft.nbt.NBTTagCompound)(p1)).a__Boolean(((java.lang.String)("BB")));
    if (!((life5_5 != null))) {
        forwardValue1976_23_0 = ((spill1976_0) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill1976_0)) {
        break forward_join_20;
    }
    this.a = ((moom.G2)(new moom.G2(((net.minecraft.nbt.NBTTagCompound)(p1)).a__ArrayInt(((java.lang.String)("BB"))))));
    }
    forwardValue1976_23_0 = ((net.minecraft.nbt.NBTTagCompound)(p1)).a__Int(((java.lang.String)("O")));
    }
    life6_29 = forwardValue1976_23_0;
    spill1976_1 = this;
    spill1976_2 = life6_29;
    if (!((life5_5 != null))) {
        forwardValue1976_33_0 = spill1976_1;
        forwardValue1976_33_1 = spill1976_2;
        break forward_join_33;
    }
    if (!((spill1976_2 == -1))) {
        forwardValue1976_32_0 = spill1976_1;
        break forward_join_32;
    }
    forwardValue1976_34_0 = spill1976_1;
    forwardValue1976_34_1 = null;
    break forward_join_34;
    }
    forwardValue1976_33_0 = forwardValue1976_32_0;
    forwardValue1976_33_1 = life6_29;
    }
    forwardValue1976_34_0 = forwardValue1976_33_0;
    forwardValue1976_34_1 = moom.bs.b(((int)(forwardValue1976_33_1)));
    }
    ((moom.G4)(forwardValue1976_34_0)).b = ((moom.bs)(forwardValue1976_34_1));
    this.c = ((int)(((net.minecraft.nbt.NBTTagCompound)(p1)).a__Int(((java.lang.String)("GD")))));
    this.b(((net.minecraft.nbt.NBTTagCompound)(p1)));
    return;
}


public void a(int p0, int p1, int p2) {
((moom.G2)(this.a)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


protected void a(net.minecraft.world.World p0, moom.G2 p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6) {
long local8 = (moom.G4.s ^ 78458659157703L);
    moom.DT local10 = new moom.DT(this.a(((int)(p3)), ((int)(p5))), this.a(((int)(p4))), this.b(((int)(p3)), ((int)(p5))));
    if (((moom.G2)(p1)).a(((moom.DS)(local10)))) {
        moom.xc.a(((net.minecraft.world.World)(p0)), ((moom.DT)(local10)), ((moom.bs)(((moom.bs)(p6)).e__bs())), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.ao)));
    }
    return;
}


protected boolean a(net.minecraft.world.World p0, moom.G2 p1) {
int forestValue634_67_0;
    int forestValue634_102_0;
    int forestValue634_116_0;
    int forestValue634_118_0;
    int forestValue634_120_0;
    int forestValue634_155_0;
    int forestValue634_169_0;
    int forestValue634_171_0;
    int forestValue634_173_0;
    int forestValue634_208_0;
    int forestValue634_222_0;
    int forestValue634_224_0;
    net.minecraft.entity.Entity[] spill634_0;
    int spill634_1;
    boolean spill634_2;
    int spill634_3;
    boolean spill634_4;
    int spill634_5;
    boolean spill634_6;
    long life3_3;
    int life6_13;
    net.minecraft.entity.Entity[] life5_14;
    int life7_23;
    int life8_32;
    int life9_41;
    int life10_50;
    int life11_59;
    moom.DU life12_63;
    int life13_65;
    int life14_72;
    int life13_120;
    int life14_127;
    int life13_175;
    int life14_182;
    forest_join_224: {
    forest_join_223: {
    forest_join_222: {
    forest_join_221: {
    forest_join_219: {
    forest_join_171: {
    forest_join_170: {
    forest_join_169: {
    forest_join_168: {
    forest_join_166: {
    forest_join_118: {
    forest_join_117: {
    forest_join_116: {
    forest_join_115: {
    forest_join_113: {
    life3_3 = (moom.G4.s ^ 16642783905043L);
    spill634_0 = moom.G4.b();
    life6_13 = java.lang.Math.max(((int)((((moom.G2)(this.a)).a - 1))), ((int)(((moom.G2)(p1)).a)));
    life5_14 = spill634_0;
    life7_23 = java.lang.Math.max(((int)((((moom.G2)(this.a)).b - 1))), ((int)(((moom.G2)(p1)).b)));
    life8_32 = java.lang.Math.max(((int)((((moom.G2)(this.a)).c - 1))), ((int)(((moom.G2)(p1)).c)));
    life9_41 = java.lang.Math.min(((int)((((moom.G2)(this.a)).d + 1))), ((int)(((moom.G2)(p1)).d)));
    life10_50 = java.lang.Math.min(((int)((((moom.G2)(this.a)).e + 1))), ((int)(((moom.G2)(p1)).e)));
    life11_59 = java.lang.Math.min(((int)((((moom.G2)(this.a)).f + 1))), ((int)(((moom.G2)(p1)).f)));
    life12_63 = new moom.DU();
    life13_65 = life6_13;
    forest_cycle_66: while (true) {
    forest_join_109: {
    forestValue634_67_0 = life13_65;
    forest_cycle_67: while (true) {
    if (!((forestValue634_67_0 <= life9_41))) {
        break forest_join_117;
    }
    spill634_1 = life8_32;
    if (!((life5_14 != null))) {
        forestValue634_118_0 = spill634_1;
        break forest_join_118;
    }
    life14_72 = spill634_1;
    forest_cycle_73: while (true) {
    forest_join_106: {
    forest_join_102: {
    forest_join_92: {
    if (!((life14_72 <= life11_59))) {
        break forest_join_109;
    }
    spill634_2 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life12_63)).a(((int)(life13_65)), ((int)(life7_23)), ((int)(life14_72)))))))).a__ch())).a__fn())).a__Boolean();
    if (!((life5_14 != null))) {
        forestValue634_67_0 = ((spill634_2) ? 1 : 0);
        continue forest_cycle_67;
    }
    if (!((life5_14 != null))) {
        forestValue634_102_0 = ((spill634_2) ? 1 : 0);
        break forest_join_102;
    }
    if (!(spill634_2)) {
        break forest_join_92;
    }
    break forest_join_113;
    }
    forestValue634_102_0 = ((((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life12_63)).a(((int)(life13_65)), ((int)(life10_50)), ((int)(life14_72)))))))).a__ch())).a__fn())).a__Boolean()) ? 1 : 0);
    }
    if (!((life5_14 != null))) {
        forestValue634_116_0 = forestValue634_102_0;
        break forest_join_116;
    }
    if (!((forestValue634_102_0 != 0))) {
        break forest_join_106;
    }
    break forest_join_115;
    }
    life14_72 += 1;
    if (!((life5_14 == null))) {
        continue forest_cycle_73;
    }
    break forest_cycle_73;
    }
    break forest_cycle_67;
    }
    }
    life13_65 += 1;
    if (!((life5_14 == null))) {
        continue forest_cycle_66;
    }
    break forest_cycle_66;
    }
    break forest_join_117;
    }
    return ((1) != 0);
    }
    forestValue634_116_0 = 1;
    }
    return ((forestValue634_116_0) != 0);
    }
    forestValue634_118_0 = life6_13;
    }
    life13_120 = forestValue634_118_0;
    forest_cycle_119: while (true) {
    forest_join_162: {
    forestValue634_120_0 = life13_120;
    forest_cycle_120: while (true) {
    if (!((forestValue634_120_0 <= life9_41))) {
        break forest_join_170;
    }
    spill634_3 = life7_23;
    if (!((life5_14 != null))) {
        forestValue634_171_0 = spill634_3;
        break forest_join_171;
    }
    life14_127 = spill634_3;
    forest_cycle_126: while (true) {
    forest_join_159: {
    forest_join_155: {
    forest_join_145: {
    if (!((life14_127 <= life10_50))) {
        break forest_join_162;
    }
    spill634_4 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life12_63)).a(((int)(life13_120)), ((int)(life14_127)), ((int)(life8_32)))))))).a__ch())).a__fn())).a__Boolean();
    if (!((life5_14 != null))) {
        forestValue634_120_0 = ((spill634_4) ? 1 : 0);
        continue forest_cycle_120;
    }
    if (!((life5_14 != null))) {
        forestValue634_155_0 = ((spill634_4) ? 1 : 0);
        break forest_join_155;
    }
    if (!(spill634_4)) {
        break forest_join_145;
    }
    break forest_join_166;
    }
    forestValue634_155_0 = ((((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life12_63)).a(((int)(life13_120)), ((int)(life14_127)), ((int)(life11_59)))))))).a__ch())).a__fn())).a__Boolean()) ? 1 : 0);
    }
    if (!((life5_14 != null))) {
        forestValue634_169_0 = forestValue634_155_0;
        break forest_join_169;
    }
    if (!((forestValue634_155_0 != 0))) {
        break forest_join_159;
    }
    break forest_join_168;
    }
    life14_127 += 1;
    if (!((life5_14 == null))) {
        continue forest_cycle_126;
    }
    break forest_cycle_126;
    }
    break forest_cycle_120;
    }
    }
    life13_120 += 1;
    if (!((life5_14 == null))) {
        continue forest_cycle_119;
    }
    break forest_cycle_119;
    }
    break forest_join_170;
    }
    return ((1) != 0);
    }
    forestValue634_169_0 = 1;
    }
    return ((forestValue634_169_0) != 0);
    }
    forestValue634_171_0 = life8_32;
    }
    life13_175 = forestValue634_171_0;
    forest_cycle_172: while (true) {
    forest_join_215: {
    forestValue634_173_0 = life13_175;
    forest_cycle_173: while (true) {
    if (!((forestValue634_173_0 <= life11_59))) {
        break forest_join_223;
    }
    spill634_5 = life7_23;
    if (!((life5_14 != null))) {
        forestValue634_224_0 = spill634_5;
        break forest_join_224;
    }
    life14_182 = spill634_5;
    forest_cycle_179: while (true) {
    forest_join_212: {
    forest_join_208: {
    forest_join_198: {
    if (!((life14_182 <= life10_50))) {
        break forest_join_215;
    }
    spill634_6 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life12_63)).a(((int)(life6_13)), ((int)(life14_182)), ((int)(life13_175)))))))).a__ch())).a__fn())).a__Boolean();
    if (!((life5_14 != null))) {
        forestValue634_173_0 = ((spill634_6) ? 1 : 0);
        continue forest_cycle_173;
    }
    if (!((life5_14 != null))) {
        forestValue634_208_0 = ((spill634_6) ? 1 : 0);
        break forest_join_208;
    }
    if (!(spill634_6)) {
        break forest_join_198;
    }
    break forest_join_219;
    }
    forestValue634_208_0 = ((((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life12_63)).a(((int)(life9_41)), ((int)(life14_182)), ((int)(life13_175)))))))).a__ch())).a__fn())).a__Boolean()) ? 1 : 0);
    }
    if (!((life5_14 != null))) {
        forestValue634_222_0 = forestValue634_208_0;
        break forest_join_222;
    }
    if (!((forestValue634_208_0 != 0))) {
        break forest_join_212;
    }
    break forest_join_221;
    }
    life14_182 += 1;
    if (!((life5_14 == null))) {
        continue forest_cycle_179;
    }
    break forest_cycle_179;
    }
    break forest_cycle_173;
    }
    }
    life13_175 += 1;
    if (!((life5_14 == null))) {
        continue forest_cycle_172;
    }
    break forest_cycle_172;
    }
    break forest_join_223;
    }
    return ((1) != 0);
    }
    forestValue634_222_0 = 1;
    }
    return ((forestValue634_222_0) != 0);
    }
    forestValue634_224_0 = 0;
    }
    return ((forestValue634_224_0) != 0);
}


protected int a(int p0, int p1) {
int forwardValue198_38_0;
    int spill198_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_38: {
    forward_join_37: {
    forward_join_31: {
    forward_join_25: {
    forward_join_19: {
    forward_join_11: {
    life3_3 = (moom.G4.s ^ 123815207162497L);
    life5_5 = moom.G4.b();
    if (!((this.b == null))) {
        break forward_join_11;
    }
    return p0;
    }
    spill198_0 = (moom.H8.a)[((moom.bs)(this.b)).ordinal()];
    if (!((life5_5 != null))) {
        forwardValue198_38_0 = spill198_0;
        break forward_join_38;
    }
    switch (spill198_0) {
case 1:
case 2:
{
        break forward_join_19;
    }
case 3:
{
        break forward_join_25;
    }
case 4:
{
        break forward_join_31;
    }
default:
{
        break forward_join_37;
    }
}
    }
    return (((moom.G2)(this.a)).a + p0);
    }
    return (((moom.G2)(this.a)).d - p1);
    }
    return (((moom.G2)(this.a)).a + p1);
    }
    forwardValue198_38_0 = p0;
    }
    return forwardValue198_38_0;
}


protected int a(int p0) {
long local2 = (moom.G4.s ^ 66299782018391L);
    return ((this.b == null) ? p0 : (p0 + ((moom.G2)(this.a)).b));
}


public moom.G2 a__G2() {
return this.a;
}


public moom.DT a__DT() {
return new moom.DT(((moom.G2)(this.a)).b__DS());
}


public static moom.G4 a(java.util.List<moom.G4> p0, moom.G2 p1) {
moom.G2 lexicalValue665_25_0;
    moom.G4 lexicalValue665_29_0;
    net.minecraft.entity.Entity[] spill665_0;
    moom.G2 spill665_1;
    moom.G4 spill665_2;
    long life2_3;
    java.util.Iterator life5_7;
    net.minecraft.entity.Entity[] life4_8;
    moom.G4 life6_15;
    lexical_join_32: {
    life2_3 = (moom.G4.s ^ 79191708860274L);
    spill665_0 = moom.G4.b();
    life5_7 = ((java.util.List)(p0)).iterator();
    life4_8 = spill665_0;
    lexical_cycle_9: while (true) {
    lexical_join_30: {
    lexical_join_29: {
    lexical_join_25: {
    if (!(((java.util.Iterator)(life5_7)).hasNext())) {
        break lexical_join_32;
    }
    life6_15 = ((moom.G4)(((java.util.Iterator)(life5_7)).next()));
    spill665_1 = ((moom.G4)(life6_15)).a__G2();
    if (!((life4_8 != null))) {
        lexicalValue665_25_0 = spill665_1;
        break lexical_join_25;
    }
    if (!((spill665_1 != null))) {
        break lexical_join_30;
    }
    spill665_2 = life6_15;
    if (!((life4_8 != null))) {
        lexicalValue665_29_0 = spill665_2;
        break lexical_join_29;
    }
    lexicalValue665_25_0 = ((moom.G4)(spill665_2)).a__G2();
    }
    if (!(((moom.G2)(lexicalValue665_25_0)).a__Boolean(((moom.G2)(p1))))) {
        break lexical_join_30;
    }
    lexicalValue665_29_0 = life6_15;
    }
    return lexicalValue665_29_0;
    }
    if (!((life4_8 == null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return null;
}


public int a() {
return this.c;
}


protected void a(net.minecraft.world.World p0, moom.G2 p1, int p2, int p3, int p4, int p5, int p6, int p7, boolean p8, java.util.Random p9, moom.H9 p10) {
int forestValue27_9_0;
    int forestValue27_14_0;
    moom.H9 forestValue27_73_0;
    java.util.Random forestValue27_73_1;
    int forestValue27_73_2;
    int forestValue27_73_3;
    int forestValue27_73_4;
    moom.H9 forestValue27_74_0;
    java.util.Random forestValue27_74_1;
    int forestValue27_74_2;
    int forestValue27_74_3;
    int forestValue27_74_4;
    int forestValue27_74_5;
    moom.H9 forestValue27_75_0;
    java.util.Random forestValue27_75_1;
    int forestValue27_75_2;
    int forestValue27_75_3;
    int forestValue27_75_4;
    moom.H9 forestValue27_76_0;
    java.util.Random forestValue27_76_1;
    int forestValue27_76_2;
    int forestValue27_76_3;
    int forestValue27_76_4;
    int forestValue27_76_5;
    net.minecraft.entity.Entity[] spill27_0;
    int spill27_1;
    boolean spill27_2;
    moom.H9 spill27_3;
    java.util.Random spill27_4;
    int spill27_5;
    int spill27_6;
    int spill27_7;
    int spill27_8;
    int spill27_9;
    int spill27_10;
    int spill27_11;
    int spill27_12;
    int spill27_13;
    long life12_3;
    int life15_6;
    net.minecraft.entity.Entity[] life14_7;
    int life16_12;
    int life17_19;
    forest_join_95: {
    life12_3 = (moom.G4.s ^ 26945802427391L);
    spill27_0 = moom.G4.b();
    life15_6 = p3;
    life14_7 = spill27_0;
    forest_cycle_8: while (true) {
    forest_join_92: {
    forestValue27_9_0 = life15_6;
    forest_cycle_9: while (true) {
    if (!((forestValue27_9_0 <= p6))) {
        break forest_join_95;
    }
    life16_12 = p2;
    forest_cycle_13: while (true) {
    forest_join_89: {
    forestValue27_14_0 = life16_12;
    forest_cycle_14: while (true) {
    if (!((forestValue27_14_0 <= p5))) {
        break forest_join_92;
    }
    spill27_1 = p4;
    if (!((life14_7 != null))) {
        forestValue27_9_0 = spill27_1;
        continue forest_cycle_9;
    }
    life17_19 = spill27_1;
    forest_cycle_20: while (true) {
    forest_join_86: {
    forest_join_76: {
    forest_join_75: {
    forest_join_74: {
    forest_join_73: {
    forest_join_38: {
    if (!((life17_19 <= p7))) {
        break forest_join_89;
    }
    spill27_2 = p8;
    if (!((life14_7 != null))) {
        forestValue27_14_0 = ((spill27_2) ? 1 : 0);
        continue forest_cycle_14;
    }
    if (!(spill27_2)) {
        break forest_join_38;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(this.a(((net.minecraft.world.World)(p0)), ((int)(life16_12)), ((int)(life15_6)), ((int)(life17_19)), ((moom.G2)(p1))))).a__ch())).a__fn() != moom.fn.a))) {
        break forest_join_86;
    }
    }
    spill27_3 = p10;
    spill27_4 = p9;
    spill27_5 = life16_12;
    spill27_6 = life15_6;
    spill27_7 = life17_19;
    spill27_8 = life15_6;
    if (!((life14_7 != null))) {
        forestValue27_74_0 = spill27_3;
        forestValue27_74_1 = spill27_4;
        forestValue27_74_2 = spill27_5;
        forestValue27_74_3 = spill27_6;
        forestValue27_74_4 = spill27_7;
        forestValue27_74_5 = spill27_8;
        break forest_join_74;
    }
    if (!((spill27_8 != p3))) {
        forestValue27_73_0 = spill27_3;
        forestValue27_73_1 = spill27_4;
        forestValue27_73_2 = spill27_5;
        forestValue27_73_3 = spill27_6;
        forestValue27_73_4 = spill27_7;
        break forest_join_73;
    }
    spill27_9 = life15_6;
    if (!((life14_7 != null))) {
        forestValue27_74_0 = spill27_3;
        forestValue27_74_1 = spill27_4;
        forestValue27_74_2 = spill27_5;
        forestValue27_74_3 = spill27_6;
        forestValue27_74_4 = spill27_7;
        forestValue27_74_5 = spill27_9;
        break forest_join_74;
    }
    if (!((spill27_9 != p6))) {
        forestValue27_73_0 = spill27_3;
        forestValue27_73_1 = spill27_4;
        forestValue27_73_2 = spill27_5;
        forestValue27_73_3 = spill27_6;
        forestValue27_73_4 = spill27_7;
        break forest_join_73;
    }
    spill27_10 = life16_12;
    if (!((life14_7 != null))) {
        forestValue27_74_0 = spill27_3;
        forestValue27_74_1 = spill27_4;
        forestValue27_74_2 = spill27_5;
        forestValue27_74_3 = spill27_6;
        forestValue27_74_4 = spill27_7;
        forestValue27_74_5 = spill27_10;
        break forest_join_74;
    }
    if (!((spill27_10 != p2))) {
        forestValue27_73_0 = spill27_3;
        forestValue27_73_1 = spill27_4;
        forestValue27_73_2 = spill27_5;
        forestValue27_73_3 = spill27_6;
        forestValue27_73_4 = spill27_7;
        break forest_join_73;
    }
    spill27_11 = life16_12;
    if (!((life14_7 != null))) {
        forestValue27_74_0 = spill27_3;
        forestValue27_74_1 = spill27_4;
        forestValue27_74_2 = spill27_5;
        forestValue27_74_3 = spill27_6;
        forestValue27_74_4 = spill27_7;
        forestValue27_74_5 = spill27_11;
        break forest_join_74;
    }
    if (!((spill27_11 != p5))) {
        forestValue27_73_0 = spill27_3;
        forestValue27_73_1 = spill27_4;
        forestValue27_73_2 = spill27_5;
        forestValue27_73_3 = spill27_6;
        forestValue27_73_4 = spill27_7;
        break forest_join_73;
    }
    spill27_12 = life17_19;
    if (!((life14_7 != null))) {
        forestValue27_74_0 = spill27_3;
        forestValue27_74_1 = spill27_4;
        forestValue27_74_2 = spill27_5;
        forestValue27_74_3 = spill27_6;
        forestValue27_74_4 = spill27_7;
        forestValue27_74_5 = spill27_12;
        break forest_join_74;
    }
    if (!((spill27_12 != p4))) {
        forestValue27_73_0 = spill27_3;
        forestValue27_73_1 = spill27_4;
        forestValue27_73_2 = spill27_5;
        forestValue27_73_3 = spill27_6;
        forestValue27_73_4 = spill27_7;
        break forest_join_73;
    }
    spill27_13 = life17_19;
    if (!((life14_7 != null))) {
        forestValue27_74_0 = spill27_3;
        forestValue27_74_1 = spill27_4;
        forestValue27_74_2 = spill27_5;
        forestValue27_74_3 = spill27_6;
        forestValue27_74_4 = spill27_7;
        forestValue27_74_5 = spill27_13;
        break forest_join_74;
    }
    if (!((spill27_13 == p7))) {
        forestValue27_75_0 = spill27_3;
        forestValue27_75_1 = spill27_4;
        forestValue27_75_2 = spill27_5;
        forestValue27_75_3 = spill27_6;
        forestValue27_75_4 = spill27_7;
        break forest_join_75;
    }
    forestValue27_73_0 = spill27_3;
    forestValue27_73_1 = spill27_4;
    forestValue27_73_2 = spill27_5;
    forestValue27_73_3 = spill27_6;
    forestValue27_73_4 = spill27_7;
    }
    forestValue27_74_0 = forestValue27_73_0;
    forestValue27_74_1 = forestValue27_73_1;
    forestValue27_74_2 = forestValue27_73_2;
    forestValue27_74_3 = forestValue27_73_3;
    forestValue27_74_4 = forestValue27_73_4;
    forestValue27_74_5 = 1;
    }
    forestValue27_76_0 = forestValue27_74_0;
    forestValue27_76_1 = forestValue27_74_1;
    forestValue27_76_2 = forestValue27_74_2;
    forestValue27_76_3 = forestValue27_74_3;
    forestValue27_76_4 = forestValue27_74_4;
    forestValue27_76_5 = forestValue27_74_5;
    break forest_join_76;
    }
    forestValue27_76_0 = forestValue27_75_0;
    forestValue27_76_1 = forestValue27_75_1;
    forestValue27_76_2 = forestValue27_75_2;
    forestValue27_76_3 = forestValue27_75_3;
    forestValue27_76_4 = forestValue27_75_4;
    forestValue27_76_5 = 0;
    }
    ((moom.H9)(forestValue27_76_0)).a(((java.util.Random)(forestValue27_76_1)), ((int)(forestValue27_76_2)), ((int)(forestValue27_76_3)), ((int)(forestValue27_76_4)), ((boolean)__sourceIntrinsic_integerToBoolean((forestValue27_76_5))));
    this.a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.H9)(p10)).a())), ((int)(life16_12)), ((int)(life15_6)), ((int)(life17_19)), ((moom.G2)(p1)));
    }
    life17_19 += 1;
    if (!((life14_7 == null))) {
        continue forest_cycle_20;
    }
    break forest_cycle_20;
    }
    break forest_cycle_14;
    }
    }
    life16_12 += 1;
    if (!((life14_7 == null))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    break forest_cycle_9;
    }
    }
    life15_6 += 1;
    if (!((life14_7 == null))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    }
    return;
}


protected void a(net.minecraft.world.World p0, moom.G2 p1, int p2, int p3, int p4, int p5, int p6, int p7, net.minecraft.block.state.IBlockState p8, net.minecraft.block.state.IBlockState p9, boolean p10) {
int forestValue636_9_0;
    int forestValue636_14_0;
    int forestValue636_41_0;
    int forestValue636_47_0;
    int forestValue636_47_1;
    int forestValue636_52_0;
    int forestValue636_52_1;
    int forestValue636_57_0;
    int forestValue636_57_1;
    int forestValue636_62_0;
    int forestValue636_62_1;
    int forestValue636_67_0;
    int forestValue636_67_1;
    net.minecraft.entity.Entity[] spill636_0;
    int spill636_1;
    boolean spill636_2;
    int spill636_3;
    long life12_3;
    int life15_6;
    net.minecraft.entity.Entity[] life14_7;
    int life16_12;
    int life17_19;
    forest_join_95: {
    life12_3 = (moom.G4.s ^ 88334256478682L);
    spill636_0 = moom.G4.b();
    life15_6 = p3;
    life14_7 = spill636_0;
    forest_cycle_8: while (true) {
    forest_join_92: {
    forestValue636_9_0 = life15_6;
    forest_cycle_9: while (true) {
    if (!((forestValue636_9_0 <= p6))) {
        break forest_join_95;
    }
    life16_12 = p2;
    forest_cycle_13: while (true) {
    forest_join_89: {
    forestValue636_14_0 = life16_12;
    forest_cycle_14: while (true) {
    if (!((forestValue636_14_0 <= p5))) {
        break forest_join_92;
    }
    spill636_1 = p4;
    if (!((life14_7 != null))) {
        forestValue636_9_0 = spill636_1;
        continue forest_cycle_9;
    }
    life17_19 = spill636_1;
    forest_cycle_20: while (true) {
    forest_join_86: {
    forest_join_78: {
    forest_join_67: {
    forest_join_62: {
    forest_join_57: {
    forest_join_52: {
    forest_join_47: {
    forest_join_41: {
    forest_join_40: {
    if (!((life17_19 <= p7))) {
        break forest_join_89;
    }
    spill636_2 = p10;
    if (!((life14_7 != null))) {
        forestValue636_14_0 = ((spill636_2) ? 1 : 0);
        continue forest_cycle_14;
    }
    if (!((life14_7 != null))) {
        forestValue636_41_0 = ((spill636_2) ? 1 : 0);
        break forest_join_41;
    }
    if (!(spill636_2)) {
        break forest_join_40;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(this.a(((net.minecraft.world.World)(p0)), ((int)(life16_12)), ((int)(life15_6)), ((int)(life17_19)), ((moom.G2)(p1))))).a__ch())).a__fn() != moom.fn.a))) {
        break forest_join_86;
    }
    }
    forestValue636_41_0 = life15_6;
    }
    spill636_3 = p3;
    if (!((life14_7 != null))) {
        forestValue636_47_0 = forestValue636_41_0;
        forestValue636_47_1 = spill636_3;
        break forest_join_47;
    }
    if (!((forestValue636_41_0 != spill636_3))) {
        break forest_join_78;
    }
    forestValue636_47_0 = life15_6;
    forestValue636_47_1 = p6;
    }
    if (!((life14_7 != null))) {
        forestValue636_52_0 = forestValue636_47_0;
        forestValue636_52_1 = forestValue636_47_1;
        break forest_join_52;
    }
    if (!((forestValue636_47_0 != forestValue636_47_1))) {
        break forest_join_78;
    }
    forestValue636_52_0 = life16_12;
    forestValue636_52_1 = p2;
    }
    if (!((life14_7 != null))) {
        forestValue636_57_0 = forestValue636_52_0;
        forestValue636_57_1 = forestValue636_52_1;
        break forest_join_57;
    }
    if (!((forestValue636_52_0 != forestValue636_52_1))) {
        break forest_join_78;
    }
    forestValue636_57_0 = life16_12;
    forestValue636_57_1 = p5;
    }
    if (!((life14_7 != null))) {
        forestValue636_62_0 = forestValue636_57_0;
        forestValue636_62_1 = forestValue636_57_1;
        break forest_join_62;
    }
    if (!((forestValue636_57_0 != forestValue636_57_1))) {
        break forest_join_78;
    }
    forestValue636_62_0 = life17_19;
    forestValue636_62_1 = p4;
    }
    if (!((life14_7 != null))) {
        forestValue636_67_0 = forestValue636_62_0;
        forestValue636_67_1 = forestValue636_62_1;
        break forest_join_67;
    }
    if (!((forestValue636_62_0 != forestValue636_62_1))) {
        break forest_join_78;
    }
    forestValue636_67_0 = life17_19;
    forestValue636_67_1 = p7;
    }
    if (!((forestValue636_67_0 != forestValue636_67_1))) {
        break forest_join_78;
    }
    this.a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(p9)), ((int)(life16_12)), ((int)(life15_6)), ((int)(life17_19)), ((moom.G2)(p1)));
    if (!((life14_7 == null))) {
        break forest_join_86;
    }
    }
    this.a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(p8)), ((int)(life16_12)), ((int)(life15_6)), ((int)(life17_19)), ((moom.G2)(p1)));
    }
    life17_19 += 1;
    if (!((life14_7 == null))) {
        continue forest_cycle_20;
    }
    break forest_cycle_20;
    }
    break forest_cycle_14;
    }
    }
    life16_12 += 1;
    if (!((life14_7 == null))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    break forest_cycle_9;
    }
    }
    life15_6 += 1;
    if (!((life14_7 == null))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    }
    return;
}


protected void a(net.minecraft.world.World p0, moom.G2 p1, int p2, int p3, int p4, int p5, int p6, int p7) {
int forestValue637_9_0;
    net.minecraft.entity.Entity[] spill637_0;
    int spill637_1;
    long life9_3;
    int life12_6;
    net.minecraft.entity.Entity[] life11_7;
    int life13_12;
    int life14_19;
    forest_join_43: {
    life9_3 = (moom.G4.s ^ 78550926209583L);
    spill637_0 = moom.G4.b();
    life12_6 = p3;
    life11_7 = spill637_0;
    forest_cycle_8: while (true) {
    forest_join_40: {
    forestValue637_9_0 = life12_6;
    forest_cycle_9: while (true) {
    if (!((forestValue637_9_0 <= p6))) {
        break forest_join_43;
    }
    life13_12 = p2;
    forest_cycle_13: while (true) {
    forest_join_38: {
    forest_join_37: {
    if (!((life13_12 <= p5))) {
        break forest_join_40;
    }
    spill637_1 = p4;
    if (!((life11_7 != null))) {
        forestValue637_9_0 = spill637_1;
        continue forest_cycle_9;
    }
    life14_19 = spill637_1;
    forest_cycle_20: while (true) {
    if (!((life14_19 <= p7))) {
        break forest_join_37;
    }
    this.a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(life13_12)), ((int)(life12_6)), ((int)(life14_19)), ((moom.G2)(p1)));
    life14_19 += 1;
    if (!((life11_7 != null))) {
        break forest_join_38;
    }
    if (!((life11_7 == null))) {
        continue forest_cycle_20;
    }
    break forest_cycle_20;
    }
    }
    life13_12 += 1;
    }
    if (!((life11_7 == null))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    break forest_cycle_9;
    }
    }
    life12_6 += 1;
    if (!((life11_7 == null))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    }
    return;
}


protected net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, int p1, int p2, int p3, moom.G2 p4) {
long local6 = (moom.G4.s ^ 18227861741490L);
    int local8 = this.a(((int)(p1)), ((int)(p3)));
    int local9 = this.a(((int)(p2)));
    int local10 = this.b(((int)(p1)), ((int)(p3)));
    moom.DT local11 = new moom.DT(local8, local9, local10);
    return ((!((moom.G2)(p4)).a(((moom.DS)(local11)))) ? ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE() : ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(local11))));
}


public abstract boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2);

protected int a(net.minecraft.block.Block p0, int p1) {
moom.bs forwardValue1966_20_0;
    moom.bs forwardValue1966_20_1;
    int forwardValue1966_29_0;
    net.minecraft.block.Block forwardValue1966_31_0;
    int forwardValue1966_48_0;
    moom.bs forwardValue1966_57_0;
    moom.bs forwardValue1966_57_1;
    moom.bs forwardValue1966_69_0;
    moom.bs forwardValue1966_69_1;
    net.minecraft.block.Block forwardValue1966_77_0;
    net.minecraft.block.Block forwardValue1966_83_0;
    net.minecraft.block.Block forwardValue1966_83_1;
    net.minecraft.block.Block forwardValue1966_88_0;
    net.minecraft.block.Block forwardValue1966_88_1;
    net.minecraft.block.Block forwardValue1966_93_0;
    net.minecraft.block.Block forwardValue1966_93_1;
    net.minecraft.block.Block forwardValue1966_98_0;
    net.minecraft.block.Block forwardValue1966_98_1;
    net.minecraft.block.Block forwardValue1966_103_0;
    net.minecraft.block.Block forwardValue1966_103_1;
    int forwardValue1966_126_0;
    int forwardValue1966_126_1;
    moom.bs forwardValue1966_133_0;
    moom.bs forwardValue1966_133_1;
    int forwardValue1966_148_0;
    int forwardValue1966_148_1;
    int forwardValue1966_157_0;
    int forwardValue1966_157_1;
    int forwardValue1966_168_0;
    int forwardValue1966_168_1;
    moom.bs forwardValue1966_175_0;
    moom.bs forwardValue1966_175_1;
    int forwardValue1966_188_0;
    int forwardValue1966_188_1;
    int forwardValue1966_197_0;
    int forwardValue1966_197_1;
    int forwardValue1966_208_0;
    int forwardValue1966_208_1;
    net.minecraft.block.Block forwardValue1966_216_0;
    net.minecraft.block.Block forwardValue1966_216_1;
    int forwardValue1966_234_0;
    int forwardValue1966_234_1;
    moom.bs forwardValue1966_240_0;
    moom.bs forwardValue1966_240_1;
    int forwardValue1966_252_0;
    int forwardValue1966_252_1;
    int forwardValue1966_259_0;
    int forwardValue1966_259_1;
    int forwardValue1966_268_0;
    int forwardValue1966_268_1;
    moom.bs forwardValue1966_274_0;
    moom.bs forwardValue1966_274_1;
    int forwardValue1966_284_0;
    int forwardValue1966_284_1;
    int forwardValue1966_291_0;
    int forwardValue1966_291_1;
    int forwardValue1966_300_0;
    int forwardValue1966_300_1;
    net.minecraft.block.Block forwardValue1966_304_0;
    net.minecraft.block.Block forwardValue1966_309_0;
    net.minecraft.block.Block forwardValue1966_320_0;
    net.minecraft.block.BlockPistonBase forwardValue1966_320_1;
    net.minecraft.block.Block forwardValue1966_325_0;
    net.minecraft.block.Block forwardValue1966_325_1;
    net.minecraft.block.Block forwardValue1966_330_0;
    net.minecraft.block.Block forwardValue1966_330_1;
    int forwardValue1966_353_0;
    moom.bs forwardValue1966_357_0;
    moom.bs forwardValue1966_357_1;
    int forwardValue1966_372_0;
    int forwardValue1966_372_1;
    int forwardValue1966_381_0;
    int forwardValue1966_381_1;
    int forwardValue1966_392_0;
    int forwardValue1966_392_1;
    moom.bs forwardValue1966_399_0;
    moom.bs forwardValue1966_399_1;
    int forwardValue1966_412_0;
    int forwardValue1966_412_1;
    int forwardValue1966_421_0;
    int forwardValue1966_421_1;
    int forwardValue1966_432_0;
    int forwardValue1966_432_1;
    int forwardValue1966_437_0;
    moom.bs forwardValue1966_457_0;
    moom.bs forwardValue1966_462_0;
    moom.bs forwardValue1966_462_1;
    moom.bs forwardValue1966_475_0;
    moom.bs forwardValue1966_475_1;
    moom.bs forwardValue1966_483_0;
    moom.bs forwardValue1966_483_1;
    moom.bs forwardValue1966_493_0;
    moom.bs forwardValue1966_493_1;
    moom.bs forwardValue1966_495_0;
    moom.bs forwardValue1966_500_0;
    moom.bs forwardValue1966_500_1;
    moom.bs forwardValue1966_505_0;
    moom.bs forwardValue1966_505_1;
    moom.bs forwardValue1966_513_0;
    moom.bs forwardValue1966_513_1;
    moom.bs forwardValue1966_521_0;
    moom.bs forwardValue1966_521_1;
    moom.bs forwardValue1966_531_0;
    moom.bs forwardValue1966_531_1;
    moom.bs forwardValue1966_533_0;
    int forwardValue1966_554_0;
    int forwardValue1966_554_1;
    moom.bs forwardValue1966_560_0;
    moom.bs forwardValue1966_560_1;
    int forwardValue1966_570_0;
    int forwardValue1966_578_0;
    int forwardValue1966_578_1;
    int forwardValue1966_587_0;
    int forwardValue1966_587_1;
    moom.bs forwardValue1966_593_0;
    moom.bs forwardValue1966_593_1;
    int forwardValue1966_601_0;
    int forwardValue1966_609_0;
    int forwardValue1966_609_1;
    int forwardValue1966_618_0;
    int forwardValue1966_618_1;
    int forwardValue1966_622_0;
    net.minecraft.block.Block spill1966_0;
    moom.bs spill1966_1;
    moom.bs spill1966_2;
    int spill1966_3;
    moom.bs spill1966_4;
    moom.bs spill1966_5;
    int spill1966_6;
    net.minecraft.block.Block spill1966_7;
    moom.bs spill1966_8;
    moom.bs spill1966_9;
    int spill1966_10;
    int spill1966_11;
    int spill1966_12;
    int spill1966_13;
    int spill1966_14;
    int spill1966_15;
    int spill1966_16;
    int spill1966_17;
    int spill1966_18;
    net.minecraft.block.Block spill1966_19;
    moom.bs spill1966_20;
    moom.bs spill1966_21;
    int spill1966_22;
    int spill1966_23;
    int spill1966_24;
    int spill1966_25;
    int spill1966_26;
    int spill1966_27;
    int spill1966_28;
    int spill1966_29;
    int spill1966_30;
    int spill1966_31;
    net.minecraft.block.Block spill1966_32;
    net.minecraft.block.BlockPistonBase spill1966_33;
    moom.bs spill1966_34;
    moom.bs spill1966_35;
    int spill1966_36;
    int spill1966_37;
    int spill1966_38;
    int spill1966_39;
    int spill1966_40;
    int spill1966_41;
    int spill1966_42;
    int spill1966_43;
    moom.bs spill1966_44;
    moom.bs spill1966_45;
    moom.bs spill1966_46;
    moom.bs spill1966_47;
    moom.bs spill1966_48;
    moom.bs spill1966_49;
    moom.bs spill1966_50;
    moom.bs spill1966_51;
    moom.bs spill1966_52;
    moom.bs spill1966_53;
    int spill1966_54;
    int spill1966_55;
    int spill1966_56;
    int spill1966_57;
    int spill1966_58;
    int spill1966_59;
    int spill1966_60;
    int spill1966_61;
    int spill1966_62;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    moom.bs life6_759;
    forward_join_622: {
    forward_join_621: {
    forward_join_618: {
    forward_join_614: {
    forward_join_609: {
    forward_join_607: {
    forward_join_601: {
    forward_join_600: {
    forward_join_593: {
    forward_join_590: {
    forward_join_587: {
    forward_join_583: {
    forward_join_578: {
    forward_join_576: {
    forward_join_570: {
    forward_join_569: {
    forward_join_560: {
    forward_join_557: {
    forward_join_554: {
    forward_join_550: {
    forward_join_537: {
    forward_join_535: {
    forward_join_533: {
    forward_join_531: {
    forward_join_527: {
    forward_join_521: {
    forward_join_519: {
    forward_join_513: {
    forward_join_511: {
    forward_join_505: {
    forward_join_500: {
    forward_join_497: {
    forward_join_495: {
    forward_join_493: {
    forward_join_489: {
    forward_join_483: {
    forward_join_481: {
    forward_join_475: {
    forward_join_473: {
    forward_join_462: {
    forward_join_459: {
    forward_join_457: {
    forward_join_455: {
    forward_join_437: {
    forward_join_436: {
    forward_join_432: {
    forward_join_427: {
    forward_join_421: {
    forward_join_418: {
    forward_join_412: {
    forward_join_409: {
    forward_join_399: {
    forward_join_396: {
    forward_join_392: {
    forward_join_387: {
    forward_join_381: {
    forward_join_378: {
    forward_join_372: {
    forward_join_369: {
    forward_join_357: {
    forward_join_354: {
    forward_join_353: {
    forward_join_349: {
    forward_join_331: {
    forward_join_330: {
    forward_join_325: {
    forward_join_320: {
    forward_join_309: {
    forward_join_304: {
    forward_join_303: {
    forward_join_300: {
    forward_join_296: {
    forward_join_291: {
    forward_join_289: {
    forward_join_284: {
    forward_join_282: {
    forward_join_274: {
    forward_join_271: {
    forward_join_268: {
    forward_join_264: {
    forward_join_259: {
    forward_join_257: {
    forward_join_252: {
    forward_join_250: {
    forward_join_240: {
    forward_join_237: {
    forward_join_234: {
    forward_join_230: {
    forward_join_216: {
    forward_join_212: {
    forward_join_208: {
    forward_join_203: {
    forward_join_197: {
    forward_join_194: {
    forward_join_188: {
    forward_join_185: {
    forward_join_175: {
    forward_join_172: {
    forward_join_168: {
    forward_join_163: {
    forward_join_157: {
    forward_join_154: {
    forward_join_148: {
    forward_join_145: {
    forward_join_133: {
    forward_join_130: {
    forward_join_126: {
    forward_join_121: {
    forward_join_103: {
    forward_join_98: {
    forward_join_93: {
    forward_join_88: {
    forward_join_83: {
    forward_join_77: {
    forward_join_76: {
    forward_join_69: {
    forward_join_66: {
    forward_join_57: {
    forward_join_54: {
    forward_join_48: {
    forward_join_47: {
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_21: {
    forward_join_20: {
    life3_3 = (moom.G4.s ^ 47475947798291L);
    life5_5 = moom.G4.b();
    spill1966_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue1966_31_0 = spill1966_0;
        break forward_join_31;
    }
    if (!((spill1966_0 == net.minecraft.init.Blocks.av))) {
        break forward_join_30;
    }
    spill1966_1 = this.b;
    spill1966_2 = moom.bs.WEST;
    if (!((life5_5 != null))) {
        forwardValue1966_20_0 = spill1966_1;
        forwardValue1966_20_1 = spill1966_2;
        break forward_join_20;
    }
    if (!((spill1966_1 != spill1966_2))) {
        break forward_join_21;
    }
    forwardValue1966_20_0 = this.b;
    forwardValue1966_20_1 = moom.bs.EAST;
    }
    if (!((forwardValue1966_20_0 == forwardValue1966_20_1))) {
        break forward_join_621;
    }
    }
    spill1966_3 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_29_0 = spill1966_3;
        break forward_join_29;
    }
    if (!((spill1966_3 == 1))) {
        break forward_join_28;
    }
    return 0;
    }
    forwardValue1966_29_0 = 1;
    }
    return forwardValue1966_29_0;
    }
    forwardValue1966_31_0 = p0;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_77_0 = forwardValue1966_31_0;
        break forward_join_77;
    }
    if (!((((forwardValue1966_31_0 instanceof net.minecraft.block.BlockDoor) ? 1 : 0) != 0))) {
        break forward_join_76;
    }
    spill1966_4 = this.b;
    spill1966_5 = moom.bs.SOUTH;
    if (!((life5_5 != null))) {
        forwardValue1966_57_0 = spill1966_4;
        forwardValue1966_57_1 = spill1966_5;
        break forward_join_57;
    }
    if (!((spill1966_4 == spill1966_5))) {
        break forward_join_54;
    }
    spill1966_6 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_48_0 = spill1966_6;
        break forward_join_48;
    }
    if (!((spill1966_6 == 0))) {
        break forward_join_47;
    }
    return 2;
    }
    forwardValue1966_48_0 = p1;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_622_0 = forwardValue1966_48_0;
        break forward_join_622;
    }
    if (!((forwardValue1966_48_0 == 2))) {
        break forward_join_621;
    }
    return 0;
    }
    forwardValue1966_57_0 = this.b;
    forwardValue1966_57_1 = moom.bs.WEST;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_69_0 = forwardValue1966_57_0;
        forwardValue1966_69_1 = forwardValue1966_57_1;
        break forward_join_69;
    }
    if (!((forwardValue1966_57_0 == forwardValue1966_57_1))) {
        break forward_join_66;
    }
    return ((p1 + 1) & 3);
    }
    forwardValue1966_69_0 = this.b;
    forwardValue1966_69_1 = moom.bs.EAST;
    }
    if (!((forwardValue1966_69_0 == forwardValue1966_69_1))) {
        break forward_join_621;
    }
    return ((p1 + 3) & 3);
    }
    forwardValue1966_77_0 = p0;
    }
    spill1966_7 = net.minecraft.init.Blocks.aw;
    if (!((life5_5 != null))) {
        forwardValue1966_83_0 = forwardValue1966_77_0;
        forwardValue1966_83_1 = spill1966_7;
        break forward_join_83;
    }
    if (!((forwardValue1966_77_0 != spill1966_7))) {
        break forward_join_537;
    }
    forwardValue1966_83_0 = p0;
    forwardValue1966_83_1 = net.minecraft.init.Blocks.ad;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_88_0 = forwardValue1966_83_0;
        forwardValue1966_88_1 = forwardValue1966_83_1;
        break forward_join_88;
    }
    if (!((forwardValue1966_83_0 != forwardValue1966_83_1))) {
        break forward_join_537;
    }
    forwardValue1966_88_0 = p0;
    forwardValue1966_88_1 = net.minecraft.init.Blocks.bp;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_93_0 = forwardValue1966_88_0;
        forwardValue1966_93_1 = forwardValue1966_88_1;
        break forward_join_93;
    }
    if (!((forwardValue1966_88_0 != forwardValue1966_88_1))) {
        break forward_join_537;
    }
    forwardValue1966_93_0 = p0;
    forwardValue1966_93_1 = net.minecraft.init.Blocks.bk;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_98_0 = forwardValue1966_93_0;
        forwardValue1966_98_1 = forwardValue1966_93_1;
        break forward_join_98;
    }
    if (!((forwardValue1966_93_0 != forwardValue1966_93_1))) {
        break forward_join_537;
    }
    forwardValue1966_98_0 = p0;
    forwardValue1966_98_1 = net.minecraft.init.Blocks.bD;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_103_0 = forwardValue1966_98_0;
        forwardValue1966_103_1 = forwardValue1966_98_1;
        break forward_join_103;
    }
    if (!((forwardValue1966_98_0 != forwardValue1966_98_1))) {
        break forward_join_537;
    }
    forwardValue1966_103_0 = p0;
    forwardValue1966_103_1 = net.minecraft.init.Blocks.au;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_216_0 = forwardValue1966_103_0;
        forwardValue1966_216_1 = forwardValue1966_103_1;
        break forward_join_216;
    }
    if (!((forwardValue1966_103_0 == forwardValue1966_103_1))) {
        break forward_join_212;
    }
    spill1966_8 = this.b;
    spill1966_9 = moom.bs.SOUTH;
    if (!((life5_5 != null))) {
        forwardValue1966_133_0 = spill1966_8;
        forwardValue1966_133_1 = spill1966_9;
        break forward_join_133;
    }
    if (!((spill1966_8 == spill1966_9))) {
        break forward_join_130;
    }
    spill1966_10 = p1;
    spill1966_11 = ((moom.bs)(moom.bs.NORTH)).a();
    if (!((life5_5 != null))) {
        forwardValue1966_126_0 = spill1966_10;
        forwardValue1966_126_1 = spill1966_11;
        break forward_join_126;
    }
    if (!((spill1966_10 == spill1966_11))) {
        break forward_join_121;
    }
    return ((moom.bs)(moom.bs.SOUTH)).a();
    }
    spill1966_12 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_622_0 = spill1966_12;
        break forward_join_622;
    }
    forwardValue1966_126_0 = spill1966_12;
    forwardValue1966_126_1 = ((moom.bs)(moom.bs.SOUTH)).a();
    }
    if (!((forwardValue1966_126_0 == forwardValue1966_126_1))) {
        break forward_join_621;
    }
    return ((moom.bs)(moom.bs.NORTH)).a();
    }
    forwardValue1966_133_0 = this.b;
    forwardValue1966_133_1 = moom.bs.WEST;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_175_0 = forwardValue1966_133_0;
        forwardValue1966_175_1 = forwardValue1966_133_1;
        break forward_join_175;
    }
    if (!((forwardValue1966_133_0 == forwardValue1966_133_1))) {
        break forward_join_172;
    }
    spill1966_13 = p1;
    spill1966_14 = ((moom.bs)(moom.bs.NORTH)).a();
    if (!((life5_5 != null))) {
        forwardValue1966_148_0 = spill1966_13;
        forwardValue1966_148_1 = spill1966_14;
        break forward_join_148;
    }
    if (!((spill1966_13 == spill1966_14))) {
        break forward_join_145;
    }
    return ((moom.bs)(moom.bs.WEST)).a();
    }
    forwardValue1966_148_0 = p1;
    forwardValue1966_148_1 = ((moom.bs)(moom.bs.SOUTH)).a();
    }
    if (!((life5_5 != null))) {
        forwardValue1966_157_0 = forwardValue1966_148_0;
        forwardValue1966_157_1 = forwardValue1966_148_1;
        break forward_join_157;
    }
    if (!((forwardValue1966_148_0 == forwardValue1966_148_1))) {
        break forward_join_154;
    }
    return ((moom.bs)(moom.bs.EAST)).a();
    }
    forwardValue1966_157_0 = p1;
    forwardValue1966_157_1 = ((moom.bs)(moom.bs.WEST)).a();
    }
    if (!((life5_5 != null))) {
        forwardValue1966_168_0 = forwardValue1966_157_0;
        forwardValue1966_168_1 = forwardValue1966_157_1;
        break forward_join_168;
    }
    if (!((forwardValue1966_157_0 == forwardValue1966_157_1))) {
        break forward_join_163;
    }
    return ((moom.bs)(moom.bs.NORTH)).a();
    }
    spill1966_15 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_622_0 = spill1966_15;
        break forward_join_622;
    }
    forwardValue1966_168_0 = spill1966_15;
    forwardValue1966_168_1 = ((moom.bs)(moom.bs.EAST)).a();
    }
    if (!((forwardValue1966_168_0 == forwardValue1966_168_1))) {
        break forward_join_621;
    }
    return ((moom.bs)(moom.bs.SOUTH)).a();
    }
    forwardValue1966_175_0 = this.b;
    forwardValue1966_175_1 = moom.bs.EAST;
    }
    if (!((forwardValue1966_175_0 == forwardValue1966_175_1))) {
        break forward_join_621;
    }
    spill1966_16 = p1;
    spill1966_17 = ((moom.bs)(moom.bs.NORTH)).a();
    if (!((life5_5 != null))) {
        forwardValue1966_188_0 = spill1966_16;
        forwardValue1966_188_1 = spill1966_17;
        break forward_join_188;
    }
    if (!((spill1966_16 == spill1966_17))) {
        break forward_join_185;
    }
    return ((moom.bs)(moom.bs.EAST)).a();
    }
    forwardValue1966_188_0 = p1;
    forwardValue1966_188_1 = ((moom.bs)(moom.bs.SOUTH)).a();
    }
    if (!((life5_5 != null))) {
        forwardValue1966_197_0 = forwardValue1966_188_0;
        forwardValue1966_197_1 = forwardValue1966_188_1;
        break forward_join_197;
    }
    if (!((forwardValue1966_188_0 == forwardValue1966_188_1))) {
        break forward_join_194;
    }
    return ((moom.bs)(moom.bs.WEST)).a();
    }
    forwardValue1966_197_0 = p1;
    forwardValue1966_197_1 = ((moom.bs)(moom.bs.WEST)).a();
    }
    if (!((life5_5 != null))) {
        forwardValue1966_208_0 = forwardValue1966_197_0;
        forwardValue1966_208_1 = forwardValue1966_197_1;
        break forward_join_208;
    }
    if (!((forwardValue1966_197_0 == forwardValue1966_197_1))) {
        break forward_join_203;
    }
    return ((moom.bs)(moom.bs.NORTH)).a();
    }
    spill1966_18 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_622_0 = spill1966_18;
        break forward_join_622;
    }
    forwardValue1966_208_0 = spill1966_18;
    forwardValue1966_208_1 = ((moom.bs)(moom.bs.EAST)).a();
    }
    if (!((forwardValue1966_208_0 == forwardValue1966_208_1))) {
        break forward_join_621;
    }
    return ((moom.bs)(moom.bs.SOUTH)).a();
    }
    spill1966_19 = p0;
    if (!((life5_5 != null))) {
        forwardValue1966_304_0 = spill1966_19;
        break forward_join_304;
    }
    forwardValue1966_216_0 = spill1966_19;
    forwardValue1966_216_1 = net.minecraft.init.Blocks.aG;
    }
    if (!((forwardValue1966_216_0 == forwardValue1966_216_1))) {
        break forward_join_303;
    }
    spill1966_20 = this.b;
    spill1966_21 = moom.bs.SOUTH;
    if (!((life5_5 != null))) {
        forwardValue1966_240_0 = spill1966_20;
        forwardValue1966_240_1 = spill1966_21;
        break forward_join_240;
    }
    if (!((spill1966_20 == spill1966_21))) {
        break forward_join_237;
    }
    spill1966_22 = p1;
    spill1966_23 = 3;
    if (!((life5_5 != null))) {
        forwardValue1966_234_0 = spill1966_22;
        forwardValue1966_234_1 = spill1966_23;
        break forward_join_234;
    }
    if (!((spill1966_22 == spill1966_23))) {
        break forward_join_230;
    }
    return 4;
    }
    spill1966_24 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_622_0 = spill1966_24;
        break forward_join_622;
    }
    forwardValue1966_234_0 = spill1966_24;
    forwardValue1966_234_1 = 4;
    }
    if (!((forwardValue1966_234_0 == forwardValue1966_234_1))) {
        break forward_join_621;
    }
    return 3;
    }
    forwardValue1966_240_0 = this.b;
    forwardValue1966_240_1 = moom.bs.WEST;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_274_0 = forwardValue1966_240_0;
        forwardValue1966_274_1 = forwardValue1966_240_1;
        break forward_join_274;
    }
    if (!((forwardValue1966_240_0 == forwardValue1966_240_1))) {
        break forward_join_271;
    }
    spill1966_25 = p1;
    spill1966_26 = 3;
    if (!((life5_5 != null))) {
        forwardValue1966_252_0 = spill1966_25;
        forwardValue1966_252_1 = spill1966_26;
        break forward_join_252;
    }
    if (!((spill1966_25 == spill1966_26))) {
        break forward_join_250;
    }
    return 1;
    }
    forwardValue1966_252_0 = p1;
    forwardValue1966_252_1 = 4;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_259_0 = forwardValue1966_252_0;
        forwardValue1966_259_1 = forwardValue1966_252_1;
        break forward_join_259;
    }
    if (!((forwardValue1966_252_0 == forwardValue1966_252_1))) {
        break forward_join_257;
    }
    return 2;
    }
    forwardValue1966_259_0 = p1;
    forwardValue1966_259_1 = 2;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_268_0 = forwardValue1966_259_0;
        forwardValue1966_268_1 = forwardValue1966_259_1;
        break forward_join_268;
    }
    if (!((forwardValue1966_259_0 == forwardValue1966_259_1))) {
        break forward_join_264;
    }
    return 3;
    }
    spill1966_27 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_622_0 = spill1966_27;
        break forward_join_622;
    }
    forwardValue1966_268_0 = spill1966_27;
    forwardValue1966_268_1 = 1;
    }
    if (!((forwardValue1966_268_0 == forwardValue1966_268_1))) {
        break forward_join_621;
    }
    return 4;
    }
    forwardValue1966_274_0 = this.b;
    forwardValue1966_274_1 = moom.bs.EAST;
    }
    if (!((forwardValue1966_274_0 == forwardValue1966_274_1))) {
        break forward_join_621;
    }
    spill1966_28 = p1;
    spill1966_29 = 3;
    if (!((life5_5 != null))) {
        forwardValue1966_284_0 = spill1966_28;
        forwardValue1966_284_1 = spill1966_29;
        break forward_join_284;
    }
    if (!((spill1966_28 == spill1966_29))) {
        break forward_join_282;
    }
    return 2;
    }
    forwardValue1966_284_0 = p1;
    forwardValue1966_284_1 = 4;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_291_0 = forwardValue1966_284_0;
        forwardValue1966_291_1 = forwardValue1966_284_1;
        break forward_join_291;
    }
    if (!((forwardValue1966_284_0 == forwardValue1966_284_1))) {
        break forward_join_289;
    }
    return 1;
    }
    forwardValue1966_291_0 = p1;
    forwardValue1966_291_1 = 2;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_300_0 = forwardValue1966_291_0;
        forwardValue1966_300_1 = forwardValue1966_291_1;
        break forward_join_300;
    }
    if (!((forwardValue1966_291_0 == forwardValue1966_291_1))) {
        break forward_join_296;
    }
    return 3;
    }
    spill1966_30 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_622_0 = spill1966_30;
        break forward_join_622;
    }
    forwardValue1966_300_0 = spill1966_30;
    forwardValue1966_300_1 = 1;
    }
    if (!((forwardValue1966_300_0 == forwardValue1966_300_1))) {
        break forward_join_621;
    }
    return 4;
    }
    forwardValue1966_304_0 = p0;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_309_0 = forwardValue1966_304_0;
        break forward_join_309;
    }
    if (!((forwardValue1966_304_0 != net.minecraft.init.Blocks.bG))) {
        break forward_join_436;
    }
    forwardValue1966_309_0 = p0;
    }
    spill1966_31 = ((forwardValue1966_309_0 instanceof net.minecraft.block.BlockDirectional) ? 1 : 0);
    if (!((life5_5 != null))) {
        forwardValue1966_437_0 = spill1966_31;
        break forward_join_437;
    }
    if (!((spill1966_31 == 0))) {
        break forward_join_436;
    }
    spill1966_32 = p0;
    spill1966_33 = net.minecraft.init.Blocks.J;
    if (!((life5_5 != null))) {
        forwardValue1966_320_0 = spill1966_32;
        forwardValue1966_320_1 = spill1966_33;
        break forward_join_320;
    }
    if (!((spill1966_32 != spill1966_33))) {
        break forward_join_331;
    }
    forwardValue1966_320_0 = p0;
    forwardValue1966_320_1 = net.minecraft.init.Blocks.F;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_325_0 = forwardValue1966_320_0;
        forwardValue1966_325_1 = forwardValue1966_320_1;
        break forward_join_325;
    }
    if (!((forwardValue1966_320_0 != forwardValue1966_320_1))) {
        break forward_join_331;
    }
    forwardValue1966_325_0 = p0;
    forwardValue1966_325_1 = net.minecraft.init.Blocks.ay;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_330_0 = forwardValue1966_325_0;
        forwardValue1966_330_1 = forwardValue1966_325_1;
        break forward_join_330;
    }
    if (!((forwardValue1966_325_0 != forwardValue1966_325_1))) {
        break forward_join_331;
    }
    forwardValue1966_330_0 = p0;
    forwardValue1966_330_1 = net.minecraft.init.Blocks.z;
    }
    if (!((forwardValue1966_330_0 == forwardValue1966_330_1))) {
        break forward_join_621;
    }
    }
    spill1966_34 = this.b;
    spill1966_35 = moom.bs.SOUTH;
    if (!((life5_5 != null))) {
        forwardValue1966_357_0 = spill1966_34;
        forwardValue1966_357_1 = spill1966_35;
        break forward_join_357;
    }
    if (!((spill1966_34 == spill1966_35))) {
        break forward_join_354;
    }
    spill1966_36 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_353_0 = spill1966_36;
        break forward_join_353;
    }
    if (!((spill1966_36 != ((moom.bs)(moom.bs.NORTH)).a()))) {
        break forward_join_349;
    }
    spill1966_37 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_622_0 = spill1966_37;
        break forward_join_622;
    }
    if (!((spill1966_37 == ((moom.bs)(moom.bs.SOUTH)).a()))) {
        break forward_join_621;
    }
    }
    forwardValue1966_353_0 = ((moom.bs)(((moom.bs)(moom.bs.a(((int)(p1))))).a__bs())).a();
    }
    return forwardValue1966_353_0;
    }
    forwardValue1966_357_0 = this.b;
    forwardValue1966_357_1 = moom.bs.WEST;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_399_0 = forwardValue1966_357_0;
        forwardValue1966_399_1 = forwardValue1966_357_1;
        break forward_join_399;
    }
    if (!((forwardValue1966_357_0 == forwardValue1966_357_1))) {
        break forward_join_396;
    }
    spill1966_38 = p1;
    spill1966_39 = ((moom.bs)(moom.bs.NORTH)).a();
    if (!((life5_5 != null))) {
        forwardValue1966_372_0 = spill1966_38;
        forwardValue1966_372_1 = spill1966_39;
        break forward_join_372;
    }
    if (!((spill1966_38 == spill1966_39))) {
        break forward_join_369;
    }
    return ((moom.bs)(moom.bs.WEST)).a();
    }
    forwardValue1966_372_0 = p1;
    forwardValue1966_372_1 = ((moom.bs)(moom.bs.SOUTH)).a();
    }
    if (!((life5_5 != null))) {
        forwardValue1966_381_0 = forwardValue1966_372_0;
        forwardValue1966_381_1 = forwardValue1966_372_1;
        break forward_join_381;
    }
    if (!((forwardValue1966_372_0 == forwardValue1966_372_1))) {
        break forward_join_378;
    }
    return ((moom.bs)(moom.bs.EAST)).a();
    }
    forwardValue1966_381_0 = p1;
    forwardValue1966_381_1 = ((moom.bs)(moom.bs.WEST)).a();
    }
    if (!((life5_5 != null))) {
        forwardValue1966_392_0 = forwardValue1966_381_0;
        forwardValue1966_392_1 = forwardValue1966_381_1;
        break forward_join_392;
    }
    if (!((forwardValue1966_381_0 == forwardValue1966_381_1))) {
        break forward_join_387;
    }
    return ((moom.bs)(moom.bs.NORTH)).a();
    }
    spill1966_40 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_622_0 = spill1966_40;
        break forward_join_622;
    }
    forwardValue1966_392_0 = spill1966_40;
    forwardValue1966_392_1 = ((moom.bs)(moom.bs.EAST)).a();
    }
    if (!((forwardValue1966_392_0 == forwardValue1966_392_1))) {
        break forward_join_621;
    }
    return ((moom.bs)(moom.bs.SOUTH)).a();
    }
    forwardValue1966_399_0 = this.b;
    forwardValue1966_399_1 = moom.bs.EAST;
    }
    if (!((forwardValue1966_399_0 == forwardValue1966_399_1))) {
        break forward_join_621;
    }
    spill1966_41 = p1;
    spill1966_42 = ((moom.bs)(moom.bs.NORTH)).a();
    if (!((life5_5 != null))) {
        forwardValue1966_412_0 = spill1966_41;
        forwardValue1966_412_1 = spill1966_42;
        break forward_join_412;
    }
    if (!((spill1966_41 == spill1966_42))) {
        break forward_join_409;
    }
    return ((moom.bs)(moom.bs.EAST)).a();
    }
    forwardValue1966_412_0 = p1;
    forwardValue1966_412_1 = ((moom.bs)(moom.bs.SOUTH)).a();
    }
    if (!((life5_5 != null))) {
        forwardValue1966_421_0 = forwardValue1966_412_0;
        forwardValue1966_421_1 = forwardValue1966_412_1;
        break forward_join_421;
    }
    if (!((forwardValue1966_412_0 == forwardValue1966_412_1))) {
        break forward_join_418;
    }
    return ((moom.bs)(moom.bs.WEST)).a();
    }
    forwardValue1966_421_0 = p1;
    forwardValue1966_421_1 = ((moom.bs)(moom.bs.WEST)).a();
    }
    if (!((life5_5 != null))) {
        forwardValue1966_432_0 = forwardValue1966_421_0;
        forwardValue1966_432_1 = forwardValue1966_421_1;
        break forward_join_432;
    }
    if (!((forwardValue1966_421_0 == forwardValue1966_421_1))) {
        break forward_join_427;
    }
    return ((moom.bs)(moom.bs.NORTH)).a();
    }
    spill1966_43 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_622_0 = spill1966_43;
        break forward_join_622;
    }
    forwardValue1966_432_0 = spill1966_43;
    forwardValue1966_432_1 = ((moom.bs)(moom.bs.EAST)).a();
    }
    if (!((forwardValue1966_432_0 == forwardValue1966_432_1))) {
        break forward_join_621;
    }
    return ((moom.bs)(moom.bs.SOUTH)).a();
    }
    forwardValue1966_437_0 = p1;
    }
    life6_759 = moom.bs.b(((int)(forwardValue1966_437_0)));
    spill1966_44 = this.b;
    spill1966_45 = moom.bs.SOUTH;
    if (!((life5_5 != null))) {
        forwardValue1966_462_0 = spill1966_44;
        forwardValue1966_462_1 = spill1966_45;
        break forward_join_462;
    }
    if (!((spill1966_44 == spill1966_45))) {
        break forward_join_459;
    }
    spill1966_46 = life6_759;
    if (!((life5_5 != null))) {
        forwardValue1966_457_0 = spill1966_46;
        break forward_join_457;
    }
    if (!((spill1966_46 != moom.bs.SOUTH))) {
        break forward_join_455;
    }
    spill1966_47 = life6_759;
    if (!((life5_5 != null))) {
        forwardValue1966_457_0 = spill1966_47;
        break forward_join_457;
    }
    if (!((spill1966_47 == moom.bs.NORTH))) {
        break forward_join_535;
    }
    }
    forwardValue1966_457_0 = ((moom.bs)(life6_759)).a__bs();
    }
    return ((moom.bs)(forwardValue1966_457_0)).b();
    }
    forwardValue1966_462_0 = this.b;
    forwardValue1966_462_1 = moom.bs.WEST;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_500_0 = forwardValue1966_462_0;
        forwardValue1966_500_1 = forwardValue1966_462_1;
        break forward_join_500;
    }
    if (!((forwardValue1966_462_0 == forwardValue1966_462_1))) {
        break forward_join_497;
    }
    spill1966_48 = life6_759;
    spill1966_49 = moom.bs.NORTH;
    if (!((life5_5 != null))) {
        forwardValue1966_475_0 = spill1966_48;
        forwardValue1966_475_1 = spill1966_49;
        break forward_join_475;
    }
    if (!((spill1966_48 == spill1966_49))) {
        break forward_join_473;
    }
    return ((moom.bs)(moom.bs.WEST)).b();
    }
    forwardValue1966_475_0 = life6_759;
    forwardValue1966_475_1 = moom.bs.SOUTH;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_483_0 = forwardValue1966_475_0;
        forwardValue1966_483_1 = forwardValue1966_475_1;
        break forward_join_483;
    }
    if (!((forwardValue1966_475_0 == forwardValue1966_475_1))) {
        break forward_join_481;
    }
    return ((moom.bs)(moom.bs.EAST)).b();
    }
    forwardValue1966_483_0 = life6_759;
    forwardValue1966_483_1 = moom.bs.WEST;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_493_0 = forwardValue1966_483_0;
        forwardValue1966_493_1 = forwardValue1966_483_1;
        break forward_join_493;
    }
    if (!((forwardValue1966_483_0 == forwardValue1966_483_1))) {
        break forward_join_489;
    }
    return ((moom.bs)(moom.bs.NORTH)).b();
    }
    spill1966_50 = life6_759;
    if (!((life5_5 != null))) {
        forwardValue1966_495_0 = spill1966_50;
        break forward_join_495;
    }
    forwardValue1966_493_0 = spill1966_50;
    forwardValue1966_493_1 = moom.bs.EAST;
    }
    if (!((forwardValue1966_493_0 == forwardValue1966_493_1))) {
        break forward_join_535;
    }
    forwardValue1966_495_0 = moom.bs.SOUTH;
    }
    return ((moom.bs)(forwardValue1966_495_0)).b();
    }
    forwardValue1966_500_0 = this.b;
    forwardValue1966_500_1 = moom.bs.EAST;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_505_0 = forwardValue1966_500_0;
        forwardValue1966_505_1 = forwardValue1966_500_1;
        break forward_join_505;
    }
    if (!((forwardValue1966_500_0 == forwardValue1966_500_1))) {
        break forward_join_535;
    }
    forwardValue1966_505_0 = life6_759;
    forwardValue1966_505_1 = moom.bs.NORTH;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_513_0 = forwardValue1966_505_0;
        forwardValue1966_513_1 = forwardValue1966_505_1;
        break forward_join_513;
    }
    if (!((forwardValue1966_505_0 == forwardValue1966_505_1))) {
        break forward_join_511;
    }
    return ((moom.bs)(moom.bs.EAST)).b();
    }
    forwardValue1966_513_0 = life6_759;
    forwardValue1966_513_1 = moom.bs.SOUTH;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_521_0 = forwardValue1966_513_0;
        forwardValue1966_521_1 = forwardValue1966_513_1;
        break forward_join_521;
    }
    if (!((forwardValue1966_513_0 == forwardValue1966_513_1))) {
        break forward_join_519;
    }
    return ((moom.bs)(moom.bs.WEST)).b();
    }
    forwardValue1966_521_0 = life6_759;
    forwardValue1966_521_1 = moom.bs.WEST;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_531_0 = forwardValue1966_521_0;
        forwardValue1966_531_1 = forwardValue1966_521_1;
        break forward_join_531;
    }
    if (!((forwardValue1966_521_0 == forwardValue1966_521_1))) {
        break forward_join_527;
    }
    return ((moom.bs)(moom.bs.NORTH)).b();
    }
    spill1966_51 = life6_759;
    if (!((life5_5 != null))) {
        forwardValue1966_533_0 = spill1966_51;
        break forward_join_533;
    }
    forwardValue1966_531_0 = spill1966_51;
    forwardValue1966_531_1 = moom.bs.EAST;
    }
    if (!((forwardValue1966_531_0 == forwardValue1966_531_1))) {
        break forward_join_535;
    }
    forwardValue1966_533_0 = moom.bs.SOUTH;
    }
    return ((moom.bs)(forwardValue1966_533_0)).b();
    }
    if (!((life5_5 == null))) {
        break forward_join_621;
    }
    }
    spill1966_52 = this.b;
    spill1966_53 = moom.bs.SOUTH;
    if (!((life5_5 != null))) {
        forwardValue1966_560_0 = spill1966_52;
        forwardValue1966_560_1 = spill1966_53;
        break forward_join_560;
    }
    if (!((spill1966_52 == spill1966_53))) {
        break forward_join_557;
    }
    spill1966_54 = p1;
    spill1966_55 = 2;
    if (!((life5_5 != null))) {
        forwardValue1966_554_0 = spill1966_54;
        forwardValue1966_554_1 = spill1966_55;
        break forward_join_554;
    }
    if (!((spill1966_54 == spill1966_55))) {
        break forward_join_550;
    }
    return 3;
    }
    spill1966_56 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_622_0 = spill1966_56;
        break forward_join_622;
    }
    forwardValue1966_554_0 = spill1966_56;
    forwardValue1966_554_1 = 3;
    }
    if (!((forwardValue1966_554_0 == forwardValue1966_554_1))) {
        break forward_join_621;
    }
    return 2;
    }
    forwardValue1966_560_0 = this.b;
    forwardValue1966_560_1 = moom.bs.WEST;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_593_0 = forwardValue1966_560_0;
        forwardValue1966_593_1 = forwardValue1966_560_1;
        break forward_join_593;
    }
    if (!((forwardValue1966_560_0 == forwardValue1966_560_1))) {
        break forward_join_590;
    }
    spill1966_57 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_570_0 = spill1966_57;
        break forward_join_570;
    }
    if (!((spill1966_57 == 0))) {
        break forward_join_569;
    }
    return 2;
    }
    forwardValue1966_570_0 = p1;
    }
    spill1966_58 = 1;
    if (!((life5_5 != null))) {
        forwardValue1966_578_0 = forwardValue1966_570_0;
        forwardValue1966_578_1 = spill1966_58;
        break forward_join_578;
    }
    if (!((forwardValue1966_570_0 == spill1966_58))) {
        break forward_join_576;
    }
    return 3;
    }
    forwardValue1966_578_0 = p1;
    forwardValue1966_578_1 = 2;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_587_0 = forwardValue1966_578_0;
        forwardValue1966_587_1 = forwardValue1966_578_1;
        break forward_join_587;
    }
    if (!((forwardValue1966_578_0 == forwardValue1966_578_1))) {
        break forward_join_583;
    }
    return 0;
    }
    spill1966_59 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_622_0 = spill1966_59;
        break forward_join_622;
    }
    forwardValue1966_587_0 = spill1966_59;
    forwardValue1966_587_1 = 3;
    }
    if (!((forwardValue1966_587_0 == forwardValue1966_587_1))) {
        break forward_join_621;
    }
    return 1;
    }
    forwardValue1966_593_0 = this.b;
    forwardValue1966_593_1 = moom.bs.EAST;
    }
    if (!((forwardValue1966_593_0 == forwardValue1966_593_1))) {
        break forward_join_621;
    }
    spill1966_60 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_601_0 = spill1966_60;
        break forward_join_601;
    }
    if (!((spill1966_60 == 0))) {
        break forward_join_600;
    }
    return 2;
    }
    forwardValue1966_601_0 = p1;
    }
    spill1966_61 = 1;
    if (!((life5_5 != null))) {
        forwardValue1966_609_0 = forwardValue1966_601_0;
        forwardValue1966_609_1 = spill1966_61;
        break forward_join_609;
    }
    if (!((forwardValue1966_601_0 == spill1966_61))) {
        break forward_join_607;
    }
    return 3;
    }
    forwardValue1966_609_0 = p1;
    forwardValue1966_609_1 = 2;
    }
    if (!((life5_5 != null))) {
        forwardValue1966_618_0 = forwardValue1966_609_0;
        forwardValue1966_618_1 = forwardValue1966_609_1;
        break forward_join_618;
    }
    if (!((forwardValue1966_609_0 == forwardValue1966_609_1))) {
        break forward_join_614;
    }
    return 1;
    }
    spill1966_62 = p1;
    if (!((life5_5 != null))) {
        forwardValue1966_622_0 = spill1966_62;
        break forward_join_622;
    }
    forwardValue1966_618_0 = spill1966_62;
    forwardValue1966_618_1 = 3;
    }
    if (!((forwardValue1966_618_0 == forwardValue1966_618_1))) {
        break forward_join_621;
    }
    return 0;
    }
    forwardValue1966_622_0 = p1;
    }
    return forwardValue1966_622_0;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
