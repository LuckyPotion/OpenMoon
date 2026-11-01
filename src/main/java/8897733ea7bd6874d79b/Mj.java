package moom;


public class Mj {

private int a;

private int b;

private final moom.NY<moom.Mj> c;

private static final long d;

public Mj() {
super();
    this.a = -1;
    this.b = 0;
    this.c = new moom.NY(this);
}


static {
d = (moom._c.a(6680086833139252609L, -3704444889132299572L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(65945932306727L);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1323_4(this.a, this.b, (this.a + this.b));
}


public moom.Mj b__Mj() {
java.lang.Object forwardValue2733_18_0;
    moom.Mj forwardValue2733_19_0;
    net.minecraft.entity.Entity[] spill2733_0;
    moom.NY spill2733_1;
    long life1_3;
    moom.NY life4_8;
    net.minecraft.entity.Entity[] life3_9;
    forward_join_19: {
    forward_join_18: {
    forward_join_16: {
    life1_3 = (moom.Mj.d ^ 126563196030380L);
    spill2733_0 = moom.Mi.b__Arrayr3();
    life4_8 = ((moom.NY)(this.c)).b();
    life3_9 = spill2733_0;
    spill2733_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue2733_18_0 = spill2733_1;
        break forward_join_18;
    }
    if (!((spill2733_1 == null))) {
        break forward_join_16;
    }
    forwardValue2733_19_0 = null;
    break forward_join_19;
    }
    forwardValue2733_18_0 = ((moom.NY)(life4_8)).a();
    }
    forwardValue2733_19_0 = ((moom.Mj)(forwardValue2733_18_0));
    }
    return forwardValue2733_19_0;
}


public void b(int p0) {
this.b = ((int)(p0));
    return;
}


public int b() {
return this.b;
}


public int c() {
return (this.a + this.b);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.a;
}


public void a(int p0) {
this.a = ((int)(p0));
    return;
}


public moom.NY<moom.Mj> a__NY() {
return this.c;
}


public moom.Mj a__Mj() {
java.lang.Object forwardValue2732_18_0;
    moom.Mj forwardValue2732_19_0;
    net.minecraft.entity.Entity[] spill2732_0;
    moom.NY spill2732_1;
    long life1_3;
    moom.NY life4_8;
    net.minecraft.entity.Entity[] life3_9;
    forward_join_19: {
    forward_join_18: {
    forward_join_16: {
    life1_3 = (moom.Mj.d ^ 61839380816504L);
    spill2732_0 = moom.Mi.b__Arrayr3();
    life4_8 = ((moom.NY)(this.c)).a__NY();
    life3_9 = spill2732_0;
    spill2732_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue2732_18_0 = spill2732_1;
        break forward_join_18;
    }
    if (!((spill2732_1 == null))) {
        break forward_join_16;
    }
    forwardValue2732_19_0 = null;
    break forward_join_19;
    }
    forwardValue2732_18_0 = ((moom.NY)(life4_8)).a();
    }
    forwardValue2732_19_0 = ((moom.Mj)(forwardValue2732_18_0));
    }
    return forwardValue2732_19_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1323_4(int a0, int a1, int a2) throws E;
}
