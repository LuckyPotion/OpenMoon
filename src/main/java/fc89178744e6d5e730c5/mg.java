package com.moon;


public class mg<U extends java.lang.Enum<U> & com.moon.l8 & com.moon.kS<?>> {

private final com.moon.setting.EnumSetting<U> a;

public mg(java.lang.String p0, java.lang.Class<U> p1, com.moon.module.Module p2) {
super();
    this.a = new com.moon.setting.EnumSetting(p0, p1, p2);
}


public com.moon.mg<U> a(java.util.function.Supplier<java.lang.Boolean> p0) {
((com.moon.setting.EnumSetting)(this.a)).setAvailabilityPredicate(((java.util.function.Supplier)(p0)));
    return this;
}


public com.moon.mg a(java.lang.String p0) {
((com.moon.setting.EnumSetting)(this.a)).setDescription(((java.lang.String)(p0)));
    return this;
}


public com.moon.setting.EnumSetting<U> a() {
return this.a;
}


public com.moon.mg<U> a(com.moon.kR<U> p0) {
((com.moon.setting.EnumSetting)(this.a)).enumChangeListener = ((com.moon.kR)(p0));
    return this;
}


public com.moon.mg<U> a(java.lang.String p0, U p1) {
((com.moon.setting.EnumSetting)(this.a)).setDisplayName(((java.lang.String)(p0)));
    ((com.moon.setting.EnumSetting)(this.a)).setValue(((java.lang.Object)(p1)));
    return this;
}

}
