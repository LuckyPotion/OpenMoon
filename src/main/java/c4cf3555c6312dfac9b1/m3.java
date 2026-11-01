package com.moon;


public class m3 {

protected static net.minecraft.client.Minecraft a;

private float b;

private float c;

private float d;

private float e;

private com.moon.module.impl.ClickGUI f;

private static long G;

public m3(float p0, float p1, float p2, float p3) { super(); }


private static void __sourceConstructorBody_0ae7764c43681408(com.moon.m3 receiver, float p0, float p1, float p2, float p3) throws Throwable {

long local5_life1 = (com.moon.m3.G ^ 37514842868415L);

    com.moon.m3.__sourceConstructorInit_0ae7764c43681408_0(((com.moon.m3)(receiver)));

    ((com.moon.m3)(receiver)).b = ((float)(p0));

    ((com.moon.m3)(receiver)).c = ((float)(p1));

    boolean __sourceSpill163_7 = net.minecraft.client.gui.FontRenderer.c__Boolean();

    ((com.moon.m3)(receiver)).d = ((float)(p2));

    ((com.moon.m3)(receiver)).e = ((float)(p3));

    boolean local7_life9 = __sourceSpill163_7;

    if (local7_life9) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_0ae7764c43681408_0(com.moon.m3 a0) throws E;

static {
com.moon.m3.G = (moom._c.a(-3798814922778556539L, -7397445696288086600L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(139644753778437L);
    com.moon.m3.a = net.minecraft.client.Minecraft.a__fM();
}


protected boolean b__Boolean() {
return ((((com.moon.m1.a) ? 1 : 0)) != 0);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b(int p0, int p1, int p2) {
return;
}


public float b() {
return this.c;
}


public com.moon.m3 b(float p0) {
this.c = ((float)(p0));
    return this;
}


public void b(int p0, int p1) {
return;
}


public void b__Void() {
return;
}


public com.moon.m3 c(float p0) {
this.d = ((float)(p0));
    return this;
}


public float c() {
return this.d;
}


public void c(int p0, int p1) {
return;
}


public float d() {
return this.e;
}


public com.moon.m3 d(float p0) {
this.e = ((float)(p0));
    return this;
}


public com.moon.m3 a(float p0) {
this.b = ((float)(p0));
    return this;
}


public com.moon.m3 a(com.moon.module.impl.ClickGUI p0) {
this.f = ((com.moon.module.impl.ClickGUI)(p0));
    return this;
}


public void a__Void() {
this.f = ((com.moon.module.impl.ClickGUI)(((com.moon.module.impl.ClickGUI)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.ClickGUI.class)))))));
    return;
}


public float a() {
return this.b;
}


public void a(char p0, int p1) {
return;
}


protected boolean a(int p0, int p1, float p2, float p3, float p4, float p5) {
int forwardValue658_19_0;
    int forwardValue658_26_0;
    int forwardValue658_35_0;
    int forwardValue658_39_0;
    int forwardValue658_41_0;
    int forwardValue658_47_0;
    int forwardValue658_48_0;
    int forwardValue658_48_1;
    int forwardValue658_49_0;
    int spill658_0;
    long life7_3;
    int life9_5;
    forward_join_49: {
    forward_join_48: {
    forward_join_47: {
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_35: {
    forward_join_26: {
    forward_join_19: {
    life7_3 = (com.moon.m3.G ^ 19728342466923L);
    life9_5 = ((net.minecraft.client.gui.FontRenderer.c__Boolean()) ? 1 : 0);
    spill658_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p0))), ((float)(p2)));
    if (!((life9_5 == 0))) {
        forwardValue658_19_0 = spill658_0;
        break forward_join_19;
    }
    if (!((spill658_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue658_19_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p0))), ((float)((p2 + p4))));
    }
    if (!((life9_5 == 0))) {
        forwardValue658_26_0 = forwardValue658_19_0;
        break forward_join_26;
    }
    if (!((forwardValue658_19_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue658_26_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p1))), ((float)(p3)));
    }
    if (!((life9_5 == 0))) {
        forwardValue658_35_0 = forwardValue658_26_0;
        break forward_join_35;
    }
    if (!((forwardValue658_26_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue658_35_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p1))), ((float)((p3 + p5))));
    }
    if (!((life9_5 == 0))) {
        forwardValue658_39_0 = forwardValue658_35_0;
        break forward_join_39;
    }
    if (!((forwardValue658_35_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue658_39_0 = 1;
    }
    forwardValue658_41_0 = forwardValue658_39_0;
    break forward_join_41;
    }
    forwardValue658_41_0 = 0;
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forwardValue658_49_0 = forwardValue658_41_0;
        break forward_join_49;
    }
    if (!((life9_5 != 0))) {
        forwardValue658_47_0 = forwardValue658_41_0;
        break forward_join_47;
    }
    forwardValue658_48_0 = forwardValue658_41_0;
    forwardValue658_48_1 = 0;
    break forward_join_48;
    }
    forwardValue658_48_0 = forwardValue658_47_0;
    forwardValue658_48_1 = 1;
    }
    net.minecraft.client.gui.FontRenderer.c(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue658_48_1))));
    forwardValue658_49_0 = forwardValue658_48_0;
    }
    return ((forwardValue658_49_0) != 0);
}


public void a(int p0, int p1) {
return;
}


public void a(boolean p0) {
return;
}


public void a(int p0, int p1, int p2) {
return;
}


public com.moon.module.impl.ClickGUI a__lS() {
return this.f;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
