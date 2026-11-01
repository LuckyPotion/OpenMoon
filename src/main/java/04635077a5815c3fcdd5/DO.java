package moom;


class DO extends moom.DN<java.lang.Integer, java.lang.Integer> {

private static final long a;

public DO(int p0, int p1) {
super(java.lang.Integer.valueOf(p0), java.lang.Integer.valueOf(p1));
}


static {
a = (moom._c.a(-1813986779531189416L, 649620851754387656L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(181450753374532L);
}


public int a(java.util.Random p0) {
int forwardValue1696_39_0;
    int forwardValue1696_39_1;
    int forwardValue1696_40_0;
    int spill1696_0;
    int spill1696_1;
    long life2_3;
    int life4_5;
    forward_join_40: {
    forward_join_39: {
    forward_join_22: {
    life2_3 = (moom.DO.a ^ 14947601650282L);
    life4_5 = moom.vR.b();
    spill1696_0 = ((java.lang.Integer)(((java.lang.Integer)(this.a())))).intValue();
    spill1696_1 = ((java.lang.Integer)(((java.lang.Integer)(((moom.DO)(this)).b())))).intValue();
    if (!((life4_5 != 0))) {
        forwardValue1696_39_0 = spill1696_0;
        forwardValue1696_39_1 = spill1696_1;
        break forward_join_39;
    }
    if (!((spill1696_0 >= spill1696_1))) {
        break forward_join_22;
    }
    forwardValue1696_40_0 = ((java.lang.Integer)(((java.lang.Integer)(this.a())))).intValue();
    break forward_join_40;
    }
    forwardValue1696_39_0 = ((java.lang.Integer)(((java.lang.Integer)(this.a())))).intValue();
    forwardValue1696_39_1 = ((java.util.Random)(p0)).nextInt(((int)(((((java.lang.Integer)(((java.lang.Integer)(((moom.DO)(this)).b())))).intValue() - ((java.lang.Integer)(((java.lang.Integer)(this.a())))).intValue()) + 1))));
    }
    forwardValue1696_40_0 = (forwardValue1696_39_0 + forwardValue1696_39_1);
    }
    return forwardValue1696_40_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
