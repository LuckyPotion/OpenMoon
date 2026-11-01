package com.moon;


public class mx implements com.moon.mo {

private final com.moon.setting.MultiSelectSetting a;

private final imgui.type.ImInt b;

private java.lang.String[] c;

private long d;

private static final long e;

public mx(com.moon.setting.MultiSelectSetting p0) {
super();
    this.b = ((imgui.type.ImInt)(new imgui.type.ImInt()));
    this.a = ((com.moon.setting.MultiSelectSetting)(p0));
    return;
}


static {
e = (moom._c.a(6594590156201896304L, -24715430053510875L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(104166568749196L);
}


public void b() {
int lexicalValue265_24_0;
    boolean spill265_0;
    long life1_3;
    int[] life3_5;
    int life4_32;
    java.lang.String life5_42;
    java.lang.Enum life6_48;
    int life7_53;
    lexical_join_65: {
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_24: {
    lexical_join_13: {
    life1_3 = (com.moon.mx.e ^ 79172758558583L);
    life3_5 = com.moon.my.b__ArrayInt();
    spill265_0 = ((com.moon.setting.MultiSelectSetting)(this.a)).isAvailable();
    if (!((life3_5 != null))) {
        lexicalValue265_24_0 = ((spill265_0) ? 1 : 0);
        break lexical_join_24;
    }
    if (!((!spill265_0))) {
        break lexical_join_13;
    }
    return;
    }
    imgui.ImGui.pushID(((long)(this.d)));
    if (!((life3_5 != null))) {
        break lexical_join_65;
    }
    lexicalValue265_24_0 = ((imgui.ImGui.beginListBox(((java.lang.String)(((com.moon.setting.MultiSelectSetting)(this.a)).getDisplayName())), ((float)(imgui.ImGui.calcItemWidth())), ((float)(0x1.54p6f)))) ? 1 : 0);
    }
    if (!((lexicalValue265_24_0 != 0))) {
        break lexical_join_64;
    }
    life4_32 = 0;
    lexical_cycle_27: while (true) {
    lexical_join_61: {
    lexical_join_60: {
    if (!((life4_32 < (this.c).length))) {
        break lexical_join_63;
    }
    life5_42 = (this.c)[life4_32];
    life6_48 = (((com.moon.setting.MultiSelectSetting)(this.a)).getValues())[life4_32];
    life7_53 = ((((com.moon.setting.MultiSelectSetting)(this.a)).isSelected(((java.lang.Enum)(life6_48)))) ? 1 : 0);
    if (!((life3_5 != null))) {
        break lexical_join_65;
    }
    if (!((life3_5 != null))) {
        break lexical_join_61;
    }
    if (!(imgui.ImGui.selectable(((java.lang.String)(life5_42)), ((boolean)__sourceIntrinsic_integerToBoolean((life7_53)))))) {
        break lexical_join_60;
    }
    ((com.moon.setting.MultiSelectSetting)(this.a)).toggle(((java.lang.Enum)(life6_48)));
    }
    life4_32 += 1;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    imgui.ImGui.endListBox();
    }
    imgui.ImGui.popID();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
int[] spill264_0;
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
    life1_3 = (com.moon.mx.e ^ 43393115209527L);
    spill264_0 = com.moon.my.b__ArrayInt();
    life4_8 = new java.util.ArrayList();
    life3_9 = spill264_0;
    life5_13 = ((com.moon.setting.MultiSelectSetting)(this.a)).getValues();
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


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
