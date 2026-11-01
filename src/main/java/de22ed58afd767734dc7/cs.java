package moom;


public class cs extends moom.co {

private static final long R;

public cs() {
super(moom.fn.B, false, moom.fm.c);
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
    this.L = 0x1.99999a0000000p-1f;
}


static {
R = (moom._c.a(-5867469808350080397L, -1166752789598601256L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(177210446507449L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.Entity p1) {
int forwardValue3148_23_0;
    net.minecraft.entity.Entity forwardValue3148_25_0;
    boolean spill3148_0;
    net.minecraft.entity.Entity spill3148_1;
    long life3_3;
    int[] life5_5;
    forward_join_29: {
    forward_join_25: {
    forward_join_23: {
    forward_join_17: {
    life3_3 = (moom.cs.R ^ 41745489231023L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3148_0 = ((net.minecraft.entity.Entity)(p1)).t__Boolean();
    if (!((life5_5 != null))) {
        forwardValue3148_23_0 = ((spill3148_0) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill3148_0)) {
        break forward_join_17;
    }
    super.a(((net.minecraft.world.World)(p0)), ((net.minecraft.entity.Entity)(p1)));
    if (!((life5_5 == null))) {
        break forward_join_29;
    }
    }
    spill3148_1 = p1;
    if (!((life5_5 != null))) {
        forwardValue3148_25_0 = spill3148_1;
        break forward_join_25;
    }
    forwardValue3148_23_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.Entity)(spill3148_1)).u)), ((double)(0x0.0p0d)));
    }
    if (!((forwardValue3148_23_0 < 0))) {
        break forward_join_29;
    }
    forwardValue3148_25_0 = p1;
    }
    ((net.minecraft.entity.Entity)(forwardValue3148_25_0)).u = ((double)((-((net.minecraft.entity.Entity)(p1)).u)));
    }
    return;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.Entity p2) {
long life4_3;
    int[] life6_5;
    double life7_30;
    life4_3 = (moom.cs.R ^ 43707134793489L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if ((life6_5 != null)) {
        if ((recovery.source.CarrierOps.dcmpg(((double)(java.lang.Math.abs(((double)(((net.minecraft.entity.Entity)(p2)).u))))), ((double)(0x1.999999999999ap-4d))) < 0)) {
        if ((!((net.minecraft.entity.Entity)(p2)).t__Boolean())) {
        life7_30 = (0x1.999999999999ap-2d + (java.lang.Math.abs(((double)(((net.minecraft.entity.Entity)(p2)).u))) * 0x1.999999999999ap-3d));
        net.minecraft.entity.Entity __stackOp3146_8_0 = p2;
        ((net.minecraft.entity.Entity)(__stackOp3146_8_0)).t = ((double)((((net.minecraft.entity.Entity)(__stackOp3146_8_0)).t * life7_30)));
        net.minecraft.entity.Entity __stackOp3146_11_0 = p2;
        ((net.minecraft.entity.Entity)(__stackOp3146_11_0)).v = ((double)((((net.minecraft.entity.Entity)(__stackOp3146_11_0)).v * life7_30)));
    }
    }
        super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.entity.Entity)(p2)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.Entity p2, float p3) {
net.minecraft.entity.Entity forwardValue3147_20_0;
    net.minecraft.entity.Entity spill3147_0;
    long life5_3;
    int[] life7_5;
    forward_join_23: {
    forward_join_20: {
    forward_join_19: {
    life5_3 = (moom.cs.R ^ 61609276102551L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3147_0 = p2;
    if (!((life7_5 != null))) {
        forwardValue3147_20_0 = spill3147_0;
        break forward_join_20;
    }
    if (!(((net.minecraft.entity.Entity)(spill3147_0)).t__Boolean())) {
        break forward_join_19;
    }
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.entity.Entity)(p2)), ((float)(p3)));
    if (!((life7_5 == null))) {
        break forward_join_23;
    }
    }
    forwardValue3147_20_0 = p2;
    }
    ((net.minecraft.entity.Entity)(forwardValue3147_20_0)).d(((float)(p3)), ((float)(0x0.0p0f)));
    }
    return;
}

}
