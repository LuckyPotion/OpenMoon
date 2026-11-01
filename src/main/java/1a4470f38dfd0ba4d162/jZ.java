package com.moon;


public class jZ implements com.moon.scripting.api.functions.FontFunctions {

private static final net.minecraft.client.Minecraft a;

public jZ() {
super();
}


static {
a = net.minecraft.client.Minecraft.a__fM();
}


public float width(com.moon.scripting.api.enums.CustomFontType p0, float p1, java.lang.String p2) {
java.lang.Object local4 = com.moon.kG.a(((com.moon.scripting.api.enums.CustomFontType)(p0)));
    return ((com.moon.jm)(((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(local4))))).a(((java.lang.String)(p2)), ((float)(p1)));
}


public float height(com.moon.scripting.api.enums.CustomFontType p0, float p1, java.lang.String p2) {
java.lang.Object local4 = com.moon.kG.a(((com.moon.scripting.api.enums.CustomFontType)(p0)));
    return ((com.moon.jm)(((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(local4))))).b(((java.lang.String)(p2)), ((float)(p1)));
}


public float minecraft_height() {
return ((float) ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.jZ.a)).N)).c);
}


public float minecraft_width(java.lang.String p0) {
return ((float) ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.jZ.a)).N)).a(((java.lang.String)(p0))));
}

}
