package com.moon;


public class nT {

private static final long a;

public nT() {
super();
}


static {
a = (moom._c.a(4507000758628987485L, -2755151260442028783L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(13431064358322L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static com.moon.pv[] a(com.moon.n4 p0) {
float local1 = (com.moon.nE.b() * 0x1.333334p-3f);
    float local2 = (((com.moon.n4)(p0)).a__Float() / local1);
    float local3 = (((com.moon.n4)(p0)).b__Float() / local1);
    return new com.moon.pv[] {new com.moon.pv(java.lang.Math.floor(((double)(((double) local2)))), java.lang.Math.floor(((double)(((double) local3))))), new com.moon.pv(java.lang.Math.ceil(((double)(((double) local2)))), java.lang.Math.floor(((double)(((double) local3))))), new com.moon.pv(java.lang.Math.ceil(((double)(((double) local2)))), java.lang.Math.ceil(((double)(((double) local3))))), new com.moon.pv(java.lang.Math.floor(((double)(((double) local2)))), java.lang.Math.ceil(((double)(((double) local3)))))};
}


private static com.moon.n4 a(com.moon.n4 p0, com.moon.n4 p1, com.moon.pv[] p2) {
com.moon.n4 lexicalValue298_105_0;
    boolean spill298_0;
    com.moon.n4 spill298_1;
    long life3_3;
    float life6_5;
    float life7_7;
    com.moon.n4 life8_9;
    com.moon.pv[] life9_12;
    int life10_15;
    int life5_16;
    int life11_18;
    com.moon.pv life12_25;
    double life13_33;
    double life15_41;
    com.moon.n4 life17_57;
    float life18_71;
    float life19_79;
    float life20_90;
    lexical_join_105: {
    lexical_join_104: {
    life3_3 = (com.moon.nT.a ^ 26396215437446L);
    life6_5 = com.moon.nE.b();
    life7_7 = 0x1.fffffep127f;
    life8_9 = p0;
    spill298_0 = com.moon.aO.b__Boolean();
    life9_12 = p2;
    life10_15 = (life9_12).length;
    life5_16 = ((spill298_0) ? 1 : 0);
    life11_18 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_102: {
    lexical_join_101: {
    if (!((life11_18 < life10_15))) {
        break lexical_join_104;
    }
    life12_25 = (life9_12)[life11_18];
    life13_33 = ((__sourceExactField_n(((com.moon.pv)(life12_25))) * ((double) life6_5)) * 0x1.333334p-3d);
    life15_41 = ((__sourceExactField_o(((com.moon.pv)(life12_25))) * ((double) life6_5)) * 0x1.333334p-3d);
    life17_57 = new com.moon.n4(((float) (((double) __sourceExactCall_e6bfe129190977(((com.moon.n4)(p0)))) + life13_33)), ((float) (((double) __sourceExactCall_03c72fc957b736(((com.moon.n4)(p0)))) + life15_41)));
    ((com.moon.n4)(life17_57)).b(((float)(moom.Dr.a(((float)(((com.moon.n4)(life17_57)).b__Float())), ((float)(-0x1.68p6f)), ((float)(0x1.68p6f))))));
    life18_71 = (((com.moon.n4)(life17_57)).a__Float() - ((com.moon.n4)(p1)).a__Float());
    spill298_1 = life17_57;
    if (!((life5_16 == 0))) {
        lexicalValue298_105_0 = spill298_1;
        break lexical_join_105;
    }
    life19_79 = (((com.moon.n4)(spill298_1)).b__Float() - ((com.moon.n4)(p1)).b__Float());
    life20_90 = ((float) java.lang.Math.sqrt(((double)(((double) ((life18_71 * life18_71) + (life19_79 * life19_79)))))));
    if (!((life5_16 == 0))) {
        break lexical_join_102;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life20_90)), ((float)(life7_7))) < 0))) {
        break lexical_join_101;
    }
    life8_9 = life17_57;
    life7_7 = life20_90;
    }
    life11_18 += 1;
    }
    if (!((life5_16 != 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue298_105_0 = life8_9;
    }
    return lexicalValue298_105_0;
}


public static com.moon.n4 a(com.moon.n4 p0, com.moon.n4 p1) {
com.moon.n4 local2 = new com.moon.n4(moom.Dr.e(((float)((((com.moon.n4)(p1)).a__Float() - ((com.moon.n4)(p0)).a__Float())))), (((com.moon.n4)(p1)).b__Float() - ((com.moon.n4)(p0)).b__Float()));
    com.moon.pv[] local3 = com.moon.nT.a(((com.moon.n4)(local2)));
    return com.moon.nT.a(((com.moon.n4)(p0)), ((com.moon.n4)(p1)), ((com.moon.pv[])(local3)));
}


private static native float __sourceExactCall_e6bfe129190977(com.moon.n4 p0);
private static native float __sourceExactCall_03c72fc957b736(com.moon.n4 p0);

private static native double __sourceExactField_n(com.moon.pv value);
private static native double __sourceExactField_o(com.moon.pv value);
}
