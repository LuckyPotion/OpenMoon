package net.minecraft.tileentity;


public class TileEntityPiston extends net.minecraft.tileentity.TileEntity implements net.minecraft.util.ITickable {

private net.minecraft.block.state.IBlockState l;

private moom.bs m;

private boolean n;

private boolean o;

private float p;

private float q;

private final java.util.List<net.minecraft.entity.Entity> r;

private static final long s;

public TileEntityPiston() {
super();
    this.r = com.google.common.collect.Lists.newArrayList();
}


public TileEntityPiston(net.minecraft.block.state.IBlockState p0, moom.bs p1, boolean p2, boolean p3) {
super();
    this.r = com.google.common.collect.Lists.newArrayList();
    this.l = p0;
    this.m = p1;
    this.n = p2;
    this.o = p3;
}


static {
s = (moom._c.a(-2445114368098973992L, 3903391539507955640L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(146832169848376L);
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("blockId")), ((int)(net.minecraft.block.Block.a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(this.l)).a__ch()))))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("blockData")), ((int)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(this.l)).a__ch())).b(((net.minecraft.block.state.IBlockState)(this.l))))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("facing")), ((int)(((moom.bs)(this.m)).a())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("progress")), ((float)(this.q)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("extending")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.n) ? 1 : 0)))));
    return;
}


public void b() {
net.minecraft.tileentity.TileEntityPiston forwardValue5708_14_0;
    net.minecraft.world.World forwardValue5708_33_0;
    net.minecraft.world.World forwardValue5708_54_0;
    moom.DT forwardValue5708_54_1;
    net.minecraft.tileentity.TileEntityPiston spill5708_0;
    net.minecraft.world.World spill5708_1;
    net.minecraft.tileentity.TileEntityPiston spill5708_2;
    float spill5708_3;
    moom.DT spill5708_4;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_58: {
    forward_join_54: {
    forward_join_33: {
    forward_join_14: {
    life1_3 = (net.minecraft.tileentity.TileEntityPiston.s ^ 68419257276291L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5708_0 = this;
    if (!((life3_5 != null))) {
        forwardValue5708_14_0 = spill5708_0;
        break forward_join_14;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.tileentity.TileEntityPiston)(spill5708_0)).q)), ((float)(0x1.0p0f))) < 0))) {
        break forward_join_58;
    }
    forwardValue5708_14_0 = this;
    }
    spill5708_1 = ((net.minecraft.tileentity.TileEntityPiston)(forwardValue5708_14_0)).d;
    if (!((life3_5 != null))) {
        forwardValue5708_33_0 = spill5708_1;
        break forward_join_33;
    }
    if (!((spill5708_1 != null))) {
        break forward_join_58;
    }
    spill5708_2 = this;
    net.minecraft.tileentity.TileEntityPiston __stackOp5708_5_0 = this;
    float __stackOp5708_5_1 = 0x1.0p0f;
    spill5708_3 = __stackOp5708_5_1;
    ((net.minecraft.tileentity.TileEntityPiston)(__stackOp5708_5_0)).p = ((float)(__stackOp5708_5_1));
    ((net.minecraft.tileentity.TileEntityPiston)(spill5708_2)).q = ((float)(spill5708_3));
    ((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityPiston)(this)).d)).c__Void(((moom.DT)(((net.minecraft.tileentity.TileEntityPiston)(this)).e)));
    ((net.minecraft.tileentity.TileEntityPiston)(this)).d__Void();
    forwardValue5708_33_0 = ((net.minecraft.tileentity.TileEntityPiston)(this)).d;
    }
    spill5708_4 = ((net.minecraft.tileentity.TileEntityPiston)(this)).e;
    if (!((life3_5 != null))) {
        forwardValue5708_54_0 = forwardValue5708_33_0;
        forwardValue5708_54_1 = spill5708_4;
        break forward_join_54;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(forwardValue5708_33_0)).a__fE(((moom.DT)(spill5708_4))))).a__ch() == net.minecraft.init.Blocks.M))) {
        break forward_join_58;
    }
    ((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityPiston)(this)).d)).a(((moom.DT)(((net.minecraft.tileentity.TileEntityPiston)(this)).e)), ((net.minecraft.block.state.IBlockState)(this.l)), ((int)(3)));
    forwardValue5708_54_0 = ((net.minecraft.tileentity.TileEntityPiston)(this)).d;
    forwardValue5708_54_1 = ((net.minecraft.tileentity.TileEntityPiston)(this)).e;
    }
    ((net.minecraft.world.World)(forwardValue5708_54_0)).c(((moom.DT)(forwardValue5708_54_1)), ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(this.l)).a__ch())));
    }
    return;
}


