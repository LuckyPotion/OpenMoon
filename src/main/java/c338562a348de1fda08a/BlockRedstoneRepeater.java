package net.minecraft.block;


public class BlockRedstoneRepeater extends moom.dm {

public static final moom.fv S;

public static final moom.fy T;

private static final long U;

protected BlockRedstoneRepeater(boolean p0) {
super(p0);
    (this).a__Void(((((this.M).a__fE()).a__fE(net.minecraft.block.BlockRedstoneRepeater.Q, moom.bs.NORTH)).a__fE(net.minecraft.block.BlockRedstoneRepeater.T, java.lang.Integer.valueOf(1))).a__fE(net.minecraft.block.BlockRedstoneRepeater.S, java.lang.Boolean.FALSE));
}


static {
U = (moom._c.a(5189104901483560029L, 8935509165865519520L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(251641461214842L);
    S = moom.fv.a("locked");
    T = moom.fy.a("delay", 1, 4);
}


protected boolean b(net.minecraft.block.Block p0) {
return (__sourceIntrinsic_booleanComparison((net.minecraft.block.BlockRedstoneRepeater.c(((net.minecraft.block.Block)(p0))))) != 0);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockRedstoneRepeater)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.Q)), ((java.lang.Comparable)(moom.bs.b(((int)(p0)))))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.T)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)((1 + (p0 >> 2))))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
int local2 = 0;
    local2 = (local2 | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.Q))))))).b());
    local2 = (local2 | ((((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.T))))))).intValue() - 1) << 2));
    return local2;
}


protected net.minecraft.block.state.IBlockState b__fE(net.minecraft.block.state.IBlockState p0) {
java.lang.Object local2 = ((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.T)))));
    java.lang.Object local3 = ((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.S)))));
    java.lang.Object local4 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.Q)))));
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockRedstoneRepeater)(net.minecraft.init.Blocks.a2)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.Q)), ((java.lang.Comparable)(local4))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.T)), ((java.lang.Comparable)(local2))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.S)), ((java.lang.Comparable)(local3)));
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
long life5_3;
    int[] life7_5;
    moom.bs life8_13;
    double life9_28;
    double life11_43;
    double life13_58;
    float life15_60;
    double life16_90;
    double life18_97;
    life5_3 = (net.minecraft.block.BlockRedstoneRepeater.U ^ 76081662162068L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (((net.minecraft.block.BlockRedstoneRepeater)(this)).R) {
        life8_13 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.Q)))));
        life9_28 = (((double) (((float) ((moom.DT)(p1)).a()) + 0x1.0p-1f)) + (((double) (((java.util.Random)(p3)).nextFloat() - 0x1.0p-1f)) * 0x1.999999999999ap-3d));
        life11_43 = (((double) (((float) ((moom.DT)(p1)).b()) + 0x1.99999ap-2f)) + (((double) (((java.util.Random)(p3)).nextFloat() - 0x1.0p-1f)) * 0x1.999999999999ap-3d));
        life13_58 = (((double) (((float) ((moom.DT)(p1)).c()) + 0x1.0p-1f)) + (((double) (((java.util.Random)(p3)).nextFloat() - 0x1.0p-1f)) * 0x1.999999999999ap-3d));
        life15_60 = -0x1.4p2f;
        if ((life7_5 != null)) {
        if (((java.util.Random)(p3)).nextBoolean()) {
        life15_60 = ((float) ((((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.T))))))).intValue() * 2) - 1));
    }
        life15_60 = (life15_60 / 0x1.0p4f);
    }
        life16_90 = ((double) (life15_60 * ((float) ((moom.bs)(life8_13)).c())));
        life18_97 = ((double) (life15_60 * ((float) ((moom.bs)(life8_13)).e())));
        ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.REDSTONE)), ((double)((life9_28 + life16_90))), ((double)(life11_43)), ((double)((life13_58 + life18_97))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    return;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    ((net.minecraft.block.BlockRedstoneRepeater)(this)).e(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


protected net.minecraft.block.state.IBlockState c__sourceReturn_22c3f88038(net.minecraft.block.state.IBlockState p0) {
java.lang.Object local2 = ((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.T)))));
    java.lang.Object local3 = ((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.S)))));
    java.lang.Object local4 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.Q)))));
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockRedstoneRepeater)(net.minecraft.init.Blocks.a1)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.Q)), ((java.lang.Comparable)(local4))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.T)), ((java.lang.Comparable)(local2))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.S)), ((java.lang.Comparable)(local3)));
}


protected int f(net.minecraft.block.state.IBlockState p0) {
return (((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.T))))))).intValue() * 2);
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {net.minecraft.block.BlockRedstoneRepeater.Q, net.minecraft.block.BlockRedstoneRepeater.T, net.minecraft.block.BlockRedstoneRepeater.S});
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
return ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.S)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((net.minecraft.block.BlockRedstoneRepeater)(this)).a__Boolean(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p0)))))))));
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue4737_15_0;
    int forwardValue4737_17_0;
    int spill4737_0;
    long life4_3;
    int[] life6_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life4_3 = (net.minecraft.block.BlockRedstoneRepeater.U ^ 61035089322441L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4737_0 = ((net.minecraft.block.BlockRedstoneRepeater)(this)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life6_5 != null))) {
        forwardValue4737_15_0 = spill4737_0;
        break forward_join_15;
    }
    if (!((spill4737_0 > 0))) {
        break forward_join_16;
    }
    forwardValue4737_15_0 = 1;
    }
    forwardValue4737_17_0 = forwardValue4737_15_0;
    break forward_join_17;
    }
    forwardValue4737_17_0 = 0;
    }
    return ((forwardValue4737_17_0) != 0);
}


public java.lang.String a__String() {
return net.minecraft.util.StatCollector.a(((java.lang.String)("item.diode.name")));
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4736_23_0;
    boolean spill4736_0;
    long life9_3;
    int[] life11_5;
    forward_join_23: {
    forward_join_14: {
    life9_3 = (net.minecraft.block.BlockRedstoneRepeater.U ^ 119427614653283L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4736_0 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).e;
    if (!((life11_5 != null))) {
        forwardValue4736_23_0 = ((spill4736_0) ? 1 : 0);
        break forward_join_23;
    }
    if (!((!spill4736_0))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.T))))), ((int)(3)));
    forwardValue4736_23_0 = 1;
    }
    return ((forwardValue4736_23_0) != 0);
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.a1;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.init.Items.a1;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
