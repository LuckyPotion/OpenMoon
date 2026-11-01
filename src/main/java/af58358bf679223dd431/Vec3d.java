package com.moon.scripting.api.types;


public class Vec3d {

public double x;

public double y;

public double z;

public Vec3d(double p0, double p1, double p2) {
super();
    this.x = p0;
    this.y = p1;
    this.z = p2;
}


public Vec3d() {
super();
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite638_3(this.x, this.y, this.z);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite638_3(double a0, double a1, double a2) throws E;
}
