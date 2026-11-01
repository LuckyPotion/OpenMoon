package com.moon;


public class mq implements com.moon.mo {

private final com.moon.setting.ColorSetting a;

private final float[] b;

private long c;

private static final long d;

public mq(com.moon.setting.ColorSetting p0) {
super();
    this.b = new float[4];
    this.a = p0;
}


static {
d = (moom._c.a(6297652509945565264L, 7891256072993088477L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(190012230802130L);
}


public void b() {
com.moon.mq forwardValue968_14_0;
    com.moon.mq spill968_0;
    long life1_3;
    int[] life3_5;
    java.awt.Color life4_29;
    forward_join_98: {
    forward_join_97: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (com.moon.mq.d ^ 9279958806345L);
    life3_5 = com.moon.my.b__ArrayInt();
    spill968_0 = this;
    if (!((life3_5 != null))) {
        forwardValue968_14_0 = spill968_0;
        break forward_join_14;
    }
    if (!((!((com.moon.setting.ColorSetting)(((com.moon.mq)(spill968_0)).a)).isAvailable()))) {
        break forward_join_13;
    }
    return;
    }
    forwardValue968_14_0 = this;
    }
    imgui.ImGui.pushID(((long)(((com.moon.mq)(forwardValue968_14_0)).c)));
    life4_29 = new java.awt.Color(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(this.a)).getValue())))).intValue());
    (this.b)[0] = (((float) ((java.awt.Color)(life4_29)).getRed()) / 0x1.fep7f);
    (this.b)[1] = (((float) ((java.awt.Color)(life4_29)).getGreen()) / 0x1.fep7f);
    (this.b)[2] = (((float) ((java.awt.Color)(life4_29)).getBlue()) / 0x1.fep7f);
    (this.b)[3] = (((float) ((java.awt.Color)(life4_29)).getAlpha()) / 0x1.fep7f);
    imgui.ImGui.colorEdit4(((java.lang.String)(((com.moon.setting.ColorSetting)(this.a)).getDisplayName())), ((float[])(this.b)), ((int)(2)));
    if (!((life3_5 != null))) {
        break forward_join_98;
    }
    if (!(imgui.ImGui.isItemEdited())) {
        break forward_join_97;
    }
    ((com.moon.setting.ColorSetting)(this.a)).setValue(((java.lang.Integer.valueOf(((int)(((java.awt.Color)(new java.awt.Color((this.b)[0], (this.b)[1], (this.b)[2], (this.b)[3]))).getRGB()))))));
    }
    imgui.ImGui.popID();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
long life1_3;
    java.awt.Color life4_12;
    int[] life3_32;
    life1_3 = (com.moon.mq.d ^ 113276804663049L);
    life4_12 = new java.awt.Color(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(this.a)).getValue())))).intValue());
    (this.b)[0] = (((float) ((java.awt.Color)(life4_12)).getRed()) / 0x1.fep7f);
    int[] spill2277_0 = com.moon.my.b__ArrayInt();
    (this.b)[1] = (((float) ((java.awt.Color)(life4_12)).getGreen()) / 0x1.fep7f);
    life3_32 = spill2277_0;
    (this.b)[2] = (((float) ((java.awt.Color)(life4_12)).getBlue()) / 0x1.fep7f);
    (this.b)[3] = (((float) ((java.awt.Color)(life4_12)).getAlpha()) / 0x1.fep7f);
    this.c = ((long)(java.lang.Math.round(((double)((java.lang.Math.random() * 0x1.dcd65p29d))))));
    if ((life3_32 == null)) {
        __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}


private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
