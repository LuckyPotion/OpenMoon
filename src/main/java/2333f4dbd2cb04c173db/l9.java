package com.moon;


public class l9 {

private final com.moon.setting.BezierSetting a;

public l9(java.lang.String p0) {
super();
    this.a = new com.moon.setting.BezierSetting(p0);
}


public com.moon.l9 a(java.util.function.Supplier<java.lang.Boolean> p0) {
((com.moon.setting.BezierSetting)(this.a)).setAvailabilityPredicate(((java.util.function.Supplier)(p0)));
    return this;
}


public com.moon.l9 a(java.lang.String p0) {
((com.moon.setting.BezierSetting)(this.a)).setDescription(((java.lang.String)(p0)));
    return this;
}


public com.moon.setting.BezierSetting a() {
return this.a;
}


public com.moon.l9 a(com.moon.kR<java.lang.Float> p0) {
((com.moon.setting.BezierSetting)(this.a)).setChangeListener(((com.moon.kR)(p0)));
    return this;
}


public com.moon.l9 a(float[][] p0) {
((com.moon.setting.BezierSetting)(this.a)).setControlPoints(((float[][])(p0)));
    return this;
}


public com.moon.l9 a(java.lang.String p0, float p1, float p2) {
((com.moon.setting.BezierSetting)(this.a)).setDisplayName(((java.lang.String)(p0)));
    ((com.moon.setting.BezierSetting)(this.a)).setStartValue(((float)(p1)));
    ((com.moon.setting.BezierSetting)(this.a)).setEndValue(((float)(p2)));
    return this;
}

}
