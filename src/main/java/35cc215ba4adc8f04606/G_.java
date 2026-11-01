package moom;


public class G_ extends moom.G4 {

private moom.bs e;

private boolean f;

private static long g;

public G_(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) { super(0); }


private static void __sourceConstructorBody_6a233dc43e58e5f0(moom.G_ receiver, int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) throws Throwable {

moom.G_ __initValue500_23_0;

    int __initValue500_23_1;

    moom.G_ __initValue500_24_0;

    moom.G_ __initValue500_25_0;

    int __initValue500_25_1;

    init_join_25: {

    init_join_24: {

    init_join_23: {

    long local5_life2 = (moom.G_.g ^ 58637614860432L);

    net.minecraft.entity.Entity[] __sourceSpill500_4 = moom.G4.b();

    moom.G_.__sourceConstructorInit_6a233dc43e58e5f0_0(((moom.G_)(receiver)), ((int)(p0)));

    net.minecraft.entity.Entity[] local7_life6 = __sourceSpill500_4;

    ((moom.G_)(receiver)).e = ((moom.bs)(p3));

    ((moom.G_)(receiver)).a = ((moom.G2)(p2));

    moom.G_ __sourceSpill500_10 = receiver;

    int __sourceSpill500_11 = ((moom.G2)(p2)).b();

    if (!((local7_life6 != null))) {

        __initValue500_23_0 = __sourceSpill500_10;

        __initValue500_23_1 = __sourceSpill500_11;

        break init_join_23;

    }

    if (!((__sourceSpill500_11 > 3))) {

        __initValue500_24_0 = __sourceSpill500_10;

        break init_join_24;

    }

    __initValue500_23_0 = __sourceSpill500_10;

    __initValue500_23_1 = 1;

    }

    __initValue500_25_0 = __initValue500_23_0;

    __initValue500_25_1 = __initValue500_23_1;

    break init_join_25;

    }

    __initValue500_25_0 = __initValue500_24_0;

    __initValue500_25_1 = 0;

    }

    ((moom.G_)(__initValue500_25_0)).f = ((boolean)__sourceIntrinsic_integerToBoolean((__initValue500_25_1)));

    return;

}



public G_() {
super();
}


static {
moom.G_.g = (moom._c.a(1783164393323550939L, -6664923452122555811L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(8230199668242L);
}

private static native <E extends Throwable> void __sourceConstructorInit_6a233dc43e58e5f0_0(moom.G_ a0, int a1) throws E;

protected void b(net.minecraft.nbt.NBTTagCompound p0) {
this.f = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("tf")))));
    this.e = ((moom.bs)(moom.bs.b(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("D"))))))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int forestValue267_19_0;
    moom.G_ forestValue267_229_0;
    moom.G_ forestValue267_409_0;
    moom.G_ forestValue267_440_0;
    net.minecraft.world.World forestValue267_440_1;
    int forestValue267_458_0;
    boolean spill267_0;
    moom.G_ spill267_1;
    int spill267_2;
    moom.G_ spill267_3;
    net.minecraft.world.World spill267_4;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_406;
    int life8_417;
    forest_join_458: {
    forest_join_457: {
    forest_join_259: {
    forest_join_229: {
    forest_join_197: {
    forest_join_19: {
    forest_join_15: {
    life4_3 = (moom.G_.g ^ 56232670172315L);
    life6_5 = moom.G4.b();
    spill267_0 = ((moom.G_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        forestValue267_19_0 = ((spill267_0) ? 1 : 0);
        break forest_join_19;
    }
    if (!(spill267_0)) {
        break forest_join_15;
    }
    return ((0) != 0);
    }
    spill267_1 = this;
    if (!((life6_5 != null))) {
        forestValue267_229_0 = spill267_1;
        break forest_join_229;
    }
    forestValue267_19_0 = ((((moom.G_)(spill267_1)).f) ? 1 : 0);
    }
    if (!((forestValue267_19_0 != 0))) {
        break forest_join_197;
    }
    ((moom.G_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)(((moom.G2)(this.a)).b)), ((int)(((moom.G2)(this.a)).c)), ((int)((((moom.G2)(this.a)).d - 1))), ((int)(((((moom.G2)(this.a)).b + 3) - 1))), ((int)(((moom.G2)(this.a)).f)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.G_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(((moom.G2)(this.a)).a)), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).c + 1))), ((int)(((moom.G2)(this.a)).d)), ((int)(((((moom.G2)(this.a)).b + 3) - 1))), ((int)((((moom.G2)(this.a)).f - 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.G_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)((((moom.G2)(this.a)).e - 2))), ((int)(((moom.G2)(this.a)).c)), ((int)((((moom.G2)(this.a)).d - 1))), ((int)(((moom.G2)(this.a)).e)), ((int)(((moom.G2)(this.a)).f)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.G_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(((moom.G2)(this.a)).a)), ((int)((((moom.G2)(this.a)).e - 2))), ((int)((((moom.G2)(this.a)).c + 1))), ((int)(((moom.G2)(this.a)).d)), ((int)(((moom.G2)(this.a)).e)), ((int)((((moom.G2)(this.a)).f - 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.G_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)((((moom.G2)(this.a)).b + 3))), ((int)((((moom.G2)(this.a)).c + 1))), ((int)((((moom.G2)(this.a)).d - 1))), ((int)((((moom.G2)(this.a)).b + 3))), ((int)((((moom.G2)(this.a)).f - 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break forest_join_259;
    }
    }
    ((moom.G_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)(((moom.G2)(this.a)).b)), ((int)(((moom.G2)(this.a)).c)), ((int)((((moom.G2)(this.a)).d - 1))), ((int)(((moom.G2)(this.a)).e)), ((int)(((moom.G2)(this.a)).f)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    forestValue267_229_0 = this;
    }
    ((moom.G_)(forestValue267_229_0)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(((moom.G2)(this.a)).a)), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).c + 1))), ((int)(((moom.G2)(this.a)).d)), ((int)(((moom.G2)(this.a)).e)), ((int)((((moom.G2)(this.a)).f - 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    }
    ((moom.G_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).c + 1))), ((int)((((moom.G2)(this.a)).a + 1))), ((int)(((moom.G2)(this.a)).e)), ((int)((((moom.G2)(this.a)).c + 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.G_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).f - 1))), ((int)((((moom.G2)(this.a)).a + 1))), ((int)(((moom.G2)(this.a)).e)), ((int)((((moom.G2)(this.a)).f - 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.G_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((((moom.G2)(this.a)).d - 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).c + 1))), ((int)((((moom.G2)(this.a)).d - 1))), ((int)(((moom.G2)(this.a)).e)), ((int)((((moom.G2)(this.a)).c + 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.G_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((((moom.G2)(this.a)).d - 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).f - 1))), ((int)((((moom.G2)(this.a)).d - 1))), ((int)(((moom.G2)(this.a)).e)), ((int)((((moom.G2)(this.a)).f - 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    life7_406 = ((moom.G2)(this.a)).a;
    forest_cycle_403: while (true) {
    forest_join_454: {
    if (!((life7_406 <= ((moom.G2)(this.a)).d))) {
        break forest_join_457;
    }
    forestValue267_409_0 = this;
    forest_cycle_409: while (true) {
    spill267_2 = ((moom.G2)(((moom.G_)(forestValue267_409_0)).a)).c;
    if (!((life6_5 != null))) {
        forestValue267_458_0 = spill267_2;
        break forest_join_458;
    }
    life8_417 = spill267_2;
    forest_cycle_414: while (true) {
    forest_join_451: {
    forest_join_440: {
    if (!((life8_417 <= ((moom.G2)(this.a)).f))) {
        break forest_join_454;
    }
    spill267_3 = this;
    if (!((life6_5 != null))) {
        forestValue267_409_0 = spill267_3;
        continue forest_cycle_409;
    }
    spill267_4 = p0;
    if (!((life6_5 != null))) {
        forestValue267_440_0 = spill267_3;
        forestValue267_440_1 = spill267_4;
        break forest_join_440;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.G_)(spill267_3)).a(((net.minecraft.world.World)(spill267_4)), ((int)(life7_406)), ((int)((((moom.G2)(this.a)).b - 1))), ((int)(life8_417)), ((moom.G2)(p2))))).a__ch())).a__fn() == moom.fn.a))) {
        break forest_join_451;
    }
    forestValue267_440_0 = this;
    forestValue267_440_1 = p0;
    }
    ((moom.G_)(forestValue267_440_0)).a(((net.minecraft.world.World)(forestValue267_440_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(life7_406)), ((int)((((moom.G2)(this.a)).b - 1))), ((int)(life8_417)), ((moom.G2)(p2)));
    }
    life8_417 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_414;
    }
    break forest_cycle_414;
    }
    break forest_cycle_409;
    }
    }
    life7_406 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_403;
    }
    break forest_cycle_403;
    }
    }
    forestValue267_458_0 = 1;
    }
    return ((forestValue267_458_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
int forestValue655_265_0;
    int forestValue655_270_0;
    int forestValue655_299_0;
    int forestValue655_328_0;
    int forestValue655_357_0;
    net.minecraft.entity.Entity[] spill655_0;
    int spill655_1;
    long life4_3;
    int life7_7;
    net.minecraft.entity.Entity[] life6_8;
    forest_join_382: {
    forest_join_357: {
    forest_join_355: {
    forest_join_328: {
    forest_join_326: {
    forest_join_299: {
    forest_join_297: {
    forest_join_270: {
    forest_join_265: {
    forest_join_263: {
    forest_join_203: {
    forest_join_141: {
    forest_join_79: {
    forest_join_17: {
    life4_3 = (moom.G_.g ^ 73307530616413L);
    spill655_0 = moom.G4.b();
    life7_7 = ((moom.G_)(this)).a();
    life6_8 = spill655_0;
    spill655_1 = (moom.Ic.a)[((moom.bs)(this.e)).ordinal()];
    if (!((life6_8 != null))) {
        forestValue655_265_0 = spill655_1;
        break forest_join_265;
    }
    switch (spill655_1) {
case 1:
{
        break forest_join_17;
    }
case 2:
{
        break forest_join_79;
    }
case 3:
{
        break forest_join_141;
    }
case 4:
{
        break forest_join_203;
    }
default:
{
        break forest_join_263;
    }
}
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)(life7_7)));
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a - 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).c + 1))), ((moom.bs)(moom.bs.WEST)), ((int)(life7_7)));
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).d + 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).c + 1))), ((moom.bs)(moom.bs.EAST)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forest_join_263;
    }
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(life7_7)));
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a - 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).c + 1))), ((moom.bs)(moom.bs.WEST)), ((int)(life7_7)));
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).d + 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).c + 1))), ((moom.bs)(moom.bs.EAST)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forest_join_263;
    }
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)(life7_7)));
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(life7_7)));
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a - 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).c + 1))), ((moom.bs)(moom.bs.WEST)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forest_join_263;
    }
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)(life7_7)));
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(life7_7)));
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).d + 1))), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).c + 1))), ((moom.bs)(moom.bs.EAST)), ((int)(life7_7)));
    }
    forestValue655_265_0 = ((this.f) ? 1 : 0);
    }
    if (!((life6_8 != null))) {
        forestValue655_270_0 = forestValue655_265_0;
        break forest_join_270;
    }
    if (!((forestValue655_265_0 != 0))) {
        break forest_join_382;
    }
    forestValue655_270_0 = ((((java.util.Random)(p2)).nextBoolean()) ? 1 : 0);
    }
    if (!((life6_8 != null))) {
        forestValue655_299_0 = forestValue655_270_0;
        break forest_join_299;
    }
    if (!((forestValue655_270_0 != 0))) {
        break forest_join_297;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)(((((moom.G2)(this.a)).b + 3) + 1))), ((int)((((moom.G2)(this.a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)(life7_7)));
    }
    forestValue655_299_0 = ((((java.util.Random)(p2)).nextBoolean()) ? 1 : 0);
    }
    if (!((life6_8 != null))) {
        forestValue655_328_0 = forestValue655_299_0;
        break forest_join_328;
    }
    if (!((forestValue655_299_0 != 0))) {
        break forest_join_326;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a - 1))), ((int)(((((moom.G2)(this.a)).b + 3) + 1))), ((int)((((moom.G2)(this.a)).c + 1))), ((moom.bs)(moom.bs.WEST)), ((int)(life7_7)));
    }
    forestValue655_328_0 = ((((java.util.Random)(p2)).nextBoolean()) ? 1 : 0);
    }
    if (!((life6_8 != null))) {
        forestValue655_357_0 = forestValue655_328_0;
        break forest_join_357;
    }
    if (!((forestValue655_328_0 != 0))) {
        break forest_join_355;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).d + 1))), ((int)(((((moom.G2)(this.a)).b + 3) + 1))), ((int)((((moom.G2)(this.a)).c + 1))), ((moom.bs)(moom.bs.EAST)), ((int)(life7_7)));
    }
    forestValue655_357_0 = ((((java.util.Random)(p2)).nextBoolean()) ? 1 : 0);
    }
    if (!((forestValue655_357_0 != 0))) {
        break forest_join_382;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + 1))), ((int)(((((moom.G2)(this.a)).b + 3) + 1))), ((int)((((moom.G2)(this.a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(life7_7)));
    }
    return;
}


public static moom.G2 a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5) {
int forestValue656_34_0;
    moom.G2 forestValue656_108_0;
    net.minecraft.entity.Entity[] spill656_0;
    int spill656_1;
    long life6_3;
    moom.G2 life9_16;
    net.minecraft.entity.Entity[] life8_17;
    forest_join_108: {
    forest_join_107: {
    forest_join_101: {
    forest_join_86: {
    forest_join_69: {
    forest_join_52: {
    forest_join_35: {
    forest_join_34: {
    forest_join_30: {
    life6_3 = (moom.G_.g ^ 74507012818238L);
    spill656_0 = moom.G4.b();
    life9_16 = new moom.G2(p2, p3, p4, p2, (p3 + 2), p4);
    life8_17 = spill656_0;
    spill656_1 = ((java.util.Random)(p1)).nextInt(((int)(4)));
    if (!((life8_17 != null))) {
        forestValue656_34_0 = spill656_1;
        break forest_join_34;
    }
    if (!((spill656_1 == 0))) {
        break forest_join_30;
    }
    moom.G2 __stackOp656_3_0 = life9_16;
    ((moom.G2)(__stackOp656_3_0)).e = ((int)((((moom.G2)(__stackOp656_3_0)).e + 4)));
    }
    forestValue656_34_0 = (moom.Ic.a)[((moom.bs)(p5)).ordinal()];
    }
    switch (forestValue656_34_0) {
case 1:
{
        break forest_join_35;
    }
case 2:
{
        break forest_join_52;
    }
case 3:
{
        break forest_join_69;
    }
case 4:
{
        break forest_join_86;
    }
default:
{
        break forest_join_101;
    }
}
    }
    ((moom.G2)(life9_16)).a = ((int)((p2 - 1)));
    ((moom.G2)(life9_16)).d = ((int)((p2 + 3)));
    ((moom.G2)(life9_16)).c = ((int)((p4 - 4)));
    if (!((life8_17 == null))) {
        break forest_join_101;
    }
    }
    ((moom.G2)(life9_16)).a = ((int)((p2 - 1)));
    ((moom.G2)(life9_16)).d = ((int)((p2 + 3)));
    ((moom.G2)(life9_16)).f = ((int)((p4 + 4)));
    if (!((life8_17 == null))) {
        break forest_join_101;
    }
    }
    ((moom.G2)(life9_16)).a = ((int)((p2 - 4)));
    ((moom.G2)(life9_16)).c = ((int)((p4 - 1)));
    ((moom.G2)(life9_16)).f = ((int)((p4 + 3)));
    if (!((life8_17 == null))) {
        break forest_join_101;
    }
    }
    ((moom.G2)(life9_16)).d = ((int)((p2 + 4)));
    ((moom.G2)(life9_16)).c = ((int)((p4 - 1)));
    ((moom.G2)(life9_16)).f = ((int)((p4 + 3)));
    }
    if (!((__sourceExactCall_21e7c855759262(((java.util.List)(p0)), ((moom.G2)(life9_16))) != null))) {
        break forest_join_107;
    }
    forestValue656_108_0 = null;
    break forest_join_108;
    }
    forestValue656_108_0 = life9_16;
    }
    return forestValue656_108_0;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("tf")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.f) ? 1 : 0)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("D")), ((int)(((moom.bs)(this.e)).b())));
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native moom.G4 __sourceExactCall_21e7c855759262(java.util.List p0, moom.G2 p1);

private static native moom.G4 __sourceExactCall_a0a0ca1b2b95c9(moom.G4 p0, java.util.List p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7);
}
