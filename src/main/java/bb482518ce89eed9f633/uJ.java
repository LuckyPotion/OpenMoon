package moom;


public class uJ extends moom.uc {

private final moom.sI c;

protected double d;

private double e;

private double f;

private double g;

private static final long i;

public uJ(moom.sI p0, double p1) {
super();
    this.c = p0;
    this.d = p1;
    (this).a(1);
}


static {
i = (moom._c.a(3133722966626276749L, 2075854139598045352L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(120407492248376L);
}


public boolean b__Boolean() {
int forwardValue4164_14_0;
    int forwardValue4164_16_0;
    boolean spill4164_0;
    long life1_3;
    int life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (moom.uJ.i ^ 94000668123225L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4164_0 = ((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4164_14_0 = ((spill4164_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill4164_0))) {
        break forward_join_15;
    }
    forwardValue4164_14_0 = 1;
    }
    forwardValue4164_16_0 = forwardValue4164_14_0;
    break forward_join_16;
    }
    forwardValue4164_16_0 = 0;
    }
    return ((forwardValue4164_16_0) != 0);
}


public void a__Void() {
((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a(((double)(this.e)), ((double)(this.f)), ((double)(this.g)), ((double)(this.d)));
    return;
}


public boolean a__Boolean() {
moom.sI forwardValue4163_22_0;
    moom.sI spill4163_0;
    moom.sI spill4163_1;
    long life1_3;
    int life3_5;
    moom.DR life4_36;
    forward_join_44: {
    forward_join_32: {
    forward_join_22: {
    forward_join_20: {
    life1_3 = (moom.uJ.i ^ 67951953725640L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4163_0 = this.c;
    if (!((life3_5 == 0))) {
        forwardValue4163_22_0 = spill4163_0;
        break forward_join_22;
    }
    if (!((((moom.sI)(spill4163_0)).a__sG() == null))) {
        break forward_join_20;
    }
    spill4163_1 = this.c;
    if (!((life3_5 == 0))) {
        forwardValue4163_22_0 = spill4163_1;
        break forward_join_22;
    }
    if (!((!((moom.sI)(spill4163_1)).r__Boolean()))) {
        break forward_join_20;
    }
    return ((0) != 0);
    }
    forwardValue4163_22_0 = this.c;
    }
    life4_36 = moom.vA.a(((moom.sI)(forwardValue4163_22_0)), ((int)(5)), ((int)(4)));
    if (!((life3_5 == 0))) {
        break forward_join_44;
    }
    if (!((life4_36 == null))) {
        break forward_join_32;
    }
    return ((0) != 0);
    }
    this.e = ((double)(((moom.DR)(life4_36)).a));
    this.f = ((double)(((moom.DR)(life4_36)).b));
    this.g = ((double)(((moom.DR)(life4_36)).c));
    }
    return ((1) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