public float b(float p0) {
net.minecraft.tileentity.TileEntityPiston forwardValue5709_12_0;
    float forwardValue5709_32_0;
    net.minecraft.tileentity.TileEntityPiston spill5709_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_32: {
    forward_join_22: {
    forward_join_12: {
    life2_3 = (net.minecraft.tileentity.TileEntityPiston.s ^ 39562042622886L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5709_0 = this;
    if (!((life4_5 != null))) {
        forwardValue5709_12_0 = spill5709_0;
        break forward_join_12;
    }
    if (!(((net.minecraft.tileentity.TileEntityPiston)(spill5709_0)).n)) {
        break forward_join_22;
    }
    forwardValue5709_12_0 = this;
    }
    forwardValue5709_32_0 = ((((net.minecraft.tileentity.TileEntityPiston)(forwardValue5709_12_0)).a(((float)(p0))) - 0x1.0p0f) * ((float) ((moom.bs)(this.m)).c()));
    break forward_join_32;
    }
    forwardValue5709_32_0 = ((0x1.0p0f - ((net.minecraft.tileentity.TileEntityPiston)(this)).a(((float)(p0)))) * ((float) ((moom.bs)(this.m)).c()));
    }
    return forwardValue5709_32_0;
}


public boolean b__Boolean() {
return ((((this.n) ? 1 : 0)) != 0);
}


public int e() {
return 0;
}


public float c(float p0) {
net.minecraft.tileentity.TileEntityPiston forwardValue5710_12_0;
    float forwardValue5710_32_0;
    net.minecraft.tileentity.TileEntityPiston spill5710_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_32: {
    forward_join_22: {
    forward_join_12: {
    life2_3 = (net.minecraft.tileentity.TileEntityPiston.s ^ 129828544989302L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5710_0 = this;
    if (!((life4_5 != null))) {
        forwardValue5710_12_0 = spill5710_0;
        break forward_join_12;
    }
    if (!(((net.minecraft.tileentity.TileEntityPiston)(spill5710_0)).n)) {
        break forward_join_22;
    }
    forwardValue5710_12_0 = this;
    }
    forwardValue5710_32_0 = ((((net.minecraft.tileentity.TileEntityPiston)(forwardValue5710_12_0)).a(((float)(p0))) - 0x1.0p0f) * ((float) ((moom.bs)(this.m)).d()));
    break forward_join_32;
    }
    forwardValue5710_32_0 = ((0x1.0p0f - ((net.minecraft.tileentity.TileEntityPiston)(this)).a(((float)(p0)))) * ((float) ((moom.bs)(this.m)).d()));
    }
    return forwardValue5710_32_0;
}


public void c__Void() {
net.minecraft.world.World forwardValue5711_51_0;
    moom.DT forwardValue5711_51_1;
    int forwardValue5711_67_0;
    int forwardValue5711_77_0;
    net.minecraft.tileentity.TileEntityPiston forwardValue5711_79_0;
    java.lang.String[] spill5711_0;
    int spill5711_1;
    net.minecraft.world.World spill5711_2;
    moom.DT spill5711_3;
    net.minecraft.tileentity.TileEntityPiston spill5711_4;
    long life1_3;
    java.lang.String[] life3_9;
    forward_join_89: {
    forward_join_79: {
    forward_join_77: {
    forward_join_73: {
    forward_join_67: {
    forward_join_57: {
    forward_join_51: {
    life1_3 = (net.minecraft.tileentity.TileEntityPiston.s ^ 101564056635841L);
    spill5711_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    this.q = ((float)(this.p));
    life3_9 = spill5711_0;
    spill5711_1 = recovery.source.CarrierOps.fcmpl(((float)(this.q)), ((float)(0x1.0p0f)));
    if (!((life3_9 != null))) {
        forwardValue5711_67_0 = spill5711_1;
        break forward_join_67;
    }
    if (!((spill5711_1 >= 0))) {
        break forward_join_57;
    }
    ((net.minecraft.tileentity.TileEntityPiston)(this)).a(((float)(0x1.0p0f)), ((float)(0x1.0p-2f)));
    ((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityPiston)(this)).d)).c__Void(((moom.DT)(((net.minecraft.tileentity.TileEntityPiston)(this)).e)));
    ((net.minecraft.tileentity.TileEntityPiston)(this)).d__Void();
    spill5711_2 = ((net.minecraft.tileentity.TileEntityPiston)(this)).d;
    spill5711_3 = ((net.minecraft.tileentity.TileEntityPiston)(this)).e;
    if (!((life3_9 != null))) {
        forwardValue5711_51_0 = spill5711_2;
        forwardValue5711_51_1 = spill5711_3;
        break forward_join_51;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill5711_2)).a__fE(((moom.DT)(spill5711_3))))).a__ch() == net.minecraft.init.Blocks.M))) {
        break forward_join_89;
    }
    ((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityPiston)(this)).d)).a(((moom.DT)(((net.minecraft.tileentity.TileEntityPiston)(this)).e)), ((net.minecraft.block.state.IBlockState)(this.l)), ((int)(3)));
    forwardValue5711_51_0 = ((net.minecraft.tileentity.TileEntityPiston)(this)).d;
    forwardValue5711_51_1 = ((net.minecraft.tileentity.TileEntityPiston)(this)).e;
    }
    ((net.minecraft.world.World)(forwardValue5711_51_0)).c(((moom.DT)(forwardValue5711_51_1)), ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(this.l)).a__ch())));
    if (!((life3_9 == null))) {
        break forward_join_89;
    }
    }
    net.minecraft.tileentity.TileEntityPiston __stackOp5711_25_0 = this;
    ((net.minecraft.tileentity.TileEntityPiston)(__stackOp5711_25_0)).p = ((float)((((net.minecraft.tileentity.TileEntityPiston)(__stackOp5711_25_0)).p + 0x1.0p-1f)));
    forwardValue5711_67_0 = recovery.source.CarrierOps.fcmpl(((float)(this.p)), ((float)(0x1.0p0f)));
    }
    if (!((life3_9 != null))) {
        forwardValue5711_77_0 = forwardValue5711_67_0;
        break forward_join_77;
    }
    if (!((forwardValue5711_67_0 >= 0))) {
        break forward_join_73;
    }
    this.p = ((float)(0x1.0p0f));
    }
    spill5711_4 = this;
    if (!((life3_9 != null))) {
        forwardValue5711_79_0 = spill5711_4;
        break forward_join_79;
    }
    forwardValue5711_77_0 = ((((net.minecraft.tileentity.TileEntityPiston)(spill5711_4)).n) ? 1 : 0);
    }
    if (!((forwardValue5711_77_0 != 0))) {
        break forward_join_89;
    }
    forwardValue5711_79_0 = this;
    }
    ((net.minecraft.tileentity.TileEntityPiston)(forwardValue5711_79_0)).a(((float)(this.p)), ((float)(((this.p - this.q) + 0x1.0p-4f))));
    }
    return;
}


