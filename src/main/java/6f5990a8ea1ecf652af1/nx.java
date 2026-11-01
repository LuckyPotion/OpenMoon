package com.moon;


public class nx {

private final com.moon.nX a;

private final com.moon.nX b;

private final java.lang.String[] c;

private java.lang.String d;

private float e;

private float f;

private static boolean g;

private static final long h;

public nx(java.lang.String[] p0, java.lang.String p1) {
super();
    this.a = new com.moon.nX();
    this.b = new com.moon.nX();
    this.c = p0;
    this.d = p1;
    (this.a).a(-0x1.4e40000000000p+10f);
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(2435012080094272260L)), ((long)(-8510879783760224999L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(191434146912031L)))));
    if ((!com.moon.nx.b__Boolean())) {
        com.moon.nx.b(((boolean)(true)));
    }
}


public static void b(boolean p0) {
com.moon.nx.g = ((boolean)(p0));
    return;
}


public com.moon.nX b__nX() {
return this.b;
}


public com.moon.nx b(float p0) {
this.f = ((float)(p0));
    return this;
}


public float b() {
return this.f;
}


public static boolean b__Boolean() {
return ((((com.moon.nx.g) ? 1 : 0)) != 0);
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.nx.b__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.nx a(float p0) {
this.e = ((float)(p0));
    return this;
}


private boolean a(int p0, int p1, float p2, float p3, float p4, float p5) {
int forwardValue1132_19_0;
    int forwardValue1132_26_0;
    int forwardValue1132_35_0;
    int forwardValue1132_39_0;
    int forwardValue1132_41_0;
    int spill1132_0;
    long life7_3;
    int life9_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_35: {
    forward_join_26: {
    forward_join_19: {
    life7_3 = (com.moon.nx.h ^ 70195020293438L);
    life9_5 = ((com.moon.nx.c()) ? 1 : 0);
    spill1132_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p0))), ((float)(p2)));
    if (!((life9_5 == 0))) {
        forwardValue1132_19_0 = spill1132_0;
        break forward_join_19;
    }
    if (!((spill1132_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue1132_19_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p0))), ((float)((p2 + p4))));
    }
    if (!((life9_5 == 0))) {
        forwardValue1132_26_0 = forwardValue1132_19_0;
        break forward_join_26;
    }
    if (!((forwardValue1132_19_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue1132_26_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p1))), ((float)(p3)));
    }
    if (!((life9_5 == 0))) {
        forwardValue1132_35_0 = forwardValue1132_26_0;
        break forward_join_35;
    }
    if (!((forwardValue1132_26_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue1132_35_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p1))), ((float)((p3 + p5))));
    }
    if (!((life9_5 == 0))) {
        forwardValue1132_39_0 = forwardValue1132_35_0;
        break forward_join_39;
    }
    if (!((forwardValue1132_35_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue1132_39_0 = 1;
    }
    forwardValue1132_41_0 = forwardValue1132_39_0;
    break forward_join_41;
    }
    forwardValue1132_41_0 = 0;
    }
    return ((forwardValue1132_41_0) != 0);
}


