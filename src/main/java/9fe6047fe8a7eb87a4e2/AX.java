package moom;


public class AX extends moom.AW {

private moom.DT n;

private static final long p;

public AX(net.minecraft.entity.EntityLiving p0, net.minecraft.world.World p1) {
super(p0, p1);
}


static {
p = (moom._c.a(-8375925621446679819L, 4565226665224963745L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(100864557754689L);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.entity.Entity p0, double p1) {
long life4_3;
    moom.AT life7_8;
    int[] life6_9;
    life4_3 = (moom.AX.p ^ 122527666305671L);
    int[] spill3080_0 = moom.AV.b__ArrayInt();
    life7_8 = ((moom.AX)(this)).a(((net.minecraft.entity.Entity)(p0)));
    life6_9 = spill3080_0;
    if ((life6_9 != null)) {
        if ((life7_8 != null)) {
        return ((moom.AX)(this)).a(((moom.AT)(life7_8)), ((double)(p1)));
    }
        this.n = ((moom.DT)(new moom.DT(p0)));
        ((moom.AX)(this)).d = ((double)(p1));
    }
    return true;
}


public moom.AT a(moom.DT p0) {
this.n = ((moom.DT)(p0));
    return super.a(((moom.DT)(p0)));
}


public void a__Void() {
moom.AX forwardValue1452_16_0;
    moom.AX forwardValue1452_21_0;
    net.minecraft.entity.EntityLiving forwardValue1452_73_0;
    moom.AX forwardValue1452_92_0;
    moom.AX spill1452_0;
    moom.AX spill1452_1;
    net.minecraft.entity.EntityLiving spill1452_2;
    moom.AX spill1452_3;
    long life1_3;
    int[] life3_5;
    double life4_43;
    forward_join_94: {
    forward_join_92: {
    forward_join_91: {
    forward_join_73: {
    forward_join_71: {
    forward_join_21: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.AX.p ^ 28513176791702L);
    life3_5 = moom.AV.b__ArrayInt();
    spill1452_0 = this;
    if (!((life3_5 != null))) {
        forwardValue1452_16_0 = spill1452_0;
        break forward_join_16;
    }
    if (!((!((moom.AX)(spill1452_0)).a__Boolean()))) {
        break forward_join_15;
    }
    super.a__Void();
    if (!((life3_5 == null))) {
        break forward_join_94;
    }
    }
    forwardValue1452_16_0 = this;
    }
    if (!((life3_5 != null))) {
        forwardValue1452_21_0 = forwardValue1452_16_0;
        break forward_join_21;
    }
    if (!((((moom.AX)(forwardValue1452_16_0)).n != null))) {
        break forward_join_94;
    }
    forwardValue1452_21_0 = this;
    }
    life4_43 = ((double) (((net.minecraft.entity.EntityLiving)(((moom.AX)(forwardValue1452_21_0)).a)).G * ((net.minecraft.entity.EntityLiving)(((moom.AX)(this)).a)).G));
    spill1452_1 = this;
    if (!((life3_5 != null))) {
        forwardValue1452_92_0 = spill1452_1;
        break forward_join_92;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.EntityLiving)(((moom.AX)(spill1452_1)).a)).b(((moom.DT)(this.n))))), ((double)(life4_43))) >= 0))) {
        break forward_join_91;
    }
    spill1452_2 = ((moom.AX)(this)).a;
    if (!((life3_5 != null))) {
        forwardValue1452_73_0 = spill1452_2;
        break forward_join_73;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.EntityLiving)(spill1452_2)).o)), ((double)(((double) ((moom.DT)(this.n)).b())))) > 0))) {
        break forward_join_71;
    }
    spill1452_3 = this;
    if (!((life3_5 != null))) {
        forwardValue1452_92_0 = spill1452_3;
        break forward_join_92;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.EntityLiving)(((moom.AX)(spill1452_3)).a)).b(((moom.DT)(new moom.DT(((moom.DT)(this.n)).a(), moom.Dr.b__Int(((double)(((net.minecraft.entity.EntityLiving)(((moom.AX)(this)).a)).o))), ((moom.DT)(this.n)).c())))))), ((double)(life4_43))) >= 0))) {
        break forward_join_91;
    }
    }
    forwardValue1452_73_0 = ((moom.AX)(this)).a;
    }
    ((net.minecraft.entity.ai.EntityMoveHelper)(((net.minecraft.entity.EntityLiving)(forwardValue1452_73_0)).a__vu())).a(((double)(((double) ((moom.DT)(this.n)).a()))), ((double)(((double) ((moom.DT)(this.n)).b()))), ((double)(((double) ((moom.DT)(this.n)).c()))), ((double)(((moom.AX)(this)).d)));
    if (!((life3_5 == null))) {
        break forward_join_94;
    }
    }
    forwardValue1452_92_0 = this;
    }
    ((moom.AX)(forwardValue1452_92_0)).n = ((moom.DT)(null));
    }
    return;
}


public moom.AT a(net.minecraft.entity.Entity p0) {
this.n = ((moom.DT)(new moom.DT(p0)));
    return super.a(((net.minecraft.entity.Entity)(p0)));
}

}
