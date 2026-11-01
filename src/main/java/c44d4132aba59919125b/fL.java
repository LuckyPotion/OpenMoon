package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class fL implements net.minecraft.util.IProgressUpdate {

private java.lang.String a;

private net.minecraft.client.Minecraft b;

private java.lang.String c;

private long d;

private boolean e;

private moom.ir f;

private net.minecraft.client.shader.Framebuffer g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

private static long l;

public fL(net.minecraft.client.Minecraft p0) { super(); }

private static void __sourceConstructorBody_7ee3c1658af3d484(moom.fL receiver, net.minecraft.client.Minecraft p0) throws Throwable {
long local2 = (moom.fL.h ^ 104097281872507L);
    moom.fL.__sourceConstructorInit_7ee3c1658af3d484_0(((moom.fL)(receiver)));
    ((moom.fL)(receiver)).a = ((java.lang.String)(""));
    ((moom.fL)(receiver)).c = ((java.lang.String)(""));
    ((moom.fL)(receiver)).d = ((long)(net.minecraft.client.Minecraft.a__Long()));
    ((moom.fL)(receiver)).b = ((net.minecraft.client.Minecraft)(p0));
    ((moom.fL)(receiver)).f = ((moom.ir)(new moom.ir(p0)));
    ((moom.fL)(receiver)).g = ((net.minecraft.client.shader.Framebuffer)(new net.minecraft.client.shader.Framebuffer(((net.minecraft.client.Minecraft)(p0)).G, ((net.minecraft.client.Minecraft)(p0)).H, false)));
    ((net.minecraft.client.shader.Framebuffer)(((moom.fL)(receiver)).g)).a(((int)(__sourceIntrinsic_7ee3c1658af3d484_originalDynamicSite2715_12(6964, (7039165378462049842L ^ local2)))));
    return;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(7205907594931255541L)), ((long)(1482316963111889837L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(193994468480872L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.fL.h ^ 129225365647991L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill838_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill838_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill838_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill838_14 = new byte[8];
    (__sourceSpill838_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill838_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation838_16 = __sourceSpill838_14;
    ((javax.crypto.Cipher)(__sourceSpill838_11)).init(((int)(__sourceSpill838_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill838_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation838_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[24];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "UAöwU¾ä\020I?:¼\022Ã¸(\030!~l ß÷ÝHÆÍ\032\034ì%YõI\tc­\b8Õå#p^[Ödqß·*ªÙ.\0056òÿ\002BV\037øqØÝÄÛ/¡©b¯óCØ\022.Aû`$·ExÙîô'\004\0161Å\027>´£o'Ä\033f\037¤h*£îÆaî%àâ´2$+Tx=ï\023}8×í\032GuÐ9ëÂÀÀ4xls?¨\037T®ÑÍíÓNæÚº"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill838_25 = local11_life21;
        int __sourceSpill838_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill838_25)).substring(((int)(__sourceSpill838_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill838_30 = local13_life19;
        int __sourceSpill838_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill838_33 = new byte[8];
        (__sourceSpill838_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill838_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill838_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill838_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill838_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill838_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill838_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill838_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill838_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill838_34)).doFinal(((byte[])(__sourceSpill838_33)));
        (__sourceSpill838_30)[__sourceSpill838_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    local12_life23 = ((java.lang.String)((local11_life21 = "%\r¯¤Ù{\037\b\001°eAÆLÃé"))).length();
    local9_life24 = 0;
    do {
        java.lang.String __sourceSpill838_38 = local11_life21;
        int __sourceSpill838_39 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill838_38)).substring(((int)(__sourceSpill838_39)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill838_43 = local13_life19;
        int __sourceSpill838_44 = local10_life20;
        local10_life20 += 1;
        long local15_life45 = (((((((((((long) (local14_life42)[0]) & 255L) << 56) | ((((long) (local14_life42)[1]) & 255L) << 48)) | ((((long) (local14_life42)[2]) & 255L) << 40)) | ((((long) (local14_life42)[3]) & 255L) << 32)) | ((((long) (local14_life42)[4]) & 255L) << 24)) | ((((long) (local14_life42)[5]) & 255L) << 16)) | ((((long) (local14_life42)[6]) & 255L) << 8)) | (((long) (local14_life42)[7]) & 255L));
        byte[] __sourceSpill838_46 = new byte[8];
        (__sourceSpill838_46)[0] = ((byte) ((int) (local15_life45 >>> 56)));
        (__sourceSpill838_46)[1] = ((byte) ((int) (local15_life45 >>> 48)));
        (__sourceSpill838_46)[2] = ((byte) ((int) (local15_life45 >>> 40)));
        (__sourceSpill838_46)[3] = ((byte) ((int) (local15_life45 >>> 32)));
        (__sourceSpill838_46)[4] = ((byte) ((int) (local15_life45 >>> 24)));
        (__sourceSpill838_46)[5] = ((byte) ((int) (local15_life45 >>> 16)));
        (__sourceSpill838_46)[6] = ((byte) ((int) (local15_life45 >>> 8)));
        (__sourceSpill838_46)[7] = ((byte) ((int) local15_life45));
        javax.crypto.Cipher __sourceSpill838_47 = local7_life9;
        byte[] local17_life49 = ((javax.crypto.Cipher)(__sourceSpill838_47)).doFinal(((byte[])(__sourceSpill838_46)));
        (__sourceSpill838_43)[__sourceSpill838_44] = (((((((((((long) (local17_life49)[0]) & 255L) << 56) | ((((long) (local17_life49)[1]) & 255L) << 48)) | ((((long) (local17_life49)[2]) & 255L) << 40)) | ((((long) (local17_life49)[3]) & 255L) << 32)) | ((((long) (local17_life49)[4]) & 255L) << 24)) | ((((long) (local17_life49)[5]) & 255L) << 16)) | ((((long) (local17_life49)[6]) & 255L) << 8)) | (((long) (local17_life49)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    i = ((long[])(local13_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[24]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill838_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill838_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill838_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill838_58 = new byte[8];
    (__sourceSpill838_58)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill838_58)[local1_life59] = ((byte) ((int) ((local5_life7 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation838_60 = __sourceSpill838_58;
    ((javax.crypto.Cipher)(__sourceSpill838_55)).init(((int)(__sourceSpill838_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill838_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation838_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = -5412089475038826278L;
    byte[] __sourceSpill838_64 = new byte[8];
    (__sourceSpill838_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill838_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill838_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill838_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill838_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill838_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill838_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill838_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill838_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill838_65)).doFinal(((byte[])(__sourceSpill838_64)));
    l = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_7ee3c1658af3d484_0(moom.fL a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_3e09957a810183ccf952(moom.fL a0, int a1) throws E;
private static final class __SourceHandler_3e09957a810183ccf952 {

public static void f431(moom.fL receiver, int p0) throws Throwable {
    int forwardValue431_14_0;
    int forwardValue431_62_0;
    int forwardValue431_105_0;
    int forwardValue431_659_0;
    int forwardValue431_666_0;
    boolean spill431_0;
    boolean spill431_1;
    int spill431_2;
    long spill431_3;
    boolean spill431_4;
    int spill431_5;
    int spill431_6;
    long life2_3;
    int[] life4_5;
    long life5_28;
    moom.ir life7_52;
    int life8_55;
    int life9_58;
    int life10_61;
    int life11_134;
    net.minecraft.client.renderer.Tessellator life12_143;
    moom.lw life13_146;
    moom.Jy life14_148;
    float life15_176;
    int life15_339;
    int life16_341;
    int life17_349;
    int life18_359;
    forward_join_680: {
    forward_join_676: {
    forward_join_666: {
    forward_join_660: {
    forward_join_659: {
    forward_join_576: {
    forward_join_286: {
    forward_join_134: {
    forward_join_129: {
    forward_join_105: {
    forward_join_104: {
    forward_join_63: {
    forward_join_62: {
    forward_join_57: {
    forward_join_33: {
    forward_join_19: {
    forward_join_14: {
    life2_3 = (__fieldRead431_0() ^ 52956335481601L);
    life4_5 = __call431_1();
    spill431_0 = __fieldRead431_3(__fieldRead431_2(receiver));
    if (!((life4_5 != null))) {
        forwardValue431_14_0 = __integerCategory431_4(spill431_0);
        break forward_join_14;
    }
    if (!((!spill431_0))) {
        break forward_join_19;
    }
    forwardValue431_14_0 = __integerCategory431_6(__fieldRead431_5(receiver));
    }
    if (!((forwardValue431_14_0 == 0))) {
        break forward_join_680;
    }
    throw new net.minecraft.util.MinecraftError();
    }
    life5_28 = __call431_7();
    if (!((life4_5 != null))) {
        break forward_join_33;
    }
    if (!((__numericCompare431_10((life5_28 - __fieldRead431_8(receiver)), __fieldRead431_9()) >= 0))) {
        break forward_join_680;
    }
    __fieldWrite431_11(receiver, life5_28);
    }
    life7_52 = new moom.ir(__fieldRead431_12(receiver));
    life8_55 = __call431_13(life7_52);
    life9_58 = __call431_14(life7_52);
    life10_61 = __call431_15(life7_52);
    spill431_1 = __call431_16();
    if (!((life4_5 != null))) {
        forwardValue431_62_0 = __integerCategory431_17(spill431_1);
        break forward_join_62;
    }
    if (!(spill431_1)) {
        break forward_join_57;
    }
    __call431_19(__fieldRead431_18(receiver));
    if (!((life4_5 == null))) {
        break forward_join_63;
    }
    }
    forwardValue431_62_0 = __invokedynamic431_20(7969, (8737401649294431041L ^ life2_3));
    }
    __call431_21(forwardValue431_62_0);
    }
    __call431_23(__fieldRead431_22(receiver), 0);
    __call431_25(__invokedynamic431_24(14645, (7802078885310788951L ^ life2_3)));
    spill431_2 = 9938;
    __call431_26();
    spill431_3 = (8593713478346074805L ^ life2_3);
    __call431_29(0x0.0p0d, __call431_27(life7_52), __call431_28(life7_52), 0x0.0p0d, 0x1.9p6d, 0x1.2cp8d);
    __call431_31(__invokedynamic431_30(spill431_2, spill431_3));
    __call431_32();
    __call431_33(0x0.0p0f, 0x0.0p0f, -0x1.9p7f);
    spill431_4 = __call431_34();
    if (!((life4_5 != null))) {
        forwardValue431_105_0 = __integerCategory431_35(spill431_4);
        break forward_join_105;
    }
    if (!((!spill431_4))) {
        break forward_join_104;
    }
    __call431_37(__invokedynamic431_36(13489, (8961063300767807700L ^ life2_3)));
    }
    forwardValue431_105_0 = 1;
    }
    life11_134 = forwardValue431_105_0;
    spill431_5 = life11_134;
    if (!((life4_5 != null))) {
        forwardValue431_666_0 = spill431_5;
        break forward_join_666;
    }
    if (!((spill431_5 != 0))) {
        break forward_join_660;
    }
    life12_143 = __call431_38();
    life13_146 = __call431_39(life12_143);
    life14_148 = __call431_40();
    if (!((life4_5 != null))) {
        break forward_join_134;
    }
    if (!((life14_148 != null))) {
        break forward_join_129;
    }
    __call431_43(life14_148, __call431_41(life7_52), __call431_42(life7_52));
    if (!((life4_5 == null))) {
        break forward_join_286;
    }
    }
    __call431_47(__call431_45(__fieldRead431_44(receiver)), __fieldRead431_46());
    }
    life15_176 = 0x1.0p5f;
    __call431_50(life13_146, __invokedynamic431_48(14773, (4670577729776842196L ^ life2_3)), __fieldRead431_49());
    __call431_58(__call431_57(__call431_52(__call431_51(life13_146, 0x0.0p0d, ((double) life10_61), 0x0.0p0d), 0x0.0p0d, ((double) (((float) life10_61) / life15_176))), __invokedynamic431_53(28727, (7219568641219476558L ^ life2_3)), __invokedynamic431_54(27653, (8104534019638272125L ^ life2_3)), __invokedynamic431_55(27653, (8104534019638272125L ^ life2_3)), __invokedynamic431_56(1187, (3719945579120609496L ^ life2_3))));
    __call431_66(__call431_65(__call431_60(__call431_59(life13_146, ((double) life9_58), ((double) life10_61), 0x0.0p0d), ((double) (((float) life9_58) / life15_176)), ((double) (((float) life10_61) / life15_176))), __invokedynamic431_61(27653, (8104534019638272125L ^ life2_3)), __invokedynamic431_62(27653, (8104534019638272125L ^ life2_3)), __invokedynamic431_63(27653, (8104534019638272125L ^ life2_3)), __invokedynamic431_64(23182, (8289155830186514173L ^ life2_3))));
    __call431_74(__call431_73(__call431_68(__call431_67(life13_146, ((double) life9_58), 0x0.0p0d, 0x0.0p0d), ((double) (((float) life9_58) / life15_176)), 0x0.0p0d), __invokedynamic431_69(27653, (8104534019638272125L ^ life2_3)), __invokedynamic431_70(27653, (8104534019638272125L ^ life2_3)), __invokedynamic431_71(27653, (8104534019638272125L ^ life2_3)), __invokedynamic431_72(23182, (8289155830186514173L ^ life2_3))));
    __call431_82(__call431_81(__call431_76(__call431_75(life13_146, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d), 0x0.0p0d, 0x0.0p0d), __invokedynamic431_77(27653, (8104534019638272125L ^ life2_3)), __invokedynamic431_78(27653, (8104534019638272125L ^ life2_3)), __invokedynamic431_79(27653, (8104534019638272125L ^ life2_3)), __invokedynamic431_80(23182, (8289155830186514173L ^ life2_3))));
    __call431_83(life12_143);
    }
    spill431_6 = p0;
    if (!((life4_5 != null))) {
        forwardValue431_659_0 = spill431_6;
        break forward_join_659;
    }
    if (!((spill431_6 >= 0))) {
        break forward_join_576;
    }
    life15_339 = __invokedynamic431_84(1093, (6875899305464219700L ^ life2_3));
    life16_341 = 2;
    life17_349 = ((life9_58 / 2) - (life15_339 / 2));
    life18_359 = ((life10_61 / 2) + __invokedynamic431_85(26052, (7922490766259726782L ^ life2_3)));
    __call431_86();
    __call431_89(life13_146, __invokedynamic431_87(737, (4298312524328193685L ^ life2_3)), __fieldRead431_88());
    __call431_96(__call431_95(__call431_90(life13_146, ((double) life17_349), ((double) life18_359), 0x0.0p0d), __invokedynamic431_91(23587, (2418959717637492800L ^ life2_3)), __invokedynamic431_92(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_93(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_94(23182, (8289155830186514173L ^ life2_3))));
    __call431_103(__call431_102(__call431_97(life13_146, ((double) life17_349), ((double) (life18_359 + life16_341)), 0x0.0p0d), __invokedynamic431_98(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_99(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_100(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_101(23182, (8289155830186514173L ^ life2_3))));
    __call431_110(__call431_109(__call431_104(life13_146, ((double) (life17_349 + life15_339)), ((double) (life18_359 + life16_341)), 0x0.0p0d), __invokedynamic431_105(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_106(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_107(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_108(23182, (8289155830186514173L ^ life2_3))));
    __call431_117(__call431_116(__call431_111(life13_146, ((double) (life17_349 + life15_339)), ((double) life18_359), 0x0.0p0d), __invokedynamic431_112(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_113(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_114(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_115(23182, (8289155830186514173L ^ life2_3))));
    __call431_124(__call431_123(__call431_118(life13_146, ((double) life17_349), ((double) life18_359), 0x0.0p0d), __invokedynamic431_119(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_120(23182, (8289155830186514173L ^ life2_3)), __invokedynamic431_121(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_122(23182, (8289155830186514173L ^ life2_3))));
    __call431_131(__call431_130(__call431_125(life13_146, ((double) life17_349), ((double) (life18_359 + life16_341)), 0x0.0p0d), __invokedynamic431_126(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_127(23182, (8289155830186514173L ^ life2_3)), __invokedynamic431_128(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_129(23182, (8289155830186514173L ^ life2_3))));
    __call431_138(__call431_137(__call431_132(life13_146, ((double) (life17_349 + p0)), ((double) (life18_359 + life16_341)), 0x0.0p0d), __invokedynamic431_133(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_134(23182, (8289155830186514173L ^ life2_3)), __invokedynamic431_135(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_136(23182, (8289155830186514173L ^ life2_3))));
    __call431_145(__call431_144(__call431_139(life13_146, ((double) (life17_349 + p0)), ((double) life18_359), 0x0.0p0d), __invokedynamic431_140(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_141(23182, (8289155830186514173L ^ life2_3)), __invokedynamic431_142(31919, (7976963051003654365L ^ life2_3)), __invokedynamic431_143(23182, (8289155830186514173L ^ life2_3))));
    __call431_146(life12_143);
    __call431_147();
    }
    __call431_148();
    __call431_151(__invokedynamic431_149(5145, (2079902003898931308L ^ life2_3)), __invokedynamic431_150(2204, (3365118872761615596L ^ life2_3)), 1, 0);
    __call431_161(__fieldRead431_153(__fieldRead431_152(receiver)), __fieldRead431_154(receiver), ((float) ((life9_58 - __call431_158(__fieldRead431_156(__fieldRead431_155(receiver)), __fieldRead431_157(receiver))) / 2)), ((float) (((life10_61 / 2) - 4) - __invokedynamic431_159(9904, (7891825375256406733L ^ life2_3)))), __invokedynamic431_160(4938, (3168523877333655357L ^ life2_3)));
    forwardValue431_659_0 = __call431_171(__fieldRead431_163(__fieldRead431_162(receiver)), __fieldRead431_164(receiver), ((float) ((life9_58 - __call431_168(__fieldRead431_166(__fieldRead431_165(receiver)), __fieldRead431_167(receiver))) / 2)), ((float) (((life10_61 / 2) - 4) + __invokedynamic431_169(3497, (4361665831262339533L ^ life2_3)))), __invokedynamic431_170(15731, (4813894336350679301L ^ life2_3)));
    }
    __discardScalar431_172(forwardValue431_659_0);
    }
    __call431_174(__fieldRead431_173(receiver));
    if (!((life4_5 != null))) {
        break forward_join_680;
    }
    forwardValue431_666_0 = __integerCategory431_176(__call431_175());
    }
    if (!((forwardValue431_666_0 != 0))) {
        break forward_join_676;
    }
    __call431_178(__fieldRead431_177(receiver), (life9_58 * life8_55), (life10_61 * life8_55));
    }
    __call431_180(__fieldRead431_179(receiver));
    __call431_181();
    }
    return;
}
public static void h431_0(java.lang.Exception p0) throws Throwable {
    throw __call2043100_0(p0);
}
public static void h431_1(java.lang.Exception p0) throws Throwable {
    throw __call2043101_0(p0);
}
public static void h431_2(java.lang.Exception p0) throws Throwable {
    throw __call2043102_0(p0);
}
public static void h431_3(java.lang.Exception p0) throws Throwable {
    throw __call2043103_0(p0);
}
public static void h431_4(java.lang.Exception p0) throws Throwable {
    throw __call2043104_0(p0);
}
public static void h431_5(java.lang.Exception p0) throws Throwable {
    throw __call2043105_0(p0);
}
public static void h431_6(java.lang.Exception p0) throws Throwable {
    throw __call2043106_0(p0);
}
public static void h431_7(java.lang.Exception p0) throws Throwable {
    throw __call2043107_0(p0);
}
public static void h431_8(java.lang.Exception p0) throws Throwable {
    throw __call2043108_0(p0);
}
public static void h431_9(java.lang.Exception p0) throws Throwable {
    throw __call2043109_0(p0);
}
public static void h431_10(java.lang.Exception p0) throws Throwable {
    throw __call2043110_0(p0);
}
public static void h431_11(java.lang.Exception p0) throws Throwable {
    throw __call2043111_0(p0);
}
public static void h431_12(java.lang.Exception p0) throws Throwable {
    throw __call2043112_0(p0);
}
public static void h431_13(java.lang.Exception p0) throws Throwable {
    throw __call2043113_0(p0);
}
public static void h431_14(java.lang.Exception p0) throws Throwable {
    throw __call2043114_0(p0);
}
public static void h431_15(java.lang.Exception p0) throws Throwable {
    throw __call2043115_0(p0);
}
public static void h431_16(java.lang.Exception p0) throws Throwable {
    throw __call2043116_0(p0);
}
public static void h431_17(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    return;
}
private static native long __fieldRead431_0() throws Throwable;
private static native int[] __call431_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead431_2(moom.fL a0) throws Throwable;
private static native boolean __fieldRead431_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory431_4(boolean value) throws Throwable;
private static native boolean __fieldRead431_5(moom.fL a0) throws Throwable;
private static native int __integerCategory431_6(boolean value) throws Throwable;
private static native long __call431_7() throws Throwable;
private static native long __fieldRead431_8(moom.fL a0) throws Throwable;
private static native long __fieldRead431_9() throws Throwable;
private static native int __numericCompare431_10(long a0, long a1) throws Throwable;
private static native void __fieldWrite431_11(moom.fL a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead431_12(moom.fL a0) throws Throwable;
private static native int __call431_13(moom.ir a0) throws Throwable;
private static native int __call431_14(moom.ir a0) throws Throwable;
private static native int __call431_15(moom.ir a0) throws Throwable;
private static native boolean __call431_16() throws Throwable;
private static native int __integerCategory431_17(boolean value) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead431_18(moom.fL a0) throws Throwable;
private static native void __call431_19(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __invokedynamic431_20(int a0, long a1) throws Throwable;
private static native void __call431_21(int a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead431_22(moom.fL a0) throws Throwable;
private static native void __call431_23(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native int __invokedynamic431_24(int a0, long a1) throws Throwable;
private static native void __call431_25(int a0) throws Throwable;
private static native void __call431_26() throws Throwable;
private static native double __call431_27(moom.ir a0) throws Throwable;
private static native double __call431_28(moom.ir a0) throws Throwable;
private static native void __call431_29(double a0, double a1, double a2, double a3, double a4, double a5) throws Throwable;
private static native int __invokedynamic431_30(int a0, long a1) throws Throwable;
private static native void __call431_31(int a0) throws Throwable;
private static native void __call431_32() throws Throwable;
private static native void __call431_33(float a0, float a1, float a2) throws Throwable;
private static native boolean __call431_34() throws Throwable;
private static native int __integerCategory431_35(boolean value) throws Throwable;
private static native int __invokedynamic431_36(int a0, long a1) throws Throwable;
private static native void __call431_37(int a0) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call431_38() throws Throwable;
private static native moom.lw __call431_39(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native moom.Jy __call431_40() throws Throwable;
private static native int __call431_41(moom.ir a0) throws Throwable;
private static native int __call431_42(moom.ir a0) throws Throwable;
private static native void __call431_43(moom.Jy a0, int a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead431_44(moom.fL a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call431_45(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead431_46() throws Throwable;
private static native void __call431_47(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic431_48(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead431_49() throws Throwable;
private static native void __call431_50(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native moom.lw __call431_51(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call431_52(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic431_53(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_54(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_55(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_56(int a0, long a1) throws Throwable;
private static native moom.lw __call431_57(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call431_58(moom.lw a0) throws Throwable;
private static native moom.lw __call431_59(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call431_60(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic431_61(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_62(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_63(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_64(int a0, long a1) throws Throwable;
private static native moom.lw __call431_65(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call431_66(moom.lw a0) throws Throwable;
private static native moom.lw __call431_67(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call431_68(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic431_69(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_70(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_71(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_72(int a0, long a1) throws Throwable;
private static native moom.lw __call431_73(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call431_74(moom.lw a0) throws Throwable;
private static native moom.lw __call431_75(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call431_76(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic431_77(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_78(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_79(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_80(int a0, long a1) throws Throwable;
private static native moom.lw __call431_81(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call431_82(moom.lw a0) throws Throwable;
private static native void __call431_83(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __invokedynamic431_84(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_85(int a0, long a1) throws Throwable;
private static native void __call431_86() throws Throwable;
private static native int __invokedynamic431_87(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead431_88() throws Throwable;
private static native void __call431_89(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native moom.lw __call431_90(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic431_91(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_92(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_93(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_94(int a0, long a1) throws Throwable;
private static native moom.lw __call431_95(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call431_96(moom.lw a0) throws Throwable;
private static native moom.lw __call431_97(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic431_98(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_99(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_100(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_101(int a0, long a1) throws Throwable;
private static native moom.lw __call431_102(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call431_103(moom.lw a0) throws Throwable;
private static native moom.lw __call431_104(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic431_105(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_106(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_107(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_108(int a0, long a1) throws Throwable;
private static native moom.lw __call431_109(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call431_110(moom.lw a0) throws Throwable;
private static native moom.lw __call431_111(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic431_112(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_113(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_114(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_115(int a0, long a1) throws Throwable;
private static native moom.lw __call431_116(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call431_117(moom.lw a0) throws Throwable;
private static native moom.lw __call431_118(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic431_119(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_120(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_121(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_122(int a0, long a1) throws Throwable;
private static native moom.lw __call431_123(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call431_124(moom.lw a0) throws Throwable;
private static native moom.lw __call431_125(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic431_126(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_127(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_128(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_129(int a0, long a1) throws Throwable;
private static native moom.lw __call431_130(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call431_131(moom.lw a0) throws Throwable;
private static native moom.lw __call431_132(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic431_133(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_134(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_135(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_136(int a0, long a1) throws Throwable;
private static native moom.lw __call431_137(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call431_138(moom.lw a0) throws Throwable;
private static native moom.lw __call431_139(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic431_140(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_141(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_142(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_143(int a0, long a1) throws Throwable;
private static native moom.lw __call431_144(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call431_145(moom.lw a0) throws Throwable;
private static native void __call431_146(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call431_147() throws Throwable;
private static native void __call431_148() throws Throwable;
private static native int __invokedynamic431_149(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_150(int a0, long a1) throws Throwable;
private static native void __call431_151(int a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead431_152(moom.fL a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead431_153(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __fieldRead431_154(moom.fL a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead431_155(moom.fL a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead431_156(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __fieldRead431_157(moom.fL a0) throws Throwable;
private static native int __call431_158(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic431_159(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_160(int a0, long a1) throws Throwable;
private static native int __call431_161(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead431_162(moom.fL a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead431_163(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __fieldRead431_164(moom.fL a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead431_165(moom.fL a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead431_166(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __fieldRead431_167(moom.fL a0) throws Throwable;
private static native int __call431_168(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic431_169(int a0, long a1) throws Throwable;
private static native int __invokedynamic431_170(int a0, long a1) throws Throwable;
private static native int __call431_171(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native void __discardScalar431_172(int a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead431_173(moom.fL a0) throws Throwable;
private static native void __call431_174(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native boolean __call431_175() throws Throwable;
private static native int __integerCategory431_176(boolean value) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead431_177(moom.fL a0) throws Throwable;
private static native void __call431_178(net.minecraft.client.shader.Framebuffer a0, int a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead431_179(moom.fL a0) throws Throwable;
private static native void __call431_180(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call431_181() throws Throwable;
private static native java.lang.Exception __call2043100_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043101_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043102_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043103_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043104_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043105_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043106_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043107_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043108_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043109_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043110_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043111_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043112_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043113_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043114_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043115_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2043116_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a93ac5bb0b7748185f77(moom.fL a0, java.lang.String a1) throws E;
private static final class __SourceHandler_a93ac5bb0b7748185f77 {

public static void f1026(moom.fL receiver, java.lang.String p0) throws Throwable {
    moom.fL forwardValue1026_29_0;
    moom.fL spill1026_0;
    long life2_3;
    int[] life4_5;
    forward_join_31: {
    forward_join_29: {
    forward_join_19: {
    life2_3 = (__fieldRead1026_0() ^ 24162766399637L);
    life4_5 = __call1026_1();
    spill1026_0 = receiver;
    if (!((life4_5 != null))) {
        forwardValue1026_29_0 = spill1026_0;
        break forward_join_29;
    }
    if (!((!__fieldRead1026_3(__fieldRead1026_2(spill1026_0))))) {
        break forward_join_19;
    }
    if (!((!__fieldRead1026_4(receiver)))) {
        break forward_join_31;
    }
    throw new net.minecraft.util.MinecraftError();
    }
    __fieldWrite1026_5(receiver, 0L);
    __fieldWrite1026_6(receiver, p0);
    __call1026_7(receiver, -1);
    forwardValue1026_29_0 = receiver;
    }
    __fieldWrite1026_8(forwardValue1026_29_0, 0L);
    }
    return;
}
public static void h1026_0(moom.Oo p0) throws Throwable {
    throw __call1102600_0(p0);
}
public static void h1026_1(moom.Oo p0) throws Throwable {
    throw __call1102601_0(p0);
}
public static void h1026_2(moom.Oo p0) throws Throwable {
    throw __call1102602_0(p0);
}
private static native long __fieldRead1026_0() throws Throwable;
private static native int[] __call1026_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1026_2(moom.fL a0) throws Throwable;
private static native boolean __fieldRead1026_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1026_4(moom.fL a0) throws Throwable;
private static native void __fieldWrite1026_5(moom.fL a0, long a1) throws Throwable;
private static native void __fieldWrite1026_6(moom.fL a0, java.lang.String a1) throws Throwable;
private static native void __call1026_7(moom.fL a0, int a1) throws Throwable;
private static native void __fieldWrite1026_8(moom.fL a0, long a1) throws Throwable;
private static native java.lang.Exception __call1102600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102602_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bb365d0fc96e1c2df0c6(moom.fL a0, java.lang.String a1) throws E;
private static final class __SourceHandler_bb365d0fc96e1c2df0c6 {

public static void f1027(moom.fL receiver, java.lang.String p0) throws Throwable {
    int forwardValue1027_36_0;
    int forwardValue1027_42_0;
    int[] spill1027_0;
    boolean spill1027_1;
    long life2_3;
    int[] life4_8;
    int life5_56;
    moom.ir life5_81;
    forward_join_88: {
    forward_join_77: {
    forward_join_62: {
    forward_join_42: {
    forward_join_36: {
    forward_join_22: {
    life2_3 = (__fieldRead1027_0() ^ 75759279984161L);
    spill1027_0 = __call1027_1();
    __fieldWrite1027_2(receiver, p0);
    life4_8 = spill1027_0;
    spill1027_1 = __fieldRead1027_4(__fieldRead1027_3(receiver));
    if (!((life4_8 != null))) {
        forwardValue1027_36_0 = __integerCategory1027_5(spill1027_1);
        break forward_join_36;
    }
    if (!((!spill1027_1))) {
        break forward_join_22;
    }
    if (!((!__fieldRead1027_6(receiver)))) {
        break forward_join_88;
    }
    throw new net.minecraft.util.MinecraftError();
    }
    __call1027_8(__invokedynamic1027_7(26341, (4335315518073030587L ^ life2_3)));
    __call1027_10(__invokedynamic1027_9(19991, (3884803340490731345L ^ life2_3)));
    __call1027_11();
    forwardValue1027_36_0 = __integerCategory1027_13(__call1027_12());
    }
    if (!((life4_8 != null))) {
        forwardValue1027_42_0 = forwardValue1027_36_0;
        break forward_join_42;
    }
    if (!((forwardValue1027_36_0 != 0))) {
        break forward_join_62;
    }
    forwardValue1027_42_0 = __call1027_15(__fieldRead1027_14(receiver));
    }
    life5_56 = forwardValue1027_42_0;
    __call1027_20(0x0.0p0d, ((double) (__call1027_17(__fieldRead1027_16(receiver)) * life5_56)), ((double) (__call1027_19(__fieldRead1027_18(receiver)) * life5_56)), 0x0.0p0d, 0x1.9p6d, 0x1.2cp8d);
    if (!((life4_8 == null))) {
        break forward_join_77;
    }
    }
    life5_81 = new moom.ir(__fieldRead1027_21(receiver));
    __call1027_24(0x0.0p0d, __call1027_22(life5_81), __call1027_23(life5_81), 0x0.0p0d, 0x1.9p6d, 0x1.2cp8d);
    }
    __call1027_26(__invokedynamic1027_25(7788, (462397261560626995L ^ life2_3)));
    __call1027_27();
    __call1027_28(0x0.0p0f, 0x0.0p0f, -0x1.9p7f);
    }
    return;
}
public static void h1027_0(moom.Oo p0) throws Throwable {
    throw __call1102700_0(p0);
}
public static void h1027_1(moom.Oo p0) throws Throwable {
    throw __call1102701_0(p0);
}
public static void h1027_2(moom.Oo p0) throws Throwable {
    throw __call1102702_0(p0);
}
public static void h1027_3(moom.Oo p0) throws Throwable {
    throw __call1102703_0(p0);
}
public static void h1027_4(moom.Oo p0) throws Throwable {
    throw __call1102704_0(p0);
}
private static native long __fieldRead1027_0() throws Throwable;
private static native int[] __call1027_1() throws Throwable;
private static native void __fieldWrite1027_2(moom.fL a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1027_3(moom.fL a0) throws Throwable;
private static native boolean __fieldRead1027_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory1027_5(boolean value) throws Throwable;
private static native boolean __fieldRead1027_6(moom.fL a0) throws Throwable;
private static native int __invokedynamic1027_7(int a0, long a1) throws Throwable;
private static native void __call1027_8(int a0) throws Throwable;
private static native int __invokedynamic1027_9(int a0, long a1) throws Throwable;
private static native void __call1027_10(int a0) throws Throwable;
private static native void __call1027_11() throws Throwable;
private static native boolean __call1027_12() throws Throwable;
private static native int __integerCategory1027_13(boolean value) throws Throwable;
private static native moom.ir __fieldRead1027_14(moom.fL a0) throws Throwable;
private static native int __call1027_15(moom.ir a0) throws Throwable;
private static native moom.ir __fieldRead1027_16(moom.fL a0) throws Throwable;
private static native int __call1027_17(moom.ir a0) throws Throwable;
private static native moom.ir __fieldRead1027_18(moom.fL a0) throws Throwable;
private static native int __call1027_19(moom.ir a0) throws Throwable;
private static native void __call1027_20(double a0, double a1, double a2, double a3, double a4, double a5) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1027_21(moom.fL a0) throws Throwable;
private static native double __call1027_22(moom.ir a0) throws Throwable;
private static native double __call1027_23(moom.ir a0) throws Throwable;
private static native void __call1027_24(double a0, double a1, double a2, double a3, double a4, double a5) throws Throwable;
private static native int __invokedynamic1027_25(int a0, long a1) throws Throwable;
private static native void __call1027_26(int a0) throws Throwable;
private static native void __call1027_27() throws Throwable;
private static native void __call1027_28(float a0, float a1, float a2) throws Throwable;
private static native java.lang.Exception __call1102700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102704_0(moom.Oo a0) throws Throwable;

}


public void b() {
return;
}


public void b(java.lang.String p0) {
this.e = ((boolean)(false));
    ((moom.fL)(this)).d(((java.lang.String)(p0)));
    return;
}


public void c(java.lang.String p0) { __sourceHandlerCall_a93ac5bb0b7748185f77(this, p0); }


private void d(java.lang.String p0) { __sourceHandlerCall_bb365d0fc96e1c2df0c6(this, p0); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7634_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/fL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.fL.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11768;
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
            throw new RuntimeException("moom/fL", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a__sourceReturn_d00df7729d(int p0) { __sourceHandlerCall_3e09957a810183ccf952(this, p0); }


public void a(java.lang.String p0) {
this.e = ((boolean)(true));
    ((moom.fL)(this)).d(((java.lang.String)(p0)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_7ee3c1658af3d484_originalDynamicSite2715_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7634_0() throws E;
}
