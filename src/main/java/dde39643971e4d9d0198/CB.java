package moom;


public class CB extends moom.CA {

private int i;

private boolean j;

private static final long l;

public CB(double p0, double p1, double p2, double p3, double p4, double p5) {
super(p0, p1, p2, p3, p4, p5);
    this.i = -1;
    this.j = false;
}


static {
l = (moom._c.a(-250579056546328592L, -6282868672503993087L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(260437698922358L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.client.renderer.culling.ICamera p0, int p1) {
moom.CB forwardValue1577_33_0;
    int forwardValue1577_33_1;
    moom.CB forwardValue1577_37_0;
    int forwardValue1577_37_1;
    moom.CB forwardValue1577_38_0;
    moom.CB forwardValue1577_39_0;
    int forwardValue1577_39_1;
    int forwardValue1577_45_0;
    int spill1577_0;
    moom.CB spill1577_1;
    int spill1577_2;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_45: {
    forward_join_43: {
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_33: {
    life3_3 = (moom.CB.l ^ 23044799058187L);
    life5_5 = moom.Mi.b__Arrayr3();
    spill1577_0 = this.i;
    if (!((life5_5 == null))) {
        forwardValue1577_45_0 = spill1577_0;
        break forward_join_45;
    }
    if (!((spill1577_0 != p1))) {
        break forward_join_43;
    }
    spill1577_1 = this;
    spill1577_2 = ((p0 instanceof net.minecraft.client.renderer.culling.Frustum) ? 1 : 0);
    if (!((life5_5 == null))) {
        forwardValue1577_33_0 = spill1577_1;
        forwardValue1577_33_1 = spill1577_2;
        break forward_join_33;
    }
    if (!((spill1577_2 != 0))) {
        forwardValue1577_38_0 = spill1577_1;
        break forward_join_38;
    }
    forwardValue1577_33_0 = spill1577_1;
    forwardValue1577_33_1 = ((((net.minecraft.client.renderer.culling.Frustum)(((net.minecraft.client.renderer.culling.Frustum)(p0)))).b(((double)(((moom.CB)(this)).b)), ((double)(((moom.CB)(this)).c)), ((double)(((moom.CB)(this)).d)), ((double)(((moom.CB)(this)).e)), ((double)(((moom.CB)(this)).f)), ((double)(((moom.CB)(this)).g)))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue1577_37_0 = forwardValue1577_33_0;
        forwardValue1577_37_1 = forwardValue1577_33_1;
        break forward_join_37;
    }
    if (!((forwardValue1577_33_1 != 0))) {
        forwardValue1577_38_0 = forwardValue1577_33_0;
        break forward_join_38;
    }
    forwardValue1577_37_0 = forwardValue1577_33_0;
    forwardValue1577_37_1 = 1;
    }
    forwardValue1577_39_0 = forwardValue1577_37_0;
    forwardValue1577_39_1 = forwardValue1577_37_1;
    break forward_join_39;
    }
    forwardValue1577_39_0 = forwardValue1577_38_0;
    forwardValue1577_39_1 = 0;
    }
    ((moom.CB)(forwardValue1577_39_0)).j = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1577_39_1)));
    this.i = ((int)(p1));
    }
    forwardValue1577_45_0 = ((this.j) ? 1 : 0);
    }
    return ((forwardValue1577_45_0) != 0);
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
