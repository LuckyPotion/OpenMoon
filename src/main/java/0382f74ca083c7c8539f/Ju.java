package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ju {

private static net.minecraft.client.Minecraft a;

private static moom.jJ b;

private static moom.Js[][] c;

public static boolean d;

private static long e;

private static java.lang.String[] f;

private static java.lang.String[] g;

private static java.util.Map h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public Ju() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-434103114624726471L)), ((long)(2421224276370527684L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(223167386104134L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Ju.e ^ 15891552509127L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill614_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill614_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill614_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill614_14 = new byte[8];
    (__sourceSpill614_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill614_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation614_16 = __sourceSpill614_14;
    ((javax.crypto.Cipher)(__sourceSpill614_11)).init(((int)(__sourceSpill614_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill614_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation614_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[9];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "E¶_½ø\"¿Ý\017Zq§/[-r{N\n\017\"x|\034é°D~0ðëw\035óÄ.¾bê?(lg\026÷,\në\tfApEFyßýø\016í+QzÖÌ\032)\006ä:Yç£\\ þ\0017\177ú\ty«¿5Á!0Ç\021\032`­e\006Ù`ãî¡F k)ÿ½ ÙR¦¼[Ã¦¦\026:Ç\003b.\006®öé±Ô=\022\030^P`\t\036l\0132ÆU)x?\n¸P®VµB2 ¸»\nZZu£÷$°-RMN3\026ZÀ öÚyqC.ô9b0è\027\rB+bðå¿\016(Å}9sá\024L%èQÖ$yà«!P¬\001\rr3ó1¡"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill614_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill614_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill614_29)).doFinal(((byte[])(__sourceSpill614_28)));
        java.lang.String __sourceSpill614_34 = ((java.lang.String)(moom.Ju.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill614_35 = local20_life19;
        int __sourceSpill614_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill614_35)[__sourceSpill614_36] = __sourceSpill614_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "2¥EbP\027C9Ñê\024,¡úÆ\006gXÇÁx\033¸âZ>A\007³û\177\030\f\"(\022\033'g\tS\027\177+Ù~\032I6,2l°wÐD$twê5\007õ\025u Â\\Þ"))).length();
    local16_life24 = 40;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill614_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill614_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill614_42)).doFinal(((byte[])(__sourceSpill614_41)));
        java.lang.String __sourceSpill614_47 = ((java.lang.String)(moom.Ju.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill614_48 = local20_life19;
        int __sourceSpill614_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill614_48)[__sourceSpill614_49] = __sourceSpill614_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    f = ((java.lang.String[])(local20_life19));
    g = ((java.lang.String[])(new java.lang.String[9]));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill614_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill614_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill614_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill614_60 = new byte[8];
    (__sourceSpill614_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill614_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation614_62 = __sourceSpill614_60;
    ((javax.crypto.Cipher)(__sourceSpill614_57)).init(((int)(__sourceSpill614_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill614_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation614_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[3];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "\"m#û,pbV7 50ªõ[û|Tf("))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill614_71 = local4_life67;
        int __sourceSpill614_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill614_71)).substring(((int)(__sourceSpill614_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill614_76 = local6_life65;
        int __sourceSpill614_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill614_79 = new byte[8];
        (__sourceSpill614_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill614_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill614_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill614_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill614_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill614_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill614_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill614_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill614_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill614_80)).doFinal(((byte[])(__sourceSpill614_79)));
        (__sourceSpill614_76)[__sourceSpill614_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    i = ((long[])(local6_life65));
    j = ((java.lang.Integer[])(new java.lang.Integer[3]));
    a = ((net.minecraft.client.Minecraft)(moom.BU.a__fM()));
    b = ((moom.jJ)(null));
    c = ((moom.Js[][])(null));
    d = ((boolean)(moom.Ju.a__Boolean()));
}

private static native <E extends Throwable> moom.Js[][] __sourceHandlerCall_ba39130b9946c63d2afb(java.util.List a0) throws E;
private static final class __SourceHandler_ba39130b9946c63d2afb {

public static moom.Js[][] f764(java.util.List p0) throws Throwable {
    int lexicalValue764_15_0;
    java.util.List lexicalValue764_33_0;
    boolean spill764_0;
    java.util.List spill764_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    moom.Js[][] life4_21;
    int life5_23;
    java.util.List life6_44;
    moom.Js[] life7_57;
    lexical_join_51: {
    lexical_join_15: {
    lexical_join_13: {
    life1_3 = (__fieldRead764_0() ^ 135874286422803L);
    life3_5 = __call764_1();
    spill764_0 = __call764_2(p0);
    if (!((life3_5 != null))) {
        lexicalValue764_15_0 = __integerCategory764_3(spill764_0);
        break lexical_join_15;
    }
    if (!(spill764_0)) {
        break lexical_join_13;
    }
    return null;
    }
    lexicalValue764_15_0 = (__fieldRead764_4()).length;
    }
    life4_21 = new moom.Js[lexicalValue764_15_0][];
    life5_23 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_49: {
    lexical_join_48: {
    lexical_join_33: {
    if (!((life5_23 < (life4_21).length))) {
        break lexical_join_51;
    }
    spill764_1 = p0;
    if (!((life3_5 != null))) {
        lexicalValue764_33_0 = spill764_1;
        break lexical_join_33;
    }
    if (!((__call764_5(spill764_1) > life5_23))) {
        break lexical_join_48;
    }
    lexicalValue764_33_0 = __cast764_7(__call764_6(p0, life5_23));
    }
    life6_44 = lexicalValue764_33_0;
    if (!((life3_5 != null))) {
        break lexical_join_49;
    }
    if (!((life6_44 != null))) {
        break lexical_join_48;
    }
    life7_57 = __cast764_9(__call764_8(life6_44, new moom.Js[0]));
    (life4_21)[life5_23] = life7_57;
    }
    life5_23 += 1;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return life4_21;
}
public static void h764_0(moom.Oo p0) throws Throwable {
    throw __call1076400_0(p0);
}
public static void h764_1(moom.Oo p0) throws Throwable {
    throw __call1076401_0(p0);
}
public static void h764_2(moom.Oo p0) throws Throwable {
    throw __call1076402_0(p0);
}
public static void h764_3(moom.Oo p0) throws Throwable {
    throw __call1076403_0(p0);
}
public static void h764_4(moom.Oo p0) throws Throwable {
    throw __call1076404_0(p0);
}
private static native long __fieldRead764_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call764_1() throws Throwable;
private static native boolean __call764_2(java.util.List a0) throws Throwable;
private static native int __integerCategory764_3(boolean value) throws Throwable;
private static native moom.bM[] __fieldRead764_4() throws Throwable;
private static native int __call764_5(java.util.List a0) throws Throwable;
private static native java.lang.Object __call764_6(java.util.List a0, int a1) throws Throwable;
private static native java.util.List __cast764_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Object[] __call764_8(java.util.List a0, moom.Js[] a1) throws Throwable;
private static native moom.Js[] __cast764_9(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Exception __call1076400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076404_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_987fc7587860123d66d2(moom.DD a0) throws E;
private static final class __SourceHandler_987fc7587860123d66d2 {

public static moom.DD f765(moom.DD p0) throws Throwable {
    int forwardValue765_30_0;
    int forwardValue765_69_0;
    int forwardValue765_98_0;
    int forwardValue765_110_0;
    int forwardValue765_122_0;
    int forwardValue765_134_0;
    int forwardValue765_146_0;
    int forwardValue765_158_0;
    int forwardValue765_170_0;
    int forwardValue765_182_0;
    int forwardValue765_208_0;
    moom.DD forwardValue765_218_0;
    int spill765_0;
    moom.DD spill765_1;
    moom.DD spill765_2;
    int spill765_3;
    int spill765_4;
    int spill765_5;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.client.gui.GuiScreen life4_14;
    net.minecraft.client.multiplayer.WorldClient life5_69;
    moom.DT life6_111;
    net.minecraft.entity.Entity life7_267;
    forward_join_218: {
    forward_join_217: {
    forward_join_215: {
    forward_join_208: {
    forward_join_206: {
    forward_join_190: {
    forward_join_182: {
    forward_join_180: {
    forward_join_170: {
    forward_join_168: {
    forward_join_158: {
    forward_join_156: {
    forward_join_146: {
    forward_join_144: {
    forward_join_134: {
    forward_join_132: {
    forward_join_122: {
    forward_join_120: {
    forward_join_110: {
    forward_join_108: {
    forward_join_98: {
    forward_join_96: {
    forward_join_79: {
    forward_join_69: {
    forward_join_67: {
    forward_join_53: {
    forward_join_46: {
    forward_join_30: {
    forward_join_20: {
    forward_join_10: {
    life1_3 = (__fieldRead765_0() ^ 66358185005700L);
    life3_5 = __call765_1();
    if (!((__fieldRead765_2() == null))) {
        break forward_join_10;
    }
    return p0;
    }
    life4_14 = __fieldRead765_4(__fieldRead765_3());
    spill765_0 = __instanceOf765_5(life4_14);
    if (!((life3_5 != null))) {
        forwardValue765_30_0 = spill765_0;
        break forward_join_30;
    }
    if (!((spill765_0 == 0))) {
        break forward_join_20;
    }
    return p0;
    }
    spill765_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue765_218_0 = spill765_1;
        break forward_join_218;
    }
    forwardValue765_30_0 = __integerCategory765_9(__call765_8(__call765_6(spill765_1), __invokedynamic765_7(22227, (4413265395970521937L ^ life1_3))));
    }
    if (!((forwardValue765_30_0 != 0))) {
        break forward_join_217;
    }
    spill765_2 = p0;
    if (!((life3_5 != null))) {
        forwardValue765_218_0 = spill765_2;
        break forward_join_218;
    }
    if (!(__call765_12(__call765_10(spill765_2), __invokedynamic765_11(12385, (9061328559303581156L ^ life1_3))))) {
        break forward_join_217;
    }
    if (!((__fieldRead765_13() == null))) {
        break forward_join_46;
    }
    return p0;
    }
    life5_69 = __fieldRead765_15(__fieldRead765_14());
    if (!((life5_69 == null))) {
        break forward_join_53;
    }
    return p0;
    }
    spill765_3 = __instanceOf765_16(life4_14);
    if (!((life3_5 != null))) {
        forwardValue765_69_0 = spill765_3;
        break forward_join_69;
    }
    if (!((spill765_3 != 0))) {
        break forward_join_67;
    }
    return __call765_21(__fieldRead765_17(), __call765_20(__fieldRead765_19(__fieldRead765_18())), life5_69, p0, life4_14);
    }
    forwardValue765_69_0 = __instanceOf765_22(life4_14);
    }
    if (!((forwardValue765_69_0 != 0))) {
        break forward_join_79;
    }
    return __call765_27(__fieldRead765_23(), __call765_26(__fieldRead765_25(__fieldRead765_24())), life5_69, p0, life4_14);
    }
    life6_111 = __call765_29(__fieldRead765_28());
    if (!((life6_111 != null))) {
        break forward_join_190;
    }
    spill765_4 = __instanceOf765_30(life4_14);
    if (!((life3_5 != null))) {
        forwardValue765_98_0 = spill765_4;
        break forward_join_98;
    }
    if (!((spill765_4 != 0))) {
        break forward_join_96;
    }
    return __call765_32(__fieldRead765_31(), life6_111, life5_69, p0, life4_14);
    }
    forwardValue765_98_0 = __instanceOf765_33(life4_14);
    }
    if (!((life3_5 != null))) {
        forwardValue765_110_0 = forwardValue765_98_0;
        break forward_join_110;
    }
    if (!((forwardValue765_98_0 != 0))) {
        break forward_join_108;
    }
    return __call765_35(__fieldRead765_34(), life6_111, life5_69, p0, life4_14);
    }
    forwardValue765_110_0 = __instanceOf765_36(life4_14);
    }
    if (!((life3_5 != null))) {
        forwardValue765_122_0 = forwardValue765_110_0;
        break forward_join_122;
    }
    if (!((forwardValue765_110_0 != 0))) {
        break forward_join_120;
    }
    return __call765_38(__fieldRead765_37(), life6_111, life5_69, p0, life4_14);
    }
    forwardValue765_122_0 = __instanceOf765_39(life4_14);
    }
    if (!((life3_5 != null))) {
        forwardValue765_134_0 = forwardValue765_122_0;
        break forward_join_134;
    }
    if (!((forwardValue765_122_0 != 0))) {
        break forward_join_132;
    }
    return __call765_41(__fieldRead765_40(), life6_111, life5_69, p0, life4_14);
    }
    forwardValue765_134_0 = __instanceOf765_42(life4_14);
    }
    if (!((life3_5 != null))) {
        forwardValue765_146_0 = forwardValue765_134_0;
        break forward_join_146;
    }
    if (!((forwardValue765_134_0 != 0))) {
        break forward_join_144;
    }
    return __call765_44(__fieldRead765_43(), life6_111, life5_69, p0, life4_14);
    }
    forwardValue765_146_0 = __instanceOf765_45(life4_14);
    }
    if (!((life3_5 != null))) {
        forwardValue765_158_0 = forwardValue765_146_0;
        break forward_join_158;
    }
    if (!((forwardValue765_146_0 != 0))) {
        break forward_join_156;
    }
    return __call765_47(__fieldRead765_46(), life6_111, life5_69, p0, life4_14);
    }
    forwardValue765_158_0 = __instanceOf765_48(life4_14);
    }
    if (!((life3_5 != null))) {
        forwardValue765_170_0 = forwardValue765_158_0;
        break forward_join_170;
    }
    if (!((forwardValue765_158_0 != 0))) {
        break forward_join_168;
    }
    return __call765_50(__fieldRead765_49(), life6_111, life5_69, p0, life4_14);
    }
    forwardValue765_170_0 = __instanceOf765_51(life4_14);
    }
    if (!((life3_5 != null))) {
        forwardValue765_182_0 = forwardValue765_170_0;
        break forward_join_182;
    }
    if (!((forwardValue765_170_0 != 0))) {
        break forward_join_180;
    }
    return __call765_53(__fieldRead765_52(), life6_111, life5_69, p0, life4_14);
    }
    forwardValue765_182_0 = __instanceOf765_54(life4_14);
    }
    if (!((forwardValue765_182_0 != 0))) {
        break forward_join_190;
    }
    return __call765_56(__fieldRead765_55(), life6_111, life5_69, p0, life4_14);
    }
    life7_267 = __call765_58(__fieldRead765_57());
    if (!((life7_267 != null))) {
        break forward_join_215;
    }
    spill765_5 = __instanceOf765_59(life4_14);
    if (!((life3_5 != null))) {
        forwardValue765_208_0 = spill765_5;
        break forward_join_208;
    }
    if (!((spill765_5 != 0))) {
        break forward_join_206;
    }
    return __call765_61(__fieldRead765_60(), life7_267, life5_69, p0);
    }
    forwardValue765_208_0 = __instanceOf765_62(life4_14);
    }
    if (!((forwardValue765_208_0 != 0))) {
        break forward_join_215;
    }
    return __call765_64(__fieldRead765_63(), life7_267, life5_69, p0);
    }
    return p0;
    }
    forwardValue765_218_0 = p0;
    }
    return forwardValue765_218_0;
}
public static void h765_0(moom.Oo p0) throws Throwable {
    throw __call1076500_0(p0);
}
public static void h765_1(moom.Oo p0) throws Throwable {
    throw __call1076501_0(p0);
}
public static void h765_2(moom.Oo p0) throws Throwable {
    throw __call1076502_0(p0);
}
public static void h765_3(moom.Oo p0) throws Throwable {
    throw __call1076503_0(p0);
}
public static void h765_4(moom.Oo p0) throws Throwable {
    throw __call1076504_0(p0);
}
public static void h765_5(moom.Oo p0) throws Throwable {
    throw __call1076505_0(p0);
}
public static void h765_6(moom.Oo p0) throws Throwable {
    throw __call1076506_0(p0);
}
public static void h765_7(moom.Oo p0) throws Throwable {
    throw __call1076507_0(p0);
}
public static void h765_8(moom.Oo p0) throws Throwable {
    throw __call1076508_0(p0);
}
public static void h765_9(moom.Oo p0) throws Throwable {
    throw __call1076509_0(p0);
}
public static void h765_10(moom.Oo p0) throws Throwable {
    throw __call1076510_0(p0);
}
public static void h765_11(moom.Oo p0) throws Throwable {
    throw __call1076511_0(p0);
}
public static void h765_12(moom.Oo p0) throws Throwable {
    throw __call1076512_0(p0);
}
public static void h765_13(moom.Oo p0) throws Throwable {
    throw __call1076513_0(p0);
}
public static void h765_14(moom.Oo p0) throws Throwable {
    throw __call1076514_0(p0);
}
public static void h765_15(moom.Oo p0) throws Throwable {
    throw __call1076515_0(p0);
}
public static void h765_16(moom.Oo p0) throws Throwable {
    throw __call1076516_0(p0);
}
public static void h765_17(moom.Oo p0) throws Throwable {
    throw __call1076517_0(p0);
}
public static void h765_18(moom.Oo p0) throws Throwable {
    throw __call1076518_0(p0);
}
public static void h765_19(moom.Oo p0) throws Throwable {
    throw __call1076519_0(p0);
}
public static void h765_20(moom.Oo p0) throws Throwable {
    throw __call1076520_0(p0);
}
public static void h765_21(moom.Oo p0) throws Throwable {
    throw __call1076521_0(p0);
}
public static void h765_22(moom.Oo p0) throws Throwable {
    throw __call1076522_0(p0);
}
public static void h765_23(moom.Oo p0) throws Throwable {
    throw __call1076523_0(p0);
}
public static void h765_24(moom.Oo p0) throws Throwable {
    throw __call1076524_0(p0);
}
public static void h765_25(moom.Oo p0) throws Throwable {
    throw __call1076525_0(p0);
}
public static void h765_26(moom.Oo p0) throws Throwable {
    throw __call1076526_0(p0);
}
public static void h765_27(moom.Oo p0) throws Throwable {
    throw __call1076527_0(p0);
}
public static void h765_28(moom.Oo p0) throws Throwable {
    throw __call1076528_0(p0);
}
public static void h765_29(moom.Oo p0) throws Throwable {
    throw __call1076529_0(p0);
}
public static void h765_30(moom.Oo p0) throws Throwable {
    throw __call1076530_0(p0);
}
public static void h765_31(moom.Oo p0) throws Throwable {
    throw __call1076531_0(p0);
}
public static void h765_32(moom.Oo p0) throws Throwable {
    throw __call1076532_0(p0);
}
public static void h765_33(moom.Oo p0) throws Throwable {
    throw __call1076533_0(p0);
}
private static native long __fieldRead765_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call765_1() throws Throwable;
private static native moom.Js[][] __fieldRead765_2() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead765_3() throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead765_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf765_5(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native java.lang.String __call765_6(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic765_7(int a0, long a1) throws Throwable;
private static native boolean __call765_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory765_9(boolean value) throws Throwable;
private static native java.lang.String __call765_10(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic765_11(int a0, long a1) throws Throwable;
private static native boolean __call765_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.jJ __fieldRead765_13() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead765_14() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead765_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf765_16(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.bM __fieldRead765_17() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead765_18() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead765_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DT __call765_20(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.DD __call765_21(moom.bM a0, moom.DT a1, net.minecraft.client.multiplayer.WorldClient a2, moom.DD a3, net.minecraft.client.gui.GuiScreen a4) throws Throwable;
private static native int __instanceOf765_22(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.bM __fieldRead765_23() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead765_24() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead765_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DT __call765_26(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.DD __call765_27(moom.bM a0, moom.DT a1, net.minecraft.client.multiplayer.WorldClient a2, moom.DD a3, net.minecraft.client.gui.GuiScreen a4) throws Throwable;
private static native moom.jJ __fieldRead765_28() throws Throwable;
private static native moom.DT __call765_29(moom.jJ a0) throws Throwable;
private static native int __instanceOf765_30(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.bM __fieldRead765_31() throws Throwable;
private static native moom.DD __call765_32(moom.bM a0, moom.DT a1, net.minecraft.client.multiplayer.WorldClient a2, moom.DD a3, net.minecraft.client.gui.GuiScreen a4) throws Throwable;
private static native int __instanceOf765_33(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.bM __fieldRead765_34() throws Throwable;
private static native moom.DD __call765_35(moom.bM a0, moom.DT a1, net.minecraft.client.multiplayer.WorldClient a2, moom.DD a3, net.minecraft.client.gui.GuiScreen a4) throws Throwable;
private static native int __instanceOf765_36(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.bM __fieldRead765_37() throws Throwable;
private static native moom.DD __call765_38(moom.bM a0, moom.DT a1, net.minecraft.client.multiplayer.WorldClient a2, moom.DD a3, net.minecraft.client.gui.GuiScreen a4) throws Throwable;
private static native int __instanceOf765_39(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.bM __fieldRead765_40() throws Throwable;
private static native moom.DD __call765_41(moom.bM a0, moom.DT a1, net.minecraft.client.multiplayer.WorldClient a2, moom.DD a3, net.minecraft.client.gui.GuiScreen a4) throws Throwable;
private static native int __instanceOf765_42(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.bM __fieldRead765_43() throws Throwable;
private static native moom.DD __call765_44(moom.bM a0, moom.DT a1, net.minecraft.client.multiplayer.WorldClient a2, moom.DD a3, net.minecraft.client.gui.GuiScreen a4) throws Throwable;
private static native int __instanceOf765_45(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.bM __fieldRead765_46() throws Throwable;
private static native moom.DD __call765_47(moom.bM a0, moom.DT a1, net.minecraft.client.multiplayer.WorldClient a2, moom.DD a3, net.minecraft.client.gui.GuiScreen a4) throws Throwable;
private static native int __instanceOf765_48(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.bM __fieldRead765_49() throws Throwable;
private static native moom.DD __call765_50(moom.bM a0, moom.DT a1, net.minecraft.client.multiplayer.WorldClient a2, moom.DD a3, net.minecraft.client.gui.GuiScreen a4) throws Throwable;
private static native int __instanceOf765_51(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.bM __fieldRead765_52() throws Throwable;
private static native moom.DD __call765_53(moom.bM a0, moom.DT a1, net.minecraft.client.multiplayer.WorldClient a2, moom.DD a3, net.minecraft.client.gui.GuiScreen a4) throws Throwable;
private static native int __instanceOf765_54(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.bM __fieldRead765_55() throws Throwable;
private static native moom.DD __call765_56(moom.bM a0, moom.DT a1, net.minecraft.client.multiplayer.WorldClient a2, moom.DD a3, net.minecraft.client.gui.GuiScreen a4) throws Throwable;
private static native moom.jJ __fieldRead765_57() throws Throwable;
private static native net.minecraft.entity.Entity __call765_58(moom.jJ a0) throws Throwable;
private static native int __instanceOf765_59(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.bM __fieldRead765_60() throws Throwable;
private static native moom.DD __call765_61(moom.bM a0, net.minecraft.entity.Entity a1, net.minecraft.client.multiplayer.WorldClient a2, moom.DD a3) throws Throwable;
private static native int __instanceOf765_62(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native moom.bM __fieldRead765_63() throws Throwable;
private static native moom.DD __call765_64(moom.bM a0, net.minecraft.entity.Entity a1, net.minecraft.client.multiplayer.WorldClient a2, moom.DD a3) throws Throwable;
private static native java.lang.Exception __call1076500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076507_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076508_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076509_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076510_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076511_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076512_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076513_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076514_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076515_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076516_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076517_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076518_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076519_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076520_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076521_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076522_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076523_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076524_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076525_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076526_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076527_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076528_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076529_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076530_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076531_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076532_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076533_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_67a7b8f7e73361191d99(moom.Js a0, java.util.List a1) throws E;
private static final class __SourceHandler_67a7b8f7e73361191d99 {

public static void f41(moom.Js p0, java.util.List p1) throws Throwable {
    moom.bM forestValue41_25_0;
    java.util.List forestValue41_58_0;
    moom.bM spill41_0;
    java.util.List spill41_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_32;
    java.util.List life6_54;
    forest_join_61: {
    forest_join_58: {
    forest_join_57: {
    forest_join_39: {
    forest_join_25: {
    forest_join_23: {
    life2_3 = (__fieldRead41_0() ^ 112816605360242L);
    life4_5 = __call41_1();
    spill41_0 = __call41_2(p0);
    if (!((life4_5 != null))) {
        forestValue41_25_0 = spill41_0;
        break forest_join_25;
    }
    if (!((spill41_0 == null))) {
        break forest_join_23;
    }
    moom.bM __stackOp41_5_0 = __call41_3(p0);
    java.lang.String __stackOp41_5_1 = __invokedynamic41_4(10090, (818846827408074780L ^ life2_3));
    __call41_7(__invokedynamic41_6(__stackOp41_5_1, __stackOp41_5_0));
    if (!((life4_5 == null))) {
        break forest_join_61;
    }
    }
    forestValue41_25_0 = __call41_8(p0);
    }
    life5_32 = __call41_9(forestValue41_25_0);
    forest_cycle_27: while (true) {
    if (!((__call41_10(p1) <= life5_32))) {
        break forest_join_39;
    }
    __call41_11(p1, null);
    if (!((life4_5 != null))) {
        break forest_join_61;
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_27;
    }
    break forest_cycle_27;
    }
    }
    life6_54 = __cast41_13(__call41_12(p1, life5_32));
    spill41_1 = life6_54;
    if (!((life4_5 != null))) {
        forestValue41_58_0 = spill41_1;
        break forest_join_58;
    }
    if (!((spill41_1 == null))) {
        break forest_join_57;
    }
    life6_54 = new java.util.ArrayList();
    __call41_14(p1, life5_32, life6_54);
    }
    forestValue41_58_0 = life6_54;
    }
    __call41_15(forestValue41_58_0, p0);
    }
    return;
}
public static void h41_0(moom.Oo p0) throws Throwable {
    throw __call3004100_0(p0);
}
public static void h41_1(moom.Oo p0) throws Throwable {
    throw __call3004101_0(p0);
}
public static void h41_2(moom.Oo p0) throws Throwable {
    throw __call3004102_0(p0);
}
public static void h41_3(moom.Oo p0) throws Throwable {
    throw __call3004103_0(p0);
}
public static void h41_4(moom.Oo p0) throws Throwable {
    throw __call3004104_0(p0);
}
private static native long __fieldRead41_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call41_1() throws Throwable;
private static native moom.bM __call41_2(moom.Js a0) throws Throwable;
private static native moom.bM __call41_3(moom.Js a0) throws Throwable;
private static native java.lang.String __invokedynamic41_4(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic41_6(java.lang.String a0, moom.bM a1) throws Throwable;
private static native void __call41_7(java.lang.String a0) throws Throwable;
private static native moom.bM __call41_8(moom.Js a0) throws Throwable;
private static native int __call41_9(moom.bM a0) throws Throwable;
private static native int __call41_10(java.util.List a0) throws Throwable;
private static native boolean __call41_11(java.util.List a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __call41_12(java.util.List a0, int a1) throws Throwable;
private static native java.util.List __cast41_13(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call41_14(java.util.List a0, int a1, java.util.List a2) throws Throwable;
private static native boolean __call41_15(java.util.List a0, moom.Js a1) throws Throwable;
private static native java.lang.Exception __call3004100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3004101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3004102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3004103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3004104_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_ed3d8726eaab14889ab0(moom.bM a0, moom.DT a1, net.minecraft.world.IBlockAccess a2, moom.DD a3, net.minecraft.client.gui.GuiScreen a4) throws E;
private static final class __SourceHandler_ed3d8726eaab14889ab0 {

public static moom.DD f766(moom.bM p0, moom.DT p1, net.minecraft.world.IBlockAccess p2, moom.DD p3, net.minecraft.client.gui.GuiScreen p4) throws Throwable {
    moom.Js[] lexicalValue766_16_0;
    net.minecraft.entity.Entity[] spill766_0;
    moom.Js[] spill766_1;
    long life5_3;
    moom.Js[] life8_9;
    net.minecraft.entity.Entity[] life7_10;
    moom.Js[] life9_19;
    int life10_22;
    int life11_24;
    moom.Js life12_31;
    lexical_join_45: {
    lexical_join_16: {
    life5_3 = (__fieldRead766_0() ^ 101842287543895L);
    spill766_0 = __call766_1();
    life8_9 = (__fieldRead766_2())[__call766_3(p0)];
    life7_10 = spill766_0;
    spill766_1 = life8_9;
    if (!((life7_10 != null))) {
        lexicalValue766_16_0 = spill766_1;
        break lexical_join_16;
    }
    if (!((spill766_1 != null))) {
        break lexical_join_45;
    }
    lexicalValue766_16_0 = life8_9;
    }
    life9_19 = lexicalValue766_16_0;
    life10_22 = (life9_19).length;
    life11_24 = 0;
    lexical_cycle_22: while (true) {
    lexical_join_43: {
    lexical_join_42: {
    if (!((life11_24 < life10_22))) {
        break lexical_join_45;
    }
    life12_31 = (life9_19)[life11_24];
    if (!((life7_10 != null))) {
        break lexical_join_43;
    }
    if (!(__call766_4(life12_31, p0, p1, p2, p4))) {
        break lexical_join_42;
    }
    return __call766_5(life12_31, p3);
    }
    life11_24 += 1;
    }
    if (!((life7_10 == null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    return p3;
}
public static void h766_0(moom.Oo p0) throws Throwable {
    throw __call1076600_0(p0);
}
public static void h766_1(moom.Oo p0) throws Throwable {
    throw __call1076601_0(p0);
}
public static void h766_2(moom.Oo p0) throws Throwable {
    throw __call1076602_0(p0);
}
private static native long __fieldRead766_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call766_1() throws Throwable;
private static native moom.Js[][] __fieldRead766_2() throws Throwable;
private static native int __call766_3(moom.bM a0) throws Throwable;
private static native boolean __call766_4(moom.Js a0, moom.bM a1, moom.DT a2, net.minecraft.world.IBlockAccess a3, net.minecraft.client.gui.GuiScreen a4) throws Throwable;
private static native moom.DD __call766_5(moom.Js a0, moom.DD a1) throws Throwable;
private static native java.lang.Exception __call1076600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076602_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_1617449615342e47ba67(moom.bM a0, net.minecraft.entity.Entity a1, net.minecraft.world.IBlockAccess a2, moom.DD a3) throws E;
private static final class __SourceHandler_1617449615342e47ba67 {

public static moom.DD f767(moom.bM p0, net.minecraft.entity.Entity p1, net.minecraft.world.IBlockAccess p2, moom.DD p3) throws Throwable {
    moom.Js[] lexicalValue767_16_0;
    net.minecraft.entity.Entity[] spill767_0;
    moom.Js[] spill767_1;
    long life4_3;
    moom.Js[] life7_9;
    net.minecraft.entity.Entity[] life6_10;
    moom.Js[] life8_19;
    int life9_22;
    int life10_24;
    moom.Js life11_31;
    lexical_join_44: {
    lexical_join_16: {
    life4_3 = (__fieldRead767_0() ^ 136438281674907L);
    spill767_0 = __call767_1();
    life7_9 = (__fieldRead767_2())[__call767_3(p0)];
    life6_10 = spill767_0;
    spill767_1 = life7_9;
    if (!((life6_10 != null))) {
        lexicalValue767_16_0 = spill767_1;
        break lexical_join_16;
    }
    if (!((spill767_1 != null))) {
        break lexical_join_44;
    }
    lexicalValue767_16_0 = life7_9;
    }
    life8_19 = lexicalValue767_16_0;
    life9_22 = (life8_19).length;
    life10_24 = 0;
    lexical_cycle_22: while (true) {
    lexical_join_42: {
    lexical_join_41: {
    if (!((life10_24 < life9_22))) {
        break lexical_join_44;
    }
    life11_31 = (life8_19)[life10_24];
    if (!((life6_10 != null))) {
        break lexical_join_42;
    }
    if (!(__call767_4(life11_31, p0, p1, p2))) {
        break lexical_join_41;
    }
    return __call767_5(life11_31, p3);
    }
    life10_24 += 1;
    }
    if (!((life6_10 == null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    return p3;
}
public static void h767_0(moom.Oo p0) throws Throwable {
    throw __call1076700_0(p0);
}
public static void h767_1(moom.Oo p0) throws Throwable {
    throw __call1076701_0(p0);
}
public static void h767_2(moom.Oo p0) throws Throwable {
    throw __call1076702_0(p0);
}
private static native long __fieldRead767_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call767_1() throws Throwable;
private static native moom.Js[][] __fieldRead767_2() throws Throwable;
private static native int __call767_3(moom.bM a0) throws Throwable;
private static native boolean __call767_4(moom.Js a0, moom.bM a1, net.minecraft.entity.Entity a2, net.minecraft.world.IBlockAccess a3) throws Throwable;
private static native moom.DD __call767_5(moom.Js a0, moom.DD a1) throws Throwable;
private static native java.lang.Exception __call1076700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076702_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d0ff58d107ccd56fff87(net.minecraft.client.resources.IResourcePack a0, java.util.List a1) throws E;
private static final class __SourceHandler_d0ff58d107ccd56fff87 {

public static void f712(net.minecraft.client.resources.IResourcePack p0, java.util.List p1) throws Throwable {
    moom.Js forestValue712_91_0;
    net.minecraft.entity.Entity[] spill712_0;
    moom.Js spill712_1;
    long life2_3;
    java.lang.String[] life5_18;
    net.minecraft.entity.Entity[] life4_19;
    java.lang.String[] life6_23;
    int life7_26;
    int life8_28;
    java.lang.String life9_35;
    moom.DD life10_49;
    java.io.InputStream life11_53;
    moom.OH life12_74;
    moom.Js life13_85;
    forest_join_96: {
    life2_3 = (__fieldRead712_0() ^ 65224090558669L);
    spill712_0 = __call712_1();
    life5_18 = __call712_4(p0, __invokedynamic712_2(12175, (2772154758377762889L ^ life2_3)), __invokedynamic712_3(8718, (2359449477472878016L ^ life2_3)), null);
    life4_19 = spill712_0;
    __call712_5(life5_18);
    life6_23 = life5_18;
    life7_26 = (life6_23).length;
    life8_28 = 0;
    forest_cycle_29: while (true) {
    forest_join_93: {
    forest_join_91: {
    forest_join_69: {
    forest_join_67: {
    if (!((life8_28 < life7_26))) {
        break forest_join_96;
    }
    life9_35 = (life6_23)[life8_28];
    java.lang.String __stackOp712_7_0 = life9_35;
    java.lang.String __stackOp712_7_1 = __invokedynamic712_6(29950, (5341862497455221556L ^ life2_3));
    __call712_9(__invokedynamic712_8(__stackOp712_7_1, __stackOp712_7_0));
    life10_49 = new moom.DD(life9_35);
    life11_53 = __call712_10(p0, life10_49);
    if (!((life4_19 != null))) {
        break forest_join_67;
    }
    if (!((life11_53 == null))) {
        break forest_join_69;
    }
    java.lang.String __stackOp712_12_0 = life9_35;
    java.lang.String __stackOp712_12_1 = __invokedynamic712_11(15446, (9147203114293814169L ^ life2_3));
    __call712_14(__invokedynamic712_13(__stackOp712_12_1, __stackOp712_12_0));
    }
    if (!((life4_19 == null))) {
        break forest_join_93;
    }
    }
    life12_74 = new moom.OH();
    __call712_15(life12_74, life11_53);
    __call712_16(life11_53);
    life13_85 = new moom.Js(life12_74, life9_35);
    spill712_1 = life13_85;
    if (!((life4_19 != null))) {
        forestValue712_91_0 = spill712_1;
        break forest_join_91;
    }
    if (!(__call712_17(spill712_1, life9_35))) {
        break forest_join_93;
    }
    forestValue712_91_0 = life13_85;
    }
    __call712_18(forestValue712_91_0, p1);
    }
    life8_28 += 1;
    if (!((life4_19 == null))) {
        continue forest_cycle_29;
    }
    break forest_cycle_29;
    }
    }
    return;
}
public static void h712_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3071200_0(p0);
}
public static void h712_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3071201_0(p0);
}
public static void h712_2(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3071202_0(p0);
}
public static void h712_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3071203_0(p0);
}
public static void h712_4(java.io.FileNotFoundException p0, net.minecraft.client.resources.IResourcePack p1, java.util.List p2, long p3, net.minecraft.entity.Entity[] p4, java.lang.String[] p5, int p6, int p7, java.lang.String p8, moom.DD p9, java.io.InputStream p10, moom.OH p11, moom.Js p12) throws Throwable {
    moom.Js forestValue3071204_77_0;
    moom.Js spill3071204_0;
    java.io.FileNotFoundException life10_2;
    java.lang.String life9_23;
    moom.DD life10_37;
    java.io.InputStream life11_41;
    moom.OH life12_62;
    moom.Js life13_73;
    forest_join_80: {
    life10_2 = p0;
    java.lang.String __stackOp3071204_1_0 = p8;
    java.lang.String __stackOp3071204_1_1 = __invokedynamic3071204_0(32329, (6920811851288945025L ^ p3));
    __call3071204_3(__invokedynamic3071204_2(__stackOp3071204_1_1, __stackOp3071204_1_0));
    forest_cycle_11: while (true) {
    forest_join_79: {
    forest_join_77: {
    forest_join_55: {
    forest_join_53: {
    forest_join_15: {
    p7 += 1;
    if (!((p4 == null))) {
        break forest_join_15;
    }
    break forest_join_80;
    }
    if (!((p7 < p6))) {
        break forest_join_80;
    }
    life9_23 = (p5)[p7];
    java.lang.String __stackOp3071204_5_0 = life9_23;
    java.lang.String __stackOp3071204_5_1 = __invokedynamic3071204_4(29950, (5341862497455221556L ^ p3));
    __call3071204_7(__invokedynamic3071204_6(__stackOp3071204_5_1, __stackOp3071204_5_0));
    life10_37 = new moom.DD(life9_23);
    life11_41 = __call3071204_8(p1, life10_37);
    if (!((p4 != null))) {
        break forest_join_53;
    }
    if (!((life11_41 == null))) {
        break forest_join_55;
    }
    java.lang.String __stackOp3071204_10_0 = life9_23;
    java.lang.String __stackOp3071204_10_1 = __invokedynamic3071204_9(15446, (9147203114293814169L ^ p3));
    __call3071204_12(__invokedynamic3071204_11(__stackOp3071204_10_1, __stackOp3071204_10_0));
    }
    if (!((p4 == null))) {
        break forest_join_79;
    }
    }
    life12_62 = new moom.OH();
    __call3071204_13(life12_62, life11_41);
    __call3071204_14(life11_41);
    life13_73 = new moom.Js(life12_62, life9_23);
    spill3071204_0 = life13_73;
    if (!((p4 != null))) {
        forestValue3071204_77_0 = spill3071204_0;
        break forest_join_77;
    }
    if (!(__call3071204_15(spill3071204_0, life9_23))) {
        break forest_join_79;
    }
    forestValue3071204_77_0 = life13_73;
    }
    __call3071204_16(forestValue3071204_77_0, p2);
    }
    continue forest_cycle_11;
    }
    }
    return;
}
public static void h712_5(java.lang.Exception p0, net.minecraft.client.resources.IResourcePack p1, java.util.List p2, long p3, net.minecraft.entity.Entity[] p4, java.lang.String[] p5, int p6, int p7, java.lang.String p8, moom.DD p9, java.io.InputStream p10, moom.OH p11, moom.Js p12) throws Throwable {
    moom.Js forestValue3071205_70_0;
    moom.Js spill3071205_0;
    java.lang.Exception life10_2;
    java.lang.String life9_15;
    moom.DD life10_29;
    java.io.InputStream life11_33;
    moom.OH life12_54;
    moom.Js life13_65;
    forest_join_73: {
    life10_2 = p0;
    __call3071205_0(life10_2);
    forest_cycle_4: while (true) {
    forest_join_72: {
    forest_join_70: {
    forest_join_48: {
    forest_join_46: {
    forest_join_8: {
    p7 += 1;
    if (!((p4 == null))) {
        break forest_join_8;
    }
    break forest_join_73;
    }
    if (!((p7 < p6))) {
        break forest_join_73;
    }
    life9_15 = (p5)[p7];
    java.lang.String __stackOp3071205_2_0 = life9_15;
    java.lang.String __stackOp3071205_2_1 = __invokedynamic3071205_1(29950, (5341862497455221556L ^ p3));
    __call3071205_4(__invokedynamic3071205_3(__stackOp3071205_2_1, __stackOp3071205_2_0));
    life10_29 = new moom.DD(life9_15);
    life11_33 = __call3071205_5(p1, life10_29);
    if (!((p4 != null))) {
        break forest_join_46;
    }
    if (!((life11_33 == null))) {
        break forest_join_48;
    }
    java.lang.String __stackOp3071205_7_0 = life9_15;
    java.lang.String __stackOp3071205_7_1 = __invokedynamic3071205_6(15446, (9147203114293814169L ^ p3));
    __call3071205_9(__invokedynamic3071205_8(__stackOp3071205_7_1, __stackOp3071205_7_0));
    }
    if (!((p4 == null))) {
        break forest_join_72;
    }
    }
    life12_54 = new moom.OH();
    __call3071205_10(life12_54, life11_33);
    __call3071205_11(life11_33);
    life13_65 = new moom.Js(life12_54, life9_15);
    spill3071205_0 = life13_65;
    if (!((p4 != null))) {
        forestValue3071205_70_0 = spill3071205_0;
        break forest_join_70;
    }
    if (!(__call3071205_12(spill3071205_0, life9_15))) {
        break forest_join_72;
    }
    forestValue3071205_70_0 = life13_65;
    }
    __call3071205_13(forestValue3071205_70_0, p2);
    }
    continue forest_cycle_4;
    }
    }
    return;
}
private static native long __fieldRead712_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call712_1() throws Throwable;
private static native java.lang.String __invokedynamic712_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic712_3(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call712_4(net.minecraft.client.resources.IResourcePack a0, java.lang.String a1, java.lang.String a2, java.lang.Object a3) throws Throwable;
private static native void __call712_5(java.lang.String[] a0) throws Throwable;
private static native java.lang.String __invokedynamic712_6(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic712_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call712_9(java.lang.String a0) throws Throwable;
private static native java.io.InputStream __call712_10(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native java.lang.String __invokedynamic712_11(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic712_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call712_14(java.lang.String a0) throws Throwable;
private static native void __call712_15(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call712_16(java.io.InputStream a0) throws Throwable;
private static native boolean __call712_17(moom.Js a0, java.lang.String a1) throws Throwable;
private static native void __call712_18(moom.Js a0, java.util.List a1) throws Throwable;
private static native java.lang.Exception __call3071200_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3071201_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3071202_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3071203_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.String __invokedynamic3071204_0(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3071204_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3071204_3(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic3071204_4(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3071204_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3071204_7(java.lang.String a0) throws Throwable;
private static native java.io.InputStream __call3071204_8(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native java.lang.String __invokedynamic3071204_9(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3071204_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3071204_12(java.lang.String a0) throws Throwable;
private static native void __call3071204_13(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call3071204_14(java.io.InputStream a0) throws Throwable;
private static native boolean __call3071204_15(moom.Js a0, java.lang.String a1) throws Throwable;
private static native void __call3071204_16(moom.Js a0, java.util.List a1) throws Throwable;
private static native void __call3071205_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic3071205_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3071205_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3071205_4(java.lang.String a0) throws Throwable;
private static native java.io.InputStream __call3071205_5(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native java.lang.String __invokedynamic3071205_6(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3071205_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3071205_9(java.lang.String a0) throws Throwable;
private static native void __call3071205_10(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call3071205_11(java.io.InputStream a0) throws Throwable;
private static native boolean __call3071205_12(moom.Js a0, java.lang.String a1) throws Throwable;
private static native void __call3071205_13(moom.Js a0, java.util.List a1) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ad34ec6e768bef7ba833() throws E;
private static final class __SourceHandler_ad34ec6e768bef7ba833 {

public static boolean f768() throws Throwable {
    int forwardValue768_38_0;
    long life0_3;
    java.util.Calendar life2_5;
    forward_join_38: {
    forward_join_37: {
    life0_3 = (__fieldRead768_0() ^ 100089950954186L);
    life2_5 = __call768_1();
    if (!(((__call768_2(life2_5, 2) + 1) == __invokedynamic768_3(13178, (8783799728803889047L ^ life0_3))))) {
        break forward_join_37;
    }
    if (!((__call768_4(life2_5, 5) >= __invokedynamic768_5(19236, (4958920871973898187L ^ life0_3))))) {
        break forward_join_37;
    }
    if (!((__call768_6(life2_5, 5) <= __invokedynamic768_7(18904, (7339293584652879156L ^ life0_3))))) {
        break forward_join_37;
    }
    forwardValue768_38_0 = 1;
    break forward_join_38;
    }
    forwardValue768_38_0 = 0;
    }
    return __integerCategory768_8(forwardValue768_38_0);
}
public static void h768_0(moom.Oo p0) throws Throwable {
    throw __call1076800_0(p0);
}
public static void h768_1(moom.Oo p0) throws Throwable {
    throw __call1076801_0(p0);
}
public static void h768_2(moom.Oo p0) throws Throwable {
    throw __call1076802_0(p0);
}
private static native long __fieldRead768_0() throws Throwable;
private static native java.util.Calendar __call768_1() throws Throwable;
private static native int __call768_2(java.util.Calendar a0, int a1) throws Throwable;
private static native int __invokedynamic768_3(int a0, long a1) throws Throwable;
private static native int __call768_4(java.util.Calendar a0, int a1) throws Throwable;
private static native int __invokedynamic768_5(int a0, long a1) throws Throwable;
private static native int __call768_6(java.util.Calendar a0, int a1) throws Throwable;
private static native int __invokedynamic768_7(int a0, long a1) throws Throwable;
private static native boolean __integerCategory768_8(int value) throws Throwable;
private static native java.lang.Exception __call1076800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1076802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6a359f989377a936c156() throws E;
private static final class __SourceHandler_6a359f989377a936c156 {

public static void f769() throws Throwable {
    net.minecraft.entity.Entity[] spill769_0;
    long life0_3;
    net.minecraft.entity.Entity[] life2_7;
    java.util.ArrayList life3_13;
    net.minecraft.client.resources.IResourcePack[] life4_15;
    int life5_20;
    net.minecraft.client.resources.IResourcePack life6_26;
    lexical_join_38: {
    lexical_join_35: {
    life0_3 = (__fieldRead769_0() ^ 44052262582985L);
    spill769_0 = __call769_1();
    __fieldWrite769_2(null);
    life2_7 = spill769_0;
    if (!(__call769_3())) {
        break lexical_join_38;
    }
    life3_13 = new java.util.ArrayList();
    life4_15 = __call769_4();
    life5_20 = ((life4_15).length - 1);
    lexical_cycle_21: while (true) {
    if (!((life5_20 >= 0))) {
        break lexical_join_35;
    }
    life6_26 = (life4_15)[life5_20];
    __call769_5(life6_26, life3_13);
    life5_20 += -1;
    if (!((life2_7 != null))) {
        break lexical_join_38;
    }
    if (!((life2_7 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    __fieldWrite769_7(__call769_6(life3_13));
    }
    return;
}
public static void h769_0(moom.Oo p0) throws Throwable {
    throw __call1076900_0(p0);
}
private static native long __fieldRead769_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call769_1() throws Throwable;
private static native void __fieldWrite769_2(java.lang.Object a0) throws Throwable;
private static native boolean __call769_3() throws Throwable;
private static native net.minecraft.client.resources.IResourcePack[] __call769_4() throws Throwable;
private static native void __call769_5(net.minecraft.client.resources.IResourcePack a0, java.util.ArrayList a1) throws Throwable;
private static native moom.Js[][] __call769_6(java.util.ArrayList a0) throws Throwable;
private static native void __fieldWrite769_7(moom.Js[][] a0) throws Throwable;
private static native java.lang.Exception __call1076900_0(moom.Oo a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5465_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ju"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9250;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Ju", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Ju.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Ju.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13574);
    if (((moom.Ju.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Ju.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Ju.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Ju", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((moom.Ju.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Ju.g)[life5_8] = moom.Ju.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Ju.g)[life5_8];
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
        byte[] spill2793_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2793_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2793_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2793_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2793_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2793_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static boolean a__Boolean() { return __sourceHandlerCall_ad34ec6e768bef7ba833(); }


public static moom.DD a(moom.DD p0) { return __sourceHandlerCall_987fc7587860123d66d2(p0); }


private static moom.DD a(moom.bM p0, moom.DT p1, net.minecraft.world.IBlockAccess p2, moom.DD p3, net.minecraft.client.gui.GuiScreen p4) { return __sourceHandlerCall_ed3d8726eaab14889ab0(p0, p1, p2, p3, p4); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5471_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ju"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static moom.jJ a() {
return moom.Ju.b;
}


private static void a(moom.Js p0, java.util.List<java.util.List<moom.Js>> p1) { __sourceHandlerCall_67a7b8f7e73361191d99(p0, p1); }


private static void a(net.minecraft.client.resources.IResourcePack p0, java.util.List<java.util.List<moom.Js>> p1) { __sourceHandlerCall_d0ff58d107ccd56fff87(p0, p1); }


private static moom.Js[][] a(java.util.List<java.util.List<moom.Js>> p0) { return __sourceHandlerCall_ba39130b9946c63d2afb(p0); }


private static moom.DD a(moom.bM p0, net.minecraft.entity.Entity p1, net.minecraft.world.IBlockAccess p2, moom.DD p3) { return __sourceHandlerCall_1617449615342e47ba67(p0, p1, p2, p3); }


private static void a(java.lang.String p0) {
long local1_life2 = (moom.Ju.e ^ 27405837144654L);
    java.lang.String __stackOp547_5_0 = p0;
    java.lang.String __stackOp547_5_1 = __sourceIntrinsic_474b89cf9bbb_originalDynamicSite547_4(21801, (2157950699755124839L ^ local1_life2));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_474b89cf9bbb_originalDynamicSite547_6(__stackOp547_5_1, __stackOp547_5_0))));
    return;
}


public static void a__Void() { __sourceHandlerCall_6a359f989377a936c156(); }


public static void a(moom.jJ p0) {
b = ((moom.jJ)(p0));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_originalDynamicSite547_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_originalDynamicSite547_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5471_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5465_0() throws E;
}
