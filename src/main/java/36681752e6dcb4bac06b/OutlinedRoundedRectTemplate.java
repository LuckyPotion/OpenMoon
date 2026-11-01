package com.moon.scripting.api.types.templates;


public class OutlinedRoundedRectTemplate implements com.moon.scripting.api.types.templates.RenderTemplate {

public final float x;

public final float y;

public final float width;

public final float height;

public final float radius;

public final float thickness;

public final int color;

public OutlinedRoundedRectTemplate(float p0, float p1, float p2, float p3, float p4, float p5, int p6) {
super();
    this.x = p0;
    this.y = p1;
    this.width = p2;
    this.height = p3;
    this.radius = p4;
    this.thickness = p5;
    this.color = p6;
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite642_7(this.x, this.y, this.width, this.height, this.radius, this.thickness, this.color);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite642_7(float a0, float a1, float a2, float a3, float a4, float a5, int a6) throws E;
}
