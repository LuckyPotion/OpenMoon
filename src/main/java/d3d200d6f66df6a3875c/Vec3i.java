package com.moon.scripting.api.types;


public class Vec3i {

public int x;

public int y;

public int z;

public Vec3i(int p0, int p1, int p2) {
super();
    this.x = p0;
    this.y = p1;
    this.z = p2;
}


public Vec3i() {
super();
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite640_3(this.x, this.y, this.z);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite640_3(int a0, int a1, int a2) throws E;
}
