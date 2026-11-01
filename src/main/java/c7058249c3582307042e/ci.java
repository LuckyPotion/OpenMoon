package moom;


public class ci extends net.minecraft.block.Block {

private static final java.util.Map Q;

private static final long R;

protected ci() {
super(moom.fn.a);
}


static {
R = (moom._c.a(3940132275901329709L, -8178589434746034171L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(5696908826312L);
    Q = new java.util.IdentityHashMap();
}


public int c__Int() {
return -1;
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1) {
return ((1) != 0);
}


public static void a(net.minecraft.block.Block p0, int p1) {
long local2 = (moom.ci.R ^ 81064895977997L);
    int[] local4 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if ((local4 != null)) {
        if ((__sourceIntrinsic_booleanComparison(((java.util.Map)(moom.ci.Q)).containsKey(((java.lang.Object)(p0)))) == 0)) {
        ((java.util.Map)(moom.ci.Q)).put(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.block.Block)(p0)).s))))));
    }
        ((net.minecraft.block.Block)(p0)).s = ((int)(p1));
    }
    return;
}


public static void a__sourceReturn_cc57eac6a9(net.minecraft.block.Block p0) {
int forwardValue345_17_0;
    boolean spill345_0;
    long life1_3;
    int[] life3_5;
    int life4_23;
    forward_join_21: {
    forward_join_17: {
    life1_3 = (moom.ci.R ^ 14301689630443L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill345_0 = ((java.util.Map)(moom.ci.Q)).containsKey(((java.lang.Object)(p0)));
    if (!((life3_5 != null))) {
        forwardValue345_17_0 = ((spill345_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill345_0)) {
        break forward_join_21;
    }
    forwardValue345_17_0 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map)(moom.ci.Q)).get(((java.lang.Object)(p0))))))).intValue();
    }
    life4_23 = forwardValue345_17_0;
    moom.ci.a(((net.minecraft.block.Block)(p0)), ((int)(life4_23)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public boolean a(net.minecraft.block.state.IBlockState p0, boolean p1) {
return ((0) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
return;
}


public boolean j() {
return ((0) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
