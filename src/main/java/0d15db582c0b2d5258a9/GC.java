package moom;


public class GC extends moom.FY {

private final java.util.List<moom.D5> c;

private final int d;

private static final long e;

public GC(java.util.List<moom.D5> p0, int p1) {
super();
    this.c = p0;
    this.d = p1;
}


static {
e = (moom._c.a(2657886297442046573L, -6196439348959885140L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(157561205674359L);
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int lexicalValue677_35_0;
    int lexicalValue677_35_1;
    int lexicalValue677_89_0;
    int lexicalValue677_140_0;
    int lexicalValue677_160_0;
    int lexicalValue677_180_0;
    int lexicalValue677_198_0;
    int lexicalValue677_203_0;
    int spill677_0;
    int spill677_1;
    int spill677_2;
    boolean spill677_3;
    boolean spill677_4;
    boolean spill677_5;
    boolean spill677_6;
    boolean spill677_7;
    boolean spill677_8;
    boolean spill677_9;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.Block life7_11;
    moom.DT life3_47;
    int life8_49;
    moom.DT life9_76;
    net.minecraft.tileentity.TileEntity life10_117;
    moom.DT life11_134;
    moom.DT life12_137;
    moom.DT life13_140;
    moom.DT life14_143;
    lexical_join_203: {
    lexical_join_202: {
    lexical_join_35: {
    lexical_join_30: {
    life4_3 = (moom.GC.e ^ 63373817924424L);
    life6_5 = moom.FY.b();
    lexical_cycle_6: while (true) {
    lexical_join_19: {
    if (!((((net.minecraft.block.Block)((life7_11 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p2))))).a__ch()))).a__fn() != moom.fn.a))) {
        break lexical_join_19;
    }
    if (!((((net.minecraft.block.Block)(life7_11)).a__fn() == moom.fn.j))) {
        break lexical_join_30;
    }
    }
    spill677_0 = ((moom.DT)(p2)).b();
    spill677_1 = 1;
    if (!((life6_5 != null))) {
        lexicalValue677_35_0 = spill677_0;
        lexicalValue677_35_1 = spill677_1;
        break lexical_join_35;
    }
    if (!((spill677_0 > spill677_1))) {
        break lexical_join_30;
    }
    p2 = ((moom.DT)(p2)).b__DT();
    if (!((life6_5 == null))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    spill677_2 = ((moom.DT)(p2)).b();
    if (!((life6_5 != null))) {
        lexicalValue677_203_0 = spill677_2;
        break lexical_join_203;
    }
    lexicalValue677_35_0 = spill677_2;
    lexicalValue677_35_1 = 1;
    }
    if (!((lexicalValue677_35_0 >= lexicalValue677_35_1))) {
        break lexical_join_202;
    }
    life3_47 = ((moom.DT)(p2)).a__DT();
    life8_49 = 0;
    lexical_cycle_41: while (true) {
    lexical_join_200: {
    lexical_join_199: {
    lexical_join_198: {
    lexical_join_197: {
    lexical_join_180: {
    lexical_join_177: {
    lexical_join_160: {
    lexical_join_157: {
    lexical_join_140: {
    lexical_join_137: {
    lexical_join_105: {
    lexical_join_89: {
    if (!((life8_49 < 4))) {
        break lexical_join_202;
    }
    life9_76 = ((moom.DT)(life3_47)).a(((int)((((java.util.Random)(p1)).nextInt(((int)(4))) - ((java.util.Random)(p1)).nextInt(((int)(4)))))), ((int)((((java.util.Random)(p1)).nextInt(((int)(3))) - ((java.util.Random)(p1)).nextInt(((int)(3)))))), ((int)((((java.util.Random)(p1)).nextInt(((int)(4))) - ((java.util.Random)(p1)).nextInt(((int)(4)))))));
    if (!((life6_5 != null))) {
        break lexical_join_200;
    }
    spill677_3 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life9_76)));
    if (!((life6_5 != null))) {
        lexicalValue677_203_0 = ((spill677_3) ? 1 : 0);
        break lexical_join_203;
    }
    if (!(spill677_3)) {
        break lexical_join_199;
    }
    spill677_4 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(life9_76)).b__DT())));
    if (!((life6_5 != null))) {
        lexicalValue677_89_0 = ((spill677_4) ? 1 : 0);
        break lexical_join_89;
    }
    if (!(spill677_4)) {
        break lexical_join_199;
    }
    lexicalValue677_89_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life9_76)), ((net.minecraft.block.state.IBlockState)(((moom.cZ)(net.minecraft.init.Blocks.ae)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue677_89_0);
    life10_117 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(life9_76)));
    if (!((((life10_117 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0) != 0))) {
        break lexical_join_105;
    }
    moom.D5.a(((java.util.Random)(p1)), ((java.util.List)(this.c)), ((net.minecraft.inventory.IInventory)(((net.minecraft.tileentity.TileEntityChest)(life10_117)))), ((int)(this.d)));
    }
    life11_134 = ((moom.DT)(life9_76)).f();
    life12_137 = ((moom.DT)(life9_76)).e();
    life13_140 = ((moom.DT)(life9_76)).c__DT();
    life14_143 = ((moom.DT)(life9_76)).d__DT();
    spill677_5 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life12_137)));
    if (!((life6_5 != null))) {
        lexicalValue677_140_0 = ((spill677_5) ? 1 : 0);
        break lexical_join_140;
    }
    if (!(spill677_5)) {
        break lexical_join_137;
    }
    spill677_6 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(life12_137)).b__DT())));
    if (!((life6_5 != null))) {
        lexicalValue677_140_0 = ((spill677_6) ? 1 : 0);
        break lexical_join_140;
    }
    if (!(spill677_6)) {
        break lexical_join_137;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life12_137)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)(2)));
    }
    lexicalValue677_140_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life11_134)))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue677_160_0 = lexicalValue677_140_0;
        break lexical_join_160;
    }
    if (!((lexicalValue677_140_0 != 0))) {
        break lexical_join_157;
    }
    spill677_7 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(life11_134)).b__DT())));
    if (!((life6_5 != null))) {
        lexicalValue677_160_0 = ((spill677_7) ? 1 : 0);
        break lexical_join_160;
    }
    if (!(spill677_7)) {
        break lexical_join_157;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life11_134)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)(2)));
    }
    lexicalValue677_160_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life13_140)))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue677_180_0 = lexicalValue677_160_0;
        break lexical_join_180;
    }
    if (!((lexicalValue677_160_0 != 0))) {
        break lexical_join_177;
    }
    spill677_8 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(life13_140)).b__DT())));
    if (!((life6_5 != null))) {
        lexicalValue677_180_0 = ((spill677_8) ? 1 : 0);
        break lexical_join_180;
    }
    if (!(spill677_8)) {
        break lexical_join_177;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life13_140)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)(2)));
    }
    lexicalValue677_180_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life14_143)))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue677_198_0 = lexicalValue677_180_0;
        break lexical_join_198;
    }
    if (!((lexicalValue677_180_0 != 0))) {
        break lexical_join_197;
    }
    spill677_9 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(life14_143)).b__DT())));
    if (!((life6_5 != null))) {
        lexicalValue677_198_0 = ((spill677_9) ? 1 : 0);
        break lexical_join_198;
    }
    if (!(spill677_9)) {
        break lexical_join_197;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life14_143)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)(2)));
    }
    lexicalValue677_198_0 = 1;
    }
    return ((lexicalValue677_198_0) != 0);
    }
    life8_49 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_41; }
    break lexical_cycle_41;
    }
    }
    lexicalValue677_203_0 = 0;
    }
    return ((lexicalValue677_203_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
