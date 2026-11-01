package com.moon.scripting.api.types.templates;


public class TextTemplate implements com.moon.scripting.api.types.templates.RenderTemplate {

public final com.moon.scripting.api.enums.CustomFontType font_type;

public final java.lang.String text;

public final float size;

public final float x;

public final float y;

public final int color;

public final boolean shadow;

public TextTemplate(com.moon.scripting.api.enums.CustomFontType p0, java.lang.String p1, float p2, float p3, float p4, int p5, boolean p6) {
super();
    this.font_type = p0;
    this.text = p1;
    this.size = p2;
    this.x = p3;
    this.y = p4;
    this.color = p5;
    this.shadow = p6;
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite645_7(this.font_type, this.text, this.size, this.x, this.y, this.color, this.shadow);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite645_7(com.moon.scripting.api.enums.CustomFontType a0, java.lang.String a1, float a2, float a3, float a4, int a5, boolean a6) throws E;
}
