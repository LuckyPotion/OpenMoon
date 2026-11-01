package com.moon;


public class mu implements com.moon.mo {

private final com.moon.setting.IntegerSetting a;

private final int[] b;

private long c;

private static final long d;

public mu(com.moon.setting.IntegerSetting p0) {
super();
    this.b = new int[1];
    this.a = p0;
}


static {
d = (moom._c.a(9084906303832120601L, 5489141992092764613L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(95523443324005L);
}


public void b() {
int forwardValue974_41_0;
    boolean spill974_0;
    long life1_3;
    int[] life3_5;
    forward_join_51: {
    forward_join_50: {
    forward_join_41: {
    forward_join_13: {
    life1_3 = (com.moon.mu.d ^ 139245036872282L);
    life3_5 = com.moon.my.b__ArrayInt();
    spill974_0 = ((com.moon.setting.IntegerSetting)(this.a)).isAvailable();
    if (!((life3_5 != null))) {
        forwardValue974_41_0 = ((spill974_0) ? 1 : 0);
        break forward_join_41;
    }
    if (!((!spill974_0))) {
        break forward_join_13;
    }
    return;
    }
    imgui.ImGui.pushID(((long)(this.c)));
    (this.b)[0] = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.a)).getValue())))).intValue();
    imgui.ImGui.sliderInt(((java.lang.String)(((com.moon.setting.IntegerSetting)(this.a)).getDisplayName())), ((int[])(this.b)), ((int)(((com.moon.setting.IntegerSetting)(this.a)).getMin())), ((int)(((com.moon.setting.IntegerSetting)(this.a)).getMax())));
    if (!((life3_5 != null))) {
        break forward_join_51;
    }
    forwardValue974_41_0 = ((imgui.ImGui.isItemEdited()) ? 1 : 0);
    }
    if (!((forwardValue974_41_0 != 0))) {
        break forward_join_50;
    }
    ((com.moon.setting.IntegerSetting)(this.a)).setValueFromSlider(((float)(((float) (this.b)[0]))));
    }
    imgui.ImGui.popID();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
(this.b)[0] = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.a)).getValue())))).intValue();
    this.c = ((long)(java.lang.Math.round(((double)((java.lang.Math.random() * 0x1.dcd65p29d))))));
    return;
}

}
