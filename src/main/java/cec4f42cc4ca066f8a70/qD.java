package moom;


public class qD extends net.minecraft.command.CommandBase {

private static long c;

private static long d;

public qD() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(2229208103984950743L)), ((long)(-5916297531304030576L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(36901907636207L)))));
    long local0_life6 = (moom.qD.c ^ 61832537332142L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill969_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill969_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill969_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill969_13 = new byte[8];
    (__sourceSpill969_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill969_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation969_15 = __sourceSpill969_13;
    ((javax.crypto.Cipher)(__sourceSpill969_10)).init(((int)(__sourceSpill969_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill969_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation969_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 4928029495725591892L;
    byte[] __sourceSpill969_19 = new byte[8];
    (__sourceSpill969_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill969_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill969_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill969_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill969_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill969_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill969_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill969_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill969_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill969_20)).doFinal(((byte[])(__sourceSpill969_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceHandlerCall_8ccfe9590c98a47abd21(moom.qD a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_8ccfe9590c98a47abd21 {

public static void f16(moom.qD receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forestValue16_20_0;
    int forestValue16_30_0;
    int forestValue16_30_1;
    int forestValue16_37_0;
    int forestValue16_37_1;
    int forestValue16_60_0;
    int forestValue16_60_1;
    int forestValue16_68_0;
    int forestValue16_68_1;
    double forestValue16_121_0;
    java.lang.String[] forestValue16_121_1;
    double forestValue16_125_0;
    double forestValue16_126_0;
    java.lang.String forestValue16_126_1;
    double forestValue16_139_0;
    java.lang.String[] forestValue16_139_1;
    double forestValue16_142_0;
    double forestValue16_143_0;
    java.lang.String forestValue16_143_1;
    int forestValue16_163_0;
    int forestValue16_172_0;
    int forestValue16_181_0;
    int forestValue16_192_0;
    moom.qH forestValue16_198_0;
    moom.qH forestValue16_210_0;
    int forestValue16_226_0;
    float forestValue16_240_0;
    float forestValue16_240_1;
    float forestValue16_293_0;
    float forestValue16_293_1;
    net.minecraft.entity.Entity forestValue16_367_0;
    net.minecraft.entity.Entity forestValue16_388_0;
    int spill16_0;
    int spill16_1;
    int spill16_2;
    int spill16_3;
    int spill16_4;
    double spill16_5;
    java.lang.String[] spill16_6;
    double spill16_7;
    java.lang.String[] spill16_8;
    boolean spill16_9;
    moom.qH spill16_10;
    moom.qH spill16_11;
    boolean spill16_12;
    float spill16_13;
    float spill16_14;
    float spill16_15;
    float spill16_16;
    float spill16_17;
    float spill16_18;
    float spill16_19;
    float spill16_20;
    net.minecraft.command.ICommandSender spill16_21;
    moom.qD spill16_22;
    java.lang.String spill16_23;
    java.lang.Object[] spill16_24;
    java.lang.Object[] spill16_25;
    java.lang.Object[] spill16_26;
    java.lang.Object[] spill16_27;
    net.minecraft.entity.Entity spill16_28;
    net.minecraft.command.ICommandSender spill16_29;
    moom.qD spill16_30;
    java.lang.String spill16_31;
    java.lang.Object[] spill16_32;
    java.lang.Object[] spill16_33;
    long life3_3;
    int life5_5;
    int life6_24;
    net.minecraft.entity.Entity life7_53;
    int life8_107;
    moom.qH life9_115;
    moom.qH life10_126;
    moom.qH life11_135;
    moom.qH life12_158;
    moom.qH life13_180;
    java.util.EnumSet life14_187;
    float life15_260;
    float life16_277;
    float life14_347;
    float life15_352;
    net.minecraft.entity.Entity life8_438;
    forest_join_415: {
    forest_join_399: {
    forest_join_388: {
    forest_join_387: {
    forest_join_367: {
    forest_join_363: {
    forest_join_340: {
    forest_join_309: {
    forest_join_296: {
    forest_join_293: {
    forest_join_286: {
    forest_join_264: {
    forest_join_243: {
    forest_join_240: {
    forest_join_233: {
    forest_join_226: {
    forest_join_221: {
    forest_join_210: {
    forest_join_209: {
    forest_join_198: {
    forest_join_197: {
    forest_join_192: {
    forest_join_188: {
    forest_join_181: {
    forest_join_179: {
    forest_join_172: {
    forest_join_170: {
    forest_join_163: {
    forest_join_161: {
    forest_join_143: {
    forest_join_142: {
    forest_join_139: {
    forest_join_126: {
    forest_join_125: {
    forest_join_121: {
    forest_join_76: {
    forest_join_68: {
    forest_join_60: {
    forest_join_51: {
    forest_join_43: {
    forest_join_37: {
    forest_join_30: {
    forest_join_20: {
    forest_join_19: {
    life3_3 = (__fieldRead16_0() ^ 34242196386399L);
    life5_5 = __call16_1();
    spill16_0 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue16_20_0 = spill16_0;
        break forest_join_20;
    }
    if (!((spill16_0 < 1))) {
        break forest_join_19;
    }
    throw new moom.cc("commands.tp.usage", new java.lang.Object[0]);
    }
    forestValue16_20_0 = 0;
    }
    life6_24 = forestValue16_20_0;
    spill16_1 = (p1).length;
    spill16_2 = 2;
    if (!((life5_5 != 0))) {
        forestValue16_30_0 = spill16_1;
        forestValue16_30_1 = spill16_2;
        break forest_join_30;
    }
    if (!((spill16_1 != spill16_2))) {
        break forest_join_43;
    }
    forestValue16_30_0 = (p1).length;
    forestValue16_30_1 = 4;
    }
    if (!((life5_5 != 0))) {
        forestValue16_37_0 = forestValue16_30_0;
        forestValue16_37_1 = forestValue16_30_1;
        break forest_join_37;
    }
    if (!((forestValue16_30_0 != forestValue16_30_1))) {
        break forest_join_43;
    }
    forestValue16_37_0 = (p1).length;
    forestValue16_37_1 = ((int) __fieldRead16_2());
    }
    if (!((forestValue16_37_0 != forestValue16_37_1))) {
        break forest_join_43;
    }
    life7_53 = __call16_3(p0);
    if (!((life5_5 == 0))) {
        break forest_join_51;
    }
    }
    life7_53 = __call16_4(p0, (p1)[0]);
    life6_24 = 1;
    }
    spill16_3 = (p1).length;
    spill16_4 = 1;
    if (!((life5_5 != 0))) {
        forestValue16_60_0 = spill16_3;
        forestValue16_60_1 = spill16_4;
        break forest_join_60;
    }
    if (!((spill16_3 != spill16_4))) {
        break forest_join_340;
    }
    forestValue16_60_0 = (p1).length;
    forestValue16_60_1 = 2;
    }
    if (!((life5_5 != 0))) {
        forestValue16_68_0 = forestValue16_60_0;
        forestValue16_68_1 = forestValue16_60_1;
        break forest_join_68;
    }
    if (!((forestValue16_60_0 != forestValue16_60_1))) {
        break forest_join_340;
    }
    forestValue16_68_0 = (p1).length;
    forestValue16_68_1 = (life6_24 + 3);
    }
    if (!((forestValue16_68_0 < forestValue16_68_1))) {
        break forest_join_76;
    }
    throw new moom.cc("commands.tp.usage", new java.lang.Object[0]);
    }
    if (!((__fieldRead16_5(life7_53) != null))) {
        break forest_join_415;
    }
    life8_107 = (life6_24 + 1);
    life9_115 = __call16_7(__fieldRead16_6(life7_53), (p1)[life6_24], 1);
    life10_126 = __call16_9(__fieldRead16_8(life7_53), (p1)[(life8_107++)], 0, 0, 0);
    life11_135 = __call16_11(__fieldRead16_10(life7_53), (p1)[(life8_107++)], 1);
    spill16_5 = ((double) __fieldRead16_12(life7_53));
    spill16_6 = p1;
    if (!((life5_5 != 0))) {
        forestValue16_121_0 = spill16_5;
        forestValue16_121_1 = spill16_6;
        break forest_join_121;
    }
    if (!(((spill16_6).length > life8_107))) {
        forestValue16_125_0 = spill16_5;
        break forest_join_125;
    }
    forestValue16_121_0 = spill16_5;
    forestValue16_121_1 = p1;
    }
    forestValue16_126_0 = forestValue16_121_0;
    forestValue16_126_1 = (forestValue16_121_1)[(life8_107++)];
    break forest_join_126;
    }
    forestValue16_126_0 = forestValue16_125_0;
    forestValue16_126_1 = "~";
    }
    life12_158 = __call16_13(forestValue16_126_0, forestValue16_126_1, 0);
    spill16_7 = ((double) __fieldRead16_14(life7_53));
    spill16_8 = p1;
    if (!((life5_5 != 0))) {
        forestValue16_139_0 = spill16_7;
        forestValue16_139_1 = spill16_8;
        break forest_join_139;
    }
    if (!(((spill16_8).length > life8_107))) {
        forestValue16_142_0 = spill16_7;
        break forest_join_142;
    }
    forestValue16_139_0 = spill16_7;
    forestValue16_139_1 = p1;
    }
    forestValue16_143_0 = forestValue16_139_0;
    forestValue16_143_1 = (forestValue16_139_1)[life8_107];
    break forest_join_143;
    }
    forestValue16_143_0 = forestValue16_142_0;
    forestValue16_143_1 = "~";
    }
    life13_180 = __call16_15(forestValue16_143_0, forestValue16_143_1, 0);
    if (!((__instanceOf16_16(life7_53) != 0))) {
        break forest_join_264;
    }
    life14_187 = __call16_18(__classLiteral16_17());
    spill16_9 = __call16_19(life9_115);
    if (!((life5_5 != 0))) {
        forestValue16_163_0 = __integerCategory16_20(spill16_9);
        break forest_join_163;
    }
    if (!(spill16_9)) {
        break forest_join_161;
    }
    __call16_22(life14_187, __fieldRead16_21());
    }
    forestValue16_163_0 = __integerCategory16_24(__call16_23(life10_126));
    }
    if (!((life5_5 != 0))) {
        forestValue16_172_0 = forestValue16_163_0;
        break forest_join_172;
    }
    if (!((forestValue16_163_0 != 0))) {
        break forest_join_170;
    }
    __call16_26(life14_187, __fieldRead16_25());
    }
    forestValue16_172_0 = __integerCategory16_28(__call16_27(life11_135));
    }
    if (!((life5_5 != 0))) {
        forestValue16_181_0 = forestValue16_172_0;
        break forest_join_181;
    }
    if (!((forestValue16_172_0 != 0))) {
        break forest_join_179;
    }
    __call16_30(life14_187, __fieldRead16_29());
    }
    forestValue16_181_0 = __integerCategory16_32(__call16_31(life13_180));
    }
    if (!((life5_5 != 0))) {
        forestValue16_192_0 = forestValue16_181_0;
        break forest_join_192;
    }
    if (!((forestValue16_181_0 != 0))) {
        break forest_join_188;
    }
    __call16_34(life14_187, __fieldRead16_33());
    }
    spill16_10 = life12_158;
    if (!((life5_5 != 0))) {
        forestValue16_198_0 = spill16_10;
        break forest_join_198;
    }
    forestValue16_192_0 = __integerCategory16_36(__call16_35(spill16_10));
    }
    if (!((forestValue16_192_0 != 0))) {
        break forest_join_197;
    }
    __call16_38(life14_187, __fieldRead16_37());
    }
    forestValue16_198_0 = life12_158;
    }
    life15_260 = ((float) __call16_39(forestValue16_198_0));
    spill16_11 = life12_158;
    if (!((life5_5 != 0))) {
        forestValue16_210_0 = spill16_11;
        break forest_join_210;
    }
    if (!((!__call16_40(spill16_11)))) {
        break forest_join_209;
    }
    life15_260 = __call16_41(life15_260);
    }
    forestValue16_210_0 = life13_180;
    }
    life16_277 = ((float) __call16_42(forestValue16_210_0));
    spill16_12 = __call16_43(life13_180);
    if (!((life5_5 != 0))) {
        forestValue16_226_0 = __integerCategory16_44(spill16_12);
        break forest_join_226;
    }
    if (!((!spill16_12))) {
        break forest_join_221;
    }
    life16_277 = __call16_45(life16_277);
    }
    spill16_13 = life16_277;
    spill16_14 = 0x1.68p6f;
    if (!((life5_5 != 0))) {
        forestValue16_240_0 = spill16_13;
        forestValue16_240_1 = spill16_14;
        break forest_join_240;
    }
    forestValue16_226_0 = __numericCompare16_46(spill16_13, spill16_14);
    }
    if (!((forestValue16_226_0 <= 0))) {
        break forest_join_233;
    }
    spill16_15 = life16_277;
    spill16_16 = -0x1.68p6f;
    if (!((life5_5 != 0))) {
        forestValue16_240_0 = spill16_15;
        forestValue16_240_1 = spill16_16;
        break forest_join_240;
    }
    if (!((__numericCompare16_47(spill16_15, spill16_16) < 0))) {
        break forest_join_243;
    }
    }
    life16_277 = __call16_48((0x1.68p7f - life16_277));
    forestValue16_240_0 = life15_260;
    forestValue16_240_1 = 0x1.68p7f;
    }
    life15_260 = __call16_49((forestValue16_240_0 + forestValue16_240_1));
    }
    __call16_50(life7_53, null);
    __call16_56(__fieldRead16_52(__cast16_51(life7_53)), __call16_53(life9_115), __call16_54(life10_126), __call16_55(life11_135), life15_260, life16_277, life14_187);
    __call16_57(life7_53, life15_260);
    if (!((life5_5 == 0))) {
        break forest_join_309;
    }
    }
    life14_347 = ((float) __call16_59(__call16_58(life12_158)));
    life15_352 = ((float) __call16_61(__call16_60(life13_180)));
    spill16_17 = life15_352;
    spill16_18 = 0x1.68p6f;
    if (!((life5_5 != 0))) {
        forestValue16_293_0 = spill16_17;
        forestValue16_293_1 = spill16_18;
        break forest_join_293;
    }
    if (!((__numericCompare16_62(spill16_17, spill16_18) <= 0))) {
        break forest_join_286;
    }
    spill16_19 = life15_352;
    spill16_20 = -0x1.68p6f;
    if (!((life5_5 != 0))) {
        forestValue16_293_0 = spill16_19;
        forestValue16_293_1 = spill16_20;
        break forest_join_293;
    }
    if (!((__numericCompare16_63(spill16_19, spill16_20) < 0))) {
        break forest_join_296;
    }
    }
    life15_352 = __call16_64((0x1.68p7f - life15_352));
    forestValue16_293_0 = life14_347;
    forestValue16_293_1 = 0x1.68p7f;
    }
    life14_347 = __call16_65((forestValue16_293_0 + forestValue16_293_1));
    }
    __call16_69(life7_53, __call16_66(life9_115), __call16_67(life10_126), __call16_68(life11_135), life14_347, life15_352);
    __call16_70(life7_53, life14_347);
    }
    spill16_21 = p0;
    spill16_22 = receiver;
    spill16_23 = "commands.tp.success.coordinates";
    java.lang.Object[] __stackOp16_71_0 = new java.lang.Object[4];
    spill16_24 = __stackOp16_71_0;
    (__stackOp16_71_0)[0] = __call16_72(life7_53);
    java.lang.Object[] __stackOp16_73_0 = spill16_24;
    spill16_25 = __stackOp16_73_0;
    (__stackOp16_73_0)[1] = __call16_75(__call16_74(life9_115));
    java.lang.Object[] __stackOp16_76_0 = spill16_25;
    spill16_26 = __stackOp16_76_0;
    (__stackOp16_76_0)[2] = __call16_78(__call16_77(life10_126));
    java.lang.Object[] __stackOp16_79_0 = spill16_26;
    spill16_27 = __stackOp16_79_0;
    (__stackOp16_79_0)[3] = __call16_81(__call16_80(life11_135));
    __call16_82(spill16_21, spill16_22, spill16_23, spill16_27);
    if (!((life5_5 == 0))) {
        break forest_join_415;
    }
    }
    life8_438 = __call16_83(p0, (p1)[((p1).length - 1)]);
    spill16_28 = life8_438;
    if (!((life5_5 != 0))) {
        forestValue16_367_0 = spill16_28;
        break forest_join_367;
    }
    if (!((__fieldRead16_84(spill16_28) != __fieldRead16_85(life7_53)))) {
        break forest_join_363;
    }
    throw new moom.b7("commands.tp.notSameDimension", new java.lang.Object[0]);
    }
    __call16_86(life7_53, null);
    forestValue16_367_0 = life7_53;
    }
    if (!((life5_5 != 0))) {
        forestValue16_388_0 = forestValue16_367_0;
        break forest_join_388;
    }
    if (!((__instanceOf16_87(forestValue16_367_0) != 0))) {
        break forest_join_387;
    }
    __call16_95(__fieldRead16_89(__cast16_88(life7_53)), __fieldRead16_90(life8_438), __fieldRead16_91(life8_438), __fieldRead16_92(life8_438), __fieldRead16_93(life8_438), __fieldRead16_94(life8_438));
    if (!((life5_5 == 0))) {
        break forest_join_399;
    }
    }
    forestValue16_388_0 = life7_53;
    }
    __call16_101(forestValue16_388_0, __fieldRead16_96(life8_438), __fieldRead16_97(life8_438), __fieldRead16_98(life8_438), __fieldRead16_99(life8_438), __fieldRead16_100(life8_438));
    }
    spill16_29 = p0;
    spill16_30 = receiver;
    spill16_31 = "commands.tp.success";
    java.lang.Object[] __stackOp16_102_0 = new java.lang.Object[2];
    spill16_32 = __stackOp16_102_0;
    (__stackOp16_102_0)[0] = __call16_103(life7_53);
    java.lang.Object[] __stackOp16_104_0 = spill16_32;
    spill16_33 = __stackOp16_104_0;
    (__stackOp16_104_0)[1] = __call16_105(life8_438);
    __call16_106(spill16_29, spill16_30, spill16_31, spill16_33);
    }
    return;
}
public static void h16_0(moom.b7 p0) throws Throwable {
    throw __call3001600_0(p0);
}
public static void h16_1(moom.b7 p0) throws Throwable {
    throw __call3001601_0(p0);
}
public static void h16_2(moom.b7 p0) throws Throwable {
    throw __call3001602_0(p0);
}
public static void h16_3(moom.b7 p0) throws Throwable {
    throw __call3001603_0(p0);
}
public static void h16_4(moom.b7 p0) throws Throwable {
    throw __call3001604_0(p0);
}
public static void h16_5(moom.b7 p0) throws Throwable {
    throw __call3001605_0(p0);
}
public static void h16_6(moom.b7 p0) throws Throwable {
    throw __call3001606_0(p0);
}
public static void h16_7(moom.b7 p0) throws Throwable {
    throw __call3001607_0(p0);
}
public static void h16_8(moom.b7 p0) throws Throwable {
    throw __call3001608_0(p0);
}
public static void h16_9(moom.b7 p0) throws Throwable {
    throw __call3001609_0(p0);
}
public static void h16_10(moom.b7 p0) throws Throwable {
    throw __call3001610_0(p0);
}
public static void h16_11(moom.b7 p0) throws Throwable {
    throw __call3001611_0(p0);
}
public static void h16_12(moom.b7 p0) throws Throwable {
    throw __call3001612_0(p0);
}
public static void h16_13(moom.b7 p0) throws Throwable {
    throw __call3001613_0(p0);
}
public static void h16_14(moom.b7 p0) throws Throwable {
    throw __call3001614_0(p0);
}
public static void h16_15(moom.b7 p0) throws Throwable {
    throw __call3001615_0(p0);
}
public static void h16_16(moom.b7 p0) throws Throwable {
    throw __call3001616_0(p0);
}
public static void h16_17(moom.b7 p0) throws Throwable {
    throw __call3001617_0(p0);
}
public static void h16_18(moom.b7 p0) throws Throwable {
    throw __call3001618_0(p0);
}
public static void h16_19(moom.b7 p0) throws Throwable {
    throw __call3001619_0(p0);
}
public static void h16_20(moom.b7 p0) throws Throwable {
    throw __call3001620_0(p0);
}
public static void h16_21(moom.b7 p0) throws Throwable {
    throw __call3001621_0(p0);
}
public static void h16_22(moom.b7 p0) throws Throwable {
    throw __call3001622_0(p0);
}
public static void h16_23(moom.b7 p0) throws Throwable {
    throw __call3001623_0(p0);
}
public static void h16_24(moom.b7 p0) throws Throwable {
    throw __call3001624_0(p0);
}
public static void h16_25(moom.b7 p0) throws Throwable {
    throw __call3001625_0(p0);
}
public static void h16_26(moom.b7 p0) throws Throwable {
    throw __call3001626_0(p0);
}
public static void h16_27(moom.b7 p0) throws Throwable {
    throw __call3001627_0(p0);
}
public static void h16_28(moom.b7 p0) throws Throwable {
    throw __call3001628_0(p0);
}
public static void h16_29(moom.b7 p0) throws Throwable {
    throw __call3001629_0(p0);
}
public static void h16_30(moom.b7 p0) throws Throwable {
    throw __call3001630_0(p0);
}
public static void h16_31(moom.b7 p0) throws Throwable {
    throw __call3001631_0(p0);
}
public static void h16_32(moom.b7 p0) throws Throwable {
    throw __call3001632_0(p0);
}
public static void h16_33(moom.b7 p0) throws Throwable {
    throw __call3001633_0(p0);
}
public static void h16_34(moom.b7 p0) throws Throwable {
    throw __call3001634_0(p0);
}
public static void h16_35(moom.b7 p0) throws Throwable {
    throw __call3001635_0(p0);
}
public static void h16_36(moom.b7 p0) throws Throwable {
    throw __call3001636_0(p0);
}
public static void h16_37(moom.b7 p0) throws Throwable {
    throw __call3001637_0(p0);
}
private static native long __fieldRead16_0() throws Throwable;
private static native int __call16_1() throws Throwable;
private static native long __fieldRead16_2() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call16_3(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.entity.Entity __call16_4(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead16_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead16_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.qH __call16_7(double a0, java.lang.String a1, int a2) throws Throwable;
private static native double __fieldRead16_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.qH __call16_9(double a0, java.lang.String a1, int a2, int a3, int a4) throws Throwable;
private static native double __fieldRead16_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.qH __call16_11(double a0, java.lang.String a1, int a2) throws Throwable;
private static native float __fieldRead16_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.qH __call16_13(double a0, java.lang.String a1, int a2) throws Throwable;
private static native float __fieldRead16_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.qH __call16_15(double a0, java.lang.String a1, int a2) throws Throwable;
private static native int __instanceOf16_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.Class __classLiteral16_17() throws Throwable;
private static native java.util.EnumSet __call16_18(java.lang.Class a0) throws Throwable;
private static native boolean __call16_19(moom.qH a0) throws Throwable;
private static native int __integerCategory16_20(boolean value) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead16_21() throws Throwable;
private static native boolean __call16_22(java.util.EnumSet a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native boolean __call16_23(moom.qH a0) throws Throwable;
private static native int __integerCategory16_24(boolean value) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead16_25() throws Throwable;
private static native boolean __call16_26(java.util.EnumSet a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native boolean __call16_27(moom.qH a0) throws Throwable;
private static native int __integerCategory16_28(boolean value) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead16_29() throws Throwable;
private static native boolean __call16_30(java.util.EnumSet a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native boolean __call16_31(moom.qH a0) throws Throwable;
private static native int __integerCategory16_32(boolean value) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead16_33() throws Throwable;
private static native boolean __call16_34(java.util.EnumSet a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native boolean __call16_35(moom.qH a0) throws Throwable;
private static native int __integerCategory16_36(boolean value) throws Throwable;
private static native net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags __fieldRead16_37() throws Throwable;
private static native boolean __call16_38(java.util.EnumSet a0, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags a1) throws Throwable;
private static native double __call16_39(moom.qH a0) throws Throwable;
private static native boolean __call16_40(moom.qH a0) throws Throwable;
private static native float __call16_41(float a0) throws Throwable;
private static native double __call16_42(moom.qH a0) throws Throwable;
private static native boolean __call16_43(moom.qH a0) throws Throwable;
private static native int __integerCategory16_44(boolean value) throws Throwable;
private static native float __call16_45(float a0) throws Throwable;
private static native int __numericCompare16_46(float a0, float a1) throws Throwable;
private static native int __numericCompare16_47(float a0, float a1) throws Throwable;
private static native float __call16_48(float a0) throws Throwable;
private static native float __call16_49(float a0) throws Throwable;
private static native void __call16_50(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast16_51(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead16_52(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __call16_53(moom.qH a0) throws Throwable;
private static native double __call16_54(moom.qH a0) throws Throwable;
private static native double __call16_55(moom.qH a0) throws Throwable;
private static native void __call16_56(net.minecraft.network.NetHandlerPlayServer a0, double a1, double a2, double a3, float a4, float a5, java.util.EnumSet a6) throws Throwable;
private static native void __call16_57(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native double __call16_58(moom.qH a0) throws Throwable;
private static native double __call16_59(double a0) throws Throwable;
private static native double __call16_60(moom.qH a0) throws Throwable;
private static native double __call16_61(double a0) throws Throwable;
private static native int __numericCompare16_62(float a0, float a1) throws Throwable;
private static native int __numericCompare16_63(float a0, float a1) throws Throwable;
private static native float __call16_64(float a0) throws Throwable;
private static native float __call16_65(float a0) throws Throwable;
private static native double __call16_66(moom.qH a0) throws Throwable;
private static native double __call16_67(moom.qH a0) throws Throwable;
private static native double __call16_68(moom.qH a0) throws Throwable;
private static native void __call16_69(net.minecraft.entity.Entity a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native void __call16_70(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native java.lang.String __call16_72(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __call16_74(moom.qH a0) throws Throwable;
private static native java.lang.Double __call16_75(double a0) throws Throwable;
private static native double __call16_77(moom.qH a0) throws Throwable;
private static native java.lang.Double __call16_78(double a0) throws Throwable;
private static native double __call16_80(moom.qH a0) throws Throwable;
private static native java.lang.Double __call16_81(double a0) throws Throwable;
private static native void __call16_82(net.minecraft.command.ICommandSender a0, moom.qD a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native net.minecraft.entity.Entity __call16_83(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead16_84(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead16_85(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call16_86(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native int __instanceOf16_87(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast16_88(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead16_89(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native double __fieldRead16_90(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead16_91(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead16_92(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead16_93(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead16_94(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call16_95(net.minecraft.network.NetHandlerPlayServer a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native double __fieldRead16_96(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead16_97(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead16_98(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead16_99(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead16_100(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call16_101(net.minecraft.entity.Entity a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native java.lang.String __call16_103(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call16_105(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call16_106(net.minecraft.command.ICommandSender a0, moom.qD a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3001600_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001601_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001602_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001603_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001604_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001605_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001606_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001607_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001608_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001609_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001610_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001611_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001612_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001613_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001614_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001615_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001616_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001617_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001618_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001619_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001620_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001621_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001622_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001623_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001624_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001625_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001626_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001627_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001628_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001629_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001630_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001631_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001632_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001633_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001634_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001635_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001636_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call3001637_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_9869991ccc221ec7c3b6(moom.qD a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_9869991ccc221ec7c3b6 {

public static java.util.List f1143(moom.qD receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    java.lang.String[] forwardValue1143_21_0;
    java.util.List forwardValue1143_24_0;
    java.lang.String[] spill1143_0;
    java.lang.String[] spill1143_1;
    long life4_3;
    int life6_5;
    forward_join_24: {
    forward_join_21: {
    forward_join_20: {
    life4_3 = (__fieldRead1143_0() ^ 96947928900572L);
    life6_5 = __call1143_1();
    spill1143_0 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1143_21_0 = spill1143_0;
        break forward_join_21;
    }
    if (!(((spill1143_0).length != 1))) {
        break forward_join_20;
    }
    spill1143_1 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1143_21_0 = spill1143_1;
        break forward_join_21;
    }
    if (!(((spill1143_1).length != 2))) {
        break forward_join_20;
    }
    forwardValue1143_24_0 = null;
    break forward_join_24;
    }
    forwardValue1143_21_0 = p1;
    }
    forwardValue1143_24_0 = __call1143_4(forwardValue1143_21_0, __call1143_3(__call1143_2()));
    }
    return forwardValue1143_24_0;
}
public static void h1143_0(moom.Oo p0) throws Throwable {
    throw __call1114300_0(p0);
}
public static void h1143_1(moom.Oo p0) throws Throwable {
    throw __call1114301_0(p0);
}
public static void h1143_2(moom.Oo p0) throws Throwable {
    throw __call1114302_0(p0);
}
public static void h1143_3(moom.Oo p0) throws Throwable {
    throw __call1114303_0(p0);
}
private static native long __fieldRead1143_0() throws Throwable;
private static native int __call1143_1() throws Throwable;
private static native moom.Bl __call1143_2() throws Throwable;
private static native java.lang.String[] __call1143_3(moom.Bl a0) throws Throwable;
private static native java.util.List __call1143_4(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1114300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114303_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_a261775828d3aaef17d4(moom.qD a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_a261775828d3aaef17d4 {

public static boolean f1144(moom.qD receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1144_11_0;
    int forwardValue1144_13_0;
    int spill1144_0;
    long life3_3;
    int life5_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life3_3 = (__fieldRead1144_0() ^ 106141515551687L);
    life5_5 = __call1144_1();
    spill1144_0 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1144_11_0 = spill1144_0;
        break forward_join_11;
    }
    if (!((spill1144_0 == 0))) {
        break forward_join_12;
    }
    forwardValue1144_11_0 = 1;
    }
    forwardValue1144_13_0 = forwardValue1144_11_0;
    break forward_join_13;
    }
    forwardValue1144_13_0 = 0;
    }
    return __integerCategory1144_2(forwardValue1144_13_0);
}
public static void h1144_0(moom.Oo p0) throws Throwable {
    throw __call1114400_0(p0);
}
private static native long __fieldRead1144_0() throws Throwable;
private static native int __call1144_1() throws Throwable;
private static native boolean __integerCategory1144_2(int value) throws Throwable;
private static native java.lang.Exception __call1114400_0(moom.Oo a0) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_a261775828d3aaef17d4(this, p0, p1); }


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_9869991ccc221ec7c3b6(this, p0, p1, p2); }


public java.lang.String a__String() {
return "tp";
}


public int a() {
return 2;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.tp.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_8ccfe9590c98a47abd21(this, p0, p1); }

}
