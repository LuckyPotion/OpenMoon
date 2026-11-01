package moom;


public class HH extends moom.HF {

private int f;

private static long g;

public HH() {
super();
}


public HH(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) { super(0); }


private static void __sourceConstructorBody_fc67bcd6ddd2d886(moom.HH receiver, int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) throws Throwable {

moom.HH __initValue502_28_0;

    moom.G2 __initValue502_28_1;

    moom.HH __initValue502_27_0;

    moom.HH __initValue502_29_0;

    int __initValue502_29_1;

    init_join_29: {

    init_join_28: {

    init_join_27: {

    long local5_life2 = (moom.HH.g ^ 74819245606975L);

    net.minecraft.entity.Entity[] __sourceSpill502_4 = moom.G4.b();

    moom.HH.__sourceConstructorInit_fc67bcd6ddd2d886_0(((moom.HH)(receiver)), ((int)(p0)));

    net.minecraft.entity.Entity[] local7_life6 = __sourceSpill502_4;

    ((moom.HH)(receiver)).b = ((moom.bs)(p3));

    moom.HH __sourceSpill502_8 = receiver;

    moom.G2 __sourceSpill502_9 = p2;

    if (!((local7_life6 != null))) {

        __initValue502_28_0 = __sourceSpill502_8;

        __initValue502_28_1 = __sourceSpill502_9;

        break init_join_28;

    }

    ((moom.HH)(__sourceSpill502_8)).a = ((moom.G2)(__sourceSpill502_9));

    moom.HH __sourceSpill502_12 = receiver;

    if (!((p3 != moom.bs.NORTH))) {

        __initValue502_27_0 = __sourceSpill502_12;

        break init_join_27;

    }

    if (!((p3 != moom.bs.SOUTH))) {

        __initValue502_27_0 = __sourceSpill502_12;

        break init_join_27;

    }

    __initValue502_29_0 = __sourceSpill502_12;

    __initValue502_29_1 = ((moom.G2)(p2)).a();

    break init_join_29;

    }

    __initValue502_28_0 = __initValue502_27_0;

    __initValue502_28_1 = p2;

    }

    __initValue502_29_0 = __initValue502_28_0;

    __initValue502_29_1 = ((moom.G2)(__initValue502_28_1)).c();

    }

    ((moom.HH)(__initValue502_29_0)).f = ((int)(__initValue502_29_1));

    return;

}



static {
moom.HH.g = (moom._c.a(3413714401862908804L, -5469637056053907008L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(39063756840691L);
}

private static native <E extends Throwable> void __sourceConstructorInit_fc67bcd6ddd2d886_0(moom.HH a0, int a1) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.f = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Steps")))));
    return;
}


public static moom.G2 a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5) {
moom.G4 lexicalValue736_29_0;
    int lexicalValue736_37_0;
    net.minecraft.entity.Entity[] spill736_0;
    moom.G4 spill736_1;
    int spill736_2;
    long life6_3;
    int life9_6;
    net.minecraft.entity.Entity[] life8_7;
    moom.G2 life10_19;
    moom.G4 life11_23;
    int life12_46;
    moom.G2 life10_63;
    lexical_join_77: {
    lexical_join_37: {
    lexical_join_29: {
    life6_3 = (moom.HH.g ^ 38711721247935L);
    spill736_0 = moom.G4.b();
    life9_6 = 3;
    life8_7 = spill736_0;
    life10_19 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(-1)), ((int)(-1)), ((int)(0)), ((int)(5)), ((int)(5)), ((int)(4)), ((moom.bs)(p5)));
    life11_23 = moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life10_19)));
    spill736_1 = life11_23;
    if (!((life8_7 != null))) {
        lexicalValue736_29_0 = spill736_1;
        break lexical_join_29;
    }
    if (!((spill736_1 != null))) {
        break lexical_join_77;
    }
    lexicalValue736_29_0 = life11_23;
    }
    spill736_2 = ((moom.G2)(((moom.G4)(lexicalValue736_29_0)).a__G2())).b;
    if (!((life8_7 != null))) {
        lexicalValue736_37_0 = spill736_2;
        break lexical_join_37;
    }
    if (!((spill736_2 == ((moom.G2)(life10_19)).b))) {
        break lexical_join_77;
    }
    lexicalValue736_37_0 = 3;
    }
    life12_46 = lexicalValue736_37_0;
    lexical_cycle_38: while (true) {
    lexical_join_75: {
    lexical_join_74: {
    if (!((life12_46 >= 1))) {
        break lexical_join_77;
    }
    life10_63 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(-1)), ((int)(-1)), ((int)(0)), ((int)(5)), ((int)(5)), ((int)((life12_46 - 1))), ((moom.bs)(p5)));
    if (!((life8_7 != null))) {
        break lexical_join_75;
    }
    if (!((!((moom.G2)(((moom.G4)(life11_23)).a__G2())).a__Boolean(((moom.G2)(life10_63)))))) {
        break lexical_join_74;
    }
    return moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(-1)), ((int)(-1)), ((int)(0)), ((int)(5)), ((int)(5)), ((int)(life12_46)), ((moom.bs)(p5)));
    }
    life12_46 += -1;
    }
    if (!((life8_7 == null))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    return null;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Steps")), ((int)(this.f)));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue737_16_0;
    int lexicalValue737_172_0;
    boolean spill737_0;
    int spill737_1;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_21;
    int life8_74;
    lexical_join_172: {
    lexical_join_171: {
    lexical_join_16: {
    lexical_join_15: {
    life4_3 = (moom.HH.g ^ 111823503381769L);
    life6_5 = moom.G4.b();
    spill737_0 = ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        lexicalValue737_16_0 = ((spill737_0) ? 1 : 0);
        break lexical_join_16;
    }
    if (!(spill737_0)) {
        break lexical_join_15;
    }
    return ((0) != 0);
    }
    lexicalValue737_16_0 = 0;
    }
    life7_21 = lexicalValue737_16_0;
    lexical_cycle_17: while (true) {
    lexical_join_169: {
    lexical_join_123: {
    if (!((life7_21 < this.f))) {
        break lexical_join_171;
    }
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(0)), ((int)(0)), ((int)(life7_21)), ((moom.G2)(p2)));
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(1)), ((int)(0)), ((int)(life7_21)), ((moom.G2)(p2)));
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(2)), ((int)(0)), ((int)(life7_21)), ((moom.G2)(p2)));
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(3)), ((int)(0)), ((int)(life7_21)), ((moom.G2)(p2)));
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(4)), ((int)(0)), ((int)(life7_21)), ((moom.G2)(p2)));
    spill737_1 = 1;
    if (!((life6_5 != null))) {
        lexicalValue737_172_0 = spill737_1;
        break lexical_join_172;
    }
    life8_74 = spill737_1;
    lexical_cycle_70: while (true) {
    if (!((life8_74 <= 3))) {
        break lexical_join_123;
    }
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(0)), ((int)(life8_74)), ((int)(life7_21)), ((moom.G2)(p2)));
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(1)), ((int)(life8_74)), ((int)(life7_21)), ((moom.G2)(p2)));
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)), ((int)(life8_74)), ((int)(life7_21)), ((moom.G2)(p2)));
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(3)), ((int)(life8_74)), ((int)(life7_21)), ((moom.G2)(p2)));
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(4)), ((int)(life8_74)), ((int)(life7_21)), ((moom.G2)(p2)));
    life8_74 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_169;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_70; }
    break lexical_cycle_70;
    }
    }
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(0)), ((int)(4)), ((int)(life7_21)), ((moom.G2)(p2)));
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(1)), ((int)(4)), ((int)(life7_21)), ((moom.G2)(p2)));
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(2)), ((int)(4)), ((int)(life7_21)), ((moom.G2)(p2)));
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(3)), ((int)(4)), ((int)(life7_21)), ((moom.G2)(p2)));
    ((moom.HH)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).a__fE())), ((int)(4)), ((int)(4)), ((int)(life7_21)), ((moom.G2)(p2)));
    life7_21 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue737_172_0 = 1;
    }
    return ((lexicalValue737_172_0) != 0);
}

}
