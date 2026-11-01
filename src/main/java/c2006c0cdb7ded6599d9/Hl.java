package moom;


public class Hl extends moom.Hk {

public moom.If f;

public java.util.List<moom.If> g;

public java.util.List<moom.If> h;

public java.util.List<moom.G4> i;

private static long l;

public Hl() {
super();
    this.i = com.google.common.collect.Lists.newArrayList();
}


public Hl(java.util.Random p0, int p1, int p2) { super((java.util.Random)null, 0, 0); }


private static void __sourceConstructorBody_63ac2da6824e18bf(moom.Hl receiver, java.util.Random p0, int p1, int p2) throws Throwable {

long local4_life2;

    moom.If[] local7_life9;

    int local8_life12;

    int local9_life13;

    net.minecraft.entity.Entity[] local6_life14;

    moom.If local10_life15;

    init_join_72: {

    init_join_52: {

    init_join_44: {

    local4_life2 = (moom.Hl.l ^ 11941135350914L);

    moom.Hl.__sourceConstructorInit_63ac2da6824e18bf_0(((moom.Hl)(receiver)), ((java.util.Random)(p0)), ((int)(p1)), ((int)(p2)));

    ((moom.Hl)(receiver)).i = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.Hl)(receiver)).g = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    local7_life9 = net.minecraft.world.gen.structure.StructureNetherBridgePieces.a;

    net.minecraft.entity.Entity[] __sourceSpill508_11 = moom.G4.b();

    local8_life12 = (local7_life9).length;

    local9_life13 = 0;

    local6_life14 = __sourceSpill508_11;

    init_cycle_24: while (true) {

    if (!((local9_life13 < local8_life12))) {

        break init_join_44;

    }

    local10_life15 = (local7_life9)[local9_life13];

    ((moom.If)(local10_life15)).c = ((int)(0));

    ((java.util.List)(((moom.Hl)(receiver)).g)).add(((java.lang.Object)(local10_life15)));

    local9_life13 += 1;

    if (!((local6_life14 != null))) {

        break init_join_52;

    }

    if (!((local6_life14 == null))) { continue init_cycle_24; }

    break init_cycle_24;

    }

    }

    ((moom.Hl)(receiver)).h = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    local7_life9 = net.minecraft.world.gen.structure.StructureNetherBridgePieces.b;

    local8_life12 = (local7_life9).length;

    }

    local9_life13 = 0;

    init_cycle_54: while (true) {

    if (!((local9_life13 < local8_life12))) {

        break init_join_72;

    }

    local10_life15 = (local7_life9)[local9_life13];

    ((moom.If)(local10_life15)).c = ((int)(0));

    ((java.util.List)(((moom.Hl)(receiver)).h)).add(((java.lang.Object)(local10_life15)));

    local9_life13 += 1;

    if (!((local6_life14 == null))) { continue init_cycle_54; }

    break init_cycle_54;

    }

    }

    return;

}



static {
moom.Hl.l = (moom._c.a(6741384898955098087L, 2397190571498302601L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(149126355913110L);
}

private static native <E extends Throwable> void __sourceConstructorInit_63ac2da6824e18bf_0(moom.Hl a0, java.util.Random a1, int a2, int a3) throws E;

protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    return;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    return;
}

}
