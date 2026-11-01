package com.moon.scripting.api.types.templates;


public class TriangleTemplate implements com.moon.scripting.api.types.templates.RenderTemplate {

public final float top_x;

public final float top_y;

public final float left_x;

public final float left_y;

public final float right_x;

public final float right_y;

public final int color;

public TriangleTemplate(float p0, float p1, float p2, float p3, float p4, float p5, int p6) {
super();
    this.top_x = p0;
    this.top_y = p1;
    this.left_x = p2;
    this.left_y = p3;
    this.right_x = p4;
    this.right_y = p5;
    this.color = p6;
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite646_7(this.top_x, this.top_y, this.left_x, this.left_y, this.right_x, this.right_y, this.color);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite646_7(float a0, float a1, float a2, float a3, float a4, float a5, int a6) throws E;
}
