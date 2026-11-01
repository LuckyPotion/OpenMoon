package moom;


public class Ea {

private final moom.DT a;

private final moom.DT b;

private final moom.bs c;

private int d;

private boolean e;

private int f;

private static final long g;

public Ea(moom.DT p0, int p1, int p2, int p3) {
this(p0, moom.Ea.a(p1, p2), p3);
}


public Ea(moom.DT p0, moom.bs p1, int p2) {
super();
    this.a = p0;
    this.c = p1;
    this.b = (p0).a(p1, 2);
    this.d = p2;
}


static {
g = (moom._c.a(-8858140348105938636L, -4010106385488289952L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(278501859743535L);
}


public moom.DT b__DT() {
return this.b;
}


public void b__Void() {
this.f += 1;
    return;
}


public int b() {
return (((moom.bs)(this.c)).c() * 2);
}


public int b(moom.DT p0) {
return ((int) ((moom.DT)(this.b)).a(((moom.DS)(p0))));
}


public int c() {
return (((moom.bs)(this.c)).e() * 2);
}


public int d() {
return this.d;
}


public boolean a__Boolean() {
return ((((this.e) ? 1 : 0)) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0) {
this.d = ((int)(p0));
    return;
}


public void a(boolean p0) {
this.e = ((boolean)(p0));
    return;
}


public boolean a__Boolean(moom.DT p0) {
int forwardValue1828_35_0;
    int forwardValue1828_37_0;
    boolean spill1828_0;
    int spill1828_1;
    long life2_3;
    int life5_11;
    int life6_18;
    int life4_19;
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    life2_3 = (moom.Ea.g ^ 114058652117098L);
    spill1828_0 = net.minecraft.village.MerchantRecipe.e();
    life5_11 = (((moom.DT)(p0)).a() - ((moom.DT)(this.a)).a());
    life6_18 = (((moom.DT)(p0)).c() - ((moom.DT)(this.a)).b());
    life4_19 = ((spill1828_0) ? 1 : 0);
    spill1828_1 = ((life5_11 * ((moom.bs)(this.c)).c()) + (life6_18 * ((moom.bs)(this.c)).e()));
    if (!((life4_19 != 0))) {
        forwardValue1828_35_0 = spill1828_1;
        break forward_join_35;
    }
    if (!((spill1828_1 >= 0))) {
        break forward_join_36;
    }
    forwardValue1828_35_0 = 1;
    }
    forwardValue1828_37_0 = forwardValue1828_35_0;
    break forward_join_37;
    }
    forwardValue1828_37_0 = 0;
    }
    return ((forwardValue1828_37_0) != 0);
}


public int a(moom.DT p0) {
return ((int) ((moom.DT)(p0)).a(((moom.DS)(((moom.Ea)(this)).a__DT()))));
}


public int a(int p0, int p1, int p2) {
return ((int) ((moom.DT)(this.a)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(((double) p2)))));
}


private static moom.bs a(int p0, int p1) {
int forwardValue1827_13_0;
    int forwardValue1827_19_0;
    moom.bs forwardValue1827_23_0;
    int spill1827_0;
    long life2_3;
    int life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (moom.Ea.g ^ 89411048730491L);
    life4_5 = ((net.minecraft.village.MerchantRecipe.d()) ? 1 : 0);
    spill1827_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1827_13_0 = spill1827_0;
        break forward_join_13;
    }
    if (!((spill1827_0 < 0))) {
        break forward_join_12;
    }
    forwardValue1827_23_0 = moom.bs.WEST;
    break forward_join_23;
    }
    forwardValue1827_13_0 = p0;
    }
    if (!((life4_5 == 0))) {
        forwardValue1827_19_0 = forwardValue1827_13_0;
        break forward_join_19;
    }
    if (!((forwardValue1827_13_0 > 0))) {
        break forward_join_18;
    }
    forwardValue1827_23_0 = moom.bs.EAST;
    break forward_join_23;
    }
    forwardValue1827_19_0 = p1;
    }
    if (!((forwardValue1827_19_0 < 0))) {
        break forward_join_22;
    }
    forwardValue1827_23_0 = moom.bs.NORTH;
    break forward_join_23;
    }
    forwardValue1827_23_0 = moom.bs.SOUTH;
    }
    return forwardValue1827_23_0;
}


public void a__Void() {
this.f = ((int)(0));
    return;
}


public int a() {
return this.f;
}


public moom.DT a__DT() {
return this.a;
}

}
