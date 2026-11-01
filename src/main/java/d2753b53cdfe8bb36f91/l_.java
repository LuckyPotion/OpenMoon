package com.moon;


public class l_ {

private final com.moon.setting.BooleanSetting a;

public l_(java.lang.String p0) {
super();
    this.a = new com.moon.setting.BooleanSetting(p0);
}


public com.moon.l_ a(java.util.function.Supplier<java.lang.Boolean> p0) {
((com.moon.setting.BooleanSetting)(this.a)).setAvailabilityPredicate(((java.util.function.Supplier)(p0)));
    return this;
}


public com.moon.l_ a(java.lang.String p0) {
((com.moon.setting.BooleanSetting)(this.a)).setDescription(((java.lang.String)(p0)));
    return this;
}


public com.moon.setting.BooleanSetting a() {
return this.a;
}


public com.moon.l_ a(com.moon.kR<java.lang.Boolean> p0) {
((com.moon.setting.BooleanSetting)(this.a)).setChangeListener(((com.moon.kR)(p0)));
    return this;
}


public com.moon.l_ a(java.lang.String p0, boolean p1) {
((com.moon.setting.BooleanSetting)(this.a)).setDisplayName(((java.lang.String)(p0)));
    ((com.moon.setting.BooleanSetting)(this.a)).setValue(((java.lang.Boolean.valueOf(((boolean)(p1))))));
    return this;
}

}
