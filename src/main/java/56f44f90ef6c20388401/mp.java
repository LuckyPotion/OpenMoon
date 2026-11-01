package com.moon;


public class mp implements com.moon.mo {

private final com.moon.setting.BooleanSetting a;

private long b;

private static final long c;

public mp(com.moon.setting.BooleanSetting p0) {
super();
    this.a = p0;
}


static {
c = (moom._c.a(4746099488931553956L, -897292970561730896L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(204053955312790L);
}


public void b() {
int forwardValue967_29_0;
    com.moon.setting.BooleanSetting forwardValue967_41_0;
    int forwardValue967_41_1;
    com.moon.setting.BooleanSetting forwardValue967_42_0;
    com.moon.setting.BooleanSetting forwardValue967_43_0;
    int forwardValue967_43_1;
    boolean spill967_0;
    com.moon.setting.BooleanSetting spill967_1;
    boolean spill967_2;
    long life1_3;
    int[] life3_5;
    forward_join_46: {
    forward_join_45: {
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_29: {
    forward_join_13: {
    life1_3 = (com.moon.mp.c ^ 138541128116703L);
    life3_5 = com.moon.my.b__ArrayInt();
    spill967_0 = ((com.moon.setting.BooleanSetting)(this.a)).isAvailable();
    if (!((life3_5 != null))) {
        forwardValue967_29_0 = ((spill967_0) ? 1 : 0);
        break forward_join_29;
    }
    if (!((!spill967_0))) {
        break forward_join_13;
    }
    return;
    }
    imgui.ImGui.pushID(((long)(this.b)));
    imgui.ImGui.checkbox(((java.lang.String)(((com.moon.setting.BooleanSetting)(this.a)).getDisplayName())), ((boolean)(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.a)).getValue())))).booleanValue())));
    if (!((life3_5 != null))) {
        break forward_join_46;
    }
    forwardValue967_29_0 = ((imgui.ImGui.isItemClicked()) ? 1 : 0);
    }
    if (!((forwardValue967_29_0 != 0))) {
        break forward_join_45;
    }
    spill967_1 = this.a;
    spill967_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.a)).getValue())))).booleanValue();
    if (!((life3_5 != null))) {
        forwardValue967_41_0 = spill967_1;
        forwardValue967_41_1 = ((spill967_2) ? 1 : 0);
        break forward_join_41;
    }
    if (!((!spill967_2))) {
        forwardValue967_42_0 = spill967_1;
        break forward_join_42;
    }
    forwardValue967_41_0 = spill967_1;
    forwardValue967_41_1 = 1;
    }
    forwardValue967_43_0 = forwardValue967_41_0;
    forwardValue967_43_1 = forwardValue967_41_1;
    break forward_join_43;
    }
    forwardValue967_43_0 = forwardValue967_42_0;
    forwardValue967_43_1 = 0;
    }
    ((com.moon.setting.BooleanSetting)(forwardValue967_43_0)).setValue(((java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue967_43_1)))))));
    }
    imgui.ImGui.popID();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
this.b = ((long)(java.lang.Math.round(((double)((java.lang.Math.random() * 0x1.dcd65p29d))))));
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
