package com.moon;


public class nr {

protected static final net.minecraft.client.Minecraft a;

private float b;

private float c;

private float d;

private float e;

private float f;

private float g;

private float h;

private float i;

private boolean j;

private com.moon.module.impl.Effects k;

private static final long q;

public nr(float p0, float p1, float p2, float p3) {
super();
    this.b = p0;
    this.c = p1;
    this.d = p2;
    this.e = p3;
}


static {
q = (moom._c.a(289196893433984976L, 583470169719745765L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(15039234743589L);
    a = net.minecraft.client.Minecraft.a__fM();
}


public boolean b__Boolean() {
return ((((this.j) ? 1 : 0)) != 0);
}


public com.moon.nr b(float p0) {
this.c = ((float)(p0));
    return this;
}


public void b(int p0, int p1, int p2) {
return;
}


public float b() {
return this.c;
}


public void b__Void() {
return;
}


public void b(int p0, int p1) {
return;
}


public float e() {
return this.f;
}


public com.moon.nr e(float p0) {
this.f = ((float)(p0));
    return this;
}


public float c() {
return this.d;
}


private void c__Void() {
com.moon.nr forwardValue1118_12_0;
    com.moon.nr spill1118_0;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.nr.q ^ 62152237826640L);
    life3_5 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    spill1118_0 = this;
    if (!((life3_5 == null))) {
        forwardValue1118_12_0 = spill1118_0;
        break forward_join_12;
    }
    if (!((((com.moon.nr)(spill1118_0)).k == null))) {
        break forward_join_18;
    }
    forwardValue1118_12_0 = this;
    }
    ((com.moon.nr)(forwardValue1118_12_0)).k = ((com.moon.module.impl.Effects)(((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))))));
    }
    return;
}


public void c(int p0, int p1) {
return;
}


public com.moon.nr c(float p0) {
this.d = ((float)(p0));
    return this;
}


public float h() {
return this.i;
}


public com.moon.nr h(float p0) {
this.i = ((float)(p0));
    return this;
}


public float f() {
return this.g;
}


public com.moon.nr f(float p0) {
this.g = ((float)(p0));
    return this;
}


public com.moon.nr d(float p0) {
this.e = ((float)(p0));
    return this;
}


public float d() {
return this.e;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0, int p1) {
return;
}


public void a__Void() {
((com.moon.nr)(this)).c__Void();
    return;
}


public com.moon.nr a(com.moon.module.impl.Effects p0) {
this.k = ((com.moon.module.impl.Effects)(p0));
    return this;
}


public com.moon.nr a(boolean p0) {
this.j = ((boolean)(p0));
    return this;
}


public void a(int p0, int p1, int p2) {
return;
}


public void a(char p0, int p1) {
return;
}


public float a() {
return this.b;
}


protected boolean a__Boolean() {
((com.moon.nr)(this)).c__Void();
    return (__sourceIntrinsic_booleanComparison((((com.moon.module.impl.Effects)(this.k)).isEnabled())) != 0);
}


protected boolean a(int p0, int p1, float p2, float p3, float p4, float p5) {
int forwardValue1117_19_0;
    int forwardValue1117_26_0;
    int forwardValue1117_35_0;
    int forwardValue1117_39_0;
    int forwardValue1117_41_0;
    int spill1117_0;
    long life7_3;
    int[] life9_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_35: {
    forward_join_26: {
    forward_join_19: {
    life7_3 = (com.moon.nr.q ^ 78066883482651L);
    life9_5 = net.minecraft.entity.player.PlayerCapabilities.b__ArrayInt();
    spill1117_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p0))), ((float)(p2)));
    if (!((life9_5 == null))) {
        forwardValue1117_19_0 = spill1117_0;
        break forward_join_19;
    }
    if (!((spill1117_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue1117_19_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p0))), ((float)((p2 + p4))));
    }
    if (!((life9_5 == null))) {
        forwardValue1117_26_0 = forwardValue1117_19_0;
        break forward_join_26;
    }
    if (!((forwardValue1117_19_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue1117_26_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p1))), ((float)(p3)));
    }
    if (!((life9_5 == null))) {
        forwardValue1117_35_0 = forwardValue1117_26_0;
        break forward_join_35;
    }
    if (!((forwardValue1117_26_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue1117_35_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p1))), ((float)((p3 + p5))));
    }
    if (!((life9_5 == null))) {
        forwardValue1117_39_0 = forwardValue1117_35_0;
        break forward_join_39;
    }
    if (!((forwardValue1117_35_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue1117_39_0 = 1;
    }
    forwardValue1117_41_0 = forwardValue1117_39_0;
    break forward_join_41;
    }
    forwardValue1117_41_0 = 0;
    }
    return ((forwardValue1117_41_0) != 0);
}


public com.moon.nr a(float p0) {
this.b = ((float)(p0));
    return this;
}


public void a__Void(boolean p0) {
return;
}


public com.moon.module.impl.Effects a__lU() {
return this.k;
}


public float g() {
return this.h;
}


public com.moon.nr g(float p0) {
this.h = ((float)(p0));
    return this;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
