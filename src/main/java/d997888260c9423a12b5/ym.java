package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class ym extends moom.yj {

private static java.util.regex.Pattern b;

private static java.util.regex.Pattern c;

private static java.util.regex.Pattern d;

private static java.util.regex.Pattern e;

private static java.util.regex.Pattern f;

private static java.util.regex.Pattern g;

private static java.util.regex.Pattern h;

private static com.google.common.base.Splitter i;

protected java.lang.String j;

private static long k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

public ym(java.lang.String p0, java.lang.String p1) {
super();
    this.a = p0;
    this.j = p1;
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-7241309426152621516L)), ((long)(5146770902642806981L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(216207930254034L)))));
    long local11_life6 = (moom.ym.k ^ 118459236105959L);
    n = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1130_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1130_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1130_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1130_14 = new byte[8];
    (__sourceSpill1130_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1130_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1130_16 = __sourceSpill1130_14;
    ((javax.crypto.Cipher)(__sourceSpill1130_11)).init(((int)(__sourceSpill1130_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1130_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1130_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[3];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "/bµÑM¤Ç[Òäkµù\002\001aål-<Ï@¥"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1130_25 = local4_life21;
        int __sourceSpill1130_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1130_25)).substring(((int)(__sourceSpill1130_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1130_30 = local6_life19;
        int __sourceSpill1130_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1130_33 = new byte[8];
        (__sourceSpill1130_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1130_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1130_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1130_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1130_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1130_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1130_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1130_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1130_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1130_34)).doFinal(((byte[])(__sourceSpill1130_33)));
        (__sourceSpill1130_30)[__sourceSpill1130_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    l = ((long[])(local6_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[3]));
    b = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("[-+]?[0-9]*\\.?[0-9]+[d|D]")))));
    c = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("[-+]?[0-9]*\\.?[0-9]+[f|F]")))));
    d = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("[-+]?[0-9]+[b|B]")))));
    e = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("[-+]?[0-9]+[l|L]")))));
    f = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("[-+]?[0-9]+[s|S]")))));
    g = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("[-+]?[0-9]+")))));
    h = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("[-+]?[0-9]*\\.?[0-9]+")))));
    i = ((com.google.common.base.Splitter)(((com.google.common.base.Splitter)(com.google.common.base.Splitter.on(((char)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1130_53(16324, (7905622974014961914L ^ local11_life6))))))).omitEmptyStrings()));
}

