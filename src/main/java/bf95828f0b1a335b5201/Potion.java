package net.minecraft.potion;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Potion {

public static net.minecraft.potion.Potion[] a;

private static java.util.Map<moom.DD, net.minecraft.potion.Potion> b;

public static net.minecraft.potion.Potion c;

public static net.minecraft.potion.Potion d;

public static net.minecraft.potion.Potion e;

public static net.minecraft.potion.Potion f;

public static net.minecraft.potion.Potion g;

public static net.minecraft.potion.Potion h;

public static net.minecraft.potion.Potion i;

public static net.minecraft.potion.Potion j;

public static net.minecraft.potion.Potion k;

public static net.minecraft.potion.Potion l;

public static net.minecraft.potion.Potion m;

public static net.minecraft.potion.Potion n;

public static net.minecraft.potion.Potion o;

public static net.minecraft.potion.Potion p;

public static net.minecraft.potion.Potion q;

public static net.minecraft.potion.Potion r;

public static net.minecraft.potion.Potion s;

public static net.minecraft.potion.Potion t;

public static net.minecraft.potion.Potion u;

public static net.minecraft.potion.Potion v;

public static net.minecraft.potion.Potion w;

public static net.minecraft.potion.Potion x;

public static net.minecraft.potion.Potion y;

public static net.minecraft.potion.Potion z;

public static net.minecraft.potion.Potion A;

public static net.minecraft.potion.Potion B;

public static net.minecraft.potion.Potion C;

public static net.minecraft.potion.Potion D;

public static net.minecraft.potion.Potion E;

public static net.minecraft.potion.Potion F;

public static net.minecraft.potion.Potion G;

public static net.minecraft.potion.Potion H;

public int I;

private java.util.Map<net.minecraft.entity.ai.attributes.IAttribute, moom.vB> J;

private boolean K;

private int L;

private java.lang.String M;

private int N;

private double O;

private boolean P;

private static net.minecraft.entity.Entity[] Q;

private static long R;

private static long[] T;

private static java.lang.Integer[] U;

private static java.util.Map V;

protected Potion(int p0, moom.DD p1, boolean p2, int p3) { super(); }


private static void __sourceConstructorBody_b57527938321eb56(net.minecraft.potion.Potion receiver, int p0, moom.DD p1, boolean p2, int p3) throws Throwable {

long local5 = (net.minecraft.potion.Potion.R ^ 105794574558105L);

    net.minecraft.potion.Potion.__sourceConstructorInit_b57527938321eb56_0(((net.minecraft.potion.Potion)(receiver)));

    ((net.minecraft.potion.Potion)(receiver)).J = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    ((net.minecraft.potion.Potion)(receiver)).M = ((java.lang.String)(""));

    ((net.minecraft.potion.Potion)(receiver)).N = ((int)(-1));

    ((net.minecraft.potion.Potion)(receiver)).I = ((int)(p0));

    (net.minecraft.potion.Potion.a)[p0] = receiver;

    ((java.util.Map)(net.minecraft.potion.Potion.b)).put(((java.lang.Object)(p1)), ((java.lang.Object)(receiver)));

    ((net.minecraft.potion.Potion)(receiver)).K = ((boolean)(p2));

    if (p2) {

        ((net.minecraft.potion.Potion)(receiver)).O = ((double)(0x1.0p-1d));

    } else {

        ((net.minecraft.potion.Potion)(receiver)).O = ((double)(0x1.0p0d));

    }

    ((net.minecraft.potion.Potion)(receiver)).L = ((int)(p3));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_b57527938321eb56_0(net.minecraft.potion.Potion a0) throws E;

static {
R = ((long)(((moom._a)(moom._c.a(((long)(2443955513141636396L)), ((long)(-1831772666214345624L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(81682133712540L)))));
    long local11_life6 = (net.minecraft.potion.Potion.R ^ 44335658858390L);
    java.lang.Object __sourceSpill1913_8 = null;
    V = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.potion.Potion.b(((net.minecraft.entity.Entity[])(__sourceSpill1913_8)));
    javax.crypto.Cipher local0_life11;
    javax.crypto.Cipher __sourceSpill1913_13 = (local0_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1913_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1913_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1913_16 = new byte[8];
    (__sourceSpill1913_16)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life17 = 1;
    while ((local1_life17 < 8)) {
        (__sourceSpill1913_16)[local1_life17] = ((byte) ((int) ((local11_life6 << (local1_life17 * 8)) >>> 56)));
        local1_life17 += 1;
    }
    byte[] __sourcePreallocation1913_18 = __sourceSpill1913_16;
    ((javax.crypto.Cipher)(__sourceSpill1913_13)).init(((int)(__sourceSpill1913_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1913_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1913_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life21 = new long[48];
    int local3_life22 = 0;
    java.lang.String local4_life23;
    int local5_life25 = ((java.lang.String)((local4_life23 = "v\025uzuÐ_\013ÊÌu9\004oªä³Ìµ£#gpÌçI\035ÒÂ~úA¼æh£`ò\027E_tß]\rf;76\035oÀî§vügÔgßi^µ¹NóW áP\016Kf}\002Üfß¥\013Ái<>ß¶\023\000-úpaÃ\022¦\035\007RddüëBüÆd\016ü±?´]+ø¢ËÝnæGK©\032\177¦F½ÛÀr\006ûö#yº²%\"SàÔ4ÀL\033ss8ïÉ\020ÔG\027RJ¯\t´@Ãz¤p\nTÁØpòË»Ø@xû2iö\\#ªûÆÜÅîR­×õ<²1ó\023Î(òã[BÜÆÙPÔ`µ±Ølí\023(X>TC±?ù[´GsúO¡¾Ù>\020<èÝÉÜ¶¡á¥\0276\022Ý2±äb\007\027s¼$k'\034\004È\004\003L¨Ô\002 Ç¸#2¿Ø\033©d*d\003\032þ¾¬D9p½\t\001¥ÙcU;F\tÃ=)\003Úawé_wQ/_ÖÊHÿí\034"))).length();
    int local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1913_27 = local4_life23;
        int __sourceSpill1913_28 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1913_27)).substring(((int)(__sourceSpill1913_28)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1913_32 = local6_life21;
        int __sourceSpill1913_33 = local3_life22;
        local3_life22 += 1;
        long local8_life34 = (((((((((((long) (local7_life31)[0]) & 255L) << 56) | ((((long) (local7_life31)[1]) & 255L) << 48)) | ((((long) (local7_life31)[2]) & 255L) << 40)) | ((((long) (local7_life31)[3]) & 255L) << 32)) | ((((long) (local7_life31)[4]) & 255L) << 24)) | ((((long) (local7_life31)[5]) & 255L) << 16)) | ((((long) (local7_life31)[6]) & 255L) << 8)) | (((long) (local7_life31)[7]) & 255L));
        byte[] __sourceSpill1913_35 = new byte[8];
        (__sourceSpill1913_35)[0] = ((byte) ((int) (local8_life34 >>> 56)));
        (__sourceSpill1913_35)[1] = ((byte) ((int) (local8_life34 >>> 48)));
        (__sourceSpill1913_35)[2] = ((byte) ((int) (local8_life34 >>> 40)));
        (__sourceSpill1913_35)[3] = ((byte) ((int) (local8_life34 >>> 32)));
        (__sourceSpill1913_35)[4] = ((byte) ((int) (local8_life34 >>> 24)));
        (__sourceSpill1913_35)[5] = ((byte) ((int) (local8_life34 >>> 16)));
        (__sourceSpill1913_35)[6] = ((byte) ((int) (local8_life34 >>> 8)));
        (__sourceSpill1913_35)[7] = ((byte) ((int) local8_life34));
        javax.crypto.Cipher __sourceSpill1913_36 = local0_life11;
        byte[] local10_life38 = ((javax.crypto.Cipher)(__sourceSpill1913_36)).doFinal(((byte[])(__sourceSpill1913_35)));
        (__sourceSpill1913_32)[__sourceSpill1913_33] = (((((((((((long) (local10_life38)[0]) & 255L) << 56) | ((((long) (local10_life38)[1]) & 255L) << 48)) | ((((long) (local10_life38)[2]) & 255L) << 40)) | ((((long) (local10_life38)[3]) & 255L) << 32)) | ((((long) (local10_life38)[4]) & 255L) << 24)) | ((((long) (local10_life38)[5]) & 255L) << 16)) | ((((long) (local10_life38)[6]) & 255L) << 8)) | (((long) (local10_life38)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    local5_life25 = ((java.lang.String)((local4_life23 = "å\0034¬é¹]\004\003YËÖ"))).length();
    local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1913_40 = local4_life23;
        int __sourceSpill1913_41 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1913_40)).substring(((int)(__sourceSpill1913_41)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1913_45 = local6_life21;
        int __sourceSpill1913_46 = local3_life22;
        local3_life22 += 1;
        long local8_life47 = (((((((((((long) (local7_life44)[0]) & 255L) << 56) | ((((long) (local7_life44)[1]) & 255L) << 48)) | ((((long) (local7_life44)[2]) & 255L) << 40)) | ((((long) (local7_life44)[3]) & 255L) << 32)) | ((((long) (local7_life44)[4]) & 255L) << 24)) | ((((long) (local7_life44)[5]) & 255L) << 16)) | ((((long) (local7_life44)[6]) & 255L) << 8)) | (((long) (local7_life44)[7]) & 255L));
        byte[] __sourceSpill1913_48 = new byte[8];
        (__sourceSpill1913_48)[0] = ((byte) ((int) (local8_life47 >>> 56)));
        (__sourceSpill1913_48)[1] = ((byte) ((int) (local8_life47 >>> 48)));
        (__sourceSpill1913_48)[2] = ((byte) ((int) (local8_life47 >>> 40)));
        (__sourceSpill1913_48)[3] = ((byte) ((int) (local8_life47 >>> 32)));
        (__sourceSpill1913_48)[4] = ((byte) ((int) (local8_life47 >>> 24)));
        (__sourceSpill1913_48)[5] = ((byte) ((int) (local8_life47 >>> 16)));
        (__sourceSpill1913_48)[6] = ((byte) ((int) (local8_life47 >>> 8)));
        (__sourceSpill1913_48)[7] = ((byte) ((int) local8_life47));
        javax.crypto.Cipher __sourceSpill1913_49 = local0_life11;
        byte[] local10_life51 = ((javax.crypto.Cipher)(__sourceSpill1913_49)).doFinal(((byte[])(__sourceSpill1913_48)));
        (__sourceSpill1913_45)[__sourceSpill1913_46] = (((((((((((long) (local10_life51)[0]) & 255L) << 56) | ((((long) (local10_life51)[1]) & 255L) << 48)) | ((((long) (local10_life51)[2]) & 255L) << 40)) | ((((long) (local10_life51)[3]) & 255L) << 32)) | ((((long) (local10_life51)[4]) & 255L) << 24)) | ((((long) (local10_life51)[5]) & 255L) << 16)) | ((((long) (local10_life51)[6]) & 255L) << 8)) | (((long) (local10_life51)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    T = ((long[])(local6_life21));
    U = ((java.lang.Integer[])(new java.lang.Integer[48]));
    a = ((net.minecraft.potion.Potion[])(new net.minecraft.potion.Potion[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_54(21690, (1448634306621096068L ^ local11_life6))]));
    b = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    c = ((net.minecraft.potion.Potion)(null));
    d = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(1, new moom.DD("speed"), false, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_59(25818, (1068144132563529953L ^ local11_life6))))).b(((java.lang.String)("potion.moveSpeed"))))).a(((int)(0)), ((int)(0))))).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e)), ((java.lang.String)("91AEAA56-376B-4498-935B-2F7F68070635")), ((double)(0x1.99999ap-3d)), ((int)(2)))));
    e = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(2, new moom.DD("slowness"), true, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_65(11793, (3984235227814607392L ^ local11_life6))))).b(((java.lang.String)("potion.moveSlowdown"))))).a(((int)(1)), ((int)(0))))).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e)), ((java.lang.String)("7107DE5E-7CE8-4030-940E-514C1F160890")), ((double)(-0x1.333334p-3d)), ((int)(2)))));
    f = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(3, new moom.DD("haste"), false, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_71(5345, (3861789321543876808L ^ local11_life6))))).b(((java.lang.String)("potion.digSpeed"))))).a(((int)(2)), ((int)(0))))).a(((double)(0x1.8p0d)))));
    g = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(4, new moom.DD("mining_fatigue"), true, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_76(31216, (3070957034457656776L ^ local11_life6))))).b(((java.lang.String)("potion.digSlowDown"))))).a(((int)(3)), ((int)(0)))));
    h = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((moom.A2)(new moom.A2(5, new moom.DD("strength"), false, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_80(24832, (5606827579605382427L ^ local11_life6))))).b(((java.lang.String)("potion.damageBoost"))))).a(((int)(4)), ((int)(0))))).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f)), ((java.lang.String)("648D7064-6A60-4F59-8ABE-C2C23A6DD7A9")), ((double)(0x1.4p1d)), ((int)(2)))));
    i = ((net.minecraft.potion.Potion)(((moom.A3)(new moom.A3(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_86(1233, (3438437666072203460L ^ local11_life6)), new moom.DD("instant_health"), false, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_87(2197, (2237120997593685125L ^ local11_life6))))).b(((java.lang.String)("potion.heal")))));
    j = ((net.minecraft.potion.Potion)(((moom.A3)(new moom.A3(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_90(9067, (7998281560369313624L ^ local11_life6)), new moom.DD("instant_damage"), true, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_91(14257, (6566739222156845958L ^ local11_life6))))).b(((java.lang.String)("potion.harm")))));
    k = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_94(7388, (3781764808846084337L ^ local11_life6)), new moom.DD("jump_boost"), false, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_95(29534, (4576098620753667961L ^ local11_life6))))).b(((java.lang.String)("potion.jump"))))).a(((int)(2)), ((int)(1)))));
    l = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_99(27718, (1668686734358640727L ^ local11_life6)), new moom.DD("nausea"), true, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_100(4970, (6016394705559750475L ^ local11_life6))))).b(((java.lang.String)("potion.confusion"))))).a(((int)(3)), ((int)(1))))).a(((double)(0x1.0p-2d)))));
    m = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_105(27269, (1911814488354520767L ^ local11_life6)), new moom.DD("regeneration"), false, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_106(28367, (7365555005438261973L ^ local11_life6))))).b(((java.lang.String)("potion.regeneration"))))).a(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_108(843, (8151532008559023957L ^ local11_life6)))), ((int)(0))))).a(((double)(0x1.0p-2d)))));
    n = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_112(2145, (9200665467838798916L ^ local11_life6)), new moom.DD("resistance"), false, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_113(19510, (987299902798780463L ^ local11_life6))))).b(((java.lang.String)("potion.resistance"))))).a(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_115(18503, (6193275451123915893L ^ local11_life6)))), ((int)(1)))));
    o = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_118(26948, (5854664111525002600L ^ local11_life6)), new moom.DD("fire_resistance"), false, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_119(23618, (8578775119590279258L ^ local11_life6))))).b(((java.lang.String)("potion.fireResistance"))))).a(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_121(843, (8151532008559023957L ^ local11_life6)))), ((int)(1)))));
    p = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_124(11629, (2643855533073185115L ^ local11_life6)), new moom.DD("water_breathing"), false, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_125(7494, (5715022153303820628L ^ local11_life6))))).b(((java.lang.String)("potion.waterBreathing"))))).a(((int)(0)), ((int)(2)))));
    q = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_129(21879, (6699467545355829597L ^ local11_life6)), new moom.DD("invisibility"), false, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_130(24348, (6382453243753614124L ^ local11_life6))))).b(((java.lang.String)("potion.invisibility"))))).a(((int)(0)), ((int)(1)))));
    r = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_134(27430, (6325039849314287387L ^ local11_life6)), new moom.DD("blindness"), true, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_135(22352, (2532791728390980475L ^ local11_life6))))).b(((java.lang.String)("potion.blindness"))))).a(((int)(5)), ((int)(1))))).a(((double)(0x1.0p-2d)))));
    s = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_140(11271, (6747522016418314287L ^ local11_life6)), new moom.DD("night_vision"), false, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_141(14039, (7319091428943504064L ^ local11_life6))))).b(((java.lang.String)("potion.nightVision"))))).a(((int)(4)), ((int)(1)))));
    t = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_145(7045, (6697040942494191514L ^ local11_life6)), new moom.DD("hunger"), true, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_146(1418, (7116956475412746677L ^ local11_life6))))).b(((java.lang.String)("potion.hunger"))))).a(((int)(1)), ((int)(1)))));
    u = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((moom.A2)(new moom.A2(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_150(28326, (1793514665491298963L ^ local11_life6)), new moom.DD("weakness"), true, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_151(28084, (1620911642600438183L ^ local11_life6))))).b(((java.lang.String)("potion.weakness"))))).a(((int)(5)), ((int)(0))))).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f)), ((java.lang.String)("22653B89-116E-49DC-9B6B-9971489B5BE5")), ((double)(0x1.0p1d)), ((int)(0)))));
    v = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_157(19952, (3656107076825012681L ^ local11_life6)), new moom.DD("poison"), true, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_158(5118, (2111742777280923613L ^ local11_life6))))).b(((java.lang.String)("potion.poison"))))).a(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_160(18503, (6193275451123915893L ^ local11_life6)))), ((int)(0))))).a(((double)(0x1.0p-2d)))));
    w = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(new net.minecraft.potion.Potion(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_164(16228, (4829919300947061568L ^ local11_life6)), new moom.DD("wither"), true, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_165(24228, (4269410768119122570L ^ local11_life6))))).b(((java.lang.String)("potion.wither"))))).a(((int)(1)), ((int)(2))))).a(((double)(0x1.0p-2d)))));
    x = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((moom.A4)(new moom.A4(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_170(18579, (6044776713421970613L ^ local11_life6)), new moom.DD("health_boost"), false, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_171(28347, (5754535949098580633L ^ local11_life6))))).b(((java.lang.String)("potion.healthBoost"))))).a(((int)(2)), ((int)(2))))).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b)), ((java.lang.String)("5D6F0BA2-1186-46AC-B896-C61C5CEE99CC")), ((double)(0x1.0p2d)), ((int)(0)))));
    y = ((net.minecraft.potion.Potion)(((net.minecraft.potion.Potion)(((net.minecraft.potion.PotionAbsorption)(new net.minecraft.potion.PotionAbsorption(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_177(22709, (7377717860709780649L ^ local11_life6)), new moom.DD("absorption"), false, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_178(28849, (6454156532414735527L ^ local11_life6))))).b(((java.lang.String)("potion.absorption"))))).a(((int)(2)), ((int)(2)))));
    z = ((net.minecraft.potion.Potion)(((moom.A3)(new moom.A3(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_182(26912, (3469763636938833180L ^ local11_life6)), new moom.DD("saturation"), false, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_183(25703, (2367976856989429882L ^ local11_life6))))).b(((java.lang.String)("potion.saturation")))));
    A = ((net.minecraft.potion.Potion)(null));
    B = ((net.minecraft.potion.Potion)(null));
    C = ((net.minecraft.potion.Potion)(null));
    D = ((net.minecraft.potion.Potion)(null));
    E = ((net.minecraft.potion.Potion)(null));
    F = ((net.minecraft.potion.Potion)(null));
    G = ((net.minecraft.potion.Potion)(null));
    H = ((net.minecraft.potion.Potion)(null));
}


