package moom;


public class dN extends net.minecraft.block.BlockLiquid {

private static long R;

protected dN(moom.fn p0) { super((moom.fn)null); }


private static void __sourceConstructorBody_8abbd86eda79d98f(moom.dN receiver, moom.fn p0) throws Throwable {

net.minecraft.block.Block forwardValue440_21_0;

    int[] spill440_0;

    net.minecraft.block.Block spill440_1;

    long life2_3;

    int[] life4_8;

    forward_join_22: {

    forward_join_21: {

    life2_3 = (moom.dN.R ^ 1749881716347L);

    spill440_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();

    moom.dN.__sourceConstructorInit_8abbd86eda79d98f_0(((moom.dN)(receiver)), ((moom.fn)(p0)));

    life4_8 = spill440_0;

    spill440_1 = ((moom.dN)(receiver)).a(((boolean)(false)));

    if (!((life4_8 != null))) {

        forwardValue440_21_0 = spill440_1;

        break forward_join_21;

    }

    recovery.source.CarrierOps.discard(spill440_1);

    if (!((p0 == moom.fn.i))) {

        break forward_join_22;

    }

    forwardValue440_21_0 = ((moom.dN)(receiver)).a(((boolean)(true)));

    }

    recovery.source.CarrierOps.discard(forwardValue440_21_0);

    }

    return;

}



static {
moom.dN.R = (moom._c.a(-9003317024887281167L, -3748363879880132951L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(44904607587230L);
}

private static native <E extends Throwable> void __sourceConstructorInit_8abbd86eda79d98f_0(moom.dN a0, moom.fn a1) throws E;

public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int lexicalValue1111_20_0;
    int lexicalValue1111_71_0;
    moom.fn lexicalValue1111_75_0;
    int lexicalValue1111_84_0;
    int lexicalValue1111_122_0;
    boolean spill1111_0;
    int spill1111_1;
    moom.fn spill1111_2;
    boolean spill1111_3;
    boolean spill1111_4;
    long life5_3;
    int[] life7_5;
    int life8_29;
    moom.DT life9_38;
    int life10_40;
    net.minecraft.block.Block life11_62;
    int life9_116;
    moom.DT life10_133;
    lexical_join_126: {
    lexical_join_84: {
    lexical_join_83: {
    lexical_join_81: {
    lexical_join_20: {
    life5_3 = (moom.dN.R ^ 100931701778944L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((this.J == moom.fn.i))) {
        break lexical_join_126;
    }
    spill1111_0 = ((net.minecraft.world.GameRules)(((net.minecraft.world.World)(p0)).a__Ej())).a__Boolean(((java.lang.String)("doFireTick")));
    if (!((life7_5 != null))) {
        lexicalValue1111_20_0 = ((spill1111_0) ? 1 : 0);
        break lexical_join_20;
    }
    if (!(spill1111_0)) {
        break lexical_join_126;
    }
    lexicalValue1111_20_0 = ((java.util.Random)(p3)).nextInt(((int)(3)));
    }
    life8_29 = lexicalValue1111_20_0;
    spill1111_1 = life8_29;
    if (!((life7_5 != null))) {
        lexicalValue1111_84_0 = spill1111_1;
        break lexical_join_84;
    }
    if (!((spill1111_1 > 0))) {
        break lexical_join_83;
    }
    life9_38 = p1;
    life10_40 = 0;
    lexical_cycle_29: while (true) {
    lexical_join_78: {
    lexical_join_75: {
    lexical_join_73: {
    lexical_join_71: {
    if (!((life10_40 < life8_29))) {
        break lexical_join_81;
    }
    life9_38 = ((moom.DT)(life9_38)).a(((int)((((java.util.Random)(p3)).nextInt(((int)(3))) - 1))), ((int)(1)), ((int)((((java.util.Random)(p3)).nextInt(((int)(3))) - 1))));
    life11_62 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life9_38))))).a__ch();
    if (!((life7_5 != null))) {
        break lexical_join_126;
    }
    spill1111_2 = ((net.minecraft.block.Block)(life11_62)).J;
    if (!((life7_5 != null))) {
        lexicalValue1111_75_0 = spill1111_2;
        break lexical_join_75;
    }
    if (!((spill1111_2 == moom.fn.a))) {
        break lexical_join_73;
    }
    spill1111_3 = ((moom.dN)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(life9_38)));
    if (!((life7_5 != null))) {
        lexicalValue1111_71_0 = ((spill1111_3) ? 1 : 0);
        break lexical_join_71;
    }
    if (!(spill1111_3)) {
        break lexical_join_78;
    }
    lexicalValue1111_71_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life9_38)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1111_71_0);
    return;
    }
    lexicalValue1111_75_0 = ((net.minecraft.block.Block)(life11_62)).J;
    }
    if (!(((moom.fn)(lexicalValue1111_75_0)).d__Boolean())) {
        break lexical_join_78;
    }
    return;
    }
    life10_40 += 1;
    if (!((life7_5 == null))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    if (!((life7_5 == null))) {
        break lexical_join_126;
    }
    }
    lexicalValue1111_84_0 = 0;
    }
    life9_116 = lexicalValue1111_84_0;
    lexical_cycle_85: while (true) {
    lexical_join_124: {
    lexical_join_123: {
    lexical_join_122: {
    if (!((life9_116 < 3))) {
        break lexical_join_126;
    }
    life10_133 = ((moom.DT)(p1)).a(((int)((((java.util.Random)(p3)).nextInt(((int)(3))) - 1))), ((int)(0)), ((int)((((java.util.Random)(p3)).nextInt(((int)(3))) - 1))));
    if (!((life7_5 != null))) {
        break lexical_join_124;
    }
    if (!(((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(life10_133)).a__DT()))))) {
        break lexical_join_123;
    }
    spill1111_4 = ((moom.dN)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(life10_133)));
    if (!((life7_5 != null))) {
        lexicalValue1111_122_0 = ((spill1111_4) ? 1 : 0);
        break lexical_join_122;
    }
    if (!(spill1111_4)) {
        break lexical_join_123;
    }
    lexicalValue1111_122_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(life10_133)).a__DT())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1111_122_0);
    }
    life9_116 += 1;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_85; }
    break lexical_cycle_85;
    }
    }
    return;
}


