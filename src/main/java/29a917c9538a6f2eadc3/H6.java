package moom;


public class H6 extends moom.H5 {

public net.minecraft.world.biome.WorldChunkManager h;

public boolean i;

public int j;

public moom.IF k;

public java.util.List<moom.IF> l;

public java.util.List<moom.G4> m;

public java.util.List<moom.G4> n;

private static long o;

public H6() {
super();
    this.m = com.google.common.collect.Lists.newArrayList();
    this.n = com.google.common.collect.Lists.newArrayList();
}


public H6(net.minecraft.world.biome.WorldChunkManager p0, int p1, java.util.Random p2, int p3, int p4, java.util.List<moom.IF> p5, int p6) { super((moom.H6)null, 0, (java.util.Random)null, 0, 0); }


private static void __sourceConstructorBody_b62da4540cb418c7(moom.H6 receiver, net.minecraft.world.biome.WorldChunkManager p0, int p1, java.util.Random p2, int p3, int p4, java.util.List p5, int p6) throws Throwable {

moom.H6 __initValue501_46_0;

    net.minecraft.world.biome.BiomeGenBase __initValue501_46_1;

    net.minecraft.world.biome.BiomeGenBase __initValue501_46_2;

    moom.H6 __initValue501_47_0;

    moom.H6 __initValue501_49_0;

    moom.H6 __initValue501_50_0;

    int __initValue501_50_1;

    init_join_50: {

    init_join_49: {

    init_join_47: {

    init_join_46: {

    long local8_life2 = (moom.H6.o ^ 44279034067691L);

    moom.H6.__sourceConstructorInit_b62da4540cb418c7_0(((moom.H6)(receiver)), ((moom.H6)(null)), ((int)(0)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)));

    net.minecraft.entity.Entity[] __sourceSpill501_7 = moom.G4.b();

    ((moom.H6)(receiver)).m = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.H6)(receiver)).n = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.H6)(receiver)).h = ((net.minecraft.world.biome.WorldChunkManager)(p0));

    net.minecraft.entity.Entity[] local10_life11 = __sourceSpill501_7;

    ((moom.H6)(receiver)).l = ((java.util.List)(p5));

    ((moom.H6)(receiver)).j = ((int)(p6));

    net.minecraft.world.biome.BiomeGenBase local11_life16 = ((net.minecraft.world.biome.WorldChunkManager)(p0)).a(((moom.DT)(new moom.DT(p3, 0, p4))), ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.af)));

    moom.H6 __sourceSpill501_18 = receiver;

    net.minecraft.world.biome.BiomeGenBase __sourceSpill501_19 = local11_life16;

    net.minecraft.world.biome.BiomeGenBase __sourceSpill501_20 = net.minecraft.world.biome.BiomeGenBase.t;

    if (!((local10_life11 != null))) {

        __initValue501_46_0 = __sourceSpill501_18;

        __initValue501_46_1 = __sourceSpill501_19;

        __initValue501_46_2 = __sourceSpill501_20;

        break init_join_46;

    }

    if (!((__sourceSpill501_19 != __sourceSpill501_20))) {

        __initValue501_47_0 = __sourceSpill501_18;

        break init_join_47;

    }

    __initValue501_46_0 = __sourceSpill501_18;

    __initValue501_46_1 = local11_life16;

    __initValue501_46_2 = net.minecraft.world.biome.BiomeGenBase.I;

    }

    moom.H6 __sourceSpill501_22 = __initValue501_46_0;

    if (!((__initValue501_46_1 == __initValue501_46_2))) {

        __initValue501_49_0 = __sourceSpill501_22;

        break init_join_49;

    }

    __initValue501_47_0 = __sourceSpill501_22;

    }

    __initValue501_50_0 = __initValue501_47_0;

    __initValue501_50_1 = 1;

    break init_join_50;

    }

    __initValue501_50_0 = __initValue501_49_0;

    __initValue501_50_1 = 0;

    }

    ((moom.H6)(__initValue501_50_0)).i = ((boolean)__sourceIntrinsic_integerToBoolean((__initValue501_50_1)));

    ((moom.H6)(receiver)).a(((boolean)(((moom.H6)(receiver)).i)));

    return;

}



static {
moom.H6.o = (moom._c.a(8779185325318754772L, 2596027492930243617L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(81378767379763L);
}

private static native <E extends Throwable> void __sourceConstructorInit_b62da4540cb418c7_0(moom.H6 a0, moom.H6 a1, int a2, java.util.Random a3, int a4, int a5) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


public net.minecraft.world.biome.WorldChunkManager a__sourceReturn_e6477e9aa2() {
return this.h;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
