package com.moon;


public class mB extends com.moon.mA {

protected com.moon.jm h;

private com.moon.nX s;

private com.moon.nX t;

private java.util.List<com.moon.mA> u;

private com.moon.module.Module v;

private com.moon.mZ w;

private boolean x;

private float y;

private boolean z;

private int A;

private boolean B;

private boolean C;

private static long E;

public mB(com.moon.module.Module p0, com.moon.mZ p1, float p2, float p3, float p4, float p5) { super(); }


private static void __sourceConstructorBody_513c0ae4a191fbd1(com.moon.mB receiver, com.moon.module.Module p0, com.moon.mZ p1, float p2, float p3, float p4, float p5) throws Throwable {

long local7_life1 = (com.moon.mB.E ^ 114587615874898L);

    int __sourceSpill165_3 = com.moon.mA.c__Int();

    com.moon.mB.__sourceConstructorInit_513c0ae4a191fbd1_0(((com.moon.mB)(receiver)));

    ((com.moon.mB)(receiver)).h = ((com.moon.jm)(((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)))));

    ((com.moon.mB)(receiver)).s = ((com.moon.nX)(new com.moon.nX()));

    int local9_life11 = __sourceSpill165_3;

    ((com.moon.mB)(receiver)).t = ((com.moon.nX)(new com.moon.nX()));

    ((com.moon.mB)(receiver)).u = ((java.util.List)(new java.util.ArrayList()));

    ((com.moon.mB)(receiver)).v = ((com.moon.module.Module)(p0));

    ((com.moon.mB)(receiver)).w = ((com.moon.mZ)(p1));

    ((com.moon.mB)(receiver)).e = ((float)(p2));

    ((com.moon.mB)(receiver)).f = ((float)(p3));

    ((com.moon.mB)(receiver)).g = ((float)(p4));

    ((com.moon.mB)(receiver)).i = ((float)(p5));

    if ((local9_life11 == 0)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));

    }

    return;

}



static {
com.moon.mB.E = (moom._c.a(167835023870514796L, 7956217010383408037L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(247180513143627L);
}

private static native <E extends Throwable> void __sourceConstructorInit_513c0ae4a191fbd1_0(com.moon.mB a0) throws E;

public boolean i__sourceReturn_aae029aa0a() {
return ((((this.B) ? 1 : 0)) != 0);
}


public com.moon.mB b(boolean p0) {
this.C = ((boolean)(p0));
    return this;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean b__Boolean() {
return ((0) != 0);
}


public void b(int p0, int p1) {
float forwardValue685_19_0;
    float forwardValue685_20_0;
    float forwardValue685_20_1;
    com.moon.mB forwardValue685_23_0;
    com.moon.mB spill685_0;
    float spill685_1;
    long life3_3;
    int life5_5;
    forward_join_27: {
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    forward_join_19: {
    life3_3 = (com.moon.mB.E ^ 116133709797762L);
    life5_5 = com.moon.mA.b__Int();
    spill685_0 = this;
    if (!((life5_5 == 0))) {
        forwardValue685_23_0 = spill685_0;
        break forward_join_23;
    }
    if (!((!((com.moon.mB)(spill685_0)).x))) {
        break forward_join_22;
    }
    spill685_1 = ((com.moon.nX)(this.t)).b();
    if (!(this.C)) {
        forwardValue685_19_0 = spill685_1;
        break forward_join_19;
    }
    forwardValue685_20_0 = spill685_1;
    forwardValue685_20_1 = 0x1.68p4f;
    break forward_join_20;
    }
    forwardValue685_20_0 = forwardValue685_19_0;
    forwardValue685_20_1 = 0x1.88p4f;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(forwardValue685_20_0)), ((float)(forwardValue685_20_1))) > 0))) {
        break forward_join_27;
    }
    }
    forwardValue685_23_0 = this;
    }
    ((com.moon.mB)(forwardValue685_23_0)).a(((int)(p0)), ((int)(p1)), ((boolean)(true)));
    }
    super.b(((int)(p0)), ((int)(p1)));
    return;
}


public void b__Void() {
((java.util.List)(this.u)).forEach(((java.util.function.Consumer)(__sourceIntrinsic_9bf881b104f5_originalDynamicSite502_1())));
    super.b__Void();
    return;
}


public boolean e__Boolean() {
int lexicalValue178_49_0;
    int lexicalValue178_54_0;
    int lexicalValue178_66_0;
    int lexicalValue178_72_0;
    int spill178_0;
    int spill178_1;
    boolean spill178_2;
    int spill178_3;
    long life1_3;
    int life4_5;
    java.util.Iterator life5_10;
    int life3_11;
    com.moon.mA life6_18;
    com.moon.mM life7_34;
    lexical_join_72: {
    lexical_join_71: {
    life1_3 = (com.moon.mB.E ^ 100347003984137L);
    life4_5 = 0;
    spill178_0 = com.moon.mA.c__Int();
    life5_10 = ((java.util.List)(this.u)).iterator();
    life3_11 = spill178_0;
    lexical_cycle_12: while (true) {
    lexical_join_69: {
    lexical_join_66: {
    lexical_join_65: {
    lexical_join_54: {
    lexical_join_49: {
    lexical_join_38: {
    if (!(((java.util.Iterator)(life5_10)).hasNext())) {
        break lexical_join_71;
    }
    life6_18 = ((com.moon.mA)(((java.util.Iterator)(life5_10)).next()));
    spill178_1 = ((life6_18 instanceof com.moon.mM) ? 1 : 0);
    if (!((life3_11 != 0))) {
        lexicalValue178_72_0 = spill178_1;
        break lexical_join_72;
    }
    if (!((life3_11 != 0))) {
        lexicalValue178_49_0 = spill178_1;
        break lexical_join_49;
    }
    if (!((spill178_1 != 0))) {
        break lexical_join_38;
    }
    life7_34 = ((com.moon.mM)(life6_18));
    spill178_2 = ((com.moon.mM)(life7_34)).e__Boolean();
    if (!((life3_11 != 0))) {
        lexicalValue178_49_0 = ((spill178_2) ? 1 : 0);
        break lexical_join_49;
    }
    if (!(spill178_2)) {
        break lexical_join_38;
    }
    life4_5 = 1;
    if (!((life3_11 == 0))) {
        break lexical_join_71;
    }
    }
    lexicalValue178_49_0 = recovery.source.CarrierOps.dcmpl(((double)(com.moon.nI.a(((double)(((double) ((com.moon.mA)(life6_18)).e()))), ((int)(1))))), ((double)(com.moon.nI.a(((double)(((double) ((com.moon.mA)(life6_18)).f()))), ((int)(1))))));
    }
    if (!((life3_11 != 0))) {
        lexicalValue178_54_0 = lexicalValue178_49_0;
        break lexical_join_54;
    }
    if (!((lexicalValue178_49_0 != 0))) {
        break lexical_join_69;
    }
    lexicalValue178_54_0 = ((((com.moon.mA)(life6_18)).a__Boolean()) ? 1 : 0);
    }
    if (!((life3_11 != 0))) {
        lexicalValue178_66_0 = lexicalValue178_54_0;
        break lexical_join_66;
    }
    if (!((lexicalValue178_54_0 == 0))) {
        break lexical_join_65;
    }
    spill178_3 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((com.moon.mA)(life6_18)).e()))), ((double)(0x1.999999999999ap-4d)));
    if (!((life3_11 != 0))) {
        lexicalValue178_66_0 = spill178_3;
        break lexical_join_66;
    }
    if (!((spill178_3 > 0))) {
        break lexical_join_69;
    }
    }
    lexicalValue178_66_0 = 1;
    }
    life4_5 = lexicalValue178_66_0;
    if (!((life3_11 == 0))) {
        break lexical_join_71;
    }
    }
    if (!((life3_11 == 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue178_72_0 = life4_5;
    }
    return ((lexicalValue178_72_0) != 0);
}


private void e__sourceReturn_da8c82d5d4() {
float forwardValue688_28_0;
    com.moon.mB forwardValue688_77_0;
    int spill688_0;
    com.moon.mB spill688_1;
    long life1_3;
    com.moon.hW life4_12;
    int life3_13;
    float life5_21;
    float life6_30;
    forward_join_77: {
    forward_join_76: {
    forward_join_28: {
    forward_join_27: {
    life1_3 = (com.moon.mB.E ^ 71847422774067L);
    spill688_0 = com.moon.mA.b__Int();
    life4_12 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(this.h))))).a();
    life3_13 = spill688_0;
    life5_21 = ((com.moon.jm)(this.h)).a(((java.lang.String)(((com.moon.module.Module)(this.v)).getDisplayText())), ((float)(0x1.29999ap3f)));
    if (!(this.C)) {
        break forward_join_27;
    }
    forwardValue688_28_0 = 0x1.9p2f;
    break forward_join_28;
    }
    forwardValue688_28_0 = 0x1.fp2f;
    }
    life6_30 = forwardValue688_28_0;
    spill688_1 = this;
    if (!((life3_13 == 0))) {
        forwardValue688_77_0 = spill688_1;
        break forward_join_77;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(((com.moon.mB)(spill688_1)).s))))), ((float)(0x1.0p0f))) < 0))) {
        break forward_join_76;
    }
    ((com.moon.jm)(this.h)).a(((com.moon.hW)(life4_12)), ((java.lang.String)(((com.moon.module.Module)(this.v)).getDisplayText())), ((float)(0x1.29999ap3f)), ((float)(((this.e + (this.g / 0x1.0p1f)) - (life5_21 / 0x1.0p1f)))), ((float)((this.f + life6_30))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).v()))).a(((float)((0x1.0p0f - __sourceExactCall_bf9871e16b7660(((com.moon.nX)(this.s))))))))).getRGB())), ((boolean)(false)), ((boolean)(false)), ((float)(0x1.eb851ep-7f)));
    }
    forwardValue688_77_0 = this;
    }
    ((com.moon.jm)(((com.moon.mB)(forwardValue688_77_0)).h)).a(((com.moon.hW)(life4_12)), ((java.lang.String)(__sourceExactCall_ee3be4ea0188c8(((com.moon.module.Module)(this.v))))), ((float)(0x1.29999ap3f)), ((float)(((this.e + (this.g / 0x1.0p1f)) - (life5_21 / 0x1.0p1f)))), ((float)((this.f + life6_30))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceExactCall_66349b953a09b2(((com.v)(this.p)))))).a(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(this.s)))))))).getRGB())), ((boolean)(false)), ((boolean)(false)), ((float)(0x1.eb851ep-7f)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life4_12)));
    return;
}


