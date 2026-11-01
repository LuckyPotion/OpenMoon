package moom;


public class dW extends moom.dV {

public static final moom.fw<net.minecraft.item.EnumDyeColor> V;

private static final long X;

public dW() {
super(moom.fn.s, false);
    (this).a__Void(((((((this.M).a__fE()).a__fE(moom.dW.Q, java.lang.Boolean.FALSE)).a__fE(moom.dW.R, java.lang.Boolean.FALSE)).a__fE(moom.dW.S, java.lang.Boolean.FALSE)).a__fE(moom.dW.T, java.lang.Boolean.FALSE)).a__fE(moom.dW.V, net.minecraft.item.EnumDyeColor.WHITE));
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
X = (moom._c.a(8701024343824115553L, -283269065360101711L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(9584583812953L);
    V = moom.fw.a("color", net.minecraft.item.EnumDyeColor.class);
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.dW)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dW.V)), ((java.lang.Comparable)(net.minecraft.item.EnumDyeColor.b(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.item.EnumDyeColor)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dW.V))))))).a();
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.world.World forwardValue3282_12_0;
    net.minecraft.world.World spill3282_0;
    long life4_3;
    int[] life6_5;
    forward_join_14: {
    forward_join_12: {
    life4_3 = (moom.dW.X ^ 24808192288103L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3282_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue3282_12_0 = spill3282_0;
        break forward_join_12;
    }
    if (!((!((net.minecraft.world.World)(spill3282_0)).G))) {
        break forward_join_14;
    }
    forwardValue3282_12_0 = p0;
    }
    __sourceExactCall_8092b703abccaf(((net.minecraft.world.World)(forwardValue3282_12_0)), ((moom.DT)(p1)));
    }
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.item.EnumDyeColor)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dW.V))))))).a();
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.world.World forwardValue3283_12_0;
    net.minecraft.world.World spill3283_0;
    long life4_3;
    int[] life6_5;
    forward_join_14: {
    forward_join_12: {
    life4_3 = (moom.dW.X ^ 125935665999045L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3283_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue3283_12_0 = spill3283_0;
        break forward_join_12;
    }
    if (!((!((net.minecraft.world.World)(spill3283_0)).G))) {
        break forward_join_14;
    }
    forwardValue3283_12_0 = p0;
    }
    __sourceExactCall_8092b703abccaf(((net.minecraft.world.World)(forwardValue3283_12_0)), ((moom.DT)(p1)));
    }
    return;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1114_0;
    long life4_3;
    int life7_6;
    int[] life6_7;
    lexical_join_24: {
    life4_3 = (moom.dW.X ^ 57467363966508L);
    spill1114_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_6 = 0;
    life6_7 = spill1114_0;
    lexical_cycle_8: while (true) {
    if (!((life7_6 < (net.minecraft.item.EnumDyeColor.values()).length))) {
        break lexical_join_24;
    }
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, life7_6))));
    life7_6 += 1;
    if (!((life6_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dW.Q, moom.dW.R, moom.dW.T, moom.dW.S, moom.dW.V});
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.item.EnumDyeColor)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dW.V))))))).a__fm();
}


private static native void __sourceExactCall_8092b703abccaf(net.minecraft.world.World p0, moom.DT p1);
}
