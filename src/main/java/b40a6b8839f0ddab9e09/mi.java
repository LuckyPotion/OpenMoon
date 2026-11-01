package com.moon;


public class mi<U extends java.lang.Enum<U> & com.moon.l8> {

private final com.moon.setting.MultiSelectSetting<U> a;

private static final long b;

public mi(java.lang.String p0, java.lang.Class<U> p1) {
super();
    this.a = new com.moon.setting.MultiSelectSetting(p0, p1);
}


static {
b = (moom._c.a(1432773694479111128L, -8772406316695602340L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(255749268516219L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.setting.MultiSelectSetting<U> a() {
return this.a;
}


public com.moon.mi a(java.lang.String p0) {
((com.moon.setting.MultiSelectSetting)(this.a)).setDescription(((java.lang.String)(p0)));
    return this;
}


public com.moon.mi<U> a(java.util.function.Supplier<java.lang.Boolean> p0) {
((com.moon.setting.MultiSelectSetting)(this.a)).setAvailabilityPredicate(((java.util.function.Supplier)(p0)));
    return this;
}


public com.moon.mi<U> a(com.moon.kR<java.util.Map<U, java.lang.Boolean>> p0) {
((com.moon.setting.MultiSelectSetting)(this.a)).setChangeListener(((com.moon.kR)(p0)));
    return this;
}


public com.moon.mi<U> a(java.lang.String p0, U[] p1) {
com.moon.mi lexicalValue219_36_0;
    net.minecraft.entity.Entity[] spill219_0;
    com.moon.mi spill219_1;
    long life3_3;
    java.lang.Enum[] life6_11;
    int life7_14;
    int life8_16;
    net.minecraft.entity.Entity[] life5_17;
    java.lang.Enum life9_24;
    lexical_join_36: {
    lexical_join_35: {
    life3_3 = (com.moon.mi.b ^ 10610915541112L);
    spill219_0 = com.moon.setting.BooleanSetting.a();
    ((com.moon.setting.MultiSelectSetting)(this.a)).setDisplayName(((java.lang.String)(p0)));
    life6_11 = p1;
    life7_14 = (life6_11).length;
    life8_16 = 0;
    life5_17 = spill219_0;
    lexical_cycle_18: while (true) {
    if (!((life8_16 < life7_14))) {
        break lexical_join_35;
    }
    life9_24 = (life6_11)[life8_16];
    spill219_1 = this;
    if (!((life5_17 != null))) {
        lexicalValue219_36_0 = spill219_1;
        break lexical_join_36;
    }
    ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(spill219_1)).a)).setSelected(((java.lang.Enum)(life9_24)), ((boolean)(true)));
    life8_16 += 1;
    if (!((life5_17 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue219_36_0 = this;
    }
    return lexicalValue219_36_0;
}

}
