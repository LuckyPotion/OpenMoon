package net.minecraft.client.renderer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BlockFluidRenderer {

private net.minecraft.client.renderer.texture.TextureAtlasSprite[] a;

private net.minecraft.client.renderer.texture.TextureAtlasSprite[] b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

public BlockFluidRenderer() {
super();
    this.a = new net.minecraft.client.renderer.texture.TextureAtlasSprite[2];
    this.b = new net.minecraft.client.renderer.texture.TextureAtlasSprite[2];
    (this).a();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-1035496943968482272L)), ((long)(5267322750462739453L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(203883450333440L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.renderer.BlockFluidRenderer.c ^ 120170243342854L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1803_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1803_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1803_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1803_14 = new byte[8];
    (__sourceSpill1803_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1803_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1803_16 = __sourceSpill1803_14;
    ((javax.crypto.Cipher)(__sourceSpill1803_11)).init(((int)(__sourceSpill1803_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1803_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1803_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "dãNHÌäxüI?ør³\025ÆaPOnW÷ÌÍÉu?U=ü#E¡mY\000Î\033ÿc8"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1803_25 = local6_life21;
        int __sourceSpill1803_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1803_25)).substring(((int)(__sourceSpill1803_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1803_30 = local8_life19;
        int __sourceSpill1803_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1803_33 = new byte[8];
        (__sourceSpill1803_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1803_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1803_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1803_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1803_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1803_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1803_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1803_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1803_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1803_34)).doFinal(((byte[])(__sourceSpill1803_33)));
        (__sourceSpill1803_30)[__sourceSpill1803_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\003Ü2\024îBóeQ\025L°P"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1803_38 = local6_life21;
        int __sourceSpill1803_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1803_38)).substring(((int)(__sourceSpill1803_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1803_43 = local8_life19;
        int __sourceSpill1803_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1803_46 = new byte[8];
        (__sourceSpill1803_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1803_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1803_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1803_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1803_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1803_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1803_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1803_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1803_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1803_47)).doFinal(((byte[])(__sourceSpill1803_46)));
        (__sourceSpill1803_43)[__sourceSpill1803_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_e7f1ca65324743f11bc4(net.minecraft.client.renderer.BlockFluidRenderer a0, net.minecraft.world.IBlockAccess a1, net.minecraft.block.state.IBlockState a2, moom.DT a3, moom.lw a4) throws E;
private static final class __SourceHandler_e7f1ca65324743f11bc4 {

public static boolean f113(net.minecraft.client.renderer.BlockFluidRenderer receiver, net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.lw p3) throws Throwable {
    net.minecraft.client.renderer.texture.TextureAtlasSprite[] lexicalValue113_28_0;
    float lexicalValue113_1019_0;
    long life5_3;
    net.minecraft.block.BlockLiquid life8_17;
    net.minecraft.client.renderer.texture.TextureAtlasSprite[] life9_33;
    moom.Mi life10_38;
    int life11_44;
    float life12_61;
    float life13_78;
    float life14_89;
    int life15_96;
    int life16_103;
    boolean[] life17_106;
    int life7_179;
    float life18_181;
    float life19_183;
    float life20_185;
    float life21_187;
    moom.fn life22_190;
    float life23_196;
    float life24_203;
    float life25_211;
    float life26_218;
    double life27_222;
    double life29_226;
    double life31_230;
    float life33_232;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life34_240;
    float life35_246;
    float life36_281;
    float life40_285;
    float life37_287;
    float life41_291;
    float life38_295;
    float life42_297;
    float life39_299;
    float life43_301;
    float life44_307;
    float life45_312;
    float life46_314;
    int life44_411;
    int life45_425;
    int life46_433;
    float life47_437;
    float life48_441;
    float life49_445;
    float life34_674;
    float life35_679;
    float life36_684;
    float life37_689;
    int life38_695;
    int life39_709;
    int life40_717;
    float life41_720;
    int life34_832;
    int life35_837;
    int life36_839;
    moom.DT life37_872;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life38_876;
    float life39_890;
    float life40_892;
    double life41_894;
    double life45_898;
    double life43_903;
    double life47_908;
    float life49_991;
    float life50_995;
    float life51_1006;
    float life52_1017;
    float life53_1021;
    int life54_1026;
    int life55_1040;
    int life56_1048;
    float life57_1059;
    float life58_1065;
    float life59_1071;
    float life60_1077;
    int life34_1256;
    int life7_1267;
    lexical_join_1229: {
    lexical_join_1223: {
    lexical_join_1221: {
    lexical_join_1212: {
    lexical_join_808: {
    lexical_join_640: {
    lexical_join_387: {
    lexical_join_283: {
    lexical_join_235: {
    lexical_join_158: {
    lexical_join_28: {
    lexical_join_26: {
    lexical_join_11: {
    life5_3 = (__fieldRead113_0() ^ 52715544585198L);
    if (!(__call113_1())) {
        break lexical_join_11;
    }
    __call113_2(p1, p2, p0, p3);
    }
    life8_17 = __cast113_4(__call113_3(p1));
    __call113_5(life8_17, p0, p2);
    if (!((__call113_6(life8_17) == __fieldRead113_7()))) {
        break lexical_join_26;
    }
    lexicalValue113_28_0 = __fieldRead113_8(receiver);
    break lexical_join_28;
    }
    lexicalValue113_28_0 = __fieldRead113_9(receiver);
    }
    life9_33 = lexicalValue113_28_0;
    life10_38 = __call113_10(p3, p1, p2);
    life11_44 = __call113_11(p0, p1, p2, life10_38);
    life12_61 = (((float) ((life11_44 >> __invokedynamic113_12(4391, (6331484025868217211L ^ life5_3))) & __invokedynamic113_13(9228, (6099282965522079318L ^ life5_3)))) / 0x1.fep7f);
    life13_78 = (((float) ((life11_44 >> __invokedynamic113_14(31625, (2313993643268538833L ^ life5_3))) & __invokedynamic113_15(32224, (8747810809971541945L ^ life5_3)))) / 0x1.fep7f);
    life14_89 = (((float) (life11_44 & __invokedynamic113_16(32224, (8747810809971541945L ^ life5_3)))) / 0x1.fep7f);
    life15_96 = __integerCategory113_20(__call113_19(life8_17, p0, __call113_17(p2), __fieldRead113_18()));
    life16_103 = __integerCategory113_24(__call113_23(life8_17, p0, __call113_21(p2), __fieldRead113_22()));
    life17_106 = __call113_25(life10_38);
    (life17_106)[0] = __call113_28(life8_17, p0, __call113_26(p2), __fieldRead113_27());
    (life17_106)[1] = __call113_31(life8_17, p0, __call113_29(p2), __fieldRead113_30());
    (life17_106)[2] = __call113_34(life8_17, p0, __call113_32(p2), __fieldRead113_33());
    (life17_106)[3] = __call113_37(life8_17, p0, __call113_35(p2), __fieldRead113_36());
    if (!((life15_96 == 0))) {
        break lexical_join_158;
    }
    if (!((life16_103 == 0))) {
        break lexical_join_158;
    }
    if (!((!(life17_106)[0]))) {
        break lexical_join_158;
    }
    if (!((!(life17_106)[1]))) {
        break lexical_join_158;
    }
    if (!((!(life17_106)[2]))) {
        break lexical_join_158;
    }
    if (!((life17_106)[3])) {
        break lexical_join_1223;
    }
    }
    life7_179 = 0;
    life18_181 = 0x1.0p-1f;
    life19_183 = 0x1.0p0f;
    life20_185 = 0x1.99999ap-1f;
    life21_187 = 0x1.333334p-1f;
    life22_190 = __call113_38(life8_17);
    life23_196 = __call113_39(receiver, p0, p2, life22_190);
    life24_203 = __call113_41(receiver, p0, __call113_40(p2), life22_190);
    life25_211 = __call113_44(receiver, p0, __call113_43(__call113_42(p2)), life22_190);
    life26_218 = __call113_46(receiver, p0, __call113_45(p2), life22_190);
    life27_222 = ((double) __call113_47(p2));
    life29_226 = ((double) __call113_48(p2));
    life31_230 = ((double) __call113_49(p2));
    life33_232 = 0x1.0624dep-10f;
    if (!((life15_96 != 0))) {
        break lexical_join_640;
    }
    life7_179 = 1;
    life34_240 = (life9_33)[0];
    life35_246 = ((float) __call113_50(p0, p2, life22_190));
    if (!((__numericCompare113_51(life35_246, -0x1.f38p9f) > 0))) {
        break lexical_join_235;
    }
    life34_240 = (life9_33)[1];
    }
    __call113_52(p3, life34_240);
    life23_196 = (life23_196 - life33_232);
    life24_203 = (life24_203 - life33_232);
    life25_211 = (life25_211 - life33_232);
    life26_218 = (life26_218 - life33_232);
    if (!((__numericCompare113_53(life35_246, -0x1.f38p9f) < 0))) {
        break lexical_join_283;
    }
    life36_281 = __call113_54(life34_240, 0x0.0p0d);
    life40_285 = __call113_55(life34_240, 0x0.0p0d);
    life37_287 = life36_281;
    life41_291 = __call113_56(life34_240, 0x1.0p4d);
    life38_295 = __call113_57(life34_240, 0x1.0p4d);
    life42_297 = life41_291;
    life39_299 = life38_295;
    life43_301 = life40_285;
    break lexical_join_387;
    }
    life44_307 = (__call113_58(life35_246) * 0x1.0p-2f);
    life45_312 = (__call113_59(life35_246) * 0x1.0p-2f);
    life46_314 = 0x1.0p3f;
    life36_281 = __call113_60(life34_240, ((double) (0x1.0p3f + (((-life45_312) - life44_307) * 0x1.0p4f))));
    life40_285 = __call113_61(life34_240, ((double) (0x1.0p3f + (((-life45_312) + life44_307) * 0x1.0p4f))));
    life37_287 = __call113_62(life34_240, ((double) (0x1.0p3f + (((-life45_312) + life44_307) * 0x1.0p4f))));
    life41_291 = __call113_63(life34_240, ((double) (0x1.0p3f + ((life45_312 + life44_307) * 0x1.0p4f))));
    life38_295 = __call113_64(life34_240, ((double) (0x1.0p3f + ((life45_312 + life44_307) * 0x1.0p4f))));
    life42_297 = __call113_65(life34_240, ((double) (0x1.0p3f + ((life45_312 - life44_307) * 0x1.0p4f))));
    life39_299 = __call113_66(life34_240, ((double) (0x1.0p3f + ((life45_312 - life44_307) * 0x1.0p4f))));
    life43_301 = __call113_67(life34_240, ((double) (0x1.0p3f + (((-life45_312) - life44_307) * 0x1.0p4f))));
    }
    life44_411 = __call113_68(life8_17, p0, p2);
    life45_425 = ((life44_411 >> __invokedynamic113_69(23033, (1688038047469806502L ^ life5_3))) & __invokedynamic113_70(2565, (2902002071295062107L ^ life5_3)));
    life46_433 = (life44_411 & __invokedynamic113_71(4553, (3056228217732393876L ^ life5_3)));
    life47_437 = (life19_183 * life12_61);
    life48_441 = (life19_183 * life13_78);
    life49_445 = (life19_183 * life14_89);
    __call113_76(__call113_75(__call113_74(__call113_73(__call113_72(p3, (life27_222 + 0x0.0p0d), (life29_226 + ((double) life23_196)), (life31_230 + 0x0.0p0d)), life47_437, life48_441, life49_445, 0x1.0p0f), ((double) life36_281), ((double) life40_285)), life45_425, life46_433));
    __call113_81(__call113_80(__call113_79(__call113_78(__call113_77(p3, (life27_222 + 0x0.0p0d), (life29_226 + ((double) life24_203)), (life31_230 + 0x1.0p0d)), life47_437, life48_441, life49_445, 0x1.0p0f), ((double) life37_287), ((double) life41_291)), life45_425, life46_433));
    __call113_86(__call113_85(__call113_84(__call113_83(__call113_82(p3, (life27_222 + 0x1.0p0d), (life29_226 + ((double) life25_211)), (life31_230 + 0x1.0p0d)), life47_437, life48_441, life49_445, 0x1.0p0f), ((double) life38_295), ((double) life42_297)), life45_425, life46_433));
    __call113_91(__call113_90(__call113_89(__call113_88(__call113_87(p3, (life27_222 + 0x1.0p0d), (life29_226 + ((double) life26_218)), (life31_230 + 0x0.0p0d)), life47_437, life48_441, life49_445, 0x1.0p0f), ((double) life39_299), ((double) life43_301)), life45_425, life46_433));
    if (!(__call113_93(life8_17, p0, __call113_92(p2)))) {
        break lexical_join_640;
    }
    __call113_98(__call113_97(__call113_96(__call113_95(__call113_94(p3, (life27_222 + 0x0.0p0d), (life29_226 + ((double) life23_196)), (life31_230 + 0x0.0p0d)), life47_437, life48_441, life49_445, 0x1.0p0f), ((double) life36_281), ((double) life40_285)), life45_425, life46_433));
    __call113_103(__call113_102(__call113_101(__call113_100(__call113_99(p3, (life27_222 + 0x1.0p0d), (life29_226 + ((double) life26_218)), (life31_230 + 0x0.0p0d)), life47_437, life48_441, life49_445, 0x1.0p0f), ((double) life39_299), ((double) life43_301)), life45_425, life46_433));
    __call113_108(__call113_107(__call113_106(__call113_105(__call113_104(p3, (life27_222 + 0x1.0p0d), (life29_226 + ((double) life25_211)), (life31_230 + 0x1.0p0d)), life47_437, life48_441, life49_445, 0x1.0p0f), ((double) life38_295), ((double) life42_297)), life45_425, life46_433));
    __call113_113(__call113_112(__call113_111(__call113_110(__call113_109(p3, (life27_222 + 0x0.0p0d), (life29_226 + ((double) life24_203)), (life31_230 + 0x1.0p0d)), life47_437, life48_441, life49_445, 0x1.0p0f), ((double) life37_287), ((double) life41_291)), life45_425, life46_433));
    }
    if (!((life16_103 != 0))) {
        break lexical_join_808;
    }
    __call113_114(p3, (life9_33)[0]);
    life34_674 = __call113_115((life9_33)[0]);
    life35_679 = __call113_116((life9_33)[0]);
    life36_684 = __call113_117((life9_33)[0]);
    life37_689 = __call113_118((life9_33)[0]);
    life38_695 = __call113_120(life8_17, p0, __call113_119(p2));
    life39_709 = ((life38_695 >> __invokedynamic113_121(23033, (1688038047469806502L ^ life5_3))) & __invokedynamic113_122(4553, (3056228217732393876L ^ life5_3)));
    life40_717 = (life38_695 & __invokedynamic113_123(4553, (3056228217732393876L ^ life5_3)));
    life41_720 = __call113_125(__fieldRead113_124());
    __call113_130(__call113_129(__call113_128(__call113_127(__call113_126(p3, life27_222, life29_226, (life31_230 + 0x1.0p0d)), (life12_61 * life41_720), (life13_78 * life41_720), (life14_89 * life41_720), 0x1.0p0f), ((double) life34_674), ((double) life37_689)), life39_709, life40_717));
    __call113_135(__call113_134(__call113_133(__call113_132(__call113_131(p3, life27_222, life29_226, life31_230), (life12_61 * life41_720), (life13_78 * life41_720), (life14_89 * life41_720), 0x1.0p0f), ((double) life34_674), ((double) life36_684)), life39_709, life40_717));
    __call113_140(__call113_139(__call113_138(__call113_137(__call113_136(p3, (life27_222 + 0x1.0p0d), life29_226, life31_230), (life12_61 * life41_720), (life13_78 * life41_720), (life14_89 * life41_720), 0x1.0p0f), ((double) life35_679), ((double) life36_684)), life39_709, life40_717));
    __call113_145(__call113_144(__call113_143(__call113_142(__call113_141(p3, (life27_222 + 0x1.0p0d), life29_226, (life31_230 + 0x1.0p0d)), (life12_61 * life41_720), (life13_78 * life41_720), (life14_89 * life41_720), 0x1.0p0f), ((double) life35_679), ((double) life37_689)), life39_709, life40_717));
    life7_179 = 1;
    }
    life34_832 = 0;
    lexical_cycle_810: while (true) {
    lexical_join_1210: {
    lexical_join_1019: {
    lexical_join_1017: {
    lexical_join_948: {
    lexical_join_924: {
    lexical_join_900: {
    lexical_join_872: {
    lexical_join_832: {
    lexical_join_828: {
    lexical_join_824: {
    lexical_join_820: {
    if (!((life34_832 < 4))) {
        break lexical_join_1212;
    }
    life35_837 = 0;
    life36_839 = 0;
    if (!((life34_832 == 0))) {
        break lexical_join_820;
    }
    life36_839 += -1;
    }
    if (!((life34_832 == 1))) {
        break lexical_join_824;
    }
    life36_839 += 1;
    }
    if (!((life34_832 == 2))) {
        break lexical_join_828;
    }
    life35_837 += -1;
    }
    if (!((life34_832 == 3))) {
        break lexical_join_832;
    }
    life35_837 += 1;
    }
    life37_872 = __call113_146(p2, life35_837, 0, life36_839);
    life38_876 = (life9_33)[1];
    __call113_147(p3, life38_876);
    if (!((life17_106)[life34_832])) {
        break lexical_join_1210;
    }
    if (!((life34_832 == 0))) {
        break lexical_join_872;
    }
    life39_890 = life23_196;
    life40_892 = life26_218;
    life41_894 = life27_222;
    life45_898 = (life27_222 + 0x1.0p0d);
    life43_903 = (life31_230 + ((double) life33_232));
    life47_908 = (life31_230 + ((double) life33_232));
    break lexical_join_948;
    }
    if (!((life34_832 == 1))) {
        break lexical_join_900;
    }
    life39_890 = life25_211;
    life40_892 = life24_203;
    life41_894 = (life27_222 + 0x1.0p0d);
    life45_898 = life27_222;
    life43_903 = ((life31_230 + 0x1.0p0d) - ((double) life33_232));
    life47_908 = ((life31_230 + 0x1.0p0d) - ((double) life33_232));
    break lexical_join_948;
    }
    if (!((life34_832 == 2))) {
        break lexical_join_924;
    }
    life39_890 = life24_203;
    life40_892 = life23_196;
    life41_894 = (life27_222 + ((double) life33_232));
    life45_898 = (life27_222 + ((double) life33_232));
    life43_903 = (life31_230 + 0x1.0p0d);
    life47_908 = life31_230;
    break lexical_join_948;
    }
    life39_890 = life26_218;
    life40_892 = life25_211;
    life41_894 = ((life27_222 + 0x1.0p0d) - ((double) life33_232));
    life45_898 = ((life27_222 + 0x1.0p0d) - ((double) life33_232));
    life43_903 = life31_230;
    life47_908 = (life31_230 + 0x1.0p0d);
    }
    life7_179 = 1;
    life49_991 = __call113_148(life38_876, 0x0.0p0d);
    life50_995 = __call113_149(life38_876, 0x1.0p3d);
    life51_1006 = __call113_150(life38_876, ((double) (((0x1.0p0f - life39_890) * 0x1.0p4f) * 0x1.0p-1f)));
    life52_1017 = __call113_151(life38_876, ((double) (((0x1.0p0f - life40_892) * 0x1.0p4f) * 0x1.0p-1f)));
    life53_1021 = __call113_152(life38_876, 0x1.0p3d);
    life54_1026 = __call113_153(life8_17, p0, life37_872);
    life55_1040 = ((life54_1026 >> __invokedynamic113_154(23033, (1688038047469806502L ^ life5_3))) & __invokedynamic113_155(4553, (3056228217732393876L ^ life5_3)));
    life56_1048 = (life54_1026 & __invokedynamic113_156(4553, (3056228217732393876L ^ life5_3)));
    if (!((life34_832 < 2))) {
        break lexical_join_1017;
    }
    lexicalValue113_1019_0 = __call113_158(__fieldRead113_157());
    break lexical_join_1019;
    }
    lexicalValue113_1019_0 = __call113_160(__fieldRead113_159());
    }
    life57_1059 = lexicalValue113_1019_0;
    life58_1065 = ((life19_183 * life57_1059) * life12_61);
    life59_1071 = ((life19_183 * life57_1059) * life13_78);
    life60_1077 = ((life19_183 * life57_1059) * life14_89);
    __call113_165(__call113_164(__call113_163(__call113_162(__call113_161(p3, life41_894, (life29_226 + ((double) life39_890)), life43_903), life58_1065, life59_1071, life60_1077, 0x1.0p0f), ((double) life49_991), ((double) life51_1006)), life55_1040, life56_1048));
    __call113_170(__call113_169(__call113_168(__call113_167(__call113_166(p3, life45_898, (life29_226 + ((double) life40_892)), life47_908), life58_1065, life59_1071, life60_1077, 0x1.0p0f), ((double) life50_995), ((double) life52_1017)), life55_1040, life56_1048));
    __call113_175(__call113_174(__call113_173(__call113_172(__call113_171(p3, life45_898, (life29_226 + 0x0.0p0d), life47_908), life58_1065, life59_1071, life60_1077, 0x1.0p0f), ((double) life50_995), ((double) life53_1021)), life55_1040, life56_1048));
    __call113_180(__call113_179(__call113_178(__call113_177(__call113_176(p3, life41_894, (life29_226 + 0x0.0p0d), life43_903), life58_1065, life59_1071, life60_1077, 0x1.0p0f), ((double) life49_991), ((double) life53_1021)), life55_1040, life56_1048));
    __call113_185(__call113_184(__call113_183(__call113_182(__call113_181(p3, life41_894, (life29_226 + 0x0.0p0d), life43_903), life58_1065, life59_1071, life60_1077, 0x1.0p0f), ((double) life49_991), ((double) life53_1021)), life55_1040, life56_1048));
    __call113_190(__call113_189(__call113_188(__call113_187(__call113_186(p3, life45_898, (life29_226 + 0x0.0p0d), life47_908), life58_1065, life59_1071, life60_1077, 0x1.0p0f), ((double) life50_995), ((double) life53_1021)), life55_1040, life56_1048));
    __call113_195(__call113_194(__call113_193(__call113_192(__call113_191(p3, life45_898, (life29_226 + ((double) life40_892)), life47_908), life58_1065, life59_1071, life60_1077, 0x1.0p0f), ((double) life50_995), ((double) life52_1017)), life55_1040, life56_1048));
    __call113_200(__call113_199(__call113_198(__call113_197(__call113_196(p3, life41_894, (life29_226 + ((double) life39_890)), life43_903), life58_1065, life59_1071, life60_1077, 0x1.0p0f), ((double) life49_991), ((double) life51_1006)), life55_1040, life56_1048));
    }
    life34_832 += 1;
    continue lexical_cycle_810;
    }
    }
    __call113_201(p3, null);
    life34_1256 = life7_179;
    if (!(__call113_202())) {
        break lexical_join_1221;
    }
    __call113_203(p3);
    }
    return __integerCategory113_204(life34_1256);
    }
    life7_1267 = 0;
    if (!(__call113_205())) {
        break lexical_join_1229;
    }
    __call113_206(p3);
    }
    return __integerCategory113_207(life7_1267);
}
public static boolean h113_0(moom.Oo p0) throws Throwable {
    throw __call2011300_0(p0);
}
public static boolean h113_1(moom.Oo p0) throws Throwable {
    throw __call2011301_0(p0);
}
public static boolean h113_2(moom.Oo p0) throws Throwable {
    throw __call2011302_0(p0);
}
public static boolean h113_3(moom.Oo p0) throws Throwable {
    throw __call2011303_0(p0);
}
public static boolean h113_4(moom.Oo p0) throws Throwable {
    throw __call2011304_0(p0);
}
public static boolean h113_5(moom.Oo p0) throws Throwable {
    throw __call2011305_0(p0);
}
public static boolean h113_6(moom.Oo p0) throws Throwable {
    throw __call2011306_0(p0);
}
public static boolean h113_7(moom.Oo p0) throws Throwable {
    throw __call2011307_0(p0);
}
public static boolean h113_8(moom.Oo p0) throws Throwable {
    throw __call2011308_0(p0);
}
public static boolean h113_9(moom.Oo p0) throws Throwable {
    throw __call2011309_0(p0);
}
public static boolean h113_10(moom.Oo p0) throws Throwable {
    throw __call2011310_0(p0);
}
public static boolean h113_11(moom.Oo p0) throws Throwable {
    throw __call2011311_0(p0);
}
public static boolean h113_12(moom.Oo p0) throws Throwable {
    throw __call2011312_0(p0);
}
public static boolean h113_13(moom.Oo p0) throws Throwable {
    throw __call2011313_0(p0);
}
public static boolean h113_14(moom.Oo p0) throws Throwable {
    throw __call2011314_0(p0);
}
public static boolean h113_15(moom.Oo p0) throws Throwable {
    throw __call2011315_0(p0);
}
public static boolean h113_16(java.lang.Throwable p0, moom.lw p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    if (__call2011316_0()) {
        __call2011316_1(p1);
    }
    throw local2;
}
public static boolean h113_17(moom.Oo p0) throws Throwable {
    throw __call2011317_0(p0);
}
private static native long __fieldRead113_0() throws Throwable;
private static native boolean __call113_1() throws Throwable;
private static native void __call113_2(net.minecraft.block.state.IBlockState a0, moom.DT a1, net.minecraft.world.IBlockAccess a2, moom.lw a3) throws Throwable;
private static native net.minecraft.block.Block __call113_3(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.BlockLiquid __cast113_4(net.minecraft.block.Block a0) throws Throwable;
private static native void __call113_5(net.minecraft.block.BlockLiquid a0, net.minecraft.world.IBlockAccess a1, moom.DT a2) throws Throwable;
private static native moom.fn __call113_6(net.minecraft.block.BlockLiquid a0) throws Throwable;
private static native moom.fn __fieldRead113_7() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead113_8(net.minecraft.client.renderer.BlockFluidRenderer a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite[] __fieldRead113_9(net.minecraft.client.renderer.BlockFluidRenderer a0) throws Throwable;
private static native moom.Mi __call113_10(moom.lw a0, net.minecraft.block.state.IBlockState a1, moom.DT a2) throws Throwable;
private static native int __call113_11(net.minecraft.world.IBlockAccess a0, net.minecraft.block.state.IBlockState a1, moom.DT a2, moom.Mi a3) throws Throwable;
private static native int __invokedynamic113_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic113_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic113_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic113_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic113_16(int a0, long a1) throws Throwable;
private static native moom.DT __call113_17(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead113_18() throws Throwable;
private static native boolean __call113_19(net.minecraft.block.BlockLiquid a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.bs a3) throws Throwable;
private static native int __integerCategory113_20(boolean value) throws Throwable;
private static native moom.DT __call113_21(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead113_22() throws Throwable;
private static native boolean __call113_23(net.minecraft.block.BlockLiquid a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.bs a3) throws Throwable;
private static native int __integerCategory113_24(boolean value) throws Throwable;
private static native boolean[] __call113_25(moom.Mi a0) throws Throwable;
private static native moom.DT __call113_26(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead113_27() throws Throwable;
private static native boolean __call113_28(net.minecraft.block.BlockLiquid a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.bs a3) throws Throwable;
private static native moom.DT __call113_29(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead113_30() throws Throwable;
private static native boolean __call113_31(net.minecraft.block.BlockLiquid a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.bs a3) throws Throwable;
private static native moom.DT __call113_32(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead113_33() throws Throwable;
private static native boolean __call113_34(net.minecraft.block.BlockLiquid a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.bs a3) throws Throwable;
private static native moom.DT __call113_35(moom.DT a0) throws Throwable;
private static native moom.bs __fieldRead113_36() throws Throwable;
private static native boolean __call113_37(net.minecraft.block.BlockLiquid a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.bs a3) throws Throwable;
private static native moom.fn __call113_38(net.minecraft.block.BlockLiquid a0) throws Throwable;
private static native float __call113_39(net.minecraft.client.renderer.BlockFluidRenderer a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.fn a3) throws Throwable;
private static native moom.DT __call113_40(moom.DT a0) throws Throwable;
private static native float __call113_41(net.minecraft.client.renderer.BlockFluidRenderer a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.fn a3) throws Throwable;
private static native moom.DT __call113_42(moom.DT a0) throws Throwable;
private static native moom.DT __call113_43(moom.DT a0) throws Throwable;
private static native float __call113_44(net.minecraft.client.renderer.BlockFluidRenderer a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.fn a3) throws Throwable;
private static native moom.DT __call113_45(moom.DT a0) throws Throwable;
private static native float __call113_46(net.minecraft.client.renderer.BlockFluidRenderer a0, net.minecraft.world.IBlockAccess a1, moom.DT a2, moom.fn a3) throws Throwable;
private static native int __call113_47(moom.DT a0) throws Throwable;
private static native int __call113_48(moom.DT a0) throws Throwable;
private static native int __call113_49(moom.DT a0) throws Throwable;
private static native double __call113_50(net.minecraft.world.IBlockAccess a0, moom.DT a1, moom.fn a2) throws Throwable;
private static native int __numericCompare113_51(float a0, float a1) throws Throwable;
private static native void __call113_52(moom.lw a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native int __numericCompare113_53(float a0, float a1) throws Throwable;
private static native float __call113_54(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_55(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_56(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_57(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_58(float a0) throws Throwable;
private static native float __call113_59(float a0) throws Throwable;
private static native float __call113_60(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_61(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_62(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_63(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_64(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_65(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_66(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_67(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native int __call113_68(net.minecraft.block.BlockLiquid a0, net.minecraft.world.IBlockAccess a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic113_69(int a0, long a1) throws Throwable;
private static native int __invokedynamic113_70(int a0, long a1) throws Throwable;
private static native int __invokedynamic113_71(int a0, long a1) throws Throwable;
private static native moom.lw __call113_72(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_73(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_74(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_75(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_76(moom.lw a0) throws Throwable;
private static native moom.lw __call113_77(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_78(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_79(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_80(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_81(moom.lw a0) throws Throwable;
private static native moom.lw __call113_82(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_83(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_84(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_85(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_86(moom.lw a0) throws Throwable;
private static native moom.lw __call113_87(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_88(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_89(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_90(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_91(moom.lw a0) throws Throwable;
private static native moom.DT __call113_92(moom.DT a0) throws Throwable;
private static native boolean __call113_93(net.minecraft.block.BlockLiquid a0, net.minecraft.world.IBlockAccess a1, moom.DT a2) throws Throwable;
private static native moom.lw __call113_94(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_95(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_96(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_97(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_98(moom.lw a0) throws Throwable;
private static native moom.lw __call113_99(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_100(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_101(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_102(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_103(moom.lw a0) throws Throwable;
private static native moom.lw __call113_104(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_105(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_106(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_107(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_108(moom.lw a0) throws Throwable;
private static native moom.lw __call113_109(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_110(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_111(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_112(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_113(moom.lw a0) throws Throwable;
private static native void __call113_114(moom.lw a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native float __call113_115(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native float __call113_116(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native float __call113_117(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native float __call113_118(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native moom.DT __call113_119(moom.DT a0) throws Throwable;
private static native int __call113_120(net.minecraft.block.BlockLiquid a0, net.minecraft.world.IBlockAccess a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic113_121(int a0, long a1) throws Throwable;
private static native int __invokedynamic113_122(int a0, long a1) throws Throwable;
private static native int __invokedynamic113_123(int a0, long a1) throws Throwable;
private static native moom.bs __fieldRead113_124() throws Throwable;
private static native float __call113_125(moom.bs a0) throws Throwable;
private static native moom.lw __call113_126(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_127(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_128(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_129(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_130(moom.lw a0) throws Throwable;
private static native moom.lw __call113_131(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_132(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_133(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_134(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_135(moom.lw a0) throws Throwable;
private static native moom.lw __call113_136(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_137(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_138(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_139(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_140(moom.lw a0) throws Throwable;
private static native moom.lw __call113_141(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_142(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_143(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_144(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_145(moom.lw a0) throws Throwable;
private static native moom.DT __call113_146(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native void __call113_147(moom.lw a0, net.minecraft.client.renderer.texture.TextureAtlasSprite a1) throws Throwable;
private static native float __call113_148(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_149(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_150(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_151(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native float __call113_152(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, double a1) throws Throwable;
private static native int __call113_153(net.minecraft.block.BlockLiquid a0, net.minecraft.world.IBlockAccess a1, moom.DT a2) throws Throwable;
private static native int __invokedynamic113_154(int a0, long a1) throws Throwable;
private static native int __invokedynamic113_155(int a0, long a1) throws Throwable;
private static native int __invokedynamic113_156(int a0, long a1) throws Throwable;
private static native moom.bs __fieldRead113_157() throws Throwable;
private static native float __call113_158(moom.bs a0) throws Throwable;
private static native moom.bs __fieldRead113_159() throws Throwable;
private static native float __call113_160(moom.bs a0) throws Throwable;
private static native moom.lw __call113_161(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_162(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_163(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_164(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_165(moom.lw a0) throws Throwable;
private static native moom.lw __call113_166(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_167(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_168(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_169(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_170(moom.lw a0) throws Throwable;
private static native moom.lw __call113_171(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_172(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_173(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_174(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_175(moom.lw a0) throws Throwable;
private static native moom.lw __call113_176(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_177(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_178(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_179(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_180(moom.lw a0) throws Throwable;
private static native moom.lw __call113_181(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_182(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_183(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_184(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_185(moom.lw a0) throws Throwable;
private static native moom.lw __call113_186(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_187(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_188(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_189(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_190(moom.lw a0) throws Throwable;
private static native moom.lw __call113_191(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_192(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_193(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_194(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_195(moom.lw a0) throws Throwable;
private static native moom.lw __call113_196(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call113_197(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native moom.lw __call113_198(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call113_199(moom.lw a0, int a1, int a2) throws Throwable;
private static native void __call113_200(moom.lw a0) throws Throwable;
private static native void __call113_201(moom.lw a0, java.lang.Object a1) throws Throwable;
private static native boolean __call113_202() throws Throwable;
private static native void __call113_203(moom.lw a0) throws Throwable;
private static native boolean __integerCategory113_204(int value) throws Throwable;
private static native boolean __call113_205() throws Throwable;
private static native void __call113_206(moom.lw a0) throws Throwable;
private static native boolean __integerCategory113_207(int value) throws Throwable;
private static native moom.Oo __call2011300_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011301_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011302_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011303_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011304_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011305_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011306_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011307_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011308_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011309_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011310_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011311_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011312_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011313_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011314_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call2011315_0(moom.Oo a0) throws Throwable;
private static native boolean __call2011316_0() throws Throwable;
private static native void __call2011316_1(moom.lw a0) throws Throwable;
private static native moom.Oo __call2011317_0(moom.Oo a0) throws Throwable;

}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1378;
      if (e[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = d[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/kJ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.BlockFluidRenderer.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10540_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/kJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a() {
java.lang.Object local1 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__n8();
    (this.a)[0] = ((net.minecraft.client.renderer.texture.TextureMap)(local1)).a(((java.lang.String)("minecraft:blocks/lava_still")));
    (this.a)[1] = ((net.minecraft.client.renderer.texture.TextureMap)(local1)).a(((java.lang.String)("minecraft:blocks/lava_flow")));
    (this.b)[0] = ((net.minecraft.client.renderer.texture.TextureMap)(local1)).a(((java.lang.String)("minecraft:blocks/water_still")));
    (this.b)[1] = ((net.minecraft.client.renderer.texture.TextureMap)(local1)).a(((java.lang.String)("minecraft:blocks/water_flow")));
    return;
}


private float a(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.fn p2) {
long life4_3;
    int life6_5;
    float life7_7;
    int life8_9;
    moom.DT life9_26;
    net.minecraft.block.state.IBlockState life10_42;
    moom.fn life11_46;
    int life12_67;
    lexical_join_88: {
    life4_3 = (net.minecraft.client.renderer.BlockFluidRenderer.c ^ 28321034773633L);
    life6_5 = 0;
    life7_7 = 0x0.0p0f;
    life8_9 = 0;
    lexical_cycle_10: while (true) {
    lexical_join_86: {
    lexical_join_80: {
    lexical_join_72: {
    lexical_join_57: {
    lexical_join_37: {
    if (!((life8_9 < 4))) {
        break lexical_join_88;
    }
    life9_26 = ((moom.DT)(p1)).a(((int)((-(life8_9 & 1)))), ((int)(0)), ((int)((-((life8_9 >> 1) & 1)))));
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(life9_26)).a__DT()))))).a__ch())).a__fn() == p2))) {
        break lexical_join_37;
    }
    return 0x1.0p0f;
    }
    life10_42 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life9_26)));
    life11_46 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life10_42)).a__ch())).a__fn();
    if (!((life11_46 != p2))) {
        break lexical_join_57;
    }
    if (!((!((moom.fn)(life11_46)).b__Boolean()))) {
        break lexical_join_86;
    }
    life7_7 = (life7_7 + 0x1.0p0f);
    life6_5 += 1;
    break lexical_join_86;
    }
    life12_67 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life10_42)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockLiquid.Q))))))).intValue();
    if (!((life12_67 < __sourceIntrinsic_0ae731f29a34_invokedynamic1491_14(14708, (8248060835458008128L ^ life4_3))))) {
        break lexical_join_72;
    }
    if (!((life12_67 == 0))) {
        break lexical_join_80;
    }
    }
    life7_7 = (life7_7 + (__sourceExactCall_47df7ec8ca7351(((int)(life12_67))) * 0x1.4p3f));
    life6_5 += 10;
    }
    life7_7 = (life7_7 + __sourceExactCall_47df7ec8ca7351(((int)(life12_67))));
    life6_5 += 1;
    }
    life8_9 += 1;
    continue lexical_cycle_10;
    }
    }
    return (0x1.0p0f - (life7_7 / ((float) life6_5)));
}


public boolean a(net.minecraft.world.IBlockAccess p0, net.minecraft.block.state.IBlockState p1, moom.DT p2, moom.lw p3) { return __sourceHandlerCall_e7f1ca65324743f11bc4(this, p0, p1, p2, p3); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10540_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0ae731f29a34_invokedynamic1491_14(int a0, long a1) throws E;

private static native float __sourceExactCall_47df7ec8ca7351(int p0);
}
