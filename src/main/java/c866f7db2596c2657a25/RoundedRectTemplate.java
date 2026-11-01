package com.moon.scripting.api.types.templates;


public class RoundedRectTemplate implements com.moon.scripting.api.types.templates.RenderTemplate {

public final float x;

public final float y;

public final float width;

public final float height;

public final float radius;

public final int color;

public RoundedRectTemplate(float p0, float p1, float p2, float p3, float p4, int p5) {
super();
    this.x = p0;
    this.y = p1;
    this.width = p2;
    this.height = p3;
    this.radius = p4;
    this.color = p5;
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite644_6(this.x, this.y, this.width, this.height, this.radius, this.color);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite644_6(float a0, float a1, float a2, float a3, float a4, int a5) throws E;
}
