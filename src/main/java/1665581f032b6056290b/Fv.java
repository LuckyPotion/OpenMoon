package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Fv {

private static byte[] a;

private java.io.File b;

private java.io.RandomAccessFile c;

private int[] d;

private int[] e;

private java.util.List<java.lang.Boolean> f;

private int g;

private long h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

private static long[] m;

private static java.lang.Long[] n;

private static java.util.Map o;

public Fv(java.io.File p0) { super(); __sourceHandlerCall_c3b670ac1bd1179146c4(this, p0); }


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-6923240362731932644L)), ((long)(-1999289899269041391L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(196398953790758L)))));
    long local22_life6 = (moom.Fv.i ^ 48380047373204L);
    l = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill656_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill656_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill656_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill656_14 = new byte[8];
    (__sourceSpill656_14)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill656_14)[local12_life15] = ((byte) ((int) ((local22_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation656_16 = __sourceSpill656_14;
    ((javax.crypto.Cipher)(__sourceSpill656_11)).init(((int)(__sourceSpill656_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill656_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation656_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life19 = new long[12];
    int local14_life20 = 0;
    java.lang.String local15_life21;
    int local16_life23 = ((java.lang.String)((local15_life21 = "\000¤Ö\th|Mè\033ê!N­;Ì\035\020t!ÎT\026QÒÌO@\001¨;\000\036\000\031]üËTD\023ÚÅ\022\035Ë\004é}\031AF|oæulð®Ùô\031§Ê7åÊ."))).length();
    int local13_life24 = 0;
    do {
        java.lang.String __sourceSpill656_25 = local15_life21;
        int __sourceSpill656_26 = local13_life24;
        local13_life24 += 8;
        byte[] local18_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill656_25)).substring(((int)(__sourceSpill656_26)), ((int)(local13_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill656_30 = local17_life19;
        int __sourceSpill656_31 = local14_life20;
        local14_life20 += 1;
        long local19_life32 = (((((((((((long) (local18_life29)[0]) & 255L) << 56) | ((((long) (local18_life29)[1]) & 255L) << 48)) | ((((long) (local18_life29)[2]) & 255L) << 40)) | ((((long) (local18_life29)[3]) & 255L) << 32)) | ((((long) (local18_life29)[4]) & 255L) << 24)) | ((((long) (local18_life29)[5]) & 255L) << 16)) | ((((long) (local18_life29)[6]) & 255L) << 8)) | (((long) (local18_life29)[7]) & 255L));
        byte[] __sourceSpill656_33 = new byte[8];
        (__sourceSpill656_33)[0] = ((byte) ((int) (local19_life32 >>> 56)));
        (__sourceSpill656_33)[1] = ((byte) ((int) (local19_life32 >>> 48)));
        (__sourceSpill656_33)[2] = ((byte) ((int) (local19_life32 >>> 40)));
        (__sourceSpill656_33)[3] = ((byte) ((int) (local19_life32 >>> 32)));
        (__sourceSpill656_33)[4] = ((byte) ((int) (local19_life32 >>> 24)));
        (__sourceSpill656_33)[5] = ((byte) ((int) (local19_life32 >>> 16)));
        (__sourceSpill656_33)[6] = ((byte) ((int) (local19_life32 >>> 8)));
        (__sourceSpill656_33)[7] = ((byte) ((int) local19_life32));
        javax.crypto.Cipher __sourceSpill656_34 = local11_life9;
        byte[] local21_life36 = ((javax.crypto.Cipher)(__sourceSpill656_34)).doFinal(((byte[])(__sourceSpill656_33)));
        (__sourceSpill656_30)[__sourceSpill656_31] = (((((((((((long) (local21_life36)[0]) & 255L) << 56) | ((((long) (local21_life36)[1]) & 255L) << 48)) | ((((long) (local21_life36)[2]) & 255L) << 40)) | ((((long) (local21_life36)[3]) & 255L) << 32)) | ((((long) (local21_life36)[4]) & 255L) << 24)) | ((((long) (local21_life36)[5]) & 255L) << 16)) | ((((long) (local21_life36)[6]) & 255L) << 8)) | (((long) (local21_life36)[7]) & 255L));
    } while ((!(local13_life24 >= local16_life23)));
    local16_life23 = ((java.lang.String)((local15_life21 = "F#úÆÞj\001aX#.ýÉ°}l"))).length();
    local13_life24 = 0;
    do {
        java.lang.String __sourceSpill656_38 = local15_life21;
        int __sourceSpill656_39 = local13_life24;
        local13_life24 += 8;
        byte[] local18_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill656_38)).substring(((int)(__sourceSpill656_39)), ((int)(local13_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill656_43 = local17_life19;
        int __sourceSpill656_44 = local14_life20;
        local14_life20 += 1;
        long local19_life45 = (((((((((((long) (local18_life42)[0]) & 255L) << 56) | ((((long) (local18_life42)[1]) & 255L) << 48)) | ((((long) (local18_life42)[2]) & 255L) << 40)) | ((((long) (local18_life42)[3]) & 255L) << 32)) | ((((long) (local18_life42)[4]) & 255L) << 24)) | ((((long) (local18_life42)[5]) & 255L) << 16)) | ((((long) (local18_life42)[6]) & 255L) << 8)) | (((long) (local18_life42)[7]) & 255L));
        byte[] __sourceSpill656_46 = new byte[8];
        (__sourceSpill656_46)[0] = ((byte) ((int) (local19_life45 >>> 56)));
        (__sourceSpill656_46)[1] = ((byte) ((int) (local19_life45 >>> 48)));
        (__sourceSpill656_46)[2] = ((byte) ((int) (local19_life45 >>> 40)));
        (__sourceSpill656_46)[3] = ((byte) ((int) (local19_life45 >>> 32)));
        (__sourceSpill656_46)[4] = ((byte) ((int) (local19_life45 >>> 24)));
        (__sourceSpill656_46)[5] = ((byte) ((int) (local19_life45 >>> 16)));
        (__sourceSpill656_46)[6] = ((byte) ((int) (local19_life45 >>> 8)));
        (__sourceSpill656_46)[7] = ((byte) ((int) local19_life45));
        javax.crypto.Cipher __sourceSpill656_47 = local11_life9;
        byte[] local21_life49 = ((javax.crypto.Cipher)(__sourceSpill656_47)).doFinal(((byte[])(__sourceSpill656_46)));
        (__sourceSpill656_43)[__sourceSpill656_44] = (((((((((((long) (local21_life49)[0]) & 255L) << 56) | ((((long) (local21_life49)[1]) & 255L) << 48)) | ((((long) (local21_life49)[2]) & 255L) << 40)) | ((((long) (local21_life49)[3]) & 255L) << 32)) | ((((long) (local21_life49)[4]) & 255L) << 24)) | ((((long) (local21_life49)[5]) & 255L) << 16)) | ((((long) (local21_life49)[6]) & 255L) << 8)) | (((long) (local21_life49)[7]) & 255L));
    } while ((!(local13_life24 >= local16_life23)));
    j = ((long[])(local17_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[12]));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill656_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill656_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill656_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill656_59 = new byte[8];
    (__sourceSpill656_59)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill656_59)[local1_life60] = ((byte) ((int) ((local22_life6 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation656_61 = __sourceSpill656_59;
    ((javax.crypto.Cipher)(__sourceSpill656_56)).init(((int)(__sourceSpill656_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill656_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation656_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[9];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "GÄT`2b~0=­ýÅ\000;I[wv\037ø#ãRà#U'8]ÖÅ´fµÀßÈ³\003Ü\177ºH\\+l"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill656_70 = local4_life66;
        int __sourceSpill656_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill656_70)).substring(((int)(__sourceSpill656_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill656_75 = local6_life64;
        int __sourceSpill656_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill656_78 = new byte[8];
        (__sourceSpill656_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill656_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill656_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill656_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill656_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill656_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill656_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill656_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill656_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill656_79)).doFinal(((byte[])(__sourceSpill656_78)));
        (__sourceSpill656_75)[__sourceSpill656_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    local5_life68 = ((java.lang.String)((local4_life66 = "Réì\b¶f-dÂ\00646ÂùA"))).length();
    local2_life69 = 0;
    do {
        java.lang.String __sourceSpill656_83 = local4_life66;
        int __sourceSpill656_84 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill656_83)).substring(((int)(__sourceSpill656_84)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill656_88 = local6_life64;
        int __sourceSpill656_89 = local3_life65;
        local3_life65 += 1;
        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));
        byte[] __sourceSpill656_91 = new byte[8];
        (__sourceSpill656_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));
        (__sourceSpill656_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));
        (__sourceSpill656_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));
        (__sourceSpill656_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));
        (__sourceSpill656_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));
        (__sourceSpill656_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));
        (__sourceSpill656_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));
        (__sourceSpill656_91)[7] = ((byte) ((int) local8_life90));
        javax.crypto.Cipher __sourceSpill656_92 = local0_life54;
        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill656_92)).doFinal(((byte[])(__sourceSpill656_91)));
        (__sourceSpill656_88)[__sourceSpill656_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    m = ((long[])(local6_life64));
    n = ((java.lang.Long[])(new java.lang.Long[9]));
    a = ((byte[])(new byte[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite656_97(13154, (2596455189817073308L ^ local22_life6))]));
}

private static native <E extends Throwable> void __sourceHandlerCall_c3b670ac1bd1179146c4(moom.Fv a0, java.io.File a1) throws E;
private static final class __SourceHandler_c3b670ac1bd1179146c4 {

public static void f392(moom.Fv receiver, java.io.File p0) throws Throwable {
    int forestValue392_55_0;
    int forestValue392_115_0;
    int forestValue392_152_0;
    int forestValue392_234_0;
    int forestValue392_267_0;
    int spill392_0;
    boolean spill392_1;
    int spill392_2;
    int spill392_3;
    long life2_3;
    int life4_23;
    int life5_61;
    int life5_125;
    int life6_165;
    int life6_197;
    int life7_208;
    int life8_247;
    int life6_281;
    int life7_292;
    forest_join_289: {
    forest_join_267: {
    forest_join_266: {
    forest_join_188: {
    forest_join_172: {
    forest_join_157: {
    forest_join_152: {
    forest_join_142: {
    forest_join_115: {
    forest_join_104: {
    forest_join_94: {
    forest_join_78: {
    forest_join_76: {
    forest_join_55: {
    forest_join_39: {
    life2_3 = (__fieldRead392_0() ^ 18340591513987L);
    __directSuperInit392_1(receiver);
    spill392_0 = __call392_2();
    __fieldWrite392_4(receiver, new int[__invokedynamic392_3(26342, (1244013109350975755L ^ life2_3))]);
    __fieldWrite392_6(receiver, new int[__invokedynamic392_5(4010, (8192872139329609805L ^ life2_3))]);
    life4_23 = spill392_0;
    __fieldWrite392_7(receiver, p0);
    __fieldWrite392_8(receiver, 0);
    spill392_1 = __call392_9(p0);
    if (!((life4_23 != 0))) {
        forestValue392_55_0 = __integerCategory392_10(spill392_1);
        break forest_join_55;
    }
    if (!(spill392_1)) {
        break forest_join_39;
    }
    __fieldWrite392_12(receiver, __call392_11(p0));
    }
    __fieldWrite392_13(receiver, new java.io.RandomAccessFile(p0, "rw"));
    forestValue392_55_0 = __numericCompare392_17(__call392_15(__fieldRead392_14(receiver)), __invokedynamic392_16(16641, (487062556781813829L ^ life2_3)));
    }
    if (!((life4_23 != 0))) {
        forestValue392_115_0 = forestValue392_55_0;
        break forest_join_115;
    }
    if (!((forestValue392_55_0 < 0))) {
        break forest_join_104;
    }
    life5_61 = 0;
    forest_cycle_60: while (true) {
    if (!((life5_61 < __invokedynamic392_18(4010, (8192872139329609805L ^ life2_3))))) {
        break forest_join_76;
    }
    __call392_20(__fieldRead392_19(receiver), 0);
    life5_61 += 1;
    if (!((life4_23 != 0))) {
        break forest_join_78;
    }
    if (!((life4_23 == 0))) {
        continue forest_cycle_60;
    }
    break forest_cycle_60;
    }
    }
    life5_61 = 0;
    }
    forest_cycle_78: while (true) {
    if (!((life5_61 < __invokedynamic392_21(4010, (8192872139329609805L ^ life2_3))))) {
        break forest_join_94;
    }
    __call392_23(__fieldRead392_22(receiver), 0);
    life5_61 += 1;
    if (!((life4_23 != 0))) {
        break forest_join_104;
    }
    if (!((life4_23 == 0))) {
        continue forest_cycle_78;
    }
    break forest_cycle_78;
    }
    }
    moom.Fv __stackOp392_24_0 = receiver;
    __fieldWrite392_27(__stackOp392_24_0, (__fieldRead392_25(__stackOp392_24_0) + __invokedynamic392_26(12093, (4916104170439999707L ^ life2_3))));
    }
    forestValue392_115_0 = __numericCompare392_31((__call392_29(__fieldRead392_28(receiver)) & __invokedynamic392_30(3326, (3347059047534849465L ^ life2_3))), 0L);
    }
    if (!((life4_23 != 0))) {
        forestValue392_152_0 = forestValue392_115_0;
        break forest_join_152;
    }
    if (!((forestValue392_115_0 != 0))) {
        break forest_join_142;
    }
    life5_125 = 0;
    forest_cycle_120: while (true) {
    if (!((__numericCompare392_35(((long) life5_125), (__call392_33(__fieldRead392_32(receiver)) & __invokedynamic392_34(9800, (3270409289371338505L ^ life2_3)))) < 0))) {
        break forest_join_142;
    }
    __call392_37(__fieldRead392_36(receiver), 0);
    life5_125 += 1;
    if (!((life4_23 != 0))) {
        break forest_join_157;
    }
    if (!((life4_23 == 0))) {
        continue forest_cycle_120;
    }
    break forest_cycle_120;
    }
    }
    forestValue392_152_0 = (((int) __call392_39(__fieldRead392_38(receiver))) / __invokedynamic392_40(6533, (7734266397783340651L ^ life2_3)));
    }
    life5_125 = forestValue392_152_0;
    __fieldWrite392_42(receiver, __call392_41(life5_125));
    }
    life6_165 = 0;
    forest_cycle_159: while (true) {
    if (!((life6_165 < life5_125))) {
        break forest_join_172;
    }
    __call392_45(__fieldRead392_43(receiver), __fieldRead392_44());
    life6_165 += 1;
    if (!((life4_23 != 0))) {
        break forest_join_188;
    }
    if (!((life4_23 == 0))) {
        continue forest_cycle_159;
    }
    break forest_cycle_159;
    }
    }
    __call392_48(__fieldRead392_46(receiver), 0, __fieldRead392_47());
    __call392_51(__fieldRead392_49(receiver), 1, __fieldRead392_50());
    __call392_53(__fieldRead392_52(receiver), 0L);
    }
    life6_197 = 0;
    forest_cycle_190: while (true) {
    forest_join_264: {
    forest_join_263: {
    forest_join_234: {
    if (!((life6_197 < __invokedynamic392_54(4010, (8192872139329609805L ^ life2_3))))) {
        break forest_join_266;
    }
    life7_208 = __call392_56(__fieldRead392_55(receiver));
    (__fieldRead392_57(receiver))[life6_197] = life7_208;
    if (!((life4_23 != 0))) {
        break forest_join_264;
    }
    spill392_2 = life7_208;
    if (!((life4_23 != 0))) {
        forestValue392_267_0 = spill392_2;
        break forest_join_267;
    }
    if (!((spill392_2 != 0))) {
        break forest_join_263;
    }
    spill392_3 = ((life7_208 >> __invokedynamic392_58(23540, (5048018704699094040L ^ life2_3))) + (life7_208 & __invokedynamic392_59(4430, (6211083257358532257L ^ life2_3))));
    if (!((life4_23 != 0))) {
        forestValue392_234_0 = spill392_3;
        break forest_join_234;
    }
    if (!((spill392_3 <= __call392_61(__fieldRead392_60(receiver))))) {
        break forest_join_263;
    }
    forestValue392_234_0 = 0;
    }
    life8_247 = forestValue392_234_0;
    forest_cycle_235: while (true) {
    if (!((life8_247 < (life7_208 & __invokedynamic392_62(11464, (3666750539178836768L ^ life2_3)))))) {
        break forest_join_263;
    }
    __call392_66(__fieldRead392_63(receiver), ((life7_208 >> __invokedynamic392_64(15355, (4214512255826531345L ^ life2_3))) + life8_247), __fieldRead392_65());
    life8_247 += 1;
    if (!((life4_23 != 0))) {
        break forest_join_264;
    }
    if (!((life4_23 == 0))) {
        continue forest_cycle_235;
    }
    break forest_cycle_235;
    }
    }
    life6_197 += 1;
    }
    if (!((life4_23 == 0))) {
        continue forest_cycle_190;
    }
    break forest_cycle_190;
    }
    }
    forestValue392_267_0 = 0;
    }
    life6_281 = forestValue392_267_0;
    forest_cycle_268: while (true) {
    if (!((life6_281 < __invokedynamic392_67(4010, (8192872139329609805L ^ life2_3))))) {
        break forest_join_289;
    }
    life7_292 = __call392_69(__fieldRead392_68(receiver));
    (__fieldRead392_70(receiver))[life6_281] = life7_292;
    life6_281 += 1;
    if (!((life4_23 != 0))) {
        break forest_join_289;
    }
    if (!((life4_23 == 0))) {
        continue forest_cycle_268;
    }
    break forest_cycle_268;
    }
    }
    return;
}
public static void h392_0(java.io.IOException p0) throws Throwable {
    throw __call3039200_0(p0);
}
public static void h392_1(java.io.IOException p0) throws Throwable {
    throw __call3039201_0(p0);
}
public static void h392_2(java.io.IOException p0) throws Throwable {
    throw __call3039202_0(p0);
}
public static void h392_3(java.io.IOException p0) throws Throwable {
    throw __call3039203_0(p0);
}
public static void h392_4(java.io.IOException p0) throws Throwable {
    throw __call3039204_0(p0);
}
public static void h392_5(java.io.IOException p0) throws Throwable {
    throw __call3039205_0(p0);
}
public static void h392_6(java.io.IOException p0) throws Throwable {
    throw __call3039206_0(p0);
}
public static void h392_7(java.io.IOException p0) throws Throwable {
    throw __call3039207_0(p0);
}
public static void h392_8(java.io.IOException p0) throws Throwable {
    throw __call3039208_0(p0);
}
public static void h392_9(java.io.IOException p0) throws Throwable {
    throw __call3039209_0(p0);
}
public static void h392_10(java.io.IOException p0) throws Throwable {
    throw __call3039210_0(p0);
}
public static void h392_11(java.io.IOException p0) throws Throwable {
    throw __call3039211_0(p0);
}
public static void h392_12(java.io.IOException p0) throws Throwable {
    throw __call3039212_0(p0);
}
public static void h392_13(java.io.IOException p0) throws Throwable {
    throw __call3039213_0(p0);
}
public static void h392_14(java.io.IOException p0) throws Throwable {
    throw __call3039214_0(p0);
}
public static void h392_15(java.io.IOException p0, int p1) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    __call3039215_0(life1_2);
    return;
}
private static native long __fieldRead392_0() throws Throwable;
private static native void __directSuperInit392_1(moom.Fv a0) throws Throwable;
private static native int __call392_2() throws Throwable;
private static native int __invokedynamic392_3(int a0, long a1) throws Throwable;
private static native void __fieldWrite392_4(moom.Fv a0, int[] a1) throws Throwable;
private static native int __invokedynamic392_5(int a0, long a1) throws Throwable;
private static native void __fieldWrite392_6(moom.Fv a0, int[] a1) throws Throwable;
private static native void __fieldWrite392_7(moom.Fv a0, java.io.File a1) throws Throwable;
private static native void __fieldWrite392_8(moom.Fv a0, int a1) throws Throwable;
private static native boolean __call392_9(java.io.File a0) throws Throwable;
private static native int __integerCategory392_10(boolean value) throws Throwable;
private static native long __call392_11(java.io.File a0) throws Throwable;
private static native void __fieldWrite392_12(moom.Fv a0, long a1) throws Throwable;
private static native void __fieldWrite392_13(moom.Fv a0, java.io.RandomAccessFile a1) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead392_14(moom.Fv a0) throws Throwable;
private static native long __call392_15(java.io.RandomAccessFile a0) throws Throwable;
private static native long __invokedynamic392_16(int a0, long a1) throws Throwable;
private static native int __numericCompare392_17(long a0, long a1) throws Throwable;
private static native int __invokedynamic392_18(int a0, long a1) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead392_19(moom.Fv a0) throws Throwable;
private static native void __call392_20(java.io.RandomAccessFile a0, int a1) throws Throwable;
private static native int __invokedynamic392_21(int a0, long a1) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead392_22(moom.Fv a0) throws Throwable;
private static native void __call392_23(java.io.RandomAccessFile a0, int a1) throws Throwable;
private static native int __fieldRead392_25(moom.Fv a0) throws Throwable;
private static native int __invokedynamic392_26(int a0, long a1) throws Throwable;
private static native void __fieldWrite392_27(moom.Fv a0, int a1) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead392_28(moom.Fv a0) throws Throwable;
private static native long __call392_29(java.io.RandomAccessFile a0) throws Throwable;
private static native long __invokedynamic392_30(int a0, long a1) throws Throwable;
private static native int __numericCompare392_31(long a0, long a1) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead392_32(moom.Fv a0) throws Throwable;
private static native long __call392_33(java.io.RandomAccessFile a0) throws Throwable;
private static native long __invokedynamic392_34(int a0, long a1) throws Throwable;
private static native int __numericCompare392_35(long a0, long a1) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead392_36(moom.Fv a0) throws Throwable;
private static native void __call392_37(java.io.RandomAccessFile a0, int a1) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead392_38(moom.Fv a0) throws Throwable;
private static native long __call392_39(java.io.RandomAccessFile a0) throws Throwable;
private static native int __invokedynamic392_40(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call392_41(int a0) throws Throwable;
private static native void __fieldWrite392_42(moom.Fv a0, java.util.ArrayList a1) throws Throwable;
private static native java.util.List __fieldRead392_43(moom.Fv a0) throws Throwable;
private static native java.lang.Boolean __fieldRead392_44() throws Throwable;
private static native boolean __call392_45(java.util.List a0, java.lang.Boolean a1) throws Throwable;
private static native java.util.List __fieldRead392_46(moom.Fv a0) throws Throwable;
private static native java.lang.Boolean __fieldRead392_47() throws Throwable;
private static native java.lang.Object __call392_48(java.util.List a0, int a1, java.lang.Boolean a2) throws Throwable;
private static native java.util.List __fieldRead392_49(moom.Fv a0) throws Throwable;
private static native java.lang.Boolean __fieldRead392_50() throws Throwable;
private static native java.lang.Object __call392_51(java.util.List a0, int a1, java.lang.Boolean a2) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead392_52(moom.Fv a0) throws Throwable;
private static native void __call392_53(java.io.RandomAccessFile a0, long a1) throws Throwable;
private static native int __invokedynamic392_54(int a0, long a1) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead392_55(moom.Fv a0) throws Throwable;
private static native int __call392_56(java.io.RandomAccessFile a0) throws Throwable;
private static native int[] __fieldRead392_57(moom.Fv a0) throws Throwable;
private static native int __invokedynamic392_58(int a0, long a1) throws Throwable;
private static native int __invokedynamic392_59(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead392_60(moom.Fv a0) throws Throwable;
private static native int __call392_61(java.util.List a0) throws Throwable;
private static native int __invokedynamic392_62(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead392_63(moom.Fv a0) throws Throwable;
private static native int __invokedynamic392_64(int a0, long a1) throws Throwable;
private static native java.lang.Boolean __fieldRead392_65() throws Throwable;
private static native java.lang.Object __call392_66(java.util.List a0, int a1, java.lang.Boolean a2) throws Throwable;
private static native int __invokedynamic392_67(int a0, long a1) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead392_68(moom.Fv a0) throws Throwable;
private static native int __call392_69(java.io.RandomAccessFile a0) throws Throwable;
private static native int[] __fieldRead392_70(moom.Fv a0) throws Throwable;
private static native java.lang.Exception __call3039200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3039201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3039202_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3039203_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3039204_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3039205_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3039206_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3039207_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3039208_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3039209_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3039210_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3039211_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3039212_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3039213_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3039214_0(java.io.IOException a0) throws Throwable;
private static native void __call3039215_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cc2729e5cf129f982472(moom.Fv a0) throws E;
private static final class __SourceHandler_cc2729e5cf129f982472 {

public static void f636(moom.Fv receiver) throws Throwable {
    java.io.RandomAccessFile forwardValue636_13_0;
    java.io.RandomAccessFile spill636_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    life1_3 = (__fieldRead636_0() ^ 46495940917595L);
    life3_5 = __call636_1();
    spill636_0 = __fieldRead636_2(receiver);
    if (!((life3_5 == 0))) {
        forwardValue636_13_0 = spill636_0;
        break forward_join_13;
    }
    if (!((spill636_0 != null))) {
        break forward_join_14;
    }
    forwardValue636_13_0 = __fieldRead636_3(receiver);
    }
    __call636_4(forwardValue636_13_0);
    }
    return;
}
public static void h636_0(java.io.IOException p0) throws Throwable {
    throw __call1063600_0(p0);
}
public static void h636_1(java.io.IOException p0) throws Throwable {
    throw __call1063601_0(p0);
}
private static native long __fieldRead636_0() throws Throwable;
private static native int __call636_1() throws Throwable;
private static native java.io.RandomAccessFile __fieldRead636_2(moom.Fv a0) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead636_3(moom.Fv a0) throws Throwable;
private static native void __call636_4(java.io.RandomAccessFile a0) throws Throwable;
private static native java.lang.Exception __call1063600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1063601_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4021eb3f5f73d6f03286(moom.Fv a0, int a1, int a2, byte[] a3, int a4) throws E;
private static final class __SourceHandler_4021eb3f5f73d6f03286 {

public static void f113(moom.Fv receiver, int p0, int p1, byte[] p2, int p3) throws Throwable {
    int lexicalValue113_50_0;
    int lexicalValue113_66_0;
    int lexicalValue113_121_0;
    int lexicalValue113_130_0;
    int lexicalValue113_138_0;
    int lexicalValue113_146_0;
    int lexicalValue113_149_0;
    int lexicalValue113_149_1;
    int lexicalValue113_201_0;
    int spill113_0;
    int spill113_1;
    int spill113_2;
    int spill113_3;
    int spill113_4;
    boolean spill113_5;
    long life5_3;
    int life7_5;
    int life8_10;
    int life9_18;
    int life10_26;
    int life11_38;
    int life12_84;
    int life13_110;
    int life14_120;
    int life9_208;
    int life14_223;
    int life14_261;
    lexical_join_249: {
    lexical_join_236: {
    lexical_join_219: {
    lexical_join_201: {
    lexical_join_190: {
    lexical_join_188: {
    lexical_join_183: {
    lexical_join_149: {
    lexical_join_146: {
    lexical_join_145: {
    lexical_join_88: {
    lexical_join_83: {
    lexical_join_66: {
    lexical_join_65: {
    lexical_join_50: {
    lexical_join_49: {
    life5_3 = (__fieldRead113_0() ^ 74969528103293L);
    life7_5 = __call113_1();
    life8_10 = __call113_2(receiver, p0, p1);
    life9_18 = (life8_10 >> __invokedynamic113_3(15355, (4214419343006782703L ^ life5_3)));
    life10_26 = (life8_10 & __invokedynamic113_4(11464, (3666702715458438110L ^ life5_3)));
    life11_38 = (((p3 + 5) / __invokedynamic113_5(13154, (2596358249982385269L ^ life5_3))) + 1);
    spill113_0 = life11_38;
    if (!((life7_5 != 0))) {
        lexicalValue113_50_0 = spill113_0;
        break lexical_join_50;
    }
    if (!((spill113_0 >= __invokedynamic113_6(3754, (8732199036440994225L ^ life5_3))))) {
        break lexical_join_49;
    }
    return;
    }
    lexicalValue113_50_0 = life9_18;
    }
    if (!((life7_5 != 0))) {
        lexicalValue113_66_0 = lexicalValue113_50_0;
        break lexical_join_66;
    }
    if (!((lexicalValue113_50_0 != 0))) {
        break lexical_join_65;
    }
    spill113_1 = life10_26;
    if (!((life7_5 != 0))) {
        lexicalValue113_66_0 = spill113_1;
        break lexical_join_66;
    }
    if (!((spill113_1 == life11_38))) {
        break lexical_join_65;
    }
    __call113_7(receiver, life9_18, p2, p3);
    if (!((life7_5 == 0))) {
        break lexical_join_249;
    }
    }
    lexicalValue113_66_0 = 0;
    }
    life12_84 = lexicalValue113_66_0;
    lexical_cycle_67: while (true) {
    if (!((life12_84 < life10_26))) {
        break lexical_join_83;
    }
    __call113_10(__fieldRead113_8(receiver), (life9_18 + life12_84), __fieldRead113_9());
    life12_84 += 1;
    if (!((life7_5 != 0))) {
        break lexical_join_88;
    }
    if (!((life7_5 == 0))) { continue lexical_cycle_67; }
    break lexical_cycle_67;
    }
    }
    life12_84 = __call113_13(__fieldRead113_11(receiver), __fieldRead113_12());
    }
    life13_110 = 0;
    spill113_2 = life12_84;
    spill113_3 = -1;
    if (!((life7_5 != 0))) {
        lexicalValue113_149_0 = spill113_2;
        lexicalValue113_149_1 = spill113_3;
        break lexical_join_149;
    }
    if (!((spill113_2 != spill113_3))) {
        break lexical_join_145;
    }
    life14_120 = life12_84;
    lexical_cycle_97: while (true) {
    lexical_join_142: {
    lexical_join_138: {
    lexical_join_137: {
    lexical_join_130: {
    lexical_join_124: {
    lexical_join_121: {
    lexical_join_120: {
    if (!((life14_120 < __call113_15(__fieldRead113_14(receiver))))) {
        break lexical_join_145;
    }
    spill113_4 = life13_110;
    if (!((life7_5 != 0))) {
        lexicalValue113_146_0 = spill113_4;
        break lexical_join_146;
    }
    if (!((life7_5 != 0))) {
        lexicalValue113_130_0 = spill113_4;
        break lexical_join_130;
    }
    if (!((spill113_4 != 0))) {
        break lexical_join_124;
    }
    spill113_5 = __call113_19(__cast113_18(__call113_17(__fieldRead113_16(receiver), life14_120)));
    if (!((life7_5 != 0))) {
        lexicalValue113_121_0 = __integerCategory113_20(spill113_5);
        break lexical_join_121;
    }
    if (!(spill113_5)) {
        break lexical_join_120;
    }
    life13_110 += 1;
    if (!((life7_5 == 0))) {
        break lexical_join_137;
    }
    }
    lexicalValue113_121_0 = 0;
    }
    life13_110 = lexicalValue113_121_0;
    if (!((life7_5 == 0))) {
        break lexical_join_137;
    }
    }
    lexicalValue113_130_0 = __integerCategory113_25(__call113_24(__cast113_23(__call113_22(__fieldRead113_21(receiver), life14_120))));
    }
    if (!((life7_5 != 0))) {
        lexicalValue113_138_0 = lexicalValue113_130_0;
        break lexical_join_138;
    }
    if (!((lexicalValue113_130_0 != 0))) {
        break lexical_join_137;
    }
    life12_84 = life14_120;
    life13_110 = 1;
    }
    lexicalValue113_138_0 = life13_110;
    }
    if (!((lexicalValue113_138_0 >= life11_38))) {
        break lexical_join_142;
    }
    if (!((life7_5 == 0))) {
        break lexical_join_145;
    }
    }
    life14_120 += 1;
    if (!((life7_5 == 0))) { continue lexical_cycle_97; }
    break lexical_cycle_97;
    }
    }
    lexicalValue113_146_0 = life13_110;
    }
    if (!((life7_5 != 0))) {
        lexicalValue113_201_0 = lexicalValue113_146_0;
        break lexical_join_201;
    }
    lexicalValue113_149_0 = lexicalValue113_146_0;
    lexicalValue113_149_1 = life11_38;
    }
    if (!((lexicalValue113_149_0 >= lexicalValue113_149_1))) {
        break lexical_join_190;
    }
    life9_208 = life12_84;
    __call113_27(receiver, p0, p1, ((life12_84 << __invokedynamic113_26(15355, (4214419343006782703L ^ life5_3))) | life11_38));
    life14_223 = 0;
    lexical_cycle_167: while (true) {
    if (!((life14_223 < life11_38))) {
        break lexical_join_183;
    }
    __call113_30(__fieldRead113_28(receiver), (life9_208 + life14_223), __fieldRead113_29());
    life14_223 += 1;
    if (!((life7_5 != 0))) {
        break lexical_join_188;
    }
    if (!((life7_5 == 0))) { continue lexical_cycle_167; }
    break lexical_cycle_167;
    }
    }
    __call113_31(receiver, life9_208, p2, p3);
    }
    if (!((life7_5 == 0))) {
        break lexical_join_249;
    }
    }
    __call113_35(__fieldRead113_32(receiver), __call113_34(__fieldRead113_33(receiver)));
    life9_18 = __call113_37(__fieldRead113_36(receiver));
    lexicalValue113_201_0 = 0;
    }
    life14_261 = lexicalValue113_201_0;
    lexical_cycle_202: while (true) {
    if (!((life14_261 < life11_38))) {
        break lexical_join_219;
    }
    __call113_40(__fieldRead113_38(receiver), __fieldRead113_39());
    __call113_43(__fieldRead113_41(receiver), __fieldRead113_42());
    life14_261 += 1;
    if (!((life7_5 != 0))) {
        break lexical_join_236;
    }
    if (!((life7_5 == 0))) { continue lexical_cycle_202; }
    break lexical_cycle_202;
    }
    }
    moom.Fv __stackOp113_44_0 = receiver;
    __fieldWrite113_47(__stackOp113_44_0, (__fieldRead113_45(__stackOp113_44_0) + (__invokedynamic113_46(13154, (2596358249982385269L ^ life5_3)) * life11_38)));
    __call113_48(receiver, life9_18, p2, p3);
    }
    __call113_50(receiver, p0, p1, ((life9_18 << __invokedynamic113_49(15355, (4214419343006782703L ^ life5_3))) | life11_38));
    }
    __call113_53(receiver, p0, p1, ((int) (__call113_51() / __invokedynamic113_52(3191, (4130680526436445644L ^ life5_3)))));
    return;
}
public static void h113_0(java.io.IOException p0) throws Throwable {
    throw __call2011300_0(p0);
}
public static void h113_1(java.io.IOException p0) throws Throwable {
    throw __call2011301_0(p0);
}
public static void h113_2(java.io.IOException p0) throws Throwable {
    throw __call2011302_0(p0);
}
public static void h113_3(java.io.IOException p0) throws Throwable {
    throw __call2011303_0(p0);
}
public static void h113_4(java.io.IOException p0) throws Throwable {
    throw __call2011304_0(p0);
}
public static void h113_5(java.io.IOException p0) throws Throwable {
    throw __call2011305_0(p0);
}
public static void h113_6(java.io.IOException p0) throws Throwable {
    throw __call2011306_0(p0);
}
public static void h113_7(java.io.IOException p0) throws Throwable {
    throw __call2011307_0(p0);
}
public static void h113_8(java.io.IOException p0) throws Throwable {
    throw __call2011308_0(p0);
}
public static void h113_9(java.io.IOException p0) throws Throwable {
    throw __call2011309_0(p0);
}
public static void h113_10(java.io.IOException p0) throws Throwable {
    throw __call2011310_0(p0);
}
public static void h113_11(java.io.IOException p0) throws Throwable {
    throw __call2011311_0(p0);
}
public static void h113_12(java.io.IOException p0) throws Throwable {
    throw __call2011312_0(p0);
}
public static void h113_13(java.io.IOException p0) throws Throwable {
    throw __call2011313_0(p0);
}
public static void h113_14(java.io.IOException p0) throws Throwable {
    throw __call2011314_0(p0);
}
public static void h113_15(java.io.IOException p0) throws Throwable {
    throw __call2011315_0(p0);
}
public static void h113_16(java.io.IOException p0) throws Throwable {
    throw __call2011316_0(p0);
}
public static void h113_17(java.io.IOException p0) throws Throwable {
    throw __call2011317_0(p0);
}
public static void h113_18(java.io.IOException p0) throws Throwable {
    throw __call2011318_0(p0);
}
public static void h113_19(java.io.IOException p0) throws Throwable {
    throw __call2011319_0(p0);
}
public static void h113_20(java.io.IOException p0) throws Throwable {
    throw __call2011320_0(p0);
}
public static void h113_21(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    __call2011321_0(local1);
    return;
}
private static native long __fieldRead113_0() throws Throwable;
private static native int __call113_1() throws Throwable;
private static native int __call113_2(moom.Fv a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic113_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic113_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic113_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic113_6(int a0, long a1) throws Throwable;
private static native void __call113_7(moom.Fv a0, int a1, byte[] a2, int a3) throws Throwable;
private static native java.util.List __fieldRead113_8(moom.Fv a0) throws Throwable;
private static native java.lang.Boolean __fieldRead113_9() throws Throwable;
private static native java.lang.Object __call113_10(java.util.List a0, int a1, java.lang.Boolean a2) throws Throwable;
private static native java.util.List __fieldRead113_11(moom.Fv a0) throws Throwable;
private static native java.lang.Boolean __fieldRead113_12() throws Throwable;
private static native int __call113_13(java.util.List a0, java.lang.Boolean a1) throws Throwable;
private static native java.util.List __fieldRead113_14(moom.Fv a0) throws Throwable;
private static native int __call113_15(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead113_16(moom.Fv a0) throws Throwable;
private static native java.lang.Object __call113_17(java.util.List a0, int a1) throws Throwable;
private static native java.lang.Boolean __cast113_18(java.lang.Object a0) throws Throwable;
private static native boolean __call113_19(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory113_20(boolean value) throws Throwable;
private static native java.util.List __fieldRead113_21(moom.Fv a0) throws Throwable;
private static native java.lang.Object __call113_22(java.util.List a0, int a1) throws Throwable;
private static native java.lang.Boolean __cast113_23(java.lang.Object a0) throws Throwable;
private static native boolean __call113_24(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory113_25(boolean value) throws Throwable;
private static native int __invokedynamic113_26(int a0, long a1) throws Throwable;
private static native void __call113_27(moom.Fv a0, int a1, int a2, int a3) throws Throwable;
private static native java.util.List __fieldRead113_28(moom.Fv a0) throws Throwable;
private static native java.lang.Boolean __fieldRead113_29() throws Throwable;
private static native java.lang.Object __call113_30(java.util.List a0, int a1, java.lang.Boolean a2) throws Throwable;
private static native void __call113_31(moom.Fv a0, int a1, byte[] a2, int a3) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead113_32(moom.Fv a0) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead113_33(moom.Fv a0) throws Throwable;
private static native long __call113_34(java.io.RandomAccessFile a0) throws Throwable;
private static native void __call113_35(java.io.RandomAccessFile a0, long a1) throws Throwable;
private static native java.util.List __fieldRead113_36(moom.Fv a0) throws Throwable;
private static native int __call113_37(java.util.List a0) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead113_38(moom.Fv a0) throws Throwable;
private static native byte[] __fieldRead113_39() throws Throwable;
private static native void __call113_40(java.io.RandomAccessFile a0, byte[] a1) throws Throwable;
private static native java.util.List __fieldRead113_41(moom.Fv a0) throws Throwable;
private static native java.lang.Boolean __fieldRead113_42() throws Throwable;
private static native boolean __call113_43(java.util.List a0, java.lang.Boolean a1) throws Throwable;
private static native int __fieldRead113_45(moom.Fv a0) throws Throwable;
private static native int __invokedynamic113_46(int a0, long a1) throws Throwable;
private static native void __fieldWrite113_47(moom.Fv a0, int a1) throws Throwable;
private static native void __call113_48(moom.Fv a0, int a1, byte[] a2, int a3) throws Throwable;
private static native int __invokedynamic113_49(int a0, long a1) throws Throwable;
private static native void __call113_50(moom.Fv a0, int a1, int a2, int a3) throws Throwable;
private static native long __call113_51() throws Throwable;
private static native long __invokedynamic113_52(int a0, long a1) throws Throwable;
private static native void __call113_53(moom.Fv a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call2011300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011302_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011303_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011304_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011305_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011306_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011307_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011308_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011309_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011310_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011311_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011312_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011313_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011314_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011315_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011316_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011317_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011318_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011319_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2011320_0(java.io.IOException a0) throws Throwable;
private static native void __call2011321_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0216955ce0579a230149(moom.Fv a0, int a1, int a2) throws E;
private static final class __SourceHandler_0216955ce0579a230149 {

public static boolean f637(moom.Fv receiver, int p0, int p1) throws Throwable {
    int forwardValue637_33_0;
    int forwardValue637_35_0;
    int spill637_0;
    int spill637_1;
    int spill637_2;
    int spill637_3;
    long life3_3;
    int life5_5;
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    life3_3 = (__fieldRead637_0() ^ 103424340002881L);
    life5_5 = __call637_1();
    spill637_0 = p0;
    if (!((life5_5 == 0))) {
        forwardValue637_33_0 = spill637_0;
        break forward_join_33;
    }
    if (!((spill637_0 >= 0))) {
        break forward_join_32;
    }
    spill637_1 = p0;
    if (!((life5_5 == 0))) {
        forwardValue637_33_0 = spill637_1;
        break forward_join_33;
    }
    if (!((spill637_1 < __invokedynamic637_2(4607, (1988350220265719766L ^ life3_3))))) {
        break forward_join_32;
    }
    spill637_2 = p1;
    if (!((life5_5 == 0))) {
        forwardValue637_33_0 = spill637_2;
        break forward_join_33;
    }
    if (!((spill637_2 >= 0))) {
        break forward_join_32;
    }
    spill637_3 = p1;
    if (!((life5_5 == 0))) {
        forwardValue637_33_0 = spill637_3;
        break forward_join_33;
    }
    if (!((spill637_3 >= __invokedynamic637_3(4607, (1988350220265719766L ^ life3_3))))) {
        break forward_join_34;
    }
    }
    forwardValue637_33_0 = 1;
    }
    forwardValue637_35_0 = forwardValue637_33_0;
    break forward_join_35;
    }
    forwardValue637_35_0 = 0;
    }
    return __integerCategory637_4(forwardValue637_35_0);
}
public static void h637_0(moom.Oo p0) throws Throwable {
    throw __call1063700_0(p0);
}
public static void h637_1(moom.Oo p0) throws Throwable {
    throw __call1063701_0(p0);
}
public static void h637_2(moom.Oo p0) throws Throwable {
    throw __call1063702_0(p0);
}
public static void h637_3(moom.Oo p0) throws Throwable {
    throw __call1063703_0(p0);
}
public static void h637_4(moom.Oo p0) throws Throwable {
    throw __call1063704_0(p0);
}
public static void h637_5(moom.Oo p0) throws Throwable {
    throw __call1063705_0(p0);
}
public static void h637_6(moom.Oo p0) throws Throwable {
    throw __call1063706_0(p0);
}
public static void h637_7(moom.Oo p0) throws Throwable {
    throw __call1063707_0(p0);
}
private static native long __fieldRead637_0() throws Throwable;
private static native int __call637_1() throws Throwable;
private static native int __invokedynamic637_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic637_3(int a0, long a1) throws Throwable;
private static native boolean __integerCategory637_4(int value) throws Throwable;
private static native java.lang.Exception __call1063700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063706_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063707_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.io.DataInputStream __sourceHandlerCall_037d99dbc968f8a677ec(moom.Fv a0, int a1, int a2) throws E;
private static final class __SourceHandler_037d99dbc968f8a677ec {

public static java.io.DataInputStream f261(moom.Fv receiver, int p0, int p1) throws Throwable {
    int forwardValue261_19_0;
    int forwardValue261_33_0;
    int forwardValue261_67_0;
    int forwardValue261_82_0;
    int forwardValue261_90_0;
    int forwardValue261_122_0;
    int forwardValue261_122_1;
    int forwardValue261_127_0;
    int forwardValue261_127_1;
    boolean spill261_0;
    int spill261_1;
    int spill261_2;
    int spill261_3;
    int spill261_4;
    int spill261_5;
    long life3_3;
    int life5_5;
    int life6_24;
    int life7_41;
    int life8_49;
    int life9_78;
    int life10_107;
    byte[] life11_120;
    byte[] life11_155;
    forward_join_149: {
    forward_join_127: {
    forward_join_122: {
    forward_join_120: {
    forward_join_90: {
    forward_join_87: {
    forward_join_82: {
    forward_join_81: {
    forward_join_67: {
    forward_join_53: {
    forward_join_33: {
    forward_join_26: {
    forward_join_19: {
    forward_join_15: {
    life3_3 = (__fieldRead261_0() ^ 136234202695001L);
    life5_5 = __call261_1();
    spill261_0 = __call261_2(receiver, p0, p1);
    if (!((life5_5 != 0))) {
        forwardValue261_19_0 = __integerCategory261_3(spill261_0);
        break forward_join_19;
    }
    if (!(spill261_0)) {
        break forward_join_15;
    }
    return null;
    }
    forwardValue261_19_0 = __call261_4(receiver, p0, p1);
    }
    life6_24 = forwardValue261_19_0;
    spill261_1 = life6_24;
    if (!((life5_5 != 0))) {
        forwardValue261_33_0 = spill261_1;
        break forward_join_33;
    }
    if (!((spill261_1 == 0))) {
        break forward_join_26;
    }
    return null;
    }
    forwardValue261_33_0 = (life6_24 >> __invokedynamic261_5(15355, (4214419101526859979L ^ life3_3)));
    }
    life7_41 = forwardValue261_33_0;
    life8_49 = (life6_24 & __invokedynamic261_6(11464, (3666635403735676922L ^ life3_3)));
    spill261_2 = (life7_41 + life8_49);
    if (!((life5_5 != 0))) {
        forwardValue261_67_0 = spill261_2;
        break forward_join_67;
    }
    if (!((spill261_2 > __call261_8(__fieldRead261_7(receiver))))) {
        break forward_join_53;
    }
    return null;
    }
    __call261_11(__fieldRead261_9(receiver), (((long) life7_41) * __invokedynamic261_10(12685, (6578131020312142874L ^ life3_3))));
    forwardValue261_67_0 = __call261_13(__fieldRead261_12(receiver));
    }
    life9_78 = forwardValue261_67_0;
    spill261_3 = life9_78;
    if (!((life5_5 != 0))) {
        forwardValue261_82_0 = spill261_3;
        break forward_join_82;
    }
    if (!((spill261_3 > (__invokedynamic261_14(13154, (2596362406247508049L ^ life3_3)) * life8_49)))) {
        break forward_join_81;
    }
    return null;
    }
    forwardValue261_82_0 = life9_78;
    }
    if (!((life5_5 != 0))) {
        forwardValue261_90_0 = forwardValue261_82_0;
        break forward_join_90;
    }
    if (!((forwardValue261_82_0 <= 0))) {
        break forward_join_87;
    }
    return null;
    }
    forwardValue261_90_0 = __integerCategory261_17(__call261_16(__fieldRead261_15(receiver)));
    }
    life10_107 = forwardValue261_90_0;
    spill261_4 = life10_107;
    spill261_5 = 1;
    if (!((life5_5 != 0))) {
        forwardValue261_122_0 = spill261_4;
        forwardValue261_122_1 = spill261_5;
        break forward_join_122;
    }
    if (!((spill261_4 == spill261_5))) {
        break forward_join_120;
    }
    life11_120 = new byte[(life9_78 - 1)];
    __call261_19(__fieldRead261_18(receiver), life11_120);
    return new java.io.DataInputStream(new java.io.BufferedInputStream(new java.util.zip.GZIPInputStream(new java.io.ByteArrayInputStream(life11_120))));
    }
    forwardValue261_122_0 = life10_107;
    forwardValue261_122_1 = 2;
    }
    if (!((life5_5 != 0))) {
        forwardValue261_127_0 = forwardValue261_122_0;
        forwardValue261_127_1 = forwardValue261_122_1;
        break forward_join_127;
    }
    if (!((forwardValue261_122_0 == forwardValue261_122_1))) {
        break forward_join_149;
    }
    forwardValue261_127_0 = life9_78;
    forwardValue261_127_1 = 1;
    }
    life11_155 = new byte[(forwardValue261_127_0 - forwardValue261_127_1)];
    __call261_21(__fieldRead261_20(receiver), life11_155);
    return new java.io.DataInputStream(new java.io.BufferedInputStream(new java.util.zip.InflaterInputStream(new java.io.ByteArrayInputStream(life11_155))));
    }
    return null;
}
public static java.io.DataInputStream h261_0(java.io.IOException p0) throws Throwable {
    throw __call2026100_0(p0);
}
public static java.io.DataInputStream h261_1(java.io.IOException p0) throws Throwable {
    throw __call2026101_0(p0);
}
public static java.io.DataInputStream h261_2(java.io.IOException p0) throws Throwable {
    throw __call2026102_0(p0);
}
public static java.io.DataInputStream h261_3(java.io.IOException p0) throws Throwable {
    throw __call2026103_0(p0);
}
public static java.io.DataInputStream h261_4(java.io.IOException p0) throws Throwable {
    throw __call2026104_0(p0);
}
public static java.io.DataInputStream h261_5(java.io.IOException p0) throws Throwable {
    throw __call2026105_0(p0);
}
public static java.io.DataInputStream h261_6(java.io.IOException p0) throws Throwable {
    throw __call2026106_0(p0);
}
public static java.io.DataInputStream h261_7(java.io.IOException p0) throws Throwable {
    throw __call2026107_0(p0);
}
public static java.io.DataInputStream h261_8(java.io.IOException p0) throws Throwable {
    throw __call2026108_0(p0);
}
public static java.io.DataInputStream h261_9(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    return null;
}
private static native long __fieldRead261_0() throws Throwable;
private static native int __call261_1() throws Throwable;
private static native boolean __call261_2(moom.Fv a0, int a1, int a2) throws Throwable;
private static native int __integerCategory261_3(boolean value) throws Throwable;
private static native int __call261_4(moom.Fv a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic261_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic261_6(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead261_7(moom.Fv a0) throws Throwable;
private static native int __call261_8(java.util.List a0) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead261_9(moom.Fv a0) throws Throwable;
private static native long __invokedynamic261_10(int a0, long a1) throws Throwable;
private static native void __call261_11(java.io.RandomAccessFile a0, long a1) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead261_12(moom.Fv a0) throws Throwable;
private static native int __call261_13(java.io.RandomAccessFile a0) throws Throwable;
private static native int __invokedynamic261_14(int a0, long a1) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead261_15(moom.Fv a0) throws Throwable;
private static native byte __call261_16(java.io.RandomAccessFile a0) throws Throwable;
private static native int __integerCategory261_17(byte value) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead261_18(moom.Fv a0) throws Throwable;
private static native int __call261_19(java.io.RandomAccessFile a0, byte[] a1) throws Throwable;
private static native java.io.RandomAccessFile __fieldRead261_20(moom.Fv a0) throws Throwable;
private static native int __call261_21(java.io.RandomAccessFile a0, byte[] a1) throws Throwable;
private static native java.lang.Exception __call2026100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2026101_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2026102_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2026103_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2026104_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2026105_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2026106_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2026107_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2026108_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.io.DataOutputStream __sourceHandlerCall_4b8c80c7acc5e616241f(moom.Fv a0, int a1, int a2) throws E;
private static final class __SourceHandler_4b8c80c7acc5e616241f {

public static java.io.DataOutputStream f1130(moom.Fv receiver, int p0, int p1) throws Throwable {
    long life3_3;
    life3_3 = (__fieldRead1130_0() ^ 123629474157227L);
    return (__call1130_1(receiver, p0, p1) ? null : new java.io.DataOutputStream(new java.util.zip.DeflaterOutputStream(new moom.A(receiver, p0, p1))));
}
public static void h1130_0(moom.Oo p0) throws Throwable {
    throw __call1113000_0(p0);
}
private static native long __fieldRead1130_0() throws Throwable;
private static native boolean __call1130_1(moom.Fv a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1113000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_99b64022e73bb812d642(moom.Fv a0, int a1, int a2) throws E;
private static final class __SourceHandler_99b64022e73bb812d642 {

public static boolean f638(moom.Fv receiver, int p0, int p1) throws Throwable {
    int forwardValue638_14_0;
    int forwardValue638_16_0;
    int spill638_0;
    long life3_3;
    int life5_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life3_3 = (__fieldRead638_0() ^ 74419605451504L);
    life5_5 = __call638_1();
    spill638_0 = __call638_2(receiver, p0, p1);
    if (!((life5_5 != 0))) {
        forwardValue638_14_0 = spill638_0;
        break forward_join_14;
    }
    if (!((spill638_0 != 0))) {
        break forward_join_15;
    }
    forwardValue638_14_0 = 1;
    }
    forwardValue638_16_0 = forwardValue638_14_0;
    break forward_join_16;
    }
    forwardValue638_16_0 = 0;
    }
    return __integerCategory638_3(forwardValue638_16_0);
}
public static void h638_0(moom.Oo p0) throws Throwable {
    throw __call1063800_0(p0);
}
private static native long __fieldRead638_0() throws Throwable;
private static native int __call638_1() throws Throwable;
private static native int __call638_2(moom.Fv a0, int a1, int a2) throws Throwable;
private static native boolean __integerCategory638_3(int value) throws Throwable;
private static native java.lang.Exception __call1063800_0(moom.Oo a0) throws Throwable;

}


public boolean b(int p0, int p1) { return __sourceHandlerCall_99b64022e73bb812d642(this, p0, p1); }


private void b(int p0, int p1, int p2) throws java.io.IOException {
long local4 = (moom.Fv.i ^ 41011888231513L);
    (this.e)[(p0 + (p1 * __sourceIntrinsic_d5f89f155b18_originalDynamicSite1154_2(20468, (9044536987830207946L ^ local4))))] = p2;
    ((java.io.RandomAccessFile)(this.c)).seek(((long)((__sourceIntrinsic_d5f89f155b18_originalDynamicSite1154_4(12685, (6578186637256914202L ^ local4)) + ((((long) p0) + (((long) p1) * __sourceIntrinsic_d5f89f155b18_originalDynamicSite1154_5(31918, (2880793780914599986L ^ local4)))) * __sourceIntrinsic_d5f89f155b18_originalDynamicSite1154_6(1864, (5119174471525843922L ^ local4)))))));
    ((java.io.RandomAccessFile)(this.c)).writeInt(((int)(p2)));
    return;
}


private static long b(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21256);
    if (((moom.Fv.n)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.Fv.m)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.Fv.o)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Fv.o)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Fv", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.Fv.n)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.Fv.n)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.Fv.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4564_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7585;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Fv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Fv.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4565_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected synchronized void a(int p0, int p1, byte[] p2, int p3) { __sourceHandlerCall_4021eb3f5f73d6f03286(this, p0, p1, p2, p3); }


public java.io.DataOutputStream a__DataOutputStream(int p0, int p1) { return __sourceHandlerCall_4b8c80c7acc5e616241f(this, p0, p1); }


public synchronized java.io.DataInputStream a__DataInputStream(int p0, int p1) { return __sourceHandlerCall_037d99dbc968f8a677ec(this, p0, p1); }


private int a(int p0, int p1) {
long local3 = (moom.Fv.i ^ 105656608974994L);
    return (this.d)[(p0 + (p1 * __sourceIntrinsic_90f211e43b08_originalDynamicSite1155_2(4607, (1988400764576032517L ^ local3))))];
}


private void a(int p0, int p1, int p2) throws java.io.IOException {
long local4 = (moom.Fv.i ^ 46216361293216L);
    (this.d)[(p0 + (p1 * __sourceIntrinsic_e4d4f5a69301_originalDynamicSite1156_2(4607, (1988477659440626231L ^ local4))))] = p2;
    ((java.io.RandomAccessFile)(this.c)).seek(((long)(((((long) p0) + (((long) p1) * __sourceIntrinsic_e4d4f5a69301_originalDynamicSite1156_4(8647, (7854969603485713574L ^ local4)))) * __sourceIntrinsic_e4d4f5a69301_originalDynamicSite1156_5(8989, (7527055629292258941L ^ local4))))));
    ((java.io.RandomAccessFile)(this.c)).writeInt(((int)(p2)));
    return;
}


private boolean a__Boolean(int p0, int p1) { return __sourceHandlerCall_0216955ce0579a230149(this, p0, p1); }


public void a() throws java.io.IOException { __sourceHandlerCall_cc2729e5cf129f982472(this); }


private void a(int p0, byte[] p1, int p2) throws java.io.IOException {
long local4 = (moom.Fv.i ^ 56191347373037L);
    ((java.io.RandomAccessFile)(this.c)).seek(((long)((((long) p0) * __sourceIntrinsic_c5cfe8f37ad6_originalDynamicSite1157_2(12685, (6578210612799623854L ^ local4))))));
    ((java.io.RandomAccessFile)(this.c)).writeInt(((int)((p2 + 1))));
    ((java.io.RandomAccessFile)(this.c)).writeByte(((int)(2)));
    ((java.io.RandomAccessFile)(this.c)).write(((byte[])(p1)), ((int)(0)), ((int)(p2)));
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite656_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_originalDynamicSite1155_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e4d4f5a69301_originalDynamicSite1156_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_e4d4f5a69301_originalDynamicSite1156_4(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_e4d4f5a69301_originalDynamicSite1156_5(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_c5cfe8f37ad6_originalDynamicSite1157_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4565_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f89f155b18_originalDynamicSite1154_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_d5f89f155b18_originalDynamicSite1154_4(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_d5f89f155b18_originalDynamicSite1154_5(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_d5f89f155b18_originalDynamicSite1154_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4564_0() throws E;
}
