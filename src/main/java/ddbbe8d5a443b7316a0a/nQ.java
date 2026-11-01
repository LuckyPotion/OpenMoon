package com.moon;


public class nQ {

private static final net.minecraft.client.Minecraft a;

public static float b;

private static final long c;

public nQ() {
super();
}


static {
c = (moom._c.a(-5450244569140623912L, 4787373134410876393L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(38072902962666L);
    a = net.minecraft.client.Minecraft.a__fM();
    b = 0x1.1df46a0000000p-6f;
}


public static net.minecraft.util.MovingObjectPosition a(moom.DR p0, moom.DR p1) {
return ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.nQ.a)).I)).a(((moom.DR)(p0)), ((moom.DR)(p1)), ((boolean)(false)));
}


public static net.minecraft.util.MovingObjectPosition a(moom.DR p0, float p1, float p2, float p3, float p4) {
net.minecraft.util.MovingObjectPosition lexicalValue297_22_0;
    int lexicalValue297_125_0;
    net.minecraft.util.MovingObjectPosition lexicalValue297_135_0;
    moom.DR lexicalValue297_136_0;
    int lexicalValue297_157_0;
    net.minecraft.entity.Entity lexicalValue297_176_0;
    int lexicalValue297_189_0;
    net.minecraft.util.MovingObjectPosition lexicalValue297_201_0;
    boolean spill297_0;
    net.minecraft.util.MovingObjectPosition spill297_1;
    boolean spill297_2;
    net.minecraft.util.MovingObjectPosition spill297_3;
    int spill297_4;
    net.minecraft.entity.Entity spill297_5;
    net.minecraft.util.MovingObjectPosition spill297_6;
    long life5_3;
    net.minecraft.entity.Entity life9_5;
    net.minecraft.util.MovingObjectPosition life8_12;
    int life7_13;
    double life10_16;
    moom.DR life12_32;
    moom.DR life13_50;
    moom.DR life14_52;
    float life15_54;
    java.util.List life16_86;
    double life17_88;
    java.util.Iterator life19_91;
    net.minecraft.entity.Entity life20_98;
    float life21_101;
    moom.CA life22_111;
    net.minecraft.util.MovingObjectPosition life23_116;
    double life24_167;
    lexical_join_201: {
    lexical_join_200: {
    lexical_join_194: {
    lexical_join_189: {
    lexical_join_184: {
    lexical_join_26: {
    lexical_join_22: {
    life5_3 = (com.moon.nQ.c ^ 109594565116634L);
    life9_5 = null;
    spill297_0 = com.moon.aO.c();
    life8_12 = com.moon.nQ.a(((moom.DR)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)));
    life7_13 = ((spill297_0) ? 1 : 0);
    life10_16 = ((double) p3);
    spill297_1 = life8_12;
    if (!((life7_13 != 0))) {
        lexicalValue297_22_0 = spill297_1;
        break lexical_join_22;
    }
    if (!((spill297_1 != null))) {
        break lexical_join_26;
    }
    lexicalValue297_22_0 = life8_12;
    }
    life10_16 = ((moom.DR)(((net.minecraft.util.MovingObjectPosition)(lexicalValue297_22_0)).d)).b(((moom.DR)(p0)));
    }
    life12_32 = com.moon.nQ.a(((float)(p1)), ((float)(p2)));
    life13_50 = ((moom.DR)(p0)).b(((double)((((moom.DR)(life12_32)).a * ((double) p3)))), ((double)((((moom.DR)(life12_32)).b * ((double) p3)))), ((double)((((moom.DR)(life12_32)).c * ((double) p3)))));
    life14_52 = null;
    life15_54 = 0x1.0p0f;
    life16_86 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.nQ.a)).I)).a(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.nQ.a)).K)), ((moom.CA)(((moom.CA)(((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nQ.a)).K)).b())).a(((double)((((moom.DR)(life12_32)).a * ((double) p3)))), ((double)((((moom.DR)(life12_32)).b * ((double) p3)))), ((double)((((moom.DR)(life12_32)).c * ((double) p3))))))).b(((double)(0x1.0p0d)), ((double)(0x1.0p0d)), ((double)(0x1.0p0d))))), ((com.google.common.base.Predicate)(com.google.common.base.Predicates.and(((com.google.common.base.Predicate)(moom.CY.d)), ((com.google.common.base.Predicate)(__sourceIntrinsic_a7b128cd154f_invokedynamic297_24()))))));
    life17_88 = life10_16;
    life19_91 = ((java.util.List)(life16_86)).iterator();
    lexical_cycle_89: while (true) {
    lexical_join_182: {
    lexical_join_176: {
    lexical_join_175: {
    lexical_join_158: {
    lexical_join_157: {
    lexical_join_141: {
    lexical_join_136: {
    lexical_join_135: {
    lexical_join_134: {
    lexical_join_125: {
    if (!(((java.util.Iterator)(life19_91)).hasNext())) {
        break lexical_join_184;
    }
    life20_98 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life19_91)).next()));
    life21_101 = ((net.minecraft.entity.Entity)(life20_98)).c();
    life22_111 = ((moom.CA)(((net.minecraft.entity.Entity)(life20_98)).b())).b(((double)(((double) life21_101))), ((double)(((double) life21_101))), ((double)(((double) life21_101))));
    life23_116 = ((moom.CA)(life22_111)).a(((moom.DR)(p0)), ((moom.DR)(life13_50)));
    spill297_2 = ((moom.CA)(life22_111)).a(((moom.DR)(p0)));
    if (!((life7_13 != 0))) {
        lexicalValue297_189_0 = ((spill297_2) ? 1 : 0);
        break lexical_join_189;
    }
    if (!((life7_13 != 0))) {
        lexicalValue297_125_0 = ((spill297_2) ? 1 : 0);
        break lexical_join_125;
    }
    if (!(spill297_2)) {
        break lexical_join_141;
    }
    lexicalValue297_125_0 = recovery.source.CarrierOps.dcmpl(((double)(life17_88)), ((double)(0x0.0p0d)));
    }
    if (!((lexicalValue297_125_0 >= 0))) {
        break lexical_join_182;
    }
    life9_5 = life20_98;
    spill297_3 = life23_116;
    if (!((life7_13 != 0))) {
        lexicalValue297_135_0 = spill297_3;
        break lexical_join_135;
    }
    if (!((spill297_3 == null))) {
        break lexical_join_134;
    }
    lexicalValue297_136_0 = p0;
    break lexical_join_136;
    }
    lexicalValue297_135_0 = life23_116;
    }
    lexicalValue297_136_0 = ((net.minecraft.util.MovingObjectPosition)(lexicalValue297_135_0)).d;
    }
    life14_52 = lexicalValue297_136_0;
    life17_88 = 0x0.0p0d;
    if (!((life7_13 == 0))) {
        break lexical_join_182;
    }
    }
    if (!((life23_116 != null))) {
        break lexical_join_182;
    }
    life24_167 = ((moom.DR)(p0)).b(((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life23_116)).d)));
    spill297_4 = recovery.source.CarrierOps.dcmpg(((double)(life24_167)), ((double)(life17_88)));
    if (!((life7_13 != 0))) {
        lexicalValue297_157_0 = spill297_4;
        break lexical_join_157;
    }
    if (!((spill297_4 >= 0))) {
        break lexical_join_158;
    }
    lexicalValue297_157_0 = recovery.source.CarrierOps.dcmpl(((double)(life17_88)), ((double)(0x0.0p0d)));
    }
    if (!((lexicalValue297_157_0 == 0))) {
        break lexical_join_182;
    }
    }
    spill297_5 = life20_98;
    if (!((life7_13 != 0))) {
        lexicalValue297_176_0 = spill297_5;
        break lexical_join_176;
    }
    if (!((spill297_5 == ((net.minecraft.entity.Entity)(life20_98)).g))) {
        break lexical_join_175;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life17_88)), ((double)(0x0.0p0d))) == 0))) {
        break lexical_join_182;
    }
    life9_5 = life20_98;
    life14_52 = ((net.minecraft.util.MovingObjectPosition)(life23_116)).d;
    if (!((life7_13 == 0))) {
        break lexical_join_182;
    }
    }
    lexicalValue297_176_0 = life20_98;
    }
    life9_5 = lexicalValue297_176_0;
    life14_52 = ((net.minecraft.util.MovingObjectPosition)(life23_116)).d;
    life17_88 = life24_167;
    }
    if (!((life7_13 == 0))) { continue lexical_cycle_89; }
    break lexical_cycle_89;
    }
    }
    if (!((life9_5 != null))) {
        break lexical_join_200;
    }
    lexicalValue297_189_0 = recovery.source.CarrierOps.dcmpg(((double)(life17_88)), ((double)(life10_16)));
    }
    if (!((lexicalValue297_189_0 >= 0))) {
        break lexical_join_194;
    }
    spill297_6 = life8_12;
    if (!((life7_13 != 0))) {
        lexicalValue297_201_0 = spill297_6;
        break lexical_join_201;
    }
    if (!((spill297_6 == null))) {
        break lexical_join_200;
    }
    }
    life8_12 = new net.minecraft.util.MovingObjectPosition(life9_5, life14_52);
    }
    lexicalValue297_201_0 = life8_12;
    }
    return lexicalValue297_201_0;
}