public com.moon.nX c__sourceReturn_ef529cc2e6() {
return this.s;
}


public boolean h__sourceReturn_aae029aa0a() {
return ((((this.z) ? 1 : 0)) != 0);
}


private void f__sourceReturn_da8c82d5d4() {
float forestValue109_16_0;
    float forestValue109_17_0;
    float forestValue109_17_1;
    float forestValue109_27_0;
    com.moon.mA forestValue109_63_0;
    float forestValue109_63_1;
    com.moon.mA forestValue109_64_0;
    com.moon.mA forestValue109_65_0;
    float forestValue109_65_1;
    com.moon.mA forestValue109_78_0;
    int forestValue109_100_0;
    com.moon.mA forestValue109_110_0;
    com.moon.mB forestValue109_158_0;
    com.moon.mB forestValue109_163_0;
    com.moon.mB forestValue109_166_0;
    float forestValue109_166_1;
    com.moon.mA forestValue109_206_0;
    com.moon.mA forestValue109_232_0;
    com.moon.mA forestValue109_233_0;
    com.moon.mB forestValue109_233_1;
    com.moon.mA forestValue109_235_0;
    float forestValue109_235_1;
    com.moon.mA forestValue109_242_0;
    int forestValue109_242_1;
    com.moon.mA forestValue109_251_0;
    com.moon.mA forestValue109_252_0;
    com.moon.mB forestValue109_252_1;
    com.moon.mA forestValue109_273_0;
    float forestValue109_273_1;
    com.moon.mA forestValue109_292_0;
    com.moon.mB forestValue109_292_1;
    com.moon.mA forestValue109_295_0;
    com.moon.mB forestValue109_295_1;
    int spill109_0;
    float spill109_1;
    com.moon.mA spill109_2;
    float spill109_3;
    com.moon.mA spill109_4;
    boolean spill109_5;
    com.moon.mB spill109_6;
    boolean spill109_7;
    com.moon.mA spill109_8;
    com.moon.mB spill109_9;
    com.moon.mB spill109_10;
    com.moon.mB spill109_11;
    com.moon.mB spill109_12;
    com.moon.mA spill109_13;
    com.moon.mB spill109_14;
    com.moon.mB spill109_15;
    com.moon.mB spill109_16;
    com.moon.mA spill109_17;
    com.moon.mB spill109_18;
    com.moon.mA spill109_19;
    com.moon.mB spill109_20;
    float spill109_21;
    boolean spill109_22;
    long life1_3;
    float life4_7;
    int life3_8;
    float life5_20;
    float life6_22;
    float life7_31;
    int life8_33;
    java.util.Iterator life9_37;
    com.moon.mA life10_46;
    com.moon.mM life11_128;
    float life11_139;
    java.util.Iterator life9_264;
    com.moon.mA life10_273;
    com.moon.mA life10_340;
    com.moon.mA life10_360;
    forest_join_297: {
    forest_join_242: {
    forest_join_207: {
    forest_join_206: {
    forest_join_199: {
    forest_join_166: {
    forest_join_163: {
    forest_join_158: {
    forest_join_157: {
    forest_join_137: {
    forest_join_27: {
    forest_join_26: {
    forest_join_17: {
    forest_join_16: {
    life1_3 = (com.moon.mB.E ^ 124824500267612L);
    spill109_0 = com.moon.mA.b__Int();
    life4_7 = ((com.moon.mB)(this)).b();
    life3_8 = spill109_0;
    spill109_1 = ((com.moon.mB)(this)).c();
    if (!(this.C)) {
        forestValue109_16_0 = spill109_1;
        break forest_join_16;
    }
    forestValue109_17_0 = spill109_1;
    forestValue109_17_1 = 0x1.a8p4f;
    break forest_join_17;
    }
    forestValue109_17_0 = forestValue109_16_0;
    forestValue109_17_1 = 0x1.dp4f;
    }
    life5_20 = (forestValue109_17_0 + forestValue109_17_1);
    life6_22 = 0x0.0p0f;
    if (!(this.C)) {
        break forest_join_26;
    }
    forestValue109_27_0 = 0x1.6p4f;
    break forest_join_27;
    }
    forestValue109_27_0 = 0x1.8p4f;
    }
    life7_31 = forestValue109_27_0;
    life8_33 = 0;
    life9_37 = ((java.util.List)(this.u)).iterator();
    forest_cycle_34: while (true) {
    forest_join_135: {
    forest_join_110: {
    forest_join_109: {
    forest_join_100: {
    forest_join_81: {
    forest_join_78: {
    forest_join_77: {
    forest_join_65: {
    forest_join_64: {
    forest_join_63: {
    if (!(((java.util.Iterator)(life9_37)).hasNext())) {
        break forest_join_137;
    }
    life10_46 = ((com.moon.mA)(((java.util.Iterator)(life9_37)).next()));
    ((com.moon.mA)(life10_46)).a(((float)(life4_7)));
    ((com.moon.mA)(life10_46)).b(((float)(life5_20)));
    spill109_2 = life10_46;
    spill109_3 = this.g;
    if (!((life3_8 == 0))) {
        forestValue109_63_0 = spill109_2;
        forestValue109_63_1 = spill109_3;
        break forest_join_63;
    }
    ((com.moon.mA)(spill109_2)).c(((float)(spill109_3)));
    spill109_4 = life10_46;
    spill109_5 = this.C;
    if (!((life3_8 == 0))) {
        forestValue109_242_0 = spill109_4;
        forestValue109_242_1 = ((spill109_5) ? 1 : 0);
        break forest_join_242;
    }
    if (!(spill109_5)) {
        forestValue109_64_0 = spill109_4;
        break forest_join_64;
    }
    forestValue109_63_0 = spill109_4;
    forestValue109_63_1 = 0x1.8p1f;
    }
    forestValue109_65_0 = forestValue109_63_0;
    forestValue109_65_1 = forestValue109_63_1;
    break forest_join_65;
    }
    forestValue109_65_0 = forestValue109_64_0;
    forestValue109_65_1 = 0x1.8p2f;
    }
    ((com.moon.mA)(forestValue109_65_0)).j(((float)(forestValue109_65_1)));
    spill109_6 = this;
    if (!((life3_8 == 0))) {
        forestValue109_78_0 = spill109_6;
        break forest_join_78;
    }
    if (!(((com.moon.mB)(spill109_6)).d__Boolean())) {
        break forest_join_77;
    }
    spill109_7 = this.B;
    if (!((life3_8 == 0))) {
        forestValue109_100_0 = ((spill109_7) ? 1 : 0);
        break forest_join_100;
    }
    if (!(spill109_7)) {
        break forest_join_81;
    }
    }
    forestValue109_78_0 = life10_46;
    }
    ((com.moon.nX)(((com.moon.mA)(forestValue109_78_0)).a__nX())).a(((float)(life5_20)));
    }
    ((com.moon.mA)(life10_46)).f(((float)(this.e)));
    ((com.moon.mA)(life10_46)).g(((float)(this.f)));
    ((com.moon.mA)(life10_46)).h(((float)(this.g)));
    spill109_8 = life10_46;
    if (!((life3_8 == 0))) {
        forestValue109_110_0 = spill109_8;
        break forest_join_110;
    }
    forestValue109_100_0 = ((spill109_8 instanceof com.moon.mM) ? 1 : 0);
    }
    if (!((forestValue109_100_0 != 0))) {
        break forest_join_109;
    }
    life11_128 = ((com.moon.mM)(life10_46));
    ((com.moon.mM)(life11_128)).a(((boolean)(this.B)));
    }
    forestValue109_110_0 = life10_46;
    }
    life11_139 = ((com.moon.nX)(((com.moon.mA)(forestValue109_110_0)).b__nX())).b();
    life5_20 = (life5_20 + (((com.moon.mA)(life10_46)).e() + (0x1.4p2f * life11_139)));
    life6_22 = (life6_22 + (((com.moon.mA)(life10_46)).e() + (0x1.4p2f * life11_139)));
    if (!(((com.moon.mA)(life10_46)).a__Boolean())) {
        break forest_join_135;
    }
    life8_33 += 1;
    }
    if (!((life3_8 != 0))) {
        continue forest_cycle_34;
    }
    break forest_cycle_34;
    }
    }
    spill109_9 = this;
    if (!((life3_8 == 0))) {
        forestValue109_158_0 = spill109_9;
        break forest_join_158;
    }
    if (!((!((com.moon.mB)(spill109_9)).C))) {
        break forest_join_157;
    }
    spill109_10 = this;
    if (!((life3_8 == 0))) {
        forestValue109_158_0 = spill109_10;
        break forest_join_158;
    }
    if (!(((com.moon.mB)(spill109_10)).x)) {
        break forest_join_157;
    }
    if (!((life8_33 > 0))) {
        break forest_join_157;
    }
    life6_22 = (life6_22 + (0x1.2p2f * ((com.moon.nX)(this.d)).b()));
    }
    forestValue109_158_0 = this;
    }
    if (!((!this.x))) {
        forestValue109_163_0 = forestValue109_158_0;
        break forest_join_163;
    }
    forestValue109_166_0 = forestValue109_158_0;
    forestValue109_166_1 = life7_31;
    break forest_join_166;
    }
    forestValue109_166_0 = forestValue109_163_0;
    forestValue109_166_1 = (life7_31 + life6_22);
    }
    ((com.moon.mB)(forestValue109_166_0)).y = ((float)(forestValue109_166_1));
    ((com.moon.nX)(this.t)).a(((float)(this.y)), ((double)(0x1.99999ap-2d)));
    spill109_11 = this;
    if (!((life3_8 == 0))) {
        forestValue109_206_0 = spill109_11;
        break forest_join_206;
    }
    if (!(((com.moon.mB)(spill109_11)).e__Boolean())) {
        break forest_join_199;
    }
    spill109_12 = this;
    if (!((life3_8 == 0))) {
        forestValue109_206_0 = spill109_12;
        break forest_join_206;
    }
    if (!(((com.moon.mB)(spill109_12)).x)) {
        break forest_join_199;
    }
    ((com.moon.mB)(this)).d(((float)(java.lang.Math.max(((float)(this.y)), ((float)(life7_31))))));
    ((com.moon.nX)(this.t)).a(((float)(java.lang.Math.max(((float)(this.y)), ((float)(life7_31))))));
    if (!((life3_8 != 0))) {
        break forest_join_207;
    }
    }
    forestValue109_206_0 = ((com.moon.mB)(this)).d(((float)(java.lang.Math.max(((float)(((com.moon.nX)(this.t)).b())), ((float)(life7_31))))));
    }
    recovery.source.CarrierOps.discard(forestValue109_206_0);
    }
    life9_264 = ((java.util.List)(this.u)).iterator();
    forest_cycle_211: while (true) {
    forest_join_235: {
    forest_join_233: {
    forest_join_232: {
    if (!(((java.util.Iterator)(life9_264)).hasNext())) {
        break forest_join_297;
    }
    life10_273 = ((com.moon.mA)(((java.util.Iterator)(life9_264)).next()));
    spill109_13 = life10_273;
    spill109_14 = this;
    if (!((life3_8 == 0))) {
        forestValue109_233_0 = spill109_13;
        forestValue109_233_1 = spill109_14;
        break forest_join_233;
    }
    if (!(((com.moon.mB)(spill109_14)).e__Boolean())) {
        forestValue109_232_0 = spill109_13;
        break forest_join_232;
    }
    spill109_15 = this;
    if (!((life3_8 == 0))) {
        forestValue109_233_0 = spill109_13;
        forestValue109_233_1 = spill109_15;
        break forest_join_233;
    }
    if (!(((com.moon.mB)(spill109_15)).x)) {
        forestValue109_232_0 = spill109_13;
        break forest_join_232;
    }
    forestValue109_235_0 = spill109_13;
    forestValue109_235_1 = this.y;
    break forest_join_235;
    }
    forestValue109_233_0 = forestValue109_232_0;
    forestValue109_233_1 = this;
    }
    forestValue109_235_0 = forestValue109_233_0;
    forestValue109_235_1 = ((com.moon.nX)(((com.moon.mB)(forestValue109_233_1)).t)).b();
    }
    ((com.moon.mA)(forestValue109_235_0)).i(((float)(java.lang.Math.max(((float)(forestValue109_235_1)), ((float)(0x1.4p4f))))));
    if (!((life3_8 != 0))) {
        continue forest_cycle_211;
    }
    break forest_cycle_211;
    }
    break forest_join_297;
    }
    forest_cycle_242: while (true) {
    forest_join_295: {
    forest_join_273: {
    forest_join_252: {
    forest_join_251: {
    if (!((forestValue109_242_1 != 0))) {
        forestValue109_251_0 = forestValue109_242_0;
        break forest_join_251;
    }
    spill109_16 = this;
    if (!((life3_8 == 0))) {
        forestValue109_252_0 = forestValue109_242_0;
        forestValue109_252_1 = spill109_16;
        break forest_join_252;
    }
    if (!(((com.moon.mB)(spill109_16)).x)) {
        forestValue109_251_0 = forestValue109_242_0;
        break forest_join_251;
    }
    forestValue109_273_0 = forestValue109_242_0;
    forestValue109_273_1 = this.y;
    break forest_join_273;
    }
    forestValue109_252_0 = forestValue109_251_0;
    forestValue109_252_1 = this;
    }
    forest_cycle_252: while (true) {
    forest_join_261: {
    ((com.moon.mA)(forestValue109_252_0)).i(((float)(java.lang.Math.max(((float)(((com.moon.nX)(((com.moon.mB)(forestValue109_252_1)).t)).b())), ((float)(0x1.4p4f))))));
    if (!((life3_8 != 0))) {
        break forest_join_261;
    }
    break forest_join_297;
    }
    if (!(((java.util.Iterator)(life9_37)).hasNext())) {
        break forest_join_297;
    }
    life10_340 = ((com.moon.mA)(((java.util.Iterator)(life9_37)).next()));
    spill109_17 = life10_340;
    spill109_18 = this;
    if (!((life3_8 == 0))) {
        forestValue109_252_0 = spill109_17;
        forestValue109_252_1 = spill109_18;
        continue forest_cycle_252;
    }
    break forest_cycle_252;
    }
    forestValue109_295_0 = spill109_17;
    forestValue109_295_1 = spill109_18;
    break forest_join_295;
    }
    forest_cycle_273: while (true) {
    forest_join_292: {
    forest_join_280: {
    ((com.moon.mA)(forestValue109_273_0)).i(((float)(java.lang.Math.max(((float)(forestValue109_273_1)), ((float)(0x1.4p4f))))));
    if (!((life3_8 != 0))) {
        break forest_join_280;
    }
    break forest_join_297;
    }
    if (!(((java.util.Iterator)(life9_37)).hasNext())) {
        break forest_join_297;
    }
    life10_360 = ((com.moon.mA)(((java.util.Iterator)(life9_37)).next()));
    spill109_19 = life10_360;
    spill109_20 = this;
    if (!((life3_8 == 0))) {
        forestValue109_292_0 = spill109_19;
        forestValue109_292_1 = spill109_20;
        break forest_join_292;
    }
    forestValue109_295_0 = spill109_19;
    forestValue109_295_1 = spill109_20;
    break forest_join_295;
    }
    spill109_21 = ((com.moon.nX)(((com.moon.mB)(forestValue109_292_1)).t)).b();
    forestValue109_273_0 = forestValue109_292_0;
    forestValue109_273_1 = spill109_21;
    continue forest_cycle_273;
    }
    }
    spill109_22 = ((com.moon.mB)(forestValue109_295_1)).e__Boolean();
    forestValue109_242_0 = forestValue109_295_0;
    forestValue109_242_1 = ((spill109_22) ? 1 : 0);
    continue forest_cycle_242;
    }
    }
    return;
}