public static void b(net.minecraft.entity.Entity[] p0) {
Q = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public net.minecraft.potion.Potion b(java.lang.String p0) {
this.M = ((java.lang.String)(p0));
    return this;
}


public void b(net.minecraft.entity.EntityLivingBase p0, net.minecraft.entity.ai.attributes.BaseAttributeMap p1, int p2) {
java.lang.Object lexicalValue1644_30_0;
    java.lang.String[] spill1644_0;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill1644_1;
    long life4_3;
    java.util.Iterator life7_9;
    java.lang.String[] life6_10;
    java.util.Map.Entry life8_17;
    net.minecraft.entity.ai.attributes.IAttributeInstance life9_23;
    moom.vB life10_37;
    lexical_join_54: {
    life4_3 = (net.minecraft.potion.Potion.R ^ 27859043009044L);
    spill1644_0 = net.minecraft.potion.PotionEffect.b__ArrayString();
    life7_9 = ((java.util.Set)(((java.util.Map)(this.J)).entrySet())).iterator();
    life6_10 = spill1644_0;
    lexical_cycle_11: while (true) {
    lexical_join_52: {
    lexical_join_30: {
    if (!(((java.util.Iterator)(life7_9)).hasNext())) {
        break lexical_join_54;
    }
    life8_17 = ((java.util.Map.Entry)(((java.util.Iterator)(life7_9)).next()));
    life9_23 = ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(p1)).a(((net.minecraft.entity.ai.attributes.IAttribute)(((net.minecraft.entity.ai.attributes.IAttribute)(((java.util.Map.Entry)(life8_17)).getKey())))));
    spill1644_1 = life9_23;
    if (!((life6_10 != null))) {
        lexicalValue1644_30_0 = spill1644_1;
        break lexical_join_30;
    }
    if (!((spill1644_1 != null))) {
        break lexical_join_52;
    }
    lexicalValue1644_30_0 = ((java.util.Map.Entry)(life8_17)).getValue();
    }
    life10_37 = ((moom.vB)(lexicalValue1644_30_0));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(life9_23)).b(((moom.vB)(life10_37)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(life9_23)).a(((moom.vB)(new moom.vB(((moom.vB)(life10_37)).a__UUID(), __sourceIntrinsic_f3836ee8cea2_invokedynamic1644_16(((net.minecraft.potion.Potion)(this)).a__String(), p2), ((net.minecraft.potion.Potion)(this)).a(((int)(p2)), ((moom.vB)(life10_37))), ((moom.vB)(life10_37)).a__Int()))));
    }
    if (!((life6_10 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


public boolean b__Boolean() {
int forwardValue5547_12_0;
    int forwardValue5547_14_0;
    int spill5547_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.potion.Potion.R ^ 82893034417476L);
    life3_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill5547_0 = this.N;
    if (!((life3_5 != null))) {
        forwardValue5547_12_0 = spill5547_0;
        break forward_join_12;
    }
    if (!((spill5547_0 >= 0))) {
        break forward_join_13;
    }
    forwardValue5547_12_0 = 1;
    }
    forwardValue5547_14_0 = forwardValue5547_12_0;
    break forward_join_14;
    }
    forwardValue5547_14_0 = 0;
    }
    return ((forwardValue5547_14_0) != 0);
}


public int b() {
return this.N;
}


public static net.minecraft.entity.Entity[] b__Arrayr3() {
return net.minecraft.potion.Potion.Q;
}


public int c() {
return this.L;
}


public boolean c__Boolean() {
return ((((this.K) ? 1 : 0)) != 0);
}


public boolean d() {
return ((((this.P) ? 1 : 0)) != 0);
}


public void a(net.minecraft.entity.EntityLivingBase p0, net.minecraft.entity.ai.attributes.BaseAttributeMap p1, int p2) {
net.minecraft.entity.ai.attributes.IAttributeInstance lexicalValue1643_29_0;
    java.lang.String[] spill1643_0;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill1643_1;
    long life4_3;
    java.util.Iterator life7_9;
    java.lang.String[] life6_10;
    java.util.Map.Entry life8_17;
    net.minecraft.entity.ai.attributes.IAttributeInstance life9_23;
    lexical_join_35: {
    life4_3 = (net.minecraft.potion.Potion.R ^ 42108980402406L);
    spill1643_0 = net.minecraft.potion.PotionEffect.b__ArrayString();
    life7_9 = ((java.util.Set)(((java.util.Map)(this.J)).entrySet())).iterator();
    life6_10 = spill1643_0;
    lexical_cycle_11: while (true) {
    lexical_join_33: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life7_9)).hasNext())) {
        break lexical_join_35;
    }
    life8_17 = ((java.util.Map.Entry)(((java.util.Iterator)(life7_9)).next()));
    life9_23 = ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(p1)).a(((net.minecraft.entity.ai.attributes.IAttribute)(((net.minecraft.entity.ai.attributes.IAttribute)(((java.util.Map.Entry)(life8_17)).getKey())))));
    spill1643_1 = life9_23;
    if (!((life6_10 != null))) {
        lexicalValue1643_29_0 = spill1643_1;
        break lexical_join_29;
    }
    if (!((spill1643_1 != null))) {
        break lexical_join_33;
    }
    lexicalValue1643_29_0 = life9_23;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(lexicalValue1643_29_0)).b(((moom.vB)(((moom.vB)(((java.util.Map.Entry)(life8_17)).getValue())))));
    }
    if (!((life6_10 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


public java.util.Map<net.minecraft.entity.ai.attributes.IAttribute, moom.vB> a__Map() {
return this.J;
}


public net.minecraft.potion.Potion a(net.minecraft.entity.ai.attributes.IAttribute p0, java.lang.String p1, double p2, int p3) {
moom.vB local6 = new moom.vB(java.util.UUID.fromString(((java.lang.String)(p1))), ((net.minecraft.potion.Potion)(this)).a__String(), p2, p3);
    ((java.util.Map)(this.J)).put(((java.lang.Object)(p0)), ((java.lang.Object)(local6)));
    return this;
}


public double a(int p0, moom.vB p1) {
return (((moom.vB)(p1)).a() * ((double) (p0 + 1)));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16895;
      if (U[var3] == null) {
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
         long var5 = T[var3];
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
         Object[] var9 = (Object[])V.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               V.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/A0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         U[var3] = var15;
      }

      return U[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.potion.Potion.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12100_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/A0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.entity.Entity p0, net.minecraft.entity.Entity p1, net.minecraft.entity.EntityLivingBase p2, int p3, double p4) {
int forwardValue5541_22_0;
    int forwardValue5541_22_1;
    int forwardValue5541_34_0;
    int forwardValue5541_34_1;
    int forwardValue5541_48_0;
    int forwardValue5541_48_1;
    int forwardValue5541_51_0;
    int forwardValue5541_67_0;
    int forwardValue5541_99_0;
    int spill5541_0;
    int spill5541_1;
    boolean spill5541_2;
    boolean spill5541_3;
    boolean spill5541_4;
    int spill5541_5;
    long life7_3;
    java.lang.String[] life9_5;
    int life10_115;
    int life10_159;
    forward_join_104: {
    forward_join_99: {
    forward_join_90: {
    forward_join_88: {
    forward_join_80: {
    forward_join_78: {
    forward_join_67: {
    forward_join_54: {
    forward_join_51: {
    forward_join_48: {
    forward_join_42: {
    forward_join_34: {
    forward_join_30: {
    forward_join_22: {
    forward_join_18: {
    life7_3 = (net.minecraft.potion.Potion.R ^ 17484930400092L);
    life9_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill5541_0 = this.I;
    spill5541_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.i)).I;
    if (!((life9_5 != null))) {
        forwardValue5541_22_0 = spill5541_0;
        forwardValue5541_22_1 = spill5541_1;
        break forward_join_22;
    }
    if (!((spill5541_0 == spill5541_1))) {
        break forward_join_18;
    }
    spill5541_2 = ((net.minecraft.entity.EntityLivingBase)(p2)).H__Boolean();
    if (!((life9_5 != null))) {
        forwardValue5541_99_0 = ((spill5541_2) ? 1 : 0);
        break forward_join_99;
    }
    if (!(spill5541_2)) {
        break forward_join_90;
    }
    }
    forwardValue5541_22_0 = this.I;
    forwardValue5541_22_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.j)).I;
    }
    if (!((life9_5 != null))) {
        forwardValue5541_34_0 = forwardValue5541_22_0;
        forwardValue5541_34_1 = forwardValue5541_22_1;
        break forward_join_34;
    }
    if (!((forwardValue5541_22_0 == forwardValue5541_22_1))) {
        break forward_join_30;
    }
    spill5541_3 = ((net.minecraft.entity.EntityLivingBase)(p2)).H__Boolean();
    if (!((life9_5 != null))) {
        forwardValue5541_99_0 = ((spill5541_3) ? 1 : 0);
        break forward_join_99;
    }
    if (!((!spill5541_3))) {
        break forward_join_90;
    }
    }
    forwardValue5541_34_0 = this.I;
    forwardValue5541_34_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.j)).I;
    }
    if (!((life9_5 != null))) {
        forwardValue5541_48_0 = forwardValue5541_34_0;
        forwardValue5541_48_1 = forwardValue5541_34_1;
        break forward_join_48;
    }
    if (!((forwardValue5541_34_0 == forwardValue5541_34_1))) {
        break forward_join_42;
    }
    spill5541_4 = ((net.minecraft.entity.EntityLivingBase)(p2)).H__Boolean();
    if (!((life9_5 != null))) {
        forwardValue5541_67_0 = ((spill5541_4) ? 1 : 0);
        break forward_join_67;
    }
    if (!(spill5541_4)) {
        break forward_join_54;
    }
    }
    spill5541_5 = this.I;
    if (!((life9_5 != null))) {
        forwardValue5541_51_0 = spill5541_5;
        break forward_join_51;
    }
    forwardValue5541_48_0 = spill5541_5;
    forwardValue5541_48_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.i)).I;
    }
    if (!((forwardValue5541_48_0 == forwardValue5541_48_1))) {
        break forward_join_104;
    }
    forwardValue5541_51_0 = ((((net.minecraft.entity.EntityLivingBase)(p2)).H__Boolean()) ? 1 : 0);
    }
    if (!((life9_5 != null))) {
        forwardValue5541_67_0 = forwardValue5541_51_0;
        break forward_join_67;
    }
    if (!((forwardValue5541_51_0 != 0))) {
        break forward_join_104;
    }
    }
    forwardValue5541_67_0 = ((int) ((p4 * ((double) (__sourceIntrinsic_0a61cde73b89_invokedynamic5541_22(18503, (6193232890344608959L ^ life7_3)) << p3))) + 0x1.0p-1d));
    }
    life10_115 = forwardValue5541_67_0;
    if (!((life9_5 != null))) {
        break forward_join_78;
    }
    if (!((p0 == null))) {
        break forward_join_80;
    }
    ((net.minecraft.entity.EntityLivingBase)(p2)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.l)), ((float)(((float) life10_115))));
    }
    if (!((life9_5 == null))) {
        break forward_join_88;
    }
    }
    ((net.minecraft.entity.EntityLivingBase)(p2)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.b(((net.minecraft.entity.Entity)(p0)), ((net.minecraft.entity.Entity)(p1))))), ((float)(((float) life10_115))));
    }
    if (!((life9_5 == null))) {
        break forward_join_104;
    }
    }
    forwardValue5541_99_0 = ((int) ((p4 * ((double) (4 << p3))) + 0x1.0p-1d));
    }
    life10_159 = forwardValue5541_99_0;
    ((net.minecraft.entity.EntityLivingBase)(p2)).c(((float)(((float) life10_159))));
    }
    return;
}


