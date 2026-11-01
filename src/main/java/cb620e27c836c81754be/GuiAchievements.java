package net.minecraft.client.gui.achievement;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiAchievements extends net.minecraft.client.gui.GuiScreen implements net.minecraft.client.gui.IProgressMeter {

private static int w;

private static int x;

private static int y;

private static int z;

private static moom.DD A;

protected net.minecraft.client.gui.GuiScreen B;

protected int C;

protected int D;

protected int E;

protected int F;

protected float G;

protected double H;

protected double I;

protected double J;

protected double K;

protected double L;

protected double M;

private int N;

private moom.B2 O;

private boolean P;

private static long Q;

private static long[] R;

private static java.lang.Integer[] S;

private static java.util.Map T;

private static long[] U;

private static java.lang.Long[] V;

private static java.util.Map W;

public GuiAchievements(net.minecraft.client.gui.GuiScreen p0, moom.B2 p1) { super(); }

private static void __sourceConstructorBody_982923e75d1f7e44(net.minecraft.client.gui.achievement.GuiAchievements receiver, net.minecraft.client.gui.GuiScreen p0, moom.B2 p1) throws Throwable {
net.minecraft.client.gui.achievement.GuiAchievements spill533_0;
    net.minecraft.client.gui.achievement.GuiAchievements spill533_1;
    double spill533_2;
    double spill533_3;
    net.minecraft.client.gui.achievement.GuiAchievements spill533_4;
    net.minecraft.client.gui.achievement.GuiAchievements spill533_5;
    double spill533_6;
    double spill533_7;
    long life3_3;
    int life5_37;
    int life6_43;
    life3_3 = (net.minecraft.client.gui.achievement.GuiAchievements.Q ^ 47472773711797L);
    net.minecraft.client.gui.achievement.GuiAchievements.__sourceConstructorInit_982923e75d1f7e44_0(((net.minecraft.client.gui.achievement.GuiAchievements)(receiver)));
    ((net.minecraft.client.gui.achievement.GuiAchievements)(receiver)).C = ((int)(__sourceIntrinsic_982923e75d1f7e44_invokedynamic533_2(21316, (3821525822224511116L ^ life3_3))));
    ((net.minecraft.client.gui.achievement.GuiAchievements)(receiver)).D = ((int)(__sourceIntrinsic_982923e75d1f7e44_invokedynamic533_4(4257, (482748282427372378L ^ life3_3))));
    ((net.minecraft.client.gui.achievement.GuiAchievements)(receiver)).G = ((float)(0x1.0p0f));
    ((net.minecraft.client.gui.achievement.GuiAchievements)(receiver)).P = ((boolean)(true));
    ((net.minecraft.client.gui.achievement.GuiAchievements)(receiver)).B = ((net.minecraft.client.gui.GuiScreen)(p0));
    ((net.minecraft.client.gui.achievement.GuiAchievements)(receiver)).O = ((moom.B2)(p1));
    life5_37 = __sourceIntrinsic_982923e75d1f7e44_invokedynamic533_10(24544, (4902673010632899594L ^ life3_3));
    life6_43 = __sourceIntrinsic_982923e75d1f7e44_invokedynamic533_11(15937, (4448179645666844074L ^ life3_3));
    spill533_0 = receiver;
    spill533_1 = receiver;
    net.minecraft.client.gui.achievement.GuiAchievements __stackOp533_16_0 = receiver;
    double __stackOp533_16_1 = ((double) (((((moom.BZ)(net.minecraft.stats.AchievementList.f)).n * __sourceIntrinsic_982923e75d1f7e44_invokedynamic533_14(20149, (766505125587103068L ^ life3_3))) - (life5_37 / 2)) - __sourceIntrinsic_982923e75d1f7e44_invokedynamic533_15(27017, (3923135023664826977L ^ life3_3))));
    spill533_2 = __stackOp533_16_1;
    ((net.minecraft.client.gui.achievement.GuiAchievements)(__stackOp533_16_0)).L = ((double)(__stackOp533_16_1));
    net.minecraft.client.gui.achievement.GuiAchievements __stackOp533_18_0 = spill533_1;
    double __stackOp533_18_1 = spill533_2;
    spill533_3 = __stackOp533_18_1;
    ((net.minecraft.client.gui.achievement.GuiAchievements)(__stackOp533_18_0)).J = ((double)(__stackOp533_18_1));
    ((net.minecraft.client.gui.achievement.GuiAchievements)(spill533_0)).H = ((double)(spill533_3));
    spill533_4 = receiver;
    spill533_5 = receiver;
    net.minecraft.client.gui.achievement.GuiAchievements __stackOp533_24_0 = receiver;
    double __stackOp533_24_1 = ((double) ((((moom.BZ)(net.minecraft.stats.AchievementList.f)).o * __sourceIntrinsic_982923e75d1f7e44_invokedynamic533_23(20149, (766505125587103068L ^ life3_3))) - (life6_43 / 2)));
    spill533_6 = __stackOp533_24_1;
    ((net.minecraft.client.gui.achievement.GuiAchievements)(__stackOp533_24_0)).M = ((double)(__stackOp533_24_1));
    net.minecraft.client.gui.achievement.GuiAchievements __stackOp533_26_0 = spill533_5;
    double __stackOp533_26_1 = spill533_6;
    spill533_7 = __stackOp533_26_1;
    ((net.minecraft.client.gui.achievement.GuiAchievements)(__stackOp533_26_0)).K = ((double)(__stackOp533_26_1));
    ((net.minecraft.client.gui.achievement.GuiAchievements)(spill533_4)).I = ((double)(spill533_7));
    return;
}


static {
Q = ((long)(((moom._a)(moom._c.a(((long)(5959989541574555238L)), ((long)(8481480360078006865L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(94170614358935L)))));
    long local22_life6 = (net.minecraft.client.gui.achievement.GuiAchievements.Q ^ 104291538597880L);
    T = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill1166_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1166_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1166_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1166_14 = new byte[8];
    (__sourceSpill1166_14)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill1166_14)[local12_life15] = ((byte) ((int) ((local22_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation1166_16 = __sourceSpill1166_14;
    ((javax.crypto.Cipher)(__sourceSpill1166_11)).init(((int)(__sourceSpill1166_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1166_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1166_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life19 = new long[71];
    int local14_life20 = 0;
    java.lang.String local15_life21;
    int local16_life23 = ((java.lang.String)((local15_life21 = "<Ä\"<yév±ÚØHll b?lÙ\000aÔ¶IÄò+àw¶\twIõzGµÑÏ`\006$Y¾sNZråÛìXþîT \0300 \016X\024WPRöhó«\037\032Âðzrî1`J0úJÚ7Õ6b½¶v¢\031qE?¾F´}ù6¶Mv`ç-£ü¤E®nyA\bv?öP\"\026HZª\035á|^Î³`J\rÝ\024\b\030[`8£ã¾^°þY¤ù·º²SôMðÅ³P\027ê\ti¹\013Ò°ªzKXiZ\026\0016·ë5ãu¥0¯Cô\006r§\000Idc\016roü±N¥N°úûí\t*¨>'Sà¹\025fKN\013\016\024þÅ.²'\004JëôýéiÄïñî;¯+®Íéÿe\001Þ=pÛ,8\031Ç%(Nì\002¾]\f\f×S èR¿G7OÎÌðõ¥SMhGß+\"êò#\000$á©Ñkx½91zu«ºG\021æ¨m\006/eÛóF×;\016¿3ZÔ\n3ÎI¤\177k\027\024L¡üügØ\024\003{\001l`´&8ÉKÏ\f$,¦*/¯YþÏH]\022}0s«²áµç\fR:,z)ØÕ\002éÐ\b ³æ%ûäÑ+ü)+Ùµøö3ùd68Ëá²8Á½ÇWä×\0207±åÂ¬HîDÔ\005ó'D\\6pE\tz}ûçÑÆ+¨rEÔÞ\031ï,§\031¬O\"¹qáw\032,\001\036\t1@ÅÔ»À¸ç±_\023Ïø\001<Ö¡¡êÐq)"))).length();
    int local13_life24 = 0;
    do {
        java.lang.String __sourceSpill1166_25 = local15_life21;
        int __sourceSpill1166_26 = local13_life24;
        local13_life24 += 8;
        byte[] local18_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1166_25)).substring(((int)(__sourceSpill1166_26)), ((int)(local13_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1166_30 = local17_life19;
        int __sourceSpill1166_31 = local14_life20;
        local14_life20 += 1;
        long local19_life32 = (((((((((((long) (local18_life29)[0]) & 255L) << 56) | ((((long) (local18_life29)[1]) & 255L) << 48)) | ((((long) (local18_life29)[2]) & 255L) << 40)) | ((((long) (local18_life29)[3]) & 255L) << 32)) | ((((long) (local18_life29)[4]) & 255L) << 24)) | ((((long) (local18_life29)[5]) & 255L) << 16)) | ((((long) (local18_life29)[6]) & 255L) << 8)) | (((long) (local18_life29)[7]) & 255L));
        byte[] __sourceSpill1166_33 = new byte[8];
        (__sourceSpill1166_33)[0] = ((byte) ((int) (local19_life32 >>> 56)));
        (__sourceSpill1166_33)[1] = ((byte) ((int) (local19_life32 >>> 48)));
        (__sourceSpill1166_33)[2] = ((byte) ((int) (local19_life32 >>> 40)));
        (__sourceSpill1166_33)[3] = ((byte) ((int) (local19_life32 >>> 32)));
        (__sourceSpill1166_33)[4] = ((byte) ((int) (local19_life32 >>> 24)));
        (__sourceSpill1166_33)[5] = ((byte) ((int) (local19_life32 >>> 16)));
        (__sourceSpill1166_33)[6] = ((byte) ((int) (local19_life32 >>> 8)));
        (__sourceSpill1166_33)[7] = ((byte) ((int) local19_life32));
        javax.crypto.Cipher __sourceSpill1166_34 = local11_life9;
        byte[] local21_life36 = ((javax.crypto.Cipher)(__sourceSpill1166_34)).doFinal(((byte[])(__sourceSpill1166_33)));
        (__sourceSpill1166_30)[__sourceSpill1166_31] = (((((((((((long) (local21_life36)[0]) & 255L) << 56) | ((((long) (local21_life36)[1]) & 255L) << 48)) | ((((long) (local21_life36)[2]) & 255L) << 40)) | ((((long) (local21_life36)[3]) & 255L) << 32)) | ((((long) (local21_life36)[4]) & 255L) << 24)) | ((((long) (local21_life36)[5]) & 255L) << 16)) | ((((long) (local21_life36)[6]) & 255L) << 8)) | (((long) (local21_life36)[7]) & 255L));
    } while ((!(local13_life24 >= local16_life23)));
    local16_life23 = ((java.lang.String)((local15_life21 = "ó!`Ò»43cÚÝ\007X©"))).length();
    local13_life24 = 0;
    do {
        java.lang.String __sourceSpill1166_38 = local15_life21;
        int __sourceSpill1166_39 = local13_life24;
        local13_life24 += 8;
        byte[] local18_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1166_38)).substring(((int)(__sourceSpill1166_39)), ((int)(local13_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1166_43 = local17_life19;
        int __sourceSpill1166_44 = local14_life20;
        local14_life20 += 1;
        long local19_life45 = (((((((((((long) (local18_life42)[0]) & 255L) << 56) | ((((long) (local18_life42)[1]) & 255L) << 48)) | ((((long) (local18_life42)[2]) & 255L) << 40)) | ((((long) (local18_life42)[3]) & 255L) << 32)) | ((((long) (local18_life42)[4]) & 255L) << 24)) | ((((long) (local18_life42)[5]) & 255L) << 16)) | ((((long) (local18_life42)[6]) & 255L) << 8)) | (((long) (local18_life42)[7]) & 255L));
        byte[] __sourceSpill1166_46 = new byte[8];
        (__sourceSpill1166_46)[0] = ((byte) ((int) (local19_life45 >>> 56)));
        (__sourceSpill1166_46)[1] = ((byte) ((int) (local19_life45 >>> 48)));
        (__sourceSpill1166_46)[2] = ((byte) ((int) (local19_life45 >>> 40)));
        (__sourceSpill1166_46)[3] = ((byte) ((int) (local19_life45 >>> 32)));
        (__sourceSpill1166_46)[4] = ((byte) ((int) (local19_life45 >>> 24)));
        (__sourceSpill1166_46)[5] = ((byte) ((int) (local19_life45 >>> 16)));
        (__sourceSpill1166_46)[6] = ((byte) ((int) (local19_life45 >>> 8)));
        (__sourceSpill1166_46)[7] = ((byte) ((int) local19_life45));
        javax.crypto.Cipher __sourceSpill1166_47 = local11_life9;
        byte[] local21_life49 = ((javax.crypto.Cipher)(__sourceSpill1166_47)).doFinal(((byte[])(__sourceSpill1166_46)));
        (__sourceSpill1166_43)[__sourceSpill1166_44] = (((((((((((long) (local21_life49)[0]) & 255L) << 56) | ((((long) (local21_life49)[1]) & 255L) << 48)) | ((((long) (local21_life49)[2]) & 255L) << 40)) | ((((long) (local21_life49)[3]) & 255L) << 32)) | ((((long) (local21_life49)[4]) & 255L) << 24)) | ((((long) (local21_life49)[5]) & 255L) << 16)) | ((((long) (local21_life49)[6]) & 255L) << 8)) | (((long) (local21_life49)[7]) & 255L));
    } while ((!(local13_life24 >= local16_life23)));
    R = ((long[])(local17_life19));
    S = ((java.lang.Integer[])(new java.lang.Integer[71]));
    W = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill1166_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1166_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1166_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1166_59 = new byte[8];
    (__sourceSpill1166_59)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill1166_59)[local1_life60] = ((byte) ((int) ((local22_life6 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation1166_61 = __sourceSpill1166_59;
    ((javax.crypto.Cipher)(__sourceSpill1166_56)).init(((int)(__sourceSpill1166_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1166_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1166_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "s~Ì-@}wð\036gÒ4\0051\024"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1166_70 = local4_life66;
        int __sourceSpill1166_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill1166_70)).substring(((int)(__sourceSpill1166_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1166_75 = local6_life64;
        int __sourceSpill1166_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill1166_78 = new byte[8];
        (__sourceSpill1166_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill1166_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill1166_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill1166_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill1166_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill1166_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill1166_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill1166_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill1166_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill1166_79)).doFinal(((byte[])(__sourceSpill1166_78)));
        (__sourceSpill1166_75)[__sourceSpill1166_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    U = ((long[])(local6_life64));
    V = ((java.lang.Long[])(new java.lang.Long[2]));
    w = ((int)(((net.minecraft.stats.AchievementList.a * __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_85(20149, (766554968008072465L ^ local22_life6))) - __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_86(6483, (8304761073649535700L ^ local22_life6)))));
    x = ((int)(((net.minecraft.stats.AchievementList.b * __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_89(20149, (766554968008072465L ^ local22_life6))) - __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_90(29354, (5567899062220038429L ^ local22_life6)))));
    y = ((int)(((net.minecraft.stats.AchievementList.c * __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_93(20149, (766554968008072465L ^ local22_life6))) - __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_94(3733, (4243917409749196063L ^ local22_life6)))));
    z = ((int)(((net.minecraft.stats.AchievementList.d * __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_97(20149, (766554968008072465L ^ local22_life6))) - __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_98(7677, (2549528790195195477L ^ local22_life6)))));
    A = ((moom.DD)(new moom.DD("textures/gui/achievement/achievement_background.png")));
}

private static native <E extends Throwable> void __sourceConstructorInit_982923e75d1f7e44_0(net.minecraft.client.gui.achievement.GuiAchievements a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_44098c0f68c28de20590(net.minecraft.client.gui.achievement.GuiAchievements a0, char a1, int a2) throws E;
private static final class __SourceHandler_44098c0f68c28de20590 {

public static void f2328(net.minecraft.client.gui.achievement.GuiAchievements receiver, char p0, int p1) throws Throwable {
    if ((p1 == __call2328_3(__fieldRead2328_2(__fieldRead2328_1(__fieldRead2328_0(receiver)))))) {
        __call2328_5(__fieldRead2328_4(receiver), null);
        __call2328_7(__fieldRead2328_6(receiver));
    } else {
        __call2328_8(receiver, p0, p1);
    }
    return;
}
public static void h2328_0(java.io.IOException p0) throws Throwable {
    throw __call1232800_0(p0);
}
private static native net.minecraft.client.Minecraft __fieldRead2328_0(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2328_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead2328_2(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call2328_3(moom.pz a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2328_4(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __call2328_5(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2328_6(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __call2328_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2328_8(net.minecraft.client.gui.achievement.GuiAchievements a0, char a1, int a2) throws Throwable;
private static native java.lang.Exception __call1232800_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_21b9523db491afe32202(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_21b9523db491afe32202 {

public static void f568(net.minecraft.client.gui.achievement.GuiAchievements receiver, int p0, int p1, float p2) throws Throwable {
    net.minecraft.client.gui.achievement.GuiAchievements spill568_0;
    double spill568_1;
    net.minecraft.client.gui.achievement.GuiAchievements spill568_2;
    double spill568_3;
    net.minecraft.client.gui.achievement.GuiAchievements spill568_4;
    double spill568_5;
    net.minecraft.client.gui.achievement.GuiAchievements spill568_6;
    double spill568_7;
    long life4_3;
    int life6_78;
    int life7_86;
    int life8_94;
    int life9_102;
    int life6_200;
    float life7_203;
    float life8_238;
    float life9_244;
    float life10_250;
    float life11_257;
    float life12_264;
    forest_join_351: {
    forest_join_338: {
    forest_join_326: {
    forest_join_314: {
    forest_join_304: {
    forest_join_294: {
    forest_join_215: {
    forest_join_207: {
    forest_join_193: {
    forest_join_190: {
    forest_join_189: {
    forest_join_183: {
    forest_join_141: {
    forest_join_110: {
    forest_join_68: {
    life4_3 = (__fieldRead568_0() ^ 72222900235097L);
    if (!(__fieldRead568_1(receiver))) {
        break forest_join_68;
    }
    __call568_2(receiver);
    __call568_8(receiver, __fieldRead568_3(receiver), __call568_4("multiplayer.downloadingStats", new java.lang.Object[0]), (__fieldRead568_5(receiver) / 2), (__fieldRead568_6(receiver) / 2), __invokedynamic568_7(30894, (1559183225328039833L ^ life4_3)));
    __call568_19(receiver, __fieldRead568_9(receiver), (__fieldRead568_10())[((int) ((__call568_11() / __invokedynamic568_12(2984, (4507870995043280915L ^ life4_3))) % ((long) (__fieldRead568_13()).length)))], (__fieldRead568_14(receiver) / 2), ((__fieldRead568_15(receiver) / 2) + (__fieldRead568_17(__fieldRead568_16(receiver)) * 2)), __invokedynamic568_18(549, (1974895771878198590L ^ life4_3)));
    break forest_join_351;
    }
    if (!(__call568_20(0))) {
        break forest_join_190;
    }
    life6_78 = ((__fieldRead568_21(receiver) - __fieldRead568_22(receiver)) / 2);
    life7_86 = ((__fieldRead568_23(receiver) - __fieldRead568_24(receiver)) / 2);
    life8_94 = (life6_78 + __invokedynamic568_25(19468, (1590925379432334145L ^ life4_3)));
    life9_102 = (life7_86 + __invokedynamic568_26(22847, (1631506093327373875L ^ life4_3)));
    if (!((__fieldRead568_27(receiver) != 0))) {
        break forest_join_110;
    }
    if (!((__fieldRead568_28(receiver) == 1))) {
        break forest_join_189;
    }
    }
    if (!((p0 >= life8_94))) {
        break forest_join_189;
    }
    if (!((p0 < (life8_94 + __invokedynamic568_29(5424, (7057060043914877482L ^ life4_3)))))) {
        break forest_join_189;
    }
    if (!((p1 >= life9_102))) {
        break forest_join_189;
    }
    if (!((p1 < (life9_102 + __invokedynamic568_30(19186, (3071411526482085325L ^ life4_3)))))) {
        break forest_join_189;
    }
    if (!((__fieldRead568_31(receiver) == 0))) {
        break forest_join_141;
    }
    __fieldWrite568_32(receiver, 1);
    break forest_join_183;
    }
    net.minecraft.client.gui.achievement.GuiAchievements __stackOp568_33_0 = receiver;
    __fieldWrite568_37(__stackOp568_33_0, (__fieldRead568_34(__stackOp568_33_0) - ((double) (((float) (p0 - __fieldRead568_35(receiver))) * __fieldRead568_36(receiver)))));
    net.minecraft.client.gui.achievement.GuiAchievements __stackOp568_38_0 = receiver;
    __fieldWrite568_42(__stackOp568_38_0, (__fieldRead568_39(__stackOp568_38_0) - ((double) (((float) (p1 - __fieldRead568_40(receiver))) * __fieldRead568_41(receiver)))));
    spill568_0 = receiver;
    net.minecraft.client.gui.achievement.GuiAchievements __stackOp568_44_0 = receiver;
    double __stackOp568_44_1 = __fieldRead568_43(receiver);
    spill568_1 = __stackOp568_44_1;
    __fieldWrite568_45(__stackOp568_44_0, __stackOp568_44_1);
    __fieldWrite568_46(spill568_0, spill568_1);
    spill568_2 = receiver;
    net.minecraft.client.gui.achievement.GuiAchievements __stackOp568_48_0 = receiver;
    double __stackOp568_48_1 = __fieldRead568_47(receiver);
    spill568_3 = __stackOp568_48_1;
    __fieldWrite568_49(__stackOp568_48_0, __stackOp568_48_1);
    __fieldWrite568_50(spill568_2, spill568_3);
    }
    __fieldWrite568_51(receiver, p0);
    __fieldWrite568_52(receiver, p1);
    }
    break forest_join_193;
    }
    __fieldWrite568_53(receiver, 0);
    }
    life6_200 = __call568_54();
    life7_203 = __fieldRead568_55(receiver);
    if (!((life6_200 < 0))) {
        break forest_join_207;
    }
    net.minecraft.client.gui.achievement.GuiAchievements __stackOp568_56_0 = receiver;
    __fieldWrite568_58(__stackOp568_56_0, (__fieldRead568_57(__stackOp568_56_0) + 0x1.0p-2f));
    break forest_join_215;
    }
    if (!((life6_200 > 0))) {
        break forest_join_215;
    }
    net.minecraft.client.gui.achievement.GuiAchievements __stackOp568_59_0 = receiver;
    __fieldWrite568_61(__stackOp568_59_0, (__fieldRead568_60(__stackOp568_59_0) - 0x1.0p-2f));
    }
    __fieldWrite568_64(receiver, __call568_63(__fieldRead568_62(receiver), 0x1.0p0f, 0x1.0p1f));
    if (!((__numericCompare568_66(__fieldRead568_65(receiver), life7_203) != 0))) {
        break forest_join_294;
    }
    life8_238 = (life7_203 - __fieldRead568_67(receiver));
    life9_244 = (life7_203 * ((float) __fieldRead568_68(receiver)));
    life10_250 = (life7_203 * ((float) __fieldRead568_69(receiver)));
    life11_257 = (__fieldRead568_70(receiver) * ((float) __fieldRead568_71(receiver)));
    life12_264 = (__fieldRead568_72(receiver) * ((float) __fieldRead568_73(receiver)));
    net.minecraft.client.gui.achievement.GuiAchievements __stackOp568_74_0 = receiver;
    __fieldWrite568_76(__stackOp568_74_0, (__fieldRead568_75(__stackOp568_74_0) - ((double) ((life11_257 - life9_244) * 0x1.0p-1f))));
    net.minecraft.client.gui.achievement.GuiAchievements __stackOp568_77_0 = receiver;
    __fieldWrite568_79(__stackOp568_77_0, (__fieldRead568_78(__stackOp568_77_0) - ((double) ((life12_264 - life10_250) * 0x1.0p-1f))));
    spill568_4 = receiver;
    net.minecraft.client.gui.achievement.GuiAchievements __stackOp568_81_0 = receiver;
    double __stackOp568_81_1 = __fieldRead568_80(receiver);
    spill568_5 = __stackOp568_81_1;
    __fieldWrite568_82(__stackOp568_81_0, __stackOp568_81_1);
    __fieldWrite568_83(spill568_4, spill568_5);
    spill568_6 = receiver;
    net.minecraft.client.gui.achievement.GuiAchievements __stackOp568_85_0 = receiver;
    double __stackOp568_85_1 = __fieldRead568_84(receiver);
    spill568_7 = __stackOp568_85_1;
    __fieldWrite568_86(__stackOp568_85_0, __stackOp568_85_1);
    __fieldWrite568_87(spill568_6, spill568_7);
    }
    if (!((__numericCompare568_90(__fieldRead568_88(receiver), ((double) __fieldRead568_89())) < 0))) {
        break forest_join_304;
    }
    __fieldWrite568_92(receiver, ((double) __fieldRead568_91()));
    }
    if (!((__numericCompare568_95(__fieldRead568_93(receiver), ((double) __fieldRead568_94())) < 0))) {
        break forest_join_314;
    }
    __fieldWrite568_97(receiver, ((double) __fieldRead568_96()));
    }
    if (!((__numericCompare568_100(__fieldRead568_98(receiver), ((double) __fieldRead568_99())) >= 0))) {
        break forest_join_326;
    }
    __fieldWrite568_102(receiver, ((double) (__fieldRead568_101() - 1)));
    }
    if (!((__numericCompare568_105(__fieldRead568_103(receiver), ((double) __fieldRead568_104())) >= 0))) {
        break forest_join_338;
    }
    __fieldWrite568_107(receiver, ((double) (__fieldRead568_106() - 1)));
    }
    __call568_108(receiver);
    __call568_109(receiver, p0, p1, p2);
    __call568_110();
    __call568_111();
    __call568_112(receiver);
    __call568_113();
    __call568_114();
    }
    return;
}
public static void h568_0(moom.Oo p0) throws Throwable {
    throw __call3056800_0(p0);
}
public static void h568_1(moom.Oo p0) throws Throwable {
    throw __call3056801_0(p0);
}
public static void h568_2(moom.Oo p0) throws Throwable {
    throw __call3056802_0(p0);
}
public static void h568_3(moom.Oo p0) throws Throwable {
    throw __call3056803_0(p0);
}
public static void h568_4(moom.Oo p0) throws Throwable {
    throw __call3056804_0(p0);
}
public static void h568_5(moom.Oo p0) throws Throwable {
    throw __call3056805_0(p0);
}
public static void h568_6(moom.Oo p0) throws Throwable {
    throw __call3056806_0(p0);
}
public static void h568_7(moom.Oo p0) throws Throwable {
    throw __call3056807_0(p0);
}
public static void h568_8(moom.Oo p0) throws Throwable {
    throw __call3056808_0(p0);
}
public static void h568_9(moom.Oo p0) throws Throwable {
    throw __call3056809_0(p0);
}
public static void h568_10(moom.Oo p0) throws Throwable {
    throw __call3056810_0(p0);
}
public static void h568_11(moom.Oo p0) throws Throwable {
    throw __call3056811_0(p0);
}
public static void h568_12(moom.Oo p0) throws Throwable {
    throw __call3056812_0(p0);
}
public static void h568_13(moom.Oo p0) throws Throwable {
    throw __call3056813_0(p0);
}
private static native long __fieldRead568_0() throws Throwable;
private static native boolean __fieldRead568_1(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __call568_2(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead568_3(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native java.lang.String __call568_4(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __fieldRead568_5(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_6(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __invokedynamic568_7(int a0, long a1) throws Throwable;
private static native void __call568_8(net.minecraft.client.gui.achievement.GuiAchievements a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead568_9(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native java.lang.String[] __fieldRead568_10() throws Throwable;
private static native long __call568_11() throws Throwable;
private static native long __invokedynamic568_12(int a0, long a1) throws Throwable;
private static native java.lang.String[] __fieldRead568_13() throws Throwable;
private static native int __fieldRead568_14(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_15(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead568_16(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_17(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __invokedynamic568_18(int a0, long a1) throws Throwable;
private static native void __call568_19(net.minecraft.client.gui.achievement.GuiAchievements a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native boolean __call568_20(int a0) throws Throwable;
private static native int __fieldRead568_21(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_22(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_23(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_24(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __invokedynamic568_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic568_26(int a0, long a1) throws Throwable;
private static native int __fieldRead568_27(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_28(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __invokedynamic568_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic568_30(int a0, long a1) throws Throwable;
private static native int __fieldRead568_31(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite568_32(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1) throws Throwable;
private static native double __fieldRead568_34(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_35(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native float __fieldRead568_36(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite568_37(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead568_39(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_40(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native float __fieldRead568_41(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite568_42(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead568_43(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite568_45(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native void __fieldWrite568_46(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead568_47(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite568_49(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native void __fieldWrite568_50(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native void __fieldWrite568_51(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1) throws Throwable;
private static native void __fieldWrite568_52(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1) throws Throwable;
private static native void __fieldWrite568_53(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1) throws Throwable;
private static native int __call568_54() throws Throwable;
private static native float __fieldRead568_55(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native float __fieldRead568_57(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite568_58(net.minecraft.client.gui.achievement.GuiAchievements a0, float a1) throws Throwable;
private static native float __fieldRead568_60(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite568_61(net.minecraft.client.gui.achievement.GuiAchievements a0, float a1) throws Throwable;
private static native float __fieldRead568_62(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native float __call568_63(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite568_64(net.minecraft.client.gui.achievement.GuiAchievements a0, float a1) throws Throwable;
private static native float __fieldRead568_65(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __numericCompare568_66(float a0, float a1) throws Throwable;
private static native float __fieldRead568_67(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_68(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_69(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native float __fieldRead568_70(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_71(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native float __fieldRead568_72(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_73(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native double __fieldRead568_75(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite568_76(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead568_78(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite568_79(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead568_80(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite568_82(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native void __fieldWrite568_83(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead568_84(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite568_86(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native void __fieldWrite568_87(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead568_88(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_89() throws Throwable;
private static native int __numericCompare568_90(double a0, double a1) throws Throwable;
private static native int __fieldRead568_91() throws Throwable;
private static native void __fieldWrite568_92(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead568_93(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_94() throws Throwable;
private static native int __numericCompare568_95(double a0, double a1) throws Throwable;
private static native int __fieldRead568_96() throws Throwable;
private static native void __fieldWrite568_97(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead568_98(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_99() throws Throwable;
private static native int __numericCompare568_100(double a0, double a1) throws Throwable;
private static native int __fieldRead568_101() throws Throwable;
private static native void __fieldWrite568_102(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead568_103(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead568_104() throws Throwable;
private static native int __numericCompare568_105(double a0, double a1) throws Throwable;
private static native int __fieldRead568_106() throws Throwable;
private static native void __fieldWrite568_107(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native void __call568_108(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __call568_109(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, float a3) throws Throwable;
private static native void __call568_110() throws Throwable;
private static native void __call568_111() throws Throwable;
private static native void __call568_112(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __call568_113() throws Throwable;
private static native void __call568_114() throws Throwable;
private static native java.lang.Exception __call3056800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3056801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3056802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3056803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3056804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3056805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3056806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3056807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3056808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3056809_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3056810_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3056811_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3056812_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3056813_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_1e38e776989400c5d4c3(net.minecraft.client.gui.achievement.GuiAchievements a0) throws E;
private static final class __SourceHandler_1e38e776989400c5d4c3 {

public static boolean f2330(net.minecraft.client.gui.achievement.GuiAchievements receiver) throws Throwable {
    return ((!__fieldRead2330_0(receiver)) ? true : false);
}
public static void h2330_0(moom.Oo p0) throws Throwable {
    throw __call1233000_0(p0);
}
private static native boolean __fieldRead2330_0(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native java.lang.Exception __call1233000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6fe9feb371e5b2f7f17b(net.minecraft.client.gui.achievement.GuiAchievements a0, moom.gc a1) throws E;
private static final class __SourceHandler_6fe9feb371e5b2f7f17b {

public static void f2331(net.minecraft.client.gui.achievement.GuiAchievements receiver, moom.gc p0) throws Throwable {
    if ((!__fieldRead2331_0(receiver))) {
        if ((__fieldRead2331_1(p0) == 1)) {
        __call2331_4(__fieldRead2331_2(receiver), __fieldRead2331_3(receiver));
    }
    }
    return;
}
public static void h2331_0(java.io.IOException p0) throws Throwable {
    throw __call1233100_0(p0);
}
public static void h2331_1(java.io.IOException p0) throws Throwable {
    throw __call1233101_0(p0);
}
private static native boolean __fieldRead2331_0(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead2331_1(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2331_2(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead2331_3(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __call2331_4(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native java.lang.Exception __call1233100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1233101_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_43f92a456194f721c549(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_43f92a456194f721c549 {

public static void f159(net.minecraft.client.gui.achievement.GuiAchievements receiver, int p0, int p1, float p2) throws Throwable {
    net.minecraft.client.gui.FontRenderer lexicalValue159_1390_0;
    java.lang.String lexicalValue159_1390_1;
    float lexicalValue159_1390_2;
    float lexicalValue159_1390_3;
    net.minecraft.client.gui.FontRenderer lexicalValue159_1392_0;
    java.lang.String lexicalValue159_1392_1;
    float lexicalValue159_1392_2;
    float lexicalValue159_1392_3;
    net.minecraft.client.gui.FontRenderer lexicalValue159_1401_0;
    java.lang.String lexicalValue159_1401_1;
    float lexicalValue159_1401_2;
    float lexicalValue159_1401_3;
    net.minecraft.client.gui.FontRenderer lexicalValue159_1406_0;
    java.lang.String lexicalValue159_1406_1;
    float lexicalValue159_1406_2;
    float lexicalValue159_1406_3;
    int lexicalValue159_1406_4;
    int spill159_0;
    int spill159_1;
    int spill159_2;
    long spill159_3;
    int spill159_4;
    long spill159_5;
    net.minecraft.client.gui.FontRenderer spill159_6;
    java.lang.String spill159_7;
    float spill159_8;
    float spill159_9;
    long life4_3;
    int life6_16;
    int life7_29;
    int life8_61;
    int life9_69;
    int life10_77;
    int life11_85;
    int life12_125;
    int life13_135;
    int life14_149;
    int life15_163;
    int life16_166;
    int life17_171;
    int life18_177;
    int life19_183;
    int life20_189;
    java.util.Random life21_193;
    float life22_198;
    float life23_203;
    int life24_205;
    float life25_226;
    int life26_233;
    int life27_280;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life28_284;
    net.minecraft.block.Block life29_371;
    int life24_429;
    moom.BZ life25_438;
    int life26_458;
    int life27_475;
    int life28_493;
    int life29_511;
    int life30_516;
    int life31_521;
    int life32_526;
    int life33_535;
    moom.BZ life24_732;
    float life25_740;
    float life26_748;
    int life27_754;
    moom.BZ life28_763;
    int life29_774;
    int life30_785;
    int life31_829;
    float life32_836;
    float life32_849;
    float life32_860;
    float life32_871;
    float life32_885;
    float life32_960;
    java.lang.String life27_1101;
    java.lang.String life28_1104;
    int life29_1112;
    int life30_1116;
    int life31_1121;
    int life32_1137;
    int life33_1143;
    int life32_1253;
    java.lang.String life33_1267;
    int life34_1273;
    int life32_1340;
    java.lang.String life33_1354;
    int life34_1360;
    lexical_join_1408: {
    lexical_join_1406: {
    lexical_join_1401: {
    lexical_join_1392: {
    lexical_join_1390: {
    lexical_join_1367: {
    lexical_join_1365: {
    lexical_join_1278: {
    lexical_join_1186: {
    lexical_join_1185: {
    lexical_join_1107: {
    lexical_join_1014: {
    lexical_join_713: {
    lexical_join_407: {
    lexical_join_54: {
    lexical_join_47: {
    lexical_join_40: {
    lexical_join_35: {
    life4_3 = (__fieldRead159_0() ^ 113860204975811L);
    life6_16 = __call159_4((__fieldRead159_1(receiver) + ((__fieldRead159_2(receiver) - __fieldRead159_3(receiver)) * ((double) p2))));
    life7_29 = __call159_8((__fieldRead159_5(receiver) + ((__fieldRead159_6(receiver) - __fieldRead159_7(receiver)) * ((double) p2))));
    if (!((life6_16 < __fieldRead159_9()))) {
        break lexical_join_35;
    }
    life6_16 = __fieldRead159_10();
    }
    if (!((life7_29 < __fieldRead159_11()))) {
        break lexical_join_40;
    }
    life7_29 = __fieldRead159_12();
    }
    if (!((life6_16 >= __fieldRead159_13()))) {
        break lexical_join_47;
    }
    life6_16 = (__fieldRead159_14() - 1);
    }
    if (!((life7_29 >= __fieldRead159_15()))) {
        break lexical_join_54;
    }
    life7_29 = (__fieldRead159_16() - 1);
    }
    life8_61 = ((__fieldRead159_17(receiver) - __fieldRead159_18(receiver)) / 2);
    life9_69 = ((__fieldRead159_19(receiver) - __fieldRead159_20(receiver)) / 2);
    life10_77 = (life8_61 + __invokedynamic159_21(18197, (2322053287953184179L ^ life4_3)));
    life11_85 = (life9_69 + __invokedynamic159_22(5562, (5965957997874997005L ^ life4_3)));
    spill159_0 = 27145;
    __fieldWrite159_23(receiver, 0x0.0p0f);
    __call159_25(__invokedynamic159_24(spill159_0, (1674722516275796128L ^ life4_3)));
    __call159_26();
    __call159_27(((float) life10_77), ((float) life11_85), -0x1.9p7f);
    __call159_30((0x1.0p0f / __fieldRead159_28(receiver)), (0x1.0p0f / __fieldRead159_29(receiver)), 0x0.0p0f);
    __call159_31();
    __call159_32();
    __call159_33();
    __call159_34();
    life12_125 = ((life6_16 + __invokedynamic159_35(26265, (3307867833285350414L ^ life4_3))) >> 4);
    life13_135 = ((life7_29 + __invokedynamic159_36(29390, (6328002403753099375L ^ life4_3))) >> 4);
    life14_149 = ((life6_16 + __invokedynamic159_37(29390, (6328002403753099375L ^ life4_3))) % __invokedynamic159_38(2183, (2623490342281738754L ^ life4_3)));
    life15_163 = ((life7_29 + __invokedynamic159_39(29390, (6328002403753099375L ^ life4_3))) % __invokedynamic159_40(2183, (2623490342281738754L ^ life4_3)));
    spill159_1 = 24664;
    life16_166 = 4;
    life17_171 = __invokedynamic159_41(spill159_1, (7855353974249329400L ^ life4_3));
    life18_177 = __invokedynamic159_42(19828, (3155029603113582574L ^ life4_3));
    life19_183 = __invokedynamic159_43(17613, (4427259923848574587L ^ life4_3));
    life20_189 = __invokedynamic159_44(20118, (2384397174547954754L ^ life4_3));
    life21_193 = new java.util.Random();
    life22_198 = (0x1.0p4f / __fieldRead159_45(receiver));
    life23_203 = (0x1.0p4f / __fieldRead159_46(receiver));
    life24_205 = 0;
    lexical_cycle_206: while (true) {
    lexical_join_405: {
    if (!((__numericCompare159_47(((((float) life24_205) * life22_198) - ((float) life15_163)), 0x1.36p7f) < 0))) {
        break lexical_join_407;
    }
    life25_226 = (0x1.333334p-1f - ((((float) (life13_135 + life24_205)) / 0x1.9p4f) * 0x1.333334p-2f));
    __call159_48(life25_226, life25_226, life25_226, 0x1.0p0f);
    life26_233 = 0;
    lexical_cycle_234: while (true) {
    lexical_join_367: {
    lexical_join_361: {
    lexical_join_354: {
    lexical_join_346: {
    lexical_join_334: {
    lexical_join_322: {
    lexical_join_317: {
    if (!((__numericCompare159_49(((((float) life26_233) * life23_203) - ((float) life14_149)), 0x1.cp7f) < 0))) {
        break lexical_join_405;
    }
    __call159_55(life21_193, (((long) ((__call159_53(__call159_52(__call159_51(__fieldRead159_50(receiver)))) + life12_125) + life26_233)) + (((long) (life13_135 + life24_205)) * __invokedynamic159_54(1705, (1627678861728651401L ^ life4_3)))));
    life27_280 = (__call159_56(life21_193, ((1 + life13_135) + life24_205)) + ((life13_135 + life24_205) / 2));
    life28_284 = __call159_58(receiver, __fieldRead159_57());
    if (!((life27_280 <= __invokedynamic159_59(16004, (5461135444583435281L ^ life4_3))))) {
        break lexical_join_361;
    }
    if (!(((life13_135 + life24_205) != __invokedynamic159_60(26048, (8311588337343305594L ^ life4_3))))) {
        break lexical_join_361;
    }
    if (!((life27_280 == __invokedynamic159_61(30068, (7963308554044049376L ^ life4_3))))) {
        break lexical_join_322;
    }
    if (!((__call159_62(life21_193, 2) == 0))) {
        break lexical_join_317;
    }
    life28_284 = __call159_64(receiver, __fieldRead159_63());
    break lexical_join_367;
    }
    life28_284 = __call159_66(receiver, __fieldRead159_65());
    break lexical_join_367;
    }
    if (!((life27_280 == __invokedynamic159_67(6469, (6675853187009964994L ^ life4_3))))) {
        break lexical_join_334;
    }
    life28_284 = __call159_69(receiver, __fieldRead159_68());
    break lexical_join_367;
    }
    if (!((life27_280 == __invokedynamic159_70(19468, (1590962631550025435L ^ life4_3))))) {
        break lexical_join_346;
    }
    life28_284 = __call159_72(receiver, __fieldRead159_71());
    break lexical_join_367;
    }
    if (!((life27_280 > 4))) {
        break lexical_join_354;
    }
    life28_284 = __call159_74(receiver, __fieldRead159_73());
    break lexical_join_367;
    }
    if (!((life27_280 > 0))) {
        break lexical_join_367;
    }
    life28_284 = __call159_76(receiver, __fieldRead159_75());
    break lexical_join_367;
    }
    life29_371 = __fieldRead159_77();
    life28_284 = __call159_78(receiver, life29_371);
    }
    __call159_82(__call159_80(__fieldRead159_79(receiver)), __fieldRead159_81());
    __call159_87(receiver, ((life26_233 * __invokedynamic159_83(2183, (2623490342281738754L ^ life4_3))) - life14_149), ((life24_205 * __invokedynamic159_84(2183, (2623490342281738754L ^ life4_3))) - life15_163), life28_284, __invokedynamic159_85(2183, (2623490342281738754L ^ life4_3)), __invokedynamic159_86(2183, (2623490342281738754L ^ life4_3)));
    life26_233 += 1;
    continue lexical_cycle_234;
    }
    }
    life24_205 += 1;
    continue lexical_cycle_206;
    }
    }
    __call159_88();
    __call159_90(__invokedynamic159_89(1065, (3151996410968405666L ^ life4_3)));
    __call159_94(__call159_92(__fieldRead159_91(receiver)), __fieldRead159_93());
    life24_429 = 0;
    lexical_cycle_421: while (true) {
    lexical_join_711: {
    lexical_join_676: {
    lexical_join_634: {
    lexical_join_598: {
    lexical_join_544: {
    lexical_join_536: {
    if (!((life24_429 < __call159_96(__fieldRead159_95())))) {
        break lexical_join_713;
    }
    life25_438 = __cast159_99(__call159_98(__fieldRead159_97(), life24_429));
    if (!((__fieldRead159_100(life25_438) != null))) {
        break lexical_join_711;
    }
    life26_458 = (((__fieldRead159_101(life25_438) * __invokedynamic159_102(683, (940469300460712058L ^ life4_3))) - life6_16) + __invokedynamic159_103(31289, (4648617802606413986L ^ life4_3)));
    life27_475 = (((__fieldRead159_104(life25_438) * __invokedynamic159_105(20149, (766562992633461802L ^ life4_3))) - life7_29) + __invokedynamic159_106(9133, (8296388149926514958L ^ life4_3)));
    life28_493 = (((__fieldRead159_108(__fieldRead159_107(life25_438)) * __invokedynamic159_109(20149, (766562992633461802L ^ life4_3))) - life6_16) + __invokedynamic159_110(9133, (8296388149926514958L ^ life4_3)));
    life29_511 = (((__fieldRead159_112(__fieldRead159_111(life25_438)) * __invokedynamic159_113(20149, (766562992633461802L ^ life4_3))) - life7_29) + __invokedynamic159_114(9133, (8296388149926514958L ^ life4_3)));
    life30_516 = __integerCategory159_117(__call159_116(__fieldRead159_115(receiver), life25_438));
    life31_521 = __integerCategory159_120(__call159_119(__fieldRead159_118(receiver), life25_438));
    life32_526 = __call159_122(__fieldRead159_121(receiver), life25_438);
    if (!((life32_526 <= 4))) {
        break lexical_join_711;
    }
    life33_535 = __invokedynamic159_123(11980, (2214461461417778279L ^ life4_3));
    if (!((life30_516 != 0))) {
        break lexical_join_536;
    }
    life33_535 = __invokedynamic159_124(10876, (9036399620498938031L ^ life4_3));
    break lexical_join_544;
    }
    if (!((life31_521 != 0))) {
        break lexical_join_544;
    }
    life33_535 = __invokedynamic159_125(6146, (1885398661556955834L ^ life4_3));
    }
    __call159_126(receiver, life26_458, life28_493, life27_475, life33_535);
    __call159_127(receiver, life28_493, life27_475, life29_511, life33_535);
    if (!((life26_458 > life28_493))) {
        break lexical_join_598;
    }
    __call159_134(receiver, ((life26_458 - __invokedynamic159_128(9133, (8296388149926514958L ^ life4_3))) - __invokedynamic159_129(15211, (4360523461950065108L ^ life4_3))), (life27_475 - 5), __invokedynamic159_130(15925, (4768048338294852785L ^ life4_3)), __invokedynamic159_131(20681, (8059259614838596160L ^ life4_3)), __invokedynamic159_132(10784, (6416751784750078092L ^ life4_3)), __invokedynamic159_133(9133, (8296388149926514958L ^ life4_3)));
    break lexical_join_711;
    }
    if (!((life26_458 < life28_493))) {
        break lexical_join_634;
    }
    __call159_140(receiver, (life26_458 + __invokedynamic159_135(9133, (8296388149926514958L ^ life4_3))), (life27_475 - 5), __invokedynamic159_136(18280, (7358530259209106907L ^ life4_3)), __invokedynamic159_137(17153, (2556366881216967081L ^ life4_3)), __invokedynamic159_138(10784, (6416751784750078092L ^ life4_3)), __invokedynamic159_139(9133, (8296388149926514958L ^ life4_3)));
    break lexical_join_711;
    }
    if (!((life27_475 > life29_511))) {
        break lexical_join_676;
    }
    __call159_147(receiver, (life26_458 - 5), ((life27_475 - __invokedynamic159_141(9133, (8296388149926514958L ^ life4_3))) - __invokedynamic159_142(10784, (6416751784750078092L ^ life4_3))), __invokedynamic159_143(14983, (4728013773351864402L ^ life4_3)), __invokedynamic159_144(17153, (2556366881216967081L ^ life4_3)), __invokedynamic159_145(9133, (8296388149926514958L ^ life4_3)), __invokedynamic159_146(10784, (6416751784750078092L ^ life4_3)));
    break lexical_join_711;
    }
    if (!((life27_475 < life29_511))) {
        break lexical_join_711;
    }
    __call159_153(receiver, (life26_458 - 5), (life27_475 + __invokedynamic159_148(9133, (8296388149926514958L ^ life4_3))), __invokedynamic159_149(27893, (3366563757775265407L ^ life4_3)), __invokedynamic159_150(8759, (7652515698504781966L ^ life4_3)), __invokedynamic159_151(9133, (8296388149926514958L ^ life4_3)), __invokedynamic159_152(10784, (6416751784750078092L ^ life4_3)));
    }
    life24_429 += 1;
    continue lexical_cycle_421;
    }
    }
    life24_732 = null;
    life25_740 = (((float) (p0 - life10_77)) * __fieldRead159_154(receiver));
    life26_748 = (((float) (p1 - life11_85)) * __fieldRead159_155(receiver));
    __call159_156();
    __call159_157();
    __call159_158();
    __call159_159();
    life27_754 = 0;
    lexical_cycle_737: while (true) {
    lexical_join_1012: {
    lexical_join_973: {
    lexical_join_939: {
    lexical_join_923: {
    lexical_join_899: {
    lexical_join_862: {
    lexical_join_855: {
    lexical_join_851: {
    lexical_join_840: {
    lexical_join_829: {
    lexical_join_816: {
    if (!((life27_754 < __call159_161(__fieldRead159_160())))) {
        break lexical_join_1014;
    }
    life28_763 = __cast159_164(__call159_163(__fieldRead159_162(), life27_754));
    life29_774 = ((__fieldRead159_165(life28_763) * __invokedynamic159_166(20149, (766562992633461802L ^ life4_3))) - life6_16);
    life30_785 = ((__fieldRead159_167(life28_763) * __invokedynamic159_168(20149, (766562992633461802L ^ life4_3))) - life7_29);
    if (!((life29_774 >= __invokedynamic159_169(7179, (8514052418227760859L ^ life4_3))))) {
        break lexical_join_1012;
    }
    if (!((life30_785 >= __invokedynamic159_170(13201, (9044022717905944833L ^ life4_3))))) {
        break lexical_join_1012;
    }
    if (!((__numericCompare159_172(((float) life29_774), (0x1.cp7f * __fieldRead159_171(receiver))) <= 0))) {
        break lexical_join_1012;
    }
    if (!((__numericCompare159_174(((float) life30_785), (0x1.36p7f * __fieldRead159_173(receiver))) <= 0))) {
        break lexical_join_1012;
    }
    life31_829 = __call159_176(__fieldRead159_175(receiver), life28_763);
    if (!(__call159_178(__fieldRead159_177(receiver), life28_763))) {
        break lexical_join_816;
    }
    life32_836 = 0x1.8p-1f;
    __call159_179(life32_836, life32_836, life32_836, 0x1.0p0f);
    break lexical_join_862;
    }
    if (!(__call159_181(__fieldRead159_180(receiver), life28_763))) {
        break lexical_join_829;
    }
    life32_849 = 0x1.0p0f;
    __call159_182(life32_849, life32_849, life32_849, 0x1.0p0f);
    break lexical_join_862;
    }
    if (!((life31_829 < 3))) {
        break lexical_join_840;
    }
    life32_860 = 0x1.333334p-2f;
    __call159_183(life32_860, life32_860, life32_860, 0x1.0p0f);
    break lexical_join_862;
    }
    if (!((life31_829 == 3))) {
        break lexical_join_851;
    }
    life32_871 = 0x1.99999ap-3f;
    __call159_184(life32_871, life32_871, life32_871, 0x1.0p0f);
    break lexical_join_862;
    }
    if (!((life31_829 != 4))) {
        break lexical_join_855;
    }
    break lexical_join_1012;
    }
    life32_885 = 0x1.99999ap-4f;
    __call159_185(life32_885, life32_885, life32_885, 0x1.0p0f);
    }
    __call159_189(__call159_187(__fieldRead159_186(receiver)), __fieldRead159_188());
    if (!(__call159_190(life28_763))) {
        break lexical_join_899;
    }
    __call159_195(receiver, (life29_774 - 2), (life30_785 - 2), __invokedynamic159_191(7546, (2449003643252961217L ^ life4_3)), __invokedynamic159_192(10605, (2709182934340819951L ^ life4_3)), __invokedynamic159_193(17419, (1032827467145131707L ^ life4_3)), __invokedynamic159_194(17419, (1032827467145131707L ^ life4_3)));
    break lexical_join_923;
    }
    __call159_199(receiver, (life29_774 - 2), (life30_785 - 2), 0, __invokedynamic159_196(4257, (482832537215918636L ^ life4_3)), __invokedynamic159_197(17419, (1032827467145131707L ^ life4_3)), __invokedynamic159_198(17419, (1032827467145131707L ^ life4_3)));
    }
    if (!((!__call159_201(__fieldRead159_200(receiver), life28_763)))) {
        break lexical_join_939;
    }
    life32_960 = 0x1.99999ap-4f;
    __call159_202(life32_960, life32_960, life32_960, 0x1.0p0f);
    __call159_204(__fieldRead159_203(receiver), 0);
    }
    __call159_205();
    spill159_2 = 8031;
    __call159_206();
    spill159_3 = (989797238119951831L ^ life4_3);
    __call159_209(__fieldRead159_207(receiver), __fieldRead159_208(life28_763), (life29_774 + 3), (life30_785 + 3));
    __call159_212(__invokedynamic159_210(spill159_2, spill159_3), __invokedynamic159_211(14018, (6593842600169030757L ^ life4_3)));
    __call159_213();
    if (!((!__call159_215(__fieldRead159_214(receiver), life28_763)))) {
        break lexical_join_973;
    }
    __call159_217(__fieldRead159_216(receiver), 1);
    }
    __call159_218(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    if (!((__numericCompare159_219(life25_740, ((float) life29_774)) >= 0))) {
        break lexical_join_1012;
    }
    if (!((__numericCompare159_221(life25_740, ((float) (life29_774 + __invokedynamic159_220(30068, (7963308554044049376L ^ life4_3))))) <= 0))) {
        break lexical_join_1012;
    }
    if (!((__numericCompare159_222(life26_748, ((float) life30_785)) >= 0))) {
        break lexical_join_1012;
    }
    if (!((__numericCompare159_224(life26_748, ((float) (life30_785 + __invokedynamic159_223(30068, (7963308554044049376L ^ life4_3))))) <= 0))) {
        break lexical_join_1012;
    }
    life24_732 = life28_763;
    }
    life27_754 += 1;
    continue lexical_cycle_737;
    }
    }
    __call159_225();
    spill159_4 = 21052;
    __call159_226();
    spill159_5 = (5308673084384747754L ^ life4_3);
    __call159_227();
    __call159_228(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call159_232(__call159_230(__fieldRead159_229(receiver)), __fieldRead159_231());
    __call159_235(receiver, life8_61, life9_69, 0, 0, __fieldRead159_233(receiver), __fieldRead159_234(receiver));
    __fieldWrite159_236(receiver, 0x0.0p0f);
    __call159_238(__invokedynamic159_237(spill159_4, spill159_5));
    __call159_239();
    __call159_240();
    __call159_241(receiver, p0, p1, p2);
    if (!((life24_732 != null))) {
        break lexical_join_1408;
    }
    life27_1101 = __call159_243(__call159_242(life24_732));
    life28_1104 = __call159_244(life24_732);
    life29_1112 = (p0 + __invokedynamic159_245(22600, (1088194843743726283L ^ life4_3)));
    life30_1116 = (p1 - 4);
    life31_1121 = __call159_247(__fieldRead159_246(receiver), life24_732);
    if (!(__call159_249(__fieldRead159_248(receiver), life24_732))) {
        break lexical_join_1186;
    }
    life32_1137 = __call159_253(__call159_251(__fieldRead159_250(receiver), life27_1101), __invokedynamic159_252(17979, (1826265157050545332L ^ life4_3)));
    life33_1143 = __call159_255(__fieldRead159_254(receiver), life28_1104, life32_1137);
    if (!(__call159_257(__fieldRead159_256(receiver), life24_732))) {
        break lexical_join_1107;
    }
    life33_1143 += 12;
    }
    __call159_261(receiver, (life29_1112 - 3), (life30_1116 - 3), ((life29_1112 + life32_1137) + 3), (((life30_1116 + life33_1143) + 3) + __invokedynamic159_258(27017, (3923068652868180759L ^ life4_3))), __invokedynamic159_259(5970, (5187796153809429999L ^ life4_3)), __invokedynamic159_260(10413, (3017774749578058283L ^ life4_3)));
    __call159_265(__fieldRead159_262(receiver), life28_1104, life29_1112, (life30_1116 + __invokedynamic159_263(27017, (3923068652868180759L ^ life4_3))), life32_1137, __invokedynamic159_264(23402, (9168116076055144952L ^ life4_3)));
    if (!(__call159_267(__fieldRead159_266(receiver), life24_732))) {
        break lexical_join_1185;
    }
    __call159_271(__fieldRead159_268(receiver), __call159_269("achievement.taken", new java.lang.Object[0]), ((float) life29_1112), ((float) ((life30_1116 + life33_1143) + 4)), __invokedynamic159_270(6352, (7608100665037482568L ^ life4_3)));
    }
    break lexical_join_1367;
    }
    if (!((life31_1121 == 3))) {
        break lexical_join_1278;
    }
    life27_1101 = __call159_272("achievement.unknown", new java.lang.Object[0]);
    life32_1253 = __call159_276(__call159_274(__fieldRead159_273(receiver), life27_1101), __invokedynamic159_275(23441, (5220939312363776292L ^ life4_3)));
    life33_1267 = __call159_279(new moom.CN("achievement.requires", new java.lang.Object[] {__call159_278(__fieldRead159_277(life24_732))}));
    life34_1273 = __call159_281(__fieldRead159_280(receiver), life33_1267, life32_1253);
    __call159_285(receiver, (life29_1112 - 3), (life30_1116 - 3), ((life29_1112 + life32_1253) + 3), (((life30_1116 + life34_1273) + __invokedynamic159_282(27017, (3923068652868180759L ^ life4_3))) + 3), __invokedynamic159_283(10413, (3017774749578058283L ^ life4_3)), __invokedynamic159_284(10413, (3017774749578058283L ^ life4_3)));
    __call159_289(__fieldRead159_286(receiver), life33_1267, life29_1112, (life30_1116 + __invokedynamic159_287(27017, (3923068652868180759L ^ life4_3))), life32_1253, __invokedynamic159_288(9842, (7447554344355321067L ^ life4_3)));
    break lexical_join_1367;
    }
    if (!((life31_1121 < 3))) {
        break lexical_join_1365;
    }
    life32_1340 = __call159_293(__call159_291(__fieldRead159_290(receiver), life27_1101), __invokedynamic159_292(23441, (5220939312363776292L ^ life4_3)));
    life33_1354 = __call159_296(new moom.CN("achievement.requires", new java.lang.Object[] {__call159_295(__fieldRead159_294(life24_732))}));
    life34_1360 = __call159_298(__fieldRead159_297(receiver), life33_1354, life32_1340);
    __call159_302(receiver, (life29_1112 - 3), (life30_1116 - 3), ((life29_1112 + life32_1340) + 3), (((life30_1116 + life34_1360) + __invokedynamic159_299(27017, (3923068652868180759L ^ life4_3))) + 3), __invokedynamic159_300(10413, (3017774749578058283L ^ life4_3)), __invokedynamic159_301(10413, (3017774749578058283L ^ life4_3)));
    __call159_306(__fieldRead159_303(receiver), life33_1354, life29_1112, (life30_1116 + __invokedynamic159_304(27017, (3923068652868180759L ^ life4_3))), life32_1340, __invokedynamic159_305(19697, (4961530859432885829L ^ life4_3)));
    break lexical_join_1367;
    }
    life27_1101 = null;
    }
    if (!((life27_1101 != null))) {
        break lexical_join_1408;
    }
    spill159_6 = __fieldRead159_307(receiver);
    spill159_7 = life27_1101;
    spill159_8 = ((float) life29_1112);
    spill159_9 = ((float) life30_1116);
    if (!(__call159_309(__fieldRead159_308(receiver), life24_732))) {
        lexicalValue159_1392_0 = spill159_6;
        lexicalValue159_1392_1 = spill159_7;
        lexicalValue159_1392_2 = spill159_8;
        lexicalValue159_1392_3 = spill159_9;
        break lexical_join_1392;
    }
    if (!(__call159_310(life24_732))) {
        lexicalValue159_1390_0 = spill159_6;
        lexicalValue159_1390_1 = spill159_7;
        lexicalValue159_1390_2 = spill159_8;
        lexicalValue159_1390_3 = spill159_9;
        break lexical_join_1390;
    }
    lexicalValue159_1406_0 = spill159_6;
    lexicalValue159_1406_1 = spill159_7;
    lexicalValue159_1406_2 = spill159_8;
    lexicalValue159_1406_3 = spill159_9;
    lexicalValue159_1406_4 = __invokedynamic159_311(10755, (5889023780473526413L ^ life4_3));
    break lexical_join_1406;
    }
    lexicalValue159_1406_0 = lexicalValue159_1390_0;
    lexicalValue159_1406_1 = lexicalValue159_1390_1;
    lexicalValue159_1406_2 = lexicalValue159_1390_2;
    lexicalValue159_1406_3 = lexicalValue159_1390_3;
    lexicalValue159_1406_4 = -1;
    break lexical_join_1406;
    }
    if (!(__call159_312(life24_732))) {
        lexicalValue159_1401_0 = lexicalValue159_1392_0;
        lexicalValue159_1401_1 = lexicalValue159_1392_1;
        lexicalValue159_1401_2 = lexicalValue159_1392_2;
        lexicalValue159_1401_3 = lexicalValue159_1392_3;
        break lexical_join_1401;
    }
    lexicalValue159_1406_0 = lexicalValue159_1392_0;
    lexicalValue159_1406_1 = lexicalValue159_1392_1;
    lexicalValue159_1406_2 = lexicalValue159_1392_2;
    lexicalValue159_1406_3 = lexicalValue159_1392_3;
    lexicalValue159_1406_4 = __invokedynamic159_313(27843, (4145806789719072364L ^ life4_3));
    break lexical_join_1406;
    }
    lexicalValue159_1406_0 = lexicalValue159_1401_0;
    lexicalValue159_1406_1 = lexicalValue159_1401_1;
    lexicalValue159_1406_2 = lexicalValue159_1401_2;
    lexicalValue159_1406_3 = lexicalValue159_1401_3;
    lexicalValue159_1406_4 = __invokedynamic159_314(26303, (1209290976707220507L ^ life4_3));
    }
    __call159_315(lexicalValue159_1406_0, lexicalValue159_1406_1, lexicalValue159_1406_2, lexicalValue159_1406_3, lexicalValue159_1406_4);
    }
    __call159_316();
    __call159_317();
    __call159_318();
    return;
}
public static void h159_0(moom.Oo p0) throws Throwable {
    throw __call3015900_0(p0);
}
public static void h159_1(moom.Oo p0) throws Throwable {
    throw __call3015901_0(p0);
}
public static void h159_2(moom.Oo p0) throws Throwable {
    throw __call3015902_0(p0);
}
public static void h159_3(moom.Oo p0) throws Throwable {
    throw __call3015903_0(p0);
}
public static void h159_4(moom.Oo p0) throws Throwable {
    throw __call3015904_0(p0);
}
public static void h159_5(moom.Oo p0) throws Throwable {
    throw __call3015905_0(p0);
}
public static void h159_6(moom.Oo p0) throws Throwable {
    throw __call3015906_0(p0);
}
public static void h159_7(moom.Oo p0) throws Throwable {
    throw __call3015907_0(p0);
}
public static void h159_8(moom.Oo p0) throws Throwable {
    throw __call3015908_0(p0);
}
public static void h159_9(moom.Oo p0) throws Throwable {
    throw __call3015909_0(p0);
}
public static void h159_10(moom.Oo p0) throws Throwable {
    throw __call3015910_0(p0);
}
public static void h159_11(moom.Oo p0) throws Throwable {
    throw __call3015911_0(p0);
}
public static void h159_12(moom.Oo p0) throws Throwable {
    throw __call3015912_0(p0);
}
public static void h159_13(moom.Oo p0) throws Throwable {
    throw __call3015913_0(p0);
}
public static void h159_14(moom.Oo p0) throws Throwable {
    throw __call3015914_0(p0);
}
public static void h159_15(moom.Oo p0) throws Throwable {
    throw __call3015915_0(p0);
}
public static void h159_16(moom.Oo p0) throws Throwable {
    throw __call3015916_0(p0);
}
public static void h159_17(moom.Oo p0) throws Throwable {
    throw __call3015917_0(p0);
}
public static void h159_18(moom.Oo p0) throws Throwable {
    throw __call3015918_0(p0);
}
public static void h159_19(moom.Oo p0) throws Throwable {
    throw __call3015919_0(p0);
}
public static void h159_20(moom.Oo p0) throws Throwable {
    throw __call3015920_0(p0);
}
public static void h159_21(moom.Oo p0) throws Throwable {
    throw __call3015921_0(p0);
}
private static native long __fieldRead159_0() throws Throwable;
private static native double __fieldRead159_1(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native double __fieldRead159_2(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native double __fieldRead159_3(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __call159_4(double a0) throws Throwable;
private static native double __fieldRead159_5(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native double __fieldRead159_6(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native double __fieldRead159_7(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __call159_8(double a0) throws Throwable;
private static native int __fieldRead159_9() throws Throwable;
private static native int __fieldRead159_10() throws Throwable;
private static native int __fieldRead159_11() throws Throwable;
private static native int __fieldRead159_12() throws Throwable;
private static native int __fieldRead159_13() throws Throwable;
private static native int __fieldRead159_14() throws Throwable;
private static native int __fieldRead159_15() throws Throwable;
private static native int __fieldRead159_16() throws Throwable;
private static native int __fieldRead159_17(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead159_18(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead159_19(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead159_20(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __invokedynamic159_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_22(int a0, long a1) throws Throwable;
private static native void __fieldWrite159_23(net.minecraft.client.gui.achievement.GuiAchievements a0, float a1) throws Throwable;
private static native int __invokedynamic159_24(int a0, long a1) throws Throwable;
private static native void __call159_25(int a0) throws Throwable;
private static native void __call159_26() throws Throwable;
private static native void __call159_27(float a0, float a1, float a2) throws Throwable;
private static native float __fieldRead159_28(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native float __fieldRead159_29(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __call159_30(float a0, float a1, float a2) throws Throwable;
private static native void __call159_31() throws Throwable;
private static native void __call159_32() throws Throwable;
private static native void __call159_33() throws Throwable;
private static native void __call159_34() throws Throwable;
private static native int __invokedynamic159_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_42(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_43(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_44(int a0, long a1) throws Throwable;
private static native float __fieldRead159_45(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native float __fieldRead159_46(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __numericCompare159_47(float a0, float a1) throws Throwable;
private static native void __call159_48(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __numericCompare159_49(float a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead159_50(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native net.minecraft.util.Session __call159_51(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call159_52(net.minecraft.util.Session a0) throws Throwable;
private static native int __call159_53(java.lang.String a0) throws Throwable;
private static native long __invokedynamic159_54(int a0, long a1) throws Throwable;
private static native void __call159_55(java.util.Random a0, long a1) throws Throwable;
private static native int __call159_56(java.util.Random a0, int a1) throws Throwable;
private static native moom.dx __fieldRead159_57() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call159_58(net.minecraft.client.gui.achievement.GuiAchievements a0, moom.dx a1) throws Throwable;
private static native int __invokedynamic159_59(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_60(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_61(int a0, long a1) throws Throwable;
private static native int __call159_62(java.util.Random a0, int a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead159_63() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call159_64(net.minecraft.client.gui.achievement.GuiAchievements a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead159_65() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call159_66(net.minecraft.client.gui.achievement.GuiAchievements a0, net.minecraft.block.Block a1) throws Throwable;
private static native int __invokedynamic159_67(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead159_68() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call159_69(net.minecraft.client.gui.achievement.GuiAchievements a0, net.minecraft.block.Block a1) throws Throwable;
private static native int __invokedynamic159_70(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead159_71() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call159_72(net.minecraft.client.gui.achievement.GuiAchievements a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead159_73() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call159_74(net.minecraft.client.gui.achievement.GuiAchievements a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead159_75() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call159_76(net.minecraft.client.gui.achievement.GuiAchievements a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead159_77() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call159_78(net.minecraft.client.gui.achievement.GuiAchievements a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead159_79(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call159_80(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead159_81() throws Throwable;
private static native void __call159_82(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic159_83(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_84(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_85(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_86(int a0, long a1) throws Throwable;
private static native void __call159_87(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, net.minecraft.client.renderer.texture.TextureAtlasSprite a3, int a4, int a5) throws Throwable;
private static native void __call159_88() throws Throwable;
private static native int __invokedynamic159_89(int a0, long a1) throws Throwable;
private static native void __call159_90(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead159_91(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call159_92(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead159_93() throws Throwable;
private static native void __call159_94(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native java.util.List __fieldRead159_95() throws Throwable;
private static native int __call159_96(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead159_97() throws Throwable;
private static native java.lang.Object __call159_98(java.util.List a0, int a1) throws Throwable;
private static native moom.BZ __cast159_99(java.lang.Object a0) throws Throwable;
private static native moom.BZ __fieldRead159_100(moom.BZ a0) throws Throwable;
private static native int __fieldRead159_101(moom.BZ a0) throws Throwable;
private static native int __invokedynamic159_102(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_103(int a0, long a1) throws Throwable;
private static native int __fieldRead159_104(moom.BZ a0) throws Throwable;
private static native int __invokedynamic159_105(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_106(int a0, long a1) throws Throwable;
private static native moom.BZ __fieldRead159_107(moom.BZ a0) throws Throwable;
private static native int __fieldRead159_108(moom.BZ a0) throws Throwable;
private static native int __invokedynamic159_109(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_110(int a0, long a1) throws Throwable;
private static native moom.BZ __fieldRead159_111(moom.BZ a0) throws Throwable;
private static native int __fieldRead159_112(moom.BZ a0) throws Throwable;
private static native int __invokedynamic159_113(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_114(int a0, long a1) throws Throwable;
private static native moom.B2 __fieldRead159_115(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native boolean __call159_116(moom.B2 a0, moom.BZ a1) throws Throwable;
private static native int __integerCategory159_117(boolean value) throws Throwable;
private static native moom.B2 __fieldRead159_118(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native boolean __call159_119(moom.B2 a0, moom.BZ a1) throws Throwable;
private static native int __integerCategory159_120(boolean value) throws Throwable;
private static native moom.B2 __fieldRead159_121(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __call159_122(moom.B2 a0, moom.BZ a1) throws Throwable;
private static native int __invokedynamic159_123(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_124(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_125(int a0, long a1) throws Throwable;
private static native void __call159_126(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call159_127(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native int __invokedynamic159_128(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_129(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_130(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_131(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_132(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_133(int a0, long a1) throws Throwable;
private static native void __call159_134(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic159_135(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_136(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_137(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_138(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_139(int a0, long a1) throws Throwable;
private static native void __call159_140(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic159_141(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_142(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_143(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_144(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_145(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_146(int a0, long a1) throws Throwable;
private static native void __call159_147(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic159_148(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_149(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_150(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_151(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_152(int a0, long a1) throws Throwable;
private static native void __call159_153(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native float __fieldRead159_154(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native float __fieldRead159_155(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __call159_156() throws Throwable;
private static native void __call159_157() throws Throwable;
private static native void __call159_158() throws Throwable;
private static native void __call159_159() throws Throwable;
private static native java.util.List __fieldRead159_160() throws Throwable;
private static native int __call159_161(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead159_162() throws Throwable;
private static native java.lang.Object __call159_163(java.util.List a0, int a1) throws Throwable;
private static native moom.BZ __cast159_164(java.lang.Object a0) throws Throwable;
private static native int __fieldRead159_165(moom.BZ a0) throws Throwable;
private static native int __invokedynamic159_166(int a0, long a1) throws Throwable;
private static native int __fieldRead159_167(moom.BZ a0) throws Throwable;
private static native int __invokedynamic159_168(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_169(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_170(int a0, long a1) throws Throwable;
private static native float __fieldRead159_171(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __numericCompare159_172(float a0, float a1) throws Throwable;
private static native float __fieldRead159_173(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __numericCompare159_174(float a0, float a1) throws Throwable;
private static native moom.B2 __fieldRead159_175(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __call159_176(moom.B2 a0, moom.BZ a1) throws Throwable;
private static native moom.B2 __fieldRead159_177(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native boolean __call159_178(moom.B2 a0, moom.BZ a1) throws Throwable;
private static native void __call159_179(float a0, float a1, float a2, float a3) throws Throwable;
private static native moom.B2 __fieldRead159_180(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native boolean __call159_181(moom.B2 a0, moom.BZ a1) throws Throwable;
private static native void __call159_182(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call159_183(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call159_184(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call159_185(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead159_186(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call159_187(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead159_188() throws Throwable;
private static native void __call159_189(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native boolean __call159_190(moom.BZ a0) throws Throwable;
private static native int __invokedynamic159_191(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_192(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_193(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_194(int a0, long a1) throws Throwable;
private static native void __call159_195(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic159_196(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_197(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_198(int a0, long a1) throws Throwable;
private static native void __call159_199(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native moom.B2 __fieldRead159_200(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native boolean __call159_201(moom.B2 a0, moom.BZ a1) throws Throwable;
private static native void __call159_202(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead159_203(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __call159_204(net.minecraft.client.renderer.entity.RenderItem a0, int a1) throws Throwable;
private static native void __call159_205() throws Throwable;
private static native void __call159_206() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead159_207(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead159_208(moom.BZ a0) throws Throwable;
private static native void __call159_209(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic159_210(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_211(int a0, long a1) throws Throwable;
private static native void __call159_212(int a0, int a1) throws Throwable;
private static native void __call159_213() throws Throwable;
private static native moom.B2 __fieldRead159_214(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native boolean __call159_215(moom.B2 a0, moom.BZ a1) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead159_216(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __call159_217(net.minecraft.client.renderer.entity.RenderItem a0, int a1) throws Throwable;
private static native void __call159_218(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __numericCompare159_219(float a0, float a1) throws Throwable;
private static native int __invokedynamic159_220(int a0, long a1) throws Throwable;
private static native int __numericCompare159_221(float a0, float a1) throws Throwable;
private static native int __numericCompare159_222(float a0, float a1) throws Throwable;
private static native int __invokedynamic159_223(int a0, long a1) throws Throwable;
private static native int __numericCompare159_224(float a0, float a1) throws Throwable;
private static native void __call159_225() throws Throwable;
private static native void __call159_226() throws Throwable;
private static native void __call159_227() throws Throwable;
private static native void __call159_228(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead159_229(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call159_230(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead159_231() throws Throwable;
private static native void __call159_232(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __fieldRead159_233(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __fieldRead159_234(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __call159_235(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __fieldWrite159_236(net.minecraft.client.gui.achievement.GuiAchievements a0, float a1) throws Throwable;
private static native int __invokedynamic159_237(int a0, long a1) throws Throwable;
private static native void __call159_238(int a0) throws Throwable;
private static native void __call159_239() throws Throwable;
private static native void __call159_240() throws Throwable;
private static native void __call159_241(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, float a3) throws Throwable;
private static native net.minecraft.util.IChatComponent __call159_242(moom.BZ a0) throws Throwable;
private static native java.lang.String __call159_243(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native java.lang.String __call159_244(moom.BZ a0) throws Throwable;
private static native int __invokedynamic159_245(int a0, long a1) throws Throwable;
private static native moom.B2 __fieldRead159_246(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __call159_247(moom.B2 a0, moom.BZ a1) throws Throwable;
private static native moom.B2 __fieldRead159_248(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native boolean __call159_249(moom.B2 a0, moom.BZ a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead159_250(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __call159_251(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic159_252(int a0, long a1) throws Throwable;
private static native int __call159_253(int a0, int a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead159_254(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __call159_255(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2) throws Throwable;
private static native moom.B2 __fieldRead159_256(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native boolean __call159_257(moom.B2 a0, moom.BZ a1) throws Throwable;
private static native int __invokedynamic159_258(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_259(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_260(int a0, long a1) throws Throwable;
private static native void __call159_261(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead159_262(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __invokedynamic159_263(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_264(int a0, long a1) throws Throwable;
private static native void __call159_265(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native moom.B2 __fieldRead159_266(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native boolean __call159_267(moom.B2 a0, moom.BZ a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead159_268(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native java.lang.String __call159_269(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __invokedynamic159_270(int a0, long a1) throws Throwable;
private static native int __call159_271(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native java.lang.String __call159_272(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead159_273(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __call159_274(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic159_275(int a0, long a1) throws Throwable;
private static native int __call159_276(int a0, int a1) throws Throwable;
private static native moom.BZ __fieldRead159_277(moom.BZ a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call159_278(moom.BZ a0) throws Throwable;
private static native java.lang.String __call159_279(moom.CN a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead159_280(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __call159_281(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2) throws Throwable;
private static native int __invokedynamic159_282(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_283(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_284(int a0, long a1) throws Throwable;
private static native void __call159_285(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead159_286(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __invokedynamic159_287(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_288(int a0, long a1) throws Throwable;
private static native void __call159_289(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead159_290(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __call159_291(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic159_292(int a0, long a1) throws Throwable;
private static native int __call159_293(int a0, int a1) throws Throwable;
private static native moom.BZ __fieldRead159_294(moom.BZ a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call159_295(moom.BZ a0) throws Throwable;
private static native java.lang.String __call159_296(moom.CN a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead159_297(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __call159_298(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2) throws Throwable;
private static native int __invokedynamic159_299(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_300(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_301(int a0, long a1) throws Throwable;
private static native void __call159_302(net.minecraft.client.gui.achievement.GuiAchievements a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead159_303(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native int __invokedynamic159_304(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_305(int a0, long a1) throws Throwable;
private static native void __call159_306(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead159_307(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native moom.B2 __fieldRead159_308(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native boolean __call159_309(moom.B2 a0, moom.BZ a1) throws Throwable;
private static native boolean __call159_310(moom.BZ a0) throws Throwable;
private static native int __invokedynamic159_311(int a0, long a1) throws Throwable;
private static native boolean __call159_312(moom.BZ a0) throws Throwable;
private static native int __invokedynamic159_313(int a0, long a1) throws Throwable;
private static native int __invokedynamic159_314(int a0, long a1) throws Throwable;
private static native int __call159_315(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native void __call159_316() throws Throwable;
private static native void __call159_317() throws Throwable;
private static native void __call159_318() throws Throwable;
private static native java.lang.Exception __call3015900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015910_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015911_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015912_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015913_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015914_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015915_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015916_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015917_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015918_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015919_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015920_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3015921_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_36fabb322e69b1a2029a(net.minecraft.client.gui.achievement.GuiAchievements a0) throws E;
private static final class __SourceHandler_36fabb322e69b1a2029a {

public static void f214(net.minecraft.client.gui.achievement.GuiAchievements receiver) throws Throwable {
    double life1_16;
    double life3_22;
    if ((!__fieldRead214_0(receiver))) {
        __fieldWrite214_2(receiver, __fieldRead214_1(receiver));
        __fieldWrite214_4(receiver, __fieldRead214_3(receiver));
        life1_16 = (__fieldRead214_5(receiver) - __fieldRead214_6(receiver));
        life3_22 = (__fieldRead214_7(receiver) - __fieldRead214_8(receiver));
        if ((((life1_16 * life1_16) + (life3_22 * life3_22)) < 0x1.0p2d)) {
        net.minecraft.client.gui.achievement.GuiAchievements __stackOp214_9_0 = receiver;
        __fieldWrite214_11(__stackOp214_9_0, (__fieldRead214_10(__stackOp214_9_0) + life1_16));
        net.minecraft.client.gui.achievement.GuiAchievements __stackOp214_12_0 = receiver;
        __fieldWrite214_14(__stackOp214_12_0, (__fieldRead214_13(__stackOp214_12_0) + life3_22));
    } else {
        net.minecraft.client.gui.achievement.GuiAchievements __stackOp214_15_0 = receiver;
        __fieldWrite214_17(__stackOp214_15_0, (__fieldRead214_16(__stackOp214_15_0) + (life1_16 * 0x1.b333333333333p-1d)));
        net.minecraft.client.gui.achievement.GuiAchievements __stackOp214_18_0 = receiver;
        __fieldWrite214_20(__stackOp214_18_0, (__fieldRead214_19(__stackOp214_18_0) + (life3_22 * 0x1.b333333333333p-1d)));
    }
    }
    return;
}
public static void h214_0(moom.Oo p0) throws Throwable {
    throw __call1021400_0(p0);
}
private static native boolean __fieldRead214_0(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native double __fieldRead214_1(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite214_2(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead214_3(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite214_4(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead214_5(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native double __fieldRead214_6(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native double __fieldRead214_7(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native double __fieldRead214_8(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native double __fieldRead214_10(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite214_11(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead214_13(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite214_14(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead214_16(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite214_17(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native double __fieldRead214_19(net.minecraft.client.gui.achievement.GuiAchievements a0) throws Throwable;
private static native void __fieldWrite214_20(net.minecraft.client.gui.achievement.GuiAchievements a0, double a1) throws Throwable;
private static native java.lang.Exception __call1021400_0(moom.Oo a0) throws Throwable;

}


protected void b(int p0, int p1, float p2) { __sourceHandlerCall_43f92a456194f721c549(this, p0, p1, p2); }


protected void b() {
long local1 = (net.minecraft.client.gui.achievement.GuiAchievements.Q ^ 69308708218861L);
    int local3 = ((this.k - this.C) / 2);
    int local4 = ((this.l - this.D) / 2);
    ((net.minecraft.client.gui.FontRenderer)(this.p)).b(((java.lang.String)(moom.oO.a(((java.lang.String)("gui.achievements")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((float)(((float) (local3 + __sourceIntrinsic_938da207dded_originalDynamicSite1803_7(11618, (725496508100177634L ^ local1)))))), ((float)(((float) (local4 + 5)))), ((int)(__sourceIntrinsic_938da207dded_originalDynamicSite1803_8(32154, (6705010964653981206L ^ local1)))));
    return;
}


public void c__Void() {
long local1 = (net.minecraft.client.gui.achievement.GuiAchievements.Q ^ 137384000859871L);
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.Minecraft)(this.i)).a__jS())).a(((moom.yK)(new moom.zp(net.minecraft.network.play.client.C16PacketClientStatus$EnumState.REQUEST_STATS))));
    ((java.util.List)(this.m)).clear();
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gi(1, ((this.k / 2) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1804_9(20149, (766592185232737334L ^ local1))), ((this.l / 2) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1804_11(2069, (1613685163380474555L ^ local1))), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1804_12(6506, (1948286998418625511L ^ local1)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1804_13(979, (3213284387606333797L ^ local1)), moom.oO.a(((java.lang.String)("gui.done")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    return;
}


private static long d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.client.gui.achievement.GuiAchievements.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10406_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/he"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long d(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13643);
    if (((net.minecraft.client.gui.achievement.GuiAchievements.V)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.client.gui.achievement.GuiAchievements.U)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.client.gui.achievement.GuiAchievements.W)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.client.gui.achievement.GuiAchievements.W)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/he", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.client.gui.achievement.GuiAchievements.V)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.client.gui.achievement.GuiAchievements.V)[life3_8])).longValue();
}


private net.minecraft.client.renderer.texture.TextureAtlasSprite a(net.minecraft.block.Block p0) {
return ((net.minecraft.client.renderer.BlockModelShapes)(((net.minecraft.client.renderer.BlockRendererDispatcher)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__kP())).a__kN())).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(p0)).a__fE())));
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.achievement.GuiAchievements.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10408_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/he"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_44098c0f68c28de20590(this, p0, p1); }


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_6fe9feb371e5b2f7f17b(this, p0); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23038;
      if (S[var3] == null) {
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
         long var5 = R[var3];
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
         Object[] var9 = (Object[])T.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               T.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/he", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         S[var3] = var15;
      }

      return S[var3];
}


public void a() {
try {
        if (this.P) {
        this.P = ((boolean)(false));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw net.minecraft.client.gui.achievement.GuiAchievements.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


public boolean a__Boolean() { return __sourceHandlerCall_1e38e776989400c5d4c3(this); }


public void a(int p0, int p1, float p2) { __sourceHandlerCall_21b9523db491afe32202(this, p0, p1, p2); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void g() { __sourceHandlerCall_36fabb322e69b1a2029a(this); }


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1166_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_982923e75d1f7e44_invokedynamic533_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_982923e75d1f7e44_invokedynamic533_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_982923e75d1f7e44_invokedynamic533_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_982923e75d1f7e44_invokedynamic533_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_982923e75d1f7e44_invokedynamic533_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_982923e75d1f7e44_invokedynamic533_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_982923e75d1f7e44_invokedynamic533_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10408_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite1803_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite1803_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1804_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1804_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1804_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1804_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10406_0() throws E;
}
