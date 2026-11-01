package moom;


public class DR {

public double a;

public double b;

public double c;

private static int[] d;

private static long e;

public DR(double p0, double p1, double p2) { super(); }


private static void __sourceConstructorBody_fe1db4f07e08db8f(moom.DR receiver, double p0, double p1, double p2) throws Throwable {

long local7 = (moom.DR.e ^ 77272330596007L);

    moom.DR.__sourceConstructorInit_fe1db4f07e08db8f_0(((moom.DR)(receiver)));

    if ((p0 == -0x0.0p0d)) {

        p0 = 0x0.0p0d;

    }

    if ((p1 == -0x0.0p0d)) {

        p1 = 0x0.0p0d;

    }

    if ((p2 == -0x0.0p0d)) {

        p2 = 0x0.0p0d;

    }

    ((moom.DR)(receiver)).a = ((double)(p0));

    ((moom.DR)(receiver)).b = ((double)(p1));

    ((moom.DR)(receiver)).c = ((double)(p2));

    return;

}



public DR(moom.DS p0) {
this(((double)(((double) ((moom.DS)(p0)).a()))), ((double)(((double) ((moom.DS)(p0)).b()))), ((double)(((double) ((moom.DS)(p0)).c()))));
    return;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-680699068258602783L)), ((long)(-7491949488084389735L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(188464419014034L)))));
    if ((moom.DR.b() != null)) {
        moom.DR.b(((int[])(new int[4])));
    }
}

private static native <E extends Throwable> void __sourceConstructorInit_fe1db4f07e08db8f_0(moom.DR a0) throws E;

public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1106_3(this.a, this.b, this.c);
}


public moom.DR b(double p0, double p1, double p2) {
return new moom.DR((this.a + p0), (this.b + p1), (this.c + p2));
}


public double b(moom.DR p0) {
double local2 = (((moom.DR)(p0)).a - this.a);
    double local4 = (((moom.DR)(p0)).b - this.b);
    double local6 = (((moom.DR)(p0)).c - this.c);
    return ((double) moom.Dr.a__Float(((double)((((local2 * local2) + (local4 * local4)) + (local6 * local6))))));
}


public moom.DR b(float p0) {
float local2 = moom.Dr.b(((float)(p0)));
    float local3 = moom.Dr.a(((float)(p0)));
    double local4 = ((this.a * ((double) local2)) + (this.c * ((double) local3)));
    double local6 = ((this.c * ((double) local2)) - (this.a * ((double) local3)));
    return new moom.DR(local4, this.b, local6);
}


public moom.DR b(moom.DR p0, double p1) {
double forwardValue1698_39_0;
    double forwardValue1698_39_1;
    int forwardValue1698_50_0;
    moom.DR forwardValue1698_74_0;
    boolean spill1698_0;
    double spill1698_1;
    double spill1698_2;
    int spill1698_3;
    long life4_3;
    double life7_9;
    double life9_15;
    double life11_22;
    int life6_23;
    double life13_45;
    forward_join_74: {
    forward_join_73: {
    forward_join_50: {
    forward_join_39: {
    forward_join_34: {
    life4_3 = (moom.DR.e ^ 12292705325365L);
    life7_9 = (((moom.DR)(p0)).a - this.a);
    life9_15 = (((moom.DR)(p0)).b - this.b);
    spill1698_0 = moom.DS.b__Boolean();
    life11_22 = (((moom.DR)(p0)).c - this.c);
    life6_23 = ((spill1698_0) ? 1 : 0);
    spill1698_1 = (life9_15 * life9_15);
    spill1698_2 = 0x1.ad7f2ap-24d;
    if (!((life6_23 == 0))) {
        forwardValue1698_39_0 = spill1698_1;
        forwardValue1698_39_1 = spill1698_2;
        break forward_join_39;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1698_1)), ((double)(spill1698_2))) < 0))) {
        break forward_join_34;
    }
    return null;
    }
    forwardValue1698_39_0 = (p1 - this.b);
    forwardValue1698_39_1 = life9_15;
    }
    life13_45 = (forwardValue1698_39_0 / forwardValue1698_39_1);
    spill1698_3 = recovery.source.CarrierOps.dcmpl(((double)(life13_45)), ((double)(0x0.0p0d)));
    if (!((life6_23 == 0))) {
        forwardValue1698_50_0 = spill1698_3;
        break forward_join_50;
    }
    if (!((spill1698_3 >= 0))) {
        break forward_join_73;
    }
    forwardValue1698_50_0 = recovery.source.CarrierOps.dcmpg(((double)(life13_45)), ((double)(0x1.0p0d)));
    }
    if (!((forwardValue1698_50_0 <= 0))) {
        break forward_join_73;
    }
    forwardValue1698_74_0 = new moom.DR((this.a + (life7_9 * life13_45)), (this.b + (life9_15 * life13_45)), (this.c + (life11_22 * life13_45)));
    break forward_join_74;
    }
    forwardValue1698_74_0 = null;
    }
    return forwardValue1698_74_0;
}