public void a(net.minecraft.entity.EntityLivingBase p0, int p1) {
net.minecraft.entity.EntityLivingBase forwardValue5542_22_0;
    int forwardValue5542_30_0;
    int forwardValue5542_30_1;
    int forwardValue5542_44_0;
    int forwardValue5542_51_0;
    int forwardValue5542_51_1;
    int forwardValue5542_65_0;
    int forwardValue5542_65_1;
    int forwardValue5542_86_0;
    int forwardValue5542_88_0;
    int forwardValue5542_88_1;
    net.minecraft.entity.EntityLivingBase forwardValue5542_103_0;
    int forwardValue5542_114_0;
    int forwardValue5542_116_0;
    int forwardValue5542_116_1;
    int forwardValue5542_128_0;
    int forwardValue5542_128_1;
    int forwardValue5542_140_0;
    int forwardValue5542_140_1;
    int forwardValue5542_154_0;
    int forwardValue5542_154_1;
    int forwardValue5542_157_0;
    int forwardValue5542_171_0;
    net.minecraft.entity.EntityLivingBase forwardValue5542_175_0;
    int spill5542_0;
    int spill5542_1;
    net.minecraft.entity.EntityLivingBase spill5542_2;
    int spill5542_3;
    int spill5542_4;
    int spill5542_5;
    net.minecraft.entity.EntityLivingBase spill5542_6;
    net.minecraft.entity.EntityLivingBase spill5542_7;
    net.minecraft.entity.EntityLivingBase spill5542_8;
    boolean spill5542_9;
    int spill5542_10;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_182: {
    forward_join_175: {
    forward_join_174: {
    forward_join_171: {
    forward_join_160: {
    forward_join_157: {
    forward_join_154: {
    forward_join_148: {
    forward_join_140: {
    forward_join_136: {
    forward_join_128: {
    forward_join_124: {
    forward_join_116: {
    forward_join_114: {
    forward_join_112: {
    forward_join_103: {
    forward_join_88: {
    forward_join_86: {
    forward_join_84: {
    forward_join_65: {
    forward_join_61: {
    forward_join_51: {
    forward_join_47: {
    forward_join_44: {
    forward_join_30: {
    forward_join_26: {
    forward_join_22: {
    life3_3 = (net.minecraft.potion.Potion.R ^ 86774776998286L);
    life5_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill5542_0 = this.I;
    spill5542_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.m)).I;
    if (!((life5_5 != null))) {
        forwardValue5542_30_0 = spill5542_0;
        forwardValue5542_30_1 = spill5542_1;
        break forward_join_30;
    }
    if (!((spill5542_0 == spill5542_1))) {
        break forward_join_26;
    }
    spill5542_2 = p0;
    if (!((life5_5 != null))) {
        forwardValue5542_22_0 = spill5542_2;
        break forward_join_22;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.EntityLivingBase)(spill5542_2)).b__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.EntityLivingBase)(p0)).a()))) < 0))) {
        break forward_join_182;
    }
    forwardValue5542_22_0 = p0;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue5542_22_0)).c(((float)(0x1.0p0f)));
    if (!((life5_5 == null))) {
        break forward_join_182;
    }
    }
    forwardValue5542_30_0 = this.I;
    forwardValue5542_30_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.v)).I;
    }
    if (!((life5_5 != null))) {
        forwardValue5542_51_0 = forwardValue5542_30_0;
        forwardValue5542_51_1 = forwardValue5542_30_1;
        break forward_join_51;
    }
    if (!((forwardValue5542_30_0 == forwardValue5542_30_1))) {
        break forward_join_47;
    }
    spill5542_3 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.EntityLivingBase)(p0)).b__sourceReturn_bc607678b6())), ((float)(0x1.0p0f)));
    if (!((life5_5 != null))) {
        forwardValue5542_44_0 = spill5542_3;
        break forward_join_44;
    }
    if (!((spill5542_3 > 0))) {
        break forward_join_182;
    }
    forwardValue5542_44_0 = ((((net.minecraft.entity.EntityLivingBase)(p0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.l)), ((float)(0x1.0p0f)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue5542_44_0);
    if (!((life5_5 == null))) {
        break forward_join_182;
    }
    }
    forwardValue5542_51_0 = this.I;
    forwardValue5542_51_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.w)).I;
    }
    if (!((life5_5 != null))) {
        forwardValue5542_65_0 = forwardValue5542_51_0;
        forwardValue5542_65_1 = forwardValue5542_51_1;
        break forward_join_65;
    }
    if (!((forwardValue5542_51_0 == forwardValue5542_51_1))) {
        break forward_join_61;
    }
    ((net.minecraft.entity.EntityLivingBase)(p0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.m)), ((float)(0x1.0p0f)));
    if (!((life5_5 == null))) {
        break forward_join_182;
    }
    }
    forwardValue5542_65_0 = this.I;
    forwardValue5542_65_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.t)).I;
    }
    if (!((life5_5 != null))) {
        forwardValue5542_88_0 = forwardValue5542_65_0;
        forwardValue5542_88_1 = forwardValue5542_65_1;
        break forward_join_88;
    }
    if (!((forwardValue5542_65_0 == forwardValue5542_65_1))) {
        break forward_join_84;
    }
    spill5542_4 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life5_5 != null))) {
        forwardValue5542_86_0 = spill5542_4;
        break forward_join_86;
    }
    if (!((spill5542_4 != 0))) {
        break forward_join_84;
    }
    ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)))).h(((float)((0x1.99999ap-6f * ((float) (p1 + 1))))));
    if (!((life5_5 == null))) {
        break forward_join_182;
    }
    }
    forwardValue5542_86_0 = this.I;
    }
    forwardValue5542_88_0 = forwardValue5542_86_0;
    forwardValue5542_88_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.z)).I;
    }
    if (!((life5_5 != null))) {
        forwardValue5542_116_0 = forwardValue5542_88_0;
        forwardValue5542_116_1 = forwardValue5542_88_1;
        break forward_join_116;
    }
    if (!((forwardValue5542_88_0 == forwardValue5542_88_1))) {
        break forward_join_112;
    }
    spill5542_5 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life5_5 != null))) {
        forwardValue5542_114_0 = spill5542_5;
        break forward_join_114;
    }
    if (!((spill5542_5 != 0))) {
        break forward_join_112;
    }
    spill5542_6 = p0;
    if (!((life5_5 != null))) {
        forwardValue5542_103_0 = spill5542_6;
        break forward_join_103;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(spill5542_6)).i)).G))) {
        break forward_join_182;
    }
    forwardValue5542_103_0 = p0;
    }
    ((net.minecraft.util.FoodStats)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(forwardValue5542_103_0)))).a__C2())).a(((int)((p1 + 1))), ((float)(0x1.0p0f)));
    if (!((life5_5 == null))) {
        break forward_join_182;
    }
    }
    forwardValue5542_114_0 = this.I;
    }
    forwardValue5542_116_0 = forwardValue5542_114_0;
    forwardValue5542_116_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.i)).I;
    }
    if (!((life5_5 != null))) {
        forwardValue5542_128_0 = forwardValue5542_116_0;
        forwardValue5542_128_1 = forwardValue5542_116_1;
        break forward_join_128;
    }
    if (!((forwardValue5542_116_0 == forwardValue5542_116_1))) {
        break forward_join_124;
    }
    spill5542_7 = p0;
    if (!((life5_5 != null))) {
        forwardValue5542_175_0 = spill5542_7;
        break forward_join_175;
    }
    if (!(((net.minecraft.entity.EntityLivingBase)(spill5542_7)).H__Boolean())) {
        break forward_join_174;
    }
    }
    forwardValue5542_128_0 = this.I;
    forwardValue5542_128_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.j)).I;
    }
    if (!((life5_5 != null))) {
        forwardValue5542_140_0 = forwardValue5542_128_0;
        forwardValue5542_140_1 = forwardValue5542_128_1;
        break forward_join_140;
    }
    if (!((forwardValue5542_128_0 == forwardValue5542_128_1))) {
        break forward_join_136;
    }
    spill5542_8 = p0;
    if (!((life5_5 != null))) {
        forwardValue5542_175_0 = spill5542_8;
        break forward_join_175;
    }
    if (!((!((net.minecraft.entity.EntityLivingBase)(spill5542_8)).H__Boolean()))) {
        break forward_join_174;
    }
    }
    forwardValue5542_140_0 = this.I;
    forwardValue5542_140_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.j)).I;
    }
    if (!((life5_5 != null))) {
        forwardValue5542_154_0 = forwardValue5542_140_0;
        forwardValue5542_154_1 = forwardValue5542_140_1;
        break forward_join_154;
    }
    if (!((forwardValue5542_140_0 == forwardValue5542_140_1))) {
        break forward_join_148;
    }
    spill5542_9 = ((net.minecraft.entity.EntityLivingBase)(p0)).H__Boolean();
    if (!((life5_5 != null))) {
        forwardValue5542_171_0 = ((spill5542_9) ? 1 : 0);
        break forward_join_171;
    }
    if (!(spill5542_9)) {
        break forward_join_160;
    }
    }
    spill5542_10 = this.I;
    if (!((life5_5 != null))) {
        forwardValue5542_157_0 = spill5542_10;
        break forward_join_157;
    }
    forwardValue5542_154_0 = spill5542_10;
    forwardValue5542_154_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.i)).I;
    }
    if (!((forwardValue5542_154_0 == forwardValue5542_154_1))) {
        break forward_join_182;
    }
    forwardValue5542_157_0 = ((((net.minecraft.entity.EntityLivingBase)(p0)).H__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue5542_171_0 = forwardValue5542_157_0;
        break forward_join_171;
    }
    if (!((forwardValue5542_157_0 != 0))) {
        break forward_join_182;
    }
    }
    forwardValue5542_171_0 = ((((net.minecraft.entity.EntityLivingBase)(p0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.l)), ((float)(((float) (__sourceIntrinsic_6a8ac1cae725_invokedynamic5542_57(18503, (6193163676213772909L ^ life3_3)) << p1)))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue5542_171_0);
    if (!((life5_5 == null))) {
        break forward_join_182;
    }
    }
    forwardValue5542_175_0 = p0;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue5542_175_0)).c(((float)(((float) java.lang.Math.max(((int)((4 << p1))), ((int)(0)))))));
    }
    return;
}