public static net.minecraft.util.MovingObjectPosition a(float p0, float p1, float p2, float p3) {
net.minecraft.util.MovingObjectPosition lexicalValue296_27_0;
    int lexicalValue296_130_0;
    net.minecraft.util.MovingObjectPosition lexicalValue296_140_0;
    moom.DR lexicalValue296_141_0;
    int lexicalValue296_162_0;
    net.minecraft.entity.Entity lexicalValue296_181_0;
    int lexicalValue296_194_0;
    net.minecraft.util.MovingObjectPosition lexicalValue296_206_0;
    net.minecraft.util.MovingObjectPosition lexicalValue296_212_0;
    net.minecraft.util.MovingObjectPosition lexicalValue296_213_0;
    int lexicalValue296_213_1;
    net.minecraft.util.MovingObjectPosition lexicalValue296_214_0;
    boolean spill296_0;
    net.minecraft.util.MovingObjectPosition spill296_1;
    boolean spill296_2;
    net.minecraft.util.MovingObjectPosition spill296_3;
    int spill296_4;
    net.minecraft.entity.Entity spill296_5;
    net.minecraft.util.MovingObjectPosition spill296_6;
    long life4_3;
    moom.DR life7_9;
    int life6_10;
    net.minecraft.entity.Entity life9_12;
    net.minecraft.util.MovingObjectPosition life8_18;
    double life10_21;
    moom.DR life12_37;
    moom.DR life13_55;
    moom.DR life14_57;
    float life15_59;
    java.util.List life16_91;
    double life17_93;
    java.util.Iterator life19_96;
    net.minecraft.entity.Entity life20_103;
    float life21_106;
    moom.CA life22_116;
    net.minecraft.util.MovingObjectPosition life23_121;
    double life24_172;
    lexical_join_214: {
    lexical_join_213: {
    lexical_join_212: {
    lexical_join_206: {
    lexical_join_205: {
    lexical_join_199: {
    lexical_join_194: {
    lexical_join_189: {
    lexical_join_31: {
    lexical_join_27: {
    life4_3 = (com.moon.nQ.c ^ 126816297575593L);
    spill296_0 = com.moon.aO.c();
    life7_9 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nQ.a)).K)).b(((float)(p3)));
    life6_10 = ((spill296_0) ? 1 : 0);
    life9_12 = null;
    life8_18 = com.moon.nQ.a(((moom.DR)(life7_9)), ((float)(p0)), ((float)(p1)), ((float)(p2)));
    life10_21 = ((double) p2);
    spill296_1 = life8_18;
    if (!((life6_10 != 0))) {
        lexicalValue296_27_0 = spill296_1;
        break lexical_join_27;
    }
    if (!((spill296_1 != null))) {
        break lexical_join_31;
    }
    lexicalValue296_27_0 = life8_18;
    }
    life10_21 = ((moom.DR)(((net.minecraft.util.MovingObjectPosition)(lexicalValue296_27_0)).d)).b(((moom.DR)(life7_9)));
    }
    life12_37 = com.moon.nQ.a(((float)(p0)), ((float)(p1)));
    life13_55 = ((moom.DR)(life7_9)).b(((double)((((moom.DR)(life12_37)).a * ((double) p2)))), ((double)((((moom.DR)(life12_37)).b * ((double) p2)))), ((double)((((moom.DR)(life12_37)).c * ((double) p2)))));
    life14_57 = null;
    life15_59 = 0x1.0p0f;
    life16_91 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.nQ.a)).I)).a(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.nQ.a)).K)), ((moom.CA)(((moom.CA)(((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nQ.a)).K)).b())).a(((double)((((moom.DR)(life12_37)).a * ((double) p2)))), ((double)((((moom.DR)(life12_37)).b * ((double) p2)))), ((double)((((moom.DR)(life12_37)).c * ((double) p2))))))).b(((double)(0x1.0p0d)), ((double)(0x1.0p0d)), ((double)(0x1.0p0d))))), ((com.google.common.base.Predicate)(com.google.common.base.Predicates.and(((com.google.common.base.Predicate)(moom.CY.d)), ((com.google.common.base.Predicate)(__sourceIntrinsic_4aa8bb2044aa_invokedynamic296_27()))))));
    life17_93 = life10_21;
    life19_96 = ((java.util.List)(life16_91)).iterator();
    lexical_cycle_94: while (true) {
    lexical_join_187: {
    lexical_join_181: {
    lexical_join_180: {
    lexical_join_163: {
    lexical_join_162: {
    lexical_join_146: {
    lexical_join_141: {
    lexical_join_140: {
    lexical_join_139: {
    lexical_join_130: {
    if (!(((java.util.Iterator)(life19_96)).hasNext())) {
        break lexical_join_189;
    }
    life20_103 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life19_96)).next()));
    life21_106 = ((net.minecraft.entity.Entity)(life20_103)).c();
    life22_116 = ((moom.CA)(((net.minecraft.entity.Entity)(life20_103)).b())).b(((double)(((double) life21_106))), ((double)(((double) life21_106))), ((double)(((double) life21_106))));
    life23_121 = ((moom.CA)(life22_116)).a(((moom.DR)(life7_9)), ((moom.DR)(life13_55)));
    spill296_2 = ((moom.CA)(life22_116)).a(((moom.DR)(life7_9)));
    if (!((life6_10 != 0))) {
        lexicalValue296_194_0 = ((spill296_2) ? 1 : 0);
        break lexical_join_194;
    }
    if (!((life6_10 != 0))) {
        lexicalValue296_130_0 = ((spill296_2) ? 1 : 0);
        break lexical_join_130;
    }
    if (!(spill296_2)) {
        break lexical_join_146;
    }
    lexicalValue296_130_0 = recovery.source.CarrierOps.dcmpl(((double)(life17_93)), ((double)(0x0.0p0d)));
    }
    if (!((lexicalValue296_130_0 >= 0))) {
        break lexical_join_187;
    }
    life9_12 = life20_103;
    spill296_3 = life23_121;
    if (!((life6_10 != 0))) {
        lexicalValue296_140_0 = spill296_3;
        break lexical_join_140;
    }
    if (!((spill296_3 == null))) {
        break lexical_join_139;
    }
    lexicalValue296_141_0 = life7_9;
    break lexical_join_141;
    }
    lexicalValue296_140_0 = life23_121;
    }
    lexicalValue296_141_0 = ((net.minecraft.util.MovingObjectPosition)(lexicalValue296_140_0)).d;
    }
    life14_57 = lexicalValue296_141_0;
    life17_93 = 0x0.0p0d;
    if (!((life6_10 == 0))) {
        break lexical_join_187;
    }
    }
    if (!((life23_121 != null))) {
        break lexical_join_187;
    }
    life24_172 = ((moom.DR)(life7_9)).b(((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life23_121)).d)));
    spill296_4 = recovery.source.CarrierOps.dcmpg(((double)(life24_172)), ((double)(life17_93)));
    if (!((life6_10 != 0))) {
        lexicalValue296_162_0 = spill296_4;
        break lexical_join_162;
    }
    if (!((spill296_4 >= 0))) {
        break lexical_join_163;
    }
    lexicalValue296_162_0 = recovery.source.CarrierOps.dcmpl(((double)(life17_93)), ((double)(0x0.0p0d)));
    }
    if (!((lexicalValue296_162_0 == 0))) {
        break lexical_join_187;
    }
    }
    spill296_5 = life20_103;
    if (!((life6_10 != 0))) {
        lexicalValue296_181_0 = spill296_5;
        break lexical_join_181;
    }
    if (!((spill296_5 == ((net.minecraft.entity.Entity)(life20_103)).g))) {
        break lexical_join_180;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life17_93)), ((double)(0x0.0p0d))) == 0))) {
        break lexical_join_187;
    }
    life9_12 = life20_103;
    life14_57 = ((net.minecraft.util.MovingObjectPosition)(life23_121)).d;
    if (!((life6_10 == 0))) {
        break lexical_join_187;
    }
    }
    lexicalValue296_181_0 = life20_103;
    }
    life9_12 = lexicalValue296_181_0;
    life14_57 = ((net.minecraft.util.MovingObjectPosition)(life23_121)).d;
    life17_93 = life24_172;
    }
    if (!((life6_10 == 0))) { continue lexical_cycle_94; }
    break lexical_cycle_94;
    }
    }
    if (!((life9_12 != null))) {
        break lexical_join_205;
    }
    lexicalValue296_194_0 = recovery.source.CarrierOps.dcmpg(((double)(life17_93)), ((double)(life10_21)));
    }
    if (!((lexicalValue296_194_0 >= 0))) {
        break lexical_join_199;
    }
    spill296_6 = life8_18;
    if (!((life6_10 != 0))) {
        lexicalValue296_206_0 = spill296_6;
        break lexical_join_206;
    }
    if (!((spill296_6 == null))) {
        break lexical_join_205;
    }
    }
    life8_18 = new net.minecraft.util.MovingObjectPosition(life9_12, life14_57);
    }
    lexicalValue296_206_0 = life8_18;
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        lexicalValue296_214_0 = lexicalValue296_206_0;
        break lexical_join_214;
    }
    if (!((life6_10 != 0))) {
        lexicalValue296_212_0 = lexicalValue296_206_0;
        break lexical_join_212;
    }
    lexicalValue296_213_0 = lexicalValue296_206_0;
    lexicalValue296_213_1 = 0;
    break lexical_join_213;
    }
    lexicalValue296_213_0 = lexicalValue296_212_0;
    lexicalValue296_213_1 = 1;
    }
    com.moon.aO.b(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue296_213_1))));
    lexicalValue296_214_0 = lexicalValue296_213_0;
    }
    return lexicalValue296_214_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static boolean a(com.moon.n4 p0, moom.bs p1, moom.DT p2) {
net.minecraft.util.MovingObjectPosition forwardValue1067_21_0;
    moom.DT forwardValue1067_37_0;
    int forwardValue1067_47_0;
    int forwardValue1067_53_0;
    int forwardValue1067_57_0;
    int forwardValue1067_59_0;
    boolean spill1067_0;
    net.minecraft.util.MovingObjectPosition spill1067_1;
    moom.DT spill1067_2;
    int spill1067_3;
    long life3_3;
    net.minecraft.util.MovingObjectPosition life6_12;
    int life5_13;
    moom.DR life7_27;
    moom.DT life8_36;
    int life9_51;
    int life10_61;
    forward_join_59: {
    forward_join_58: {
    forward_join_57: {
    forward_join_53: {
    forward_join_47: {
    forward_join_46: {
    forward_join_37: {
    forward_join_36: {
    forward_join_27: {
    forward_join_21: {
    forward_join_20: {
    life3_3 = (com.moon.nQ.c ^ 44634893519987L);
    spill1067_0 = com.moon.aO.c();
    life6_12 = com.moon.nQ.a(((float)(((com.moon.n4)(p0)).a__Float())), ((float)(((com.moon.n4)(p0)).b__Float())), ((float)(0x1.2p2f)), ((float)(0x1.0p0f)));
    life5_13 = ((spill1067_0) ? 1 : 0);
    spill1067_1 = life6_12;
    if (!((life5_13 != 0))) {
        forwardValue1067_21_0 = spill1067_1;
        break forward_join_21;
    }
    if (!((spill1067_1 == null))) {
        break forward_join_20;
    }
    return ((0) != 0);
    }
    forwardValue1067_21_0 = life6_12;
    }
    life7_27 = ((net.minecraft.util.MovingObjectPosition)(forwardValue1067_21_0)).d;
    if (!((life7_27 == null))) {
        break forward_join_27;
    }
    return ((0) != 0);
    }
    life8_36 = ((net.minecraft.util.MovingObjectPosition)(life6_12)).a();
    spill1067_2 = life8_36;
    if (!((life5_13 != 0))) {
        forwardValue1067_37_0 = spill1067_2;
        break forward_join_37;
    }
    if (!((spill1067_2 == null))) {
        break forward_join_36;
    }
    return ((0) != 0);
    }
    forwardValue1067_37_0 = life8_36;
    }
    life9_51 = ((((moom.DT)(forwardValue1067_37_0)).equals(((java.lang.Object)(p2)))) ? 1 : 0);
    if (!((((net.minecraft.util.MovingObjectPosition)(life6_12)).c == p1))) {
        break forward_join_46;
    }
    forwardValue1067_47_0 = 1;
    break forward_join_47;
    }
    forwardValue1067_47_0 = 0;
    }
    life10_61 = forwardValue1067_47_0;
    spill1067_3 = life9_51;
    if (!((life5_13 != 0))) {
        forwardValue1067_53_0 = spill1067_3;
        break forward_join_53;
    }
    if (!((spill1067_3 != 0))) {
        break forward_join_58;
    }
    forwardValue1067_53_0 = life10_61;
    }
    if (!((life5_13 != 0))) {
        forwardValue1067_57_0 = forwardValue1067_53_0;
        break forward_join_57;
    }
    if (!((forwardValue1067_53_0 != 0))) {
        break forward_join_58;
    }
    forwardValue1067_57_0 = 1;
    }
    forwardValue1067_59_0 = forwardValue1067_57_0;
    break forward_join_59;
    }
    forwardValue1067_59_0 = 0;
    }
    return ((forwardValue1067_59_0) != 0);
}


