package moom;


class vv extends net.minecraft.entity.ai.EntityMoveHelper {

private final net.minecraft.entity.monster.EntityGhast g;

private int h;

private static final long i;

public vv(net.minecraft.entity.monster.EntityGhast p0) {
super(p0);
    this.g = p0;
}


static {
i = (moom._c.a(-3913458657111855835L, -8324558314325495032L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(259546860520729L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a__Void() {
moom.vv forwardValue4334_12_0;
    int forwardValue4334_81_0;
    moom.vv forwardValue4334_118_0;
    moom.vv spill4334_0;
    int spill4334_1;
    moom.vv spill4334_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    double life4_23;
    double life6_30;
    double life8_37;
    double life10_49;
    forward_join_120: {
    forward_join_118: {
    forward_join_117: {
    forward_join_81: {
    forward_join_12: {
    life1_3 = (moom.vv.i ^ 34302802700875L);
    life3_5 = moom.vN.b();
    spill4334_0 = this;
    if (!((life3_5 == null))) {
        forwardValue4334_12_0 = spill4334_0;
        break forward_join_12;
    }
    if (!(((moom.vv)(spill4334_0)).f)) {
        break forward_join_120;
    }
    forwardValue4334_12_0 = this;
    }
    life4_23 = (((moom.vv)(forwardValue4334_12_0)).b - ((net.minecraft.entity.monster.EntityGhast)(this.g)).n);
    life6_30 = (((moom.vv)(this)).c - ((net.minecraft.entity.monster.EntityGhast)(this.g)).o);
    life8_37 = (((moom.vv)(this)).d - ((net.minecraft.entity.monster.EntityGhast)(this.g)).p);
    life10_49 = (((life4_23 * life4_23) + (life6_30 * life6_30)) + (life8_37 * life8_37));
    moom.vv __stackOp4334_12_0 = this;
    moom.vv __stackOp4334_14_0 = __stackOp4334_12_0;
    int __stackOp4334_14_1 = ((moom.vv)(__stackOp4334_12_0)).h;
    spill4334_1 = __stackOp4334_14_1;
    ((moom.vv)(__stackOp4334_14_0)).h = ((int)((__stackOp4334_14_1 - 1)));
    if (!((life3_5 == null))) {
        forwardValue4334_81_0 = spill4334_1;
        break forward_join_81;
    }
    if (!((spill4334_1 <= 0))) {
        break forward_join_120;
    }
    moom.vv __stackOp4334_16_0 = this;
    ((moom.vv)(__stackOp4334_16_0)).h = ((int)((((moom.vv)(__stackOp4334_16_0)).h + (((java.util.Random)(((net.minecraft.entity.monster.EntityGhast)(this.g)).a__Random())).nextInt(((int)(5))) + 2))));
    life10_49 = ((double) moom.Dr.a__Float(((double)(life10_49))));
    spill4334_2 = this;
    if (!((life3_5 == null))) {
        forwardValue4334_118_0 = spill4334_2;
        break forward_join_118;
    }
    forwardValue4334_81_0 = ((((moom.vv)(spill4334_2)).a__sourceReturn_c9c271d41e(((double)(((moom.vv)(this)).b)), ((double)(((moom.vv)(this)).c)), ((double)(((moom.vv)(this)).d)), ((double)(life10_49)))) ? 1 : 0);
    }
    if (!((forwardValue4334_81_0 != 0))) {
        break forward_join_117;
    }
    net.minecraft.entity.monster.EntityGhast __stackOp4334_29_0 = this.g;
    ((net.minecraft.entity.monster.EntityGhast)(__stackOp4334_29_0)).t = ((double)((((net.minecraft.entity.monster.EntityGhast)(__stackOp4334_29_0)).t + ((life4_23 / life10_49) * 0x1.999999999999ap-4d))));
    net.minecraft.entity.monster.EntityGhast __stackOp4334_33_0 = this.g;
    ((net.minecraft.entity.monster.EntityGhast)(__stackOp4334_33_0)).u = ((double)((((net.minecraft.entity.monster.EntityGhast)(__stackOp4334_33_0)).u + ((life6_30 / life10_49) * 0x1.999999999999ap-4d))));
    net.minecraft.entity.monster.EntityGhast __stackOp4334_37_0 = this.g;
    ((net.minecraft.entity.monster.EntityGhast)(__stackOp4334_37_0)).v = ((double)((((net.minecraft.entity.monster.EntityGhast)(__stackOp4334_37_0)).v + ((life8_37 / life10_49) * 0x1.999999999999ap-4d))));
    if (!((life3_5 != null))) {
        break forward_join_120;
    }
    }
    forwardValue4334_118_0 = this;
    }
    ((moom.vv)(forwardValue4334_118_0)).f = ((boolean)(false));
    }
    return;
}


private boolean a__sourceReturn_c9c271d41e(double p0, double p1, double p2, double p3) {
int lexicalValue1363_66_0;
    net.minecraft.entity.Entity[] spill1363_0;
    boolean spill1363_1;
    long life9_3;
    double life12_11;
    double life14_20;
    double life16_28;
    moom.CA life18_32;
    net.minecraft.entity.Entity[] life11_33;
    int life19_35;
    lexical_join_66: {
    lexical_join_65: {
    life9_3 = (moom.vv.i ^ 71675984079403L);
    life12_11 = ((p0 - ((net.minecraft.entity.monster.EntityGhast)(this.g)).n) / p3);
    spill1363_0 = moom.vN.b();
    life14_20 = ((p1 - ((net.minecraft.entity.monster.EntityGhast)(this.g)).o) / p3);
    life16_28 = ((p2 - ((net.minecraft.entity.monster.EntityGhast)(this.g)).p) / p3);
    life18_32 = ((net.minecraft.entity.monster.EntityGhast)(this.g)).b();
    life11_33 = spill1363_0;
    life19_35 = 1;
    lexical_cycle_36: while (true) {
    lexical_join_63: {
    lexical_join_62: {
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((double) life19_35))), ((double)(p3))) < 0))) {
        break lexical_join_65;
    }
    life18_32 = ((moom.CA)(life18_32)).c(((double)(life12_11)), ((double)(life14_20)), ((double)(life16_28)));
    if (!((life11_33 == null))) {
        break lexical_join_63;
    }
    spill1363_1 = ((java.util.List)(((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityGhast)(this.g)).i)).a(((net.minecraft.entity.Entity)(this.g)), ((moom.CA)(life18_32))))).isEmpty();
    if (!((life11_33 == null))) {
        lexicalValue1363_66_0 = ((spill1363_1) ? 1 : 0);
        break lexical_join_66;
    }
    if (!((!spill1363_1))) {
        break lexical_join_62;
    }
    return ((0) != 0);
    }
    life19_35 += 1;
    }
    if (!((life11_33 != null))) { continue lexical_cycle_36; }
    break lexical_cycle_36;
    }
    }
    lexicalValue1363_66_0 = 1;
    }
    return ((lexicalValue1363_66_0) != 0);
}

}