public int a__Int() {
return this.I;
}


protected net.minecraft.potion.Potion a(int p0, int p1) {
long local3 = (net.minecraft.potion.Potion.R ^ 79836727687026L);
    this.N = ((int)((p0 + (p1 * __sourceIntrinsic_1334a25ba952_originalDynamicSite2036_1(22111, (2098235938774680239L ^ local3))))));
    return this;
}


public static java.util.Set<moom.DD> a__Set() {
return ((java.util.Map)(net.minecraft.potion.Potion.b)).keySet();
}


public static net.minecraft.potion.Potion a(java.lang.String p0) {
return ((net.minecraft.potion.Potion)(((java.util.Map)(net.minecraft.potion.Potion.b)).get(((java.lang.Object)(new moom.DD(p0))))));
}


public double a() {
return this.O;
}


protected net.minecraft.potion.Potion a(double p0) {
this.O = ((double)(p0));
    return this;
}


public static java.lang.String a(net.minecraft.potion.PotionEffect p0) {
int forwardValue5544_15_0;
    boolean spill5544_0;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_20;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (net.minecraft.potion.Potion.R ^ 14403294186523L);
    life3_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill5544_0 = ((net.minecraft.potion.PotionEffect)(p0)).c__Boolean();
    if (!((life3_5 != null))) {
        forwardValue5544_15_0 = ((spill5544_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill5544_0)) {
        break forward_join_13;
    }
    return "**:**";
    }
    forwardValue5544_15_0 = ((net.minecraft.potion.PotionEffect)(p0)).b();
    }
    life4_20 = forwardValue5544_15_0;
    return moom.DK.a(((int)(life4_20)));
}