public static boolean a(moom.DR p0, com.moon.n4 p1, moom.bs p2, moom.DT p3) {
net.minecraft.util.MovingObjectPosition forwardValue1069_22_0;
    moom.DT forwardValue1069_38_0;
    int forwardValue1069_48_0;
    int forwardValue1069_54_0;
    int forwardValue1069_58_0;
    int forwardValue1069_60_0;
    boolean spill1069_0;
    net.minecraft.util.MovingObjectPosition spill1069_1;
    moom.DT spill1069_2;
    int spill1069_3;
    long life4_3;
    net.minecraft.util.MovingObjectPosition life7_13;
    int life6_14;
    moom.DR life8_28;
    moom.DT life9_37;
    int life10_52;
    int life11_62;
    forward_join_60: {
    forward_join_59: {
    forward_join_58: {
    forward_join_54: {
    forward_join_48: {
    forward_join_47: {
    forward_join_38: {
    forward_join_37: {
    forward_join_28: {
    forward_join_22: {
    forward_join_21: {
    life4_3 = (com.moon.nQ.c ^ 7746316310592L);
    spill1069_0 = com.moon.aO.b__Boolean();
    life7_13 = com.moon.nQ.a(((moom.DR)(p0)), ((float)(((com.moon.n4)(p1)).a__Float())), ((float)(((com.moon.n4)(p1)).b__Float())), ((float)(0x1.2p2f)), ((float)(0x1.0p0f)));
    life6_14 = ((spill1069_0) ? 1 : 0);
    spill1069_1 = life7_13;
    if (!((life6_14 == 0))) {
        forwardValue1069_22_0 = spill1069_1;
        break forward_join_22;
    }
    if (!((spill1069_1 == null))) {
        break forward_join_21;
    }
    return ((0) != 0);
    }
    forwardValue1069_22_0 = life7_13;
    }
    life8_28 = ((net.minecraft.util.MovingObjectPosition)(forwardValue1069_22_0)).d;
    if (!((life8_28 == null))) {
        break forward_join_28;
    }
    return ((0) != 0);
    }
    life9_37 = ((net.minecraft.util.MovingObjectPosition)(life7_13)).a();
    spill1069_2 = life9_37;
    if (!((life6_14 == 0))) {
        forwardValue1069_38_0 = spill1069_2;
        break forward_join_38;
    }
    if (!((spill1069_2 == null))) {
        break forward_join_37;
    }
    return ((0) != 0);
    }
    forwardValue1069_38_0 = life9_37;
    }
    life10_52 = ((((moom.DT)(forwardValue1069_38_0)).equals(((java.lang.Object)(p3)))) ? 1 : 0);
    if (!((((net.minecraft.util.MovingObjectPosition)(life7_13)).c == p2))) {
        break forward_join_47;
    }
    forwardValue1069_48_0 = 1;
    break forward_join_48;
    }
    forwardValue1069_48_0 = 0;
    }
    life11_62 = forwardValue1069_48_0;
    spill1069_3 = life10_52;
    if (!((life6_14 == 0))) {
        forwardValue1069_54_0 = spill1069_3;
        break forward_join_54;
    }
    if (!((spill1069_3 != 0))) {
        break forward_join_59;
    }
    forwardValue1069_54_0 = life11_62;
    }
    if (!((life6_14 == 0))) {
        forwardValue1069_58_0 = forwardValue1069_54_0;
        break forward_join_58;
    }
    if (!((forwardValue1069_54_0 != 0))) {
        break forward_join_59;
    }
    forwardValue1069_58_0 = 1;
    }
    forwardValue1069_60_0 = forwardValue1069_58_0;
    break forward_join_60;
    }
    forwardValue1069_60_0 = 0;
    }
    return ((forwardValue1069_60_0) != 0);
}


