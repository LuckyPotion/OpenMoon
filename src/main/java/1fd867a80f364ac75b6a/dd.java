package moom;


public class dd extends moom.cT {

private static final long S;

protected dd() {
super(moom.fn.d);
    float local1 = 0x1.0p-2f;
    float local2 = 0x1.0p0f;
    ((moom.dd)(this)).a(((float)((0x1.0p-1f - local1))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local1))), ((float)((0x1.0p-1f + local1))), ((float)(local2)), ((float)((0x1.0p-1f + local1))));
    return;
}


static {
S = (moom._c.a(4714309922597609058L, -9055701733884354983L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(31752708065674L);
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3306_17_0;
    int forwardValue3306_21_0;
    int forwardValue3306_23_0;
    boolean spill3306_0;
    long life3_3;
    int[] life5_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life3_3 = (moom.dd.S ^ 99152002440426L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3306_0 = ((moom.dd)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        forwardValue3306_17_0 = ((spill3306_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill3306_0))) {
        break forward_join_22;
    }
    forwardValue3306_17_0 = ((super.b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue3306_21_0 = forwardValue3306_17_0;
        break forward_join_21;
    }
    if (!((forwardValue3306_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue3306_21_0 = 1;
    }
    forwardValue3306_23_0 = forwardValue3306_21_0;
    break forward_join_23;
    }
    forwardValue3306_23_0 = 0;
    }
    return ((forwardValue3306_23_0) != 0);
}


public boolean n() {
return ((1) != 0);
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.ap;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.init.Items.ap;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
net.minecraft.world.World forwardValue3305_14_0;
    int forwardValue3305_26_0;
    int forwardValue3305_30_0;
    int forwardValue3305_32_0;
    net.minecraft.world.World spill3305_0;
    int spill3305_1;
    long life9_3;
    int[] life11_5;
    net.minecraft.tileentity.TileEntity life12_21;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_26: {
    forward_join_14: {
    forward_join_13: {
    life9_3 = (moom.dd.S ^ 28554039139976L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3305_0 = p0;
    if (!((life11_5 != null))) {
        forwardValue3305_14_0 = spill3305_0;
        break forward_join_14;
    }
    if (!(((net.minecraft.world.World)(spill3305_0)).G)) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue3305_14_0 = p0;
    }
    life12_21 = ((net.minecraft.world.World)(forwardValue3305_14_0)).a__B9(((moom.DT)(p1)));
    spill3305_1 = ((life12_21 instanceof moom.Ct) ? 1 : 0);
    if (!((life11_5 != null))) {
        forwardValue3305_26_0 = spill3305_1;
        break forward_join_26;
    }
    if (!((spill3305_1 != 0))) {
        break forward_join_31;
    }
    forwardValue3305_26_0 = ((((moom.Ct)(((moom.Ct)(life12_21)))).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(p3)))) ? 1 : 0);
    }
    if (!((life11_5 != null))) {
        forwardValue3305_30_0 = forwardValue3305_26_0;
        break forward_join_30;
    }
    if (!((forwardValue3305_26_0 != 0))) {
        break forward_join_31;
    }
    forwardValue3305_30_0 = 1;
    }
    forwardValue3305_32_0 = forwardValue3305_30_0;
    break forward_join_32;
    }
    forwardValue3305_32_0 = 0;
    }
    return ((forwardValue3305_32_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.CA a__CA(net.minecraft.world.World p0, moom.DT p1) {
((moom.dd)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a__CA(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
return ((1) != 0);
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new moom.Ct();
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}

}
