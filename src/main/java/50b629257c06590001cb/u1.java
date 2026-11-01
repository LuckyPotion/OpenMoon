package moom;


public class u1 extends moom.uR {

moom.sS i;

net.minecraft.entity.EntityLivingBase j;

private int k;

private static final long l;

public u1(moom.sS p0) {
super(p0, false);
    this.i = p0;
    (this).a(1);
}


static {
l = (moom._c.a(-4058842424596583691L, 3919942364839721612L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(238481123492522L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
net.minecraft.entity.EntityLivingBase forwardValue4115_17_0;
    net.minecraft.entity.EntityLivingBase forwardValue4115_29_0;
    int forwardValue4115_42_0;
    int forwardValue4115_51_0;
    int forwardValue4115_55_0;
    int forwardValue4115_57_0;
    moom.sS spill4115_0;
    net.minecraft.entity.EntityLivingBase spill4115_1;
    int spill4115_2;
    long life1_3;
    int life3_5;
    net.minecraft.entity.EntityLivingBase life4_22;
    int life5_40;
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_51: {
    forward_join_42: {
    forward_join_29: {
    forward_join_24: {
    forward_join_17: {
    forward_join_14: {
    life1_3 = (moom.u1.l ^ 91509122430581L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4115_0 = this.i;
    if (!((life3_5 != 0))) {
        forwardValue4115_17_0 = spill4115_0;
        break forward_join_17;
    }
    if (!((!((moom.sS)(spill4115_0)).ae()))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue4115_17_0 = ((moom.sS)(this.i)).e__sourceReturn_d30556f370();
    }
    life4_22 = forwardValue4115_17_0;
    spill4115_1 = life4_22;
    if (!((life3_5 != 0))) {
        forwardValue4115_29_0 = spill4115_1;
        break forward_join_29;
    }
    if (!((spill4115_1 == null))) {
        break forward_join_24;
    }
    return ((0) != 0);
    }
    this.j = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(life4_22)).a__sG()));
    forwardValue4115_29_0 = life4_22;
    }
    life5_40 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4115_29_0)).a__Int();
    spill4115_2 = life5_40;
    if (!((life3_5 != 0))) {
        forwardValue4115_42_0 = spill4115_2;
        break forward_join_42;
    }
    if (!((spill4115_2 != this.k))) {
        break forward_join_56;
    }
    forwardValue4115_42_0 = ((((moom.u1)(this)).a(((net.minecraft.entity.EntityLivingBase)(this.j)), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4115_51_0 = forwardValue4115_42_0;
        break forward_join_51;
    }
    if (!((forwardValue4115_42_0 != 0))) {
        break forward_join_56;
    }
    forwardValue4115_51_0 = ((((moom.sS)(this.i)).a(((net.minecraft.entity.EntityLivingBase)(this.j)), ((net.minecraft.entity.EntityLivingBase)(life4_22)))) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4115_55_0 = forwardValue4115_51_0;
        break forward_join_55;
    }
    if (!((forwardValue4115_51_0 != 0))) {
        break forward_join_56;
    }
    forwardValue4115_55_0 = 1;
    }
    forwardValue4115_57_0 = forwardValue4115_55_0;
    break forward_join_57;
    }
    forwardValue4115_57_0 = 0;
    }
    return ((forwardValue4115_57_0) != 0);
}


public void a__Void() {
long local1 = (moom.u1.l ^ 93554579000905L);
    boolean spill7587_0 = moom.uc.e();
    ((moom.sI)(((moom.u1)(this)).c)).c(((net.minecraft.entity.EntityLivingBase)(this.j)));
    boolean local3 = spill7587_0;
    net.minecraft.entity.EntityLivingBase local4 = ((moom.sS)(this.i)).e__sourceReturn_d30556f370();
    if ((!local3)) {
        if ((local4 != null)) {
        this.k = ((int)(((net.minecraft.entity.EntityLivingBase)(local4)).a__Int()));
    }
        super.a__Void();
    }
    return;
}

}
