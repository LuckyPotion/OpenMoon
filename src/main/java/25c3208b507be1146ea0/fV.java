package moom;


public class fV extends moom.fU {

private final net.minecraft.entity.monster.EntityGuardian k;

private static final long l;

public fV(net.minecraft.entity.monster.EntityGuardian p0) {
super(new moom.DD("minecraft:mob.guardian.attack"));
    this.k = p0;
    this.i = net.minecraft.client.audio.ISound$AttenuationType.NONE;
    this.g = true;
    this.h = 0;
}


static {
l = (moom._c.a(-4780246362398372495L, -6270624491460944216L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(142095216603334L);
}


public void c__Void() {
moom.fV forwardValue3540_60_0;
    moom.fV spill3540_0;
    moom.fV spill3540_1;
    long life1_3;
    java.lang.String life3_5;
    float life4_49;
    forward_join_62: {
    forward_join_60: {
    forward_join_59: {
    life1_3 = (moom.fV.l ^ 23333246733355L);
    life3_5 = net.minecraft.client.audio.SoundHandler.b();
    spill3540_0 = this;
    if (!((life3_5 == null))) {
        forwardValue3540_60_0 = spill3540_0;
        break forward_join_60;
    }
    if (!((!((net.minecraft.entity.monster.EntityGuardian)(((moom.fV)(spill3540_0)).k)).F))) {
        break forward_join_59;
    }
    spill3540_1 = this;
    if (!((life3_5 == null))) {
        forwardValue3540_60_0 = spill3540_1;
        break forward_join_60;
    }
    if (!(((net.minecraft.entity.monster.EntityGuardian)(((moom.fV)(spill3540_1)).k)).ae())) {
        break forward_join_59;
    }
    ((moom.fV)(this)).d = ((float)(((float) ((net.minecraft.entity.monster.EntityGuardian)(this.k)).n)));
    ((moom.fV)(this)).e = ((float)(((float) ((net.minecraft.entity.monster.EntityGuardian)(this.k)).o)));
    ((moom.fV)(this)).f = ((float)(((float) ((net.minecraft.entity.monster.EntityGuardian)(this.k)).p)));
    life4_49 = ((net.minecraft.entity.monster.EntityGuardian)(this.k)).e__sourceReturn_f6c4892e39(((float)(0x0.0p0f)));
    ((moom.fV)(this)).b = ((float)((0x0.0p0f + ((0x1.0p0f * life4_49) * life4_49))));
    ((moom.fV)(this)).c = ((float)((0x1.666666p-1f + (0x1.0p-1f * life4_49))));
    if (!((life3_5 != null))) {
        break forward_join_62;
    }
    }
    forwardValue3540_60_0 = this;
    }
    ((moom.fV)(forwardValue3540_60_0)).j = ((boolean)(true));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
