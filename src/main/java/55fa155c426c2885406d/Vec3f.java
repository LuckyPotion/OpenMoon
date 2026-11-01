package com.moon.scripting.api.types;


public class Vec3f {

public float x;

public float y;

public float z;

public Vec3f(float p0, float p1, float p2) {
super();
    this.x = p0;
    this.y = p1;
    this.z = p2;
}


public Vec3f() {
super();
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite639_3(this.x, this.y, this.z);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite639_3(float a0, float a1, float a2) throws E;
}
