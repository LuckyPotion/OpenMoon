package com.moon;


public class mc<U extends java.lang.Enum<U> & com.moon.l8> {

private final com.moon.setting.ModeSetting<U> a;

public mc(java.lang.String p0, java.lang.Class<U> p1) {
super();
    this.a = new com.moon.setting.ModeSetting(p0, p1);
}


public com.moon.mc<U> a(java.util.function.Supplier<java.lang.Boolean> p0) {
((com.moon.setting.ModeSetting)(this.a)).setAvailabilityPredicate(((java.util.function.Supplier)(p0)));
    return this;
}


public com.moon.mc a(java.lang.String p0) {
((com.moon.setting.ModeSetting)(this.a)).setDescription(((java.lang.String)(p0)));
    return this;
}


public com.moon.setting.ModeSetting<U> a() {
return this.a;
}


public com.moon.mc<U> a(com.moon.kR<U> p0) {
((com.moon.setting.ModeSetting)(this.a)).setChangeListener(((com.moon.kR)(p0)));
    return this;
}


public com.moon.mc<U> a(java.lang.String p0, U p1) {
((com.moon.setting.ModeSetting)(this.a)).setDisplayName(((java.lang.String)(p0)));
    ((com.moon.setting.ModeSetting)(this.a)).setValue(((java.lang.Object)(p1)));
    return this;
}

}
