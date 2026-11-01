package moom;


public class pz implements java.lang.Comparable<moom.pz> {

private static final java.util.List<moom.pz> a;

private static final moom.Dd<moom.pz> b;

private static final java.util.Set<java.lang.String> c;

private final java.lang.String d;

private final int e;

private final java.lang.String f;

private int g;

private boolean h;

private int i;

private static final long j;

public pz(java.lang.String p0, int p1, java.lang.String p2) {
super();
    this.d = p0;
    this.g = p1;
    this.e = p1;
    this.f = p2;
    (moom.pz.a).add(this);
    (moom.pz.b).a(p1, this);
    (moom.pz.c).add(p2);
}


static {
moom.pz.j = (moom._c.a(-5130847412390983880L, 982577448064466629L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(113483658603925L);
    moom.pz.a = com.google.common.collect.Lists.newArrayList();
    moom.pz.b = new moom.Dd();
    moom.pz.c = com.google.common.collect.Sets.newHashSet();
}


public int compareTo__sourceBridge_e47da4afb6(java.lang.Object p0) {
return ((moom.pz)(this)).a(((moom.pz)(((moom.pz)(p0)))));
}


public java.lang.String b__String() {
return this.d;
}


public int b() {
return this.g;
}


public void b(int p0) {
this.g = ((int)(p0));
    return;
}


public boolean b__Boolean() {
int forwardValue3842_20_0;
    int spill3842_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_20: {
    forward_join_13: {
    life1_3 = (moom.pz.j ^ 72891347926856L);
    life3_5 = net.minecraft.client.settings.GameSettings.b__Arrayr3();
    spill3842_0 = this.i;
    if (!((life3_5 != null))) {
        forwardValue3842_20_0 = spill3842_0;
        break forward_join_20;
    }
    if (!((spill3842_0 == 0))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    moom.pz __stackOp3842_4_0 = this;
    ((moom.pz)(__stackOp3842_4_0)).i = ((int)((((moom.pz)(__stackOp3842_4_0)).i - 1)));
    forwardValue3842_20_0 = 1;
    }
    return ((forwardValue3842_20_0) != 0);
}


public static void b(int p0, boolean p1) {
moom.pz forwardValue3841_18_0;
    moom.pz spill3841_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    moom.pz life5_12;
    forward_join_20: {
    forward_join_18: {
    life2_3 = (moom.pz.j ^ 11649457046006L);
    life4_5 = net.minecraft.client.settings.GameSettings.b__Arrayr3();
    if (!((p0 != 0))) {
        break forward_join_20;
    }
    life5_12 = ((moom.pz)(((moom.Dd)(moom.pz.b)).a__Object(((int)(p0)))));
    spill3841_0 = life5_12;
    if (!((life4_5 != null))) {
        forwardValue3841_18_0 = spill3841_0;
        break forward_join_18;
    }
    if (!((spill3841_0 != null))) {
        break forward_join_20;
    }
    forwardValue3841_18_0 = life5_12;
    }
    ((moom.pz)(forwardValue3841_18_0)).h = ((boolean)(p1));
    }
    return;
}


public static void b__Void() {
net.minecraft.entity.Entity[] spill1270_0;
    long life0_3;
    java.util.Iterator life3_9;
    net.minecraft.entity.Entity[] life2_10;
    moom.pz life4_17;
    lexical_join_25: {
    life0_3 = (moom.pz.j ^ 81266285606365L);
    spill1270_0 = net.minecraft.client.settings.GameSettings.b__Arrayr3();
    ((moom.Dd)(moom.pz.b)).a();
    life3_9 = ((java.util.List)(moom.pz.a)).iterator();
    life2_10 = spill1270_0;
    lexical_cycle_11: while (true) {
    if (!(((java.util.Iterator)(life3_9)).hasNext())) {
        break lexical_join_25;
    }
    life4_17 = ((moom.pz)(((java.util.Iterator)(life3_9)).next()));
    ((moom.Dd)(moom.pz.b)).a(((int)(((moom.pz)(life4_17)).g)), ((java.lang.Object)(life4_17)));
    if (!((life2_10 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


private void c() {
this.i = ((int)(0));
    this.h = ((boolean)(false));
    return;
}


public int a(moom.pz p0) {
int forwardValue3839_35_0;
    net.minecraft.entity.Entity[] spill3839_0;
    int spill3839_1;
    long life2_3;
    int life5_16;
    net.minecraft.entity.Entity[] life4_17;
    forward_join_35: {
    forward_join_34: {
    life2_3 = (moom.pz.j ^ 52412402001311L);
    spill3839_0 = net.minecraft.client.settings.GameSettings.b__Arrayr3();
    life5_16 = ((java.lang.String)(moom.oO.a(((java.lang.String)(this.f)), ((java.lang.Object[])(new java.lang.Object[0]))))).compareTo(((java.lang.String)(moom.oO.a(((java.lang.String)(((moom.pz)(p0)).f)), ((java.lang.Object[])(new java.lang.Object[0]))))));
    life4_17 = spill3839_0;
    spill3839_1 = life5_16;
    if (!((life4_17 != null))) {
        forwardValue3839_35_0 = spill3839_1;
        break forward_join_35;
    }
    if (!((spill3839_1 == 0))) {
        break forward_join_34;
    }
    life5_16 = ((java.lang.String)(moom.oO.a(((java.lang.String)(this.d)), ((java.lang.Object[])(new java.lang.Object[0]))))).compareTo(((java.lang.String)(moom.oO.a(((java.lang.String)(((moom.pz)(p0)).d)), ((java.lang.Object[])(new java.lang.Object[0]))))));
    }
    forwardValue3839_35_0 = life5_16;
    }
    return forwardValue3839_35_0;
}


public int a() {
return this.e;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static java.util.Set<java.lang.String> a__Set() {
return moom.pz.c;
}


public static void a__Void() {
net.minecraft.entity.Entity[] spill1269_0;
    long life0_3;
    java.util.Iterator life3_7;
    net.minecraft.entity.Entity[] life2_8;
    moom.pz life4_15;
    lexical_join_20: {
    life0_3 = (moom.pz.j ^ 109810220255169L);
    spill1269_0 = net.minecraft.client.settings.GameSettings.b__Arrayr3();
    life3_7 = ((java.util.List)(moom.pz.a)).iterator();
    life2_8 = spill1269_0;
    lexical_cycle_9: while (true) {
    if (!(((java.util.Iterator)(life3_7)).hasNext())) {
        break lexical_join_20;
    }
    life4_15 = ((moom.pz)(((java.util.Iterator)(life3_7)).next()));
    ((moom.pz)(life4_15)).c();
    if (!((life2_8 == null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return;
}


public static void a(int p0, boolean p1) {
long life2_3;
    moom.pz life4_10;
    com.moon.dZ life5_18;
    life2_3 = (moom.pz.j ^ 93630078453516L);
    if ((p0 != 0)) {
        life4_10 = ((moom.pz)(((moom.Dd)(moom.pz.b)).a__Object(((int)(p0)))));
        if ((life4_10 != null)) {
        life5_18 = new com.moon.dZ(p0, p1);
        ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life5_18)));
        if ((!((com.moon.dZ)(life5_18)).isCancelled())) {
        ((moom.pz)(life4_10)).h = ((boolean)(((com.moon.dZ)(life5_18)).b__sourceReturn_aae029aa0a()));
    }
    }
    }
    return;
}


public static boolean a__Boolean(int p0) {
java.lang.Object local1 = ((moom.pz)(((moom.Dd)(moom.pz.b)).a__Object(((int)(p0)))));
    return ((((((moom.pz)(local1)).h) ? 1 : 0)) != 0);
}


public boolean a__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


public java.lang.String a__String() {
return this.f;
}


public static void a(int p0) {
moom.pz forwardValue3838_18_0;
    moom.pz spill3838_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    moom.pz life4_12;
    forward_join_23: {
    forward_join_18: {
    life1_3 = (moom.pz.j ^ 140709573575263L);
    life3_5 = net.minecraft.client.settings.GameSettings.b__Arrayr3();
    if (!((p0 != 0))) {
        break forward_join_23;
    }
    life4_12 = ((moom.pz)(((moom.Dd)(moom.pz.b)).a__Object(((int)(p0)))));
    spill3838_0 = life4_12;
    if (!((life3_5 != null))) {
        forwardValue3838_18_0 = spill3838_0;
        break forward_join_18;
    }
    if (!((spill3838_0 != null))) {
        break forward_join_23;
    }
    forwardValue3838_18_0 = life4_12;
    }
    moom.pz __stackOp3838_5_0 = forwardValue3838_18_0;
    ((moom.pz)(__stackOp3838_5_0)).i = ((int)((((moom.pz)(__stackOp3838_5_0)).i + 1)));
    }
    return;
}


public int compareTo(moom.pz __bridgeParam0) { return this.compareTo__sourceBridge_e47da4afb6(((java.lang.Object)(__bridgeParam0))); }
}
