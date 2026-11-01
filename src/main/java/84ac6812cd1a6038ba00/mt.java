package com.moon;


public class mt implements com.moon.mo {

private final com.moon.setting.SettingGroup a;

private final java.util.List<com.moon.mo> b;

private long c;

private static final long d;

public mt(com.moon.setting.SettingGroup p0) {
super();
    this.b = new java.util.ArrayList();
    this.a = p0;
}


static {
d = (moom._c.a(-4909090985572003287L, -2896707013612184879L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(70117257851364L);
}


public void b() {
int lexicalValue260_19_0;
    com.moon.mt lexicalValue260_21_0;
    boolean spill260_0;
    com.moon.mt spill260_1;
    long life1_3;
    int[] life3_5;
    java.util.Iterator life4_29;
    com.moon.mo life5_36;
    lexical_join_38: {
    lexical_join_37: {
    lexical_join_21: {
    lexical_join_19: {
    lexical_join_13: {
    life1_3 = (com.moon.mt.d ^ 92519689297348L);
    life3_5 = com.moon.my.b__ArrayInt();
    spill260_0 = ((com.moon.setting.SettingGroup)(this.a)).isAvailable();
    if (!((life3_5 != null))) {
        lexicalValue260_19_0 = ((spill260_0) ? 1 : 0);
        break lexical_join_19;
    }
    if (!((!spill260_0))) {
        break lexical_join_13;
    }
    return;
    }
    spill260_1 = this;
    if (!((life3_5 != null))) {
        lexicalValue260_21_0 = spill260_1;
        break lexical_join_21;
    }
    lexicalValue260_19_0 = ((imgui.ImGui.treeNode(((java.lang.String)(((com.moon.setting.SettingGroup)(((com.moon.mt)(spill260_1)).a)).getDisplayName())))) ? 1 : 0);
    }
    if (!((lexicalValue260_19_0 != 0))) {
        break lexical_join_38;
    }
    lexicalValue260_21_0 = this;
    }
    life4_29 = ((java.util.List)(((com.moon.mt)(lexicalValue260_21_0)).b)).iterator();
    lexical_cycle_24: while (true) {
    if (!(((java.util.Iterator)(life4_29)).hasNext())) {
        break lexical_join_37;
    }
    life5_36 = ((com.moon.mo)(((java.util.Iterator)(life4_29)).next()));
    ((com.moon.mo)(life5_36)).b();
    if (!((life3_5 != null))) {
        break lexical_join_38;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    imgui.ImGui.treePop();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
int forestValue132_41_0;
    int forestValue132_59_0;
    int forestValue132_77_0;
    int forestValue132_95_0;
    int forestValue132_113_0;
    int forestValue132_131_0;
    int forestValue132_149_0;
    int forestValue132_169_0;
    com.moon.setting.Setting forestValue132_171_0;
    int forestValue132_201_0;
    int[] spill132_0;
    int spill132_1;
    com.moon.setting.Setting spill132_2;
    boolean spill132_3;
    long life1_3;
    java.util.Iterator life4_10;
    int[] life3_11;
    com.moon.setting.Setting life5_20;
    com.moon.setting.SettingGroup life6_35;
    com.moon.setting.BooleanSetting life7_58;
    com.moon.setting.IntegerSetting life8_81;
    com.moon.setting.FloatSetting life9_104;
    com.moon.setting.ColorSetting life10_127;
    com.moon.setting.ModeSetting life11_150;
    com.moon.setting.EnumSetting life12_173;
    com.moon.setting.MultiSelectSetting life13_196;
    com.moon.k5 life14_220;
    java.util.Iterator life4_236;
    com.moon.mo life5_246;
    com.moon.mo life5_260;
    forest_join_222: {
    forest_join_216: {
    forest_join_201: {
    forest_join_183: {
    life1_3 = (com.moon.mt.d ^ 65230019687812L);
    spill132_0 = com.moon.my.b__ArrayInt();
    life4_10 = ((java.util.List)(((java.util.List)(((com.moon.setting.SettingGroup)(this.a)).getValue())))).iterator();
    life3_11 = spill132_0;
    forest_cycle_12: while (true) {
    forest_join_181: {
    forest_join_171: {
    forest_join_169: {
    forest_join_165: {
    forest_join_149: {
    forest_join_147: {
    forest_join_131: {
    forest_join_129: {
    forest_join_113: {
    forest_join_111: {
    forest_join_95: {
    forest_join_93: {
    forest_join_77: {
    forest_join_75: {
    forest_join_59: {
    forest_join_57: {
    forest_join_41: {
    forest_join_39: {
    if (!(((java.util.Iterator)(life4_10)).hasNext())) {
        break forest_join_183;
    }
    life5_20 = ((com.moon.setting.Setting)(((java.util.Iterator)(life4_10)).next()));
    spill132_1 = ((life5_20 instanceof com.moon.setting.SettingGroup) ? 1 : 0);
    if (!((life3_11 != null))) {
        forestValue132_201_0 = spill132_1;
        break forest_join_201;
    }
    if (!((life3_11 != null))) {
        forestValue132_41_0 = spill132_1;
        break forest_join_41;
    }
    if (!((spill132_1 != 0))) {
        break forest_join_39;
    }
    life6_35 = ((com.moon.setting.SettingGroup)(life5_20));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.mt(life6_35))));
    if (!((life3_11 == null))) {
        break forest_join_181;
    }
    }
    forestValue132_41_0 = ((life5_20 instanceof com.moon.setting.BooleanSetting) ? 1 : 0);
    }
    if (!((life3_11 != null))) {
        forestValue132_59_0 = forestValue132_41_0;
        break forest_join_59;
    }
    if (!((forestValue132_41_0 != 0))) {
        break forest_join_57;
    }
    life7_58 = ((com.moon.setting.BooleanSetting)(life5_20));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.mp(life7_58))));
    if (!((life3_11 == null))) {
        break forest_join_181;
    }
    }
    forestValue132_59_0 = ((life5_20 instanceof com.moon.setting.IntegerSetting) ? 1 : 0);
    }
    if (!((life3_11 != null))) {
        forestValue132_77_0 = forestValue132_59_0;
        break forest_join_77;
    }
    if (!((forestValue132_59_0 != 0))) {
        break forest_join_75;
    }
    life8_81 = ((com.moon.setting.IntegerSetting)(life5_20));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.mu(life8_81))));
    if (!((life3_11 == null))) {
        break forest_join_181;
    }
    }
    forestValue132_77_0 = ((life5_20 instanceof com.moon.setting.FloatSetting) ? 1 : 0);
    }
    if (!((life3_11 != null))) {
        forestValue132_95_0 = forestValue132_77_0;
        break forest_join_95;
    }
    if (!((forestValue132_77_0 != 0))) {
        break forest_join_93;
    }
    life9_104 = ((com.moon.setting.FloatSetting)(life5_20));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.ms(life9_104))));
    if (!((life3_11 == null))) {
        break forest_join_181;
    }
    }
    forestValue132_95_0 = ((life5_20 instanceof com.moon.setting.ColorSetting) ? 1 : 0);
    }
    if (!((life3_11 != null))) {
        forestValue132_113_0 = forestValue132_95_0;
        break forest_join_113;
    }
    if (!((forestValue132_95_0 != 0))) {
        break forest_join_111;
    }
    life10_127 = ((com.moon.setting.ColorSetting)(life5_20));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.mq(life10_127))));
    if (!((life3_11 == null))) {
        break forest_join_181;
    }
    }
    forestValue132_113_0 = ((life5_20 instanceof com.moon.setting.ModeSetting) ? 1 : 0);
    }
    if (!((life3_11 != null))) {
        forestValue132_131_0 = forestValue132_113_0;
        break forest_join_131;
    }
    if (!((forestValue132_113_0 != 0))) {
        break forest_join_129;
    }
    life11_150 = ((com.moon.setting.ModeSetting)(life5_20));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.mr(life11_150))));
    if (!((life3_11 == null))) {
        break forest_join_181;
    }
    }
    forestValue132_131_0 = ((life5_20 instanceof com.moon.setting.EnumSetting) ? 1 : 0);
    }
    if (!((life3_11 != null))) {
        forestValue132_149_0 = forestValue132_131_0;
        break forest_join_149;
    }
    if (!((forestValue132_131_0 != 0))) {
        break forest_join_147;
    }
    life12_173 = ((com.moon.setting.EnumSetting)(life5_20));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.mv(life12_173))));
    if (!((life3_11 == null))) {
        break forest_join_181;
    }
    }
    forestValue132_149_0 = ((life5_20 instanceof com.moon.setting.MultiSelectSetting) ? 1 : 0);
    }
    if (!((life3_11 != null))) {
        forestValue132_169_0 = forestValue132_149_0;
        break forest_join_169;
    }
    if (!((forestValue132_149_0 != 0))) {
        break forest_join_165;
    }
    life13_196 = ((com.moon.setting.MultiSelectSetting)(life5_20));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.mx(life13_196))));
    if (!((life3_11 == null))) {
        break forest_join_181;
    }
    }
    spill132_2 = life5_20;
    if (!((life3_11 != null))) {
        forestValue132_171_0 = spill132_2;
        break forest_join_171;
    }
    forestValue132_169_0 = ((spill132_2 instanceof com.moon.k5) ? 1 : 0);
    }
    if (!((forestValue132_169_0 != 0))) {
        break forest_join_181;
    }
    forestValue132_171_0 = life5_20;
    }
    life14_220 = ((com.moon.k5)(forestValue132_171_0));
    ((java.util.List)(this.b)).add(((java.lang.Object)(new com.moon.my(life14_220))));
    }
    if (!((life3_11 == null))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    }
    life4_236 = ((java.util.List)(this.b)).iterator();
    forest_cycle_187: while (true) {
    if (!(((java.util.Iterator)(life4_236)).hasNext())) {
        break forest_join_216;
    }
    life5_246 = ((com.moon.mo)(((java.util.Iterator)(life4_236)).next()));
    ((com.moon.mo)(life5_246)).a();
    if (!((life3_11 != null))) {
        break forest_join_222;
    }
    if (!((life3_11 == null))) {
        continue forest_cycle_187;
    }
    break forest_cycle_187;
    }
    break forest_join_216;
    }
    forest_cycle_201: while (true) {
    forest_join_213: {
    if (!((forestValue132_201_0 != 0))) {
        break forest_join_216;
    }
    life5_260 = ((com.moon.mo)(((java.util.Iterator)(life4_10)).next()));
    ((com.moon.mo)(life5_260)).a();
    if (!((life3_11 != null))) {
        break forest_join_222;
    }
    if (!((life3_11 == null))) {
        break forest_join_213;
    }
    break forest_join_216;
    }
    spill132_3 = ((java.util.Iterator)(life4_10)).hasNext();
    forestValue132_201_0 = ((spill132_3) ? 1 : 0);
    continue forest_cycle_201;
    }
    }
    this.c = ((long)(java.lang.Math.round(((double)((java.lang.Math.random() * 0x1.dcd65p29d))))));
    }
    return;
}

}
