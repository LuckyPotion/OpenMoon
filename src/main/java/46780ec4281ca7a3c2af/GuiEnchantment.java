package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiEnchantment extends moom.hg {

private static moom.DD Z;

private static moom.DD aa;

private static moom.i3 ab;

private net.minecraft.entity.player.InventoryPlayer ac;

private java.util.Random ad;

private moom.we ae;

public int af;

public float ag;

public float ah;

public float ai;

public float aj;

public float ak;

public float al;

net.minecraft.item.ItemStack am;

public net.minecraft.world.IWorldNameable an;

private static long cb;

private static long[] fb;

private static java.lang.Integer[] pb;

private static java.util.Map qb;

public GuiEnchantment(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.world.World p1, net.minecraft.world.IWorldNameable p2) {
super(new moom.we(p0, p1));
    this.ad = new java.util.Random();
    this.ac = p0;
    this.ae = ((moom.we) (this.z));
    this.an = p2;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(8264760036439953658L)), ((long)(-5384028738241229007L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(268721299058230L)))));
    qb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiEnchantment.cb ^ 45968184315790L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1771_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1771_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1771_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1771_14 = new byte[8];
    (__sourceSpill1771_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1771_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1771_16 = __sourceSpill1771_14;
    ((javax.crypto.Cipher)(__sourceSpill1771_11)).init(((int)(__sourceSpill1771_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1771_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1771_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[43];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "½õRáy«ã©ö6T!\007\177Æ K\020\023\002#£\023\td\005hµ\032öwld\0313\t\031sÿ:\033ð®Åq Ê8~2«\0011qÞ%¿¡w\016zEö)@vï*B8ÙãË\tù^7Ñ5íû\025RsÓ\036\024Èº!ìïþ÷×9ÈÕ-\bòWî4±Î\n\002eS{{¹bp\032~ÝÕ«²àc ¨JeËÿé¨\002/_ða\000\023b\017Ò~-ÿëÀfl\"\\\002GÏ¥û¨Ä<½¿æ¾\026ñý+\000p\r\n°Ô«äüä\037\001'ì\001+ ¬\034®Q\003éM=øóûs«\0259·-+O\013<þ\177°EÛá\004!<\036È#ü´ðOGÊÐ8 Ø~7\bÈphR®Ò\030\rò;m^Ü\031ÌÆ~j½·%Z\005m\035\005øj·\020|ö¥'\n¤ÝËkj\007ÓÓÄ\004\021²Ñ¯Ú=mn}W1ò\b9vVwï-8¶Ç[Qm\024\016\007)Ã"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1771_25 = local6_life21;
        int __sourceSpill1771_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1771_25)).substring(((int)(__sourceSpill1771_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1771_30 = local8_life19;
        int __sourceSpill1771_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1771_33 = new byte[8];
        (__sourceSpill1771_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1771_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1771_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1771_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1771_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1771_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1771_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1771_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1771_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1771_34)).doFinal(((byte[])(__sourceSpill1771_33)));
        (__sourceSpill1771_30)[__sourceSpill1771_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ì\b¢Ùß6/¥;\001HÞ\003\025"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1771_38 = local6_life21;
        int __sourceSpill1771_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1771_38)).substring(((int)(__sourceSpill1771_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1771_43 = local8_life19;
        int __sourceSpill1771_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1771_46 = new byte[8];
        (__sourceSpill1771_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1771_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1771_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1771_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1771_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1771_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1771_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1771_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1771_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1771_47)).doFinal(((byte[])(__sourceSpill1771_46)));
        (__sourceSpill1771_43)[__sourceSpill1771_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    fb = ((long[])(local8_life19));
    pb = ((java.lang.Integer[])(new java.lang.Integer[43]));
    Z = ((moom.DD)(new moom.DD("textures/gui/container/enchanting_table.png")));
    aa = ((moom.DD)(new moom.DD("textures/entity/enchanting_table_book.png")));
    ab = ((moom.i3)(new moom.i3()));
}

private static native <E extends Throwable> void __sourceHandlerCall_d5ffbac1b6322d09adfd(net.minecraft.client.gui.GuiEnchantment a0, float a1, int a2, int a3) throws E;
private static final class __SourceHandler_d5ffbac1b6322d09adfd {

public static void f1309(net.minecraft.client.gui.GuiEnchantment receiver, float p0, int p1, int p2) throws Throwable {
    int spill1309_0;
    long spill1309_1;
    int spill1309_2;
    long spill1309_3;
    int spill1309_4;
    long life4_3;
    int life6_21;
    int life7_29;
    moom.ir life8_54;
    float life9_108;
    float life10_126;
    float life11_156;
    float life12_202;
    float life13_215;
    float life12_226;
    float life13_237;
    int life14_312;
    int life15_314;
    int life16_325;
    int life17_333;
    int life18_339;
    java.lang.String life19_342;
    int life20_356;
    java.lang.String life21_403;
    net.minecraft.client.gui.FontRenderer life22_408;
    int life23_413;
    int life23_547;
    int life24_558;
    int life25_576;
    net.minecraft.client.gui.FontRenderer life22_751;
    lexical_join_776: {
    lexical_join_262: {
    lexical_join_256: {
    lexical_join_250: {
    lexical_join_244: {
    life4_3 = (__fieldRead1309_0() ^ 126249710663708L);
    __call1309_1(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call1309_5(__call1309_3(__fieldRead1309_2(receiver)), __fieldRead1309_4());
    life6_21 = ((__fieldRead1309_6(receiver) - __fieldRead1309_7(receiver)) / 2);
    life7_29 = ((__fieldRead1309_8(receiver) - __fieldRead1309_9(receiver)) / 2);
    __call1309_12(receiver, life6_21, life7_29, 0, 0, __fieldRead1309_10(receiver), __fieldRead1309_11(receiver));
    __call1309_13();
    __call1309_15(__invokedynamic1309_14(21521, (4352883847942901798L ^ life4_3)));
    __call1309_16();
    __call1309_17();
    life8_54 = new moom.ir(__fieldRead1309_18(receiver));
    __call1309_29((((__call1309_19(life8_54) - __invokedynamic1309_20(15291, (4736323523181543301L ^ life4_3))) / 2) * __call1309_21(life8_54)), (((__call1309_22(life8_54) - __invokedynamic1309_23(16471, (3251230214139446341L ^ life4_3))) / 2) * __call1309_24(life8_54)), (__invokedynamic1309_25(11514, (2016078788383172837L ^ life4_3)) * __call1309_26(life8_54)), (__invokedynamic1309_27(10308, (4925594742223236210L ^ life4_3)) * __call1309_28(life8_54)));
    __call1309_30(-0x1.5c28f6p-2f, 0x1.d70a3ep-3f, 0x0.0p0f);
    __call1309_31(0x1.68p6f, 0x1.555556p0f, 0x1.2p3f, 0x1.4p6f);
    life9_108 = 0x1.0p0f;
    __call1309_33(__invokedynamic1309_32(31813, (863843618192373856L ^ life4_3)));
    __call1309_34();
    __call1309_35();
    __call1309_36(0x0.0p0f, 0x1.a66666p1f, -0x1.0p4f);
    __call1309_37(life9_108, life9_108, life9_108);
    life10_126 = 0x1.4p2f;
    __call1309_38(life10_126, life10_126, life10_126);
    __call1309_39(0x1.68p7f, 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
    __call1309_43(__call1309_41(__fieldRead1309_40(receiver)), __fieldRead1309_42());
    __call1309_44(0x1.4p4f, 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
    life11_156 = (__fieldRead1309_45(receiver) + ((__fieldRead1309_46(receiver) - __fieldRead1309_47(receiver)) * p0));
    __call1309_48(((0x1.0p0f - life11_156) * 0x1.99999ap-3f), ((0x1.0p0f - life11_156) * 0x1.99999ap-4f), ((0x1.0p0f - life11_156) * 0x1.0p-2f));
    __call1309_49((((-(0x1.0p0f - life11_156)) * 0x1.68p6f) - 0x1.68p6f), 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    __call1309_50(0x1.68p7f, 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
    life12_202 = ((__fieldRead1309_51(receiver) + ((__fieldRead1309_52(receiver) - __fieldRead1309_53(receiver)) * p0)) + 0x1.0p-2f);
    life13_215 = ((__fieldRead1309_54(receiver) + ((__fieldRead1309_55(receiver) - __fieldRead1309_56(receiver)) * p0)) + 0x1.8p-1f);
    life12_226 = (((life12_202 - ((float) __call1309_57(((double) life12_202)))) * 0x1.99999ap0f) - 0x1.333334p-2f);
    life13_237 = (((life13_215 - ((float) __call1309_58(((double) life13_215)))) * 0x1.99999ap0f) - 0x1.333334p-2f);
    if (!((__numericCompare1309_59(life12_226, 0x0.0p0f) < 0))) {
        break lexical_join_244;
    }
    life12_226 = 0x0.0p0f;
    }
    if (!((__numericCompare1309_60(life13_237, 0x0.0p0f) < 0))) {
        break lexical_join_250;
    }
    life13_237 = 0x0.0p0f;
    }
    if (!((__numericCompare1309_61(life12_226, 0x1.0p0f) > 0))) {
        break lexical_join_256;
    }
    life12_226 = 0x1.0p0f;
    }
    if (!((__numericCompare1309_62(life13_237, 0x1.0p0f) > 0))) {
        break lexical_join_262;
    }
    life13_237 = 0x1.0p0f;
    }
    __call1309_63();
    spill1309_0 = 30009;
    __call1309_65(__fieldRead1309_64(), null, 0x0.0p0f, life12_226, life13_237, life11_156, 0x0.0p0f, 0x1.0p-4f);
    spill1309_1 = (7045433489680412937L ^ life4_3);
    __call1309_66();
    __call1309_67();
    __call1309_69(__invokedynamic1309_68(spill1309_0, spill1309_1));
    spill1309_2 = 13524;
    __call1309_74(0, 0, __fieldRead1309_71(__fieldRead1309_70(receiver)), __fieldRead1309_73(__fieldRead1309_72(receiver)));
    spill1309_3 = (5054082743747539139L ^ life4_3);
    __call1309_75();
    __call1309_77(__invokedynamic1309_76(spill1309_2, spill1309_3));
    __call1309_78();
    __call1309_79();
    __call1309_80(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call1309_84(__call1309_81(), ((long) __fieldRead1309_83(__fieldRead1309_82(receiver))));
    life14_312 = __call1309_86(__fieldRead1309_85(receiver));
    life15_314 = 0;
    lexical_cycle_315: while (true) {
    lexical_join_774: {
    lexical_join_731: {
    lexical_join_662: {
    lexical_join_628: {
    lexical_join_541: {
    lexical_join_423: {
    lexical_join_399: {
    if (!((life15_314 < 3))) {
        break lexical_join_776;
    }
    life16_325 = (life6_21 + __invokedynamic1309_87(20757, (6017089504490722601L ^ life4_3)));
    life17_333 = (life16_325 + __invokedynamic1309_88(23734, (1879029038778259615L ^ life4_3)));
    life18_339 = __invokedynamic1309_89(9119, (7549891117661743027L ^ life4_3));
    life19_342 = __call1309_91(__call1309_90());
    __fieldWrite1309_92(receiver, 0x0.0p0f);
    __call1309_96(__call1309_94(__fieldRead1309_93(receiver)), __fieldRead1309_95());
    life20_356 = (__fieldRead1309_98(__fieldRead1309_97(receiver)))[life15_314];
    __call1309_99(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    if (!((life20_356 == 0))) {
        break lexical_join_399;
    }
    __call1309_105(receiver, life16_325, ((life7_29 + __invokedynamic1309_100(30678, (5302134928776213476L ^ life4_3))) + (__invokedynamic1309_101(30987, (5689395023645031736L ^ life4_3)) * life15_314)), 0, __invokedynamic1309_102(3762, (2257184868883253924L ^ life4_3)), __invokedynamic1309_103(10310, (6398716847997545577L ^ life4_3)), __invokedynamic1309_104(30987, (5689395023645031736L ^ life4_3)));
    break lexical_join_774;
    }
    life21_403 = __invokedynamic1309_106(life20_356);
    spill1309_4 = 6035;
    life22_408 = __fieldRead1309_108(__fieldRead1309_107(receiver));
    life23_413 = __invokedynamic1309_109(spill1309_4, (2862867967017997233L ^ life4_3));
    if (!((life14_312 >= (life15_314 + 1)))) {
        break lexical_join_423;
    }
    if (!((__fieldRead1309_112(__fieldRead1309_111(__fieldRead1309_110(receiver))) < life20_356))) {
        break lexical_join_541;
    }
    }
    if (!((!__fieldRead1309_116(__fieldRead1309_115(__fieldRead1309_114(__fieldRead1309_113(receiver))))))) {
        break lexical_join_541;
    }
    __call1309_122(receiver, life16_325, ((life7_29 + __invokedynamic1309_117(30678, (5302134928776213476L ^ life4_3))) + (__invokedynamic1309_118(30987, (5689395023645031736L ^ life4_3)) * life15_314)), 0, __invokedynamic1309_119(11436, (4226485081169488025L ^ life4_3)), __invokedynamic1309_120(10310, (6398716847997545577L ^ life4_3)), __invokedynamic1309_121(30987, (5689395023645031736L ^ life4_3)));
    __call1309_129(receiver, (life16_325 + 1), ((life7_29 + __invokedynamic1309_123(18186, (2862199582847206194L ^ life4_3))) + (__invokedynamic1309_124(30987, (5689395023645031736L ^ life4_3)) * life15_314)), (__invokedynamic1309_125(28993, (7351501400319178107L ^ life4_3)) * life15_314), __invokedynamic1309_126(3247, (7533392073396996226L ^ life4_3)), __invokedynamic1309_127(22541, (1549680075103509549L ^ life4_3)), __invokedynamic1309_128(22541, (1549680075103509549L ^ life4_3)));
    __call1309_133(life22_408, life19_342, life17_333, ((life7_29 + __invokedynamic1309_130(22541, (1549680075103509549L ^ life4_3))) + (__invokedynamic1309_131(30987, (5689395023645031736L ^ life4_3)) * life15_314)), life18_339, ((life23_413 & __invokedynamic1309_132(29709, (5815611559381970992L ^ life4_3))) >> 1));
    life23_547 = __invokedynamic1309_134(6421, (8175258584730590465L ^ life4_3));
    break lexical_join_731;
    }
    life24_558 = (p1 - (life6_21 + __invokedynamic1309_135(20757, (6017089504490722601L ^ life4_3))));
    life25_576 = (p2 - ((life7_29 + __invokedynamic1309_136(30678, (5302134928776213476L ^ life4_3))) + (__invokedynamic1309_137(30987, (5689395023645031736L ^ life4_3)) * life15_314)));
    if (!((life24_558 >= 0))) {
        break lexical_join_628;
    }
    if (!((life25_576 >= 0))) {
        break lexical_join_628;
    }
    if (!((life24_558 < __invokedynamic1309_138(10310, (6398716847997545577L ^ life4_3))))) {
        break lexical_join_628;
    }
    if (!((life25_576 < __invokedynamic1309_139(30987, (5689395023645031736L ^ life4_3))))) {
        break lexical_join_628;
    }
    __call1309_145(receiver, life16_325, ((life7_29 + __invokedynamic1309_140(30678, (5302134928776213476L ^ life4_3))) + (__invokedynamic1309_141(30987, (5689395023645031736L ^ life4_3)) * life15_314)), 0, __invokedynamic1309_142(14980, (5247131574632152757L ^ life4_3)), __invokedynamic1309_143(10310, (6398716847997545577L ^ life4_3)), __invokedynamic1309_144(30987, (5689395023645031736L ^ life4_3)));
    life23_413 = __invokedynamic1309_146(14304, (6868761637875545025L ^ life4_3));
    break lexical_join_662;
    }
    __call1309_152(receiver, life16_325, ((life7_29 + __invokedynamic1309_147(30678, (5302134928776213476L ^ life4_3))) + (__invokedynamic1309_148(30987, (5689395023645031736L ^ life4_3)) * life15_314)), 0, __invokedynamic1309_149(13584, (4925599500446822670L ^ life4_3)), __invokedynamic1309_150(10310, (6398716847997545577L ^ life4_3)), __invokedynamic1309_151(30987, (5689395023645031736L ^ life4_3)));
    }
    __call1309_159(receiver, (life16_325 + 1), ((life7_29 + __invokedynamic1309_153(5149, (8405762165885161484L ^ life4_3))) + (__invokedynamic1309_154(30987, (5689395023645031736L ^ life4_3)) * life15_314)), (__invokedynamic1309_155(22541, (1549680075103509549L ^ life4_3)) * life15_314), __invokedynamic1309_156(31537, (3617673314788163338L ^ life4_3)), __invokedynamic1309_157(22541, (1549680075103509549L ^ life4_3)), __invokedynamic1309_158(22541, (1549680075103509549L ^ life4_3)));
    __call1309_162(life22_408, life19_342, life17_333, ((life7_29 + __invokedynamic1309_160(22541, (1549680075103509549L ^ life4_3))) + (__invokedynamic1309_161(30987, (5689395023645031736L ^ life4_3)) * life15_314)), life18_339, life23_413);
    life23_547 = __invokedynamic1309_163(16409, (2422360450366669874L ^ life4_3));
    }
    life22_751 = __fieldRead1309_165(__fieldRead1309_164(receiver));
    __call1309_171(life22_751, life21_403, ((float) ((life17_333 + __invokedynamic1309_166(3092, (1326008305640818689L ^ life4_3))) - __call1309_167(life22_751, life21_403))), ((float) (((life7_29 + __invokedynamic1309_168(22541, (1549680075103509549L ^ life4_3))) + (__invokedynamic1309_169(30987, (5689395023645031736L ^ life4_3)) * life15_314)) + __invokedynamic1309_170(5497, (3919346042488672582L ^ life4_3)))), life23_547);
    }
    life15_314 += 1;
    continue lexical_cycle_315;
    }
    }
    return;
}
public static void h1309_0(moom.Oo p0) throws Throwable {
    throw __call1130900_0(p0);
}
public static void h1309_1(moom.Oo p0) throws Throwable {
    throw __call1130901_0(p0);
}
public static void h1309_2(moom.Oo p0) throws Throwable {
    throw __call1130902_0(p0);
}
public static void h1309_3(moom.Oo p0) throws Throwable {
    throw __call1130903_0(p0);
}
public static void h1309_4(moom.Oo p0) throws Throwable {
    throw __call1130904_0(p0);
}
public static void h1309_5(moom.Oo p0) throws Throwable {
    throw __call1130905_0(p0);
}
private static native long __fieldRead1309_0() throws Throwable;
private static native void __call1309_1(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1309_2(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1309_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead1309_4() throws Throwable;
private static native void __call1309_5(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __fieldRead1309_6(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __fieldRead1309_7(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __fieldRead1309_8(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __fieldRead1309_9(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __fieldRead1309_10(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __fieldRead1309_11(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native void __call1309_12(net.minecraft.client.gui.GuiEnchantment a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call1309_13() throws Throwable;
private static native int __invokedynamic1309_14(int a0, long a1) throws Throwable;
private static native void __call1309_15(int a0) throws Throwable;
private static native void __call1309_16() throws Throwable;
private static native void __call1309_17() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1309_18(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __call1309_19(moom.ir a0) throws Throwable;
private static native int __invokedynamic1309_20(int a0, long a1) throws Throwable;
private static native int __call1309_21(moom.ir a0) throws Throwable;
private static native int __call1309_22(moom.ir a0) throws Throwable;
private static native int __invokedynamic1309_23(int a0, long a1) throws Throwable;
private static native int __call1309_24(moom.ir a0) throws Throwable;
private static native int __invokedynamic1309_25(int a0, long a1) throws Throwable;
private static native int __call1309_26(moom.ir a0) throws Throwable;
private static native int __invokedynamic1309_27(int a0, long a1) throws Throwable;
private static native int __call1309_28(moom.ir a0) throws Throwable;
private static native void __call1309_29(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call1309_30(float a0, float a1, float a2) throws Throwable;
private static native void __call1309_31(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic1309_32(int a0, long a1) throws Throwable;
private static native void __call1309_33(int a0) throws Throwable;
private static native void __call1309_34() throws Throwable;
private static native void __call1309_35() throws Throwable;
private static native void __call1309_36(float a0, float a1, float a2) throws Throwable;
private static native void __call1309_37(float a0, float a1, float a2) throws Throwable;
private static native void __call1309_38(float a0, float a1, float a2) throws Throwable;
private static native void __call1309_39(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1309_40(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1309_41(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead1309_42() throws Throwable;
private static native void __call1309_43(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call1309_44(float a0, float a1, float a2, float a3) throws Throwable;
private static native float __fieldRead1309_45(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native float __fieldRead1309_46(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native float __fieldRead1309_47(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native void __call1309_48(float a0, float a1, float a2) throws Throwable;
private static native void __call1309_49(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call1309_50(float a0, float a1, float a2, float a3) throws Throwable;
private static native float __fieldRead1309_51(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native float __fieldRead1309_52(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native float __fieldRead1309_53(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native float __fieldRead1309_54(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native float __fieldRead1309_55(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native float __fieldRead1309_56(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __call1309_57(double a0) throws Throwable;
private static native int __call1309_58(double a0) throws Throwable;
private static native int __numericCompare1309_59(float a0, float a1) throws Throwable;
private static native int __numericCompare1309_60(float a0, float a1) throws Throwable;
private static native int __numericCompare1309_61(float a0, float a1) throws Throwable;
private static native int __numericCompare1309_62(float a0, float a1) throws Throwable;
private static native void __call1309_63() throws Throwable;
private static native moom.i3 __fieldRead1309_64() throws Throwable;
private static native void __call1309_65(moom.i3 a0, java.lang.Object a1, float a2, float a3, float a4, float a5, float a6, float a7) throws Throwable;
private static native void __call1309_66() throws Throwable;
private static native void __call1309_67() throws Throwable;
private static native int __invokedynamic1309_68(int a0, long a1) throws Throwable;
private static native void __call1309_69(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1309_70(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __fieldRead1309_71(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1309_72(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __fieldRead1309_73(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1309_74(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call1309_75() throws Throwable;
private static native int __invokedynamic1309_76(int a0, long a1) throws Throwable;
private static native void __call1309_77(int a0) throws Throwable;
private static native void __call1309_78() throws Throwable;
private static native void __call1309_79() throws Throwable;
private static native void __call1309_80(float a0, float a1, float a2, float a3) throws Throwable;
private static native moom.CX __call1309_81() throws Throwable;
private static native moom.we __fieldRead1309_82(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __fieldRead1309_83(moom.we a0) throws Throwable;
private static native void __call1309_84(moom.CX a0, long a1) throws Throwable;
private static native moom.we __fieldRead1309_85(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __call1309_86(moom.we a0) throws Throwable;
private static native int __invokedynamic1309_87(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_88(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_89(int a0, long a1) throws Throwable;
private static native moom.CX __call1309_90() throws Throwable;
private static native java.lang.String __call1309_91(moom.CX a0) throws Throwable;
private static native void __fieldWrite1309_92(net.minecraft.client.gui.GuiEnchantment a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1309_93(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1309_94(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead1309_95() throws Throwable;
private static native void __call1309_96(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native moom.we __fieldRead1309_97(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int[] __fieldRead1309_98(moom.we a0) throws Throwable;
private static native void __call1309_99(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic1309_100(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_101(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_102(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_103(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_104(int a0, long a1) throws Throwable;
private static native void __call1309_105(net.minecraft.client.gui.GuiEnchantment a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native java.lang.String __invokedynamic1309_106(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1309_107(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1309_108(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic1309_109(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1309_110(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1309_111(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1309_112(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1309_113(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1309_114(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead1309_115(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native boolean __fieldRead1309_116(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native int __invokedynamic1309_117(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_118(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_119(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_120(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_121(int a0, long a1) throws Throwable;
private static native void __call1309_122(net.minecraft.client.gui.GuiEnchantment a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic1309_123(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_124(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_125(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_126(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_127(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_128(int a0, long a1) throws Throwable;
private static native void __call1309_129(net.minecraft.client.gui.GuiEnchantment a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic1309_130(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_131(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_132(int a0, long a1) throws Throwable;
private static native void __call1309_133(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native int __invokedynamic1309_134(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_135(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_136(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_137(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_138(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_139(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_140(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_141(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_142(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_143(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_144(int a0, long a1) throws Throwable;
private static native void __call1309_145(net.minecraft.client.gui.GuiEnchantment a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic1309_146(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_147(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_148(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_149(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_150(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_151(int a0, long a1) throws Throwable;
private static native void __call1309_152(net.minecraft.client.gui.GuiEnchantment a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic1309_153(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_154(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_155(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_156(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_157(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_158(int a0, long a1) throws Throwable;
private static native void __call1309_159(net.minecraft.client.gui.GuiEnchantment a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic1309_160(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_161(int a0, long a1) throws Throwable;
private static native void __call1309_162(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native int __invokedynamic1309_163(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1309_164(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1309_165(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic1309_166(int a0, long a1) throws Throwable;
private static native int __call1309_167(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1309_168(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_169(int a0, long a1) throws Throwable;
private static native int __invokedynamic1309_170(int a0, long a1) throws Throwable;
private static native int __call1309_171(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native java.lang.Exception __call1130900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1130901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1130902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1130903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1130904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1130905_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ddfb94f3d26132010a29(net.minecraft.client.gui.GuiEnchantment a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_ddfb94f3d26132010a29 {

public static void f2239(net.minecraft.client.gui.GuiEnchantment receiver, int p0, int p1, float p2) throws Throwable {
    long life4_3;
    int life6_14;
    int life7_18;
    int life8_20;
    int life9_29;
    int life10_35;
    int life11_39;
    java.util.ArrayList life12_84;
    java.lang.String life13_121;
    java.lang.String life13_171;
    java.lang.String life13_179;
    java.lang.String life13_216;
    life4_3 = (__fieldRead2239_0() ^ 48755026613142L);
    __call2239_1(receiver, p0, p1, p2);
    life6_14 = __integerCategory2239_6(__fieldRead2239_5(__fieldRead2239_4(__fieldRead2239_3(__fieldRead2239_2(receiver)))));
    life7_18 = __call2239_8(__fieldRead2239_7(receiver));
    life8_20 = 0;
    loop_region_21: while ((life8_20 < 3)) {
        life9_29 = (__fieldRead2239_10(__fieldRead2239_9(receiver)))[life8_20];
        life10_35 = (__fieldRead2239_12(__fieldRead2239_11(receiver)))[life8_20];
        life11_39 = (life8_20 + 1);
        if (__call2239_18(receiver, __invokedynamic2239_13(7573, (6441967239675884070L ^ life4_3)), (__invokedynamic2239_14(26189, (4428415295617649120L ^ life4_3)) + (__invokedynamic2239_15(24969, (8777670450410343991L ^ life4_3)) * life8_20)), __invokedynamic2239_16(12367, (8773666550221807595L ^ life4_3)), __invokedynamic2239_17(1016, (4863292587660848214L ^ life4_3)), p0, p1)) {
        if ((life9_29 > 0)) {
        if ((life10_35 >= 0)) {
        life12_84 = __call2239_19();
        if ((life10_35 >= 0)) {
        if ((__call2239_21((life10_35 & __invokedynamic2239_20(9563, (3164753488278981367L ^ life4_3)))) != null)) {
        life13_121 = __call2239_26(__call2239_23((life10_35 & __invokedynamic2239_22(7842, (7955959267856101634L ^ life4_3)))), ((life10_35 & __invokedynamic2239_24(18769, (5231363629852780280L ^ life4_3))) >> __invokedynamic2239_25(7563, (6173961576520561193L ^ life4_3))));
        __call2239_32(life12_84, __invokedynamic2239_31(__call2239_28(__fieldRead2239_27()), __fieldRead2239_29(), __call2239_30("container.enchant.clue", new java.lang.Object[] {life13_121})));
    }
    }
        if ((life6_14 == 0)) {
        if ((life10_35 >= 0)) {
        __call2239_33(life12_84, "");
    }
        if ((__fieldRead2239_36(__fieldRead2239_35(__fieldRead2239_34(receiver))) < life9_29)) {
        __call2239_41(life12_84, __invokedynamic2239_40(__fieldRead2239_37(), (__fieldRead2239_39(__fieldRead2239_38(receiver)))[life8_20]));
    } else {
        life13_171 = "";
        if ((life11_39 == 1)) {
        life13_179 = __call2239_42("container.enchant.lapis.one", new java.lang.Object[0]);
    } else {
        life13_179 = __call2239_44("container.enchant.lapis.many", new java.lang.Object[] {__call2239_43(life11_39)});
    }
        if ((life7_18 >= life11_39)) {
        __call2239_47(life12_84, __invokedynamic2239_46(__fieldRead2239_45(), life13_179));
    } else {
        __call2239_50(life12_84, __invokedynamic2239_49(__fieldRead2239_48(), life13_179));
    }
        if ((life11_39 == 1)) {
        life13_216 = __call2239_51("container.enchant.level.one", new java.lang.Object[0]);
    } else {
        life13_216 = __call2239_53("container.enchant.level.many", new java.lang.Object[] {__call2239_52(life11_39)});
    }
        __call2239_56(life12_84, __invokedynamic2239_55(__fieldRead2239_54(), life13_216));
    }
    }
        __call2239_57(receiver, life12_84, p0, p1);
        break loop_region_21;
    }
    }
    }
        life8_20 += 1;
    }
    return;
}
public static void h2239_0(moom.Oo p0) throws Throwable {
    throw __call1223900_0(p0);
}
public static void h2239_1(moom.Oo p0) throws Throwable {
    throw __call1223901_0(p0);
}
public static void h2239_2(moom.Oo p0) throws Throwable {
    throw __call1223902_0(p0);
}
public static void h2239_3(moom.Oo p0) throws Throwable {
    throw __call1223903_0(p0);
}
public static void h2239_4(moom.Oo p0) throws Throwable {
    throw __call1223904_0(p0);
}
public static void h2239_5(moom.Oo p0) throws Throwable {
    throw __call1223905_0(p0);
}
public static void h2239_6(moom.Oo p0) throws Throwable {
    throw __call1223906_0(p0);
}
private static native long __fieldRead2239_0() throws Throwable;
private static native void __call2239_1(net.minecraft.client.gui.GuiEnchantment a0, int a1, int a2, float a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2239_2(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead2239_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead2239_4(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native boolean __fieldRead2239_5(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native int __integerCategory2239_6(boolean value) throws Throwable;
private static native moom.we __fieldRead2239_7(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __call2239_8(moom.we a0) throws Throwable;
private static native moom.we __fieldRead2239_9(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int[] __fieldRead2239_10(moom.we a0) throws Throwable;
private static native moom.we __fieldRead2239_11(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int[] __fieldRead2239_12(moom.we a0) throws Throwable;
private static native int __invokedynamic2239_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic2239_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic2239_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic2239_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic2239_17(int a0, long a1) throws Throwable;
private static native boolean __call2239_18(net.minecraft.client.gui.GuiEnchantment a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native java.util.ArrayList __call2239_19() throws Throwable;
private static native int __invokedynamic2239_20(int a0, long a1) throws Throwable;
private static native net.minecraft.enchantment.Enchantment __call2239_21(int a0) throws Throwable;
private static native int __invokedynamic2239_22(int a0, long a1) throws Throwable;
private static native net.minecraft.enchantment.Enchantment __call2239_23(int a0) throws Throwable;
private static native int __invokedynamic2239_24(int a0, long a1) throws Throwable;
private static native int __invokedynamic2239_25(int a0, long a1) throws Throwable;
private static native java.lang.String __call2239_26(net.minecraft.enchantment.Enchantment a0, int a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead2239_27() throws Throwable;
private static native java.lang.String __call2239_28(net.minecraft.util.EnumChatFormatting a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead2239_29() throws Throwable;
private static native java.lang.String __call2239_30(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic2239_31(java.lang.String a0, net.minecraft.util.EnumChatFormatting a1, java.lang.String a2) throws Throwable;
private static native boolean __call2239_32(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native boolean __call2239_33(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2239_34(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead2239_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead2239_36(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead2239_37() throws Throwable;
private static native moom.we __fieldRead2239_38(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int[] __fieldRead2239_39(moom.we a0) throws Throwable;
private static native java.lang.String __invokedynamic2239_40(net.minecraft.util.EnumChatFormatting a0, int a1) throws Throwable;
private static native boolean __call2239_41(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2239_42(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Integer __call2239_43(int a0) throws Throwable;
private static native java.lang.String __call2239_44(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead2239_45() throws Throwable;
private static native java.lang.String __invokedynamic2239_46(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws Throwable;
private static native boolean __call2239_47(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead2239_48() throws Throwable;
private static native java.lang.String __invokedynamic2239_49(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws Throwable;
private static native boolean __call2239_50(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2239_51(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Integer __call2239_52(int a0) throws Throwable;
private static native java.lang.String __call2239_53(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead2239_54() throws Throwable;
private static native java.lang.String __invokedynamic2239_55(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws Throwable;
private static native boolean __call2239_56(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native void __call2239_57(net.minecraft.client.gui.GuiEnchantment a0, java.util.ArrayList a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1223900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1223901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1223902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1223903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1223904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1223905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1223906_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4ef2a14e963e2d885d7f(net.minecraft.client.gui.GuiEnchantment a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_4ef2a14e963e2d885d7f {

public static void f2240(net.minecraft.client.gui.GuiEnchantment receiver, int p0, int p1, int p2) throws Throwable {
    long life4_3;
    int life6_16;
    int life7_24;
    int life8_26;
    int life9_39;
    int life10_57;
    life4_3 = (__fieldRead2240_0() ^ 71794512611466L);
    __call2240_1(receiver, p0, p1, p2);
    life6_16 = ((__fieldRead2240_2(receiver) - __fieldRead2240_3(receiver)) / 2);
    life7_24 = ((__fieldRead2240_4(receiver) - __fieldRead2240_5(receiver)) / 2);
    life8_26 = 0;
    loop_region_27: while ((life8_26 < 3)) {
        life9_39 = (p0 - (life6_16 + __invokedynamic2240_6(20757, (6017034087513286079L ^ life4_3))));
        life10_57 = (p1 - ((life7_24 + __invokedynamic2240_7(30678, (5302078410676650866L ^ life4_3))) + (__invokedynamic2240_8(30987, (5689446249808219566L ^ life4_3)) * life8_26)));
        if ((life9_39 >= 0)) {
        if ((life10_57 >= 0)) {
        if ((life9_39 < __invokedynamic2240_9(10310, (6398766846605040895L ^ life4_3)))) {
        if ((life10_57 < __invokedynamic2240_10(30987, (5689446249808219566L ^ life4_3)))) {
        if (__call2240_14(__fieldRead2240_11(receiver), __fieldRead2240_13(__fieldRead2240_12(receiver)), life8_26)) {
        __call2240_19(__fieldRead2240_16(__fieldRead2240_15(receiver)), __fieldRead2240_18(__fieldRead2240_17(receiver)), life8_26);
    }
    }
    }
    }
    }
        life8_26 += 1;
    }
    return;
}
public static void h2240_0(java.io.IOException p0) throws Throwable {
    throw __call1224000_0(p0);
}
public static void h2240_1(java.io.IOException p0) throws Throwable {
    throw __call1224001_0(p0);
}
public static void h2240_2(java.io.IOException p0) throws Throwable {
    throw __call1224002_0(p0);
}
public static void h2240_3(java.io.IOException p0) throws Throwable {
    throw __call1224003_0(p0);
}
public static void h2240_4(java.io.IOException p0) throws Throwable {
    throw __call1224004_0(p0);
}
private static native long __fieldRead2240_0() throws Throwable;
private static native void __call2240_1(net.minecraft.client.gui.GuiEnchantment a0, int a1, int a2, int a3) throws Throwable;
private static native int __fieldRead2240_2(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __fieldRead2240_3(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __fieldRead2240_4(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __fieldRead2240_5(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __invokedynamic2240_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic2240_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic2240_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic2240_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic2240_10(int a0, long a1) throws Throwable;
private static native moom.we __fieldRead2240_11(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2240_12(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead2240_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call2240_14(moom.we a0, net.minecraft.client.entity.EntityPlayerSP a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2240_15(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native moom.jI __fieldRead2240_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.we __fieldRead2240_17(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __fieldRead2240_18(moom.we a0) throws Throwable;
private static native void __call2240_19(moom.jI a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1224000_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1224001_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1224002_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1224003_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1224004_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fc9b6c6e2fa5cc90cedd(net.minecraft.client.gui.GuiEnchantment a0) throws E;
private static final class __SourceHandler_fc9b6c6e2fa5cc90cedd {

public static void f201(net.minecraft.client.gui.GuiEnchantment receiver) throws Throwable {
    net.minecraft.item.ItemStack life1_5;
    int life2_63;
    int life3_65;
    float life3_114;
    float life4_116;
    float life3_122;
    lexical_join_92: {
    lexical_join_86: {
    lexical_join_77: {
    lexical_join_45: {
    life1_5 = __call201_2(__call201_1(__fieldRead201_0(receiver), 0));
    if (!((!__call201_4(life1_5, __fieldRead201_3(receiver))))) {
        break lexical_join_45;
    }
    __fieldWrite201_5(receiver, life1_5);
    lexical_cycle_14: while (true) {
    net.minecraft.client.gui.GuiEnchantment __stackOp201_6_0 = receiver;
    __fieldWrite201_12(__stackOp201_6_0, (__fieldRead201_7(__stackOp201_6_0) + ((float) (__call201_9(__fieldRead201_8(receiver), 4) - __call201_11(__fieldRead201_10(receiver), 4)))));
    if (!((__numericCompare201_15(__fieldRead201_13(receiver), (__fieldRead201_14(receiver) + 0x1.0p0f)) <= 0))) {
        break lexical_join_45;
    }
    if (!((__numericCompare201_18(__fieldRead201_16(receiver), (__fieldRead201_17(receiver) - 0x1.0p0f)) < 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    net.minecraft.client.gui.GuiEnchantment __stackOp201_19_0 = receiver;
    __fieldWrite201_21(__stackOp201_19_0, (__fieldRead201_20(__stackOp201_19_0) + 1));
    __fieldWrite201_23(receiver, __fieldRead201_22(receiver));
    __fieldWrite201_25(receiver, __fieldRead201_24(receiver));
    life2_63 = 0;
    life3_65 = 0;
    lexical_cycle_63: while (true) {
    lexical_join_75: {
    if (!((life3_65 < 3))) {
        break lexical_join_77;
    }
    if (!(((__fieldRead201_27(__fieldRead201_26(receiver)))[life3_65] != 0))) {
        break lexical_join_75;
    }
    life2_63 = 1;
    break lexical_join_77;
    }
    life3_65 += 1;
    continue lexical_cycle_63;
    }
    }
    if (!((life2_63 != 0))) {
        break lexical_join_86;
    }
    net.minecraft.client.gui.GuiEnchantment __stackOp201_28_0 = receiver;
    __fieldWrite201_30(__stackOp201_28_0, (__fieldRead201_29(__stackOp201_28_0) + 0x1.99999ap-3f));
    break lexical_join_92;
    }
    net.minecraft.client.gui.GuiEnchantment __stackOp201_31_0 = receiver;
    __fieldWrite201_33(__stackOp201_31_0, (__fieldRead201_32(__stackOp201_31_0) - 0x1.99999ap-3f));
    }
    __fieldWrite201_36(receiver, __call201_35(__fieldRead201_34(receiver), 0x0.0p0f, 0x1.0p0f));
    life3_114 = ((__fieldRead201_37(receiver) - __fieldRead201_38(receiver)) * 0x1.99999ap-2f);
    life4_116 = 0x1.99999ap-3f;
    life3_122 = __call201_39(life3_114, (-life4_116), life4_116);
    net.minecraft.client.gui.GuiEnchantment __stackOp201_40_0 = receiver;
    __fieldWrite201_43(__stackOp201_40_0, (__fieldRead201_41(__stackOp201_40_0) + ((life3_122 - __fieldRead201_42(receiver)) * 0x1.ccccccp-1f)));
    net.minecraft.client.gui.GuiEnchantment __stackOp201_44_0 = receiver;
    __fieldWrite201_47(__stackOp201_44_0, (__fieldRead201_45(__stackOp201_44_0) + __fieldRead201_46(receiver)));
    return;
}
public static void h201_0(moom.Oo p0) throws Throwable {
    throw __call1020100_0(p0);
}
public static void h201_1(moom.Oo p0) throws Throwable {
    throw __call1020101_0(p0);
}
public static void h201_2(moom.Oo p0) throws Throwable {
    throw __call1020102_0(p0);
}
private static native moom.v8 __fieldRead201_0(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native moom.wB __call201_1(moom.v8 a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call201_2(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead201_3(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native boolean __call201_4(net.minecraft.item.ItemStack a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native void __fieldWrite201_5(net.minecraft.client.gui.GuiEnchantment a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native float __fieldRead201_7(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native java.util.Random __fieldRead201_8(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __call201_9(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead201_10(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __call201_11(java.util.Random a0, int a1) throws Throwable;
private static native void __fieldWrite201_12(net.minecraft.client.gui.GuiEnchantment a0, float a1) throws Throwable;
private static native float __fieldRead201_13(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native float __fieldRead201_14(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __numericCompare201_15(float a0, float a1) throws Throwable;
private static native float __fieldRead201_16(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native float __fieldRead201_17(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int __numericCompare201_18(float a0, float a1) throws Throwable;
private static native int __fieldRead201_20(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native void __fieldWrite201_21(net.minecraft.client.gui.GuiEnchantment a0, int a1) throws Throwable;
private static native float __fieldRead201_22(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native void __fieldWrite201_23(net.minecraft.client.gui.GuiEnchantment a0, float a1) throws Throwable;
private static native float __fieldRead201_24(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native void __fieldWrite201_25(net.minecraft.client.gui.GuiEnchantment a0, float a1) throws Throwable;
private static native moom.we __fieldRead201_26(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native int[] __fieldRead201_27(moom.we a0) throws Throwable;
private static native float __fieldRead201_29(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native void __fieldWrite201_30(net.minecraft.client.gui.GuiEnchantment a0, float a1) throws Throwable;
private static native float __fieldRead201_32(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native void __fieldWrite201_33(net.minecraft.client.gui.GuiEnchantment a0, float a1) throws Throwable;
private static native float __fieldRead201_34(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native float __call201_35(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite201_36(net.minecraft.client.gui.GuiEnchantment a0, float a1) throws Throwable;
private static native float __fieldRead201_37(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native float __fieldRead201_38(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native float __call201_39(float a0, float a1, float a2) throws Throwable;
private static native float __fieldRead201_41(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native float __fieldRead201_42(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native void __fieldWrite201_43(net.minecraft.client.gui.GuiEnchantment a0, float a1) throws Throwable;
private static native float __fieldRead201_45(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native float __fieldRead201_46(net.minecraft.client.gui.GuiEnchantment a0) throws Throwable;
private static native void __fieldWrite201_47(net.minecraft.client.gui.GuiEnchantment a0, float a1) throws Throwable;
private static native java.lang.Exception __call1020100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1020101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1020102_0(moom.Oo a0) throws Throwable;

}


public void b__sourceReturn_da8c82d5d4() { __sourceHandlerCall_fc9b6c6e2fa5cc90cedd(this); }


protected void b(int p0, int p1) {
long local3 = (net.minecraft.client.gui.GuiEnchantment.cb ^ 61551382271165L);
    ((net.minecraft.client.gui.FontRenderer)(this.p)).b(((java.lang.String)(((net.minecraft.util.IChatComponent)(((net.minecraft.world.IWorldNameable)(this.an)).a__C5())).b())), ((float)(0x1.8p3f)), ((float)(0x1.4p2f)), ((int)(__sourceIntrinsic_45fde0f4e55e_originalDynamicSite1776_5(18272, (4612689437425577938L ^ local3)))));
    ((net.minecraft.client.gui.FontRenderer)(this.p)).b(((java.lang.String)(((net.minecraft.util.IChatComponent)(((net.minecraft.entity.player.InventoryPlayer)(this.ac)).a__C5())).b())), ((float)(0x1.0p3f)), ((float)(((float) ((this.y - __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1776_12(16223, (5264116347048089582L ^ local3))) + 2)))), ((int)(__sourceIntrinsic_45fde0f4e55e_originalDynamicSite1776_13(5301, (6116856547693689865L ^ local3)))));
    return;
}


private static java.lang.Exception c(java.lang.Exception p0) {
return p0;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10244_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31052;
      if (pb[var3] == null) {
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
         long var5 = fb[var3];
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
         Object[] var9 = (Object[])qb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               qb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         pb[var3] = var15;
      }

      return pb[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiEnchantment.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_4ef2a14e963e2d885d7f(this, p0, p1, p2); }


public void a(int p0, int p1, float p2) { __sourceHandlerCall_ddfb94f3d26132010a29(this, p0, p1, p2); }


protected void a(float p0, int p1, int p2) { __sourceHandlerCall_d5ffbac1b6322d09adfd(this, p0, p1, p2); }


public void g() {
super.g();
    ((net.minecraft.client.gui.GuiEnchantment)(this)).b__sourceReturn_da8c82d5d4();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1776_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1776_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1776_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10244_0() throws E;
}
