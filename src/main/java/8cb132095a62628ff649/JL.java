package moom;


public class JL {

public long a;

public long b;

private static final long c;

public JL() {
super();
    this.a = 0L;
    this.b = 0L;
}


static {
c = (moom._c.a(-495212630446262992L, -8052942721788070159L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(29892112811487L);
}


public void b() {
int forwardValue2296_16_0;
    moom.JL forwardValue2296_27_0;
    boolean spill2296_0;
    moom.JL spill2296_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_29: {
    forward_join_27: {
    forward_join_16: {
    life1_3 = (moom.JL.c ^ 98738966967509L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2296_0 = moom.JK.d;
    if (!((life3_5 != null))) {
        forwardValue2296_16_0 = ((spill2296_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill2296_0)) {
        break forward_join_29;
    }
    spill2296_1 = this;
    if (!((life3_5 != null))) {
        forwardValue2296_27_0 = spill2296_1;
        break forward_join_27;
    }
    forwardValue2296_16_0 = recovery.source.CarrierOps.lcmp(((long)(((moom.JL)(spill2296_1)).a)), ((long)(0L)));
    }
    if (!((forwardValue2296_16_0 != 0))) {
        break forward_join_29;
    }
    moom.JL __stackOp2296_6_0 = this;
    ((moom.JL)(__stackOp2296_6_0)).b = ((long)((((moom.JL)(__stackOp2296_6_0)).b + (java.lang.System.nanoTime() - this.a))));
    forwardValue2296_27_0 = this;
    }
    ((moom.JL)(forwardValue2296_27_0)).a = ((long)(0L));
    }
    return;
}


private void c() {
this.b = ((long)(0L));
    this.a = ((long)(0L));
    return;
}


public void a() {
int forwardValue2295_16_0;
    moom.JL forwardValue2295_18_0;
    boolean spill2295_0;
    moom.JL spill2295_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_20: {
    forward_join_18: {
    forward_join_16: {
    life1_3 = (moom.JL.c ^ 138179388393684L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2295_0 = moom.JK.d;
    if (!((life3_5 != null))) {
        forwardValue2295_16_0 = ((spill2295_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill2295_0)) {
        break forward_join_20;
    }
    spill2295_1 = this;
    if (!((life3_5 != null))) {
        forwardValue2295_18_0 = spill2295_1;
        break forward_join_18;
    }
    forwardValue2295_16_0 = recovery.source.CarrierOps.lcmp(((long)(((moom.JL)(spill2295_1)).a)), ((long)(0L)));
    }
    if (!((forwardValue2295_16_0 == 0))) {
        break forward_join_20;
    }
    forwardValue2295_18_0 = this;
    }
    ((moom.JL)(forwardValue2295_18_0)).a = ((long)(java.lang.System.nanoTime()));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
