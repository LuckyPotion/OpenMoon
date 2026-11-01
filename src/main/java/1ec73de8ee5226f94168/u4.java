package moom;


public class u4 extends moom.uc {

private final net.minecraft.entity.passive.EntityVillager c;

private static final long d;

public u4(net.minecraft.entity.passive.EntityVillager p0) {
super();
    this.c = p0;
    (this).a(5);
}


static {
d = (moom._c.a(-8685032515266097020L, 7296349663092695576L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(197809452696597L);
}


public void b__Void() {
((net.minecraft.entity.passive.EntityVillager)(this.c)).a__Void(((net.minecraft.entity.player.EntityPlayer)(null)));
    return;
}


public void a__Void() {
((moom.AV)(((net.minecraft.entity.passive.EntityVillager)(this.c)).a__sourceReturn_407923443b())).c();
    return;
}


public boolean a__Boolean() {
int forwardValue4120_17_0;
    int forwardValue4120_25_0;
    int forwardValue4120_35_0;
    net.minecraft.entity.passive.EntityVillager forwardValue4120_40_0;
    int forwardValue4120_56_0;
    int forwardValue4120_60_0;
    int forwardValue4120_62_0;
    boolean spill4120_0;
    net.minecraft.entity.passive.EntityVillager spill4120_1;
    int spill4120_2;
    long life1_3;
    int life3_5;
    net.minecraft.entity.player.EntityPlayer life4_61;
    forward_join_62: {
    forward_join_61: {
    forward_join_60: {
    forward_join_56: {
    forward_join_40: {
    forward_join_38: {
    forward_join_35: {
    forward_join_30: {
    forward_join_25: {
    forward_join_22: {
    forward_join_17: {
    forward_join_14: {
    life1_3 = (moom.u4.d ^ 125720702894290L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4120_0 = ((net.minecraft.entity.passive.EntityVillager)(this.c)).p__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4120_17_0 = ((spill4120_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill4120_0))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue4120_17_0 = ((((net.minecraft.entity.passive.EntityVillager)(this.c)).j__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4120_25_0 = forwardValue4120_17_0;
        break forward_join_25;
    }
    if (!((forwardValue4120_17_0 != 0))) {
        break forward_join_22;
    }
    return ((0) != 0);
    }
    forwardValue4120_25_0 = ((((net.minecraft.entity.passive.EntityVillager)(this.c)).A) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4120_35_0 = forwardValue4120_25_0;
        break forward_join_35;
    }
    if (!((forwardValue4120_25_0 == 0))) {
        break forward_join_30;
    }
    return ((0) != 0);
    }
    spill4120_1 = this.c;
    if (!((life3_5 != 0))) {
        forwardValue4120_40_0 = spill4120_1;
        break forward_join_40;
    }
    forwardValue4120_35_0 = ((((net.minecraft.entity.passive.EntityVillager)(spill4120_1)).E) ? 1 : 0);
    }
    if (!((forwardValue4120_35_0 != 0))) {
        break forward_join_38;
    }
    return ((0) != 0);
    }
    forwardValue4120_40_0 = this.c;
    }
    life4_61 = ((net.minecraft.entity.passive.EntityVillager)(forwardValue4120_40_0)).a__tn();
    if (!((life4_61 != null))) {
        break forward_join_61;
    }
    spill4120_2 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.passive.EntityVillager)(this.c)).a(((net.minecraft.entity.Entity)(life4_61))))), ((double)(0x1.0p4d)));
    if (!((life3_5 != 0))) {
        forwardValue4120_56_0 = spill4120_2;
        break forward_join_56;
    }
    if (!((spill4120_2 <= 0))) {
        break forward_join_61;
    }
    forwardValue4120_56_0 = ((((net.minecraft.entity.player.EntityPlayer)(life4_61)).bG instanceof moom.v8) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4120_60_0 = forwardValue4120_56_0;
        break forward_join_60;
    }
    if (!((forwardValue4120_56_0 != 0))) {
        break forward_join_61;
    }
    forwardValue4120_60_0 = 1;
    }
    forwardValue4120_62_0 = forwardValue4120_60_0;
    break forward_join_62;
    }
    forwardValue4120_62_0 = 0;
    }
    return ((forwardValue4120_62_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
