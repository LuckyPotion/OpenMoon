package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hG extends moom.hD {

private net.minecraft.client.gui.GuiScreen w;

protected java.lang.String x;

private net.minecraft.client.settings.GameSettings y;

private moom.LI z;

private java.lang.String A;

private java.lang.String B;

private boolean C;

private static long D;

private static java.lang.String[] E;

private static java.lang.String[] F;

private static java.util.Map H;

private static long[] I;

private static java.lang.Integer[] J;

private static java.util.Map K;

public hG(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1) { super(); }


private static void __sourceConstructorBody_1f65812e2ff6e198(moom.hG receiver, net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1) throws Throwable {

long local3 = (moom.hG.D ^ 3090578772814L);

    moom.hG.__sourceConstructorInit_1f65812e2ff6e198_0(((moom.hG)(receiver)));

    ((moom.hG)(receiver)).z = ((moom.LI)(new moom.LI(receiver, new moom.LM())));

    ((moom.hG)(receiver)).A = ((java.lang.String)(null));

    ((moom.hG)(receiver)).B = ((java.lang.String)(null));

    ((moom.hG)(receiver)).C = ((boolean)(false));

    ((moom.hG)(receiver)).x = ((java.lang.String)(__sourceIntrinsic_1f65812e2ff6e198_originalDynamicSite2817_6(25704, (6050282078332621627L ^ local3))));

    ((moom.hG)(receiver)).w = ((net.minecraft.client.gui.GuiScreen)(p0));

    ((moom.hG)(receiver)).y = ((net.minecraft.client.settings.GameSettings)(p1));

    return;

}



public hG(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1, java.lang.String p2) { this((net.minecraft.client.gui.GuiScreen)null, (net.minecraft.client.settings.GameSettings)null); }


private static void __sourceConstructorBody_d354c285adfcf929(moom.hG receiver, net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1, java.lang.String p2) throws Throwable {

moom.hG __initValue662_28_0;

    java.lang.String __initValue662_28_1;

    init_join_29: {

    init_join_28: {

    long local4_life2 = (moom.hG.D ^ 18845691354584L);

    net.minecraft.entity.Entity[] __sourceSpill662_4 = net.minecraft.potion.Potion.b__Arrayr3();

    moom.hG.__sourceConstructorInit_d354c285adfcf929_0(((moom.hG)(receiver)), ((net.minecraft.client.gui.GuiScreen)(p0)), ((net.minecraft.client.settings.GameSettings)(p1)));

    net.minecraft.entity.Entity[] local6_life6 = __sourceSpill662_4;

    moom.hG __sourceSpill662_7 = receiver;

    java.lang.String __sourceSpill662_8 = p2;

    if (!((local6_life6 == null))) {

        __initValue662_28_0 = __sourceSpill662_7;

        __initValue662_28_1 = __sourceSpill662_8;

        break init_join_28;

    }

    ((moom.hG)(__sourceSpill662_7)).A = ((java.lang.String)(__sourceSpill662_8));

    if (!((p2 != null))) {

        break init_join_29;

    }

    moom.hG __sourceSpill662_12 = receiver;

    java.lang.String __stackOp662_13_0 = p2;

    java.lang.String __stackOp662_13_1 = __sourceIntrinsic_d354c285adfcf929_originalDynamicSite662_11(24916, (3613163301921167510L ^ local4_life2));

    __initValue662_28_0 = __sourceSpill662_12;

    __initValue662_28_1 = moom.MP.a(((java.lang.String)(__sourceIntrinsic_d354c285adfcf929_originalDynamicSite662_14(__stackOp662_13_1, __stackOp662_13_0))), ((java.lang.String)(p2)));

    }

    ((moom.hG)(__initValue662_28_0)).B = ((java.lang.String)(__initValue662_28_1));

    }

    return;

}



static {
D = ((long)(((moom._a)(moom._c.a(((long)(5534548917206847629L)), ((long)(1475157297347993088L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(95103487592596L)))));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.hG.D ^ 52945311300333L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill862_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill862_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill862_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill862_14 = new byte[8];
    (__sourceSpill862_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill862_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation862_16 = __sourceSpill862_14;
    ((javax.crypto.Cipher)(__sourceSpill862_11)).init(((int)(__sourceSpill862_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill862_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation862_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[8];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "E\0136bSf£1k\"6?\033ö\025Á¨b5éJ¡\020(þï}.µvì Î)È\"ë\0205r\035£¢Â\016Ê¸ähØóÐ0èâª|õÄßu`\003ñý\020Ö­¾¥æ7Æ\bv[ºQçÎ¨ç:é}q\"X3å(®Ïáø\020IG0\001ª6óá¼vr§µ³= Ãïé¨^ÝÆæZ| ÝH\f#ô|\002\t:DÍéÓ½\027Ã«Ô"))).length();
    int local16_life24 = 24;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill862_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill862_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill862_29)).doFinal(((byte[])(__sourceSpill862_28)));
        java.lang.String __sourceSpill862_34 = ((java.lang.String)(moom.hG.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill862_35 = local20_life19;
        int __sourceSpill862_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill862_35)[__sourceSpill862_36] = __sourceSpill862_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "'¦íÚ\032÷<í\\£ÄX W]ue`¨ECE\031sÀ\001MK Z¸\034\006ªôy\023´É-ÌàÌì"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill862_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill862_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill862_42)).doFinal(((byte[])(__sourceSpill862_41)));
        java.lang.String __sourceSpill862_47 = ((java.lang.String)(moom.hG.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill862_48 = local20_life19;
        int __sourceSpill862_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill862_48)[__sourceSpill862_49] = __sourceSpill862_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    E = ((java.lang.String[])(local20_life19));
    F = ((java.lang.String[])(new java.lang.String[8]));
    K = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill862_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill862_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill862_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill862_60 = new byte[8];
    (__sourceSpill862_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill862_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation862_62 = __sourceSpill862_60;
    ((javax.crypto.Cipher)(__sourceSpill862_57)).init(((int)(__sourceSpill862_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill862_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation862_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[20];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = ">-%!È«»9Ô±¡Áã~\026h¦ccpãií\023M&3¦Q1öß mñ¶\0301:ðüuüaÁñ\034#ìÜy¸¶öW: éúÍî\021IÙ\034\024ë\017åûïµ1-f8/ômï¡×Yz<Ù¦7ë½}t\030ZìyÍ\001@UúBu¦ê¢!óé2æS\035DS¥$\025Óò\005z\031æûþE\t\023ò¥yç"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill862_71 = local4_life67;
        int __sourceSpill862_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill862_71)).substring(((int)(__sourceSpill862_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill862_76 = local6_life65;
        int __sourceSpill862_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill862_79 = new byte[8];
        (__sourceSpill862_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill862_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill862_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill862_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill862_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill862_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill862_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill862_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill862_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill862_80)).doFinal(((byte[])(__sourceSpill862_79)));
        (__sourceSpill862_76)[__sourceSpill862_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = " #2PÛ¶\0364Õjb+ä"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill862_84 = local4_life67;
        int __sourceSpill862_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill862_84)).substring(((int)(__sourceSpill862_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill862_89 = local6_life65;
        int __sourceSpill862_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill862_92 = new byte[8];
        (__sourceSpill862_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill862_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill862_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill862_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill862_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill862_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill862_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill862_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill862_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill862_93)).doFinal(((byte[])(__sourceSpill862_92)));
        (__sourceSpill862_89)[__sourceSpill862_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    I = ((long[])(local6_life65));
    J = ((java.lang.Integer[])(new java.lang.Integer[20]));
}

private static native <E extends Throwable> void __sourceConstructorInit_1f65812e2ff6e198_0(moom.hG a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_d354c285adfcf929_0(moom.hG a0, net.minecraft.client.gui.GuiScreen a1, net.minecraft.client.settings.GameSettings a2) throws E;

protected void b__Void(moom.gc p0) {
moom.gc forwardValue3596_12_0;
    int forwardValue3596_27_0;
    moom.gc spill3596_0;
    boolean spill3596_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    moom.gx life5_19;
    moom.M7 life6_22;
    forward_join_35: {
    forward_join_30: {
    forward_join_27: {
    forward_join_25: {
    forward_join_12: {
    life2_3 = (moom.hG.D ^ 87511126451582L);
    life4_5 = net.minecraft.potion.Potion.b__Arrayr3();
    spill3596_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue3596_12_0 = spill3596_0;
        break forward_join_12;
    }
    if (!((((spill3596_0 instanceof moom.gx) ? 1 : 0) != 0))) {
        break forward_join_35;
    }
    forwardValue3596_12_0 = p0;
    }
    life5_19 = ((moom.gx)(forwardValue3596_12_0));
    life6_22 = ((moom.gx)(life5_19)).a__sourceReturn_f8ef67709a();
    spill3596_1 = moom.hG.c__Boolean();
    if (!((life4_5 == null))) {
        forwardValue3596_27_0 = ((spill3596_1) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill3596_1)) {
        break forward_join_25;
    }
    ((moom.M7)(life6_22)).a__Void();
    if (!((life4_5 != null))) {
        break forward_join_30;
    }
    }
    forwardValue3596_27_0 = ((((moom.gx)(life5_19)).b()) ? 1 : 0);
    }
    if (!((forwardValue3596_27_0 != 0))) {
        break forward_join_30;
    }
    ((moom.M7)(life6_22)).c__Void();
    }
    ((moom.hG)(this)).a();
    this.C = ((boolean)(true));
    }
    return;
}


public void c__Void() {
int forestValue14_76_0;
    int forestValue14_99_0;
    net.minecraft.entity.Entity[] spill14_0;
    int spill14_1;
    boolean spill14_2;
    long life1_3;
    int life4_20;
    int life5_22;
    net.minecraft.entity.Entity[] life3_23;
    int life6_29;
    int life7_35;
    int life8_41;
    int life9_47;
    int life10_52;
    moom.M7[] life11_56;
    int life12_70;
    int life13_84;
    moom.M7 life14_94;
    int life15_119;
    int life16_123;
    int life17_134;
    int life5_143;
    int life18_151;
    int life19_157;
    int life20_165;
    java.lang.String life21_169;
    moom.gx life22_187;
    forest_join_305: {
    forest_join_300: {
    forest_join_194: {
    forest_join_76: {
    forest_join_75: {
    life1_3 = (moom.hG.D ^ 51083246858421L);
    spill14_0 = net.minecraft.potion.Potion.b__Arrayr3();
    this.x = ((java.lang.String)(moom.oO.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic14_2(7354, (6811325480125106196L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[0])))));
    life4_20 = __sourceIntrinsic_7ac46ee229a8_invokedynamic14_5(16056, (6591456165335917897L ^ life1_3));
    life5_22 = 0;
    life3_23 = spill14_0;
    life6_29 = __sourceIntrinsic_7ac46ee229a8_invokedynamic14_6(32305, (8412008068948698573L ^ life1_3));
    life7_35 = __sourceIntrinsic_7ac46ee229a8_invokedynamic14_7(6784, (8745177310612177255L ^ life1_3));
    life8_41 = __sourceIntrinsic_7ac46ee229a8_invokedynamic14_8(15978, (1662348423966975381L ^ life1_3));
    life9_47 = __sourceIntrinsic_7ac46ee229a8_invokedynamic14_9(16821, (1378845800046402127L ^ life1_3));
    life10_52 = moom.MP.a(((java.lang.String)(this.A)), ((int)(2)));
    life11_56 = moom.MP.a__ArrayM7(((java.lang.String)(this.A)));
    if (!((life3_23 == null))) {
        break forest_join_300;
    }
    if (!((life11_56 != null))) {
        break forest_join_194;
    }
    life12_70 = moom.Dr.d(((double)((((double) (life11_56).length) / 0x1.2p3d))));
    spill14_1 = life10_52;
    if (!((life3_23 == null))) {
        forestValue14_76_0 = spill14_1;
        break forest_join_76;
    }
    if (!((spill14_1 < life12_70))) {
        break forest_join_75;
    }
    life10_52 = life12_70;
    }
    forestValue14_76_0 = 0;
    }
    life13_84 = forestValue14_76_0;
    forest_cycle_77: while (true) {
    forest_join_192: {
    forest_join_191: {
    forest_join_182: {
    forest_join_169: {
    forest_join_99: {
    if (!((life13_84 < (life11_56).length))) {
        break forest_join_194;
    }
    life14_94 = (life11_56)[life13_84];
    if (!((life3_23 == null))) {
        break forest_join_300;
    }
    if (!((life3_23 == null))) {
        break forest_join_192;
    }
    if (!((life14_94 != null))) {
        break forest_join_191;
    }
    spill14_2 = ((moom.M7)(life14_94)).c__Boolean();
    if (!((life3_23 == null))) {
        forestValue14_99_0 = ((spill14_2) ? 1 : 0);
        break forest_join_99;
    }
    if (!(spill14_2)) {
        break forest_join_191;
    }
    forestValue14_99_0 = (life13_84 % life10_52);
    }
    life15_119 = forestValue14_99_0;
    life16_123 = (life13_84 / life10_52);
    life17_134 = java.lang.Math.min(((int)((this.k / life10_52))), ((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic14_18(13467, (5573902290711572335L ^ life1_3)))));
    life5_143 = ((this.k - (life17_134 * life10_52)) / 2);
    life18_151 = (((life15_119 * life17_134) + 5) + life5_143);
    life19_157 = (life6_29 + (life16_123 * life7_35));
    life20_165 = (life17_134 - __sourceIntrinsic_7ac46ee229a8_invokedynamic14_21(996, (2559635049466910742L ^ life1_3)));
    life21_169 = moom.hG.a(((moom.M7)(life14_94)), ((int)(life20_165)));
    if (!(moom.MP.a__Boolean(((java.lang.String)(((moom.M7)(life14_94)).a__String()))))) {
        break forest_join_169;
    }
    life22_187 = new moom.gy((life4_20 + life13_84), life18_151, life19_157, life20_165, life9_47, life14_94, life21_169);
    if (!((life3_23 != null))) {
        break forest_join_182;
    }
    }
    life22_187 = new moom.gx((life4_20 + life13_84), life18_151, life19_157, life20_165, life9_47, life14_94, life21_169);
    }
    ((moom.gx)(life22_187)).m = ((boolean)(((moom.M7)(life14_94)).a__Boolean()));
    ((java.util.List)(this.m)).add(((java.lang.Object)(life22_187)));
    }
    life13_84 += 1;
    }
    if (!((life3_23 != null))) {
        continue forest_cycle_77;
    }
    break forest_cycle_77;
    }
    }
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic14_30(11955, (41327804403283264L ^ life1_3)), (((this.k / 2) - life8_41) - __sourceIntrinsic_7ac46ee229a8_invokedynamic14_32(16821, (1378845800046402127L ^ life1_3))), (((this.l / __sourceIntrinsic_7ac46ee229a8_invokedynamic14_34(5967, (1139733721071307960L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic14_35(31647, (4798135288875425892L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic14_36(18043, (6699510775566507421L ^ life1_3))), life8_41, life9_47, moom.oO.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic14_37(1693, (7683175898454463024L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic14_41(13467, (5573902290711572335L ^ life1_3)), ((this.k / 2) + __sourceIntrinsic_7ac46ee229a8_invokedynamic14_43(16821, (1378845800046402127L ^ life1_3))), (((this.l / __sourceIntrinsic_7ac46ee229a8_invokedynamic14_45(24740, (7734863437517077330L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic14_46(17505, (1012520177760706436L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic14_47(27248, (7525795772446388628L ^ life1_3))), life8_41, life9_47, moom.oO.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic14_48(13283, (1797047965887244105L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[0])))))));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forest_join_305;
    }
    net.minecraft.potion.Potion.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
    return;
}


public void h() {
moom.hG forwardValue3598_15_0;
    net.minecraft.entity.Entity[] spill3598_0;
    moom.hG spill3598_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    forward_join_18: {
    forward_join_15: {
    life1_3 = (moom.hG.D ^ 106878399764178L);
    spill3598_0 = net.minecraft.potion.Potion.b__Arrayr3();
    super.h();
    life3_7 = spill3598_0;
    spill3598_1 = this;
    if (!((life3_7 == null))) {
        forwardValue3598_15_0 = spill3598_1;
        break forward_join_15;
    }
    if (!(((moom.hG)(spill3598_1)).C)) {
        break forward_join_18;
    }
    moom.MP.g();
    forwardValue3598_15_0 = this;
    }
    ((moom.hG)(forwardValue3598_15_0)).C = ((boolean)(false));
    moom.MP.m();
    }
    return;
}


private static int d(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x882;
        if (J[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = I[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])K.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    K.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/hG", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            hG.J[n2] = n4;
        }
        return J[n2];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hG.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7850_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18394);
    if (((moom.hG.F)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.hG.H)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.hG.H)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/hG", life9_51);
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
        life9_116 = ((java.lang.String)((moom.hG.E)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.hG.F)[life5_8] = moom.hG.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.hG.F)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.hG.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7852_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.lang.String a(moom.M7 p0, int p1) {
moom.M7 lexicalValue1187_15_0;
    int lexicalValue1187_69_0;
    moom.M7 lexicalValue1187_71_0;
    java.lang.String lexicalValue1187_76_0;
    net.minecraft.entity.Entity[] spill1187_0;
    moom.M7 spill1187_1;
    net.minecraft.client.gui.FontRenderer spill1187_2;
    int spill1187_3;
    moom.M7 spill1187_4;
    java.lang.String spill1187_5;
    java.lang.String spill1187_6;
    long life2_3;
    java.lang.String life5_7;
    net.minecraft.entity.Entity[] life4_8;
    moom.M_ life6_22;
    net.minecraft.client.gui.FontRenderer life7_33;
    int life8_46;
    java.lang.String life8_91;
    java.lang.String life9_96;
    java.lang.String life10_100;
    java.lang.String life11_101;
    lexical_join_76: {
    lexical_join_75: {
    lexical_join_71: {
    lexical_join_69: {
    lexical_join_65: {
    lexical_join_25: {
    lexical_join_15: {
    life2_3 = (moom.hG.D ^ 137733502343003L);
    spill1187_0 = net.minecraft.potion.Potion.b__Arrayr3();
    life5_7 = ((moom.M7)(p0)).f();
    life4_8 = spill1187_0;
    spill1187_1 = p0;
    if (!((life4_8 == null))) {
        lexicalValue1187_15_0 = spill1187_1;
        break lexical_join_15;
    }
    if (!((((spill1187_1 instanceof moom.M_) ? 1 : 0) != 0))) {
        break lexical_join_25;
    }
    lexicalValue1187_15_0 = p0;
    }
    life6_22 = ((moom.M_)(lexicalValue1187_15_0));
    return __sourceIntrinsic_34d98f2c6fd2_invokedynamic1187_6(life5_7, __sourceIntrinsic_34d98f2c6fd2_invokedynamic1187_5(14421, (9168869984997624594L ^ life2_3)));
    }
    life7_33 = ((net.minecraft.client.Minecraft)(moom.BU.a__fM())).N;
    spill1187_2 = life7_33;
    java.lang.String __stackOp1187_11_0 = moom.JM.b();
    java.lang.String __stackOp1187_11_1 = __sourceIntrinsic_34d98f2c6fd2_invokedynamic1187_10(357, (2943450947600806432L ^ life2_3));
    life8_46 = (((net.minecraft.client.gui.FontRenderer)(spill1187_2)).a(((java.lang.String)(__sourceIntrinsic_34d98f2c6fd2_invokedynamic1187_12(__stackOp1187_11_1, __stackOp1187_11_0)))) + 5);
    lexical_cycle_41: while (true) {
    if (!(((((net.minecraft.client.gui.FontRenderer)(life7_33)).a(((java.lang.String)(life5_7))) + life8_46) >= p1))) {
        break lexical_join_65;
    }
    spill1187_3 = ((java.lang.String)(life5_7)).length();
    if (!((life4_8 == null))) {
        lexicalValue1187_69_0 = spill1187_3;
        break lexical_join_69;
    }
    if (!((life4_8 == null))) {
        lexicalValue1187_69_0 = spill1187_3;
        break lexical_join_69;
    }
    if (!((spill1187_3 > 0))) {
        break lexical_join_65;
    }
    life5_7 = ((java.lang.String)(life5_7)).substring(((int)(0)), ((int)((((java.lang.String)(life5_7)).length() - 1))));
    if (!((life4_8 != null))) { continue lexical_cycle_41; }
    break lexical_cycle_41;
    }
    }
    spill1187_4 = p0;
    if (!((life4_8 == null))) {
        lexicalValue1187_71_0 = spill1187_4;
        break lexical_join_71;
    }
    lexicalValue1187_69_0 = ((((moom.M7)(spill1187_4)).b__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1187_69_0 != 0))) {
        break lexical_join_75;
    }
    lexicalValue1187_71_0 = p0;
    }
    lexicalValue1187_76_0 = ((moom.M7)(lexicalValue1187_71_0)).b(((java.lang.String)(((moom.M7)(p0)).d())));
    break lexical_join_76;
    }
    lexicalValue1187_76_0 = "";
    }
    life8_91 = lexicalValue1187_76_0;
    life9_96 = ((moom.M7)(p0)).a(((java.lang.String)(((moom.M7)(p0)).d())));
    spill1187_5 = life5_7;
    spill1187_6 = life8_91;
    life10_100 = life9_96;
    life11_101 = spill1187_6;
    return __sourceIntrinsic_34d98f2c6fd2_invokedynamic1187_25(spill1187_5, __sourceIntrinsic_34d98f2c6fd2_invokedynamic1187_24(26018, (6881868319140026080L ^ life2_3)), life11_101, life10_100);
}


protected void a__Void(moom.gc p0) {
int lexicalValue1188_13_0;
    int lexicalValue1188_54_0;
    int lexicalValue1188_63_0;
    int lexicalValue1188_73_0;
    int lexicalValue1188_78_0;
    int lexicalValue1188_78_1;
    int lexicalValue1188_119_0;
    int lexicalValue1188_119_1;
    int lexicalValue1188_124_0;
    moom.hG lexicalValue1188_131_0;
    boolean spill1188_0;
    int spill1188_1;
    int spill1188_2;
    int spill1188_3;
    int spill1188_4;
    moom.hG spill1188_5;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    moom.gx life5_43;
    moom.M7 life6_46;
    java.lang.String life7_57;
    moom.hG life8_65;
    moom.M7[] life5_116;
    moom.M7[] life6_118;
    int life7_121;
    int life8_123;
    moom.M7 life9_130;
    lexical_join_135: {
    lexical_join_131: {
    lexical_join_130: {
    lexical_join_124: {
    lexical_join_119: {
    lexical_join_110: {
    lexical_join_108: {
    lexical_join_78: {
    lexical_join_73: {
    lexical_join_71: {
    lexical_join_66: {
    lexical_join_63: {
    lexical_join_61: {
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_13: {
    life2_3 = (moom.hG.D ^ 120918687605076L);
    life4_5 = net.minecraft.potion.Potion.b__Arrayr3();
    spill1188_0 = ((moom.gc)(p0)).m;
    if (!((life4_5 == null))) {
        lexicalValue1188_13_0 = ((spill1188_0) ? 1 : 0);
        break lexical_join_13;
    }
    if (!(spill1188_0)) {
        break lexical_join_135;
    }
    lexicalValue1188_13_0 = ((moom.gc)(p0)).l;
    }
    spill1188_1 = __sourceIntrinsic_60da6f6f15c0_invokedynamic1188_5(5090, (1915834452788599294L ^ life2_3));
    if (!((life4_5 == null))) {
        lexicalValue1188_78_0 = lexicalValue1188_13_0;
        lexicalValue1188_78_1 = spill1188_1;
        break lexical_join_78;
    }
    if (!((lexicalValue1188_13_0 < spill1188_1))) {
        break lexical_join_71;
    }
    spill1188_2 = ((p0 instanceof moom.gx) ? 1 : 0);
    if (!((life4_5 == null))) {
        lexicalValue1188_73_0 = spill1188_2;
        break lexical_join_73;
    }
    if (!((spill1188_2 != 0))) {
        break lexical_join_71;
    }
    life5_43 = ((moom.gx)(p0));
    life6_46 = ((moom.gx)(life5_43)).a__sourceReturn_f8ef67709a();
    spill1188_3 = ((life6_46 instanceof moom.M_) ? 1 : 0);
    if (!((life4_5 == null))) {
        lexicalValue1188_54_0 = spill1188_3;
        break lexical_join_54;
    }
    if (!((spill1188_3 != 0))) {
        break lexical_join_53;
    }
    life7_57 = ((moom.M7)(life6_46)).a__String();
    life8_65 = new moom.hG(this, this.y, life7_57);
    ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(life8_65)));
    return;
    }
    lexicalValue1188_54_0 = ((moom.hG.c__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        lexicalValue1188_63_0 = lexicalValue1188_54_0;
        break lexical_join_63;
    }
    if (!((lexicalValue1188_54_0 != 0))) {
        break lexical_join_61;
    }
    ((moom.M7)(life6_46)).a__Void();
    if (!((life4_5 != null))) {
        break lexical_join_66;
    }
    }
    lexicalValue1188_63_0 = ((((moom.gx)(life5_43)).b()) ? 1 : 0);
    }
    if (!((lexicalValue1188_63_0 != 0))) {
        break lexical_join_66;
    }
    ((moom.M7)(life6_46)).b__Void();
    }
    ((moom.hG)(this)).a();
    this.C = ((boolean)(true));
    }
    lexicalValue1188_73_0 = ((moom.gc)(p0)).l;
    }
    lexicalValue1188_78_0 = lexicalValue1188_73_0;
    lexicalValue1188_78_1 = __sourceIntrinsic_60da6f6f15c0_invokedynamic1188_23(9797, (6701590440315874396L ^ life2_3));
    }
    if (!((life4_5 == null))) {
        lexicalValue1188_119_0 = lexicalValue1188_78_0;
        lexicalValue1188_119_1 = lexicalValue1188_78_1;
        break lexical_join_119;
    }
    if (!((lexicalValue1188_78_0 == lexicalValue1188_78_1))) {
        break lexical_join_110;
    }
    life5_116 = moom.MP.b(((moom.M7[])(moom.MP.a__ArrayM7())));
    life6_118 = life5_116;
    life7_121 = (life6_118).length;
    life8_123 = 0;
    lexical_cycle_91: while (true) {
    if (!((life8_123 < life7_121))) {
        break lexical_join_108;
    }
    life9_130 = (life6_118)[life8_123];
    ((moom.M7)(life9_130)).a__Void();
    this.C = ((boolean)(true));
    life8_123 += 1;
    if (!((life4_5 == null))) {
        break lexical_join_110;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_91; }
    break lexical_cycle_91;
    }
    }
    ((moom.hG)(this)).a();
    }
    spill1188_4 = ((moom.gc)(p0)).l;
    if (!((life4_5 == null))) {
        lexicalValue1188_124_0 = spill1188_4;
        break lexical_join_124;
    }
    lexicalValue1188_119_0 = spill1188_4;
    lexicalValue1188_119_1 = __sourceIntrinsic_60da6f6f15c0_invokedynamic1188_30(13467, (5573830256268869262L ^ life2_3));
    }
    if (!((lexicalValue1188_119_0 == lexicalValue1188_119_1))) {
        break lexical_join_135;
    }
    spill1188_5 = this;
    if (!((life4_5 == null))) {
        lexicalValue1188_131_0 = spill1188_5;
        break lexical_join_131;
    }
    lexicalValue1188_124_0 = ((((moom.hG)(spill1188_5)).C) ? 1 : 0);
    }
    if (!((lexicalValue1188_124_0 != 0))) {
        break lexical_join_130;
    }
    moom.MP.g();
    this.C = ((boolean)(false));
    moom.MP.m();
    }
    lexicalValue1188_131_0 = this;
    }
    ((net.minecraft.client.Minecraft)(((moom.hG)(lexicalValue1188_131_0)).i)).a(((net.minecraft.client.gui.GuiScreen)(this.w)));
    }
    return;
}


private void a() {
moom.gc lexicalValue1186_23_0;
    net.minecraft.entity.Entity[] spill1186_0;
    moom.gc spill1186_1;
    long life1_3;
    java.util.Iterator life4_8;
    net.minecraft.entity.Entity[] life3_9;
    moom.gc life5_16;
    moom.gx life6_30;
    moom.M7 life7_33;
    moom.M8 life8_44;
    lexical_join_48: {
    life1_3 = (moom.hG.D ^ 61807564724847L);
    spill1186_0 = net.minecraft.potion.Potion.b__Arrayr3();
    life4_8 = ((java.util.List)(this.m)).iterator();
    life3_9 = spill1186_0;
    lexical_cycle_10: while (true) {
    lexical_join_46: {
    lexical_join_44: {
    lexical_join_38: {
    lexical_join_23: {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break lexical_join_48;
    }
    life5_16 = ((moom.gc)(((java.util.Iterator)(life4_8)).next()));
    spill1186_1 = life5_16;
    if (!((life3_9 == null))) {
        lexicalValue1186_23_0 = spill1186_1;
        break lexical_join_23;
    }
    if (!((((spill1186_1 instanceof moom.gx) ? 1 : 0) != 0))) {
        break lexical_join_46;
    }
    lexicalValue1186_23_0 = life5_16;
    }
    life6_30 = ((moom.gx)(lexicalValue1186_23_0));
    life7_33 = ((moom.gx)(life6_30)).a__sourceReturn_f8ef67709a();
    if (!((life3_9 == null))) {
        break lexical_join_44;
    }
    if (!((((life7_33 instanceof moom.M8) ? 1 : 0) != 0))) {
        break lexical_join_38;
    }
    life8_44 = ((moom.M8)(life7_33));
    ((moom.M8)(life8_44)).d__sourceReturn_da8c82d5d4();
    }
    ((moom.gx)(life6_30)).k = ((java.lang.String)(moom.hG.a(((moom.M7)(life7_33)), ((int)(((moom.gx)(life6_30)).a())))));
    }
    ((moom.gx)(life6_30)).a__Void();
    }
    if (!((life3_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void a(int p0, int p1, float p2) {
moom.hG forwardValue3593_36_0;
    net.minecraft.entity.Entity[] spill3593_0;
    moom.hG spill3593_1;
    long life4_3;
    net.minecraft.entity.Entity[] life6_7;
    forward_join_55: {
    forward_join_36: {
    forward_join_35: {
    life4_3 = (moom.hG.D ^ 21067855426867L);
    spill3593_0 = net.minecraft.potion.Potion.b__Arrayr3();
    ((moom.hG)(this)).i();
    life6_7 = spill3593_0;
    spill3593_1 = this;
    if (!((life6_7 == null))) {
        forwardValue3593_36_0 = spill3593_1;
        break forward_join_36;
    }
    if (!((((moom.hG)(spill3593_1)).B != null))) {
        break forward_join_35;
    }
    ((moom.hG)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.B)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic3593_7(28178, (8163373954252877921L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic3593_8(27637, (8586405018285094282L ^ life4_3)))));
    if (!((life6_7 != null))) {
        break forward_join_55;
    }
    }
    forwardValue3593_36_0 = this;
    }
    ((moom.hG)(forwardValue3593_36_0)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.x)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic3593_13(2799, (2613460685367497879L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic3593_14(26165, (6465627394950608963L ^ life4_3)))));
    }
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    ((moom.LI)(this.z)).a(((int)(p0)), ((int)(p1)), ((java.util.List)(this.m)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill4168_0 = p0;
        life4_9 += 1;
        life5_44 = (spill4168_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill4168_1 = p0;
        life4_9 += 1;
        life5_76 = (spill4168_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill4168_2 = p0;
        life4_9 += 1;
        life5_91 = (spill4168_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1f65812e2ff6e198_originalDynamicSite2817_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d354c285adfcf929_originalDynamicSite662_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d354c285adfcf929_originalDynamicSite662_14(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic3593_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic3593_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic3593_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic3593_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7852_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_34d98f2c6fd2_invokedynamic1187_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_34d98f2c6fd2_invokedynamic1187_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_34d98f2c6fd2_invokedynamic1187_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_34d98f2c6fd2_invokedynamic1187_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_34d98f2c6fd2_invokedynamic1187_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_34d98f2c6fd2_invokedynamic1187_25(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic1188_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic1188_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic1188_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic14_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic14_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic14_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic14_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7850_0() throws E;
}