public java.lang.String a__String() {
return this.M;
}


public boolean a__Boolean(int p0, int p1) {
int forwardValue5545_32_0;
    int forwardValue5545_34_0;
    int forwardValue5545_39_0;
    int forwardValue5545_39_1;
    int forwardValue5545_61_0;
    int forwardValue5545_63_0;
    int forwardValue5545_68_0;
    int forwardValue5545_68_1;
    int forwardValue5545_90_0;
    int forwardValue5545_92_0;
    int forwardValue5545_99_0;
    int forwardValue5545_99_1;
    int forwardValue5545_101_0;
    int forwardValue5545_103_0;
    int spill5545_0;
    int spill5545_1;
    int spill5545_2;
    int spill5545_3;
    int spill5545_4;
    int spill5545_5;
    int spill5545_6;
    int spill5545_7;
    int spill5545_8;
    long life3_3;
    java.lang.String[] life5_5;
    int life6_23;
    int life6_64;
    int life6_105;
    forward_join_103: {
    forward_join_102: {
    forward_join_101: {
    forward_join_99: {
    forward_join_93: {
    forward_join_92: {
    forward_join_91: {
    forward_join_90: {
    forward_join_89: {
    forward_join_68: {
    forward_join_64: {
    forward_join_63: {
    forward_join_62: {
    forward_join_61: {
    forward_join_60: {
    forward_join_39: {
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    life3_3 = (net.minecraft.potion.Potion.R ^ 24266373868292L);
    life5_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill5545_0 = this.I;
    spill5545_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.m)).I;
    if (!((life5_5 != null))) {
        forwardValue5545_39_0 = spill5545_0;
        forwardValue5545_39_1 = spill5545_1;
        break forward_join_39;
    }
    if (!((spill5545_0 == spill5545_1))) {
        break forward_join_35;
    }
    life6_23 = (__sourceIntrinsic_c86802429962_invokedynamic5545_5(16759, (8419362055397378501L ^ life3_3)) >> p1);
    spill5545_2 = life6_23;
    if (!((life5_5 != null))) {
        forwardValue5545_32_0 = spill5545_2;
        break forward_join_32;
    }
    if (!((spill5545_2 != 0))) {
        break forward_join_31;
    }
    spill5545_3 = (p0 % life6_23);
    if (!((life5_5 != null))) {
        forwardValue5545_32_0 = spill5545_3;
        break forward_join_32;
    }
    if (!((spill5545_3 == 0))) {
        break forward_join_33;
    }
    }
    forwardValue5545_32_0 = 1;
    }
    forwardValue5545_34_0 = forwardValue5545_32_0;
    break forward_join_34;
    }
    forwardValue5545_34_0 = 0;
    }
    return ((forwardValue5545_34_0) != 0);
    }
    forwardValue5545_39_0 = this.I;
    forwardValue5545_39_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.v)).I;
    }
    if (!((life5_5 != null))) {
        forwardValue5545_68_0 = forwardValue5545_39_0;
        forwardValue5545_68_1 = forwardValue5545_39_1;
        break forward_join_68;
    }
    if (!((forwardValue5545_39_0 == forwardValue5545_39_1))) {
        break forward_join_64;
    }
    life6_64 = (__sourceIntrinsic_c86802429962_invokedynamic5545_10(24767, (7754400722897152002L ^ life3_3)) >> p1);
    spill5545_4 = life6_64;
    if (!((life5_5 != null))) {
        forwardValue5545_61_0 = spill5545_4;
        break forward_join_61;
    }
    if (!((spill5545_4 != 0))) {
        break forward_join_60;
    }
    spill5545_5 = (p0 % life6_64);
    if (!((life5_5 != null))) {
        forwardValue5545_61_0 = spill5545_5;
        break forward_join_61;
    }
    if (!((spill5545_5 == 0))) {
        break forward_join_62;
    }
    }
    forwardValue5545_61_0 = 1;
    }
    forwardValue5545_63_0 = forwardValue5545_61_0;
    break forward_join_63;
    }
    forwardValue5545_63_0 = 0;
    }
    return ((forwardValue5545_63_0) != 0);
    }
    forwardValue5545_68_0 = this.I;
    forwardValue5545_68_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.w)).I;
    }
    if (!((life5_5 != null))) {
        forwardValue5545_99_0 = forwardValue5545_68_0;
        forwardValue5545_99_1 = forwardValue5545_68_1;
        break forward_join_99;
    }
    if (!((forwardValue5545_68_0 == forwardValue5545_68_1))) {
        break forward_join_93;
    }
    life6_105 = (__sourceIntrinsic_c86802429962_invokedynamic5545_15(29466, (316718066708495292L ^ life3_3)) >> p1);
    spill5545_6 = life6_105;
    if (!((life5_5 != null))) {
        forwardValue5545_90_0 = spill5545_6;
        break forward_join_90;
    }
    if (!((spill5545_6 != 0))) {
        break forward_join_89;
    }
    spill5545_7 = (p0 % life6_105);
    if (!((life5_5 != null))) {
        forwardValue5545_90_0 = spill5545_7;
        break forward_join_90;
    }
    if (!((spill5545_7 == 0))) {
        break forward_join_91;
    }
    }
    forwardValue5545_90_0 = 1;
    }
    forwardValue5545_92_0 = forwardValue5545_90_0;
    break forward_join_92;
    }
    forwardValue5545_92_0 = 0;
    }
    return ((forwardValue5545_92_0) != 0);
    }
    spill5545_8 = this.I;
    if (!((life5_5 != null))) {
        forwardValue5545_101_0 = spill5545_8;
        break forward_join_101;
    }
    forwardValue5545_99_0 = spill5545_8;
    forwardValue5545_99_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.t)).I;
    }
    if (!((forwardValue5545_99_0 == forwardValue5545_99_1))) {
        break forward_join_102;
    }
    forwardValue5545_101_0 = 1;
    }
    forwardValue5545_103_0 = forwardValue5545_101_0;
    break forward_join_103;
    }
    forwardValue5545_103_0 = 0;
    }
    return ((forwardValue5545_103_0) != 0);
}


public boolean a__Boolean() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_141(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_151(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_177(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1913_183(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f3836ee8cea2_invokedynamic1644_16(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12100_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0a61cde73b89_invokedynamic5541_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6a8ac1cae725_invokedynamic5542_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1334a25ba952_originalDynamicSite2036_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic5545_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic5545_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic5545_15(int a0, long a1) throws E;
}
