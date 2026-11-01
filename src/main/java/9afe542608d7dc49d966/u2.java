package moom;


public class u2 extends moom.uR {

moom.sS i;

net.minecraft.entity.EntityLivingBase j;

private int k;

private static final long l;

public u2(moom.sS p0) {
super(p0, false);
    this.i = p0;
    (this).a(1);
}


static {
l = (moom._c.a(4672079383599162277L, 9114562213019423660L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(158445210920099L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
net.minecraft.entity.EntityLivingBase forwardValue4116_17_0;
    net.minecraft.entity.EntityLivingBase forwardValue4116_29_0;
    int forwardValue4116_42_0;
    int forwardValue4116_51_0;
    int forwardValue4116_55_0;
    int forwardValue4116_57_0;
    moom.sS spill4116_0;
    net.minecraft.entity.EntityLivingBase spill4116_1;
    int spill4116_2;
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
    life1_3 = (moom.u2.l ^ 114114047860281L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4116_0 = this.i;
    if (!((life3_5 != 0))) {
        forwardValue4116_17_0 = spill4116_0;
        break forward_join_17;
    }
    if (!((!((moom.sS)(spill4116_0)).ae()))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue4116_17_0 = ((moom.sS)(this.i)).e__sourceReturn_d30556f370();
    }
    life4_22 = forwardValue4116_17_0;
    spill4116_1 = life4_22;
    if (!((life3_5 != 0))) {
        forwardValue4116_29_0 = spill4116_1;
        break forward_join_29;
    }
    if (!((spill4116_1 == null))) {
        break forward_join_24;
    }
    return ((0) != 0);
    }
    this.j = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(life4_22)).b__sG()));
    forwardValue4116_29_0 = life4_22;
    }
    life5_40 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4116_29_0)).b__Int();
    spill4116_2 = life5_40;
    if (!((life3_5 != 0))) {
        forwardValue4116_42_0 = spill4116_2;
        break forward_join_42;
    }
    if (!((spill4116_2 != this.k))) {
        break forward_join_56;
    }
    forwardValue4116_42_0 = ((((moom.u2)(this)).a(((net.minecraft.entity.EntityLivingBase)(this.j)), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4116_51_0 = forwardValue4116_42_0;
        break forward_join_51;
    }
    if (!((forwardValue4116_42_0 != 0))) {
        break forward_join_56;
    }
    forwardValue4116_51_0 = ((((moom.sS)(this.i)).a(((net.minecraft.entity.EntityLivingBase)(this.j)), ((net.minecraft.entity.EntityLivingBase)(life4_22)))) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4116_55_0 = forwardValue4116_51_0;
        break forward_join_55;
    }
    if (!((forwardValue4116_51_0 != 0))) {
        break forward_join_56;
    }
    forwardValue4116_55_0 = 1;
    }
    forwardValue4116_57_0 = forwardValue4116_55_0;
    break forward_join_57;
    }
    forwardValue4116_57_0 = 0;
    }
    return ((forwardValue4116_57_0) != 0);
}


public void a__Void() {
long life1_3;
    net.minecraft.entity.EntityLivingBase life4_13;
    int life3_14;
    life1_3 = (moom.u2.l ^ 107637258053125L);
    ((moom.sI)(((moom.u2)(this)).c)).c(((net.minecraft.entity.EntityLivingBase)(this.j)));
    boolean spill7513_0 = moom.uc.d();
    life4_13 = ((moom.sS)(this.i)).e__sourceReturn_d30556f370();
    life3_14 = ((spill7513_0) ? 1 : 0);
    if ((life3_14 != 0)) {
        if ((life4_13 != null)) {
        this.k = ((int)(((net.minecraft.entity.EntityLivingBase)(life4_13)).b__Int()));
    }
        super.a__Void();
    }
    return;
}

}
