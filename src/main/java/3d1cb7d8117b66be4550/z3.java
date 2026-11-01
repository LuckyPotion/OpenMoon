package moom;


public class z3 implements moom.yK<moom.y2> {

private moom.Ee a;

private moom.z4[] b;

private static long c;

public z3() {
super();
}


public z3(int p0, short[] p1, net.minecraft.world.chunk.Chunk p2) { super(); }


private static void __sourceConstructorBody_d97c67c54350a7b7(moom.z3 receiver, int p0, short[] p1, net.minecraft.world.chunk.Chunk p2) throws Throwable {

init_join_43: {

    long local4_life2 = (moom.z3.c ^ 103367014785332L);

    moom.z3.__sourceConstructorInit_d97c67c54350a7b7_0(((moom.z3)(receiver)));

    int[] __sourceSpill766_8 = moom.zN.b__ArrayInt();

    ((moom.z3)(receiver)).a = ((moom.Ee)(new moom.Ee(((net.minecraft.world.chunk.Chunk)(p2)).i, ((net.minecraft.world.chunk.Chunk)(p2)).j)));

    ((moom.z3)(receiver)).b = ((moom.z4[])(new moom.z4[p0]));

    int[] local6_life10 = __sourceSpill766_8;

    int local7_life11 = 0;

    init_cycle_23: while (true) {

    if (!((local7_life11 < (((moom.z3)(receiver)).b).length))) {

        break init_join_43;

    }

    (((moom.z3)(receiver)).b)[local7_life11] = new moom.z4(receiver, (p1)[local7_life11], p2);

    local7_life11 += 1;

    if (!((local6_life10 != null))) { continue init_cycle_23; }

    break init_cycle_23;

    }

    }

    return;

}



static {
moom.z3.c = (moom._c.a(-3037930819260340496L, 3756050683682920949L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(85887667475136L);
}

private static native <E extends Throwable> void __sourceConstructorInit_d97c67c54350a7b7_0(moom.z3 a0) throws E;

public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill1444_0;
    long life2_3;
    int[] life4_11;
    moom.z4[] life5_25;
    int life6_28;
    int life7_30;
    moom.z4 life8_37;
    lexical_join_52: {
    life2_3 = (moom.z3.c ^ 113771071507640L);
    spill1444_0 = moom.zN.b__ArrayInt();
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(((moom.Ee)(this.a)).a)));
    life4_11 = spill1444_0;
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(((moom.Ee)(this.a)).b)));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)((this.b).length)));
    life5_25 = this.b;
    life6_28 = (life5_25).length;
    life7_30 = 0;
    lexical_cycle_31: while (true) {
    if (!((life7_30 < life6_28))) {
        break lexical_join_52;
    }
    life8_37 = (life5_25)[life7_30];
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(((moom.z4)(life8_37)).a__Short())));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(((moom.Dx)(net.minecraft.block.Block.c)).a(((java.lang.Object)(((moom.z4)(life8_37)).a__fE()))))));
    life7_30 += 1;
    if (!((life4_11 != null))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    return;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.z3)(this)));
    return;
}


public moom.z4[] a() {
return this.b;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill1443_0;
    long life2_3;
    int[] life4_14;
    int life5_21;
    lexical_join_45: {
    life2_3 = (moom.z3.c ^ 19432950521649L);
    spill1443_0 = moom.zN.b__ArrayInt();
    this.a = ((moom.Ee)(new moom.Ee(((net.minecraft.network.PacketBuffer)(p0)).readInt(), ((net.minecraft.network.PacketBuffer)(p0)).readInt())));
    life4_14 = spill1443_0;
    this.b = ((moom.z4[])(new moom.z4[((net.minecraft.network.PacketBuffer)(p0)).a()]));
    life5_21 = 0;
    lexical_cycle_22: while (true) {
    if (!((life5_21 < (this.b).length))) {
        break lexical_join_45;
    }
    (this.b)[life5_21] = new moom.z4(this, ((net.minecraft.network.PacketBuffer)(p0)).readShort(), ((net.minecraft.block.state.IBlockState)(((moom.Dx)(net.minecraft.block.Block.c)).a(((int)(((net.minecraft.network.PacketBuffer)(p0)).a()))))));
    life5_21 += 1;
    if (!((life4_14 != null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    return;
}

}
