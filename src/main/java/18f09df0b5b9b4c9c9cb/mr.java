package com.moon;


public class mr implements com.moon.mo {

private final com.moon.setting.ModeSetting a;

private final imgui.type.ImInt b;

private java.lang.String[] c;

private long d;

private static final long e;

public mr(com.moon.setting.ModeSetting p0) {
super();
    this.b = ((imgui.type.ImInt)(new imgui.type.ImInt()));
    this.a = ((com.moon.setting.ModeSetting)(p0));
    return;
}


static {
e = (moom._c.a(7350799552623150045L, -2138876583758039200L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(104797468656810L);
}


public void b() {
int forwardValue970_21_0;
    boolean spill970_0;
    long life1_3;
    int[] life3_5;
    int life4_24;
    forward_join_50: {
    forward_join_49: {
    forward_join_21: {
    forward_join_13: {
    life1_3 = (com.moon.mr.e ^ 15501304357940L);
    life3_5 = com.moon.my.b__ArrayInt();
    spill970_0 = ((com.moon.setting.ModeSetting)(this.a)).isAvailable();
    if (!((life3_5 != null))) {
        forwardValue970_21_0 = ((spill970_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!((!spill970_0))) {
        break forward_join_13;
    }
    return;
    }
    imgui.ImGui.pushID(((long)(this.d)));
    forwardValue970_21_0 = ((java.lang.Enum)(((java.lang.Enum)(((com.moon.setting.ModeSetting)(this.a)).getValue())))).ordinal();
    }
    life4_24 = forwardValue970_21_0;
    ((imgui.type.ImInt)(this.b)).set(((int)(life4_24)));
    imgui.ImGui.combo(((java.lang.String)(((com.moon.setting.ModeSetting)(this.a)).getDisplayName())), ((imgui.type.ImInt)(this.b)), ((java.lang.String[])(this.c)));
    if (!((life3_5 != null))) {
        break forward_join_50;
    }
    if (!(imgui.ImGui.isItemEdited())) {
        break forward_join_49;
    }
    ((com.moon.setting.ModeSetting)(this.a)).setValue(((java.lang.Object)((((com.moon.setting.ModeSetting)(this.a)).getValues())[((imgui.type.ImInt)(this.b)).get()])));
    }
    imgui.ImGui.popID();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
int[] spill258_0;
    long life1_3;
    java.util.ArrayList life4_8;
    int[] life3_9;
    java.lang.Enum[] life5_13;
    int life6_16;
    int life7_18;
    java.lang.Enum life8_25;
    com.moon.l8 life9_41;
    lexical_join_62: {
    lexical_join_57: {
    lexical_join_44: {
    life1_3 = (com.moon.mr.e ^ 107132769569908L);
    spill258_0 = com.moon.my.b__ArrayInt();
    life4_8 = new java.util.ArrayList();
    life3_9 = spill258_0;
    life5_13 = ((com.moon.setting.ModeSetting)(this.a)).getValues();
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
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_62;
    }
    com.moon.my.b(((int[])(new int[2])));
    }
    return;
}

}
