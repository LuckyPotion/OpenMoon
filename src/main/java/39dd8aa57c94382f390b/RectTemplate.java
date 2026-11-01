package com.moon.scripting.api.types.templates;


public class RectTemplate implements com.moon.scripting.api.types.templates.RenderTemplate {

public final float x;

public final float y;

public final float width;

public final float height;

public final int color;

public RectTemplate(float p0, float p1, float p2, float p3, int p4) {
super();
    this.x = p0;
    this.y = p1;
    this.width = p2;
    this.height = p3;
    this.color = p4;
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite643_5(this.x, this.y, this.width, this.height, this.color);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite643_5(float a0, float a1, float a2, float a3, int a4) throws E;
}