public static int[] b() {
return moom.DR.d;
}


public static void b(int[] p0) {
d = ((int[])(p0));
    return;
}


public moom.DR b__DR(moom.DR p0) {
return new moom.DR(((this.b * ((moom.DR)(p0)).c) - (this.c * ((moom.DR)(p0)).b)), ((this.c * ((moom.DR)(p0)).a) - (this.a * ((moom.DR)(p0)).c)), ((this.a * ((moom.DR)(p0)).b) - (this.b * ((moom.DR)(p0)).a)));
}


public double c(moom.DR p0) {
double local2 = (((moom.DR)(p0)).a - this.a);
    double local4 = (((moom.DR)(p0)).b - this.b);
    double local6 = (((moom.DR)(p0)).c - this.c);
    return (((local2 * local2) + (local4 * local4)) + (local6 * local6));
}


public moom.DR c(moom.DR p0, double p1) {
double forwardValue1699_39_0;
    double forwardValue1699_39_1;
    int forwardValue1699_50_0;
    moom.DR forwardValue1699_74_0;
    boolean spill1699_0;
    double spill1699_1;
    double spill1699_2;
    int spill1699_3;
    long life4_3;
    double life7_10;
    double life9_16;
    double life11_22;
    int life6_23;
    double life13_45;
    forward_join_74: {
    forward_join_73: {
    forward_join_50: {
    forward_join_39: {
    forward_join_34: {
    life4_3 = (moom.DR.e ^ 14401292333611L);
    spill1699_0 = moom.DS.c__Boolean();
    life7_10 = (((moom.DR)(p0)).a - this.a);
    life9_16 = (((moom.DR)(p0)).b - this.b);
    life11_22 = (((moom.DR)(p0)).c - this.c);
    life6_23 = ((spill1699_0) ? 1 : 0);
    spill1699_1 = (life11_22 * life11_22);
    spill1699_2 = 0x1.ad7f2ap-24d;
    if (!((life6_23 != 0))) {
        forwardValue1699_39_0 = spill1699_1;
        forwardValue1699_39_1 = spill1699_2;
        break forward_join_39;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1699_1)), ((double)(spill1699_2))) < 0))) {
        break forward_join_34;
    }
    return null;
    }
    forwardValue1699_39_0 = (p1 - this.c);
    forwardValue1699_39_1 = life11_22;
    }
    life13_45 = (forwardValue1699_39_0 / forwardValue1699_39_1);
    spill1699_3 = recovery.source.CarrierOps.dcmpl(((double)(life13_45)), ((double)(0x0.0p0d)));
    if (!((life6_23 != 0))) {
        forwardValue1699_50_0 = spill1699_3;
        break forward_join_50;
    }
    if (!((spill1699_3 >= 0))) {
        break forward_join_73;
    }
    forwardValue1699_50_0 = recovery.source.CarrierOps.dcmpg(((double)(life13_45)), ((double)(0x1.0p0d)));
    }
    if (!((forwardValue1699_50_0 <= 0))) {
        break forward_join_73;
    }
    forwardValue1699_74_0 = new moom.DR((this.a + (life7_10 * life13_45)), (this.b + (life9_16 * life13_45)), (this.c + (life11_22 * life13_45)));
    break forward_join_74;
    }
    forwardValue1699_74_0 = null;
    }
    return forwardValue1699_74_0;
}


public moom.DR c(float p0) {
return new moom.DR((this.a * ((double) p0)), (this.b * ((double) p0)), (this.c * ((double) p0)));
}


public moom.DR c__DR(moom.DR p0) {
return ((moom.DR)(this)).a(((double)(((moom.DR)(p0)).a)), ((double)(((moom.DR)(p0)).b)), ((double)(((moom.DR)(p0)).c)));
}


