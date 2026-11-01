package moom;


public class JG {

private final java.util.Map<java.lang.Integer, moom.JE> a;

private final java.util.List<moom.JE> b;

private boolean c;

private static final long d;

public JG() {
super();
    this.a = new java.util.HashMap();
    this.b = new java.util.ArrayList();
    this.c = false;
}


static {
d = (moom._c.a(2293917363438561401L, -1322734769686603296L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(70013766286157L);
}


public moom.JE b(int p0) {
moom.JE forwardValue2288_20_0;
    net.minecraft.entity.Entity[] spill2288_0;
    moom.JE spill2288_1;
    long life2_3;
    moom.JE life5_11;
    net.minecraft.entity.Entity[] life4_12;
    forward_join_20: {
    forward_join_19: {
    life2_3 = (moom.JG.d ^ 1312852902811L);
    spill2288_0 = moom.JM.b__Arrayr3();
    life5_11 = ((moom.JE)(((java.util.Map)(this.a)).remove(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))))));
    life4_12 = spill2288_0;
    spill2288_1 = life5_11;
    if (!((life4_12 != null))) {
        forwardValue2288_20_0 = spill2288_1;
        break forward_join_20;
    }
    if (!((spill2288_1 != null))) {
        break forward_join_19;
    }
    this.b();
    }
    forwardValue2288_20_0 = life5_11;
    }
    return forwardValue2288_20_0;
}


private void b() {
this.c = ((boolean)(true));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.List<moom.JE> a__List() {
moom.JG forwardValue2287_25_0;
    moom.JG spill2287_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_25: {
    forward_join_24: {
    life1_3 = (moom.JG.d ^ 80307083758264L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2287_0 = this;
    if (!((life3_5 != null))) {
        forwardValue2287_25_0 = spill2287_0;
        break forward_join_25;
    }
    if (!(((moom.JG)(spill2287_0)).c)) {
        break forward_join_24;
    }
    ((java.util.List)(this.b)).clear();
    ((java.util.List)(this.b)).addAll(((java.util.Collection)(((java.util.Map)(this.a)).values())));
    this.c = ((boolean)(false));
    }
    forwardValue2287_25_0 = this;
    }
    return ((moom.JG)(forwardValue2287_25_0)).b;
}


public moom.JE a(int p0, moom.JE p1) {
java.lang.Object local3 = ((moom.JE)(((java.util.Map)(this.a)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))), ((java.lang.Object)(p1)))));
    this.b();
    return ((moom.JE)(local3));
}


public moom.JE a(int p0) {
return ((moom.JE)(((java.util.Map)(this.a)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))))));
}


public int a() {
return ((java.util.Map)(this.a)).size();
}


public void a__Void() {
((java.util.Map)(this.a)).clear();
    ((java.util.List)(this.b)).clear();
    this.b();
    return;
}

}
