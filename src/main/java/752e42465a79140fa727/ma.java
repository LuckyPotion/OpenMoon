package com.moon;


public class ma {

private final com.moon.setting.ButtonSetting a;

public ma(java.lang.String p0) {
super();
    this.a = new com.moon.setting.ButtonSetting(p0);
}


public com.moon.ma b(java.lang.String p0) {
((com.moon.setting.ButtonSetting)(this.a)).setDescription(((java.lang.String)(p0)));
    return this;
}


public com.moon.setting.ButtonSetting a() {
return this.a;
}


public com.moon.ma a(java.util.function.Supplier<java.lang.Boolean> p0) {
((com.moon.setting.ButtonSetting)(this.a)).setAvailabilityPredicate(((java.util.function.Supplier)(p0)));
    return this;
}


public com.moon.ma a(com.moon.kR<java.lang.Void> p0) {
((com.moon.setting.ButtonSetting)(this.a)).setChangeListener(((com.moon.kR)(p0)));
    return this;
}


public com.moon.ma a(java.lang.String p0) {
((com.moon.setting.ButtonSetting)(this.a)).setDisplayName(((java.lang.String)(p0)));
    return this;
}

}
