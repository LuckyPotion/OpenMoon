package moom;


public class xu extends net.minecraft.item.Item {

private static final long n;

public xu() {
super();
    (this).a(net.minecraft.creativetab.CreativeTabs.k);
}


static {
n = (moom._c.a(7191102199761835292L, 6113615372810909593L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(219945821238448L);
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
net.minecraft.util.MovingObjectPosition forwardValue4542_17_0;
    net.minecraft.util.MovingObjectPosition forwardValue4542_23_0;
    int forwardValue4542_43_0;
    int forwardValue4542_84_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4542_86_0;
    boolean spill4542_0;
    net.minecraft.util.MovingObjectPosition spill4542_1;
    boolean spill4542_2;
    int spill4542_3;
    net.minecraft.entity.player.EntityPlayer spill4542_4;
    long life4_3;
    net.minecraft.util.MovingObjectPosition life7_10;
    int life6_11;
    moom.DT life8_33;
    forward_join_95: {
    forward_join_86: {
    forward_join_84: {
    forward_join_75: {
    forward_join_46: {
    forward_join_43: {
    forward_join_34: {
    forward_join_23: {
    forward_join_17: {
    life4_3 = (moom.xu.n ^ 42637541672289L);
    spill4542_0 = net.minecraft.item.ItemStack.m();
    life7_10 = ((moom.xu)(this)).a(((net.minecraft.world.World)(p1)), ((net.minecraft.entity.player.EntityPlayer)(p2)), ((boolean)(true)));
    life6_11 = ((spill4542_0) ? 1 : 0);
    spill4542_1 = life7_10;
    if (!((life6_11 != 0))) {
        forwardValue4542_17_0 = spill4542_1;
        break forward_join_17;
    }
    if (!((spill4542_1 != null))) {
        break forward_join_95;
    }
    forwardValue4542_17_0 = life7_10;
    }
    if (!((life6_11 != 0))) {
        forwardValue4542_23_0 = forwardValue4542_17_0;
        break forward_join_23;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forwardValue4542_17_0)).b == net.minecraft.util.MovingObjectPosition$MovingObjectType.BLOCK))) {
        break forward_join_95;
    }
    forwardValue4542_23_0 = life7_10;
    }
    life8_33 = ((net.minecraft.util.MovingObjectPosition)(forwardValue4542_23_0)).a();
    spill4542_2 = ((net.minecraft.world.World)(p1)).a(((net.minecraft.entity.player.EntityPlayer)(p2)), ((moom.DT)(life8_33)));
    if (!((life6_11 != 0))) {
        forwardValue4542_43_0 = ((spill4542_2) ? 1 : 0);
        break forward_join_43;
    }
    if (!((!spill4542_2))) {
        break forward_join_34;
    }
    return p0;
    }
    forwardValue4542_43_0 = ((((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.DT)(((moom.DT)(life8_33)).a(((moom.bs)(((net.minecraft.util.MovingObjectPosition)(life7_10)).c))))), ((moom.bs)(((net.minecraft.util.MovingObjectPosition)(life7_10)).c)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((forwardValue4542_43_0 == 0))) {
        break forward_join_46;
    }
    return p0;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(life8_33))))).a__ch())).a__fn() == moom.fn.h))) {
        break forward_join_95;
    }
    net.minecraft.item.ItemStack __stackOp4542_18_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4542_18_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4542_18_0)).b - 1)));
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    spill4542_3 = ((net.minecraft.item.ItemStack)(p0)).b;
    if (!((life6_11 != 0))) {
        forwardValue4542_84_0 = spill4542_3;
        break forward_join_84;
    }
    if (!((spill4542_3 <= 0))) {
        break forward_join_75;
    }
    return new net.minecraft.item.ItemStack(net.minecraft.init.Items.bo);
    }
    spill4542_4 = p2;
    if (!((life6_11 != 0))) {
        forwardValue4542_86_0 = spill4542_4;
        break forward_join_86;
    }
    forwardValue4542_84_0 = ((((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(spill4542_4)).bD)).a__Boolean(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bo))))) ? 1 : 0);
    }
    if (!((forwardValue4542_84_0 == 0))) {
        break forward_join_95;
    }
    forwardValue4542_86_0 = p2;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue4542_86_0)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bo, 1, 0))), ((boolean)(false)));
    }
    return p0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