public boolean c__Boolean() {
return ((((this.o) ? 1 : 0)) != 0);
}


public float d(float p0) {
net.minecraft.tileentity.TileEntityPiston forwardValue5712_12_0;
    float forwardValue5712_32_0;
    net.minecraft.tileentity.TileEntityPiston spill5712_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_32: {
    forward_join_22: {
    forward_join_12: {
    life2_3 = (net.minecraft.tileentity.TileEntityPiston.s ^ 106275286000479L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5712_0 = this;
    if (!((life4_5 != null))) {
        forwardValue5712_12_0 = spill5712_0;
        break forward_join_12;
    }
    if (!(((net.minecraft.tileentity.TileEntityPiston)(spill5712_0)).n)) {
        break forward_join_22;
    }
    forwardValue5712_12_0 = this;
    }
    forwardValue5712_32_0 = ((((net.minecraft.tileentity.TileEntityPiston)(forwardValue5712_12_0)).a(((float)(p0))) - 0x1.0p0f) * ((float) ((moom.bs)(this.m)).e()));
    break forward_join_32;
    }
    forwardValue5712_32_0 = ((0x1.0p0f - ((net.minecraft.tileentity.TileEntityPiston)(this)).a(((float)(p0)))) * ((float) ((moom.bs)(this.m)).e()));
    }
    return forwardValue5712_32_0;
}


public moom.bs a__sourceReturn_7c12d77acb() {
return this.m;
}


public net.minecraft.block.state.IBlockState a__fE() {
return this.l;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.l = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.block.Block.a(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("blockId")))))))).b__fE(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("blockData"))))))));
    this.m = ((moom.bs)(moom.bs.a(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("facing"))))))));
    net.minecraft.tileentity.TileEntityPiston __sourceSpill866_10 = this;
    net.minecraft.tileentity.TileEntityPiston __stackOp866_11_0 = this;
    float __stackOp866_11_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Float(((java.lang.String)("progress")));
    float __sourceSpill866_13 = __stackOp866_11_1;
    ((net.minecraft.tileentity.TileEntityPiston)(__stackOp866_11_0)).p = ((float)(__stackOp866_11_1));
    ((net.minecraft.tileentity.TileEntityPiston)(__sourceSpill866_10)).q = ((float)(__sourceSpill866_13));
    this.n = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("extending")))));
    return;
}


