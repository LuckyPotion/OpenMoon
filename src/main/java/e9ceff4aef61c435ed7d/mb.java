package com.moon;


public class mb {

private final com.moon.setting.ColorSetting a;

public mb(java.lang.String p0) {
super();
    this.a = new com.moon.setting.ColorSetting(p0);
}


public com.moon.mb a(java.util.function.Supplier<java.lang.Boolean> p0) {
((com.moon.setting.ColorSetting)(this.a)).setAvailabilityPredicate(((java.util.function.Supplier)(p0)));
    return this;
}


public com.moon.mb a(java.lang.String p0) {
((com.moon.setting.ColorSetting)(this.a)).setDescription(((java.lang.String)(p0)));
    return this;
}


public com.moon.setting.ColorSetting a() {
return this.a;
}


public com.moon.mb a(com.moon.kR<java.lang.Integer> p0) {
((com.moon.setting.ColorSetting)(this.a)).setChangeListener(((com.moon.kR)(p0)));
    return this;
}


public com.moon.mb a(java.lang.String p0, int p1) {
((com.moon.setting.ColorSetting)(this.a)).setDisplayName(((java.lang.String)(p0)));
    ((com.moon.setting.ColorSetting)(this.a)).setValue(((java.lang.Integer.valueOf(((int)(p1))))));
    return this;
}

}
