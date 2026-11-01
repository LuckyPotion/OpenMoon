package com.moon.scripting.api.types.templates;


public class GradientTemplate implements com.moon.scripting.api.types.templates.RenderTemplate {

public final float x;

public final float y;

public final float width;

public final float height;

public final int from;

public final int to;

public final boolean vertical;

public GradientTemplate(float p0, float p1, float p2, float p3, int p4, int p5, boolean p6) {
super();
    this.x = p0;
    this.y = p1;
    this.width = p2;
    this.height = p3;
    this.from = p4;
    this.to = p5;
    this.vertical = p6;
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite641_7(this.x, this.y, this.width, this.height, this.from, this.to, this.vertical);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite641_7(float a0, float a1, float a2, float a3, int a4, int a5, boolean a6) throws E;
}
