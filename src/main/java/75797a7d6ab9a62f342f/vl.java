package moom;


class vl extends moom.uc {

private final net.minecraft.entity.monster.EntitySlime c;

private static final long d;

public vl(net.minecraft.entity.monster.EntitySlime p0) {
super();
    this.c = p0;
    (this).a(5);
    (((moom.AW) (__sourceExactCall_76d832bb75afff((p0))))).d(true);
}


static {
d = (moom._c.a(4205348602699481405L, 3167248077474251740L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(181396332292122L);
}


public void c() {
net.minecraft.entity.monster.EntitySlime forwardValue4330_21_0;
    net.minecraft.entity.monster.EntitySlime spill4330_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_19: {
    life1_3 = (moom.vl.d ^ 47278493195044L);
    life3_5 = moom.vN.b();
    spill4330_0 = this.c;
    if (!((life3_5 == null))) {
        forwardValue4330_21_0 = spill4330_0;
        break forward_join_21;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((net.minecraft.entity.monster.EntitySlime)(spill4330_0)).a__Random())).nextFloat())), ((float)(0x1.99999ap-1f))) < 0))) {
        break forward_join_19;
    }
    ((net.minecraft.entity.ai.EntityJumpHelper)(((net.minecraft.entity.monster.EntitySlime)(this.c)).a__vr())).a();
    }
    forwardValue4330_21_0 = this.c;
    }
    ((moom.vx)(((moom.vx)(((net.minecraft.entity.monster.EntitySlime)(forwardValue4330_21_0)).a__vu())))).a(((double)(0x1.3333333333333p0d)));
    return;
}


public boolean a__Boolean() {
int forwardValue4329_19_0;
    int forwardValue4329_21_0;
    boolean spill4329_0;
    boolean spill4329_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (moom.vl.d ^ 25664302600470L);
    life3_5 = moom.vN.b();
    spill4329_0 = ((net.minecraft.entity.monster.EntitySlime)(this.c)).j__Boolean();
    if (!((life3_5 == null))) {
        forwardValue4329_19_0 = ((spill4329_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill4329_0))) {
        break forward_join_18;
    }
    spill4329_1 = ((net.minecraft.entity.monster.EntitySlime)(this.c)).l__Boolean();
    if (!((life3_5 == null))) {
        forwardValue4329_19_0 = ((spill4329_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill4329_1)) {
        break forward_join_20;
    }
    }
    forwardValue4329_19_0 = 1;
    }
    forwardValue4329_21_0 = forwardValue4329_19_0;
    break forward_join_21;
    }
    forwardValue4329_21_0 = 0;
    }
    return ((forwardValue4329_21_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native moom.AV __sourceExactCall_76d832bb75afff(net.minecraft.entity.monster.EntitySlime p0);
}