public moom.DR d(moom.DR p0) {
return ((moom.DR)(this)).b(((double)(((moom.DR)(p0)).a)), ((double)(((moom.DR)(p0)).b)), ((double)(((moom.DR)(p0)).c)));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.DR a(float p0) {
float local2 = moom.Dr.b(((float)(p0)));
    float local3 = moom.Dr.a(((float)(p0)));
    double local4 = ((this.b * ((double) local2)) + (this.c * ((double) local3)));
    double local6 = ((this.c * ((double) local2)) - (this.b * ((double) local3)));
    return new moom.DR(this.a, local4, local6);
}


public moom.DR a__DR(moom.DR p0) {
return new moom.DR((((moom.DR)(p0)).a - this.a), (((moom.DR)(p0)).b - this.b), (((moom.DR)(p0)).c - this.c));
}


public moom.DR a__DR() {
long local1 = (moom.DR.e ^ 69889933730084L);
    double local3 = ((double) moom.Dr.a__Float(((double)((((this.a * this.a) + (this.b * this.b)) + (this.c * this.c))))));
    return ((local3 < 0x1.a36e2eb1c432dp-14d) ? new moom.DR(0x0.0p0d, 0x0.0p0d, 0x0.0p0d) : new moom.DR((this.a / local3), (this.b / local3), (this.c / local3)));
}


public double a(moom.DR p0) {
return (((this.a * ((moom.DR)(p0)).a) + (this.b * ((moom.DR)(p0)).b)) + (this.c * ((moom.DR)(p0)).c));
}


public moom.DR a(double p0, double p1, double p2) {
return ((moom.DR)(this)).b(((double)((-p0))), ((double)((-p1))), ((double)((-p2))));
}


public double a() {
return ((double) moom.Dr.a__Float(((double)((((this.a * this.a) + (this.b * this.b)) + (this.c * this.c))))));
}


public moom.DR a(moom.DR p0, double p1) {
double forwardValue1697_39_0;
    double forwardValue1697_39_1;
    int forwardValue1697_50_0;
    moom.DR forwardValue1697_74_0;
    boolean spill1697_0;
    double spill1697_1;
    double spill1697_2;
    int spill1697_3;
    long life4_3;
    double life7_10;
    int life6_11;
    double life9_17;
    double life11_23;
    double life13_45;
    forward_join_74: {
    forward_join_73: {
    forward_join_50: {
    forward_join_39: {
    forward_join_34: {
    life4_3 = (moom.DR.e ^ 26028618399235L);
    spill1697_0 = moom.DS.c__Boolean();
    life7_10 = (((moom.DR)(p0)).a - this.a);
    life6_11 = ((spill1697_0) ? 1 : 0);
    life9_17 = (((moom.DR)(p0)).b - this.b);
    life11_23 = (((moom.DR)(p0)).c - this.c);
    spill1697_1 = (life7_10 * life7_10);
    spill1697_2 = 0x1.ad7f2ap-24d;
    if (!((life6_11 != 0))) {
        forwardValue1697_39_0 = spill1697_1;
        forwardValue1697_39_1 = spill1697_2;
        break forward_join_39;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1697_1)), ((double)(spill1697_2))) < 0))) {
        break forward_join_34;
    }
    return null;
    }
    forwardValue1697_39_0 = (p1 - this.a);
    forwardValue1697_39_1 = life7_10;
    }
    life13_45 = (forwardValue1697_39_0 / forwardValue1697_39_1);
    spill1697_3 = recovery.source.CarrierOps.dcmpl(((double)(life13_45)), ((double)(0x0.0p0d)));
    if (!((life6_11 != 0))) {
        forwardValue1697_50_0 = spill1697_3;
        break forward_join_50;
    }
    if (!((spill1697_3 >= 0))) {
        break forward_join_73;
    }
    forwardValue1697_50_0 = recovery.source.CarrierOps.dcmpg(((double)(life13_45)), ((double)(0x1.0p0d)));
    }
    if (!((forwardValue1697_50_0 <= 0))) {
        break forward_join_73;
    }
    forwardValue1697_74_0 = new moom.DR((this.a + (life7_10 * life13_45)), (this.b + (life9_17 * life13_45)), (this.c + (life11_23 * life13_45)));
    break forward_join_74;
    }
    forwardValue1697_74_0 = null;
    }
    return forwardValue1697_74_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1106_3(double a0, double a1, double a2) throws E;
}