public static moom.DR a(float p0, float p1) {
float local2 = moom.Dr.b(((float)((((-p0) * com.moon.nQ.b) - 0x1.921fb6p1f))));
    float local3 = moom.Dr.a(((float)((((-p0) * com.moon.nQ.b) - 0x1.921fb6p1f))));
    float local4 = (-moom.Dr.b(((float)(((-p1) * com.moon.nQ.b)))));
    float local5 = moom.Dr.a(((float)(((-p1) * com.moon.nQ.b))));
    return new moom.DR(((double) (local3 * local4)), ((double) local5), ((double) (local2 * local4)));
}


public static net.minecraft.util.MovingObjectPosition a(moom.DR p0, float p1, float p2, float p3) {
java.lang.Object local4 = com.moon.nQ.a(((float)(p1)), ((float)(p2)));
    return com.moon.nQ.a(((moom.DR)(p0)), ((moom.DR)(local4)), ((float)(p3)));
}


public static net.minecraft.util.MovingObjectPosition a(moom.DR p0, moom.DR p1, float p2) {
return com.moon.nQ.a(((moom.DR)(p0)), ((moom.DR)(((moom.DR)(p0)).d(((moom.DR)(((moom.DR)(((moom.DR)(p1)).a__DR())).c(((float)(p2)))))))));
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_4aa8bb2044aa_invokedynamic296_27() throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_a7b128cd154f_invokedynamic297_24() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
