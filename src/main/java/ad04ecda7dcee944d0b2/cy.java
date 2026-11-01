package moom;


public class cy extends moom.cu {

private static final long R;

protected cy() {
super(moom.fn.l);
    float local1 = 0x1.99999ap-2f;
    ((moom.cy)(this)).a(((float)((0x1.0p-1f - local1))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local1))), ((float)((0x1.0p-1f + local1))), ((float)(0x1.99999ap-1f)), ((float)((0x1.0p-1f + local1))));
    return;
}


static {
R = (moom._c.a(4534805184043993635L, 941778547766755712L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(77473918058456L);
}


protected boolean b(net.minecraft.block.Block p0) {
net.minecraft.block.Block forwardValue3162_13_0;
    net.minecraft.block.Block forwardValue3162_13_1;
    net.minecraft.block.Block forwardValue3162_18_0;
    net.minecraft.block.Block forwardValue3162_18_1;
    net.minecraft.block.Block forwardValue3162_23_0;
    net.minecraft.block.Block forwardValue3162_23_1;
    int forwardValue3162_27_0;
    net.minecraft.block.Block spill3162_0;
    moom.dx spill3162_1;
    long life2_3;
    int[] life4_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_24: {
    forward_join_23: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (moom.cy.R ^ 131468617125676L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3162_0 = p0;
    spill3162_1 = net.minecraft.init.Blocks.m;
    if (!((life4_5 != null))) {
        forwardValue3162_13_0 = spill3162_0;
        forwardValue3162_13_1 = spill3162_1;
        break forward_join_13;
    }
    if (!((spill3162_0 != spill3162_1))) {
        break forward_join_24;
    }
    forwardValue3162_13_0 = p0;
    forwardValue3162_13_1 = net.minecraft.init.Blocks.cd;
    }
    if (!((life4_5 != null))) {
        forwardValue3162_18_0 = forwardValue3162_13_0;
        forwardValue3162_18_1 = forwardValue3162_13_1;
        break forward_join_18;
    }
    if (!((forwardValue3162_13_0 != forwardValue3162_13_1))) {
        break forward_join_24;
    }
    forwardValue3162_18_0 = p0;
    forwardValue3162_18_1 = net.minecraft.init.Blocks.b9;
    }
    if (!((life4_5 != null))) {
        forwardValue3162_23_0 = forwardValue3162_18_0;
        forwardValue3162_23_1 = forwardValue3162_18_1;
        break forward_join_23;
    }
    if (!((forwardValue3162_18_0 != forwardValue3162_18_1))) {
        break forward_join_24;
    }
    forwardValue3162_23_0 = p0;
    forwardValue3162_23_1 = net.minecraft.init.Blocks.d;
    }
    if (!((forwardValue3162_23_0 == forwardValue3162_23_1))) {
        break forward_join_26;
    }
    }
    forwardValue3162_27_0 = 1;
    break forward_join_27;
    }
    forwardValue3162_27_0 = 0;
    }
    return ((forwardValue3162_27_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, moom.DT p2, net.minecraft.block.state.IBlockState p3, net.minecraft.tileentity.TileEntity p4) {
net.minecraft.item.ItemStack forwardValue3161_18_0;
    net.minecraft.entity.player.EntityPlayer forwardValue3161_22_0;
    net.minecraft.item.ItemStack spill3161_0;
    net.minecraft.entity.player.EntityPlayer spill3161_1;
    long life6_3;
    int[] life8_5;
    forward_join_45: {
    forward_join_38: {
    forward_join_22: {
    forward_join_18: {
    life6_3 = (moom.cy.R ^ 118585119357055L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break forward_join_38;
    }
    spill3161_0 = ((net.minecraft.entity.player.EntityPlayer)(p1)).c__xW();
    if (!((life8_5 != null))) {
        forwardValue3161_18_0 = spill3161_0;
        break forward_join_18;
    }
    if (!((spill3161_0 != null))) {
        break forward_join_38;
    }
    spill3161_1 = p1;
    if (!((life8_5 != null))) {
        forwardValue3161_22_0 = spill3161_1;
        break forward_join_22;
    }
    forwardValue3161_18_0 = ((net.minecraft.entity.player.EntityPlayer)(spill3161_1)).c__xW();
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue3161_18_0)).a__wQ() == net.minecraft.init.Items.a4))) {
        break forward_join_38;
    }
    forwardValue3161_22_0 = p1;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue3161_22_0)).a(((moom.BY)((net.minecraft.stats.StatList.ab)[net.minecraft.block.Block.a(((net.minecraft.block.Block)(this)))])));
    moom.cy.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.I, 1, 0))));
    if (!((life8_5 == null))) {
        break forward_join_45;
    }
    }
    super.a(((net.minecraft.world.World)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)), ((net.minecraft.tileentity.TileEntity)(p4)));
    }
    return;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return null;
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1) {
return ((1) != 0);
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return moom.fm.o;
}

}