public float a(float p0) {
float forwardValue5706_23_0;
    float forwardValue5706_23_1;
    float spill5706_0;
    float spill5706_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_23: {
    forward_join_14: {
    life2_3 = (net.minecraft.tileentity.TileEntityPiston.s ^ 110623060169125L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5706_0 = p0;
    spill5706_1 = 0x1.0p0f;
    if (!((life4_5 != null))) {
        forwardValue5706_23_0 = spill5706_0;
        forwardValue5706_23_1 = spill5706_1;
        break forward_join_23;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill5706_0)), ((float)(spill5706_1))) > 0))) {
        break forward_join_14;
    }
    p0 = 0x1.0p0f;
    }
    forwardValue5706_23_0 = this.q;
    forwardValue5706_23_1 = ((this.p - this.q) * p0);
    }
    return (forwardValue5706_23_0 + forwardValue5706_23_1);
}


private void a(float p0, float p1) {
int forestValue710_50_0;
    net.minecraft.tileentity.TileEntityPiston forestValue710_72_0;
    int forestValue710_82_0;
    net.minecraft.tileentity.TileEntityPiston forestValue710_133_0;
    boolean spill710_0;
    net.minecraft.tileentity.TileEntityPiston spill710_1;
    boolean spill710_2;
    long life3_3;
    java.lang.String[] life5_5;
    moom.CA life6_33;
    java.util.List life7_41;
    java.util.Iterator life8_57;
    net.minecraft.entity.Entity life9_64;
    forest_join_135: {
    forest_join_133: {
    forest_join_132: {
    forest_join_50: {
    forest_join_21: {
    forest_join_17: {
    forest_join_15: {
    life3_3 = (net.minecraft.tileentity.TileEntityPiston.s ^ 130061702267966L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    if (!((life5_5 != null))) {
        break forest_join_15;
    }
    if (!(this.n)) {
        break forest_join_17;
    }
    p0 = (0x1.0p0f - p0);
    }
    if (!((life5_5 == null))) {
        break forest_join_21;
    }
    }
    p0 = (p0 - 0x1.0p0f);
    }
    life6_33 = ((moom.dc)(net.minecraft.init.Blocks.M)).a(((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityPiston)(this)).d)), ((moom.DT)(((net.minecraft.tileentity.TileEntityPiston)(this)).e)), ((net.minecraft.block.state.IBlockState)(this.l)), ((float)(p0)), ((moom.bs)(this.m)));
    if (!((life6_33 != null))) {
        break forest_join_135;
    }
    life7_41 = ((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityPiston)(this)).d)).b(((net.minecraft.entity.Entity)(null)), ((moom.CA)(life6_33)));
    spill710_0 = ((java.util.List)(life7_41)).isEmpty();
    if (!((life5_5 != null))) {
        forestValue710_50_0 = ((spill710_0) ? 1 : 0);
        break forest_join_50;
    }
    if (!((!spill710_0))) {
        break forest_join_135;
    }
    forestValue710_50_0 = ((((java.util.List)(this.r)).addAll(((java.util.Collection)(life7_41)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue710_50_0);
    life8_57 = ((java.util.List)(this.r)).iterator();
    forest_cycle_55: while (true) {
    forest_join_130: {
    forest_join_107: {
    forest_join_105: {
    forest_join_99: {
    forest_join_91: {
    forest_join_83: {
    forest_join_82: {
    forest_join_72: {
    if (!(((java.util.Iterator)(life8_57)).hasNext())) {
        break forest_join_132;
    }
    life9_64 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life8_57)).next()));
    spill710_1 = this;
    if (!((life5_5 != null))) {
        forestValue710_133_0 = spill710_1;
        break forest_join_133;
    }
    if (!((life5_5 != null))) {
        forestValue710_72_0 = spill710_1;
        break forest_join_72;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.tileentity.TileEntityPiston)(spill710_1)).l)).a__ch() == net.minecraft.init.Blocks.ci))) {
        break forest_join_107;
    }
    forestValue710_72_0 = this;
    }
    spill710_2 = ((net.minecraft.tileentity.TileEntityPiston)(forestValue710_72_0)).n;
    if (!((life5_5 != null))) {
        forestValue710_82_0 = ((spill710_2) ? 1 : 0);
        break forest_join_82;
    }
    if (!(spill710_2)) {
        break forest_join_107;
    }
    forestValue710_82_0 = (moom.Cx.a)[((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(this.m)).a__bt())).ordinal()];
    }
    switch (forestValue710_82_0) {
case 1:
{
        break forest_join_83;
    }
case 2:
{
        break forest_join_91;
    }
case 3:
{
        break forest_join_99;
    }
default:
{
        break forest_join_105;
    }
}
    }
    ((net.minecraft.entity.Entity)(life9_64)).t = ((double)(((double) ((moom.bs)(this.m)).c())));
    if (!((life5_5 == null))) {
        break forest_join_105;
    }
    }
    ((net.minecraft.entity.Entity)(life9_64)).u = ((double)(((double) ((moom.bs)(this.m)).d())));
    if (!((life5_5 == null))) {
        break forest_join_105;
    }
    }
    ((net.minecraft.entity.Entity)(life9_64)).v = ((double)(((double) ((moom.bs)(this.m)).e())));
    }
    if (!((life5_5 == null))) {
        break forest_join_130;
    }
    }
    ((net.minecraft.entity.Entity)(life9_64)).b__Void(((double)(((double) (p1 * ((float) ((moom.bs)(this.m)).c()))))), ((double)(((double) (p1 * ((float) ((moom.bs)(this.m)).d()))))), ((double)(((double) (p1 * ((float) ((moom.bs)(this.m)).e()))))));
    }
    if (!((life5_5 == null))) {
        continue forest_cycle_55;
    }
    break forest_cycle_55;
    }
    }
    forestValue710_133_0 = this;
    }
    ((java.util.List)(((net.minecraft.tileentity.TileEntityPiston)(forestValue710_133_0)).r)).clear();
    }
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
