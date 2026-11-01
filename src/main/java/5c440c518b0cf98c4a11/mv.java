package com.moon;


public class mv implements com.moon.mo {

private final com.moon.setting.EnumSetting a;

private final imgui.type.ImInt b;

private java.lang.String[] c;

private long d;

private static final long e;

public mv(com.moon.setting.EnumSetting p0) {
super();
    this.b = ((imgui.type.ImInt)(new imgui.type.ImInt()));
    this.a = ((com.moon.setting.EnumSetting)(p0));
    return;
}


static {
e = (moom._c.a(-5541078492572682972L, 2360679644923212896L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(269290773319919L);
}


public void b() {
int forwardValue976_18_0;
    boolean spill976_0;
    long life1_3;
    int[] life3_5;
    int life4_21;
    forward_join_50: {
    forward_join_49: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (com.moon.mv.e ^ 7650483459234L);
    life3_5 = com.moon.my.b__ArrayInt();
    spill976_0 = ((com.moon.setting.EnumSetting)(this.a)).isAvailable();
    if (!((life3_5 != null))) {
        forwardValue976_18_0 = ((spill976_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!((!spill976_0))) {
        break forward_join_13;
    }
    return;
    }
    forwardValue976_18_0 = ((java.lang.Enum)(((java.lang.Enum)(((com.moon.setting.EnumSetting)(this.a)).getValue())))).ordinal();
    }
    life4_21 = forwardValue976_18_0;
    ((imgui.type.ImInt)(this.b)).set(((int)(life4_21)));
    imgui.ImGui.pushID(((long)(this.d)));
    imgui.ImGui.combo(((java.lang.String)(((com.moon.setting.EnumSetting)(this.a)).getDisplayName())), ((imgui.type.ImInt)(this.b)), ((java.lang.String[])(this.c)));
    if (!((life3_5 != null))) {
        break forward_join_50;
    }
    if (!(imgui.ImGui.isItemEdited())) {
        break forward_join_49;
    }
    ((com.moon.setting.EnumSetting)(this.a)).setValue(((java.lang.Object)((((com.moon.setting.EnumSetting)(this.a)).getValues())[((imgui.type.ImInt)(this.b)).get()])));
    }
    imgui.ImGui.popID();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
int[] spill261_0;
    long life1_3;
    java.util.ArrayList life4_8;
    int[] life3_9;
    java.lang.Enum[] life5_13;
    int life6_16;
    int life7_18;
    java.lang.Enum life8_25;
    com.moon.l8 life9_41;
    lexical_join_57: {
    lexical_join_44: {
    life1_3 = (com.moon.mv.e ^ 116014101085410L);
    spill261_0 = com.moon.my.b__ArrayInt();
    life4_8 = new java.util.ArrayList();
    life3_9 = spill261_0;
    life5_13 = ((com.moon.setting.EnumSetting)(this.a)).getValues();
    life6_16 = (life5_13).length;
    life7_18 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_42: {
    lexical_join_41: {
    if (!((life7_18 < life6_16))) {
        break lexical_join_44;
    }
    life8_25 = (life5_13)[life7_18];
    if (!((life3_9 != null))) {
        break lexical_join_57;
    }
    if (!((life3_9 != null))) {
        break lexical_join_42;
    }
    if (!((((life8_25 instanceof com.moon.l8) ? 1 : 0) != 0))) {
        break lexical_join_41;
    }
    life9_41 = ((com.moon.l8)(life8_25));
    ((java.util.List)(life4_8)).add(((java.lang.Object)(((com.moon.l8)(life9_41)).a__String())));
    }
    life7_18 += 1;
    }
    if (!((life3_9 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    this.c = ((java.lang.String[])(((java.lang.String[])(((java.util.List)(life4_8)).toArray(((java.lang.Object[])(new java.lang.String[0])))))));
    this.d = ((long)(java.lang.Math.round(((double)((java.lang.Math.random() * 0x1.dcd65p29d))))));
    }
    return;
}

}
