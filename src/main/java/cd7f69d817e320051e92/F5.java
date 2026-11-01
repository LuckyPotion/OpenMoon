package moom;


public class F5 extends moom.F4 {

private static final long g;

public F5(boolean p0, int p1, int p2, net.minecraft.block.state.IBlockState p3, net.minecraft.block.state.IBlockState p4) {
super(p0, p1, p2, p3, p4);
}


static {
g = (moom._c.a(629225816513038645L, -8831003152732218640L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(187191243632930L);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


private void c(net.minecraft.world.World p0, moom.DT p1, int p2) {
int[] spill618_0;
    long life4_3;
    int life7_5;
    int life8_9;
    int[] life6_10;
    lexical_join_27: {
    life4_3 = (moom.F5.g ^ 35601032895902L);
    life7_5 = 2;
    spill618_0 = moom.FY.b();
    life8_9 = (-life7_5);
    life6_10 = spill618_0;
    lexical_cycle_11: while (true) {
    if (!((life8_9 <= 0))) {
        break lexical_join_27;
    }
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((int)(life8_9))))), ((int)(((p2 + 1) - life8_9))));
    life8_9 += 1;
    if (!((life6_10 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


private void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, moom.fv p3) {
int forwardValue1878_15_0;
    int spill1878_0;
    long life5_3;
    int[] life7_5;
    forward_join_25: {
    forward_join_15: {
    life5_3 = (moom.F5.g ^ 90884875244268L);
    life7_5 = moom.FY.b();
    spill1878_0 = ((java.util.Random)(p1)).nextInt(((int)(3)));
    if (!((life7_5 != null))) {
        forwardValue1878_15_0 = spill1878_0;
        break forward_join_15;
    }
    if (!((spill1878_0 > 0))) {
        break forward_join_25;
    }
    forwardValue1878_15_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(p2)))) ? 1 : 0);
    }
    if (!((forwardValue1878_15_0 != 0))) {
        break forward_join_25;
    }
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bc)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(p3)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))));
    }
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int lexicalValue617_38_0;
    int lexicalValue617_174_0;
    int lexicalValue617_218_0;
    int lexicalValue617_243_0;
    int lexicalValue617_280_0;
    int lexicalValue617_335_0;
    int[] spill617_0;
    boolean spill617_1;
    int spill617_2;
    boolean spill617_3;
    int spill617_4;
    boolean spill617_5;
    boolean spill617_6;
    long life4_3;
    int life7_8;
    int[] life6_9;
    int life8_43;
    float life9_58;
    int life10_69;
    int life11_80;
    int life12_84;
    int life13_146;
    int life14_153;
    int life8_185;
    moom.DT life9_192;
    moom.DT life10_250;
    moom.DT life11_299;
    moom.DT life12_347;
    lexical_join_335: {
    lexical_join_334: {
    lexical_join_174: {
    lexical_join_173: {
    lexical_join_38: {
    lexical_join_21: {
    life4_3 = (moom.F5.g ^ 76317677838353L);
    spill617_0 = moom.FY.b();
    life7_8 = ((moom.F5)(this)).a(((java.util.Random)(p1)));
    life6_9 = spill617_0;
    spill617_1 = ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(p2)), ((int)(life7_8)));
    if (!((life6_9 != null))) {
        lexicalValue617_38_0 = ((spill617_1) ? 1 : 0);
        break lexical_join_38;
    }
    if (!((!spill617_1))) {
        break lexical_join_21;
    }
    return ((0) != 0);
    }
    ((moom.F5)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life7_8))))), ((int)(2)));
    lexicalValue617_38_0 = (((((moom.DT)(p2)).b() + life7_8) - 2) - ((java.util.Random)(p1)).nextInt(((int)(4))));
    }
    life8_43 = lexicalValue617_38_0;
    lexical_cycle_39: while (true) {
    lexical_join_171: {
    lexical_join_163: {
    lexical_join_135: {
    lexical_join_129: {
    if (!((life8_43 > (((moom.DT)(p2)).b() + (life7_8 / 2))))) {
        break lexical_join_173;
    }
    life9_58 = ((((java.util.Random)(p1)).nextFloat() * 0x1.921fb6p1f) * 0x1.0p1f);
    life10_69 = (((moom.DT)(p2)).a() + ((int) (0x1.0p-1f + (moom.Dr.b(((float)(life9_58))) * 0x1.0p2f))));
    life11_80 = (((moom.DT)(p2)).c() + ((int) (0x1.0p-1f + (moom.Dr.a(((float)(life9_58))) * 0x1.0p2f))));
    spill617_2 = 0;
    if (!((life6_9 != null))) {
        lexicalValue617_174_0 = spill617_2;
        break lexical_join_174;
    }
    life12_84 = spill617_2;
    lexical_cycle_80: while (true) {
    if (!((life12_84 < 5))) {
        break lexical_join_129;
    }
    life10_69 = (((moom.DT)(p2)).a() + ((int) (0x1.8p0f + (moom.Dr.b(((float)(life9_58))) * ((float) life12_84)))));
    life11_80 = (((moom.DT)(p2)).c() + ((int) (0x1.8p0f + (moom.Dr.a(((float)(life9_58))) * ((float) life12_84)))));
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(new moom.DT(life10_69, ((life8_43 - 3) + (life12_84 / 2)), life11_80))), ((net.minecraft.block.state.IBlockState)(((moom.F5)(this)).d)));
    life12_84 += 1;
    if (!((life6_9 != null))) {
        break lexical_join_135;
    }
    if (!((life6_9 == null))) { continue lexical_cycle_80; }
    break lexical_cycle_80;
    }
    }
    life12_84 = (1 + ((java.util.Random)(p1)).nextInt(((int)(2))));
    }
    life13_146 = (life8_43 - life12_84);
    lexical_cycle_139: while (true) {
    if (!((life13_146 <= life8_43))) {
        break lexical_join_163;
    }
    life14_153 = (life13_146 - life8_43);
    ((moom.F5)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(new moom.DT(life10_69, life13_146, life11_80))), ((int)((1 - life14_153))));
    life13_146 += 1;
    if (!((life6_9 != null))) {
        break lexical_join_171;
    }
    if (!((life6_9 == null))) { continue lexical_cycle_139; }
    break lexical_cycle_139;
    }
    }
    life8_43 = (life8_43 - (2 + ((java.util.Random)(p1)).nextInt(((int)(4)))));
    }
    if (!((life6_9 == null))) { continue lexical_cycle_39; }
    break lexical_cycle_39;
    }
    }
    lexicalValue617_174_0 = 0;
    }
    life8_185 = lexicalValue617_174_0;
    lexical_cycle_175: while (true) {
    lexical_join_332: {
    lexical_join_331: {
    lexical_join_295: {
    lexical_join_288: {
    lexical_join_280: {
    lexical_join_258: {
    lexical_join_251: {
    lexical_join_243: {
    lexical_join_218: {
    lexical_join_217: {
    if (!((life8_185 < life7_8))) {
        break lexical_join_334;
    }
    life9_192 = ((moom.DT)(p2)).a(((int)(life8_185)));
    spill617_3 = ((moom.F5)(this)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life9_192))))).a__ch())));
    if (!((life6_9 != null))) {
        lexicalValue617_335_0 = ((spill617_3) ? 1 : 0);
        break lexical_join_335;
    }
    if (!((life6_9 != null))) {
        lexicalValue617_218_0 = ((spill617_3) ? 1 : 0);
        break lexical_join_218;
    }
    if (!(spill617_3)) {
        break lexical_join_217;
    }
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life9_192)), ((net.minecraft.block.state.IBlockState)(((moom.F5)(this)).d)));
    spill617_4 = life8_185;
    if (!((life6_9 != null))) {
        lexicalValue617_218_0 = spill617_4;
        break lexical_join_218;
    }
    if (!((spill617_4 > 0))) {
        break lexical_join_217;
    }
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(life9_192)).e())), ((moom.fv)(moom.eF.S)));
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(life9_192)).c__DT())), ((moom.fv)(moom.eF.T)));
    }
    lexicalValue617_218_0 = life8_185;
    }
    if (!((lexicalValue617_218_0 < (life7_8 - 1)))) {
        break lexical_join_331;
    }
    life10_250 = ((moom.DT)(life9_192)).f();
    spill617_5 = ((moom.F5)(this)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life10_250))))).a__ch())));
    if (!((life6_9 != null))) {
        lexicalValue617_243_0 = ((spill617_5) ? 1 : 0);
        break lexical_join_243;
    }
    if (!(spill617_5)) {
        break lexical_join_258;
    }
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life10_250)), ((net.minecraft.block.state.IBlockState)(((moom.F5)(this)).d)));
    if (!((life6_9 != null))) {
        break lexical_join_251;
    }
    lexicalValue617_243_0 = life8_185;
    }
    if (!((lexicalValue617_243_0 > 0))) {
        break lexical_join_258;
    }
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(life10_250)).f())), ((moom.fv)(moom.eF.U)));
    }
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(life10_250)).c__DT())), ((moom.fv)(moom.eF.T)));
    }
    life11_299 = ((moom.DT)(((moom.DT)(life9_192)).d__DT())).f();
    spill617_6 = ((moom.F5)(this)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life11_299))))).a__ch())));
    if (!((life6_9 != null))) {
        lexicalValue617_280_0 = ((spill617_6) ? 1 : 0);
        break lexical_join_280;
    }
    if (!(spill617_6)) {
        break lexical_join_295;
    }
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life11_299)), ((net.minecraft.block.state.IBlockState)(((moom.F5)(this)).d)));
    if (!((life6_9 != null))) {
        break lexical_join_288;
    }
    lexicalValue617_280_0 = life8_185;
    }
    if (!((lexicalValue617_280_0 > 0))) {
        break lexical_join_295;
    }
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(life11_299)).f())), ((moom.fv)(moom.eF.U)));
    }
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(life11_299)).d__DT())), ((moom.fv)(moom.eF.R)));
    }
    life12_347 = ((moom.DT)(life9_192)).d__DT();
    if (!((life6_9 != null))) {
        break lexical_join_332;
    }
    if (!(((moom.F5)(this)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life12_347))))).a__ch()))))) {
        break lexical_join_331;
    }
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life12_347)), ((net.minecraft.block.state.IBlockState)(((moom.F5)(this)).d)));
    if (!((life6_9 != null))) {
        break lexical_join_332;
    }
    if (!((life8_185 > 0))) {
        break lexical_join_331;
    }
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(life12_347)).e())), ((moom.fv)(moom.eF.S)));
    ((moom.F5)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(((moom.DT)(life12_347)).d__DT())), ((moom.fv)(moom.eF.R)));
    }
    life8_185 += 1;
    }
    if (!((life6_9 == null))) { continue lexical_cycle_175; }
    break lexical_cycle_175;
    }
    }
    lexicalValue617_335_0 = 1;
    }
    return ((lexicalValue617_335_0) != 0);
}

}
