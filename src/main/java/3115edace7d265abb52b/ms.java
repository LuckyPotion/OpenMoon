package com.moon;


public class ms implements com.moon.mo {

private final com.moon.setting.FloatSetting a;

private final float[] b;

private long c;

private static final long d;

public ms(com.moon.setting.FloatSetting p0) {
super();
    this.b = new float[1];
    this.a = p0;
}


static {
d = (moom._c.a(-2745876258342199839L, -892423723034533900L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(158663984530687L);
}


public void b() {
int forwardValue971_41_0;
    boolean spill971_0;
    long life1_3;
    int[] life3_5;
    forward_join_51: {
    forward_join_50: {
    forward_join_41: {
    forward_join_13: {
    life1_3 = (com.moon.ms.d ^ 124992490326904L);
    life3_5 = com.moon.my.b__ArrayInt();
    spill971_0 = ((com.moon.setting.FloatSetting)(this.a)).isAvailable();
    if (!((life3_5 != null))) {
        forwardValue971_41_0 = ((spill971_0) ? 1 : 0);
        break forward_join_41;
    }
    if (!((!spill971_0))) {
        break forward_join_13;
    }
    return;
    }
    imgui.ImGui.pushID(((long)(this.c)));
    (this.b)[0] = ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.a)).getValue())))).floatValue();
    imgui.ImGui.sliderFloat(((java.lang.String)(((com.moon.setting.FloatSetting)(this.a)).getDisplayName())), ((float[])(this.b)), ((float)(((com.moon.setting.FloatSetting)(this.a)).getMin())), ((float)(((com.moon.setting.FloatSetting)(this.a)).getMax())));
    if (!((life3_5 != null))) {
        break forward_join_51;
    }
    forwardValue971_41_0 = ((imgui.ImGui.isItemEdited()) ? 1 : 0);
    }
    if (!((forwardValue971_41_0 != 0))) {
        break forward_join_50;
    }
    ((com.moon.setting.FloatSetting)(this.a)).setValue(((java.lang.Float)(java.lang.Float.valueOf(((float)((this.b)[0]))))));
    }
    imgui.ImGui.popID();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
(this.b)[0] = ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.a)).getValue())))).floatValue();
    this.c = ((long)(java.lang.Math.round(((double)((java.lang.Math.random() * 0x1.dcd65p29d))))));
    return;
}

}
