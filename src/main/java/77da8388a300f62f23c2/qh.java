package moom;


public class qh extends net.minecraft.command.CommandBase {

private static long c;

public qh() {
super();
}


static {
moom.qh.c = (moom._c.a(7524071132989095675L, -4648163675621272099L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(84136173120261L);
}

private static native <E extends Throwable> void __sourceHandlerCall_e70dee8e7ff2c8582c99(moom.qh a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_e70dee8e7ff2c8582c99 {

public static void f100131(moom.qh receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    java.lang.String[] forestValue100131_20_0;
    int forestValue100131_49_0;
    net.minecraft.entity.player.EntityPlayerMP forestValue100131_59_0;
    int forestValue100131_77_0;
    int forestValue100131_117_0;
    moom.BY forestValue100131_150_0;
    int forestValue100131_202_0;
    int forestValue100131_229_0;
    moom.BZ forestValue100131_294_0;
    int forestValue100131_334_0;
    moom.BZ forestValue100131_351_0;
    int forestValue100131_368_0;
    int forestValue100131_393_0;
    java.lang.String[] spill100131_0;
    moom.cc spill100131_1;
    boolean spill100131_2;
    moom.b7 spill100131_3;
    moom.b7 spill100131_4;
    java.lang.String spill100131_5;
    java.lang.Object[] spill100131_6;
    int spill100131_7;
    moom.BY spill100131_8;
    int spill100131_9;
    net.minecraft.command.ICommandSender spill100131_10;
    moom.qh spill100131_11;
    java.lang.String spill100131_12;
    java.lang.Object[] spill100131_13;
    net.minecraft.command.ICommandSender spill100131_14;
    moom.qh spill100131_15;
    java.lang.String spill100131_16;
    java.lang.Object[] spill100131_17;
    int spill100131_18;
    int spill100131_19;
    moom.b7 spill100131_20;
    moom.b7 spill100131_21;
    java.lang.String spill100131_22;
    java.lang.Object[] spill100131_23;
    java.lang.Object[] spill100131_24;
    boolean spill100131_25;
    moom.b7 spill100131_26;
    moom.b7 spill100131_27;
    java.lang.String spill100131_28;
    java.lang.Object[] spill100131_29;
    java.lang.Object[] spill100131_30;
    int spill100131_31;
    moom.BZ spill100131_32;
    boolean spill100131_33;
    moom.BZ spill100131_34;
    net.minecraft.command.ICommandSender spill100131_35;
    moom.qh spill100131_36;
    java.lang.String spill100131_37;
    java.lang.Object[] spill100131_38;
    java.lang.Object[] spill100131_39;
    net.minecraft.command.ICommandSender spill100131_40;
    moom.qh spill100131_41;
    java.lang.String spill100131_42;
    java.lang.Object[] spill100131_43;
    java.lang.Object[] spill100131_44;
    long life3_3;
    int life5_5;
    moom.BY life6_27;
    net.minecraft.entity.player.EntityPlayerMP life7_71;
    int life8_77;
    int life9_83;
    java.util.Iterator life10_113;
    moom.BZ life11_122;
    java.util.Iterator life10_155;
    moom.BZ life11_164;
    moom.BZ life10_201;
    java.util.ArrayList life11_234;
    java.util.Iterator life12_270;
    moom.BZ life13_279;
    java.util.ArrayList life11_332;
    java.util.ArrayList life12_335;
    java.util.Iterator life13_338;
    moom.BZ life14_347;
    moom.BZ life15_349;
    int life16_354;
    moom.BZ life15_385;
    java.util.Iterator life13_408;
    moom.BZ life14_419;
    moom.BZ life14_435;
    moom.BZ life14_449;
    forest_join_413: {
    forest_join_393: {
    forest_join_392: {
    forest_join_368: {
    forest_join_367: {
    forest_join_351: {
    forest_join_350: {
    forest_join_334: {
    forest_join_316: {
    forest_join_254: {
    forest_join_229: {
    forest_join_228: {
    forest_join_226: {
    forest_join_208: {
    forest_join_183: {
    forest_join_150: {
    forest_join_149: {
    forest_join_147: {
    forest_join_136: {
    forest_join_117: {
    forest_join_116: {
    forest_join_114: {
    forest_join_103: {
    forest_join_78: {
    forest_join_77: {
    forest_join_59: {
    forest_join_57: {
    forest_join_49: {
    forest_join_47: {
    forest_join_20: {
    forest_join_19: {
    life3_3 = (__fieldRead100131_0() ^ 60246941474443L);
    life5_5 = __call100131_1();
    spill100131_0 = p1;
    if (!((life5_5 != 0))) {
        forestValue100131_20_0 = spill100131_0;
        break forest_join_20;
    }
    if (!(((spill100131_0).length < 2))) {
        break forest_join_19;
    }
    moom.cc __stackOp100131_3_0 = __sourceUninitializedNEW100131_2();
    spill100131_1 = __stackOp100131_3_0;
    __explicitNewInit100131_4(__stackOp100131_3_0, "commands.achievement.usage", new java.lang.Object[0]);
    throw spill100131_1;
    }
    forestValue100131_20_0 = p1;
    }
    life6_27 = __call100131_5((forestValue100131_20_0)[1]);
    if (!((life6_27 == null))) {
        break forest_join_47;
    }
    spill100131_2 = __call100131_6((p1)[1], "*");
    if (!((life5_5 != 0))) {
        forestValue100131_49_0 = __integerCategory100131_7(spill100131_2);
        break forest_join_49;
    }
    if (!((!spill100131_2))) {
        break forest_join_47;
    }
    moom.b7 __stackOp100131_9_0 = __sourceUninitializedNEW100131_8();
    spill100131_3 = __stackOp100131_9_0;
    spill100131_4 = __stackOp100131_9_0;
    spill100131_5 = "commands.achievement.unknownAchievement";
    java.lang.Object[] __stackOp100131_10_0 = new java.lang.Object[1];
    spill100131_6 = __stackOp100131_10_0;
    (__stackOp100131_10_0)[0] = (p1)[1];
    __explicitNewInit100131_11(spill100131_4, spill100131_5, spill100131_6);
    throw spill100131_3;
    }
    forestValue100131_49_0 = (p1).length;
    }
    if (!((forestValue100131_49_0 >= 3))) {
        break forest_join_57;
    }
    forestValue100131_59_0 = __call100131_12(p0, (p1)[2]);
    break forest_join_59;
    }
    forestValue100131_59_0 = __call100131_13(p0);
    }
    life7_71 = forestValue100131_59_0;
    life8_77 = __integerCategory100131_15(__call100131_14((p1)[0], "give"));
    life9_83 = __integerCategory100131_17(__call100131_16((p1)[0], "take"));
    spill100131_7 = life8_77;
    if (!((life5_5 != 0))) {
        forestValue100131_77_0 = spill100131_7;
        break forest_join_77;
    }
    if (!((spill100131_7 == 0))) {
        break forest_join_78;
    }
    forestValue100131_77_0 = life9_83;
    }
    if (!((forestValue100131_77_0 != 0))) {
        break forest_join_413;
    }
    }
    spill100131_8 = life6_27;
    if (!((life5_5 != 0))) {
        forestValue100131_150_0 = spill100131_8;
        break forest_join_150;
    }
    if (!((spill100131_8 == null))) {
        break forest_join_149;
    }
    spill100131_9 = life8_77;
    if (!((life5_5 != 0))) {
        forestValue100131_117_0 = spill100131_9;
        break forest_join_117;
    }
    if (!((spill100131_9 != 0))) {
        break forest_join_116;
    }
    life10_113 = __call100131_19(__fieldRead100131_18());
    forest_cycle_89: while (true) {
    if (!(__call100131_20(life10_113))) {
        break forest_join_103;
    }
    life11_122 = __cast100131_22(__call100131_21(life10_113));
    __call100131_23(life7_71, life11_122);
    if (!((life5_5 != 0))) {
        break forest_join_114;
    }
    if (!((life5_5 == 0))) {
        continue forest_cycle_89;
    }
    break forest_cycle_89;
    }
    }
    spill100131_10 = p0;
    spill100131_11 = receiver;
    spill100131_12 = "commands.achievement.give.success.all";
    java.lang.Object[] __stackOp100131_24_0 = new java.lang.Object[1];
    spill100131_13 = __stackOp100131_24_0;
    (__stackOp100131_24_0)[0] = __call100131_25(life7_71);
    __call100131_26(spill100131_10, spill100131_11, spill100131_12, spill100131_13);
    }
    if (!((life5_5 == 0))) {
        break forest_join_413;
    }
    }
    forestValue100131_117_0 = life9_83;
    }
    if (!((forestValue100131_117_0 != 0))) {
        break forest_join_413;
    }
    life10_155 = __call100131_29(__call100131_28(__fieldRead100131_27()));
    forest_cycle_122: while (true) {
    if (!(__call100131_30(life10_155))) {
        break forest_join_136;
    }
    life11_164 = __cast100131_32(__call100131_31(life10_155));
    __call100131_33(life7_71, life11_164);
    if (!((life5_5 != 0))) {
        break forest_join_147;
    }
    if (!((life5_5 == 0))) {
        continue forest_cycle_122;
    }
    break forest_cycle_122;
    }
    }
    spill100131_14 = p0;
    spill100131_15 = receiver;
    spill100131_16 = "commands.achievement.take.success.all";
    java.lang.Object[] __stackOp100131_34_0 = new java.lang.Object[1];
    spill100131_17 = __stackOp100131_34_0;
    (__stackOp100131_34_0)[0] = __call100131_35(life7_71);
    __call100131_36(spill100131_14, spill100131_15, spill100131_16, spill100131_17);
    }
    if (!((life5_5 == 0))) {
        break forest_join_413;
    }
    }
    forestValue100131_150_0 = life6_27;
    }
    spill100131_18 = __instanceOf100131_37(forestValue100131_150_0);
    if (!((life5_5 != 0))) {
        forestValue100131_368_0 = spill100131_18;
        break forest_join_368;
    }
    if (!((spill100131_18 != 0))) {
        break forest_join_367;
    }
    life10_201 = __cast100131_38(life6_27);
    spill100131_19 = life8_77;
    if (!((life5_5 != 0))) {
        forestValue100131_229_0 = spill100131_19;
        break forest_join_229;
    }
    if (!((spill100131_19 != 0))) {
        break forest_join_228;
    }
    if (!(__call100131_40(__call100131_39(life7_71), life10_201))) {
        break forest_join_183;
    }
    moom.b7 __stackOp100131_42_0 = __sourceUninitializedNEW100131_41();
    spill100131_20 = __stackOp100131_42_0;
    spill100131_21 = __stackOp100131_42_0;
    spill100131_22 = "commands.achievement.alreadyHave";
    java.lang.Object[] __stackOp100131_43_0 = new java.lang.Object[2];
    spill100131_23 = __stackOp100131_43_0;
    (__stackOp100131_43_0)[0] = __call100131_44(life7_71);
    java.lang.Object[] __stackOp100131_45_0 = spill100131_23;
    spill100131_24 = __stackOp100131_45_0;
    (__stackOp100131_45_0)[1] = __call100131_46(life6_27);
    __explicitNewInit100131_47(spill100131_21, spill100131_22, spill100131_24);
    throw spill100131_20;
    }
    life11_234 = __call100131_48();
    forest_cycle_185: while (true) {
    forest_join_202: {
    if (!((__fieldRead100131_49(life10_201) != null))) {
        break forest_join_208;
    }
    spill100131_25 = __call100131_52(__call100131_50(life7_71), __fieldRead100131_51(life10_201));
    if (!((life5_5 != 0))) {
        forestValue100131_368_0 = __integerCategory100131_53(spill100131_25);
        break forest_join_368;
    }
    if (!((life5_5 != 0))) {
        forestValue100131_202_0 = __integerCategory100131_54(spill100131_25);
        break forest_join_202;
    }
    if (!((!spill100131_25))) {
        break forest_join_208;
    }
    forestValue100131_202_0 = __integerCategory100131_57(__call100131_56(life11_234, __fieldRead100131_55(life10_201)));
    }
    __discardScalar100131_58(forestValue100131_202_0);
    life10_201 = __fieldRead100131_59(life10_201);
    if (!((life5_5 == 0))) {
        continue forest_cycle_185;
    }
    break forest_cycle_185;
    }
    }
    life12_270 = __call100131_61(__call100131_60(life11_234));
    forest_cycle_212: while (true) {
    if (!(__call100131_62(life12_270))) {
        break forest_join_226;
    }
    life13_279 = __cast100131_64(__call100131_63(life12_270));
    __call100131_65(life7_71, life13_279);
    if (!((life5_5 != 0))) {
        break forest_join_367;
    }
    if (!((life5_5 == 0))) {
        continue forest_cycle_212;
    }
    break forest_cycle_212;
    }
    }
    if (!((life5_5 == 0))) {
        break forest_join_367;
    }
    }
    forestValue100131_229_0 = life9_83;
    }
    if (!((life5_5 != 0))) {
        forestValue100131_368_0 = forestValue100131_229_0;
        break forest_join_368;
    }
    if (!((forestValue100131_229_0 != 0))) {
        break forest_join_367;
    }
    if (!((!__call100131_67(__call100131_66(life7_71), life10_201)))) {
        break forest_join_254;
    }
    moom.b7 __stackOp100131_69_0 = __sourceUninitializedNEW100131_68();
    spill100131_26 = __stackOp100131_69_0;
    spill100131_27 = __stackOp100131_69_0;
    spill100131_28 = "commands.achievement.dontHave";
    java.lang.Object[] __stackOp100131_70_0 = new java.lang.Object[2];
    spill100131_29 = __stackOp100131_70_0;
    (__stackOp100131_70_0)[0] = __call100131_71(life7_71);
    java.lang.Object[] __stackOp100131_72_0 = spill100131_29;
    spill100131_30 = __stackOp100131_72_0;
    (__stackOp100131_72_0)[1] = __call100131_73(life6_27);
    __explicitNewInit100131_74(spill100131_27, spill100131_28, spill100131_30);
    throw spill100131_26;
    }
    life11_332 = __call100131_79(__call100131_78(__call100131_76(__fieldRead100131_75()), __invokedynamic100131_77(life7_71, life6_27)));
    life12_335 = __call100131_80(life11_332);
    life13_338 = __call100131_81(life11_332);
    forest_cycle_268: while (true) {
    forest_join_314: {
    forest_join_297: {
    if (!(__call100131_82(life13_338))) {
        break forest_join_316;
    }
    life14_347 = __cast100131_84(__call100131_83(life13_338));
    life15_349 = life14_347;
    spill100131_31 = 0;
    if (!((life5_5 != 0))) {
        forestValue100131_334_0 = spill100131_31;
        break forest_join_334;
    }
    life16_354 = spill100131_31;
    forest_cycle_281: while (true) {
    forest_join_294: {
    forest_join_292: {
    if (!((life15_349 != null))) {
        break forest_join_297;
    }
    spill100131_32 = life15_349;
    if (!((life5_5 != 0))) {
        forestValue100131_351_0 = spill100131_32;
        break forest_join_351;
    }
    if (!((life5_5 != 0))) {
        forestValue100131_294_0 = spill100131_32;
        break forest_join_294;
    }
    if (!((spill100131_32 == life6_27))) {
        break forest_join_292;
    }
    life16_354 = 1;
    }
    forestValue100131_294_0 = __fieldRead100131_85(life15_349);
    }
    life15_349 = forestValue100131_294_0;
    if (!((life5_5 == 0))) {
        continue forest_cycle_281;
    }
    break forest_cycle_281;
    }
    }
    if (!((life16_354 == 0))) {
        break forest_join_314;
    }
    life15_385 = life14_347;
    forest_cycle_301: while (true) {
    if (!((life15_385 != null))) {
        break forest_join_314;
    }
    __call100131_86(life12_335, life14_347);
    life15_385 = __fieldRead100131_87(life15_385);
    if (!((life5_5 != 0))) {
        continue forest_cycle_268;
    }
    if (!((life5_5 == 0))) {
        continue forest_cycle_301;
    }
    break forest_cycle_301;
    }
    }
    if (!((life5_5 == 0))) {
        continue forest_cycle_268;
    }
    break forest_cycle_268;
    }
    }
    life13_408 = __call100131_88(life12_335);
    forest_cycle_319: while (true) {
    if (!(__call100131_89(life13_408))) {
        break forest_join_367;
    }
    life14_419 = __cast100131_91(__call100131_90(life13_408));
    __call100131_92(life7_71, life14_419);
    if (!((life5_5 != 0))) {
        break forest_join_392;
    }
    if (!((life5_5 == 0))) {
        continue forest_cycle_319;
    }
    break forest_cycle_319;
    }
    break forest_join_367;
    }
    forest_cycle_334: while (true) {
    forest_join_347: {
    if (!((forestValue100131_334_0 != 0))) {
        break forest_join_367;
    }
    life14_435 = __cast100131_94(__call100131_93(life13_338));
    __call100131_95(life7_71, life14_435);
    if (!((life5_5 != 0))) {
        break forest_join_392;
    }
    if (!((life5_5 == 0))) {
        break forest_join_347;
    }
    break forest_join_350;
    }
    spill100131_33 = __call100131_96(life13_338);
    forestValue100131_334_0 = __integerCategory100131_97(spill100131_33);
    continue forest_cycle_334;
    }
    }
    break forest_join_367;
    }
    forest_cycle_351: while (true) {
    forest_join_360: {
    life14_449 = forestValue100131_351_0;
    __call100131_98(life7_71, life14_449);
    if (!((life5_5 != 0))) {
        break forest_join_392;
    }
    if (!((life5_5 == 0))) {
        break forest_join_360;
    }
    break forest_join_367;
    }
    if (!(__call100131_99(life13_338))) {
        break forest_join_367;
    }
    spill100131_34 = __cast100131_101(__call100131_100(life13_338));
    forestValue100131_351_0 = spill100131_34;
    continue forest_cycle_351;
    }
    }
    forestValue100131_368_0 = life8_77;
    }
    if (!((life5_5 != 0))) {
        forestValue100131_393_0 = forestValue100131_368_0;
        break forest_join_393;
    }
    if (!((forestValue100131_368_0 != 0))) {
        break forest_join_392;
    }
    __call100131_102(life7_71, life6_27);
    spill100131_35 = p0;
    spill100131_36 = receiver;
    spill100131_37 = "commands.achievement.give.success.one";
    java.lang.Object[] __stackOp100131_103_0 = new java.lang.Object[2];
    spill100131_38 = __stackOp100131_103_0;
    (__stackOp100131_103_0)[0] = __call100131_104(life7_71);
    java.lang.Object[] __stackOp100131_105_0 = spill100131_38;
    spill100131_39 = __stackOp100131_105_0;
    (__stackOp100131_105_0)[1] = __call100131_106(life6_27);
    __call100131_107(spill100131_35, spill100131_36, spill100131_37, spill100131_39);
    if (!((life5_5 == 0))) {
        break forest_join_413;
    }
    }
    forestValue100131_393_0 = life9_83;
    }
    if (!((forestValue100131_393_0 != 0))) {
        break forest_join_413;
    }
    __call100131_108(life7_71, life6_27);
    spill100131_40 = p0;
    spill100131_41 = receiver;
    spill100131_42 = "commands.achievement.take.success.one";
    java.lang.Object[] __stackOp100131_109_0 = new java.lang.Object[2];
    spill100131_43 = __stackOp100131_109_0;
    (__stackOp100131_109_0)[0] = __call100131_110(life6_27);
    java.lang.Object[] __stackOp100131_111_0 = spill100131_43;
    spill100131_44 = __stackOp100131_111_0;
    (__stackOp100131_111_0)[1] = __call100131_112(life7_71);
    __call100131_113(spill100131_40, spill100131_41, spill100131_42, spill100131_44);
    }
    return;
}
public static void h100131_0(moom.b7 p0) throws Throwable {
    throw __call13013100_0(p0);
}
public static void h100131_1(moom.b7 p0) throws Throwable {
    throw __call13013101_0(p0);
}
public static void h100131_2(moom.b7 p0) throws Throwable {
    throw __call13013102_0(p0);
}
public static void h100131_3(moom.b7 p0) throws Throwable {
    throw __call13013103_0(p0);
}
public static void h100131_4(moom.b7 p0) throws Throwable {
    throw __call13013104_0(p0);
}
public static void h100131_5(moom.b7 p0) throws Throwable {
    throw __call13013105_0(p0);
}
public static void h100131_6(moom.b7 p0) throws Throwable {
    throw __call13013106_0(p0);
}
public static void h100131_7(moom.b7 p0) throws Throwable {
    throw __call13013107_0(p0);
}
public static void h100131_8(moom.b7 p0) throws Throwable {
    throw __call13013108_0(p0);
}
public static void h100131_9(moom.b7 p0) throws Throwable {
    throw __call13013109_0(p0);
}
public static void h100131_10(moom.b7 p0) throws Throwable {
    throw __call13013110_0(p0);
}
public static void h100131_11(moom.b7 p0) throws Throwable {
    throw __call13013111_0(p0);
}
public static void h100131_12(moom.b7 p0) throws Throwable {
    throw __call13013112_0(p0);
}
public static void h100131_13(moom.b7 p0) throws Throwable {
    throw __call13013113_0(p0);
}
public static void h100131_14(moom.b7 p0) throws Throwable {
    throw __call13013114_0(p0);
}
public static void h100131_15(moom.b7 p0) throws Throwable {
    throw __call13013115_0(p0);
}
public static void h100131_16(moom.b7 p0) throws Throwable {
    throw __call13013116_0(p0);
}
public static void h100131_17(moom.b7 p0) throws Throwable {
    throw __call13013117_0(p0);
}
public static void h100131_18(moom.b7 p0) throws Throwable {
    throw __call13013118_0(p0);
}
public static void h100131_19(moom.b7 p0) throws Throwable {
    throw __call13013119_0(p0);
}
public static void h100131_20(moom.b7 p0) throws Throwable {
    throw __call13013120_0(p0);
}
public static void h100131_21(moom.b7 p0) throws Throwable {
    throw __call13013121_0(p0);
}
public static void h100131_22(moom.b7 p0) throws Throwable {
    throw __call13013122_0(p0);
}
public static void h100131_23(moom.b7 p0) throws Throwable {
    throw __call13013123_0(p0);
}
public static void h100131_24(moom.b7 p0) throws Throwable {
    throw __call13013124_0(p0);
}
public static void h100131_25(moom.b7 p0) throws Throwable {
    throw __call13013125_0(p0);
}
public static void h100131_26(moom.b7 p0) throws Throwable {
    throw __call13013126_0(p0);
}
public static void h100131_27(moom.b7 p0) throws Throwable {
    throw __call13013127_0(p0);
}
public static void h100131_28(moom.b7 p0) throws Throwable {
    throw __call13013128_0(p0);
}
public static void h100131_29(moom.b7 p0) throws Throwable {
    throw __call13013129_0(p0);
}
public static void h100131_30(moom.b7 p0) throws Throwable {
    throw __call13013130_0(p0);
}
public static void h100131_31(moom.b7 p0) throws Throwable {
    throw __call13013131_0(p0);
}
public static void h100131_32(moom.b7 p0) throws Throwable {
    throw __call13013132_0(p0);
}
public static void h100131_33(moom.b7 p0) throws Throwable {
    throw __call13013133_0(p0);
}
private static native long __fieldRead100131_0() throws Throwable;
private static native int __call100131_1() throws Throwable;
private static native moom.cc __sourceUninitializedNEW100131_2() throws Throwable;
private static native void __explicitNewInit100131_4(moom.cc a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native moom.BY __call100131_5(java.lang.String a0) throws Throwable;
private static native boolean __call100131_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100131_7(boolean value) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW100131_8() throws Throwable;
private static native void __explicitNewInit100131_11(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call100131_12(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call100131_13(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native boolean __call100131_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100131_15(boolean value) throws Throwable;
private static native boolean __call100131_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100131_17(boolean value) throws Throwable;
private static native java.util.List __fieldRead100131_18() throws Throwable;
private static native java.util.Iterator __call100131_19(java.util.List a0) throws Throwable;
private static native boolean __call100131_20(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100131_21(java.util.Iterator a0) throws Throwable;
private static native moom.BZ __cast100131_22(java.lang.Object a0) throws Throwable;
private static native void __call100131_23(net.minecraft.entity.player.EntityPlayerMP a0, moom.BZ a1) throws Throwable;
private static native java.lang.String __call100131_25(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call100131_26(net.minecraft.command.ICommandSender a0, moom.qh a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.util.List __fieldRead100131_27() throws Throwable;
private static native java.util.List __call100131_28(java.util.List a0) throws Throwable;
private static native java.util.Iterator __call100131_29(java.util.List a0) throws Throwable;
private static native boolean __call100131_30(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100131_31(java.util.Iterator a0) throws Throwable;
private static native moom.BZ __cast100131_32(java.lang.Object a0) throws Throwable;
private static native void __call100131_33(net.minecraft.entity.player.EntityPlayerMP a0, moom.BZ a1) throws Throwable;
private static native java.lang.String __call100131_35(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call100131_36(net.minecraft.command.ICommandSender a0, moom.qh a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native int __instanceOf100131_37(moom.BY a0) throws Throwable;
private static native moom.BZ __cast100131_38(moom.BY a0) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __call100131_39(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call100131_40(net.minecraft.stats.StatisticsFile a0, moom.BZ a1) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW100131_41() throws Throwable;
private static native java.lang.String __call100131_44(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call100131_46(moom.BY a0) throws Throwable;
private static native void __explicitNewInit100131_47(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.util.ArrayList __call100131_48() throws Throwable;
private static native moom.BZ __fieldRead100131_49(moom.BZ a0) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __call100131_50(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.BZ __fieldRead100131_51(moom.BZ a0) throws Throwable;
private static native boolean __call100131_52(net.minecraft.stats.StatisticsFile a0, moom.BZ a1) throws Throwable;
private static native int __integerCategory100131_53(boolean value) throws Throwable;
private static native int __integerCategory100131_54(boolean value) throws Throwable;
private static native moom.BZ __fieldRead100131_55(moom.BZ a0) throws Throwable;
private static native boolean __call100131_56(java.util.ArrayList a0, moom.BZ a1) throws Throwable;
private static native int __integerCategory100131_57(boolean value) throws Throwable;
private static native void __discardScalar100131_58(int a0) throws Throwable;
private static native moom.BZ __fieldRead100131_59(moom.BZ a0) throws Throwable;
private static native java.util.List __call100131_60(java.util.ArrayList a0) throws Throwable;
private static native java.util.Iterator __call100131_61(java.util.List a0) throws Throwable;
private static native boolean __call100131_62(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100131_63(java.util.Iterator a0) throws Throwable;
private static native moom.BZ __cast100131_64(java.lang.Object a0) throws Throwable;
private static native void __call100131_65(net.minecraft.entity.player.EntityPlayerMP a0, moom.BZ a1) throws Throwable;
private static native net.minecraft.stats.StatisticsFile __call100131_66(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call100131_67(net.minecraft.stats.StatisticsFile a0, moom.BZ a1) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW100131_68() throws Throwable;
private static native java.lang.String __call100131_71(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call100131_73(moom.BY a0) throws Throwable;
private static native void __explicitNewInit100131_74(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.util.List __fieldRead100131_75() throws Throwable;
private static native java.util.Iterator __call100131_76(java.util.List a0) throws Throwable;
private static native com.google.common.base.Predicate __invokedynamic100131_77(net.minecraft.entity.player.EntityPlayerMP a0, moom.BY a1) throws Throwable;
private static native com.google.common.collect.UnmodifiableIterator __call100131_78(java.util.Iterator a0, com.google.common.base.Predicate a1) throws Throwable;
private static native java.util.ArrayList __call100131_79(com.google.common.collect.UnmodifiableIterator a0) throws Throwable;
private static native java.util.ArrayList __call100131_80(java.util.ArrayList a0) throws Throwable;
private static native java.util.Iterator __call100131_81(java.util.ArrayList a0) throws Throwable;
private static native boolean __call100131_82(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100131_83(java.util.Iterator a0) throws Throwable;
private static native moom.BZ __cast100131_84(java.lang.Object a0) throws Throwable;
private static native moom.BZ __fieldRead100131_85(moom.BZ a0) throws Throwable;
private static native boolean __call100131_86(java.util.ArrayList a0, moom.BZ a1) throws Throwable;
private static native moom.BZ __fieldRead100131_87(moom.BZ a0) throws Throwable;
private static native java.util.Iterator __call100131_88(java.util.ArrayList a0) throws Throwable;
private static native boolean __call100131_89(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100131_90(java.util.Iterator a0) throws Throwable;
private static native moom.BZ __cast100131_91(java.lang.Object a0) throws Throwable;
private static native void __call100131_92(net.minecraft.entity.player.EntityPlayerMP a0, moom.BZ a1) throws Throwable;
private static native java.lang.Object __call100131_93(java.util.Iterator a0) throws Throwable;
private static native moom.BZ __cast100131_94(java.lang.Object a0) throws Throwable;
private static native void __call100131_95(net.minecraft.entity.player.EntityPlayerMP a0, moom.BZ a1) throws Throwable;
private static native boolean __call100131_96(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory100131_97(boolean value) throws Throwable;
private static native void __call100131_98(net.minecraft.entity.player.EntityPlayerMP a0, moom.BZ a1) throws Throwable;
private static native boolean __call100131_99(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100131_100(java.util.Iterator a0) throws Throwable;
private static native moom.BZ __cast100131_101(java.lang.Object a0) throws Throwable;
private static native void __call100131_102(net.minecraft.entity.player.EntityPlayerMP a0, moom.BY a1) throws Throwable;
private static native java.lang.String __call100131_104(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call100131_106(moom.BY a0) throws Throwable;
private static native void __call100131_107(net.minecraft.command.ICommandSender a0, moom.qh a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native void __call100131_108(net.minecraft.entity.player.EntityPlayerMP a0, moom.BY a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call100131_110(moom.BY a0) throws Throwable;
private static native java.lang.String __call100131_112(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call100131_113(net.minecraft.command.ICommandSender a0, moom.qh a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call13013100_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013101_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013102_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013103_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013104_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013105_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013106_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013107_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013108_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013109_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013110_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013111_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013112_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013113_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013114_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013115_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013116_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013117_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013118_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013119_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013120_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013121_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013122_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013123_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013124_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013125_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013126_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013127_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013128_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013129_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013130_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013131_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013132_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call13013133_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_2145f728b8995cb22e02(moom.qh a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_2145f728b8995cb22e02 {

public static java.util.List f1179(moom.qh receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int lexicalValue1179_28_0;
    int lexicalValue1179_28_1;
    int lexicalValue1179_36_0;
    int lexicalValue1179_36_1;
    java.lang.String[] lexicalValue1179_38_0;
    java.util.List lexicalValue1179_43_0;
    java.util.List lexicalValue1179_68_0;
    int spill1179_0;
    int spill1179_1;
    java.lang.String[] spill1179_2;
    java.util.ArrayList spill1179_3;
    long life4_3;
    int life6_5;
    java.util.ArrayList life7_59;
    java.util.Iterator life8_62;
    moom.BY life9_69;
    lexical_join_68: {
    lexical_join_65: {
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_38: {
    lexical_join_36: {
    lexical_join_28: {
    lexical_join_25: {
    life4_3 = (__fieldRead1179_0() ^ 125084591525640L);
    life6_5 = __call1179_1();
    spill1179_0 = (p1).length;
    spill1179_1 = 1;
    if (!((life6_5 != 0))) {
        lexicalValue1179_28_0 = spill1179_0;
        lexicalValue1179_28_1 = spill1179_1;
        break lexical_join_28;
    }
    if (!((spill1179_0 == spill1179_1))) {
        break lexical_join_25;
    }
    return __call1179_2(p1, new java.lang.String[] {"give", "take"});
    }
    lexicalValue1179_28_0 = (p1).length;
    lexicalValue1179_28_1 = 2;
    }
    if (!((life6_5 != 0))) {
        lexicalValue1179_36_0 = lexicalValue1179_28_0;
        lexicalValue1179_36_1 = lexicalValue1179_28_1;
        break lexical_join_36;
    }
    if (!((lexicalValue1179_28_0 != lexicalValue1179_28_1))) {
        break lexical_join_44;
    }
    spill1179_2 = p1;
    if (!((life6_5 != 0))) {
        lexicalValue1179_38_0 = spill1179_2;
        break lexical_join_38;
    }
    lexicalValue1179_36_0 = (spill1179_2).length;
    lexicalValue1179_36_1 = 3;
    }
    if (!((lexicalValue1179_36_0 == lexicalValue1179_36_1))) {
        break lexical_join_42;
    }
    lexicalValue1179_38_0 = p1;
    }
    lexicalValue1179_43_0 = __call1179_5(lexicalValue1179_38_0, __call1179_4(__call1179_3()));
    break lexical_join_43;
    }
    lexicalValue1179_43_0 = null;
    }
    return lexicalValue1179_43_0;
    }
    life7_59 = __call1179_6();
    life8_62 = __call1179_8(__fieldRead1179_7());
    lexical_cycle_49: while (true) {
    if (!(__call1179_9(life8_62))) {
        break lexical_join_65;
    }
    life9_69 = __cast1179_11(__call1179_10(life8_62));
    spill1179_3 = life7_59;
    if (!((life6_5 != 0))) {
        lexicalValue1179_68_0 = spill1179_3;
        break lexical_join_68;
    }
    __call1179_13(spill1179_3, __fieldRead1179_12(life9_69));
    if (!((life6_5 == 0))) { continue lexical_cycle_49; }
    break lexical_cycle_49;
    }
    }
    lexicalValue1179_68_0 = __call1179_14(p1, life7_59);
    }
    return lexicalValue1179_68_0;
}
public static void h1179_0(moom.Oo p0) throws Throwable {
    throw __call1117900_0(p0);
}
public static void h1179_1(moom.Oo p0) throws Throwable {
    throw __call1117901_0(p0);
}
public static void h1179_2(moom.Oo p0) throws Throwable {
    throw __call1117902_0(p0);
}
public static void h1179_3(moom.Oo p0) throws Throwable {
    throw __call1117903_0(p0);
}
public static void h1179_4(moom.Oo p0) throws Throwable {
    throw __call1117904_0(p0);
}
public static void h1179_5(moom.Oo p0) throws Throwable {
    throw __call1117905_0(p0);
}
private static native long __fieldRead1179_0() throws Throwable;
private static native int __call1179_1() throws Throwable;
private static native java.util.List __call1179_2(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native moom.Bl __call1179_3() throws Throwable;
private static native java.lang.String[] __call1179_4(moom.Bl a0) throws Throwable;
private static native java.util.List __call1179_5(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.util.ArrayList __call1179_6() throws Throwable;
private static native java.util.List __fieldRead1179_7() throws Throwable;
private static native java.util.Iterator __call1179_8(java.util.List a0) throws Throwable;
private static native boolean __call1179_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1179_10(java.util.Iterator a0) throws Throwable;
private static native moom.BY __cast1179_11(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead1179_12(moom.BY a0) throws Throwable;
private static native boolean __call1179_13(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.util.List __call1179_14(java.lang.String[] a0, java.util.ArrayList a1) throws Throwable;
private static native java.lang.Exception __call1117900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1117901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1117902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1117903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1117904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1117905_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_8754bd980e07fab0cd6b(moom.qh a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_8754bd980e07fab0cd6b {

public static boolean f1180(moom.qh receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1180_12_0;
    int forwardValue1180_14_0;
    int spill1180_0;
    long life3_3;
    int life5_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (__fieldRead1180_0() ^ 80706917941011L);
    life5_5 = __call1180_1();
    spill1180_0 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1180_12_0 = spill1180_0;
        break forward_join_12;
    }
    if (!((spill1180_0 == 2))) {
        break forward_join_13;
    }
    forwardValue1180_12_0 = 1;
    }
    forwardValue1180_14_0 = forwardValue1180_12_0;
    break forward_join_14;
    }
    forwardValue1180_14_0 = 0;
    }
    return __integerCategory1180_2(forwardValue1180_14_0);
}
public static void h1180_0(moom.Oo p0) throws Throwable {
    throw __call1118000_0(p0);
}
public static void h1180_1(moom.Oo p0) throws Throwable {
    throw __call1118001_0(p0);
}
private static native long __fieldRead1180_0() throws Throwable;
private static native int __call1180_1() throws Throwable;
private static native boolean __integerCategory1180_2(int value) throws Throwable;
private static native java.lang.Exception __call1118000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1118001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_2e0417d9b61d5d4d8fa0(net.minecraft.entity.player.EntityPlayerMP a0, moom.BY a1, moom.BZ a2) throws E;
private static final class __SourceHandler_2e0417d9b61d5d4d8fa0 {

public static boolean f1181(net.minecraft.entity.player.EntityPlayerMP p0, moom.BY p1, moom.BZ p2) throws Throwable {
    int forwardValue1181_15_0;
    long life3_3;
    forward_join_15: {
    forward_join_14: {
    life3_3 = (__fieldRead1181_0() ^ 132259761888876L);
    if (!(__call1181_2(__call1181_1(p0), p2))) {
        break forward_join_14;
    }
    if (!((p2 != p1))) {
        break forward_join_14;
    }
    forwardValue1181_15_0 = 1;
    break forward_join_15;
    }
    forwardValue1181_15_0 = 0;
    }
    return __integerCategory1181_3(forwardValue1181_15_0);
}
public static void h1181_0(moom.Oo p0) throws Throwable {
    throw __call1118100_0(p0);
}
public static void h1181_1(moom.Oo p0) throws Throwable {
    throw __call1118101_0(p0);
}
private static native long __fieldRead1181_0() throws Throwable;
private static native net.minecraft.stats.StatisticsFile __call1181_1(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call1181_2(net.minecraft.stats.StatisticsFile a0, moom.BZ a1) throws Throwable;
private static native boolean __integerCategory1181_3(int value) throws Throwable;
private static native java.lang.Exception __call1118100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1118101_0(moom.Oo a0) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_8754bd980e07fab0cd6b(this, p0, p1); }


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_2145f728b8995cb22e02(this, p0, p1, p2); }


public int a() {
return 2;
}


public java.lang.String a__String() {
return "achievement";
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.achievement.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_e70dee8e7ff2c8582c99(this, p0, p1); }


private static boolean lambda$processCommand$0(net.minecraft.entity.player.EntityPlayerMP p0, moom.BY p1, moom.BZ p2) { return __sourceHandlerCall_2e0417d9b61d5d4d8fa0(p0, p1, p2); }

}
