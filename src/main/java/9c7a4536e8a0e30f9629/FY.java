package moom;


public abstract class FY {

private final boolean a;

private static int[] b;

private static final long r;

public FY() {
this(false);
}


public FY(boolean p0) {
super();
    this.a = p0;
}


static {
r = ((long)(((moom._a)(moom._c.a(((long)(6371178646421799213L)), ((long)(-1707566673260198279L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(220717733199659L)))));
    if ((moom.FY.b() == null)) {
        moom.FY.b(((int[])(new int[2])));
    }
}


public static int[] b() {
return moom.FY.b;
}


public static void b(int[] p0) {
moom.FY.b = ((int[])(p0));
    return;
}


private static moom.Oo d(moom.Oo p0) {
return p0;
}


protected void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue1930_24_0;
    boolean spill1930_0;
    long life4_3;
    int[] life6_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_19: {
    life4_3 = (moom.FY.r ^ 61498310792885L);
    life6_5 = moom.FY.b();
    spill1930_0 = this.a;
    if (!((life6_5 != null))) {
        forwardValue1930_24_0 = ((spill1930_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill1930_0)) {
        break forward_join_19;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(3)));
    if (!((life6_5 == null))) {
        break forward_join_25;
    }
    }
    forwardValue1930_24_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue1930_24_0);
    }
    return;
}


public abstract boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2);

public void a() {
return;
}

}