private static native <E extends Throwable> net.minecraft.nbt.NBTBase __sourceHandlerCall_891aa488b6ae7d32e647(moom.ym a0) throws E;
private static final class __SourceHandler_891aa488b6ae7d32e647 {

public static net.minecraft.nbt.NBTBase f527(moom.ym receiver) throws Throwable {
    int forestValue527_33_0;
    int forestValue527_55_0;
    int forestValue527_77_0;
    int forestValue527_99_0;
    int forestValue527_121_0;
    int forestValue527_136_0;
    int forestValue527_150_0;
    int forestValue527_157_0;
    moom.yp forestValue527_166_0;
    moom.yp forestValue527_166_1;
    moom.yp forestValue527_167_0;
    moom.yp forestValue527_167_1;
    int forestValue527_167_2;
    int forestValue527_233_0;
    moom.ym forestValue527_253_0;
    int forestValue527_288_0;
    int forestValue527_288_1;
    int forestValue527_302_0;
    int forestValue527_302_1;
    boolean spill527_0;
    moom.yq spill527_1;
    moom.yr spill527_2;
    moom.yp spill527_3;
    moom.yt spill527_4;
    moom.yu spill527_5;
    moom.ys spill527_6;
    moom.yq spill527_7;
    moom.yp spill527_8;
    moom.yp spill527_9;
    boolean spill527_10;
    boolean spill527_11;
    moom.yy spill527_12;
    moom.ym spill527_13;
    moom.ym spill527_14;
    java.lang.StringBuilder spill527_15;
    int spill527_16;
    int spill527_17;
    moom.yA spill527_18;
    long life1_3;
    java.lang.String life3_5;
    java.lang.String life4_207;
    java.lang.String[] life5_214;
    int[] life6_218;
    int life7_220;
    java.lang.StringBuilder life4_280;
    int life5_282;
    forest_join_324: {
    forest_join_253: {
    forest_join_252: {
    forest_join_233: {
    forest_join_227: {
    forest_join_222: {
    forest_join_170: {
    forest_join_167: {
    forest_join_166: {
    forest_join_158: {
    forest_join_157: {
    forest_join_150: {
    forest_join_146: {
    forest_join_136: {
    forest_join_131: {
    forest_join_121: {
    forest_join_116: {
    forest_join_99: {
    forest_join_94: {
    forest_join_77: {
    forest_join_72: {
    forest_join_55: {
    forest_join_50: {
    forest_join_33: {
    forest_join_28: {
    life1_3 = (__fieldRead527_0() ^ 92598966083265L);
    life3_5 = __call527_1();
    spill527_0 = __call527_5(__call527_4(__fieldRead527_2(), __fieldRead527_3(receiver)));
    if (!((life3_5 == null))) {
        forestValue527_33_0 = __integerCategory527_6(spill527_0);
        break forest_join_33;
    }
    if (!(spill527_0)) {
        break forest_join_28;
    }
    moom.yq __stackOp527_8_0 = __sourceUninitializedNEW527_7();
    spill527_1 = __stackOp527_8_0;
    __explicitNewInit527_14(__stackOp527_8_0, __call527_13(__call527_12(__fieldRead527_9(receiver), 0, (__call527_11(__fieldRead527_10(receiver)) - 1))));
    return spill527_1;
    }
    forestValue527_33_0 = __integerCategory527_19(__call527_18(__call527_17(__fieldRead527_15(), __fieldRead527_16(receiver))));
    }
    if (!((life3_5 == null))) {
        forestValue527_55_0 = forestValue527_33_0;
        break forest_join_55;
    }
    if (!((forestValue527_33_0 != 0))) {
        break forest_join_50;
    }
    moom.yr __stackOp527_21_0 = __sourceUninitializedNEW527_20();
    spill527_2 = __stackOp527_21_0;
    __explicitNewInit527_27(__stackOp527_21_0, __call527_26(__call527_25(__fieldRead527_22(receiver), 0, (__call527_24(__fieldRead527_23(receiver)) - 1))));
    return spill527_2;
    }
    forestValue527_55_0 = __integerCategory527_32(__call527_31(__call527_30(__fieldRead527_28(), __fieldRead527_29(receiver))));
    }
    if (!((life3_5 == null))) {
        forestValue527_77_0 = forestValue527_55_0;
        break forest_join_77;
    }
    if (!((forestValue527_55_0 != 0))) {
        break forest_join_72;
    }
    moom.yp __stackOp527_34_0 = __sourceUninitializedNEW527_33();
    spill527_3 = __stackOp527_34_0;
    __explicitNewInit527_40(__stackOp527_34_0, __call527_39(__call527_38(__fieldRead527_35(receiver), 0, (__call527_37(__fieldRead527_36(receiver)) - 1))));
    return spill527_3;
    }
    forestValue527_77_0 = __integerCategory527_45(__call527_44(__call527_43(__fieldRead527_41(), __fieldRead527_42(receiver))));
    }
    if (!((life3_5 == null))) {
        forestValue527_99_0 = forestValue527_77_0;
        break forest_join_99;
    }
    if (!((forestValue527_77_0 != 0))) {
        break forest_join_94;
    }
    moom.yt __stackOp527_47_0 = __sourceUninitializedNEW527_46();
    spill527_4 = __stackOp527_47_0;
    __explicitNewInit527_53(__stackOp527_47_0, __call527_52(__call527_51(__fieldRead527_48(receiver), 0, (__call527_50(__fieldRead527_49(receiver)) - 1))));
    return spill527_4;
    }
    forestValue527_99_0 = __integerCategory527_58(__call527_57(__call527_56(__fieldRead527_54(), __fieldRead527_55(receiver))));
    }
    if (!((life3_5 == null))) {
        forestValue527_121_0 = forestValue527_99_0;
        break forest_join_121;
    }
    if (!((forestValue527_99_0 != 0))) {
        break forest_join_116;
    }
    moom.yu __stackOp527_60_0 = __sourceUninitializedNEW527_59();
    spill527_5 = __stackOp527_60_0;
    __explicitNewInit527_66(__stackOp527_60_0, __call527_65(__call527_64(__fieldRead527_61(receiver), 0, (__call527_63(__fieldRead527_62(receiver)) - 1))));
    return spill527_5;
    }
    forestValue527_121_0 = __integerCategory527_71(__call527_70(__call527_69(__fieldRead527_67(), __fieldRead527_68(receiver))));
    }
    if (!((life3_5 == null))) {
        forestValue527_136_0 = forestValue527_121_0;
        break forest_join_136;
    }
    if (!((forestValue527_121_0 != 0))) {
        break forest_join_131;
    }
    moom.ys __stackOp527_73_0 = __sourceUninitializedNEW527_72();
    spill527_6 = __stackOp527_73_0;
    __explicitNewInit527_76(__stackOp527_73_0, __call527_75(__fieldRead527_74(receiver)));
    return spill527_6;
    }
    forestValue527_136_0 = __integerCategory527_81(__call527_80(__call527_79(__fieldRead527_77(), __fieldRead527_78(receiver))));
    }
    if (!((life3_5 == null))) {
        forestValue527_150_0 = forestValue527_136_0;
        break forest_join_150;
    }
    if (!((forestValue527_136_0 != 0))) {
        break forest_join_146;
    }
    moom.yq __stackOp527_83_0 = __sourceUninitializedNEW527_82();
    spill527_7 = __stackOp527_83_0;
    __explicitNewInit527_86(__stackOp527_83_0, __call527_85(__fieldRead527_84(receiver)));
    return spill527_7;
    }
    forestValue527_150_0 = __integerCategory527_89(__call527_88(__fieldRead527_87(receiver), "true"));
    }
    if (!((life3_5 == null))) {
        forestValue527_157_0 = forestValue527_150_0;
        break forest_join_157;
    }
    if (!((forestValue527_150_0 == 0))) {
        break forest_join_158;
    }
    forestValue527_157_0 = __integerCategory527_92(__call527_91(__fieldRead527_90(receiver), "false"));
    }
    if (!((forestValue527_157_0 != 0))) {
        break forest_join_170;
    }
    }
    moom.yp __stackOp527_94_0 = __sourceUninitializedNEW527_93();
    spill527_8 = __stackOp527_94_0;
    spill527_9 = __stackOp527_94_0;
    if (!(__call527_96(__fieldRead527_95(receiver)))) {
        forestValue527_166_0 = spill527_8;
        forestValue527_166_1 = spill527_9;
        break forest_join_166;
    }
    forestValue527_167_0 = spill527_8;
    forestValue527_167_1 = spill527_9;
    forestValue527_167_2 = 1;
    break forest_join_167;
    }
    forestValue527_167_0 = forestValue527_166_0;
    forestValue527_167_1 = forestValue527_166_1;
    forestValue527_167_2 = 0;
    }
    __explicitNewInit527_97(forestValue527_167_1, ((byte) forestValue527_167_2));
    return forestValue527_167_0;
    }
    spill527_10 = __call527_99(__fieldRead527_98(receiver), "[");
    if (!((life3_5 == null))) {
        forestValue527_233_0 = __integerCategory527_100(spill527_10);
        break forest_join_233;
    }
    if (!(spill527_10)) {
        break forest_join_227;
    }
    spill527_11 = __call527_102(__fieldRead527_101(receiver), "]");
    if (!((life3_5 == null))) {
        forestValue527_233_0 = __integerCategory527_103(spill527_11);
        break forest_join_233;
    }
    if (!(spill527_11)) {
        break forest_join_227;
    }
    life4_207 = __call527_107(__fieldRead527_104(receiver), 1, (__call527_106(__fieldRead527_105(receiver)) - 1));
    life5_214 = __cast527_112(__call527_111(__call527_109(__fieldRead527_108(), life4_207), __classLiteral527_110()));
    life6_218 = new int[(life5_214).length];
    life7_220 = 0;
    forest_cycle_207: while (true) {
    if (!((life7_220 < (life5_214).length))) {
        break forest_join_222;
    }
    (life6_218)[life7_220] = __call527_114(__call527_113((life5_214)[life7_220]));
    life7_220 += 1;
    if (!((life3_5 != null))) {
        continue forest_cycle_207;
    }
    break forest_cycle_207;
    }
    }
    moom.yy __stackOp527_116_0 = __sourceUninitializedNEW527_115();
    spill527_12 = __stackOp527_116_0;
    __explicitNewInit527_117(__stackOp527_116_0, life6_218);
    return spill527_12;
    }
    spill527_13 = receiver;
    if (!((life3_5 == null))) {
        forestValue527_253_0 = spill527_13;
        break forest_join_253;
    }
    forestValue527_233_0 = __integerCategory527_120(__call527_119(__fieldRead527_118(spill527_13), "\""));
    }
    if (!((forestValue527_233_0 != 0))) {
        break forest_join_252;
    }
    spill527_14 = receiver;
    if (!((life3_5 == null))) {
        forestValue527_253_0 = spill527_14;
        break forest_join_253;
    }
    if (!(__call527_122(__fieldRead527_121(spill527_14), "\""))) {
        break forest_join_252;
    }
    __fieldWrite527_127(receiver, __call527_126(__fieldRead527_123(receiver), 1, (__call527_125(__fieldRead527_124(receiver)) - 1)));
    }
    forestValue527_253_0 = receiver;
    }
    __fieldWrite527_130(forestValue527_253_0, __call527_129(__fieldRead527_128(receiver), "\\\\\"", "\""));
    java.lang.StringBuilder __stackOp527_132_0 = __sourceUninitializedNEW527_131();
    spill527_15 = __stackOp527_132_0;
    __explicitNewInit527_133(__stackOp527_132_0);
    life4_280 = spill527_15;
    life5_282 = 0;
    forest_cycle_265: while (true) {
    forest_join_321: {
    forest_join_314: {
    forest_join_302: {
    forest_join_288: {
    if (!((life5_282 < __call527_135(__fieldRead527_134(receiver))))) {
        break forest_join_324;
    }
    spill527_16 = life5_282;
    spill527_17 = (__call527_137(__fieldRead527_136(receiver)) - 1);
    if (!((life3_5 == null))) {
        forestValue527_288_0 = spill527_16;
        forestValue527_288_1 = spill527_17;
        break forest_join_288;
    }
    if (!((spill527_16 < spill527_17))) {
        break forest_join_314;
    }
    forestValue527_288_0 = __integerCategory527_141(__call527_139(__fieldRead527_138(receiver), life5_282));
    forestValue527_288_1 = __invokedynamic527_140(24217, (6398265671501592963L ^ life1_3));
    }
    if (!((life3_5 == null))) {
        forestValue527_302_0 = forestValue527_288_0;
        forestValue527_302_1 = forestValue527_288_1;
        break forest_join_302;
    }
    if (!((forestValue527_288_0 == forestValue527_288_1))) {
        break forest_join_314;
    }
    forestValue527_302_0 = __integerCategory527_145(__call527_143(__fieldRead527_142(receiver), (life5_282 + 1)));
    forestValue527_302_1 = __invokedynamic527_144(17832, (6968945754084909747L ^ life1_3));
    }
    if (!((forestValue527_302_0 == forestValue527_302_1))) {
        break forest_join_314;
    }
    __call527_147(life4_280, __invokedynamic527_146(17832, (6968945754084909747L ^ life1_3)));
    life5_282 += 1;
    if (!((life3_5 != null))) {
        break forest_join_321;
    }
    }
    __call527_150(life4_280, __call527_149(__fieldRead527_148(receiver), life5_282));
    }
    life5_282 += 1;
    if (!((life3_5 != null))) {
        continue forest_cycle_265;
    }
    break forest_cycle_265;
    }
    }
    moom.yA __stackOp527_152_0 = __sourceUninitializedNEW527_151();
    spill527_18 = __stackOp527_152_0;
    __explicitNewInit527_154(__stackOp527_152_0, __call527_153(life4_280));
    return spill527_18;
}
public static net.minecraft.nbt.NBTBase h527_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052700_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052701_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052702_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052703_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052704_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052705_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052706_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052707_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_8(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052708_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_9(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052709_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_10(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052710_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_11(java.lang.NumberFormatException p0, moom.ym p1) throws Throwable {
    moom.yA spill3052711_0;
    java.lang.NumberFormatException life2_2;
    life2_2 = p0;
    __fieldWrite3052711_2(p1, __call3052711_1(__fieldRead3052711_0(p1), "\\\\\"", "\""));
    moom.yA __stackOp3052711_4_0 = __sourceUninitializedNEW3052711_3();
    spill3052711_0 = __stackOp3052711_4_0;
    __explicitNewInit3052711_6(__stackOp3052711_4_0, __fieldRead3052711_5(p1));
    return spill3052711_0;
}
public static net.minecraft.nbt.NBTBase h527_12(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052712_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_13(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052713_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_14(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052714_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_15(java.lang.NumberFormatException p0, moom.ym p1) throws Throwable {
    moom.yA spill3052715_0;
    java.lang.NumberFormatException life2_2;
    life2_2 = p0;
    moom.yA __stackOp3052715_1_0 = __sourceUninitializedNEW3052715_0();
    spill3052715_0 = __stackOp3052715_1_0;
    __explicitNewInit3052715_3(__stackOp3052715_1_0, __fieldRead3052715_2(p1));
    return spill3052715_0;
}
public static net.minecraft.nbt.NBTBase h527_16(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052716_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_17(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052717_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_18(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052718_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_19(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052719_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_20(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052720_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_21(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052721_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_22(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052722_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_23(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052723_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_24(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052724_0(p0);
}
public static net.minecraft.nbt.NBTBase h527_25(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3052725_0(p0);
}
private static native long __fieldRead527_0() throws Throwable;
private static native java.lang.String __call527_1() throws Throwable;
private static native java.util.regex.Pattern __fieldRead527_2() throws Throwable;
private static native java.lang.String __fieldRead527_3(moom.ym a0) throws Throwable;
private static native java.util.regex.Matcher __call527_4(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call527_5(java.util.regex.Matcher a0) throws Throwable;
private static native int __integerCategory527_6(boolean value) throws Throwable;
private static native moom.yq __sourceUninitializedNEW527_7() throws Throwable;
private static native java.lang.String __fieldRead527_9(moom.ym a0) throws Throwable;
private static native java.lang.String __fieldRead527_10(moom.ym a0) throws Throwable;
private static native int __call527_11(java.lang.String a0) throws Throwable;
private static native java.lang.String __call527_12(java.lang.String a0, int a1, int a2) throws Throwable;
private static native double __call527_13(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit527_14(moom.yq a0, double a1) throws Throwable;
private static native java.util.regex.Pattern __fieldRead527_15() throws Throwable;
private static native java.lang.String __fieldRead527_16(moom.ym a0) throws Throwable;
private static native java.util.regex.Matcher __call527_17(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call527_18(java.util.regex.Matcher a0) throws Throwable;
private static native int __integerCategory527_19(boolean value) throws Throwable;
private static native moom.yr __sourceUninitializedNEW527_20() throws Throwable;
private static native java.lang.String __fieldRead527_22(moom.ym a0) throws Throwable;
private static native java.lang.String __fieldRead527_23(moom.ym a0) throws Throwable;
private static native int __call527_24(java.lang.String a0) throws Throwable;
private static native java.lang.String __call527_25(java.lang.String a0, int a1, int a2) throws Throwable;
private static native float __call527_26(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit527_27(moom.yr a0, float a1) throws Throwable;
private static native java.util.regex.Pattern __fieldRead527_28() throws Throwable;
private static native java.lang.String __fieldRead527_29(moom.ym a0) throws Throwable;
private static native java.util.regex.Matcher __call527_30(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call527_31(java.util.regex.Matcher a0) throws Throwable;
private static native int __integerCategory527_32(boolean value) throws Throwable;
private static native moom.yp __sourceUninitializedNEW527_33() throws Throwable;
private static native java.lang.String __fieldRead527_35(moom.ym a0) throws Throwable;
private static native java.lang.String __fieldRead527_36(moom.ym a0) throws Throwable;
private static native int __call527_37(java.lang.String a0) throws Throwable;
private static native java.lang.String __call527_38(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte __call527_39(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit527_40(moom.yp a0, byte a1) throws Throwable;
private static native java.util.regex.Pattern __fieldRead527_41() throws Throwable;
private static native java.lang.String __fieldRead527_42(moom.ym a0) throws Throwable;
private static native java.util.regex.Matcher __call527_43(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call527_44(java.util.regex.Matcher a0) throws Throwable;
private static native int __integerCategory527_45(boolean value) throws Throwable;
private static native moom.yt __sourceUninitializedNEW527_46() throws Throwable;
private static native java.lang.String __fieldRead527_48(moom.ym a0) throws Throwable;
private static native java.lang.String __fieldRead527_49(moom.ym a0) throws Throwable;
private static native int __call527_50(java.lang.String a0) throws Throwable;
private static native java.lang.String __call527_51(java.lang.String a0, int a1, int a2) throws Throwable;
private static native long __call527_52(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit527_53(moom.yt a0, long a1) throws Throwable;
private static native java.util.regex.Pattern __fieldRead527_54() throws Throwable;
private static native java.lang.String __fieldRead527_55(moom.ym a0) throws Throwable;
private static native java.util.regex.Matcher __call527_56(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call527_57(java.util.regex.Matcher a0) throws Throwable;
private static native int __integerCategory527_58(boolean value) throws Throwable;
private static native moom.yu __sourceUninitializedNEW527_59() throws Throwable;
private static native java.lang.String __fieldRead527_61(moom.ym a0) throws Throwable;
private static native java.lang.String __fieldRead527_62(moom.ym a0) throws Throwable;
private static native int __call527_63(java.lang.String a0) throws Throwable;
private static native java.lang.String __call527_64(java.lang.String a0, int a1, int a2) throws Throwable;
private static native short __call527_65(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit527_66(moom.yu a0, short a1) throws Throwable;
private static native java.util.regex.Pattern __fieldRead527_67() throws Throwable;
private static native java.lang.String __fieldRead527_68(moom.ym a0) throws Throwable;
private static native java.util.regex.Matcher __call527_69(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call527_70(java.util.regex.Matcher a0) throws Throwable;
private static native int __integerCategory527_71(boolean value) throws Throwable;
private static native moom.ys __sourceUninitializedNEW527_72() throws Throwable;
private static native java.lang.String __fieldRead527_74(moom.ym a0) throws Throwable;
private static native int __call527_75(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit527_76(moom.ys a0, int a1) throws Throwable;
private static native java.util.regex.Pattern __fieldRead527_77() throws Throwable;
private static native java.lang.String __fieldRead527_78(moom.ym a0) throws Throwable;
private static native java.util.regex.Matcher __call527_79(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call527_80(java.util.regex.Matcher a0) throws Throwable;
private static native int __integerCategory527_81(boolean value) throws Throwable;
private static native moom.yq __sourceUninitializedNEW527_82() throws Throwable;
private static native java.lang.String __fieldRead527_84(moom.ym a0) throws Throwable;
private static native double __call527_85(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit527_86(moom.yq a0, double a1) throws Throwable;
private static native java.lang.String __fieldRead527_87(moom.ym a0) throws Throwable;
private static native boolean __call527_88(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory527_89(boolean value) throws Throwable;
private static native java.lang.String __fieldRead527_90(moom.ym a0) throws Throwable;
private static native boolean __call527_91(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory527_92(boolean value) throws Throwable;
private static native moom.yp __sourceUninitializedNEW527_93() throws Throwable;
private static native java.lang.String __fieldRead527_95(moom.ym a0) throws Throwable;
private static native boolean __call527_96(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit527_97(moom.yp a0, byte a1) throws Throwable;
private static native java.lang.String __fieldRead527_98(moom.ym a0) throws Throwable;
private static native boolean __call527_99(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory527_100(boolean value) throws Throwable;
private static native java.lang.String __fieldRead527_101(moom.ym a0) throws Throwable;
private static native boolean __call527_102(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory527_103(boolean value) throws Throwable;
private static native java.lang.String __fieldRead527_104(moom.ym a0) throws Throwable;
private static native java.lang.String __fieldRead527_105(moom.ym a0) throws Throwable;
private static native int __call527_106(java.lang.String a0) throws Throwable;
private static native java.lang.String __call527_107(java.lang.String a0, int a1, int a2) throws Throwable;
private static native com.google.common.base.Splitter __fieldRead527_108() throws Throwable;
private static native java.lang.Iterable __call527_109(com.google.common.base.Splitter a0, java.lang.String a1) throws Throwable;
private static native java.lang.Class __classLiteral527_110() throws Throwable;
private static native java.lang.Object[] __call527_111(java.lang.Iterable a0, java.lang.Class a1) throws Throwable;
private static native java.lang.String[] __cast527_112(java.lang.Object[] a0) throws Throwable;
private static native java.lang.String __call527_113(java.lang.String a0) throws Throwable;
private static native int __call527_114(java.lang.String a0) throws Throwable;
private static native moom.yy __sourceUninitializedNEW527_115() throws Throwable;
private static native void __explicitNewInit527_117(moom.yy a0, int[] a1) throws Throwable;
private static native java.lang.String __fieldRead527_118(moom.ym a0) throws Throwable;
private static native boolean __call527_119(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory527_120(boolean value) throws Throwable;
private static native java.lang.String __fieldRead527_121(moom.ym a0) throws Throwable;
private static native boolean __call527_122(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead527_123(moom.ym a0) throws Throwable;
private static native java.lang.String __fieldRead527_124(moom.ym a0) throws Throwable;
private static native int __call527_125(java.lang.String a0) throws Throwable;
private static native java.lang.String __call527_126(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __fieldWrite527_127(moom.ym a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead527_128(moom.ym a0) throws Throwable;
private static native java.lang.String __call527_129(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __fieldWrite527_130(moom.ym a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __sourceUninitializedNEW527_131() throws Throwable;
private static native void __explicitNewInit527_133(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.String __fieldRead527_134(moom.ym a0) throws Throwable;
private static native int __call527_135(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead527_136(moom.ym a0) throws Throwable;
private static native int __call527_137(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead527_138(moom.ym a0) throws Throwable;
private static native char __call527_139(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic527_140(int a0, long a1) throws Throwable;
private static native int __integerCategory527_141(char value) throws Throwable;
private static native java.lang.String __fieldRead527_142(moom.ym a0) throws Throwable;
private static native char __call527_143(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic527_144(int a0, long a1) throws Throwable;
private static native int __integerCategory527_145(char value) throws Throwable;
private static native int __invokedynamic527_146(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call527_147(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.String __fieldRead527_148(moom.ym a0) throws Throwable;
private static native char __call527_149(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.StringBuilder __call527_150(java.lang.StringBuilder a0, char a1) throws Throwable;
private static native moom.yA __sourceUninitializedNEW527_151() throws Throwable;
private static native java.lang.String __call527_153(java.lang.StringBuilder a0) throws Throwable;
private static native void __explicitNewInit527_154(moom.yA a0, java.lang.String a1) throws Throwable;
private static native java.lang.NumberFormatException __call3052700_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052701_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052702_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052703_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052704_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052705_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052706_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052707_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052708_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052709_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052710_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.String __fieldRead3052711_0(moom.ym a0) throws Throwable;
private static native java.lang.String __call3052711_1(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __fieldWrite3052711_2(moom.ym a0, java.lang.String a1) throws Throwable;
private static native moom.yA __sourceUninitializedNEW3052711_3() throws Throwable;
private static native java.lang.String __fieldRead3052711_5(moom.ym a0) throws Throwable;
private static native void __explicitNewInit3052711_6(moom.yA a0, java.lang.String a1) throws Throwable;
private static native java.lang.NumberFormatException __call3052712_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052713_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052714_0(java.lang.NumberFormatException a0) throws Throwable;
private static native moom.yA __sourceUninitializedNEW3052715_0() throws Throwable;
private static native java.lang.String __fieldRead3052715_2(moom.ym a0) throws Throwable;
private static native void __explicitNewInit3052715_3(moom.yA a0, java.lang.String a1) throws Throwable;
private static native java.lang.NumberFormatException __call3052716_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052717_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052718_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052719_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052720_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052721_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052722_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052723_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052724_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3052725_0(java.lang.NumberFormatException a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9842_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ym"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ym.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8639;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ym", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static java.lang.NumberFormatException a(java.lang.NumberFormatException p0) {
return p0;
}


public net.minecraft.nbt.NBTBase a() throws net.minecraft.nbt.NBTException { return __sourceHandlerCall_891aa488b6ae7d32e647(this); }


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1130_53(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9842_0() throws E;
}