public boolean f__Boolean() {
com.moon.mB lexicalValue180_47_0;
    com.moon.mB lexicalValue180_50_0;
    float lexicalValue180_50_1;
    int lexicalValue180_62_0;
    int lexicalValue180_66_0;
    int lexicalValue180_68_0;
    int spill180_0;
    boolean spill180_1;
    com.moon.mB spill180_2;
    long life1_3;
    float life4_6;
    int life3_7;
    java.util.Iterator life5_11;
    com.moon.mA life6_18;
    lexical_join_68: {
    lexical_join_67: {
    lexical_join_66: {
    lexical_join_62: {
    lexical_join_50: {
    lexical_join_47: {
    lexical_join_41: {
    life1_3 = (com.moon.mB.E ^ 61084833500165L);
    spill180_0 = com.moon.mA.b__Int();
    life4_6 = 0x0.0p0f;
    life3_7 = spill180_0;
    life5_11 = ((java.util.List)(this.u)).iterator();
    lexical_cycle_12: while (true) {
    lexical_join_39: {
    lexical_join_28: {
    if (!(((java.util.Iterator)(life5_11)).hasNext())) {
        break lexical_join_41;
    }
    life6_18 = ((com.moon.mA)(((java.util.Iterator)(life5_11)).next()));
    if (!((life3_7 == 0))) {
        break lexical_join_39;
    }
    spill180_1 = ((com.moon.mA)(life6_18)).a__Boolean();
    if (!((life3_7 == 0))) {
        lexicalValue180_62_0 = ((spill180_1) ? 1 : 0);
        break lexical_join_62;
    }
    if (!((!spill180_1))) {
        break lexical_join_28;
    }
    if (!((life3_7 != 0))) { continue lexical_cycle_12; }
    }
    life4_6 = (life4_6 + (((com.moon.mA)(life6_18)).e() + (0x1.4p2f * ((com.moon.nX)(((com.moon.mA)(life6_18)).b__nX())).b())));
    }
    if (!((life3_7 != 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    spill180_2 = this;
    if (!((!this.x))) {
        lexicalValue180_47_0 = spill180_2;
        break lexical_join_47;
    }
    lexicalValue180_50_0 = spill180_2;
    lexicalValue180_50_1 = 0x1.6p4f;
    break lexical_join_50;
    }
    lexicalValue180_50_0 = lexicalValue180_47_0;
    lexicalValue180_50_1 = (0x1.6p4f + life4_6);
    }
    ((com.moon.mB)(lexicalValue180_50_0)).y = ((float)(lexicalValue180_50_1));
    lexicalValue180_62_0 = recovery.source.CarrierOps.dcmpl(((double)(com.moon.nI.a(((double)(((double) this.i))), ((int)(1))))), ((double)(com.moon.nI.a(((double)(((double) this.y))), ((int)(1))))));
    }
    if (!((life3_7 == 0))) {
        lexicalValue180_66_0 = lexicalValue180_62_0;
        break lexical_join_66;
    }
    if (!((lexicalValue180_62_0 != 0))) {
        break lexical_join_67;
    }
    lexicalValue180_66_0 = 1;
    }
    lexicalValue180_68_0 = lexicalValue180_66_0;
    break lexical_join_68;
    }
    lexicalValue180_68_0 = 0;
    }
    return ((lexicalValue180_68_0) != 0);
}


public float l() {
return this.y;
}


private void d__sourceReturn_da8c82d5d4() {
com.moon.nX forwardValue686_16_0;
    com.moon.nX forwardValue686_17_0;
    float forwardValue686_17_1;
    int spill686_0;
    com.moon.nX spill686_1;
    long life1_3;
    int life4_8;
    int life3_9;
    com.moon.hW life5_25;
    float life6_84;
    com.moon.i3 life7_99;
    com.moon.i3 life8_122;
    forward_join_129: {
    forward_join_75: {
    forward_join_73: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (com.moon.mB.E ^ 102340414554736L);
    spill686_0 = com.moon.mA.b__Int();
    life4_8 = ((((com.moon.module.Module)(this.v)).isEnabled()) ? 1 : 0);
    life3_9 = spill686_0;
    spill686_1 = this.s;
    if (!((life4_8 != 0))) {
        forwardValue686_16_0 = spill686_1;
        break forward_join_16;
    }
    forwardValue686_17_0 = spill686_1;
    forwardValue686_17_1 = 0x1.0p0f;
    break forward_join_17;
    }
    forwardValue686_17_0 = forwardValue686_16_0;
    forwardValue686_17_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(forwardValue686_17_0)).a(((float)(forwardValue686_17_1)), ((double)(0x1.333334p-2d)));
    life5_25 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    if (!((life3_9 == 0))) {
        break forward_join_73;
    }
    if (!(this.C)) {
        break forward_join_75;
    }
    ((com.moon.hW)(life5_25)).a(((com.moon.iX)(com.moon.i3.a(((float)((this.e + 0x1.8p0f))), ((float)(this.f)), ((float)((this.g - 0x1.8p1f))), ((float)(0x1.6p4f)), ((float)(0x1.2p2f)), ((int)(((com.v)(this.p)).z()))))));
    ((com.moon.hW)(life5_25)).a(((com.moon.iX)(com.moon.i3.a(((float)((this.e + 0x1.8p0f))), ((float)(this.f)), ((float)((this.g - 0x1.8p1f))), ((float)(0x1.6p4f)), ((float)(0x1.2p2f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).a()))).a(((float)(((com.moon.nX)(this.s)).b()))))).getRGB()))))));
    }
    if (!((life3_9 != 0))) {
        break forward_join_129;
    }
    }
    life6_84 = 0x1.8p4f;
    life7_99 = com.moon.i3.a(((float)(this.e)), ((float)(this.f)), ((float)(this.g)), ((float)((life6_84 + 0x1.0p0f))), ((float)(0x0.0p0f)), ((int)(((com.v)(this.p)).z())));
    life8_122 = com.moon.i3.a(((float)(this.e)), ((float)(this.f)), ((float)(this.g)), ((float)((life6_84 + 0x1.0p0f))), ((float)(0x0.0p0f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).a()))).a(((float)(((com.moon.nX)(this.s)).b()))))).getRGB())));
    ((com.moon.i3)(life7_99)).e(((boolean)(false)));
    ((com.moon.i3)(life8_122)).e(((boolean)(false)));
    ((com.moon.hW)(life5_25)).a(((com.moon.iX)(life7_99)));
    ((com.moon.hW)(life5_25)).a(((com.moon.iX)(life8_122)));
    }
    ((com.moon.hW)(life5_25)).b();
    return;
}


