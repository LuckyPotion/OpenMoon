package com.moon;


public class aO extends java.awt.Color {

private static boolean b;

private static final long a;

public aO(int p0, boolean p1) {
super(p0, p1);
}


public aO(float p0, float p1, float p2) {
super(p0, p1, p2);
}


public aO(float p0, float p1, float p2, float p3) {
super(p0, p1, p2, p3);
}


public aO(java.awt.color.ColorSpace p0, float[] p1, float p2) {
super(p0, p1, p2);
}


public aO(int p0, int p1, int p2) {
super(p0, p1, p2);
}


public aO(int p0, int p1, int p2, int p3) {
super(p0, p1, p2, p3);
}


public aO(int p0) {
super(p0, true);
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-7807866697676594199L)), ((long)(7990367780040677393L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(222540101229543L)))));
    if (com.moon.aO.b__Boolean()) {
        com.moon.aO.b(((boolean)(true)));
    }
}


public static void b(boolean p0) {
com.moon.aO.b = ((boolean)(p0));
    return;
}


public static boolean b__Boolean() {
return ((((com.moon.aO.b) ? 1 : 0)) != 0);
}


public com.moon.aO b(float p0) {
float[] local2 = new float[3];
    java.awt.Color.RGBtoHSB(((int)(((com.moon.aO)(this)).getRed())), ((int)(((com.moon.aO)(this)).getGreen())), ((int)(((com.moon.aO)(this)).getBlue())), ((float[])(local2)));
    return new com.moon.aO(((java.awt.Color)(new java.awt.Color(java.awt.Color.HSBtoRGB(((float)((local2)[0])), ((float)(p0)), ((float)((local2)[2])))))).getRGB());
}


public com.moon.aO b() {
return new com.moon.aO(((java.awt.Color)(super.darker())).getRGB());
}


public com.moon.aO c(float p0) {
float[] local2 = new float[3];
    java.awt.Color.RGBtoHSB(((int)(((com.moon.aO)(this)).getRed())), ((int)(((com.moon.aO)(this)).getGreen())), ((int)(((com.moon.aO)(this)).getBlue())), ((float[])(local2)));
    return new com.moon.aO(((java.awt.Color)(new java.awt.Color(java.awt.Color.HSBtoRGB(((float)((local2)[0])), ((float)((local2)[1])), ((float)(p0)))))).getRGB());
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.aO.b__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


private double a(double p0, double p1, double p2) {
double forwardValue14_16_0;
    double forwardValue14_16_1;
    double forwardValue14_17_0;
    double spill14_0;
    double spill14_1;
    long life7_3;
    int life9_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    life7_3 = (com.moon.aO.a ^ 5879842136466L);
    life9_5 = ((com.moon.aO.b__Boolean()) ? 1 : 0);
    spill14_0 = p0;
    spill14_1 = p2;
    if (!((life9_5 == 0))) {
        forwardValue14_16_0 = spill14_0;
        forwardValue14_16_1 = spill14_1;
        break forward_join_16;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill14_0)), ((double)(spill14_1))) > 0))) {
        break forward_join_14;
    }
    forwardValue14_17_0 = p2;
    break forward_join_17;
    }
    forwardValue14_16_0 = p0;
    forwardValue14_16_1 = p1;
    }
    forwardValue14_17_0 = java.lang.Math.max(((double)(forwardValue14_16_0)), ((double)(forwardValue14_16_1)));
    }
    return forwardValue14_17_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.aO a() {
return new com.moon.aO(((java.awt.Color)(super.brighter())).getRGB());
}


public com.moon.aO a__aO(int p0) {
p0 = ((int) this.a(((double)(((double) p0))), ((double)(0x0.0p0d)), ((double)(0x1.fep7d))));
    return new com.moon.aO(((com.moon.aO)(this)).getRed(), ((com.moon.aO)(this)).getGreen(), ((com.moon.aO)(this)).getBlue(), p0);
}


public static com.moon.aO a(double p0) {
float local2 = ((float) (0x1.0p0d - (p0 / 0x1.68p8d)));
    int local3 = java.awt.Color.HSBtoRGB(((float)(local2)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return new com.moon.aO(((java.awt.Color)(new java.awt.Color(local3))).getRGB());
}


public com.moon.aO a(float p0) {
int local2 = ((int) this.a(((double)(((double) (p0 * 0x1.fep7f)))), ((double)(0x0.0p0d)), ((double)(0x1.fep7d))));
    return new com.moon.aO(((com.moon.aO)(this)).getRed(), ((com.moon.aO)(this)).getGreen(), ((com.moon.aO)(this)).getBlue(), local2);
}


public int a(int p0) {
float local2 = (((float) p0) / 0x1.9p6f);
    float[] local3 = new float[3];
    java.awt.Color.RGBtoHSB(((int)(((com.moon.aO)(this)).getRed())), ((int)(((com.moon.aO)(this)).getGreen())), ((int)(((com.moon.aO)(this)).getBlue())), ((float[])(local3)));
    return ((java.awt.Color)(new java.awt.Color(java.awt.Color.HSBtoRGB(((float)((local3)[0])), ((float)((local3)[1])), ((float)(local2)))))).getRGB();
}


public java.awt.Color brighter() {
return this.a();
}


public java.awt.Color darker() {
return this.b();
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
