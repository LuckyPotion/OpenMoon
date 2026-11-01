package com.moon;


public class nI {

public static float a;

public static float b;

public static float c;

public static float d;

public static float e;

public static float f;

private static final java.util.Random g;

private static final long h;

public nI() {
super();
}


static {
h = (moom._c.a(4371997141129434392L, -8891110637057846048L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(126689311603969L);
    a = 0x1.921fb60000000p+1f;
    b = (0x1.0000000000000p+1f * com.moon.nI.a);
    c = ((float) (((0x1.0000000000000p+0d + java.lang.Math.sqrt(0x1.4000000000000p+2d)) / 0x1.0000000000000p+1d)));
    d = ((float) (java.lang.Math.sqrt(0x1.0000000000000p+1d)));
    e = (com.moon.nI.a / 0x1.6800000000000p+7f);
    f = (0x1.6800000000000p+7f / com.moon.nI.a);
    g = new java.util.Random();
}


public static float b(double[] p0) {
float lexicalValue287_36_0;
    boolean spill287_0;
    float spill287_1;
    long life1_3;
    float life4_5;
    double[] life5_8;
    int life3_9;
    int life6_12;
    int life7_14;
    double life8_21;
    lexical_join_36: {
    lexical_join_35: {
    life1_3 = (com.moon.nI.h ^ 118629421312865L);
    life4_5 = 0x0.0p0f;
    spill287_0 = com.moon.aO.c();
    life5_8 = p0;
    life3_9 = ((spill287_0) ? 1 : 0);
    life6_12 = (life5_8).length;
    life7_14 = 0;
    lexical_cycle_15: while (true) {
    if (!((life7_14 < life6_12))) {
        break lexical_join_35;
    }
    life8_21 = (life5_8)[life7_14];
    spill287_1 = ((float) (((double) life4_5) + (life8_21 * life8_21)));
    if (!((life3_9 != 0))) {
        lexicalValue287_36_0 = spill287_1;
        break lexical_join_36;
    }
    life4_5 = spill287_1;
    life7_14 += 1;
    if (!((life3_9 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue287_36_0 = life4_5;
    }
    return lexicalValue287_36_0;
}


public static float b(float[] p0) {
float lexicalValue288_34_0;
    boolean spill288_0;
    float spill288_1;
    long life1_3;
    float life4_6;
    int life3_7;
    float[] life5_9;
    int life6_12;
    int life7_14;
    float life8_21;
    lexical_join_34: {
    lexical_join_33: {
    life1_3 = (com.moon.nI.h ^ 110874328384697L);
    spill288_0 = com.moon.aO.c();
    life4_6 = 0x0.0p0f;
    life3_7 = ((spill288_0) ? 1 : 0);
    life5_9 = p0;
    life6_12 = (life5_9).length;
    life7_14 = 0;
    lexical_cycle_15: while (true) {
    if (!((life7_14 < life6_12))) {
        break lexical_join_33;
    }
    life8_21 = (life5_9)[life7_14];
    spill288_1 = (life4_6 + (life8_21 * life8_21));
    if (!((life3_7 != 0))) {
        lexicalValue288_34_0 = spill288_1;
        break lexical_join_34;
    }
    life4_6 = spill288_1;
    life7_14 += 1;
    if (!((life3_7 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue288_34_0 = life4_6;
    }
    return lexicalValue288_34_0;
}


public static float a(float p0, float p1) {
return (((p1 - p0) * ((java.util.Random)(com.moon.nI.g)).nextFloat()) + p0);
}


public static double a(double p0, double p1) {
return (((p1 - p0) * ((java.util.Random)(com.moon.nI.g)).nextDouble()) + p0);
}


public static float a(float p0) {
return (((float) java.lang.Math.round(((float)((p0 * 0x1.0p1f))))) / 0x1.0p1f);
}


public static int a(int p0, int p1) {
return (((java.util.Random)(com.moon.nI.g)).nextInt(((int)(((p1 - p0) + 1)))) + p0);
}


public static moom.DR a__DR(float p0, float p1) {
float local2 = moom.Dr.b(((float)((((-p0) * com.moon.nE.c) - com.moon.nE.b))));
    float local3 = moom.Dr.a(((float)((((-p0) * com.moon.nE.c) - com.moon.nE.b))));
    float local4 = (-moom.Dr.b(((float)(((-p1) * com.moon.nE.c)))));
    float local5 = moom.Dr.a(((float)(((-p1) * com.moon.nE.c))));
    return new moom.DR(((double) (local3 * local4)), ((double) local5), ((double) (local2 * local4)));
}


public static float a(double[] p0) {
return moom.Dr.c(((float)(com.moon.nI.b(((double[])(p0))))));
}


public static float[] a(com.moon.pw p0, com.moon.pw p1) {
com.moon.pw local2 = ((com.moon.pw)(p1)).b(((com.moon.pw)(p0)));
    float local3 = moom.Dr.c(((float)(((((com.moon.pw)(local2)).p() * ((com.moon.pw)(local2)).p()) + (((com.moon.pw)(local2)).r() * ((com.moon.pw)(local2)).r())))));
    float local4 = ((moom.Dr.a(((float)(((com.moon.pw)(local2)).r())), ((float)(((com.moon.pw)(local2)).p()))) * com.moon.nI.f) - 0x1.68p6f);
    float local5 = ((-moom.Dr.a(((float)(((com.moon.pw)(local2)).q())), ((float)(local3)))) * com.moon.nI.f);
    return new float[] {local4, local5};
}


public static float a(float[] p0) {
return moom.Dr.c(((float)(com.moon.nI.b(((float[])(p0))))));
}


public static double a(double p0, int p1) {
double local3 = java.lang.Math.pow(((double)(0x1.4p3d)), ((double)(((double) p1))));
    return (((double) java.lang.Math.round(((double)((p0 * local3))))) / local3);
}

}