public boolean d__Boolean() {
com.moon.mA forestValue149_40_0;
    int forestValue149_48_0;
    int spill149_0;
    com.moon.mA spill149_1;
    int spill149_2;
    com.moon.mA spill149_3;
    long life1_3;
    java.util.Iterator life4_8;
    int life3_9;
    com.moon.mA life5_16;
    forest_join_48: {
    forest_join_46: {
    life1_3 = (com.moon.mB.E ^ 114974344654795L);
    spill149_0 = com.moon.mA.c__Int();
    life4_8 = ((java.util.List)(this.u)).iterator();
    life3_9 = spill149_0;
    forest_cycle_10: while (true) {
    forest_join_44: {
    forest_join_40: {
    forest_join_39: {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break forest_join_46;
    }
    life5_16 = ((com.moon.mA)(((java.util.Iterator)(life4_8)).next()));
    spill149_1 = life5_16;
    if (!((life3_9 != 0))) {
        forestValue149_40_0 = spill149_1;
        break forest_join_40;
    }
    spill149_2 = recovery.source.CarrierOps.dcmpl(((double)(com.moon.nI.a(((double)(((double) ((com.moon.mA)(spill149_1)).a()))), ((int)(1))))), ((double)(com.moon.nI.a(((double)(((double) ((com.moon.mA)(life5_16)).c()))), ((int)(1))))));
    if (!((life3_9 != 0))) {
        forestValue149_48_0 = spill149_2;
        break forest_join_48;
    }
    if (!((spill149_2 != 0))) {
        break forest_join_39;
    }
    spill149_3 = life5_16;
    if (!((life3_9 != 0))) {
        forestValue149_40_0 = spill149_3;
        break forest_join_40;
    }
    if (!(((com.moon.mA)(spill149_3)).a__Boolean())) {
        break forest_join_39;
    }
    break forest_join_44;
    }
    forestValue149_40_0 = life5_16;
    }
    ((com.moon.nX)(((com.moon.mA)(forestValue149_40_0)).a__nX())).a(((float)(((com.moon.mA)(life5_16)).c())));
    }
    if (!((life3_9 == 0))) {
        continue forest_cycle_10;
    }
    break forest_cycle_10;
    }
    }
    forestValue149_48_0 = ((this.z) ? 1 : 0);
    }
    return ((forestValue149_48_0) != 0);
}


