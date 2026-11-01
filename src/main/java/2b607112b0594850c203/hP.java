package com.moon;


public class hP implements com.moon.hN {

private static net.minecraft.client.Minecraft a;

private com.moon.module.impl.ESP b;

private static long c;

private static java.lang.String d;

public hP() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(6624200698127598180L)), ((long)(-782868019391495128L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(117867257445793L)))));
    long local0_life6 = (com.moon.hP.c ^ 40429724575810L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill130_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill130_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill130_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill130_13 = new byte[8];
    (__sourceSpill130_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill130_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation130_15 = __sourceSpill130_13;
    ((javax.crypto.Cipher)(__sourceSpill130_10)).init(((int)(__sourceSpill130_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill130_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation130_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill130_19 = ((java.lang.String)("{R$@TRM")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill130_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill130_20)).doFinal(((byte[])(__sourceSpill130_19)));
    d = ((java.lang.String)(((java.lang.String)(com.moon.hP.a(((byte[])(local4_life22))))).intern()));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}

private static native <E extends Throwable> void __sourceHandlerCall_a8af2a685f55a3553892(com.moon.hP a0) throws E;
private static final class __SourceHandler_a8af2a685f55a3553892 {

public static void f720000(com.moon.hP receiver) throws Throwable {
    com.moon.hP forestValue720000_12_0;
    net.minecraft.client.multiplayer.WorldClient forestValue720000_28_0;
    double forestValue720000_91_0;
    double forestValue720000_92_0;
    double forestValue720000_92_1;
    moom.CA forestValue720000_153_0;
    moom.DR forestValue720000_194_0;
    int forestValue720000_204_0;
    org.lwjgl.util.vector.Vector4f forestValue720000_253_0;
    java.lang.Object forestValue720000_279_0;
    int forestValue720000_293_0;
    moom.CA forestValue720000_314_0;
    moom.DR forestValue720000_355_0;
    int forestValue720000_365_0;
    org.lwjgl.util.vector.Vector4f forestValue720000_414_0;
    int forestValue720000_431_0;
    java.lang.Object forestValue720000_434_0;
    int forestValue720000_448_0;
    moom.CA forestValue720000_469_0;
    moom.DR forestValue720000_510_0;
    int forestValue720000_520_0;
    org.lwjgl.util.vector.Vector4f forestValue720000_569_0;
    java.lang.Object forestValue720000_590_0;
    int forestValue720000_604_0;
    moom.CA forestValue720000_625_0;
    moom.DR forestValue720000_666_0;
    int forestValue720000_676_0;
    org.lwjgl.util.vector.Vector4f forestValue720000_725_0;
    com.moon.hP spill720000_0;
    net.minecraft.client.multiplayer.WorldClient spill720000_1;
    boolean spill720000_2;
    double spill720000_3;
    com.moon.ec spill720000_4;
    moom.CA spill720000_5;
    moom.CA spill720000_6;
    moom.DR spill720000_7;
    int spill720000_8;
    org.lwjgl.util.vector.Vector4f spill720000_9;
    org.lwjgl.util.vector.Vector4f spill720000_10;
    int spill720000_11;
    int spill720000_12;
    moom.CA spill720000_13;
    moom.DR spill720000_14;
    int spill720000_15;
    org.lwjgl.util.vector.Vector4f spill720000_16;
    org.lwjgl.util.vector.Vector4f spill720000_17;
    int spill720000_18;
    int spill720000_19;
    moom.CA spill720000_20;
    moom.DR spill720000_21;
    int spill720000_22;
    org.lwjgl.util.vector.Vector4f spill720000_23;
    org.lwjgl.util.vector.Vector4f spill720000_24;
    boolean spill720000_25;
    int spill720000_26;
    int spill720000_27;
    moom.CA spill720000_28;
    moom.DR spill720000_29;
    int spill720000_30;
    org.lwjgl.util.vector.Vector4f spill720000_31;
    org.lwjgl.util.vector.Vector4f spill720000_32;
    java.lang.Object spill720000_33;
    long life1_3;
    int[] life3_5;
    net.minecraft.client.renderer.entity.RenderManager life4_25;
    java.util.Iterator life5_39;
    net.minecraft.entity.Entity life6_48;
    float life7_70;
    double life8_78;
    double life10_86;
    double life12_94;
    float life14_99;
    double life15_112;
    com.moon.ec life17_123;
    moom.CA life17_169;
    java.util.List life18_185;
    org.lwjgl.util.vector.Vector4f life19_187;
    java.util.Iterator life20_190;
    moom.DR life21_199;
    moom.DR life21_219;
    java.util.Iterator life5_326;
    net.minecraft.tileentity.TileEntity life6_337;
    moom.CA life7_363;
    java.util.List life8_388;
    org.lwjgl.util.vector.Vector4f life9_390;
    java.util.Iterator life10_393;
    moom.DR life11_402;
    moom.DR life11_422;
    net.minecraft.tileentity.TileEntity life6_531;
    moom.CA life7_557;
    java.util.List life8_582;
    org.lwjgl.util.vector.Vector4f life9_584;
    java.util.Iterator life10_587;
    moom.DR life11_596;
    moom.DR life11_616;
    net.minecraft.tileentity.TileEntity life6_724;
    moom.CA life7_750;
    java.util.List life8_775;
    org.lwjgl.util.vector.Vector4f life9_777;
    java.util.Iterator life10_780;
    moom.DR life11_789;
    moom.DR life11_809;
    forest_join_748: {
    forest_join_590: {
    forest_join_589: {
    forest_join_431: {
    forest_join_269: {
    forest_join_28: {
    forest_join_18: {
    forest_join_12: {
    life1_3 = (__fieldRead720000_0() ^ 134707692913219L);
    life3_5 = __call720000_1();
    spill720000_0 = receiver;
    if (!((life3_5 == null))) {
        forestValue720000_12_0 = spill720000_0;
        break forest_join_12;
    }
    if (!((__fieldRead720000_2(spill720000_0) == null))) {
        break forest_join_18;
    }
    forestValue720000_12_0 = receiver;
    }
    __fieldWrite720000_8(forestValue720000_12_0, __cast720000_7(__call720000_6(__call720000_4(__call720000_3()), __fieldRead720000_5())));
    }
    life4_25 = __call720000_10(__fieldRead720000_9());
    spill720000_1 = __fieldRead720000_12(__fieldRead720000_11());
    if (!((life3_5 == null))) {
        forestValue720000_28_0 = spill720000_1;
        break forest_join_28;
    }
    if (!((spill720000_1 != null))) {
        break forest_join_748;
    }
    forestValue720000_28_0 = __fieldRead720000_14(__fieldRead720000_13());
    }
    life5_39 = __call720000_16(__fieldRead720000_15(forestValue720000_28_0));
    forest_cycle_31: while (true) {
    forest_join_263: {
    forest_join_153: {
    forest_join_152: {
    forest_join_121: {
    forest_join_117: {
    forest_join_92: {
    forest_join_91: {
    forest_join_50: {
    if (!(__call720000_17(life5_39))) {
        break forest_join_269;
    }
    life6_48 = __cast720000_19(__call720000_18(life5_39));
    spill720000_2 = __call720000_21(__fieldRead720000_20(receiver), life6_48);
    if (!((life3_5 == null))) {
        forestValue720000_431_0 = __integerCategory720000_22(spill720000_2);
        break forest_join_431;
    }
    if (!((!spill720000_2))) {
        break forest_join_50;
    }
    if (!((life3_5 != null))) {
        continue forest_cycle_31;
    }
    __call720000_23(new java.lang.String[5]);
    }
    life7_70 = __fieldRead720000_26(__fieldRead720000_25(__fieldRead720000_24()));
    life8_78 = __call720000_29(__fieldRead720000_27(life6_48), __fieldRead720000_28(life6_48), ((double) life7_70));
    life10_86 = __call720000_32(__fieldRead720000_30(life6_48), __fieldRead720000_31(life6_48), ((double) life7_70));
    life12_94 = __call720000_35(__fieldRead720000_33(life6_48), __fieldRead720000_34(life6_48), ((double) life7_70));
    life14_99 = (__fieldRead720000_36(life6_48) / 0x1.8p0f);
    spill720000_3 = ((double) __fieldRead720000_37(life6_48));
    if (!(__call720000_38(life6_48))) {
        forestValue720000_91_0 = spill720000_3;
        break forest_join_91;
    }
    forestValue720000_92_0 = spill720000_3;
    forestValue720000_92_1 = 0x1.999999999999ap-3d;
    break forest_join_92;
    }
    forestValue720000_92_0 = forestValue720000_91_0;
    forestValue720000_92_1 = 0x0.0p0d;
    }
    life15_112 = (forestValue720000_92_0 - forestValue720000_92_1);
    if (!((__instanceOf720000_39(life6_48) != 0))) {
        break forest_join_121;
    }
    com.moon.ec __stackOp720000_41_0 = __sourceUninitializedNEW720000_40();
    spill720000_4 = __stackOp720000_41_0;
    __explicitNewInit720000_42(__stackOp720000_41_0, life6_48, false, false);
    life17_123 = spill720000_4;
    __call720000_45(__call720000_44(__call720000_43()), life17_123);
    if (!((life3_5 == null))) {
        break forest_join_117;
    }
    if (!(__call720000_46(life17_123))) {
        break forest_join_121;
    }
    life14_99 = (life14_99 * 0x1.0p-1f);
    }
    life15_112 = (life15_112 * 0x1.333334p-1d);
    }
    moom.CA __stackOp720000_48_0 = __sourceUninitializedNEW720000_47();
    spill720000_5 = __stackOp720000_48_0;
    __explicitNewInit720000_49(__stackOp720000_48_0, (life8_78 - ((double) life14_99)), life10_86, (life12_94 - ((double) life14_99)), (life8_78 + ((double) life14_99)), (life10_86 + life15_112), (life12_94 + ((double) life14_99)));
    life17_169 = spill720000_5;
    spill720000_6 = life17_169;
    if (!((life3_5 == null))) {
        forestValue720000_153_0 = spill720000_6;
        break forest_join_153;
    }
    if (!((!__call720000_50(spill720000_6)))) {
        break forest_join_152;
    }
    if (!((life3_5 != null))) {
        continue forest_cycle_31;
    }
    }
    forestValue720000_153_0 = life17_169;
    }
    life18_185 = __call720000_51(forestValue720000_153_0);
    life19_187 = null;
    life20_190 = __call720000_52(life18_185);
    forest_cycle_160: while (true) {
    forest_join_261: {
    forest_join_253: {
    forest_join_225: {
    forest_join_204: {
    forest_join_194: {
    if (!(__call720000_53(life20_190))) {
        break forest_join_263;
    }
    life21_199 = __cast720000_55(__call720000_54(life20_190));
    life21_219 = __call720000_62(((float) (__fieldRead720000_56(life21_199) - __call720000_57(life4_25))), ((float) (__fieldRead720000_58(life21_199) - __call720000_59(life4_25))), ((float) (__fieldRead720000_60(life21_199) - __call720000_61(life4_25))));
    spill720000_7 = life21_219;
    if (!((life3_5 == null))) {
        forestValue720000_590_0 = spill720000_7;
        break forest_join_590;
    }
    if (!((life3_5 == null))) {
        forestValue720000_194_0 = spill720000_7;
        break forest_join_194;
    }
    if (!((spill720000_7 != null))) {
        break forest_join_261;
    }
    forestValue720000_194_0 = life21_219;
    }
    spill720000_8 = __numericCompare720000_64(__fieldRead720000_63(forestValue720000_194_0), 0x0.0p0d);
    if (!((life3_5 == null))) {
        forestValue720000_204_0 = spill720000_8;
        break forest_join_204;
    }
    if (!((spill720000_8 >= 0))) {
        break forest_join_261;
    }
    forestValue720000_204_0 = __numericCompare720000_66(__fieldRead720000_65(life21_219), 0x1.0p0d);
    }
    if (!((forestValue720000_204_0 <= 0))) {
        break forest_join_261;
    }
    spill720000_9 = life19_187;
    if (!((life3_5 == null))) {
        forestValue720000_253_0 = spill720000_9;
        break forest_join_253;
    }
    if (!((spill720000_9 == null))) {
        break forest_join_225;
    }
    org.lwjgl.util.vector.Vector4f __stackOp720000_68_0 = __sourceUninitializedNEW720000_67();
    spill720000_10 = __stackOp720000_68_0;
    __explicitNewInit720000_73(__stackOp720000_68_0, ((float) __fieldRead720000_69(life21_219)), ((float) __fieldRead720000_70(life21_219)), ((float) __fieldRead720000_71(life21_219)), ((float) __fieldRead720000_72(life21_219)));
    life19_187 = spill720000_10;
    }
    __fieldWrite720000_77(life19_187, ((float) __call720000_76(__fieldRead720000_74(life21_219), ((double) __fieldRead720000_75(life19_187)))));
    __fieldWrite720000_81(life19_187, ((float) __call720000_80(__fieldRead720000_78(life21_219), ((double) __fieldRead720000_79(life19_187)))));
    __fieldWrite720000_85(life19_187, ((float) __call720000_84(__fieldRead720000_82(life21_219), ((double) __fieldRead720000_83(life19_187)))));
    forestValue720000_253_0 = life19_187;
    }
    __fieldWrite720000_89(forestValue720000_253_0, ((float) __call720000_88(__fieldRead720000_86(life21_219), ((double) __fieldRead720000_87(life19_187)))));
    }
    if (!((life3_5 != null))) {
        continue forest_cycle_160;
    }
    break forest_cycle_160;
    }
    }
    __call720000_90(life6_48, life19_187);
    if (!((life3_5 != null))) {
        continue forest_cycle_31;
    }
    break forest_cycle_31;
    }
    }
    life5_326 = __call720000_94(__fieldRead720000_93(__fieldRead720000_92(__fieldRead720000_91())));
    forest_cycle_274: while (true) {
    forest_join_428: {
    forest_join_424: {
    if (!(__call720000_95(life5_326))) {
        break forest_join_748;
    }
    forestValue720000_279_0 = __call720000_96(life5_326);
    forest_cycle_279: while (true) {
    forest_join_314: {
    forest_join_313: {
    forest_join_306: {
    forest_join_301: {
    forest_join_293: {
    forest_join_291: {
    life6_337 = __cast720000_97(forestValue720000_279_0);
    spill720000_11 = __instanceOf720000_98(life6_337);
    if (!((life3_5 == null))) {
        forestValue720000_293_0 = spill720000_11;
        break forest_join_293;
    }
    if (!((spill720000_11 == 0))) {
        break forest_join_291;
    }
    spill720000_12 = __instanceOf720000_99(life6_337);
    if (!((life3_5 == null))) {
        forestValue720000_293_0 = spill720000_12;
        break forest_join_293;
    }
    if (!((spill720000_12 != 0))) {
        break forest_join_428;
    }
    }
    forestValue720000_293_0 = __instanceOf720000_100(life6_337);
    }
    if (!((forestValue720000_293_0 != 0))) {
        break forest_join_301;
    }
    life7_363 = __call720000_102(receiver, __cast720000_101(life6_337));
    if (!((life3_5 != null))) {
        break forest_join_306;
    }
    }
    life7_363 = __call720000_104(receiver, __cast720000_103(life6_337));
    }
    spill720000_13 = life7_363;
    if (!((life3_5 == null))) {
        forestValue720000_314_0 = spill720000_13;
        break forest_join_314;
    }
    if (!((!__call720000_105(spill720000_13)))) {
        break forest_join_313;
    }
    if (!((life3_5 != null))) {
        continue forest_cycle_274;
    }
    }
    forestValue720000_314_0 = life7_363;
    }
    life8_388 = __call720000_106(forestValue720000_314_0);
    life9_390 = null;
    life10_393 = __call720000_107(life8_388);
    forest_cycle_321: while (true) {
    forest_join_422: {
    forest_join_414: {
    forest_join_386: {
    forest_join_365: {
    forest_join_355: {
    if (!(__call720000_108(life10_393))) {
        break forest_join_424;
    }
    life11_402 = __cast720000_110(__call720000_109(life10_393));
    life11_422 = __call720000_117(((float) (__fieldRead720000_111(life11_402) - __call720000_112(life4_25))), ((float) (__fieldRead720000_113(life11_402) - __call720000_114(life4_25))), ((float) (__fieldRead720000_115(life11_402) - __call720000_116(life4_25))));
    spill720000_14 = life11_422;
    if (!((life3_5 == null))) {
        forestValue720000_279_0 = spill720000_14;
        continue forest_cycle_279;
    }
    if (!((life3_5 == null))) {
        forestValue720000_355_0 = spill720000_14;
        break forest_join_355;
    }
    if (!((spill720000_14 != null))) {
        break forest_join_422;
    }
    forestValue720000_355_0 = life11_422;
    }
    spill720000_15 = __numericCompare720000_119(__fieldRead720000_118(forestValue720000_355_0), 0x0.0p0d);
    if (!((life3_5 == null))) {
        forestValue720000_365_0 = spill720000_15;
        break forest_join_365;
    }
    if (!((spill720000_15 >= 0))) {
        break forest_join_422;
    }
    forestValue720000_365_0 = __numericCompare720000_121(__fieldRead720000_120(life11_422), 0x1.0p0d);
    }
    if (!((forestValue720000_365_0 <= 0))) {
        break forest_join_422;
    }
    spill720000_16 = life9_390;
    if (!((life3_5 == null))) {
        forestValue720000_414_0 = spill720000_16;
        break forest_join_414;
    }
    if (!((spill720000_16 == null))) {
        break forest_join_386;
    }
    org.lwjgl.util.vector.Vector4f __stackOp720000_123_0 = __sourceUninitializedNEW720000_122();
    spill720000_17 = __stackOp720000_123_0;
    __explicitNewInit720000_128(__stackOp720000_123_0, ((float) __fieldRead720000_124(life11_422)), ((float) __fieldRead720000_125(life11_422)), ((float) __fieldRead720000_126(life11_422)), ((float) __fieldRead720000_127(life11_422)));
    life9_390 = spill720000_17;
    }
    __fieldWrite720000_132(life9_390, ((float) __call720000_131(__fieldRead720000_129(life11_422), ((double) __fieldRead720000_130(life9_390)))));
    __fieldWrite720000_136(life9_390, ((float) __call720000_135(__fieldRead720000_133(life11_422), ((double) __fieldRead720000_134(life9_390)))));
    __fieldWrite720000_140(life9_390, ((float) __call720000_139(__fieldRead720000_137(life11_422), ((double) __fieldRead720000_138(life9_390)))));
    forestValue720000_414_0 = life9_390;
    }
    __fieldWrite720000_144(forestValue720000_414_0, ((float) __call720000_143(__fieldRead720000_141(life11_422), ((double) __fieldRead720000_142(life9_390)))));
    }
    if (!((life3_5 != null))) {
        continue forest_cycle_321;
    }
    break forest_cycle_321;
    }
    break forest_cycle_279;
    }
    }
    __call720000_145(life6_337, life9_390);
    }
    if (!((life3_5 != null))) {
        continue forest_cycle_274;
    }
    break forest_cycle_274;
    }
    break forest_join_748;
    }
    forest_cycle_431: while (true) {
    forest_join_586: {
    forest_join_583: {
    forest_join_579: {
    if (!((forestValue720000_431_0 != 0))) {
        break forest_join_748;
    }
    forestValue720000_434_0 = __call720000_146(life5_39);
    forest_cycle_434: while (true) {
    forest_join_469: {
    forest_join_468: {
    forest_join_461: {
    forest_join_456: {
    forest_join_448: {
    forest_join_446: {
    life6_531 = __cast720000_147(forestValue720000_434_0);
    spill720000_18 = __instanceOf720000_148(life6_531);
    if (!((life3_5 == null))) {
        forestValue720000_448_0 = spill720000_18;
        break forest_join_448;
    }
    if (!((spill720000_18 == 0))) {
        break forest_join_446;
    }
    spill720000_19 = __instanceOf720000_149(life6_531);
    if (!((life3_5 == null))) {
        forestValue720000_448_0 = spill720000_19;
        break forest_join_448;
    }
    if (!((spill720000_19 != 0))) {
        break forest_join_583;
    }
    }
    forestValue720000_448_0 = __instanceOf720000_150(life6_531);
    }
    if (!((forestValue720000_448_0 != 0))) {
        break forest_join_456;
    }
    life7_557 = __call720000_152(receiver, __cast720000_151(life6_531));
    if (!((life3_5 != null))) {
        break forest_join_461;
    }
    }
    life7_557 = __call720000_154(receiver, __cast720000_153(life6_531));
    }
    spill720000_20 = life7_557;
    if (!((life3_5 == null))) {
        forestValue720000_469_0 = spill720000_20;
        break forest_join_469;
    }
    if (!((!__call720000_155(spill720000_20)))) {
        break forest_join_468;
    }
    if (!((life3_5 != null))) {
        break forest_join_586;
    }
    }
    forestValue720000_469_0 = life7_557;
    }
    life8_582 = __call720000_156(forestValue720000_469_0);
    life9_584 = null;
    life10_587 = __call720000_157(life8_582);
    forest_cycle_476: while (true) {
    forest_join_577: {
    forest_join_569: {
    forest_join_541: {
    forest_join_520: {
    forest_join_510: {
    if (!(__call720000_158(life10_587))) {
        break forest_join_579;
    }
    life11_596 = __cast720000_160(__call720000_159(life10_587));
    life11_616 = __call720000_167(((float) (__fieldRead720000_161(life11_596) - __call720000_162(life4_25))), ((float) (__fieldRead720000_163(life11_596) - __call720000_164(life4_25))), ((float) (__fieldRead720000_165(life11_596) - __call720000_166(life4_25))));
    spill720000_21 = life11_616;
    if (!((life3_5 == null))) {
        forestValue720000_434_0 = spill720000_21;
        continue forest_cycle_434;
    }
    if (!((life3_5 == null))) {
        forestValue720000_510_0 = spill720000_21;
        break forest_join_510;
    }
    if (!((spill720000_21 != null))) {
        break forest_join_577;
    }
    forestValue720000_510_0 = life11_616;
    }
    spill720000_22 = __numericCompare720000_169(__fieldRead720000_168(forestValue720000_510_0), 0x0.0p0d);
    if (!((life3_5 == null))) {
        forestValue720000_520_0 = spill720000_22;
        break forest_join_520;
    }
    if (!((spill720000_22 >= 0))) {
        break forest_join_577;
    }
    forestValue720000_520_0 = __numericCompare720000_171(__fieldRead720000_170(life11_616), 0x1.0p0d);
    }
    if (!((forestValue720000_520_0 <= 0))) {
        break forest_join_577;
    }
    spill720000_23 = life9_584;
    if (!((life3_5 == null))) {
        forestValue720000_569_0 = spill720000_23;
        break forest_join_569;
    }
    if (!((spill720000_23 == null))) {
        break forest_join_541;
    }
    org.lwjgl.util.vector.Vector4f __stackOp720000_173_0 = __sourceUninitializedNEW720000_172();
    spill720000_24 = __stackOp720000_173_0;
    __explicitNewInit720000_178(__stackOp720000_173_0, ((float) __fieldRead720000_174(life11_616)), ((float) __fieldRead720000_175(life11_616)), ((float) __fieldRead720000_176(life11_616)), ((float) __fieldRead720000_177(life11_616)));
    life9_584 = spill720000_24;
    }
    __fieldWrite720000_182(life9_584, ((float) __call720000_181(__fieldRead720000_179(life11_616), ((double) __fieldRead720000_180(life9_584)))));
    __fieldWrite720000_186(life9_584, ((float) __call720000_185(__fieldRead720000_183(life11_616), ((double) __fieldRead720000_184(life9_584)))));
    __fieldWrite720000_190(life9_584, ((float) __call720000_189(__fieldRead720000_187(life11_616), ((double) __fieldRead720000_188(life9_584)))));
    forestValue720000_569_0 = life9_584;
    }
    __fieldWrite720000_194(forestValue720000_569_0, ((float) __call720000_193(__fieldRead720000_191(life11_616), ((double) __fieldRead720000_192(life9_584)))));
    }
    if (!((life3_5 != null))) {
        continue forest_cycle_476;
    }
    break forest_cycle_476;
    }
    break forest_cycle_434;
    }
    }
    __call720000_195(life6_531, life9_584);
    }
    if (!((life3_5 != null))) {
        break forest_join_586;
    }
    break forest_join_589;
    }
    spill720000_25 = __call720000_196(life5_39);
    forestValue720000_431_0 = __integerCategory720000_197(spill720000_25);
    continue forest_cycle_431;
    }
    }
    break forest_join_748;
    }
    forest_cycle_590: while (true) {
    forest_join_742: {
    forest_join_739: {
    forest_join_735: {
    forest_join_625: {
    forest_join_624: {
    forest_join_617: {
    forest_join_612: {
    forest_join_604: {
    forest_join_602: {
    life6_724 = __cast720000_198(forestValue720000_590_0);
    spill720000_26 = __instanceOf720000_199(life6_724);
    if (!((life3_5 == null))) {
        forestValue720000_604_0 = spill720000_26;
        break forest_join_604;
    }
    if (!((spill720000_26 == 0))) {
        break forest_join_602;
    }
    spill720000_27 = __instanceOf720000_200(life6_724);
    if (!((life3_5 == null))) {
        forestValue720000_604_0 = spill720000_27;
        break forest_join_604;
    }
    if (!((spill720000_27 != 0))) {
        break forest_join_739;
    }
    }
    forestValue720000_604_0 = __instanceOf720000_201(life6_724);
    }
    if (!((forestValue720000_604_0 != 0))) {
        break forest_join_612;
    }
    life7_750 = __call720000_203(receiver, __cast720000_202(life6_724));
    if (!((life3_5 != null))) {
        break forest_join_617;
    }
    }
    life7_750 = __call720000_205(receiver, __cast720000_204(life6_724));
    }
    spill720000_28 = life7_750;
    if (!((life3_5 == null))) {
        forestValue720000_625_0 = spill720000_28;
        break forest_join_625;
    }
    if (!((!__call720000_206(spill720000_28)))) {
        break forest_join_624;
    }
    if (!((life3_5 != null))) {
        break forest_join_742;
    }
    }
    forestValue720000_625_0 = life7_750;
    }
    life8_775 = __call720000_207(forestValue720000_625_0);
    life9_777 = null;
    life10_780 = __call720000_208(life8_775);
    forest_cycle_632: while (true) {
    forest_join_733: {
    forest_join_725: {
    forest_join_697: {
    forest_join_676: {
    forest_join_666: {
    if (!(__call720000_209(life10_780))) {
        break forest_join_735;
    }
    life11_789 = __cast720000_211(__call720000_210(life10_780));
    life11_809 = __call720000_218(((float) (__fieldRead720000_212(life11_789) - __call720000_213(life4_25))), ((float) (__fieldRead720000_214(life11_789) - __call720000_215(life4_25))), ((float) (__fieldRead720000_216(life11_789) - __call720000_217(life4_25))));
    spill720000_29 = life11_809;
    if (!((life3_5 == null))) {
        forestValue720000_590_0 = spill720000_29;
        continue forest_cycle_590;
    }
    if (!((life3_5 == null))) {
        forestValue720000_666_0 = spill720000_29;
        break forest_join_666;
    }
    if (!((spill720000_29 != null))) {
        break forest_join_733;
    }
    forestValue720000_666_0 = life11_809;
    }
    spill720000_30 = __numericCompare720000_220(__fieldRead720000_219(forestValue720000_666_0), 0x0.0p0d);
    if (!((life3_5 == null))) {
        forestValue720000_676_0 = spill720000_30;
        break forest_join_676;
    }
    if (!((spill720000_30 >= 0))) {
        break forest_join_733;
    }
    forestValue720000_676_0 = __numericCompare720000_222(__fieldRead720000_221(life11_809), 0x1.0p0d);
    }
    if (!((forestValue720000_676_0 <= 0))) {
        break forest_join_733;
    }
    spill720000_31 = life9_777;
    if (!((life3_5 == null))) {
        forestValue720000_725_0 = spill720000_31;
        break forest_join_725;
    }
    if (!((spill720000_31 == null))) {
        break forest_join_697;
    }
    org.lwjgl.util.vector.Vector4f __stackOp720000_224_0 = __sourceUninitializedNEW720000_223();
    spill720000_32 = __stackOp720000_224_0;
    __explicitNewInit720000_229(__stackOp720000_224_0, ((float) __fieldRead720000_225(life11_809)), ((float) __fieldRead720000_226(life11_809)), ((float) __fieldRead720000_227(life11_809)), ((float) __fieldRead720000_228(life11_809)));
    life9_777 = spill720000_32;
    }
    __fieldWrite720000_233(life9_777, ((float) __call720000_232(__fieldRead720000_230(life11_809), ((double) __fieldRead720000_231(life9_777)))));
    __fieldWrite720000_237(life9_777, ((float) __call720000_236(__fieldRead720000_234(life11_809), ((double) __fieldRead720000_235(life9_777)))));
    __fieldWrite720000_241(life9_777, ((float) __call720000_240(__fieldRead720000_238(life11_809), ((double) __fieldRead720000_239(life9_777)))));
    forestValue720000_725_0 = life9_777;
    }
    __fieldWrite720000_245(forestValue720000_725_0, ((float) __call720000_244(__fieldRead720000_242(life11_809), ((double) __fieldRead720000_243(life9_777)))));
    }
    if (!((life3_5 != null))) {
        continue forest_cycle_632;
    }
    break forest_cycle_632;
    }
    }
    __call720000_246(life6_724, life9_777);
    }
    if (!((life3_5 != null))) {
        break forest_join_742;
    }
    break forest_join_748;
    }
    if (!(__call720000_247(life5_39))) {
        break forest_join_748;
    }
    spill720000_33 = __call720000_248(life5_39);
    forestValue720000_590_0 = spill720000_33;
    continue forest_cycle_590;
    }
    }
    return;
}
private static native long __fieldRead720000_0() throws Throwable;
private static native int[] __call720000_1() throws Throwable;
private static native com.moon.module.impl.ESP __fieldRead720000_2(com.moon.hP a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call720000_3() throws Throwable;
private static native com.moon.fU __call720000_4(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __fieldRead720000_5() throws Throwable;
private static native com.moon.module.Module __call720000_6(com.moon.fU a0, java.lang.String a1) throws Throwable;
private static native com.moon.module.impl.ESP __cast720000_7(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite720000_8(com.moon.hP a0, com.moon.module.impl.ESP a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead720000_9() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call720000_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead720000_11() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead720000_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead720000_13() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead720000_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead720000_15(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.util.Iterator __call720000_16(java.util.List a0) throws Throwable;
private static native boolean __call720000_17(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720000_18(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast720000_19(java.lang.Object a0) throws Throwable;
private static native com.moon.module.impl.ESP __fieldRead720000_20(com.moon.hP a0) throws Throwable;
private static native boolean __call720000_21(com.moon.module.impl.ESP a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory720000_22(boolean value) throws Throwable;
private static native void __call720000_23(java.lang.String[] a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead720000_24() throws Throwable;
private static native moom.DM __fieldRead720000_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead720000_26(moom.DM a0) throws Throwable;
private static native double __fieldRead720000_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead720000_28(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call720000_29(double a0, double a1, double a2) throws Throwable;
private static native double __fieldRead720000_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead720000_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call720000_32(double a0, double a1, double a2) throws Throwable;
private static native double __fieldRead720000_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead720000_34(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call720000_35(double a0, double a1, double a2) throws Throwable;
private static native float __fieldRead720000_36(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead720000_37(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call720000_38(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __instanceOf720000_39(net.minecraft.entity.Entity a0) throws Throwable;
private static native com.moon.ec __sourceUninitializedNEW720000_40() throws Throwable;
private static native void __explicitNewInit720000_42(com.moon.ec a0, net.minecraft.entity.Entity a1, boolean a2, boolean a3) throws Throwable;
private static native com.moon.runtime.ClientContext __call720000_43() throws Throwable;
private static native com.moon.events.EventBus __call720000_44(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call720000_45(com.moon.events.EventBus a0, com.moon.ec a1) throws Throwable;
private static native boolean __call720000_46(com.moon.ec a0) throws Throwable;
private static native moom.CA __sourceUninitializedNEW720000_47() throws Throwable;
private static native void __explicitNewInit720000_49(moom.CA a0, double a1, double a2, double a3, double a4, double a5, double a6) throws Throwable;
private static native boolean __call720000_50(moom.CA a0) throws Throwable;
private static native java.util.List __call720000_51(moom.CA a0) throws Throwable;
private static native java.util.Iterator __call720000_52(java.util.List a0) throws Throwable;
private static native boolean __call720000_53(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720000_54(java.util.Iterator a0) throws Throwable;
private static native moom.DR __cast720000_55(java.lang.Object a0) throws Throwable;
private static native double __fieldRead720000_56(moom.DR a0) throws Throwable;
private static native double __call720000_57(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native double __fieldRead720000_58(moom.DR a0) throws Throwable;
private static native double __call720000_59(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native double __fieldRead720000_60(moom.DR a0) throws Throwable;
private static native double __call720000_61(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native moom.DR __call720000_62(float a0, float a1, float a2) throws Throwable;
private static native double __fieldRead720000_63(moom.DR a0) throws Throwable;
private static native int __numericCompare720000_64(double a0, double a1) throws Throwable;
private static native double __fieldRead720000_65(moom.DR a0) throws Throwable;
private static native int __numericCompare720000_66(double a0, double a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f __sourceUninitializedNEW720000_67() throws Throwable;
private static native double __fieldRead720000_69(moom.DR a0) throws Throwable;
private static native double __fieldRead720000_70(moom.DR a0) throws Throwable;
private static native double __fieldRead720000_71(moom.DR a0) throws Throwable;
private static native double __fieldRead720000_72(moom.DR a0) throws Throwable;
private static native void __explicitNewInit720000_73(org.lwjgl.util.vector.Vector4f a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native double __fieldRead720000_74(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_75(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_76(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_77(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native double __fieldRead720000_78(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_79(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_80(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_81(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native double __fieldRead720000_82(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_83(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_84(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_85(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native double __fieldRead720000_86(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_87(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_88(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_89(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native net.minecraft.entity.Entity __call720000_90(net.minecraft.entity.Entity a0, org.lwjgl.util.vector.Vector4f a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead720000_91() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead720000_92(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead720000_93(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.util.Iterator __call720000_94(java.util.List a0) throws Throwable;
private static native boolean __call720000_95(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720000_96(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast720000_97(java.lang.Object a0) throws Throwable;
private static native int __instanceOf720000_98(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __instanceOf720000_99(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __instanceOf720000_100(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntityChest __cast720000_101(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.CA __call720000_102(com.moon.hP a0, net.minecraft.tileentity.TileEntityChest a1) throws Throwable;
private static native moom.Cg __cast720000_103(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.CA __call720000_104(com.moon.hP a0, moom.Cg a1) throws Throwable;
private static native boolean __call720000_105(moom.CA a0) throws Throwable;
private static native java.util.List __call720000_106(moom.CA a0) throws Throwable;
private static native java.util.Iterator __call720000_107(java.util.List a0) throws Throwable;
private static native boolean __call720000_108(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720000_109(java.util.Iterator a0) throws Throwable;
private static native moom.DR __cast720000_110(java.lang.Object a0) throws Throwable;
private static native double __fieldRead720000_111(moom.DR a0) throws Throwable;
private static native double __call720000_112(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native double __fieldRead720000_113(moom.DR a0) throws Throwable;
private static native double __call720000_114(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native double __fieldRead720000_115(moom.DR a0) throws Throwable;
private static native double __call720000_116(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native moom.DR __call720000_117(float a0, float a1, float a2) throws Throwable;
private static native double __fieldRead720000_118(moom.DR a0) throws Throwable;
private static native int __numericCompare720000_119(double a0, double a1) throws Throwable;
private static native double __fieldRead720000_120(moom.DR a0) throws Throwable;
private static native int __numericCompare720000_121(double a0, double a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f __sourceUninitializedNEW720000_122() throws Throwable;
private static native double __fieldRead720000_124(moom.DR a0) throws Throwable;
private static native double __fieldRead720000_125(moom.DR a0) throws Throwable;
private static native double __fieldRead720000_126(moom.DR a0) throws Throwable;
private static native double __fieldRead720000_127(moom.DR a0) throws Throwable;
private static native void __explicitNewInit720000_128(org.lwjgl.util.vector.Vector4f a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native double __fieldRead720000_129(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_130(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_131(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_132(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native double __fieldRead720000_133(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_134(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_135(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_136(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native double __fieldRead720000_137(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_138(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_139(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_140(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native double __fieldRead720000_141(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_142(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_143(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_144(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call720000_145(net.minecraft.tileentity.TileEntity a0, org.lwjgl.util.vector.Vector4f a1) throws Throwable;
private static native java.lang.Object __call720000_146(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast720000_147(java.lang.Object a0) throws Throwable;
private static native int __instanceOf720000_148(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __instanceOf720000_149(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __instanceOf720000_150(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntityChest __cast720000_151(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.CA __call720000_152(com.moon.hP a0, net.minecraft.tileentity.TileEntityChest a1) throws Throwable;
private static native moom.Cg __cast720000_153(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.CA __call720000_154(com.moon.hP a0, moom.Cg a1) throws Throwable;
private static native boolean __call720000_155(moom.CA a0) throws Throwable;
private static native java.util.List __call720000_156(moom.CA a0) throws Throwable;
private static native java.util.Iterator __call720000_157(java.util.List a0) throws Throwable;
private static native boolean __call720000_158(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720000_159(java.util.Iterator a0) throws Throwable;
private static native moom.DR __cast720000_160(java.lang.Object a0) throws Throwable;
private static native double __fieldRead720000_161(moom.DR a0) throws Throwable;
private static native double __call720000_162(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native double __fieldRead720000_163(moom.DR a0) throws Throwable;
private static native double __call720000_164(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native double __fieldRead720000_165(moom.DR a0) throws Throwable;
private static native double __call720000_166(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native moom.DR __call720000_167(float a0, float a1, float a2) throws Throwable;
private static native double __fieldRead720000_168(moom.DR a0) throws Throwable;
private static native int __numericCompare720000_169(double a0, double a1) throws Throwable;
private static native double __fieldRead720000_170(moom.DR a0) throws Throwable;
private static native int __numericCompare720000_171(double a0, double a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f __sourceUninitializedNEW720000_172() throws Throwable;
private static native double __fieldRead720000_174(moom.DR a0) throws Throwable;
private static native double __fieldRead720000_175(moom.DR a0) throws Throwable;
private static native double __fieldRead720000_176(moom.DR a0) throws Throwable;
private static native double __fieldRead720000_177(moom.DR a0) throws Throwable;
private static native void __explicitNewInit720000_178(org.lwjgl.util.vector.Vector4f a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native double __fieldRead720000_179(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_180(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_181(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_182(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native double __fieldRead720000_183(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_184(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_185(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_186(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native double __fieldRead720000_187(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_188(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_189(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_190(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native double __fieldRead720000_191(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_192(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_193(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_194(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call720000_195(net.minecraft.tileentity.TileEntity a0, org.lwjgl.util.vector.Vector4f a1) throws Throwable;
private static native boolean __call720000_196(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory720000_197(boolean value) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast720000_198(java.lang.Object a0) throws Throwable;
private static native int __instanceOf720000_199(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __instanceOf720000_200(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __instanceOf720000_201(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntityChest __cast720000_202(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.CA __call720000_203(com.moon.hP a0, net.minecraft.tileentity.TileEntityChest a1) throws Throwable;
private static native moom.Cg __cast720000_204(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.CA __call720000_205(com.moon.hP a0, moom.Cg a1) throws Throwable;
private static native boolean __call720000_206(moom.CA a0) throws Throwable;
private static native java.util.List __call720000_207(moom.CA a0) throws Throwable;
private static native java.util.Iterator __call720000_208(java.util.List a0) throws Throwable;
private static native boolean __call720000_209(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720000_210(java.util.Iterator a0) throws Throwable;
private static native moom.DR __cast720000_211(java.lang.Object a0) throws Throwable;
private static native double __fieldRead720000_212(moom.DR a0) throws Throwable;
private static native double __call720000_213(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native double __fieldRead720000_214(moom.DR a0) throws Throwable;
private static native double __call720000_215(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native double __fieldRead720000_216(moom.DR a0) throws Throwable;
private static native double __call720000_217(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native moom.DR __call720000_218(float a0, float a1, float a2) throws Throwable;
private static native double __fieldRead720000_219(moom.DR a0) throws Throwable;
private static native int __numericCompare720000_220(double a0, double a1) throws Throwable;
private static native double __fieldRead720000_221(moom.DR a0) throws Throwable;
private static native int __numericCompare720000_222(double a0, double a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector4f __sourceUninitializedNEW720000_223() throws Throwable;
private static native double __fieldRead720000_225(moom.DR a0) throws Throwable;
private static native double __fieldRead720000_226(moom.DR a0) throws Throwable;
private static native double __fieldRead720000_227(moom.DR a0) throws Throwable;
private static native double __fieldRead720000_228(moom.DR a0) throws Throwable;
private static native void __explicitNewInit720000_229(org.lwjgl.util.vector.Vector4f a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native double __fieldRead720000_230(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_231(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_232(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_233(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native double __fieldRead720000_234(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_235(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_236(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_237(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native double __fieldRead720000_238(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_239(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_240(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_241(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native double __fieldRead720000_242(moom.DR a0) throws Throwable;
private static native float __fieldRead720000_243(org.lwjgl.util.vector.Vector4f a0) throws Throwable;
private static native double __call720000_244(double a0, double a1) throws Throwable;
private static native void __fieldWrite720000_245(org.lwjgl.util.vector.Vector4f a0, float a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call720000_246(net.minecraft.tileentity.TileEntity a0, org.lwjgl.util.vector.Vector4f a1) throws Throwable;
private static native boolean __call720000_247(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720000_248(java.util.Iterator a0) throws Throwable;

}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill482_0 = p0;
        life4_9 += 1;
        life5_44 = (spill482_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill482_1 = p0;
        life4_9 += 1;
        life5_76 = (spill482_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill482_2 = p0;
        life4_9 += 1;
        life5_91 = (spill482_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private moom.CA a(moom.Cg p0) {
double local2 = ((double) ((moom.DT)(((moom.Cg)(p0)).a__DT())).a());
    double local4 = ((double) ((moom.DT)(((moom.Cg)(p0)).a__DT())).b());
    double local6 = ((double) ((moom.DT)(((moom.Cg)(p0)).a__DT())).c());
    return ((moom.CA)(new moom.CA(0x1.0p-4d, 0x0.0p0d, 0x1.0p-4d, 0x1.e147ae147ae14p-1d, 0x1.cp-1d, 0x1.e147ae147ae14p-1d))).c(((double)(local2)), ((double)(local4)), ((double)(local6)));
}


private moom.CA a(net.minecraft.tileentity.TileEntityChest p0) {
net.minecraft.tileentity.TileEntityChest forwardValue322_48_0;
    net.minecraft.tileentity.TileEntityChest forwardValue322_57_0;
    net.minecraft.tileentity.TileEntityChest forwardValue322_66_0;
    net.minecraft.tileentity.TileEntityChest forwardValue322_71_0;
    int[] spill322_0;
    net.minecraft.tileentity.TileEntityChest spill322_1;
    long life2_3;
    moom.DT life5_6;
    double life6_10;
    double life8_15;
    double life10_19;
    int[] life4_20;
    moom.CA life12_34;
    net.minecraft.tileentity.TileEntityChest life13_36;
    forward_join_99: {
    forward_join_72: {
    forward_join_71: {
    forward_join_66: {
    forward_join_64: {
    forward_join_57: {
    forward_join_55: {
    forward_join_48: {
    forward_join_46: {
    life2_3 = (com.moon.hP.c ^ 9058697598324L);
    life5_6 = ((net.minecraft.tileentity.TileEntityChest)(p0)).a__DT();
    life6_10 = ((double) ((moom.DT)(life5_6)).a());
    spill322_0 = net.minecraft.world.biome.BiomeGenBase.b__ArrayInt();
    life8_15 = ((double) ((moom.DT)(life5_6)).b());
    life10_19 = ((double) ((moom.DT)(life5_6)).c());
    life4_20 = spill322_0;
    life12_34 = ((moom.CA)(new moom.CA(0x1.0p-4d, 0x0.0p0d, 0x1.0p-4d, 0x1.e147ae147ae14p-1d, 0x1.cp-1d, 0x1.e147ae147ae14p-1d))).c(((double)(life6_10)), ((double)(life8_15)), ((double)(life10_19)));
    life13_36 = null;
    spill322_1 = ((net.minecraft.tileentity.TileEntityChest)(p0)).r;
    if (!((life4_20 == null))) {
        forwardValue322_48_0 = spill322_1;
        break forward_join_48;
    }
    if (!((spill322_1 != null))) {
        break forward_join_46;
    }
    life13_36 = ((net.minecraft.tileentity.TileEntityChest)(p0)).r;
    break forward_join_72;
    }
    forwardValue322_48_0 = ((net.minecraft.tileentity.TileEntityChest)(p0)).q;
    }
    if (!((life4_20 == null))) {
        forwardValue322_57_0 = forwardValue322_48_0;
        break forward_join_57;
    }
    if (!((forwardValue322_48_0 != null))) {
        break forward_join_55;
    }
    life13_36 = ((net.minecraft.tileentity.TileEntityChest)(p0)).q;
    break forward_join_72;
    }
    forwardValue322_57_0 = ((net.minecraft.tileentity.TileEntityChest)(p0)).p;
    }
    if (!((life4_20 == null))) {
        forwardValue322_66_0 = forwardValue322_57_0;
        break forward_join_66;
    }
    if (!((forwardValue322_57_0 != null))) {
        break forward_join_64;
    }
    life13_36 = ((net.minecraft.tileentity.TileEntityChest)(p0)).p;
    break forward_join_72;
    }
    forwardValue322_66_0 = ((net.minecraft.tileentity.TileEntityChest)(p0)).s;
    }
    if (!((life4_20 == null))) {
        forwardValue322_71_0 = forwardValue322_66_0;
        break forward_join_71;
    }
    if (!((forwardValue322_66_0 != null))) {
        break forward_join_72;
    }
    forwardValue322_71_0 = ((net.minecraft.tileentity.TileEntityChest)(p0)).s;
    }
    life13_36 = forwardValue322_71_0;
    }
    if (!((life13_36 != null))) {
        break forward_join_99;
    }
    life12_34 = ((moom.CA)(life12_34)).a(((moom.CA)(((moom.CA)(new moom.CA(0x1.0p-4d, 0x0.0p0d, 0x1.0p-4d, 0x1.e147ae147ae14p-1d, 0x1.cp-1d, 0x1.e147ae147ae14p-1d))).c(((double)(((double) ((moom.DT)(((net.minecraft.tileentity.TileEntityChest)(life13_36)).a__DT())).a()))), ((double)(((double) ((moom.DT)(((net.minecraft.tileentity.TileEntityChest)(life13_36)).a__DT())).b()))), ((double)(((double) ((moom.DT)(((net.minecraft.tileentity.TileEntityChest)(life13_36)).a__DT())).c())))))));
    }
    return life12_34;
}


public void a() { __sourceHandlerCall_a8af2a685f55a3553892(this); }

}
