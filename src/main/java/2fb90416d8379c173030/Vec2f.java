package com.moon.scripting.api.types;


public class Vec2f {

public float x;

public float y;

public Vec2f(float p0, float p1) {
super();
    this.x = p0;
    this.y = p1;
}


public Vec2f() {
super();
}


public void add(float p0, float p1) {
this.x += p0;
    this.y += p1;
    return;
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite637_2(this.x, this.y);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite637_2(float a0, float a1) throws E;
}
