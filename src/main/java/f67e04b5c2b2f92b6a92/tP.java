package moom;


public class tP extends net.minecraft.entity.projectile.EntityFireball {

private static final long cb;

public tP(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) {
super(p0, p1, p2, p3, p4, p5, p6);
    (this).a__Void(0x1.4000000000000p-2f, 0x1.4000000000000p-2f);
}


public tP(net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1, double p2, double p3, double p4) {
super(p0, p1, p2, p3, p4);
    (this).a__Void(0x1.4000000000000p-2f, 0x1.4000000000000p-2f);
}


public tP(net.minecraft.world.World p0) {
super(p0);
    (this).a__Void(0x1.4000000000000p-2f, 0x1.4000000000000p-2f);
}


static {
cb = (moom._c.a(-5460581421812320042L, 3247332982023682396L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(52220938551767L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
return ((0) != 0);
}


protected void a(net.minecraft.util.MovingObjectPosition p0) {
net.minecraft.entity.Entity forwardValue4064_14_0;
    net.minecraft.entity.Entity forwardValue4064_19_0;
    int forwardValue4064_41_0;
    net.minecraft.entity.Entity forwardValue4064_44_0;
    net.minecraft.entity.EntityLivingBase forwardValue4064_57_0;
    int forwardValue4064_68_0;
    moom.tP forwardValue4064_90_0;
    moom.tP spill4064_0;
    int spill4064_1;
    net.minecraft.entity.Entity spill4064_2;
    net.minecraft.entity.EntityLivingBase spill4064_3;
    int spill4064_4;
    moom.tP spill4064_5;
    long life2_3;
    int[] life4_5;
    int life5_37;
    int life5_73;
    moom.DT life6_107;
    forward_join_91: {
    forward_join_90: {
    forward_join_89: {
    forward_join_68: {
    forward_join_67: {
    forward_join_57: {
    forward_join_48: {
    forward_join_46: {
    forward_join_44: {
    forward_join_41: {
    forward_join_19: {
    forward_join_14: {
    life2_3 = (moom.tP.cb ^ 41113813296573L);
    life4_5 = moom.h1.a__ArrayInt();
    spill4064_0 = this;
    if (!((life4_5 != null))) {
        forwardValue4064_14_0 = spill4064_0;
        break forward_join_14;
    }
    if (!((!((net.minecraft.world.World)(((moom.tP)(spill4064_0)).i)).G))) {
        break forward_join_91;
    }
    forwardValue4064_14_0 = ((net.minecraft.util.MovingObjectPosition)(p0)).e;
    }
    if (!((life4_5 != null))) {
        forwardValue4064_19_0 = forwardValue4064_14_0;
        break forward_join_19;
    }
    if (!((forwardValue4064_14_0 != null))) {
        break forward_join_48;
    }
    forwardValue4064_19_0 = ((net.minecraft.util.MovingObjectPosition)(p0)).e;
    }
    life5_37 = ((((net.minecraft.entity.Entity)(forwardValue4064_19_0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a(((net.minecraft.entity.projectile.EntityFireball)(this)), ((net.minecraft.entity.Entity)(((moom.tP)(this)).aJ))))), ((float)(0x1.4p2f)))) ? 1 : 0);
    spill4064_1 = life5_37;
    if (!((life4_5 != null))) {
        forwardValue4064_41_0 = spill4064_1;
        break forward_join_41;
    }
    if (!((spill4064_1 != 0))) {
        break forward_join_46;
    }
    ((moom.tP)(this)).a(((net.minecraft.entity.EntityLivingBase)(((moom.tP)(this)).aJ)), ((net.minecraft.entity.Entity)(((net.minecraft.util.MovingObjectPosition)(p0)).e)));
    spill4064_2 = ((net.minecraft.util.MovingObjectPosition)(p0)).e;
    if (!((life4_5 != null))) {
        forwardValue4064_44_0 = spill4064_2;
        break forward_join_44;
    }
    forwardValue4064_41_0 = ((((net.minecraft.entity.Entity)(spill4064_2)).h__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue4064_41_0 == 0))) {
        break forward_join_46;
    }
    forwardValue4064_44_0 = ((net.minecraft.util.MovingObjectPosition)(p0)).e;
    }
    ((net.minecraft.entity.Entity)(forwardValue4064_44_0)).b(((int)(5)));
    }
    if (!((life4_5 == null))) {
        break forward_join_89;
    }
    }
    life5_73 = 1;
    spill4064_3 = ((moom.tP)(this)).aJ;
    if (!((life4_5 != null))) {
        forwardValue4064_57_0 = spill4064_3;
        break forward_join_57;
    }
    if (!((spill4064_3 != null))) {
        break forward_join_67;
    }
    forwardValue4064_57_0 = ((moom.tP)(this)).aJ;
    }
    spill4064_4 = ((forwardValue4064_57_0 instanceof net.minecraft.entity.EntityLiving) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue4064_68_0 = spill4064_4;
        break forward_join_68;
    }
    if (!((spill4064_4 != 0))) {
        break forward_join_67;
    }
    life5_73 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((moom.tP)(this)).i)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing")))) ? 1 : 0);
    }
    forwardValue4064_68_0 = life5_73;
    }
    if (!((forwardValue4064_68_0 != 0))) {
        break forward_join_89;
    }
    life6_107 = ((moom.DT)(((net.minecraft.util.MovingObjectPosition)(p0)).a())).a(((moom.bs)(((net.minecraft.util.MovingObjectPosition)(p0)).c)));
    spill4064_5 = this;
    if (!((life4_5 != null))) {
        forwardValue4064_90_0 = spill4064_5;
        break forward_join_90;
    }
    if (!(((net.minecraft.world.World)(((moom.tP)(spill4064_5)).i)).a__Boolean(((moom.DT)(life6_107))))) {
        break forward_join_89;
    }
    ((net.minecraft.world.World)(((moom.tP)(this)).i)).a(((moom.DT)(life6_107)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a__fE())));
    }
    forwardValue4064_90_0 = this;
    }
    ((moom.tP)(forwardValue4064_90_0)).f__Void();
    }
    return;
}


public boolean m__Boolean() {
return ((0) != 0);
}

}