public void a__Void() {
int forestValue108_39_0;
    com.moon.mA forestValue108_183_0;
    int spill108_0;
    boolean spill108_1;
    long life1_3;
    java.util.List life4_8;
    int life3_9;
    float life5_14;
    java.util.Iterator life6_17;
    com.moon.setting.Setting life7_24;
    com.moon.mA life8_186;
    forest_join_222: {
    forest_join_220: {
    forest_join_216: {
    life1_3 = (com.moon.mB.E ^ 119429838724613L);
    spill108_0 = com.moon.mA.c__Int();
    life4_8 = ((com.moon.module.Module)(this.v)).getSettings();
    life3_9 = spill108_0;
    life5_14 = (((com.moon.mB)(this)).c() + 0x1.4p4f);
    life6_17 = ((java.util.List)(life4_8)).iterator();
    forest_cycle_18: while (true) {
    forest_join_183: {
    forest_join_172: {
    forest_join_160: {
    forest_join_148: {
    forest_join_136: {
    forest_join_124: {
    forest_join_112: {
    forest_join_100: {
    forest_join_88: {
    forest_join_76: {
    forest_join_64: {
    forest_join_52: {
    forest_join_40: {
    forest_join_39: {
    forest_join_34: {
    if (!(((java.util.Iterator)(life6_17)).hasNext())) {
        break forest_join_220;
    }
    life7_24 = ((com.moon.setting.Setting)(((java.util.Iterator)(life6_17)).next()));
    if (!((life3_9 != 0))) {
        break forest_join_222;
    }
    spill108_1 = ((com.moon.setting.Setting)(life7_24)).isGrouped();
    if (!((life3_9 != 0))) {
        forestValue108_39_0 = ((spill108_1) ? 1 : 0);
        break forest_join_39;
    }
    if (!(spill108_1)) {
        break forest_join_34;
    }
    if (!((life3_9 == 0))) {
        continue forest_cycle_18;
    }
    }
    forestValue108_39_0 = (com.moon.mO.a)[((com.moon.cf)(((com.moon.setting.Setting)(life7_24)).getType())).ordinal()];
    }
    switch (forestValue108_39_0) {
case 1:
{
        break forest_join_40;
    }
case 2:
{
        break forest_join_52;
    }
case 3:
{
        break forest_join_64;
    }
case 4:
{
        break forest_join_76;
    }
case 5:
{
        break forest_join_88;
    }
case 6:
{
        break forest_join_100;
    }
case 7:
{
        break forest_join_112;
    }
case 8:
{
        break forest_join_124;
    }
case 9:
{
        break forest_join_136;
    }
case 10:
{
        break forest_join_148;
    }
case 11:
{
        break forest_join_160;
    }
case 12:
{
        break forest_join_172;
    }
default:
{
        break forest_join_216;
    }
}
    }
    forestValue108_183_0 = new com.moon.mD(((com.moon.setting.BooleanSetting)(life7_24)), __sourceExactCall_2add8d4ba3153f(((com.moon.mB)(this))), life5_14, ((com.moon.mB)(this)).d(), 0x1.ep3f);
    break forest_join_183;
    }
    forestValue108_183_0 = new com.moon.mF(((com.moon.setting.ColorSetting)(life7_24)), __sourceExactCall_2add8d4ba3153f(((com.moon.mB)(this))), life5_14, ((com.moon.mB)(this)).d(), 0x1.9p4f);
    break forest_join_183;
    }
    forestValue108_183_0 = new com.moon.mG(((com.moon.setting.ModeSetting)(life7_24)), __sourceExactCall_2add8d4ba3153f(((com.moon.mB)(this))), life5_14, ((com.moon.mB)(this)).d(), 0x1.9p4f);
    break forest_join_183;
    }
    forestValue108_183_0 = new com.moon.mH(((com.moon.setting.FloatSetting)(life7_24)), __sourceExactCall_2add8d4ba3153f(((com.moon.mB)(this))), life5_14, ((com.moon.mB)(this)).d(), 0x1.5p4f);
    break forest_join_183;
    }
    forestValue108_183_0 = new com.moon.mI(((com.moon.setting.IntegerSetting)(life7_24)), __sourceExactCall_2add8d4ba3153f(((com.moon.mB)(this))), life5_14, ((com.moon.mB)(this)).d(), 0x1.5p4f);
    break forest_join_183;
    }
    forestValue108_183_0 = new com.moon.mM(((com.moon.setting.SettingGroup)(life7_24)), __sourceExactCall_2add8d4ba3153f(((com.moon.mB)(this))), life5_14, ((com.moon.mB)(this)).d(), 0x1.7p4f);
    break forest_join_183;
    }
    forestValue108_183_0 = new com.moon.mL(((com.moon.setting.MultiSelectSetting)(life7_24)), __sourceExactCall_2add8d4ba3153f(((com.moon.mB)(this))), life5_14, ((com.moon.mB)(this)).d(), 0x1.9p4f);
    break forest_join_183;
    }
    forestValue108_183_0 = new com.moon.mJ(((com.moon.setting.EnumSetting)(life7_24)), __sourceExactCall_2add8d4ba3153f(((com.moon.mB)(this))), life5_14, ((com.moon.mB)(this)).d(), 0x1.9p4f);
    break forest_join_183;
    }
    forestValue108_183_0 = new com.moon.mN(((com.moon.k5)(life7_24)), __sourceExactCall_2add8d4ba3153f(((com.moon.mB)(this))), life5_14, ((com.moon.mB)(this)).d(), 0x1.0p5f);
    break forest_join_183;
    }
    forestValue108_183_0 = new com.moon.mE(((com.moon.setting.ButtonSetting)(life7_24)), __sourceExactCall_2add8d4ba3153f(((com.moon.mB)(this))), life5_14, ((com.moon.mB)(this)).d(), 0x1.9p4f);
    break forest_join_183;
    }
    forestValue108_183_0 = new com.moon.mK(((com.moon.setting.StringListSetting)(life7_24)), __sourceExactCall_2add8d4ba3153f(((com.moon.mB)(this))), life5_14, ((com.moon.mB)(this)).d(), 0x1.9p4f);
    break forest_join_183;
    }
    forestValue108_183_0 = new com.moon.mC(((com.moon.setting.BezierSetting)(life7_24)), __sourceExactCall_2add8d4ba3153f(((com.moon.mB)(this))), life5_14, ((com.moon.mB)(this)).d(), 0x1.cp3f);
    }
    life8_186 = forestValue108_183_0;
    __sourceExactCall_b5e9b54c8c579b(((com.moon.mA)(life8_186)), ((com.moon.module.impl.ClickGUI)(this.b)));
    __sourceExactCall_d0f1564859d69f(((com.moon.mA)(life8_186)), ((com.v)(__sourceExactCall_f61d11b8decb1d(((int)(((java.lang.Integer)(((java.lang.Integer)(__sourceExactCall_0e4ae1ebba34c2(((com.moon.setting.ColorSetting)(__sourceExactCall_3122cc5fe27378(((com.moon.module.impl.ClickGUI)(this.b)))))))))).intValue()))))));
    __sourceExactCall_191ecc1a5dc1f7(((java.util.List)(this.u)), ((java.lang.Object)(life8_186)));
    __sourceExactCall_557d30123af2d5(((com.moon.mA)(life8_186)));
    life5_14 = (life5_14 + (((com.moon.mA)(life8_186)).e() + 0x1.8p1f));
    if (!((life3_9 == 0))) {
        continue forest_cycle_18;
    }
    break forest_cycle_18;
    }
    break forest_join_220;
    }
    throw new java.lang.IncompatibleClassChangeError();
    }
    __sourceExactCall_9531dabb37edf3(this);
    }
    return;
}


