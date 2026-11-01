package com.moon;


public class hV {

private static final long a;

public hV() {
super();
}


static {
a = (moom._c.a(3047640733222415053L, 8121777036510359693L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(36868149400670L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static org.lwjgl.util.vector.Matrix4f a(java.nio.FloatBuffer p0) {
org.lwjgl.util.vector.Matrix4f local1_life0 = new org.lwjgl.util.vector.Matrix4f();
    ((org.lwjgl.util.vector.Matrix4f)(local1_life0)).load(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(p0)).duplicate())));
    return local1_life0;
}


public static void a(org.lwjgl.util.vector.Matrix4f p0, java.nio.FloatBuffer p1) {
long life2_3;
    int[] life4_33;
    life2_3 = (com.moon.hV.a ^ 44834600212789L);
    ((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(p1)).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m00))))).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m10))))).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m20))))).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m30)));
    int[] spill327_0 = com.moon.hW.b__ArrayInt();
    ((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(p1)).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m01))))).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m11))))).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m21))))).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m31)));
    life4_33 = spill327_0;
    ((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(p1)).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m02))))).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m12))))).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m22))))).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m32)));
    ((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(p1)).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m03))))).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m13))))).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m23))))).put(((float)(((org.lwjgl.util.vector.Matrix4f)(p0)).m33)));
    ((java.nio.FloatBuffer)(p1)).flip();
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.hW.b(((int[])(new int[1])));
    }
    return;
}


public static org.lwjgl.util.vector.Matrix4f a(float p0, float p1, float p2) {
org.lwjgl.util.vector.Matrix4f local3_life0 = new org.lwjgl.util.vector.Matrix4f();
    ((org.lwjgl.util.vector.Matrix4f)(local3_life0)).m00 = ((float)(p0));
    ((org.lwjgl.util.vector.Matrix4f)(local3_life0)).m11 = ((float)(p1));
    ((org.lwjgl.util.vector.Matrix4f)(local3_life0)).m22 = ((float)(p2));
    return local3_life0;
}


public static org.lwjgl.util.vector.Matrix4f a(float p0, float p1, float p2, float p3, float p4, float p5) {
long life6_3;
    org.lwjgl.util.vector.Matrix4f life9_7;
    float life10_17;
    int[] life8_18;
    float life11_27;
    float life12_36;
    life6_3 = (com.moon.hV.a ^ 32667071952209L);
    life9_7 = new org.lwjgl.util.vector.Matrix4f();
    int[] spill326_0 = com.moon.hW.b__ArrayInt();
    life10_17 = ((-(p1 + p0)) / (p1 - p0));
    life8_18 = spill326_0;
    life11_27 = ((-(p3 + p2)) / (p3 - p2));
    life12_36 = ((-(p5 + p4)) / (p5 - p4));
    ((org.lwjgl.util.vector.Matrix4f)(life9_7)).m00 = ((float)((0x1.0p1f / (p1 - p0))));
    ((org.lwjgl.util.vector.Matrix4f)(life9_7)).m11 = ((float)((0x1.0p1f / (p3 - p2))));
    ((org.lwjgl.util.vector.Matrix4f)(life9_7)).m22 = ((float)((-0x1.0p1f / (p5 - p4))));
    ((org.lwjgl.util.vector.Matrix4f)(life9_7)).m03 = ((float)(life10_17));
    ((org.lwjgl.util.vector.Matrix4f)(life9_7)).m13 = ((float)(life11_27));
    ((org.lwjgl.util.vector.Matrix4f)(life9_7)).m23 = ((float)(life12_36));
    org.lwjgl.util.vector.Matrix4f spill326_1 = life9_7;
    if ((life8_18 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return spill326_1;
}

}
