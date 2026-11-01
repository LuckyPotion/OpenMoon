package moom;


public class eI extends net.minecraft.block.Block {

private static final long Q;

protected eI() {
super(moom.fn.d);
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
Q = (moom._c.a(-4287684192460010878L, 938181688527987984L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(167879974951746L);
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue3447_22_0;
    boolean spill3447_0;
    long life9_3;
    int[] life11_5;
    forward_join_22: {
    forward_join_21: {
    life9_3 = (moom.eI.Q ^ 86277458027854L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3447_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue3447_22_0 = ((spill3447_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill3447_0))) {
        break forward_join_21;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((net.minecraft.world.IInteractionObject)(new moom.fj(p0, p1))));
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)(net.minecraft.stats.StatList.Z)));
    }
    forwardValue3447_22_0 = 1;
    }
    return ((forwardValue3447_22_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
