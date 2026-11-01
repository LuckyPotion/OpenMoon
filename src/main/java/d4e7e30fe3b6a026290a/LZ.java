package moom;


public class LZ {

private final java.util.List<moom.lC> a;

private final java.util.List<net.minecraft.block.state.IBlockState> b;

private final java.util.List<moom.lC> c;

private static int[] d;

private static final long e;

public LZ() {
super();
    this.a = new java.util.ArrayList();
    this.b = new java.util.ArrayList();
    this.c = java.util.Arrays.asList(new moom.lC[1]);
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(1201653212312880337L)), ((long)(2659858320047021725L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(264657257881206L)))));
    if ((moom.LZ.b() == null)) {
        moom.LZ.b(((int[])(new int[1])));
    }
}


public static void b(int[] p0) {
moom.LZ.d = ((int[])(p0));
    return;
}


public static int[] b() {
return moom.LZ.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
((java.util.List)(this.a)).clear();
    ((java.util.List)(this.b)).clear();
    return;
}


public void a(moom.lC p0, net.minecraft.block.state.IBlockState p1) {
long life3_3;
    int[] life5_5;
    forward_join_20: {
    forward_join_15: {
    life3_3 = (moom.LZ.e ^ 17592458974073L);
    life5_5 = moom.LZ.b();
    if (!((life5_5 != null))) { break forward_join_15; }
    if (!((p0 != null))) { break forward_join_20; }
    ((java.util.List)(this.a)).add(((java.lang.Object)(p0)));
    }
    ((java.util.List)(this.b)).add(((java.lang.Object)(p1)));
    }
    return;
}


public int a() {
return ((java.util.List)(this.a)).size();
}


public moom.lC a__lC(int p0) {
return ((moom.lC)(((java.util.List)(this.a)).get(((int)(p0)))));
}


public net.minecraft.block.state.IBlockState a(int p0) {
int forwardValue2576_11_0;
    net.minecraft.block.state.IBlockState forwardValue2576_23_0;
    int spill2576_0;
    long life2_3;
    int[] life4_5;
    forward_join_23: {
    forward_join_21: {
    forward_join_11: {
    life2_3 = (moom.LZ.e ^ 39018614685406L);
    life4_5 = moom.LZ.b();
    spill2576_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue2576_11_0 = spill2576_0;
        break forward_join_11;
    }
    if (!((spill2576_0 >= 0))) {
        break forward_join_21;
    }
    forwardValue2576_11_0 = p0;
    }
    if (!((forwardValue2576_11_0 < ((java.util.List)(this.b)).size()))) {
        break forward_join_21;
    }
    forwardValue2576_23_0 = ((net.minecraft.block.state.IBlockState)(((java.util.List)(this.b)).get(((int)(p0)))));
    break forward_join_23;
    }
    forwardValue2576_23_0 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE();
    }
    return forwardValue2576_23_0;
}


public java.util.List<moom.lC> a(moom.lC p0) {
((java.util.List)(this.c)).set(((int)(0)), ((java.lang.Object)(p0)));
    return this.c;
}

}
