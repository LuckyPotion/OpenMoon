package moom;


public class DL<T> {

private final T[] a;

private final java.lang.Class<? extends T> b;

private final java.util.concurrent.locks.ReadWriteLock c;

private int d;

private int e;

private static final long f;

public DL(java.lang.Class<? extends T> p0, int p1) {
super();
    this.c = new java.util.concurrent.locks.ReentrantReadWriteLock();
    this.b = p0;
    this.a = (((T[])((java.lang.Object[]) (java.lang.reflect.Array.newInstance(p0, p1)))));
}


static {
f = (moom._c.a(8147707072994640285L, -8624014447932618068L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(89364082064102L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public T[] a__ArrayObject() {
boolean spill554_0;
    long life1_3;
    java.lang.Object[] life4_10;
    int life5_17;
    int life3_18;
    int life6_33;
    lexical_join_59: {
    lexical_join_55: {
    life1_3 = (moom.DL.f ^ 77417077381284L);
    life4_10 = ((java.lang.Object[])(java.lang.reflect.Array.newInstance(((java.lang.Class)(this.b)), ((int)(this.d)))));
    spill554_0 = moom.DS.c__Boolean();
    ((java.util.concurrent.locks.Lock)(((java.util.concurrent.locks.ReadWriteLock)(this.c)).readLock())).lock();
    life5_17 = 0;
    life3_18 = ((spill554_0) ? 1 : 0);
    lexical_cycle_19: while (true) {
    lexical_join_53: {
    lexical_join_45: {
    if (!((life5_17 < this.d))) {
        break lexical_join_55;
    }
    life6_33 = (((this.e - this.d) + life5_17) % this.a());
    if (!((life3_18 != 0))) {
        break lexical_join_59;
    }
    if (!((life3_18 != 0))) {
        break lexical_join_53;
    }
    if (!((life6_33 < 0))) {
        break lexical_join_45;
    }
    life6_33 = (life6_33 + this.a());
    }
    (life4_10)[life5_17] = (this.a)[life6_33];
    life5_17 += 1;
    }
    if (!((life3_18 == 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    ((java.util.concurrent.locks.Lock)(((java.util.concurrent.locks.ReadWriteLock)(this.c)).readLock())).unlock();
    }
    return ((T[])(life4_10));
}


public int a() {
((java.util.concurrent.locks.Lock)(((java.util.concurrent.locks.ReadWriteLock)(this.c)).readLock())).lock();
    int local1 = (this.a).length;
    ((java.util.concurrent.locks.Lock)(((java.util.concurrent.locks.ReadWriteLock)(this.c)).readLock())).unlock();
    return local1;
}


public T a(T p0) {
java.lang.Object forwardValue194_43_0;
    boolean spill194_0;
    moom.DL spill194_1;
    long life2_3;
    int life4_15;
    forward_join_43: {
    forward_join_38: {
    life2_3 = (moom.DL.f ^ 47002293853035L);
    spill194_0 = moom.DS.b__Boolean();
    ((java.util.concurrent.locks.Lock)(((java.util.concurrent.locks.ReadWriteLock)(this.c)).writeLock())).lock();
    (this.a)[this.e] = p0;
    life4_15 = ((spill194_0) ? 1 : 0);
    this.e = ((int)(((this.e + 1) % this.a())));
    spill194_1 = this;
    if (!((life4_15 == 0))) {
        forwardValue194_43_0 = spill194_1;
        break forward_join_43;
    }
    if (!((((moom.DL)(spill194_1)).d < this.a()))) {
        break forward_join_38;
    }
    moom.DL __stackOp194_13_0 = this;
    ((moom.DL)(__stackOp194_13_0)).d = ((int)((((moom.DL)(__stackOp194_13_0)).d + 1)));
    }
    ((java.util.concurrent.locks.Lock)(((java.util.concurrent.locks.ReadWriteLock)(this.c)).writeLock())).unlock();
    forwardValue194_43_0 = p0;
    }
    return ((T)(forwardValue194_43_0));
}

}