public int a__sourceReturn_8abf5c6871() {
return this.A;
}


public boolean a__Boolean() {
return ((1) != 0);
}


public com.moon.mB a(boolean p0) {
this.B = ((boolean)(p0));
    return this;
}


public void a(int p0, int p1) {
float forwardValue680_25_0;
    float forwardValue680_26_0;
    float forwardValue680_26_1;
    com.moon.mB forwardValue680_29_0;
    int spill680_0;
    com.moon.mB spill680_1;
    float spill680_2;
    long life3_3;
    int life5_9;
    forward_join_33: {
    forward_join_29: {
    forward_join_28: {
    forward_join_26: {
    forward_join_25: {
    life3_3 = (com.moon.mB.E ^ 60945566256216L);
    ((com.moon.mB)(this)).d__sourceReturn_da8c82d5d4();
    spill680_0 = com.moon.mA.b__Int();
    ((com.moon.mB)(this)).e__sourceReturn_da8c82d5d4();
    life5_9 = spill680_0;
    ((com.moon.mB)(this)).f__sourceReturn_da8c82d5d4();
    spill680_1 = this;
    if (!((life5_9 == 0))) {
        forwardValue680_29_0 = spill680_1;
        break forward_join_29;
    }
    if (!((!((com.moon.mB)(spill680_1)).x))) {
        break forward_join_28;
    }
    spill680_2 = ((com.moon.nX)(this.t)).b();
    if (!(this.C)) {
        forwardValue680_25_0 = spill680_2;
        break forward_join_25;
    }
    forwardValue680_26_0 = spill680_2;
    forwardValue680_26_1 = 0x1.68p4f;
    break forward_join_26;
    }
    forwardValue680_26_0 = forwardValue680_25_0;
    forwardValue680_26_1 = 0x1.88p4f;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(forwardValue680_26_0)), ((float)(forwardValue680_26_1))) > 0))) {
        break forward_join_33;
    }
    }
    forwardValue680_29_0 = this;
    }
    ((com.moon.mB)(forwardValue680_29_0)).a(((int)(p0)), ((int)(p1)), ((boolean)(false)));
    }
    super.a(((int)(p0)), ((int)(p1)));
    return;
}


public com.moon.jm a__jm() {
return this.h;
}


