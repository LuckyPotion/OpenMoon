package com.moon;


public class me {

private final com.moon.setting.SettingGroup a;

private static final long b;

public me() {
super();
    this.a = new com.moon.setting.SettingGroup();
}


static {
b = (moom._c.a(5033496002357181608L, 8165062079222880284L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(25308513377044L);
}


public com.moon.me a(java.lang.String p0) {
((com.moon.setting.SettingGroup)(this.a)).setDescription(((java.lang.String)(p0)));
    return this;
}


public com.moon.setting.SettingGroup a() {
return this.a;
}


public com.moon.me a(java.lang.String p0, com.moon.setting.Setting<?>[] p1) {
net.minecraft.entity.Entity[] spill217_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_10;
    com.moon.setting.Setting[] life6_17;
    int life7_20;
    int life8_22;
    com.moon.setting.Setting life9_29;
    lexical_join_42: {
    life3_3 = (com.moon.me.b ^ 3631610458019L);
    spill217_0 = com.moon.setting.BooleanSetting.a();
    ((com.moon.setting.SettingGroup)(this.a)).setDisplayName(((java.lang.String)(p0)));
    life5_10 = spill217_0;
    ((com.moon.setting.SettingGroup)(this.a)).setValue(((java.util.List.of(((com.moon.setting.Setting[])(p1))))));
    life6_17 = p1;
    life7_20 = (life6_17).length;
    life8_22 = 0;
    lexical_cycle_23: while (true) {
    if (!((life8_22 < life7_20))) {
        break lexical_join_42;
    }
    life9_29 = (life6_17)[life8_22];
    ((com.moon.setting.Setting)(life9_29)).setGrouped(((boolean)(true)));
    ((com.moon.setting.Setting)(life9_29)).setGroup(((com.moon.setting.SettingGroup)(this.a)));
    life8_22 += 1;
    if (!((life5_10 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    return this;
}


public com.moon.me a(java.util.function.Supplier<java.lang.Boolean> p0) {
((com.moon.setting.SettingGroup)(this.a)).setAvailabilityPredicate(((java.util.function.Supplier)(p0)));
    return this;
}

}
