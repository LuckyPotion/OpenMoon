package moom;


public class c5 extends moom.cT {

private static final long R;

protected c5(moom.fn p0) {
super(p0);
    (this).a(0x1.0000000000000p+0f);
}


static {
R = (moom._c.a(6044313362851620529L, 6916893057992036217L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(112717061052265L);
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
double local5 = ((double) (((float) ((moom.DT)(p1)).a()) + ((java.util.Random)(p3)).nextFloat()));
    double local7 = ((double) (((float) ((moom.DT)(p1)).b()) + 0x1.99999ap-1f));
    double local9 = ((double) (((float) ((moom.DT)(p1)).c()) + ((java.util.Random)(p3)).nextFloat()));
    double local11 = 0x0.0p0d;
    double local13 = 0x0.0p0d;
    double local15 = 0x0.0p0d;
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)(local5)), ((double)(local7)), ((double)(local9)), ((double)(local11)), ((double)(local13)), ((double)(local15)), ((int[])(new int[0])));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.Entity p3) {
net.minecraft.entity.Entity forwardValue3017_13_0;
    net.minecraft.entity.Entity spill3017_0;
    long life5_3;
    int[] life7_5;
    forward_join_20: {
    forward_join_13: {
    life5_3 = (moom.c5.R ^ 135217430581867L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3017_0 = ((net.minecraft.entity.Entity)(p3)).g;
    if (!((life7_5 != null))) {
        forwardValue3017_13_0 = spill3017_0;
        break forward_join_13;
    }
    if (!((spill3017_0 == null))) {
        break forward_join_20;
    }
    forwardValue3017_13_0 = ((net.minecraft.entity.Entity)(p3)).f;
    }
    if (!((forwardValue3017_13_0 == null))) {
        break forward_join_20;
    }
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break forward_join_20;
    }
    ((net.minecraft.entity.Entity)(p3)).e(((int)(1)));
    }
    return;
}


public int a(java.util.Random p0) {
return 0;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return null;
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return moom.fm.E;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
float local3 = 0x1.0p-4f;
    ((moom.c5)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(local3)), ((float)(0x1.0p0f)));
    return;
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new net.minecraft.tileentity.TileEntityEndPortal();
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.CA p3, java.util.List<moom.CA> p4, net.minecraft.entity.Entity p5) {
return;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
int forwardValue3018_18_0;
    int forwardValue3018_20_0;
    boolean spill3018_0;
    long life4_3;
    int[] life6_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life4_3 = (moom.c5.R ^ 25497928163817L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((p2 == moom.bs.DOWN))) {
        break forward_join_19;
    }
    spill3018_0 = super.a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)));
    if (!((life6_5 != null))) {
        forwardValue3018_18_0 = ((spill3018_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill3018_0)) {
        break forward_join_19;
    }
    forwardValue3018_18_0 = 1;
    }
    forwardValue3018_20_0 = forwardValue3018_18_0;
    break forward_join_20;
    }
    forwardValue3018_20_0 = 0;
    }
    return ((forwardValue3018_20_0) != 0);
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}

}