public void a(char p0, int p1) {
int spill172_0;
    long life3_3;
    java.util.Iterator life6_8;
    int life5_9;
    com.moon.mA life7_16;
    lexical_join_29: {
    lexical_join_25: {
    life3_3 = (com.moon.mB.E ^ 122317972158996L);
    spill172_0 = com.moon.mA.c__Int();
    life6_8 = ((java.util.List)(this.u)).iterator();
    life5_9 = spill172_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life6_8)).hasNext())) {
        break lexical_join_25;
    }
    life7_16 = ((com.moon.mA)(((java.util.Iterator)(life6_8)).next()));
    __sourceExactCall_5d5bd1b4256567(((com.moon.mA)(life7_16)), ((char)(p0)), ((int)(p1)));
    if (!((life5_9 != 0))) {
        break lexical_join_29;
    }
    if (!((life5_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    __sourceExactCall_13b42305f50bee(this, ((char)(p0)), ((int)(p1)));
    }
    return;
}


public boolean a__Boolean(int p0, int p1, int p2) {
int lexicalValue175_51_0;
    int lexicalValue175_59_0;
    int lexicalValue175_63_0;
    int lexicalValue175_77_0;
    com.moon.module.Module lexicalValue175_120_0;
    int lexicalValue175_128_0;
    int lexicalValue175_143_0;
    com.moon.mB lexicalValue175_145_0;
    com.moon.mB lexicalValue175_151_0;
    int lexicalValue175_151_1;
    com.moon.mB lexicalValue175_152_0;
    com.moon.mB lexicalValue175_153_0;
    int lexicalValue175_153_1;
    int lexicalValue175_159_0;
    boolean spill175_0;
    boolean spill175_1;
    int spill175_2;
    int spill175_3;
    boolean spill175_4;
    int spill175_5;
    com.moon.module.Module spill175_6;
    com.moon.mB spill175_7;
    int spill175_8;
    boolean spill175_9;
    long life4_3;
    int life6_5;
    java.util.Iterator life7_17;
    com.moon.mA life8_24;
    int life7_187;
    lexical_join_159: {
    lexical_join_154: {
    lexical_join_153: {
    lexical_join_152: {
    lexical_join_151: {
    lexical_join_145: {
    lexical_join_144: {
    lexical_join_143: {
    lexical_join_128: {
    lexical_join_123: {
    lexical_join_120: {
    lexical_join_118: {
    lexical_join_77: {
    lexical_join_66: {
    life4_3 = (com.moon.mB.E ^ 18669274151269L);
    life6_5 = com.moon.mA.c__Int();
    spill175_0 = this.x;
    if (!((life6_5 != 0))) {
        lexicalValue175_77_0 = ((spill175_0) ? 1 : 0);
        break lexical_join_77;
    }
    if (!(spill175_0)) {
        break lexical_join_66;
    }
    life7_17 = ((java.util.List)(this.u)).iterator();
    lexical_cycle_15: while (true) {
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_59: {
    lexical_join_51: {
    lexical_join_49: {
    if (!(((java.util.Iterator)(life7_17)).hasNext())) {
        break lexical_join_66;
    }
    life8_24 = ((com.moon.mA)(((java.util.Iterator)(life7_17)).next()));
    spill175_1 = ((com.moon.mB)(this)).a(((int)(p0)), ((int)(p1)), ((float)(this.e)), ((float)(this.f)), ((float)(this.g)), ((float)(this.i)));
    if (!((life6_5 != 0))) {
        lexicalValue175_77_0 = ((spill175_1) ? 1 : 0);
        break lexical_join_77;
    }
    if (!((life6_5 != 0))) {
        lexicalValue175_51_0 = ((spill175_1) ? 1 : 0);
        break lexical_join_51;
    }
    if (!((!spill175_1))) {
        break lexical_join_49;
    }
    spill175_2 = ((life8_24 instanceof com.moon.mN) ? 1 : 0);
    if (!((life6_5 != 0))) {
        lexicalValue175_51_0 = spill175_2;
        break lexical_join_51;
    }
    if (!((spill175_2 == 0))) {
        break lexical_join_49;
    }
    spill175_3 = ((life8_24 instanceof com.moon.mC) ? 1 : 0);
    if (!((life6_5 != 0))) {
        lexicalValue175_51_0 = spill175_3;
        break lexical_join_51;
    }
    if (!((spill175_3 != 0))) {
        break lexical_join_64;
    }
    }
    lexicalValue175_51_0 = ((((com.moon.mB)(this)).g__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        lexicalValue175_59_0 = lexicalValue175_51_0;
        break lexical_join_59;
    }
    if (!((lexicalValue175_51_0 != 0))) {
        break lexical_join_64;
    }
    lexicalValue175_59_0 = ((__sourceExactCall_1949f8e6ceb2ea(((com.moon.mA)(life8_24)), ((int)(p0)), ((int)(p1)), ((int)(p2)))) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        lexicalValue175_63_0 = lexicalValue175_59_0;
        break lexical_join_63;
    }
    if (!((lexicalValue175_59_0 != 0))) {
        break lexical_join_64;
    }
    lexicalValue175_63_0 = 1;
    }
    return ((lexicalValue175_63_0) != 0);
    }
    if (!((life6_5 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue175_77_0 = ((((com.moon.mB)(this)).a(((int)(p0)), ((int)(p1)), ((float)(this.e)), ((float)(this.f)), ((float)(this.g)), ((float)(0x1.4p4f)))) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        lexicalValue175_159_0 = lexicalValue175_77_0;
        break lexical_join_159;
    }
    if (!((lexicalValue175_77_0 != 0))) {
        break lexical_join_154;
    }
    spill175_4 = ((com.moon.mB)(this)).a(((int)(p0)), ((int)(p1)), ((float)(this.e)), ((float)((((com.moon.mZ)(this.w)).b() + 0x1.9p4f))), ((float)(this.g)), ((float)((((com.moon.mZ)(this.w)).d() - 0x1.9p4f))));
    if (!((life6_5 != 0))) {
        lexicalValue175_159_0 = ((spill175_4) ? 1 : 0);
        break lexical_join_159;
    }
    if (!(spill175_4)) {
        break lexical_join_154;
    }
    spill175_5 = p2;
    if (!((life6_5 != 0))) {
        lexicalValue175_128_0 = spill175_5;
        break lexical_join_128;
    }
    if (!((spill175_5 == 0))) {
        break lexical_join_123;
    }
    spill175_6 = this.v;
    if (!((life6_5 != 0))) {
        lexicalValue175_120_0 = spill175_6;
        break lexical_join_120;
    }
    if (!((((java.lang.Object)(spill175_6)).getClass() == com.moon.module.impl.ClickGUI.class))) {
        break lexical_join_118;
    }
    return __sourceExactCall_478bf6d5245036(this, ((int)(p0)), ((int)(p1)), ((int)(p2)));
    }
    lexicalValue175_120_0 = this.v;
    }
    ((com.moon.module.Module)(lexicalValue175_120_0)).toggle();
    if (!((life6_5 == 0))) {
        break lexical_join_154;
    }
    }
    lexicalValue175_128_0 = ((((java.util.stream.Stream)(((java.util.List)(this.u)).stream())).anyMatch(((java.util.function.Predicate)(__sourceIntrinsic_7c2f014c093b_invokedynamic175_44())))) ? 1 : 0);
    }
    life7_187 = lexicalValue175_128_0;
    spill175_7 = this;
    if (!((life6_5 != 0))) {
        lexicalValue175_145_0 = spill175_7;
        break lexical_join_145;
    }
    if (!((!((com.moon.mB)(spill175_7)).x))) {
        break lexical_join_144;
    }
    spill175_8 = life7_187;
    if (!((life6_5 != 0))) {
        lexicalValue175_143_0 = spill175_8;
        break lexical_join_143;
    }
    if (!((spill175_8 == 0))) {
        break lexical_join_144;
    }
    lexicalValue175_143_0 = ((__sourceExactCall_478bf6d5245036(this, ((int)(p0)), ((int)(p1)), ((int)(p2)))) ? 1 : 0);
    }
    return ((lexicalValue175_143_0) != 0);
    }
    lexicalValue175_145_0 = this;
    }
    spill175_9 = this.x;
    if (!((life6_5 != 0))) {
        lexicalValue175_151_0 = lexicalValue175_145_0;
        lexicalValue175_151_1 = ((spill175_9) ? 1 : 0);
        break lexical_join_151;
    }
    if (!((!spill175_9))) {
        lexicalValue175_152_0 = lexicalValue175_145_0;
        break lexical_join_152;
    }
    lexicalValue175_151_0 = lexicalValue175_145_0;
    lexicalValue175_151_1 = 1;
    }
    lexicalValue175_153_0 = lexicalValue175_151_0;
    lexicalValue175_153_1 = lexicalValue175_151_1;
    break lexical_join_153;
    }
    lexicalValue175_153_0 = lexicalValue175_152_0;
    lexicalValue175_153_1 = 0;
    }
    ((com.moon.mB)(lexicalValue175_153_0)).x = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue175_153_1)));
    }
    lexicalValue175_159_0 = ((__sourceExactCall_478bf6d5245036(this, ((int)(p0)), ((int)(p1)), ((int)(p2)))) ? 1 : 0);
    }
    return ((lexicalValue175_159_0) != 0);
}


private void a(int p0, int p1, boolean p2) {
com.moon.mA lexicalValue174_41_0;
    float lexicalValue174_50_0;
    int lexicalValue174_71_0;
    int spill174_0;
    float spill174_1;
    com.moon.mA spill174_2;
    boolean spill174_3;
    long life4_3;
    float life7_8;
    com.moon.nY life8_14;
    int life6_15;
    java.util.Iterator life9_19;
    com.moon.mA life10_26;
    float life11_62;
    lexical_join_90: {
    life4_3 = (com.moon.mB.E ^ 65112307158463L);
    spill174_0 = com.moon.mA.c__Int();
    life7_8 = ((float) ((moom.ir)(com.moon.nS.a())).b__Int());
    life8_14 = ((com.moon.pj)(((com.moon.module.impl.ClickGUI)(this.b)).a__pj())).a(((boolean)(false)));
    life6_15 = spill174_0;
    life9_19 = ((java.util.List)(this.u)).iterator();
    lexical_cycle_20: while (true) {
    lexical_join_88: {
    lexical_join_82: {
    lexical_join_78: {
    lexical_join_71: {
    lexical_join_70: {
    lexical_join_50: {
    lexical_join_41: {
    lexical_join_40: {
    if (!(((java.util.Iterator)(life9_19)).hasNext())) {
        break lexical_join_90;
    }
    life10_26 = ((com.moon.mA)(((java.util.Iterator)(life9_19)).next()));
    spill174_1 = ((com.moon.mA)(life10_26)).e();
    if (!((life6_15 != 0))) {
        lexicalValue174_50_0 = spill174_1;
        break lexical_join_50;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) spill174_1))), ((double)(0x1.999999999999ap-4d))) <= 0))) {
        break lexical_join_40;
    }
    spill174_2 = life10_26;
    if (!((life6_15 != 0))) {
        lexicalValue174_41_0 = spill174_2;
        break lexical_join_41;
    }
    if (!(((com.moon.mA)(spill174_2)).a__Boolean())) {
        break lexical_join_88;
    }
    }
    lexicalValue174_41_0 = life10_26;
    }
    lexicalValue174_50_0 = ((((com.moon.mA)(lexicalValue174_41_0)).c() / life7_8) * (0x1.0p0f - ((com.moon.nX)(((com.moon.mA)(life10_26)).b__nX())).b()));
    }
    life11_62 = lexicalValue174_50_0;
    spill174_3 = ((com.moon.nY)(life8_14)).a__Boolean();
    if (!((life6_15 != 0))) {
        lexicalValue174_71_0 = ((spill174_3) ? 1 : 0);
        break lexical_join_71;
    }
    if (!(spill174_3)) {
        break lexical_join_70;
    }
    com.moon.hU.a(((float)(((com.moon.nX)(((com.moon.mA)(life10_26)).b__nX())).b())));
    com.moon.hU.a(((float)(0x1.0p0f)), ((float)(((com.moon.nX)(((com.moon.mA)(life10_26)).b__nX())).b())), ((float)(0x1.0p0f)));
    com.moon.hU.b(((float)(0x0.0p0f)), ((float)(life11_62)), ((float)(0x0.0p0f)));
    }
    lexicalValue174_71_0 = ((p2) ? 1 : 0);
    }
    if (!((lexicalValue174_71_0 != 0))) {
        break lexical_join_78;
    }
    ((com.moon.mA)(life10_26)).b(((int)(p0)), ((int)(p1)));
    if (!((life6_15 == 0))) {
        break lexical_join_82;
    }
    }
    ((com.moon.mA)(life10_26)).a(((int)(p0)), ((int)(p1)));
    }
    if (!(((com.moon.nY)(life8_14)).a__Boolean())) {
        break lexical_join_88;
    }
    com.moon.hU.b__Void();
    com.moon.hU.a__Void();
    com.moon.hU.d__Void();
    }
    if (!((life6_15 == 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return;
}


public void a(int p0, int p1, int p2) {
int spill173_0;
    long life4_3;
    java.util.Iterator life7_8;
    int life6_9;
    com.moon.mA life8_16;
    lexical_join_31: {
    lexical_join_26: {
    life4_3 = (com.moon.mB.E ^ 12807910077888L);
    spill173_0 = com.moon.mA.c__Int();
    life7_8 = ((java.util.List)(this.u)).iterator();
    life6_9 = spill173_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life7_8)).hasNext())) {
        break lexical_join_26;
    }
    life8_16 = ((com.moon.mA)(((java.util.Iterator)(life7_8)).next()));
    __sourceExactCall_ebd6afe66d710e(((com.moon.mA)(life8_16)), ((int)(p0)), ((int)(p1)), ((int)(p2)));
    if (!((life6_9 != 0))) {
        break lexical_join_31;
    }
    if (!((life6_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    __sourceExactCall_2dde4ba8dca90d(this, ((int)(p0)), ((int)(p1)), ((int)(p2)));
    }
    return;
}


public com.moon.mZ a__mZ() {
return this.w;
}


public com.moon.module.Module a__k7() {
return this.v;
}


public java.util.List<com.moon.mA> a__List() {
return this.u;
}


public boolean g__sourceReturn_aae029aa0a() {
return ((((this.x) ? 1 : 0)) != 0);
}


public boolean j__sourceReturn_aae029aa0a() {
return ((((this.C) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_7c2f014c093b_invokedynamic175_44() throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_9bf881b104f5_originalDynamicSite502_1() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native void __sourceExactCall_557d30123af2d5(com.moon.mA p0);
private static native void __sourceExactCall_9531dabb37edf3(com.moon.mA p0);
private static native void __sourceExactCall_5d5bd1b4256567(com.moon.mA p0, char p1, int p2);
private static native void __sourceExactCall_13b42305f50bee(com.moon.mA p0, char p1, int p2);
private static native boolean __sourceExactCall_1949f8e6ceb2ea(com.moon.mA p0, int p1, int p2, int p3);
private static native void __sourceExactCall_ebd6afe66d710e(com.moon.mA p0, int p1, int p2, int p3);
private static native void __sourceExactCall_2dde4ba8dca90d(com.moon.mA p0, int p1, int p2, int p3);

private static native boolean __sourceExactCall_478bf6d5245036(com.moon.mA p0, int p1, int p2, int p3);

private static native float __sourceExactCall_bf9871e16b7660(com.moon.nX p0);
private static native void __sourceExactCall_247fe3d2bc87d6(com.moon.hW p0);
private static native float __sourceExactCall_2add8d4ba3153f(com.moon.mB p0);

private static native java.lang.String __sourceExactCall_ee3be4ea0188c8(com.moon.module.Module p0);
private static native com.moon.mA __sourceExactCall_b5e9b54c8c579b(com.moon.mA p0, com.moon.module.impl.ClickGUI p1);
private static native com.moon.mA __sourceExactCall_d0f1564859d69f(com.moon.mA p0, com.v p1);
private static native java.lang.Object __sourceExactCall_0e4ae1ebba34c2(com.moon.setting.ColorSetting p0);
private static native com.moon.setting.ColorSetting __sourceExactCall_3122cc5fe27378(com.moon.module.impl.ClickGUI p0);

private static native boolean __sourceExactCall_191ecc1a5dc1f7(java.util.List p0, java.lang.Object p1);

private static native int __sourceExactCall_66349b953a09b2(com.v p0);
private static native com.v __sourceExactCall_f61d11b8decb1d(int p0);
}