protected boolean c(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1112_37_0;
    int[] spill1112_0;
    boolean spill1112_1;
    long life3_3;
    moom.bs[] life6_5;
    int life7_9;
    int life8_11;
    int[] life5_12;
    moom.bs life9_19;
    lexical_join_37: {
    lexical_join_36: {
    life3_3 = (moom.dN.R ^ 102980957726122L);
    life6_5 = moom.bs.values();
    spill1112_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_9 = (life6_5).length;
    life8_11 = 0;
    life5_12 = spill1112_0;
    lexical_cycle_13: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    if (!((life8_11 < life7_9))) {
        break lexical_join_36;
    }
    life9_19 = (life6_5)[life8_11];
    if (!((life5_12 != null))) {
        break lexical_join_34;
    }
    spill1112_1 = ((moom.dN)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life9_19))))));
    if (!((life5_12 != null))) {
        lexicalValue1112_37_0 = ((spill1112_1) ? 1 : 0);
        break lexical_join_37;
    }
    if (!(spill1112_1)) {
        break lexical_join_33;
    }
    return ((1) != 0);
    }
    life8_11 += 1;
    }
    if (!((life5_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue1112_37_0 = 0;
    }
    return ((lexicalValue1112_37_0) != 0);
}


private void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
java.lang.Object local4 = moom.dN.a(((moom.fn)(this.J)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dM)(local4)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dN.Q)), ((java.lang.Comparable)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dN.Q)))))))))), ((int)(2)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(local4)), ((int)(((moom.dN)(this)).a(((net.minecraft.world.World)(p0))))));
    return;
}


private boolean d(net.minecraft.world.World p0, moom.DT p1) {
return (__sourceIntrinsic_booleanComparison((((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch())).a__fn())).e__Boolean())) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
moom.dN forwardValue353_18_0;
    net.minecraft.world.World forwardValue353_18_1;
    moom.DT forwardValue353_18_2;
    net.minecraft.block.state.IBlockState forwardValue353_18_3;
    moom.dN spill353_0;
    net.minecraft.world.World spill353_1;
    moom.DT spill353_2;
    net.minecraft.block.state.IBlockState spill353_3;
    long life5_3;
    int[] life7_5;
    forward_join_19: {
    forward_join_18: {
    life5_3 = (moom.dN.R ^ 86585581885057L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill353_0 = this;
    spill353_1 = p0;
    spill353_2 = p1;
    spill353_3 = p2;
    if (!((life7_5 != null))) {
        forwardValue353_18_0 = spill353_0;
        forwardValue353_18_1 = spill353_1;
        forwardValue353_18_2 = spill353_2;
        forwardValue353_18_3 = spill353_3;
        break forward_join_18;
    }
    if (!((!((moom.dN)(spill353_0)).a__Boolean(((net.minecraft.world.World)(spill353_1)), ((moom.DT)(spill353_2)), ((net.minecraft.block.state.IBlockState)(spill353_3)))))) {
        break forward_join_19;
    }
    forwardValue353_18_0 = this;
    forwardValue353_18_1 = p0;
    forwardValue353_18_2 = p1;
    forwardValue353_18_3 = p2;
    }
    ((moom.dN)(forwardValue353_18_0)).d(((net.minecraft.world.World)(forwardValue353_18_1)), ((moom.DT)(forwardValue353_18_2)), ((net.minecraft.block.state.IBlockState)(forwardValue353_18_3)));
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
