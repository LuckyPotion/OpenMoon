package moom;


public class FW extends moom.FT {

private moom.FX[] a;

private int b;

private static long c;

public FW(java.util.Random p0, int p1) { super(); }


private static void __sourceConstructorBody_94523704f59fe846(moom.FW receiver, java.util.Random p0, int p1) throws Throwable {

long local3_life1 = (moom.FW.c ^ 63847030270489L);

    moom.FW.__sourceConstructorInit_94523704f59fe846_0(((moom.FW)(receiver)));

    ((moom.FW)(receiver)).b = ((int)(p1));

    ((moom.FW)(receiver)).a = ((moom.FX[])(new moom.FX[p1]));

    int local5_life5 = 0;

    while ((local5_life5 < p1)) {

        (((moom.FW)(receiver)).a)[local5_life5] = new moom.FX(p0);

        local5_life5 += 1;

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_94523704f59fe846_0(moom.FW a0) throws E;

static {
moom.FW.c = (moom._c.a(5523596544865532713L, -7543005975814509491L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(26885326856490L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public double[] a(double[] p0, double p1, double p2, int p3, int p4, double p5, double p6, double p7, double p8) {
int lexicalValue652_25_0;
    int lexicalValue652_25_1;
    double[] lexicalValue652_27_0;
    double[] spill652_0;
    int spill652_1;
    int spill652_2;
    long life16_3;
    java.lang.String[] life18_5;
    double life19_44;
    double life21_46;
    int life23_48;
    lexical_join_72: {
    lexical_join_28: {
    lexical_join_27: {
    lexical_join_25: {
    lexical_join_23: {
    life16_3 = (moom.FW.c ^ 21451390340665L);
    life18_5 = moom.FI.b();
    spill652_0 = p0;
    if (!((life18_5 != null))) {
        lexicalValue652_27_0 = spill652_0;
        break lexical_join_27;
    }
    if (!((spill652_0 != null))) {
        break lexical_join_23;
    }
    spill652_1 = (p0).length;
    spill652_2 = (p3 * p4);
    if (!((life18_5 != null))) {
        lexicalValue652_25_0 = spill652_1;
        lexicalValue652_25_1 = spill652_2;
        break lexical_join_25;
    }
    if (!((spill652_1 >= spill652_2))) {
        break lexical_join_23;
    }
    java.util.Arrays.fill(((double[])(p0)), ((double)(0x0.0p0d)));
    if (!((life18_5 == null))) {
        break lexical_join_28;
    }
    }
    lexicalValue652_25_0 = p3;
    lexicalValue652_25_1 = p4;
    }
    lexicalValue652_27_0 = new double[(lexicalValue652_25_0 * lexicalValue652_25_1)];
    }
    p0 = lexicalValue652_27_0;
    }
    life19_44 = 0x1.0p0d;
    life21_46 = 0x1.0p0d;
    life23_48 = 0;
    lexical_cycle_34: while (true) {
    if (!((life23_48 < this.b))) {
        break lexical_join_72;
    }
    ((moom.FX)((this.a)[life23_48])).a(((double[])(p0)), ((double)(p1)), ((double)(p2)), ((int)(p3)), ((int)(p4)), ((double)(((p5 * life21_46) * life19_44))), ((double)(((p6 * life21_46) * life19_44))), ((double)((0x1.199999999999ap-1d / life19_44))));
    life21_46 = (life21_46 * p7);
    life19_44 = (life19_44 * p8);
    life23_48 += 1;
    if (!((life18_5 == null))) { continue lexical_cycle_34; }
    break lexical_cycle_34;
    }
    }
    return p0;
}


public double[] a(double[] p0, double p1, double p2, int p3, int p4, double p5, double p6, double p7) {
return ((moom.FW)(this)).a(((double[])(p0)), ((double)(p1)), ((double)(p2)), ((int)(p3)), ((int)(p4)), ((double)(p5)), ((double)(p6)), ((double)(p7)), ((double)(0x1.0p-1d)));
}


public double a(double p0, double p1) {
double lexicalValue651_42_0;
    java.lang.String[] spill651_0;
    double spill651_1;
    long life5_3;
    double life8_5;
    double life10_8;
    int life12_10;
    java.lang.String[] life7_11;
    lexical_join_42: {
    lexical_join_41: {
    life5_3 = (moom.FW.c ^ 96847742734401L);
    life8_5 = 0x0.0p0d;
    spill651_0 = moom.FI.b();
    life10_8 = 0x1.0p0d;
    life12_10 = 0;
    life7_11 = spill651_0;
    lexical_cycle_12: while (true) {
    if (!((life12_10 < this.b))) {
        break lexical_join_41;
    }
    life8_5 = (life8_5 + (((moom.FX)((this.a)[life12_10])).a(((double)((p0 * life10_8))), ((double)((p1 * life10_8)))) / life10_8));
    spill651_1 = (life10_8 / 0x1.0p1d);
    if (!((life7_11 != null))) {
        lexicalValue651_42_0 = spill651_1;
        break lexical_join_42;
    }
    life10_8 = spill651_1;
    life12_10 += 1;
    if (!((life7_11 == null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue651_42_0 = life8_5;
    }
    return lexicalValue651_42_0;
}

}