private float a(com.moon.jm p0, float p1) {
float lexicalValue330_36_0;
    boolean spill330_0;
    float spill330_1;
    long life3_3;
    float life6_6;
    int life5_7;
    java.lang.String[] life7_10;
    int life8_13;
    int life9_15;
    java.lang.String life10_22;
    lexical_join_36: {
    lexical_join_35: {
    life3_3 = (com.moon.nx.h ^ 119623865647763L);
    spill330_0 = com.moon.nx.c();
    life6_6 = 0x0.0p0f;
    life5_7 = ((spill330_0) ? 1 : 0);
    life7_10 = this.c;
    life8_13 = (life7_10).length;
    life9_15 = 0;
    lexical_cycle_16: while (true) {
    if (!((life9_15 < life8_13))) {
        break lexical_join_35;
    }
    life10_22 = (life7_10)[life9_15];
    spill330_1 = (life6_6 + ((com.moon.jm)(p0)).a(((java.lang.String)(life10_22)), ((float)(p1))));
    if (!((life5_7 == 0))) {
        lexicalValue330_36_0 = spill330_1;
        break lexical_join_36;
    }
    life6_6 = spill330_1;
    life9_15 += 1;
    if (!((life5_7 != 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    lexicalValue330_36_0 = life6_6;
    }
    return lexicalValue330_36_0;
}


public void a(int p0, int p1, int p2) {
boolean spill329_0;
    long life4_3;
    com.moon.jm life7_9;
    float life8_11;
    float life9_13;
    float life10_21;
    int life6_22;
    float life11_27;
    float life12_38;
    float life13_45;
    float life14_47;
    java.lang.String[] life15_50;
    int life16_53;
    int life17_55;
    java.lang.String life18_62;
    float life19_67;
    float life20_77;
    float life21_85;
    float life22_96;
    float life23_100;
    float life24_104;
    lexical_join_137: {
    life4_3 = (com.moon.nx.h ^ 117003204667148L);
    spill329_0 = com.moon.nx.c();
    life7_9 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.ROBOTO_MEDIUM)));
    life8_11 = 0x1.cp2f;
    life9_13 = 0x1.8p2f;
    life10_21 = (((com.moon.jm)(life7_9)).a(((float)(0x1.08p3f))) + (life8_11 * 0x1.0p1f));
    life6_22 = ((spill329_0) ? 1 : 0);
    life11_27 = this.a(((com.moon.jm)(life7_9)), ((float)(0x1.08p3f)));
    life12_38 = (life11_27 + ((life9_13 * 0x1.0p1f) * ((float) (this.c).length)));
    life13_45 = (this.e - (life12_38 / 0x1.0p1f));
    life14_47 = 0x0.0p0f;
    life15_50 = this.c;
    life16_53 = (life15_50).length;
    life17_55 = 0;
    lexical_cycle_56: while (true) {
    lexical_join_135: {
    lexical_join_123: {
    if (!((life17_55 < life16_53))) {
        break lexical_join_137;
    }
    life18_62 = (life15_50)[life17_55];
    life19_67 = ((com.moon.jm)(life7_9)).a(((java.lang.String)(life18_62)), ((float)(0x1.08p3f)));
    life20_77 = (((life13_45 + life9_13) + life14_47) + (life19_67 / 0x1.0p1f));
    life21_85 = ((life20_77 - (life19_67 / 0x1.0p1f)) - 0x1.8p1f);
    life22_96 = ((this.f - ((life10_21 - 0x1.0p0f) / 0x1.0p1f)) + 0x1.4p1f);
    life23_100 = (life19_67 + 0x1.8p2f);
    life24_104 = (life10_21 - 0x1.4p2f);
    if (!((life6_22 == 0))) {
        break lexical_join_135;
    }
    if (!(this.a(((int)(p0)), ((int)(p1)), ((float)(life21_85)), ((float)(life22_96)), ((float)(life23_100)), ((float)(life24_104))))) {
        break lexical_join_123;
    }
    if (!((p2 == 0))) {
        break lexical_join_123;
    }
    this.d = ((java.lang.String)(life18_62));
    if (!((life6_22 != 0))) {
        break lexical_join_137;
    }
    }
    life14_47 = (life14_47 + (((com.moon.jm)(life7_9)).a(((java.lang.String)(life18_62)), ((float)(0x1.08p3f))) + (life9_13 * 0x1.0p1f)));
    life17_55 += 1;
    }
    if (!((life6_22 != 0))) { continue lexical_cycle_56; }
    break lexical_cycle_56;
    }
    }
    return;
}


public void a(com.v p0, int p1, int p2) {
float lexicalValue331_154_0;
    int lexicalValue331_274_0;
    boolean spill331_0;
    float spill331_1;
    long life4_3;
    com.moon.jm life7_8;
    float life8_10;
    float life9_13;
    float life10_21;
    float life11_26;
    float life12_37;
    int life6_38;
    com.moon.hW life13_43;
    com.moon.hW life14_50;
    com.moon.hW life15_57;
    float life16_90;
    float life17_92;
    java.lang.String[] life18_95;
    int life19_98;
    int life20_100;
    java.lang.String life21_107;
    int life22_112;
    float life23_129;
    float life24_139;
    float life25_166;
    float life26_174;
    float life27_185;
    float life28_189;
    float life29_193;
    lexical_join_275: {
    lexical_join_274: {
    lexical_join_273: {
    lexical_join_267: {
    lexical_join_261: {
    life4_3 = (com.moon.nx.h ^ 113597026965192L);
    life7_8 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.ROBOTO_MEDIUM)));
    life8_10 = 0x1.cp2f;
    spill331_0 = com.moon.nx.b__Boolean();
    life9_13 = 0x1.8p2f;
    life10_21 = (((com.moon.jm)(life7_8)).a(((float)(0x1.08p3f))) + (life8_10 * 0x1.0p1f));
    life11_26 = this.a(((com.moon.jm)(life7_8)), ((float)(0x1.08p3f)));
    life12_37 = (life11_26 + ((life9_13 * 0x1.0p1f) * ((float) (this.c).length)));
    life6_38 = ((spill331_0) ? 1 : 0);
    life13_43 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life14_50 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life7_8))))).a();
    life15_57 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life7_8))))).a();
    ((com.moon.hW)(life13_43)).a(((com.moon.iX)(com.moon.i3.a(((float)((this.e - (life12_37 / 0x1.0p1f)))), ((float)((this.f - ((life10_21 - 0x1.0p0f) / 0x1.0p1f)))), ((float)(life12_37)), ((float)(life10_21)), ((float)(((life10_21 / 0x1.0p1f) - 0x1.0p0f))), ((int)(((com.v)(p0)).q()))))));
    life16_90 = (this.e - (life12_37 / 0x1.0p1f));
    life17_92 = 0x0.0p0f;
    life18_95 = this.c;
    life19_98 = (life18_95).length;
    life20_100 = 0;
    lexical_cycle_101: while (true) {
    lexical_join_259: {
    lexical_join_203: {
    lexical_join_154: {
    lexical_join_146: {
    if (!((life20_100 < life19_98))) {
        break lexical_join_261;
    }
    life21_107 = (life18_95)[life20_100];
    life22_112 = ((((java.lang.String)(life21_107)).equals(((java.lang.Object)(this.d)))) ? 1 : 0);
    if (!((life6_38 != 0))) {
        break lexical_join_267;
    }
    if (!((life6_38 != 0))) {
        break lexical_join_259;
    }
    if (!((life22_112 != 0))) {
        break lexical_join_203;
    }
    life23_129 = ((com.moon.jm)(life7_8)).a(((java.lang.String)(life21_107)), ((float)(0x1.08p3f)));
    life24_139 = (((life16_90 + life9_13) + life17_92) + (life23_129 / 0x1.0p1f));
    spill331_1 = __sourceExactCall_bf9871e16b7660(((com.moon.nX)(this.a)));
    if (!((life6_38 != 0))) {
        lexicalValue331_154_0 = spill331_1;
        break lexical_join_154;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill331_1)), ((float)(0x0.0p0f))) < 0))) {
        break lexical_join_146;
    }
    ((com.moon.nX)(this.a)).a(((float)(life24_139)));
    }
    ((com.moon.nX)(this.a)).a(((float)(life24_139)), ((double)(0x1.99999ap-2d)));
    lexicalValue331_154_0 = __sourceExactCall_bf9871e16b7660(((com.moon.nX)(this.a)));
    }
    life25_166 = lexicalValue331_154_0;
    life26_174 = ((life25_166 - (life23_129 / 0x1.0p1f)) - 0x1.8p1f);
    life27_185 = ((this.f - ((life10_21 - 0x1.0p0f) / 0x1.0p1f)) + 0x1.4p1f);
    life28_189 = (life23_129 + 0x1.8p2f);
    life29_193 = (life10_21 - 0x1.4p2f);
    ((com.moon.hW)(life13_43)).a(((com.moon.iX)(com.moon.i3.a(((float)(life26_174)), ((float)(life27_185)), ((float)(life28_189)), ((float)(life29_193)), ((float)(((life29_193 / 0x1.0p1f) - 0x1.0p0f))), ((int)(((com.v)(p0)).a()))))));
    ((com.moon.hW)(life15_57)).a(((com.moon.jA)(com.moon.jC.a(((float)(life26_174)), ((float)(life27_185)), ((float)(life28_189)), ((float)(life29_193))))));
    }
    __sourceExactCall_1949570a13ee94(((com.moon.jm)(life7_8)), ((com.moon.hW)(life14_50)), ((java.lang.String)(life21_107)), ((float)(0x1.08p3f)), ((float)(((life16_90 + life17_92) + life9_13))), ((float)(((this.f - ((life10_21 - 0x1.0p0f) / 0x1.0p1f)) + life8_10))), ((int)(((com.v)(p0)).r())));
    __sourceExactCall_1949570a13ee94(((com.moon.jm)(life7_8)), ((com.moon.hW)(life15_57)), ((java.lang.String)(life21_107)), ((float)(0x1.08p3f)), ((float)(((life16_90 + life17_92) + life9_13))), ((float)(((this.f - ((life10_21 - 0x1.0p0f) / 0x1.0p1f)) + life8_10))), ((int)(__sourceExactCall_66349b953a09b2(((com.v)(p0))))));
    life17_92 = (life17_92 + (__sourceExactCall_b8cf447caf8b81(((com.moon.jm)(life7_8)), ((java.lang.String)(life21_107)), ((float)(0x1.08p3f))) + (life9_13 * 0x1.0p1f)));
    life20_100 += 1;
    }
    if (!((life6_38 == 0))) { continue lexical_cycle_101; }
    break lexical_cycle_101;
    }
    }
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life13_43)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life14_50)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life15_57)));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_275;
    }
    if (!((life6_38 != 0))) {
        break lexical_join_273;
    }
    lexicalValue331_274_0 = 0;
    break lexical_join_274;
    }
    lexicalValue331_274_0 = 1;
    }
    __sourceExactCall_6a1c76e14d51b0(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue331_274_0))));
    }
    return;
}


public float a() {
return this.e;
}


public java.lang.String a__String() {
return this.d;
}


public java.lang.String[] a__ArrayString() {
return this.c;
}


public com.moon.nX a__nX() {
return this.a;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native void __sourceExactCall_6a1c76e14d51b0(boolean p0);

private static native float __sourceExactCall_bf9871e16b7660(com.moon.nX p0);
private static native void __sourceExactCall_1949570a13ee94(com.moon.jm p0, com.moon.hW p1, java.lang.String p2, float p3, float p4, float p5, int p6);
private static native void __sourceExactCall_247fe3d2bc87d6(com.moon.hW p0);

private static native float __sourceExactCall_b8cf447caf8b81(com.moon.jm p0, java.lang.String p1, float p2);

private static native int __sourceExactCall_66349b953a09b2(com.v p0);
}
