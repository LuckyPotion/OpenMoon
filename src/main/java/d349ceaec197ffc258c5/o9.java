package moom;


public class o9 {

private final int a;

private final int b;

private static final long c;

public o9(int p0) {
this(p0, -1);
}


public o9(int p0, int p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = (moom._c.a(515858830588038197L, -2325830420938468864L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(157529727024895L);
}


public int b() {
return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.b;
}


public boolean a__Boolean() {
int forwardValue3797_13_0;
    int forwardValue3797_15_0;
    int spill3797_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.o9.c ^ 62773198873102L);
    life3_5 = moom.pa.b();
    spill3797_0 = this.b;
    if (!((life3_5 == 0))) {
        forwardValue3797_13_0 = spill3797_0;
        break forward_join_13;
    }
    if (!((spill3797_0 == -1))) {
        break forward_join_14;
    }
    forwardValue3797_13_0 = 1;
    }
    forwardValue3797_15_0 = forwardValue3797_13_0;
    break forward_join_15;
    }
    forwardValue3797_15_0 = 0;
    }
    return ((forwardValue3797_15_0) != 0);
}

}
