package net.minecraft.world.gen;


public class FlatLayerInfo {

private final int a;

private net.minecraft.block.state.IBlockState b;

private int c;

private int d;

private static final long e;

public FlatLayerInfo(int p0, int p1, net.minecraft.block.Block p2, int p3) {
this(p0, p1, p2);
    this.b = (p2).b__fE(p3);
}


public FlatLayerInfo(int p0, int p1, net.minecraft.block.Block p2) {
super();
    this.c = 1;
    this.a = p0;
    this.c = p1;
    this.b = (p2).a__fE();
}


public FlatLayerInfo(int p0, net.minecraft.block.Block p1) {
this(3, p0, p1);
}


static {
e = (moom._c.a(-3543884619678588044L, -9165302328966416300L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(81304321096126L);
}


public java.lang.String toString() {
java.lang.String forestValue1177_20_0;
    long life1_3;
    moom.DD life4_13;
    java.lang.String life3_20;
    int life4_47;
    forest_join_54: {
    forest_join_45: {
    forest_join_31: {
    forest_join_30: {
    forest_join_20: {
    forest_join_18: {
    life1_3 = (net.minecraft.world.gen.FlatLayerInfo.e ^ 92822893263372L);
    if (!((this.a >= 3))) {
        break forest_join_31;
    }
    life4_13 = ((moom.DD)(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(((net.minecraft.world.gen.FlatLayerInfo)(this)).a__ch())))));
    if (!((life4_13 == null))) {
        break forest_join_18;
    }
    forestValue1177_20_0 = "null";
    break forest_join_20;
    }
    forestValue1177_20_0 = ((moom.DD)(life4_13)).toString();
    }
    life3_20 = forestValue1177_20_0;
    if (!((this.c > 1))) {
        break forest_join_30;
    }
    life3_20 = __sourceIntrinsic_a86c261fcdee_invokedynamic1177_9(this.c, life3_20);
    }
    break forest_join_45;
    }
    life3_20 = java.lang.Integer.toString(((int)(net.minecraft.block.Block.a(((net.minecraft.block.Block)(((net.minecraft.world.gen.FlatLayerInfo)(this)).a__ch()))))));
    if (!((this.c > 1))) {
        break forest_join_45;
    }
    life3_20 = __sourceIntrinsic_a86c261fcdee_invokedynamic1177_15(this.c, life3_20);
    }
    life4_47 = this.b();
    if (!((life4_47 > 0))) {
        break forest_join_54;
    }
    life3_20 = __sourceIntrinsic_a86c261fcdee_invokedynamic1177_17(life3_20, life4_47);
    }
    return life3_20;
}


private int b() {
return ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(this.b)).a__ch())).b(((net.minecraft.block.state.IBlockState)(this.b)));
}


public int c() {
return this.d;
}


public net.minecraft.block.state.IBlockState a__fE() {
return this.b;
}


public int a() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0) {
this.d = ((int)(p0));
    return;
}


private net.minecraft.block.Block a__ch() {
return ((net.minecraft.block.state.IBlockState)(this.b)).a__ch();
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic1177_9(int a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic1177_15(int a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic1177_17(java.lang.String a0, int a1) throws E;
}
