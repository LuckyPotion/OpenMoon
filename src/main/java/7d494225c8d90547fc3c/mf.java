package com.moon;


public class mf {

private final com.moon.setting.IntegerSetting a;

public mf(java.lang.String p0) {
super();
    this.a = new com.moon.setting.IntegerSetting(p0);
}


public com.moon.mf a(java.util.function.Supplier<java.lang.Boolean> p0) {
((com.moon.setting.IntegerSetting)(this.a)).setAvailabilityPredicate(((java.util.function.Supplier)(p0)));
    return this;
}


public com.moon.mf a(java.lang.String p0) {
((com.moon.setting.IntegerSetting)(this.a)).setDescription(((java.lang.String)(p0)));
    return this;
}


public com.moon.setting.IntegerSetting a() {
return this.a;
}


public com.moon.mf a(com.moon.kR<java.lang.Integer> p0) {
((com.moon.setting.IntegerSetting)(this.a)).setChangeListener(((com.moon.kR)(p0)));
    return this;
}


public com.moon.mf a(java.lang.String p0, int p1, int p2, int p3, int p4) {
((com.moon.setting.IntegerSetting)(this.a)).setDisplayName(((java.lang.String)(p0)));
    ((com.moon.setting.IntegerSetting)(this.a)).setMin(((int)(p2)));
    ((com.moon.setting.IntegerSetting)(this.a)).setMax(((int)(p3)));
    ((com.moon.setting.IntegerSetting)(this.a)).setStep(((int)(p4)));
    ((com.moon.setting.IntegerSetting)(this.a)).setValueFromSlider(((float)(((float) p1))));
    ((com.moon.setting.IntegerSetting)(this.a)).setSliderValue(((float)(((float) p1))));
    return this;
}

}
