package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Kb {

private java.lang.String[] a;

private java.lang.String b;

private boolean c;

private int d;

private java.lang.String e;

private int f;

private static java.util.regex.Pattern g;

private static long h;

private static java.lang.String[] i;

private static java.lang.String[] j;

private static java.util.Map k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

public Kb(java.lang.String p0, java.lang.String p1) { super(); }

private static void __sourceConstructorBody_b0af99e5dd1f5f0c(moom.Kb receiver, java.lang.String p0, java.lang.String p1) throws Throwable {
boolean __initValue552_68_0;
    boolean __initValue552_95_0;
    boolean __initValue552_124_0;
    boolean __initValue552_154_0;
    java.lang.String __initValue552_168_0;
    java.lang.String __initValue552_168_1;
    moom.Kb __initValue552_194_0;
    long local3_life2;
    java.lang.String[] local6_life13;
    int local5_life18;
    init_join_194: {
    init_join_193: {
    init_join_177: {
    init_join_174: {
    init_join_168: {
    init_join_154: {
    init_join_145: {
    init_join_124: {
    init_join_117: {
    init_join_95: {
    init_join_88: {
    init_join_68: {
    init_join_61: {
    local3_life2 = (moom.Kb.h ^ 17124187315670L);
    moom.Kb.__sourceConstructorInit_b0af99e5dd1f5f0c_0(((moom.Kb)(receiver)));
    ((moom.Kb)(receiver)).a = ((java.lang.String[])(null));
    int __sourceSpill552_7 = moom.J_.b();
    ((moom.Kb)(receiver)).b = ((java.lang.String)(null));
    ((moom.Kb)(receiver)).c = ((boolean)(false));
    ((moom.Kb)(receiver)).d = ((int)(0));
    ((moom.Kb)(receiver)).e = ((java.lang.String)(null));
    ((moom.Kb)(receiver)).f = ((int)(0));
    local6_life13 = moom.BU.a__ArrayString(((java.lang.String)(p0)), ((java.lang.String)(".")));
    ((moom.Kb)(receiver)).a = ((java.lang.String[])(((java.lang.String[])(java.util.Arrays.copyOfRange(((java.lang.Object[])(local6_life13)), ((int)(0)), ((int)(((local6_life13).length - 1))))))));
    ((moom.Kb)(receiver)).b = ((java.lang.String)((local6_life13)[((local6_life13).length - 1)]));
    local5_life18 = __sourceSpill552_7;
    boolean __sourceSpill552_20 = ((java.lang.String)(p1)).startsWith(((java.lang.String)("!")));
    if (!((local5_life18 == 0))) {
        __initValue552_68_0 = __sourceSpill552_20;
        break init_join_68;
    }
    if (!(__sourceSpill552_20)) {
        break init_join_61;
    }
    ((moom.Kb)(receiver)).c = ((boolean)(true));
    p1 = ((java.lang.String)(p1)).substring(((int)(1)));
    }
    __initValue552_68_0 = ((java.lang.String)(p1)).startsWith(((java.lang.String)(__sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_24(14077, (7371205133246809966L ^ local3_life2)))));
    }
    boolean __sourceSpill552_26 = __initValue552_68_0;
    if (!((local5_life18 == 0))) {
        __initValue552_95_0 = __sourceSpill552_26;
        break init_join_95;
    }
    if (!(__sourceSpill552_26)) {
        break init_join_88;
    }
    ((moom.Kb)(receiver)).d = ((int)(1));
    p1 = ((java.lang.String)(p1)).substring(((int)(((java.lang.String)(__sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_29(17390, (1962973409970795123L ^ local3_life2)))).length())));
    if (!((local5_life18 != 0))) {
        break init_join_177;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    __initValue552_95_0 = ((java.lang.String)(p1)).startsWith(((java.lang.String)(__sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_34(14716, (1462982388915030251L ^ local3_life2)))));
    }
    boolean __sourceSpill552_36 = __initValue552_95_0;
    if (!((local5_life18 == 0))) {
        __initValue552_124_0 = __sourceSpill552_36;
        break init_join_124;
    }
    if (!(__sourceSpill552_36)) {
        break init_join_117;
    }
    ((moom.Kb)(receiver)).d = ((int)(__sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_38(3624, (4987839841972008518L ^ local3_life2))));
    p1 = ((java.lang.String)(((java.lang.String)(p1)).substring(((int)(((java.lang.String)(__sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_41(11629, (6862625035203009791L ^ local3_life2)))).length()))))).toLowerCase();
    if (!((local5_life18 != 0))) {
        break init_join_177;
    }
    }
    __initValue552_124_0 = ((java.lang.String)(p1)).startsWith(((java.lang.String)(__sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_46(9787, (7976096515042826148L ^ local3_life2)))));
    }
    boolean __sourceSpill552_48 = __initValue552_124_0;
    if (!((local5_life18 == 0))) {
        __initValue552_154_0 = __sourceSpill552_48;
        break init_join_154;
    }
    if (!(__sourceSpill552_48)) {
        break init_join_145;
    }
    ((moom.Kb)(receiver)).d = ((int)(__sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_50(10232, (7394619944272174999L ^ local3_life2))));
    p1 = ((java.lang.String)(p1)).substring(((int)(((java.lang.String)(__sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_53(27661, (7452433101442817425L ^ local3_life2)))).length())));
    if (!((local5_life18 != 0))) {
        break init_join_177;
    }
    }
    java.lang.String __sourceSpill552_58 = p1;
    java.lang.String __sourceSpill552_59 = __sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_57(7467, (5432663956379069629L ^ local3_life2));
    if (!((local5_life18 == 0))) {
        __initValue552_168_0 = __sourceSpill552_58;
        __initValue552_168_1 = __sourceSpill552_59;
        break init_join_168;
    }
    __initValue552_154_0 = ((java.lang.String)(__sourceSpill552_58)).startsWith(((java.lang.String)(__sourceSpill552_59)));
    }
    if (!(__initValue552_154_0)) {
        break init_join_174;
    }
    ((moom.Kb)(receiver)).d = ((int)(__sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_62(14954, (1554240170642833927L ^ local3_life2))));
    __initValue552_168_0 = p1;
    __initValue552_168_1 = __sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_65(17190, (3255181122562470579L ^ local3_life2));
    }
    p1 = ((java.lang.String)(((java.lang.String)(__initValue552_168_0)).substring(((int)(((java.lang.String)(__initValue552_168_1)).length()))))).toLowerCase();
    if (!((local5_life18 != 0))) {
        break init_join_177;
    }
    }
    ((moom.Kb)(receiver)).d = ((int)(0));
    }
    p1 = org.apache.commons.text.StringEscapeUtils.unescapeJava(((java.lang.String)(p1)));
    moom.Kb __sourceSpill552_71 = receiver;
    if (!((local5_life18 == 0))) {
        __initValue552_194_0 = __sourceSpill552_71;
        break init_join_194;
    }
    if (!((((moom.Kb)(__sourceSpill552_71)).d == 0))) {
        break init_join_193;
    }
    if (!(((java.util.regex.Matcher)(((java.util.regex.Pattern)(moom.Kb.g)).matcher(((java.lang.CharSequence)(p1))))).matches())) {
        break init_join_193;
    }
    ((moom.Kb)(receiver)).f = ((int)(1));
    }
    __initValue552_194_0 = receiver;
    }
    ((moom.Kb)(__initValue552_194_0)).e = ((java.lang.String)(p1));
    return;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(8852864443725962905L)), ((long)(3973366854564717724L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(254454758116332L)))));
    long local20_life6 = (moom.Kb.h ^ 123304597897935L);
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill650_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill650_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill650_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill650_14 = new byte[8];
    (__sourceSpill650_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill650_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation650_16 = __sourceSpill650_14;
    ((javax.crypto.Cipher)(__sourceSpill650_11)).init(((int)(__sourceSpill650_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill650_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation650_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[12];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "Æ² bò´¶ÅI}¶\fµEâä;Ñ[L/Í}\004\020\022bÜj\037ß:bòÑçaÅ_°\020êº,\034¦k+â3èðÛf1 ?;åÀ_\027¯JL¨¡\0009\033å©I*ðþ\bE®óÀAD*ì\n\030n£g\027»Êv ûº±K/Ûócl¡ J;\005yìqÒ©¡·LuyT# [2çiuêô[\025\020ýÐ<ÆÄÿ¦\003#wuQ81×F+ÐË\020Åc\027èø\001´\037Üë;]\034ÏÒ¬!\013èÐª\032³\024e\007\020p°*Ì¦(/J0Ù¼ü\020Ñ|ú58\001Ãr;ãÔQ1\031-\020mý?àZ÷ìZèã OÒa"))).length();
    int local14_life24 = 24;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill650_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill650_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill650_29)).doFinal(((byte[])(__sourceSpill650_28)));
        java.lang.String __sourceSpill650_34 = ((java.lang.String)(moom.Kb.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill650_35 = local18_life19;
        int __sourceSpill650_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill650_35)[__sourceSpill650_36] = __sourceSpill650_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "Ã`·QÉËX½î¶Fö\016Ó\003¹TbrU,QÉ\020N¼D\bVÐÁÒ#¨À"))).length();
    local14_life24 = 24;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill650_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill650_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill650_42)).doFinal(((byte[])(__sourceSpill650_41)));
        java.lang.String __sourceSpill650_47 = ((java.lang.String)(moom.Kb.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill650_48 = local18_life19;
        int __sourceSpill650_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill650_48)[__sourceSpill650_49] = __sourceSpill650_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    i = ((java.lang.String[])(local18_life19));
    j = ((java.lang.String[])(new java.lang.String[12]));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill650_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill650_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill650_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill650_60 = new byte[8];
    (__sourceSpill650_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill650_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation650_62 = __sourceSpill650_60;
    ((javax.crypto.Cipher)(__sourceSpill650_57)).init(((int)(__sourceSpill650_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill650_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation650_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[7];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "N\026ëµí\035È\033\023¸P è°\037Átû\brç|¼\0060ËÐU×]AD±2©]¤"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill650_71 = local4_life67;
        int __sourceSpill650_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill650_71)).substring(((int)(__sourceSpill650_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill650_76 = local6_life65;
        int __sourceSpill650_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill650_79 = new byte[8];
        (__sourceSpill650_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill650_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill650_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill650_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill650_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill650_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill650_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill650_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill650_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill650_80)).doFinal(((byte[])(__sourceSpill650_79)));
        (__sourceSpill650_76)[__sourceSpill650_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "Gæ¤²\001ñR)KÚ»8s%"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill650_84 = local4_life67;
        int __sourceSpill650_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill650_84)).substring(((int)(__sourceSpill650_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill650_89 = local6_life65;
        int __sourceSpill650_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill650_92 = new byte[8];
        (__sourceSpill650_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill650_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill650_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill650_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill650_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill650_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill650_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill650_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill650_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill650_93)).doFinal(((byte[])(__sourceSpill650_92)));
        (__sourceSpill650_89)[__sourceSpill650_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    l = ((long[])(local6_life65));
    m = ((java.lang.Integer[])(new java.lang.Integer[7]));
    g = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite650_98(22910, (8503553298913228787L ^ local20_life6)))))));
}

private static native <E extends Throwable> void __sourceConstructorInit_b0af99e5dd1f5f0c_0(moom.Kb a0) throws E;
private static native <E extends Throwable> boolean __sourceHandlerCall_8c331877ade9488e1d92(moom.Kb a0, java.lang.String a1) throws E;
private static final class __SourceHandler_8c331877ade9488e1d92 {

public static boolean f102(moom.Kb receiver, java.lang.String p0) throws Throwable {
    int forwardValue102_19_0;
    int spill102_0;
    long life2_3;
    int life4_5;
    forward_join_46: {
    forward_join_39: {
    forward_join_33: {
    forward_join_26: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    forward_join_10: {
    life2_3 = (__fieldRead102_0() ^ 80710964468514L);
    life4_5 = __call102_1();
    if (!((p0 == null))) {
        break forward_join_10;
    }
    return __integerCategory102_2(0);
    }
    spill102_0 = __fieldRead102_3(receiver);
    if (!((life4_5 == 0))) {
        forwardValue102_19_0 = spill102_0;
        break forward_join_19;
    }
    switch (spill102_0) {
case 0:
{
        break forward_join_15;
    }
case 1:
{
        break forward_join_20;
    }
case 2:
{
        break forward_join_26;
    }
case 3:
{
        break forward_join_33;
    }
case 4:
{
        break forward_join_39;
    }
default:
{
        break forward_join_46;
    }
}
    }
    forwardValue102_19_0 = __integerCategory102_6(__call102_5(p0, __fieldRead102_4(receiver)));
    }
    return __integerCategory102_7(forwardValue102_19_0);
    }
    return __call102_9(receiver, p0, __fieldRead102_8(receiver));
    }
    return __call102_12(receiver, __call102_10(p0), __fieldRead102_11(receiver));
    }
    return __call102_14(receiver, p0, __fieldRead102_13(receiver));
    }
    return __call102_17(receiver, __call102_15(p0), __fieldRead102_16(receiver));
    }
    java.lang.Object __inlineStack102_20Token;
    throw new java.lang.IllegalArgumentException(__invokedynamic102_21(__inlineStack102_20Output0((__inlineStack102_20Token = __inlineStack102_20Pack(__fieldRead102_18(receiver), __invokedynamic102_19(32321, (7110616992052562213L ^ life2_3))))), __inlineStack102_20Output1(__inlineStack102_20Token)));
}
private static native long __fieldRead102_0() throws Throwable;
private static native int __call102_1() throws Throwable;
private static native boolean __integerCategory102_2(int value) throws Throwable;
private static native int __fieldRead102_3(moom.Kb a0) throws Throwable;
private static native java.lang.String __fieldRead102_4(moom.Kb a0) throws Throwable;
private static native boolean __call102_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory102_6(boolean value) throws Throwable;
private static native boolean __integerCategory102_7(int value) throws Throwable;
private static native java.lang.String __fieldRead102_8(moom.Kb a0) throws Throwable;
private static native boolean __call102_9(moom.Kb a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __call102_10(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead102_11(moom.Kb a0) throws Throwable;
private static native boolean __call102_12(moom.Kb a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __fieldRead102_13(moom.Kb a0) throws Throwable;
private static native boolean __call102_14(moom.Kb a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __call102_15(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead102_16(moom.Kb a0) throws Throwable;
private static native boolean __call102_17(moom.Kb a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __fieldRead102_18(moom.Kb a0) throws Throwable;
private static native java.lang.String __invokedynamic102_19(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack102_20Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack102_20Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack102_20Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic102_21(java.lang.String a0, int a1) throws Throwable;

}


public java.lang.String toString() {
int lexicalValue896_43_0;
    java.lang.StringBuilder lexicalValue896_67_0;
    java.lang.String lexicalValue896_73_0;
    int spill896_0;
    int spill896_1;
    java.lang.StringBuilder spill896_2;
    java.lang.String spill896_3;
    long life1_3;
    java.lang.StringBuilder life4_8;
    int life3_9;
    int life5_11;
    java.lang.String life6_21;
    lexical_join_73: {
    lexical_join_67: {
    lexical_join_48: {
    lexical_join_43: {
    lexical_join_39: {
    life1_3 = (moom.Kb.h ^ 57039833294922L);
    spill896_0 = moom.J_.b();
    life4_8 = new java.lang.StringBuilder();
    life3_9 = spill896_0;
    life5_11 = 0;
    lexical_cycle_12: while (true) {
    lexical_join_37: {
    lexical_join_32: {
    if (!((life5_11 < (this.a).length))) {
        break lexical_join_39;
    }
    life6_21 = (this.a)[life5_11];
    if (!((life3_9 == 0))) {
        break lexical_join_37;
    }
    spill896_1 = life5_11;
    if (!((life3_9 == 0))) {
        lexicalValue896_43_0 = spill896_1;
        break lexical_join_43;
    }
    if (!((spill896_1 > 0))) {
        break lexical_join_32;
    }
    ((java.lang.StringBuilder)(life4_8)).append(((java.lang.String)(".")));
    }
    ((java.lang.StringBuilder)(life4_8)).append(((java.lang.String)(life6_21)));
    life5_11 += 1;
    }
    if (!((life3_9 != 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    spill896_2 = life4_8;
    if (!((life3_9 == 0))) {
        lexicalValue896_67_0 = spill896_2;
        break lexical_join_67;
    }
    lexicalValue896_43_0 = ((java.lang.StringBuilder)(spill896_2)).length();
    }
    if (!((lexicalValue896_43_0 > 0))) {
        break lexical_join_48;
    }
    ((java.lang.StringBuilder)(life4_8)).append(((java.lang.String)(".")));
    }
    ((java.lang.StringBuilder)(life4_8)).append(((java.lang.String)(this.b)));
    ((java.lang.StringBuilder)(life4_8)).append(((java.lang.String)(__sourceIntrinsic_a86c261fcdee_invokedynamic896_10(29551, (7142142547565868909L ^ life1_3)))));
    ((java.lang.StringBuilder)(life4_8)).append(((java.lang.String)(this.e)));
    lexicalValue896_67_0 = life4_8;
    }
    spill896_3 = ((java.lang.StringBuilder)(lexicalValue896_67_0)).toString();
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        lexicalValue896_73_0 = spill896_3;
        break lexical_join_73;
    }
    life3_9 += 1;
    moom.J_.b(((int)(life3_9)));
    lexicalValue896_73_0 = spill896_3;
    }
    return lexicalValue896_73_0;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Kb.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3F9E;
        if (m[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = Kb.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])Kb.n.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    Kb.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Kb", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Kb.m[n2] = n4;
        }
        return m[n2];
}


private boolean b(java.lang.String p0, java.lang.String p1) {
return (__sourceIntrinsic_booleanComparison((((java.lang.String)(p0)).matches(((java.lang.String)(p1))))) != 0);
}


public boolean b(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound forestValue46_13_0;
    int forestValue46_56_0;
    net.minecraft.nbt.NBTBase forestValue46_63_0;
    net.minecraft.nbt.NBTTagCompound spill46_0;
    net.minecraft.nbt.NBTBase spill46_1;
    boolean spill46_2;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTBase life5_17;
    java.lang.String[] life6_20;
    int life7_23;
    int life8_25;
    java.lang.String life9_34;
    forest_join_66: {
    forest_join_63: {
    forest_join_57: {
    forest_join_56: {
    forest_join_46: {
    forest_join_44: {
    forest_join_13: {
    forest_join_12: {
    life2_3 = (moom.Kb.h ^ 120076232789716L);
    life4_5 = moom.J_.c();
    spill46_0 = p0;
    if (!((life4_5 != 0))) {
        forestValue46_13_0 = spill46_0;
        break forest_join_13;
    }
    if (!((spill46_0 == null))) {
        break forest_join_12;
    }
    return ((0) != 0);
    }
    forestValue46_13_0 = p0;
    }
    life5_17 = forestValue46_13_0;
    life6_20 = this.a;
    life7_23 = (life6_20).length;
    life8_25 = 0;
    forest_cycle_22: while (true) {
    forest_join_41: {
    forest_join_40: {
    if (!((life8_25 < life7_23))) {
        break forest_join_46;
    }
    life9_34 = (life6_20)[life8_25];
    life5_17 = moom.Kb.a(((net.minecraft.nbt.NBTBase)(life5_17)), ((java.lang.String)(life9_34)));
    if (!((life4_5 != 0))) {
        break forest_join_41;
    }
    spill46_1 = life5_17;
    if (!((life4_5 != 0))) {
        forestValue46_63_0 = spill46_1;
        break forest_join_63;
    }
    if (!((spill46_1 == null))) {
        break forest_join_40;
    }
    break forest_join_44;
    }
    life8_25 += 1;
    }
    if (!((life4_5 == 0))) {
        continue forest_cycle_22;
    }
    break forest_cycle_22;
    }
    break forest_join_46;
    }
    return ((0) != 0);
    }
    spill46_2 = ((java.lang.String)(this.b)).equals(((java.lang.Object)("*")));
    if (!((life4_5 != 0))) {
        forestValue46_56_0 = ((spill46_2) ? 1 : 0);
        break forest_join_56;
    }
    if (!(spill46_2)) {
        break forest_join_57;
    }
    forestValue46_56_0 = ((((moom.Kb)(this)).a(((net.minecraft.nbt.NBTBase)(life5_17)))) ? 1 : 0);
    }
    return ((forestValue46_56_0) != 0);
    }
    life5_17 = moom.Kb.a(((net.minecraft.nbt.NBTBase)(life5_17)), ((java.lang.String)(this.b)));
    forestValue46_63_0 = life5_17;
    }
    if (!((forestValue46_63_0 == null))) {
        break forest_join_66;
    }
    return ((0) != 0);
    }
    return ((moom.Kb)(this)).b(((net.minecraft.nbt.NBTBase)(life5_17)));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5723_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Kb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean b(net.minecraft.nbt.NBTBase p0) {
net.minecraft.nbt.NBTBase forwardValue2497_13_0;
    net.minecraft.nbt.NBTBase spill2497_0;
    long life2_3;
    int life4_5;
    java.lang.String life5_21;
    forward_join_13: {
    forward_join_12: {
    life2_3 = (moom.Kb.h ^ 77108574671212L);
    life4_5 = moom.J_.b();
    spill2497_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue2497_13_0 = spill2497_0;
        break forward_join_13;
    }
    if (!((spill2497_0 == null))) {
        break forward_join_12;
    }
    return ((0) != 0);
    }
    forwardValue2497_13_0 = p0;
    }
    life5_21 = moom.Kb.a(((net.minecraft.nbt.NBTBase)(forwardValue2497_13_0)), ((int)(this.f)));
    return ((moom.Kb)(this)).a(((java.lang.String)(life5_21)));
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Kb.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill2920_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2920_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2920_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2920_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2920_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2920_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 30308);
    if (((moom.Kb.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Kb.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Kb.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Kb", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Kb.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Kb.j)[life5_8] = moom.Kb.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Kb.j)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5727_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Kb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private boolean a(net.minecraft.nbt.NBTBase p0) {
int lexicalValue894_38_0;
    int lexicalValue894_43_0;
    int lexicalValue894_75_0;
    int spill894_0;
    boolean spill894_1;
    boolean spill894_2;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagCompound life5_16;
    java.util.Iterator life6_20;
    java.lang.String life7_27;
    net.minecraft.nbt.NBTBase life8_31;
    net.minecraft.nbt.NBTTagList life5_60;
    int life6_63;
    int life7_65;
    net.minecraft.nbt.NBTBase life8_72;
    lexical_join_75: {
    lexical_join_74: {
    lexical_join_43: {
    lexical_join_41: {
    life2_3 = (moom.Kb.h ^ 21810283486915L);
    life4_5 = moom.J_.c();
    spill894_0 = ((p0 instanceof net.minecraft.nbt.NBTTagCompound) ? 1 : 0);
    if (!((life4_5 != 0))) {
        lexicalValue894_43_0 = spill894_0;
        break lexical_join_43;
    }
    if (!((spill894_0 != 0))) {
        break lexical_join_41;
    }
    life5_16 = ((net.minecraft.nbt.NBTTagCompound)(p0));
    life6_20 = ((java.util.Set)(((net.minecraft.nbt.NBTTagCompound)(life5_16)).a__Set())).iterator();
    lexical_cycle_18: while (true) {
    lexical_join_39: {
    lexical_join_38: {
    if (!(((java.util.Iterator)(life6_20)).hasNext())) {
        break lexical_join_41;
    }
    life7_27 = ((java.lang.String)(((java.util.Iterator)(life6_20)).next()));
    life8_31 = ((net.minecraft.nbt.NBTTagCompound)(life5_16)).a__yn(((java.lang.String)(life7_27)));
    spill894_1 = ((moom.Kb)(this)).b(((net.minecraft.nbt.NBTBase)(life8_31)));
    if (!((life4_5 != 0))) {
        lexicalValue894_43_0 = ((spill894_1) ? 1 : 0);
        break lexical_join_43;
    }
    if (!((life4_5 != 0))) {
        lexicalValue894_38_0 = ((spill894_1) ? 1 : 0);
        break lexical_join_38;
    }
    if (!(spill894_1)) {
        break lexical_join_39;
    }
    lexicalValue894_38_0 = 1;
    }
    return ((lexicalValue894_38_0) != 0);
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue894_43_0 = ((p0 instanceof net.minecraft.nbt.NBTTagList) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue894_75_0 = lexicalValue894_43_0;
        break lexical_join_75;
    }
    if (!((lexicalValue894_43_0 != 0))) {
        break lexical_join_74;
    }
    life5_60 = ((net.minecraft.nbt.NBTTagList)(p0));
    life6_63 = ((net.minecraft.nbt.NBTTagList)(life5_60)).a__Int();
    life7_65 = 0;
    lexical_cycle_54: while (true) {
    lexical_join_72: {
    lexical_join_71: {
    if (!((life7_65 < life6_63))) {
        break lexical_join_74;
    }
    life8_72 = ((net.minecraft.nbt.NBTTagList)(life5_60)).b(((int)(life7_65)));
    if (!((life4_5 != 0))) {
        break lexical_join_72;
    }
    spill894_2 = ((moom.Kb)(this)).b(((net.minecraft.nbt.NBTBase)(life8_72)));
    if (!((life4_5 != 0))) {
        lexicalValue894_75_0 = ((spill894_2) ? 1 : 0);
        break lexical_join_75;
    }
    if (!(spill894_2)) {
        break lexical_join_71;
    }
    return ((1) != 0);
    }
    life7_65 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_54; }
    break lexical_cycle_54;
    }
    }
    lexicalValue894_75_0 = 0;
    }
    return ((lexicalValue894_75_0) != 0);
}


private static net.minecraft.nbt.NBTBase a(net.minecraft.nbt.NBTBase p0, java.lang.String p1) {
int forwardValue2495_22_0;
    net.minecraft.nbt.NBTBase forwardValue2495_24_0;
    int forwardValue2495_45_0;
    int forwardValue2495_51_0;
    net.minecraft.nbt.NBTBase forwardValue2495_59_0;
    int spill2495_0;
    net.minecraft.nbt.NBTBase spill2495_1;
    boolean spill2495_2;
    int spill2495_3;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagCompound life5_16;
    net.minecraft.nbt.NBTTagList life6_31;
    int life7_56;
    forward_join_60: {
    forward_join_59: {
    forward_join_58: {
    forward_join_51: {
    forward_join_45: {
    forward_join_42: {
    forward_join_24: {
    forward_join_22: {
    forward_join_18: {
    life2_3 = (moom.Kb.h ^ 2578028684515L);
    life4_5 = moom.J_.c();
    spill2495_0 = ((p0 instanceof net.minecraft.nbt.NBTTagCompound) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue2495_22_0 = spill2495_0;
        break forward_join_22;
    }
    if (!((spill2495_0 != 0))) {
        break forward_join_18;
    }
    life5_16 = ((net.minecraft.nbt.NBTTagCompound)(p0));
    return ((net.minecraft.nbt.NBTTagCompound)(life5_16)).a__yn(((java.lang.String)(p1)));
    }
    spill2495_1 = p0;
    if (!((life4_5 != 0))) {
        forwardValue2495_24_0 = spill2495_1;
        break forward_join_24;
    }
    forwardValue2495_22_0 = ((spill2495_1 instanceof net.minecraft.nbt.NBTTagList) ? 1 : 0);
    }
    if (!((forwardValue2495_22_0 != 0))) {
        break forward_join_60;
    }
    forwardValue2495_24_0 = p0;
    }
    life6_31 = ((net.minecraft.nbt.NBTTagList)(forwardValue2495_24_0));
    spill2495_2 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_f48dbf245b3b_invokedynamic2495_7(1137, (8452502141112323285L ^ life2_3)))));
    if (!((life4_5 != 0))) {
        forwardValue2495_45_0 = ((spill2495_2) ? 1 : 0);
        break forward_join_45;
    }
    if (!(spill2495_2)) {
        break forward_join_42;
    }
    return new moom.ys(((net.minecraft.nbt.NBTTagList)(life6_31)).a__Int());
    }
    forwardValue2495_45_0 = moom.BU.a(((java.lang.String)(p1)), ((int)(-1)));
    }
    life7_56 = forwardValue2495_45_0;
    spill2495_3 = life7_56;
    if (!((life4_5 != 0))) {
        forwardValue2495_51_0 = spill2495_3;
        break forward_join_51;
    }
    if (!((spill2495_3 >= 0))) {
        break forward_join_58;
    }
    forwardValue2495_51_0 = life7_56;
    }
    if (!((forwardValue2495_51_0 < ((net.minecraft.nbt.NBTTagList)(life6_31)).a__Int()))) {
        break forward_join_58;
    }
    forwardValue2495_59_0 = ((net.minecraft.nbt.NBTTagList)(life6_31)).b(((int)(life7_56)));
    break forward_join_59;
    }
    forwardValue2495_59_0 = null;
    }
    return forwardValue2495_59_0;
    }
    return null;
}


public boolean a(java.lang.String p0) { return __sourceHandlerCall_8c331877ade9488e1d92(this, p0); }


private boolean a(java.lang.String p0, java.lang.String p1) {
long local3 = (moom.Kb.h ^ 97212206627734L);
    return moom.Ob.a(((java.lang.String)(p0)), ((java.lang.String)(p1)), ((char)(__sourceIntrinsic_6282b5e30453_originalDynamicSite1250_1(26620, (2444927914379606485L ^ local3)))), ((char)(__sourceIntrinsic_6282b5e30453_originalDynamicSite1250_2(9179, (5431407227342208496L ^ local3)))));
}


private static java.lang.String a(net.minecraft.nbt.NBTBase p0, int p1) {
net.minecraft.nbt.NBTBase forwardValue2494_13_0;
    int forwardValue2494_25_0;
    int forwardValue2494_54_0;
    java.lang.String forwardValue2494_55_0;
    int forwardValue2494_58_0;
    int forwardValue2494_70_0;
    int forwardValue2494_82_0;
    int forwardValue2494_94_0;
    int forwardValue2494_108_0;
    net.minecraft.nbt.NBTBase forwardValue2494_117_0;
    net.minecraft.nbt.NBTBase spill2494_0;
    int spill2494_1;
    int spill2494_2;
    net.minecraft.nbt.NBTBase spill2494_3;
    long life2_3;
    int life4_5;
    moom.yA life5_27;
    moom.ys life6_41;
    moom.yp life7_82;
    moom.yu life8_97;
    moom.yt life9_112;
    moom.yr life10_127;
    moom.yq life11_142;
    forward_join_117: {
    forward_join_116: {
    forward_join_108: {
    forward_join_104: {
    forward_join_94: {
    forward_join_92: {
    forward_join_82: {
    forward_join_80: {
    forward_join_70: {
    forward_join_68: {
    forward_join_58: {
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_52: {
    forward_join_25: {
    forward_join_23: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (moom.Kb.h ^ 93089893636307L);
    life4_5 = moom.J_.b();
    spill2494_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue2494_13_0 = spill2494_0;
        break forward_join_13;
    }
    if (!((spill2494_0 == null))) {
        break forward_join_12;
    }
    return null;
    }
    forwardValue2494_13_0 = p0;
    }
    spill2494_1 = ((forwardValue2494_13_0 instanceof moom.yA) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue2494_25_0 = spill2494_1;
        break forward_join_25;
    }
    if (!((spill2494_1 != 0))) {
        break forward_join_23;
    }
    life5_27 = ((moom.yA)(p0));
    return ((moom.yA)(life5_27)).a__String();
    }
    forwardValue2494_25_0 = ((p0 instanceof moom.ys) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue2494_58_0 = forwardValue2494_25_0;
        break forward_join_58;
    }
    if (!((forwardValue2494_25_0 != 0))) {
        break forward_join_56;
    }
    life6_41 = ((moom.ys)(p0));
    spill2494_2 = p1;
    if (!((life4_5 == 0))) {
        forwardValue2494_54_0 = spill2494_2;
        break forward_join_54;
    }
    if (!((spill2494_2 == 1))) {
        break forward_join_52;
    }
    forwardValue2494_55_0 = __sourceIntrinsic_36a24ed7139e_invokedynamic2494_12(moom.Ob.a(((java.lang.String)(java.lang.Integer.toHexString(((int)(((moom.ys)(life6_41)).a__Int()))))), ((int)(__sourceIntrinsic_36a24ed7139e_invokedynamic2494_9(126, (8065163425171668243L ^ life2_3)))), ((char)(__sourceIntrinsic_36a24ed7139e_invokedynamic2494_10(22043, (7065550682123742066L ^ life2_3))))));
    break forward_join_55;
    }
    forwardValue2494_54_0 = ((moom.ys)(life6_41)).a__Int();
    }
    forwardValue2494_55_0 = java.lang.Integer.toString(((int)(forwardValue2494_54_0)));
    }
    return forwardValue2494_55_0;
    }
    forwardValue2494_58_0 = ((p0 instanceof moom.yp) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue2494_70_0 = forwardValue2494_58_0;
        break forward_join_70;
    }
    if (!((forwardValue2494_58_0 != 0))) {
        break forward_join_68;
    }
    life7_82 = ((moom.yp)(p0));
    return java.lang.Byte.toString(((byte)(((moom.yp)(life7_82)).b__sourceReturn_7d493934e8())));
    }
    forwardValue2494_70_0 = ((p0 instanceof moom.yu) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue2494_82_0 = forwardValue2494_70_0;
        break forward_join_82;
    }
    if (!((forwardValue2494_70_0 != 0))) {
        break forward_join_80;
    }
    life8_97 = ((moom.yu)(p0));
    return java.lang.Short.toString(((short)(((moom.yu)(life8_97)).a__Short())));
    }
    forwardValue2494_82_0 = ((p0 instanceof moom.yt) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue2494_94_0 = forwardValue2494_82_0;
        break forward_join_94;
    }
    if (!((forwardValue2494_82_0 != 0))) {
        break forward_join_92;
    }
    life9_112 = ((moom.yt)(p0));
    return java.lang.Long.toString(((long)(((moom.yt)(life9_112)).a__Long())));
    }
    forwardValue2494_94_0 = ((p0 instanceof moom.yr) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue2494_108_0 = forwardValue2494_94_0;
        break forward_join_108;
    }
    if (!((forwardValue2494_94_0 != 0))) {
        break forward_join_104;
    }
    life10_127 = ((moom.yr)(p0));
    return java.lang.Float.toString(((float)(((moom.yr)(life10_127)).a__Float())));
    }
    spill2494_3 = p0;
    if (!((life4_5 == 0))) {
        forwardValue2494_117_0 = spill2494_3;
        break forward_join_117;
    }
    forwardValue2494_108_0 = ((spill2494_3 instanceof moom.yq) ? 1 : 0);
    }
    if (!((forwardValue2494_108_0 != 0))) {
        break forward_join_116;
    }
    life11_142 = ((moom.yq)(p0));
    return java.lang.Double.toString(((double)(((moom.yq)(life11_142)).a__Double())));
    }
    forwardValue2494_117_0 = p0;
    }
    return ((net.minecraft.nbt.NBTBase)(forwardValue2494_117_0)).toString();
}


public boolean a(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue2496_15_0;
    int forwardValue2496_17_0;
    boolean spill2496_0;
    long life2_3;
    int life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (moom.Kb.h ^ 99166507925493L);
    life4_5 = moom.J_.c();
    spill2496_0 = this.c;
    if (!((life4_5 != 0))) {
        forwardValue2496_15_0 = ((spill2496_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((spill2496_0 != ((moom.Kb)(this)).b(((net.minecraft.nbt.NBTTagCompound)(p0)))))) {
        break forward_join_16;
    }
    forwardValue2496_15_0 = 1;
    }
    forwardValue2496_17_0 = forwardValue2496_15_0;
    break forward_join_17;
    }
    forwardValue2496_17_0 = 0;
    }
    return ((forwardValue2496_17_0) != 0);
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite650_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_53(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_62(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b0af99e5dd1f5f0c_originalDynamicSite552_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b5a4712eca9_invokedynamic102_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6282b5e30453_originalDynamicSite1250_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6282b5e30453_originalDynamicSite1250_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5727_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_36a24ed7139e_invokedynamic2494_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_36a24ed7139e_invokedynamic2494_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_36a24ed7139e_invokedynamic2494_12(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f48dbf245b3b_invokedynamic2495_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5723_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic896_10(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
