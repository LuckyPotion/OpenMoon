package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiCreateWorld extends net.minecraft.client.gui.GuiScreen {

private net.minecraft.client.gui.GuiScreen w;

private moom.hJ x;

private moom.hJ y;

private java.lang.String z;

private java.lang.String A;

private java.lang.String B;

private boolean C;

private boolean D;

private boolean E;

private boolean F;

private boolean G;

private boolean H;

private boolean I;

private moom.gc J;

private moom.gc K;

private moom.gc L;

private moom.gc M;

private moom.gc N;

private moom.gc O;

private moom.gc P;

private java.lang.String Q;

private java.lang.String R;

private java.lang.String S;

private java.lang.String T;

private int U;

public java.lang.String V;

private static java.lang.String[] W;

private static long X;

private static long[] Y;

private static java.lang.Integer[] Z;

private static java.util.Map ab;

public GuiCreateWorld(net.minecraft.client.gui.GuiScreen p0) {
super();
    this.A = "survival";
    this.C = true;
    this.V = "";
    this.w = p0;
    this.S = "";
    this.T = moom.oO.a("selectWorld.newWorld", new java.lang.Object[0]);
}


static {
X = ((long)(((moom._a)(moom._c.a(((long)(4849415964843780979L)), ((long)(5630112939757119196L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(191466314645102L)))));
    long local11_life6 = (net.minecraft.client.gui.GuiCreateWorld.X ^ 80685637355544L);
    ab = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1770_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1770_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1770_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1770_14 = new byte[8];
    (__sourceSpill1770_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1770_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1770_16 = __sourceSpill1770_14;
    ((javax.crypto.Cipher)(__sourceSpill1770_11)).init(((int)(__sourceSpill1770_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1770_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1770_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[58];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "\000Í\024-L D$õp²vkÎ\002¼Äë³Ç[èÆ´I§@Xc50\026ÃÞ\007Ñ@ï|Y\f#Âßñ(6÷íñ¡\tÄ7\023<øX§NM\006 \ri6|+½;rW\177E¦Ôfõ1Z\037¹©»Å»\031Ùb\0202qq¦ó\0301FÍ¢6GS¿±ÁN\025^\023\0024\036\027]\017/aiÎ¯|ÙP\034tÛLïÉ\036°4iÖzX\013¶Ó\002ØÐz¸].:êçS©;ð\001ë\007\013ê¬eðÌë\"ÒüÖªÓòT]\"²HuÖáÙúßF\005'ËE½kãGßà¼\rÝóÐü\035ãûÍçâv\032<zÑ¡ª²\0002èôOª?¤ñõ¶#^W£\037Z6J\003RN3\\X;®\033ùyÂjé\031©Íò«\0344Ú>\032\búïoço\022HSn¡CFÑ¯j7Ð¾þàG`×C¾é7G\fOåVp\024äº±_A±\rUÓd7êÜBu\tÅ±ErÃ\037Í¢ØS¢ðiÁÊ8¿\024ó;=`MÀ>[l3$ý\005|\034åð¤ÚËÇáwèuBf\030Ì\007u\013fW£ 0|A\023ï=(Ã¾\024ÔÕC\016UÃjzÃwº·\t/)2]\0028ú¬ÿî\024#%±3\025gë¼påT]ß\0254Ä\004\037"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1770_25 = local4_life21;
        int __sourceSpill1770_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1770_25)).substring(((int)(__sourceSpill1770_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1770_30 = local6_life19;
        int __sourceSpill1770_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1770_33 = new byte[8];
        (__sourceSpill1770_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1770_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1770_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1770_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1770_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1770_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1770_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1770_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1770_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1770_34)).doFinal(((byte[])(__sourceSpill1770_33)));
        (__sourceSpill1770_30)[__sourceSpill1770_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "Z\032Q°5û¬\025AdxÙ*d"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1770_38 = local4_life21;
        int __sourceSpill1770_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1770_38)).substring(((int)(__sourceSpill1770_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1770_43 = local6_life19;
        int __sourceSpill1770_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1770_46 = new byte[8];
        (__sourceSpill1770_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1770_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1770_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1770_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1770_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1770_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1770_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1770_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1770_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1770_47)).doFinal(((byte[])(__sourceSpill1770_46)));
        (__sourceSpill1770_43)[__sourceSpill1770_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    Y = ((long[])(local6_life19));
    Z = ((java.lang.Integer[])(new java.lang.Integer[58]));
    java.lang.String[] __sourceSpill1770_53 = new java.lang.String[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_52(10297, (1468263157753463655L ^ local11_life6))];
    (__sourceSpill1770_53)[0] = "CON";
    (__sourceSpill1770_53)[1] = "COM";
    (__sourceSpill1770_53)[2] = "PRN";
    (__sourceSpill1770_53)[3] = "AUX";
    (__sourceSpill1770_53)[4] = "CLOCK$";
    (__sourceSpill1770_53)[5] = "NUL";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_54(14768, (1246388740068365054L ^ local11_life6))] = "COM1";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_55(5923, (2144140198556957779L ^ local11_life6))] = "COM2";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_56(24109, (7620339854187738485L ^ local11_life6))] = "COM3";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_57(24362, (8395937116286727256L ^ local11_life6))] = "COM4";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_58(9859, (3152852088815635942L ^ local11_life6))] = "COM5";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_59(6405, (870814268786373196L ^ local11_life6))] = "COM6";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_60(7213, (554575945208199022L ^ local11_life6))] = "COM7";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_61(6221, (5457693316874498857L ^ local11_life6))] = "COM8";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_62(5463, (2164215276231425571L ^ local11_life6))] = "COM9";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_63(11922, (3927303631831647689L ^ local11_life6))] = "LPT1";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_64(25432, (199138973824550971L ^ local11_life6))] = "LPT2";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_65(24156, (2188574286781592879L ^ local11_life6))] = "LPT3";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_66(3317, (5930888537663825804L ^ local11_life6))] = "LPT4";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_67(16167, (1395460108451894361L ^ local11_life6))] = "LPT5";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_68(10024, (7610270273424149572L ^ local11_life6))] = "LPT6";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_69(13005, (5178843295137520005L ^ local11_life6))] = "LPT7";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_70(29165, (3680156806690839218L ^ local11_life6))] = "LPT8";
    (__sourceSpill1770_53)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_71(19382, (3184856938673578200L ^ local11_life6))] = "LPT9";
    W = ((java.lang.String[])(__sourceSpill1770_53));
}

private static native <E extends Throwable> void __sourceHandlerCall_ed7b0b5a6deba04d9986(net.minecraft.client.gui.GuiCreateWorld a0, char a1, int a2) throws E;
private static final class __SourceHandler_ed7b0b5a6deba04d9986 {

public static void f1304(net.minecraft.client.gui.GuiCreateWorld receiver, char p0, int p1) throws Throwable {
    moom.gc forwardValue1304_74_0;
    moom.gc forwardValue1304_75_0;
    int forwardValue1304_75_1;
    moom.gc spill1304_0;
    long life3_3;
    forward_join_75: {
    forward_join_74: {
    forward_join_62: {
    forward_join_55: {
    forward_join_41: {
    forward_join_23: {
    life3_3 = (__fieldRead1304_0() ^ 78243108883197L);
    if (!(__call1304_2(__fieldRead1304_1(receiver)))) {
        break forward_join_23;
    }
    if (!((!__fieldRead1304_3(receiver)))) {
        break forward_join_23;
    }
    __call1304_5(__fieldRead1304_4(receiver), p0, p1);
    __fieldWrite1304_8(receiver, __call1304_7(__fieldRead1304_6(receiver)));
    break forward_join_41;
    }
    if (!(__call1304_10(__fieldRead1304_9(receiver)))) {
        break forward_join_41;
    }
    if (!(__fieldRead1304_11(receiver))) {
        break forward_join_41;
    }
    __call1304_13(__fieldRead1304_12(receiver), p0, p1);
    __fieldWrite1304_16(receiver, __call1304_15(__fieldRead1304_14(receiver)));
    }
    if (!((p1 != __invokedynamic1304_17(8473, (9165101117003040924L ^ life3_3))))) {
        break forward_join_55;
    }
    if (!((p1 == __invokedynamic1304_18(27365, (4558378594070676351L ^ life3_3))))) {
        break forward_join_62;
    }
    }
    __call1304_22(receiver, __cast1304_21(__call1304_20(__fieldRead1304_19(receiver), 0)));
    }
    spill1304_0 = __cast1304_25(__call1304_24(__fieldRead1304_23(receiver), 0));
    if (!((__call1304_28(__call1304_27(__fieldRead1304_26(receiver))) > 0))) {
        forwardValue1304_74_0 = spill1304_0;
        break forward_join_74;
    }
    forwardValue1304_75_0 = spill1304_0;
    forwardValue1304_75_1 = 1;
    break forward_join_75;
    }
    forwardValue1304_75_0 = forwardValue1304_74_0;
    forwardValue1304_75_1 = 0;
    }
    __fieldWrite1304_29(forwardValue1304_75_0, forwardValue1304_75_1);
    __call1304_30(receiver);
    return;
}
public static void h1304_0(java.io.IOException p0) throws Throwable {
    throw __call1130400_0(p0);
}
public static void h1304_1(java.io.IOException p0) throws Throwable {
    throw __call1130401_0(p0);
}
public static void h1304_2(java.io.IOException p0) throws Throwable {
    throw __call1130402_0(p0);
}
public static void h1304_3(java.io.IOException p0) throws Throwable {
    throw __call1130403_0(p0);
}
public static void h1304_4(java.io.IOException p0) throws Throwable {
    throw __call1130404_0(p0);
}
public static void h1304_5(java.io.IOException p0) throws Throwable {
    throw __call1130405_0(p0);
}
public static void h1304_6(java.io.IOException p0) throws Throwable {
    throw __call1130406_0(p0);
}
private static native long __fieldRead1304_0() throws Throwable;
private static native moom.hJ __fieldRead1304_1(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __call1304_2(moom.hJ a0) throws Throwable;
private static native boolean __fieldRead1304_3(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.hJ __fieldRead1304_4(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __call1304_5(moom.hJ a0, char a1, int a2) throws Throwable;
private static native moom.hJ __fieldRead1304_6(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1304_7(moom.hJ a0) throws Throwable;
private static native void __fieldWrite1304_8(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native moom.hJ __fieldRead1304_9(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __call1304_10(moom.hJ a0) throws Throwable;
private static native boolean __fieldRead1304_11(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.hJ __fieldRead1304_12(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __call1304_13(moom.hJ a0, char a1, int a2) throws Throwable;
private static native moom.hJ __fieldRead1304_14(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1304_15(moom.hJ a0) throws Throwable;
private static native void __fieldWrite1304_16(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1304_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic1304_18(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead1304_19(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.Object __call1304_20(java.util.List a0, int a1) throws Throwable;
private static native moom.gc __cast1304_21(java.lang.Object a0) throws Throwable;
private static native void __call1304_22(net.minecraft.client.gui.GuiCreateWorld a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead1304_23(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.Object __call1304_24(java.util.List a0, int a1) throws Throwable;
private static native moom.gc __cast1304_25(java.lang.Object a0) throws Throwable;
private static native moom.hJ __fieldRead1304_26(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1304_27(moom.hJ a0) throws Throwable;
private static native int __call1304_28(java.lang.String a0) throws Throwable;
private static native void __fieldWrite1304_29(moom.gc a0, int a1) throws Throwable;
private static native void __call1304_30(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.Exception __call1130400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1130401_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1130402_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1130403_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1130404_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1130405_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1130406_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b793acb56ac5948c6e51(net.minecraft.client.gui.GuiCreateWorld a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_b793acb56ac5948c6e51 {

public static void f1305(net.minecraft.client.gui.GuiCreateWorld receiver, int p0, int p1, float p2) throws Throwable {
    long life4_3;
    forward_join_304: {
    forward_join_190: {
    forward_join_147: {
    forward_join_115: {
    life4_3 = (__fieldRead1305_0() ^ 125885619360566L);
    __call1305_1(receiver);
    __call1305_6(receiver, __fieldRead1305_2(receiver), __call1305_3("selectWorld.create", new java.lang.Object[0]), (__fieldRead1305_4(receiver) / 2), __invokedynamic1305_5(10024, (7610282248083232618L ^ life4_3)), -1);
    if (!(__fieldRead1305_7(receiver))) { break forward_join_190; }
    __call1305_14(receiver, __fieldRead1305_8(receiver), __call1305_9("selectWorld.enterSeed", new java.lang.Object[0]), ((__fieldRead1305_10(receiver) / 2) - __invokedynamic1305_11(27342, (2938676780378233498L ^ life4_3))), __invokedynamic1305_12(4011, (4170610685226745827L ^ life4_3)), __invokedynamic1305_13(27580, (6458135197329071055L ^ life4_3)));
    __call1305_21(receiver, __fieldRead1305_15(receiver), __call1305_16("selectWorld.seedInfo", new java.lang.Object[0]), ((__fieldRead1305_17(receiver) / 2) - __invokedynamic1305_18(27342, (2938676780378233498L ^ life4_3))), __invokedynamic1305_19(22818, (3726153680255002965L ^ life4_3)), __invokedynamic1305_20(10996, (3484001959126424241L ^ life4_3)));
    if (!(__fieldRead1305_23(__fieldRead1305_22(receiver)))) { break forward_join_115; }
    __call1305_30(receiver, __fieldRead1305_24(receiver), __call1305_25("selectWorld.mapFeatures.info", new java.lang.Object[0]), ((__fieldRead1305_26(receiver) / 2) - __invokedynamic1305_27(24325, (4665837809338691436L ^ life4_3))), __invokedynamic1305_28(8849, (1898100167528796880L ^ life4_3)), __invokedynamic1305_29(10996, (3484001959126424241L ^ life4_3)));
    }
    if (!(__fieldRead1305_32(__fieldRead1305_31(receiver)))) { break forward_join_147; }
    __call1305_39(receiver, __fieldRead1305_33(receiver), __call1305_34("selectWorld.allowCommands.info", new java.lang.Object[0]), ((__fieldRead1305_35(receiver) / 2) - __invokedynamic1305_36(24325, (4665837809338691436L ^ life4_3))), __invokedynamic1305_37(21125, (7049823707797791456L ^ life4_3)), __invokedynamic1305_38(10996, (3484001959126424241L ^ life4_3)));
    }
    __call1305_41(__fieldRead1305_40(receiver));
    if (!(__call1305_44((__fieldRead1305_42())[__fieldRead1305_43(receiver)]))) { break forward_join_304; }
    __call1305_58(__fieldRead1305_45(receiver), __call1305_49(__call1305_48((__fieldRead1305_46())[__fieldRead1305_47(receiver)]), new java.lang.Object[0]), (__fieldRead1305_51(__fieldRead1305_50(receiver)) + 2), (__fieldRead1305_53(__fieldRead1305_52(receiver)) + __invokedynamic1305_54(12635, (2793880613963284749L ^ life4_3))), __call1305_56(__fieldRead1305_55(receiver)), __invokedynamic1305_57(1301, (4565307278797337946L ^ life4_3)));
    break forward_join_304;
    }
    __call1305_65(receiver, __fieldRead1305_59(receiver), __call1305_60("selectWorld.enterName", new java.lang.Object[0]), ((__fieldRead1305_61(receiver) / 2) - __invokedynamic1305_62(27342, (2938676780378233498L ^ life4_3))), __invokedynamic1305_63(3596, (6306411352509414999L ^ life4_3)), __invokedynamic1305_64(10996, (3484001959126424241L ^ life4_3)));
    __call1305_74(receiver, __fieldRead1305_66(receiver), __invokedynamic1305_69(__call1305_67("selectWorld.resultFolder", new java.lang.Object[0]), __fieldRead1305_68(receiver)), ((__fieldRead1305_70(receiver) / 2) - __invokedynamic1305_71(27342, (2938676780378233498L ^ life4_3))), __invokedynamic1305_72(19739, (4608026684513926516L ^ life4_3)), __invokedynamic1305_73(10996, (3484001959126424241L ^ life4_3)));
    __call1305_76(__fieldRead1305_75(receiver));
    __call1305_83(receiver, __fieldRead1305_77(receiver), __fieldRead1305_78(receiver), ((__fieldRead1305_79(receiver) / 2) - __invokedynamic1305_80(27342, (2938676780378233498L ^ life4_3))), __invokedynamic1305_81(6384, (4678550552260634799L ^ life4_3)), __invokedynamic1305_82(10996, (3484001959126424241L ^ life4_3)));
    __call1305_90(receiver, __fieldRead1305_84(receiver), __fieldRead1305_85(receiver), ((__fieldRead1305_86(receiver) / 2) - __invokedynamic1305_87(27342, (2938676780378233498L ^ life4_3))), __invokedynamic1305_88(11499, (3116647884709026952L ^ life4_3)), __invokedynamic1305_89(10996, (3484001959126424241L ^ life4_3)));
    }
    __call1305_91(receiver, p0, p1, p2);
    return;
}
public static void h1305_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130500_0(p0);
}
public static void h1305_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130501_0(p0);
}
public static void h1305_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130502_0(p0);
}
public static void h1305_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130503_0(p0);
}
private static native long __fieldRead1305_0() throws Throwable;
private static native void __call1305_1(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1305_2(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1305_3(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __fieldRead1305_4(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __invokedynamic1305_5(int a0, long a1) throws Throwable;
private static native void __call1305_6(net.minecraft.client.gui.GuiCreateWorld a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native boolean __fieldRead1305_7(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1305_8(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1305_9(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __fieldRead1305_10(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __invokedynamic1305_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_13(int a0, long a1) throws Throwable;
private static native void __call1305_14(net.minecraft.client.gui.GuiCreateWorld a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1305_15(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1305_16(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __fieldRead1305_17(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __invokedynamic1305_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_20(int a0, long a1) throws Throwable;
private static native void __call1305_21(net.minecraft.client.gui.GuiCreateWorld a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native moom.gc __fieldRead1305_22(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead1305_23(moom.gc a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1305_24(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1305_25(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __fieldRead1305_26(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __invokedynamic1305_27(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_28(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_29(int a0, long a1) throws Throwable;
private static native void __call1305_30(net.minecraft.client.gui.GuiCreateWorld a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native moom.gc __fieldRead1305_31(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead1305_32(moom.gc a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1305_33(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1305_34(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __fieldRead1305_35(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __invokedynamic1305_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_38(int a0, long a1) throws Throwable;
private static native void __call1305_39(net.minecraft.client.gui.GuiCreateWorld a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native moom.hJ __fieldRead1305_40(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __call1305_41(moom.hJ a0) throws Throwable;
private static native net.minecraft.world.WorldType[] __fieldRead1305_42() throws Throwable;
private static native int __fieldRead1305_43(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __call1305_44(net.minecraft.world.WorldType a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1305_45(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.world.WorldType[] __fieldRead1305_46() throws Throwable;
private static native int __fieldRead1305_47(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1305_48(net.minecraft.world.WorldType a0) throws Throwable;
private static native java.lang.String __call1305_49(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.gc __fieldRead1305_50(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __fieldRead1305_51(moom.gc a0) throws Throwable;
private static native moom.gc __fieldRead1305_52(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __fieldRead1305_53(moom.gc a0) throws Throwable;
private static native int __invokedynamic1305_54(int a0, long a1) throws Throwable;
private static native moom.gc __fieldRead1305_55(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __call1305_56(moom.gc a0) throws Throwable;
private static native int __invokedynamic1305_57(int a0, long a1) throws Throwable;
private static native void __call1305_58(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1305_59(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1305_60(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __fieldRead1305_61(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __invokedynamic1305_62(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_63(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_64(int a0, long a1) throws Throwable;
private static native void __call1305_65(net.minecraft.client.gui.GuiCreateWorld a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1305_66(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1305_67(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __fieldRead1305_68(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __invokedynamic1305_69(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead1305_70(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __invokedynamic1305_71(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_72(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_73(int a0, long a1) throws Throwable;
private static native void __call1305_74(net.minecraft.client.gui.GuiCreateWorld a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native moom.hJ __fieldRead1305_75(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __call1305_76(moom.hJ a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1305_77(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead1305_78(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __fieldRead1305_79(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __invokedynamic1305_80(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_81(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_82(int a0, long a1) throws Throwable;
private static native void __call1305_83(net.minecraft.client.gui.GuiCreateWorld a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1305_84(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead1305_85(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __fieldRead1305_86(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __invokedynamic1305_87(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_88(int a0, long a1) throws Throwable;
private static native int __invokedynamic1305_89(int a0, long a1) throws Throwable;
private static native void __call1305_90(net.minecraft.client.gui.GuiCreateWorld a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native void __call1305_91(net.minecraft.client.gui.GuiCreateWorld a0, int a1, int a2, float a3) throws Throwable;
private static native java.lang.Exception __call1130500_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130501_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130502_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130503_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_78a2f5687cb290264dae(net.minecraft.client.gui.GuiCreateWorld a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_78a2f5687cb290264dae {

public static void f2231(net.minecraft.client.gui.GuiCreateWorld receiver, int p0, int p1, int p2) throws Throwable {
    __call2231_0(receiver, p0, p1, p2);
    if (__fieldRead2231_1(receiver)) {
        __call2231_3(__fieldRead2231_2(receiver), p0, p1, p2);
    } else {
        __call2231_5(__fieldRead2231_4(receiver), p0, p1, p2);
    }
    return;
}
public static void h2231_0(java.io.IOException p0) throws Throwable {
    throw __call1223100_0(p0);
}
private static native void __call2231_0(net.minecraft.client.gui.GuiCreateWorld a0, int a1, int a2, int a3) throws Throwable;
private static native boolean __fieldRead2231_1(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.hJ __fieldRead2231_2(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __call2231_3(moom.hJ a0, int a1, int a2, int a3) throws Throwable;
private static native moom.hJ __fieldRead2231_4(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __call2231_5(moom.hJ a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1223100_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_12dacd4eb3419e5ab9e4(net.minecraft.client.gui.GuiCreateWorld a0, net.minecraft.world.storage.WorldInfo a1) throws E;
private static final class __SourceHandler_12dacd4eb3419e5ab9e4 {

public static void f2232(net.minecraft.client.gui.GuiCreateWorld receiver, net.minecraft.world.storage.WorldInfo p0) throws Throwable {
    __fieldWrite2232_2(receiver, __call2232_1("selectWorld.newWorld.copyOf", new java.lang.Object[] {__call2232_0(p0)}));
    __fieldWrite2232_5(receiver, __invokedynamic2232_4(__call2232_3(p0)));
    __fieldWrite2232_8(receiver, __call2232_7(__call2232_6(p0)));
    __fieldWrite2232_10(receiver, __call2232_9(p0));
    __fieldWrite2232_12(receiver, __call2232_11(p0));
    __fieldWrite2232_14(receiver, __call2232_13(p0));
    if (__call2232_15(p0)) {
        __fieldWrite2232_16(receiver, "hardcore");
    } else {
        if (__call2232_18(__call2232_17(p0))) {
        __fieldWrite2232_19(receiver, "survival");
    } else {
        if (__call2232_21(__call2232_20(p0))) {
        __fieldWrite2232_22(receiver, "creative");
    }
    }
    }
    return;
}
public static void h2232_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1223200_0(p0);
}
public static void h2232_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1223201_0(p0);
}
public static void h2232_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1223202_0(p0);
}
private static native java.lang.String __call2232_0(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.lang.String __call2232_1(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite2232_2(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native long __call2232_3(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.lang.String __invokedynamic2232_4(long a0) throws Throwable;
private static native void __fieldWrite2232_5(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.WorldType __call2232_6(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __call2232_7(net.minecraft.world.WorldType a0) throws Throwable;
private static native void __fieldWrite2232_8(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native java.lang.String __call2232_9(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __fieldWrite2232_10(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native boolean __call2232_11(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __fieldWrite2232_12(net.minecraft.client.gui.GuiCreateWorld a0, boolean a1) throws Throwable;
private static native boolean __call2232_13(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __fieldWrite2232_14(net.minecraft.client.gui.GuiCreateWorld a0, boolean a1) throws Throwable;
private static native boolean __call2232_15(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __fieldWrite2232_16(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call2232_17(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native boolean __call2232_18(net.minecraft.world.WorldSettings$GameType a0) throws Throwable;
private static native void __fieldWrite2232_19(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call2232_20(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native boolean __call2232_21(net.minecraft.world.WorldSettings$GameType a0) throws Throwable;
private static native void __fieldWrite2232_22(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1223200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1223201_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1223202_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7d6cff202afb44ee01fa(net.minecraft.client.gui.GuiCreateWorld a0, boolean a1) throws E;
private static final class __SourceHandler_7d6cff202afb44ee01fa {

public static void f1306(net.minecraft.client.gui.GuiCreateWorld receiver, boolean p0) throws Throwable {
    moom.gc forwardValue1306_16_0;
    moom.gc forwardValue1306_17_0;
    int forwardValue1306_17_1;
    moom.gc forwardValue1306_61_0;
    moom.gc forwardValue1306_62_0;
    int forwardValue1306_62_1;
    moom.gc forwardValue1306_90_0;
    moom.gc forwardValue1306_91_0;
    int forwardValue1306_91_1;
    moom.gc forwardValue1306_124_0;
    moom.gc forwardValue1306_126_0;
    moom.gc forwardValue1306_127_0;
    int forwardValue1306_127_1;
    moom.gc spill1306_0;
    moom.gc spill1306_1;
    moom.gc spill1306_2;
    moom.gc spill1306_3;
    forward_join_148: {
    forward_join_141: {
    forward_join_128: {
    forward_join_127: {
    forward_join_126: {
    forward_join_124: {
    forward_join_91: {
    forward_join_90: {
    forward_join_77: {
    forward_join_62: {
    forward_join_61: {
    forward_join_54: {
    forward_join_29: {
    forward_join_17: {
    forward_join_16: {
    __fieldWrite1306_0(receiver, p0);
    if (!(((__fieldRead1306_1())[__fieldRead1306_2(receiver)] == __fieldRead1306_3()))) {
        break forward_join_54;
    }
    spill1306_0 = __fieldRead1306_4(receiver);
    if (!((!__fieldRead1306_5(receiver)))) {
        forwardValue1306_16_0 = spill1306_0;
        break forward_join_16;
    }
    forwardValue1306_17_0 = spill1306_0;
    forwardValue1306_17_1 = 1;
    break forward_join_17;
    }
    forwardValue1306_17_0 = forwardValue1306_16_0;
    forwardValue1306_17_1 = 0;
    }
    __fieldWrite1306_6(forwardValue1306_17_0, forwardValue1306_17_1);
    __fieldWrite1306_8(__fieldRead1306_7(receiver), 0);
    if (!((__fieldRead1306_9(receiver) == null))) {
        break forward_join_29;
    }
    __fieldWrite1306_11(receiver, __fieldRead1306_10(receiver));
    }
    __fieldWrite1306_12(receiver, "spectator");
    __fieldWrite1306_14(__fieldRead1306_13(receiver), 0);
    __fieldWrite1306_16(__fieldRead1306_15(receiver), 0);
    __fieldWrite1306_19(__fieldRead1306_17(receiver), __fieldRead1306_18(receiver));
    __fieldWrite1306_21(__fieldRead1306_20(receiver), 0);
    __fieldWrite1306_23(__fieldRead1306_22(receiver), 0);
    break forward_join_128;
    }
    spill1306_1 = __fieldRead1306_24(receiver);
    if (!((!__fieldRead1306_25(receiver)))) {
        forwardValue1306_61_0 = spill1306_1;
        break forward_join_61;
    }
    forwardValue1306_62_0 = spill1306_1;
    forwardValue1306_62_1 = 1;
    break forward_join_62;
    }
    forwardValue1306_62_0 = forwardValue1306_61_0;
    forwardValue1306_62_1 = 0;
    }
    __fieldWrite1306_26(forwardValue1306_62_0, forwardValue1306_62_1);
    __fieldWrite1306_28(__fieldRead1306_27(receiver), 1);
    if (!((__fieldRead1306_29(receiver) != null))) {
        break forward_join_77;
    }
    __fieldWrite1306_31(receiver, __fieldRead1306_30(receiver));
    __fieldWrite1306_32(receiver, null);
    }
    spill1306_2 = __fieldRead1306_33(receiver);
    if (!(__fieldRead1306_34(receiver))) {
        forwardValue1306_90_0 = spill1306_2;
        break forward_join_90;
    }
    if (!(((__fieldRead1306_35())[__fieldRead1306_36(receiver)] != __fieldRead1306_37()))) {
        forwardValue1306_90_0 = spill1306_2;
        break forward_join_90;
    }
    forwardValue1306_91_0 = spill1306_2;
    forwardValue1306_91_1 = 1;
    break forward_join_91;
    }
    forwardValue1306_91_0 = forwardValue1306_90_0;
    forwardValue1306_91_1 = 0;
    }
    __fieldWrite1306_38(forwardValue1306_91_0, forwardValue1306_91_1);
    __fieldWrite1306_41(__fieldRead1306_39(receiver), __fieldRead1306_40(receiver));
    __fieldWrite1306_44(__fieldRead1306_42(receiver), __fieldRead1306_43(receiver));
    __fieldWrite1306_47(__fieldRead1306_45(receiver), __fieldRead1306_46(receiver));
    spill1306_3 = __fieldRead1306_48(receiver);
    if (!(__fieldRead1306_49(receiver))) {
        forwardValue1306_126_0 = spill1306_3;
        break forward_join_126;
    }
    if (!(((__fieldRead1306_50())[__fieldRead1306_51(receiver)] != __fieldRead1306_52()))) {
        forwardValue1306_124_0 = spill1306_3;
        break forward_join_124;
    }
    if (!(((__fieldRead1306_53())[__fieldRead1306_54(receiver)] == __fieldRead1306_55()))) {
        forwardValue1306_126_0 = spill1306_3;
        break forward_join_126;
    }
    forwardValue1306_124_0 = spill1306_3;
    }
    forwardValue1306_127_0 = forwardValue1306_124_0;
    forwardValue1306_127_1 = 1;
    break forward_join_127;
    }
    forwardValue1306_127_0 = forwardValue1306_126_0;
    forwardValue1306_127_1 = 0;
    }
    __fieldWrite1306_56(forwardValue1306_127_0, forwardValue1306_127_1);
    }
    __call1306_57(receiver);
    if (!(__fieldRead1306_58(receiver))) {
        break forward_join_141;
    }
    __fieldWrite1306_61(__fieldRead1306_59(receiver), __call1306_60("gui.done", new java.lang.Object[0]));
    break forward_join_148;
    }
    __fieldWrite1306_64(__fieldRead1306_62(receiver), __call1306_63("selectWorld.moreWorldOptions", new java.lang.Object[0]));
    }
    return;
}
public static void h1306_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130600_0(p0);
}
public static void h1306_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130601_0(p0);
}
public static void h1306_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130602_0(p0);
}
public static void h1306_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130603_0(p0);
}
public static void h1306_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130604_0(p0);
}
public static void h1306_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130605_0(p0);
}
public static void h1306_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130606_0(p0);
}
public static void h1306_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130607_0(p0);
}
public static void h1306_8(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130608_0(p0);
}
public static void h1306_9(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130609_0(p0);
}
public static void h1306_10(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130610_0(p0);
}
private static native void __fieldWrite1306_0(net.minecraft.client.gui.GuiCreateWorld a0, boolean a1) throws Throwable;
private static native net.minecraft.world.WorldType[] __fieldRead1306_1() throws Throwable;
private static native int __fieldRead1306_2(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead1306_3() throws Throwable;
private static native moom.gc __fieldRead1306_4(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead1306_5(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite1306_6(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1306_7(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite1306_8(moom.gc a0, int a1) throws Throwable;
private static native java.lang.String __fieldRead1306_9(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead1306_10(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite1306_11(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1306_12(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native moom.gc __fieldRead1306_13(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite1306_14(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1306_15(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite1306_16(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1306_17(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead1306_18(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite1306_19(moom.gc a0, boolean a1) throws Throwable;
private static native moom.gc __fieldRead1306_20(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite1306_21(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1306_22(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite1306_23(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1306_24(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead1306_25(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite1306_26(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1306_27(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite1306_28(moom.gc a0, int a1) throws Throwable;
private static native java.lang.String __fieldRead1306_29(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead1306_30(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite1306_31(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1306_32(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.Object a1) throws Throwable;
private static native moom.gc __fieldRead1306_33(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead1306_34(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.world.WorldType[] __fieldRead1306_35() throws Throwable;
private static native int __fieldRead1306_36(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead1306_37() throws Throwable;
private static native void __fieldWrite1306_38(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1306_39(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead1306_40(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite1306_41(moom.gc a0, boolean a1) throws Throwable;
private static native moom.gc __fieldRead1306_42(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead1306_43(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite1306_44(moom.gc a0, boolean a1) throws Throwable;
private static native moom.gc __fieldRead1306_45(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead1306_46(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite1306_47(moom.gc a0, boolean a1) throws Throwable;
private static native moom.gc __fieldRead1306_48(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead1306_49(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.world.WorldType[] __fieldRead1306_50() throws Throwable;
private static native int __fieldRead1306_51(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead1306_52() throws Throwable;
private static native net.minecraft.world.WorldType[] __fieldRead1306_53() throws Throwable;
private static native int __fieldRead1306_54(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead1306_55() throws Throwable;
private static native void __fieldWrite1306_56(moom.gc a0, int a1) throws Throwable;
private static native void __call1306_57(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead1306_58(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.gc __fieldRead1306_59(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1306_60(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite1306_61(moom.gc a0, java.lang.String a1) throws Throwable;
private static native moom.gc __fieldRead1306_62(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1306_63(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite1306_64(moom.gc a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1130600_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130601_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130602_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130603_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130604_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130605_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130606_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130607_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130608_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130609_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130610_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8cea4eb9064f4e5b7117(net.minecraft.client.gui.GuiCreateWorld a0, moom.gc a1) throws E;
private static final class __SourceHandler_8cea4eb9064f4e5b7117 {

public static void f551(net.minecraft.client.gui.GuiCreateWorld receiver, moom.gc p0) throws Throwable {
    net.minecraft.client.gui.GuiCreateWorld lexicalValue551_212_0;
    net.minecraft.client.gui.GuiCreateWorld lexicalValue551_213_0;
    int lexicalValue551_213_1;
    net.minecraft.client.gui.GuiCreateWorld lexicalValue551_231_0;
    net.minecraft.client.gui.GuiCreateWorld lexicalValue551_232_0;
    int lexicalValue551_232_1;
    net.minecraft.client.gui.GuiCreateWorld lexicalValue551_299_0;
    net.minecraft.client.gui.GuiCreateWorld lexicalValue551_300_0;
    int lexicalValue551_300_1;
    net.minecraft.client.gui.GuiCreateWorld spill551_0;
    net.minecraft.client.gui.GuiCreateWorld spill551_1;
    net.minecraft.client.gui.GuiCreateWorld spill551_2;
    long life2_3;
    long life4_45;
    java.lang.String life6_49;
    long life7_55;
    net.minecraft.world.WorldSettings$GameType life7_71;
    moom.EK life8_85;
    lexical_join_337: {
    lexical_join_328: {
    lexical_join_304: {
    lexical_join_300: {
    lexical_join_299: {
    lexical_join_282: {
    lexical_join_272: {
    lexical_join_254: {
    lexical_join_236: {
    lexical_join_232: {
    lexical_join_231: {
    lexical_join_217: {
    lexical_join_213: {
    lexical_join_212: {
    lexical_join_202: {
    lexical_join_199: {
    lexical_join_183: {
    lexical_join_177: {
    lexical_join_157: {
    lexical_join_146: {
    lexical_join_126: {
    lexical_join_111: {
    lexical_join_104: {
    lexical_join_93: {
    lexical_join_84: {
    lexical_join_52: {
    lexical_join_28: {
    lexical_join_17: {
    life2_3 = (__fieldRead551_0() ^ 13944332601169L);
    if (!(__fieldRead551_1(p0))) {
        break lexical_join_337;
    }
    if (!((__fieldRead551_2(p0) == 1))) {
        break lexical_join_17;
    }
    __call551_5(__fieldRead551_3(receiver), __fieldRead551_4(receiver));
    break lexical_join_337;
    }
    if (!((__fieldRead551_6(p0) == 0))) {
        break lexical_join_104;
    }
    __call551_8(__fieldRead551_7(receiver), null);
    if (!(__fieldRead551_9(receiver))) {
        break lexical_join_28;
    }
    return;
    }
    __fieldWrite551_10(receiver, 1);
    life4_45 = __call551_11(new java.util.Random());
    life6_49 = __call551_13(__fieldRead551_12(receiver));
    if (!((!__call551_14(life6_49)))) {
        break lexical_join_52;
    }
    life7_55 = __call551_15(life6_49);
    if (!((__numericCompare551_16(life7_55, 0L) != 0))) {
        break lexical_join_52;
    }
    life4_45 = life7_55;
    }
    life7_71 = __call551_18(__fieldRead551_17(receiver));
    life8_85 = new moom.EK(life4_45, life7_71, __fieldRead551_19(receiver), __fieldRead551_20(receiver), (__fieldRead551_21())[__fieldRead551_22(receiver)]);
    __call551_24(life8_85, __fieldRead551_23(receiver));
    if (!(__fieldRead551_25(receiver))) {
        break lexical_join_84;
    }
    if (!((!__fieldRead551_26(receiver)))) {
        break lexical_join_84;
    }
    __call551_27(life8_85);
    }
    if (!(__fieldRead551_28(receiver))) {
        break lexical_join_93;
    }
    if (!((!__fieldRead551_29(receiver)))) {
        break lexical_join_93;
    }
    __call551_30(life8_85);
    }
    __call551_36(__fieldRead551_31(receiver), __fieldRead551_32(receiver), __call551_35(__call551_34(__fieldRead551_33(receiver))), life8_85);
    break lexical_join_337;
    }
    if (!((__fieldRead551_37(p0) == 3))) {
        break lexical_join_111;
    }
    __call551_38(receiver);
    break lexical_join_337;
    }
    if (!((__fieldRead551_39(p0) == 2))) {
        break lexical_join_202;
    }
    if (!(__call551_41(__fieldRead551_40(receiver), "survival"))) {
        break lexical_join_146;
    }
    if (!((!__fieldRead551_42(receiver)))) {
        break lexical_join_126;
    }
    __fieldWrite551_43(receiver, 0);
    }
    __fieldWrite551_44(receiver, 0);
    __fieldWrite551_45(receiver, "hardcore");
    __fieldWrite551_46(receiver, 1);
    __fieldWrite551_48(__fieldRead551_47(receiver), 0);
    __fieldWrite551_50(__fieldRead551_49(receiver), 0);
    __call551_51(receiver);
    break lexical_join_199;
    }
    if (!(__call551_53(__fieldRead551_52(receiver), "hardcore"))) {
        break lexical_join_177;
    }
    if (!((!__fieldRead551_54(receiver)))) {
        break lexical_join_157;
    }
    __fieldWrite551_55(receiver, 1);
    }
    __fieldWrite551_56(receiver, 0);
    __fieldWrite551_57(receiver, "creative");
    __call551_58(receiver);
    __fieldWrite551_59(receiver, 0);
    __fieldWrite551_61(__fieldRead551_60(receiver), 1);
    __fieldWrite551_63(__fieldRead551_62(receiver), 1);
    break lexical_join_199;
    }
    if (!((!__fieldRead551_64(receiver)))) {
        break lexical_join_183;
    }
    __fieldWrite551_65(receiver, 0);
    }
    __fieldWrite551_66(receiver, "survival");
    __call551_67(receiver);
    __fieldWrite551_69(__fieldRead551_68(receiver), 1);
    __fieldWrite551_71(__fieldRead551_70(receiver), 1);
    __fieldWrite551_72(receiver, 0);
    }
    __call551_73(receiver);
    break lexical_join_337;
    }
    if (!((__fieldRead551_74(p0) == 4))) {
        break lexical_join_217;
    }
    spill551_0 = receiver;
    if (!((!__fieldRead551_75(receiver)))) {
        lexicalValue551_212_0 = spill551_0;
        break lexical_join_212;
    }
    lexicalValue551_213_0 = spill551_0;
    lexicalValue551_213_1 = 1;
    break lexical_join_213;
    }
    lexicalValue551_213_0 = lexicalValue551_212_0;
    lexicalValue551_213_1 = 0;
    }
    __fieldWrite551_76(lexicalValue551_213_0, lexicalValue551_213_1);
    __call551_77(receiver);
    break lexical_join_337;
    }
    if (!((__fieldRead551_78(p0) == __invokedynamic551_79(5923, (2144208109439185690L ^ life2_3))))) {
        break lexical_join_236;
    }
    spill551_1 = receiver;
    if (!((!__fieldRead551_80(receiver)))) {
        lexicalValue551_231_0 = spill551_1;
        break lexical_join_231;
    }
    lexicalValue551_232_0 = spill551_1;
    lexicalValue551_232_1 = 1;
    break lexical_join_232;
    }
    lexicalValue551_232_0 = lexicalValue551_231_0;
    lexicalValue551_232_1 = 0;
    }
    __fieldWrite551_81(lexicalValue551_232_0, lexicalValue551_232_1);
    __call551_82(receiver);
    break lexical_join_337;
    }
    if (!((__fieldRead551_83(p0) == 5))) {
        break lexical_join_282;
    }
    net.minecraft.client.gui.GuiCreateWorld __stackOp551_84_0 = receiver;
    __fieldWrite551_86(__stackOp551_84_0, (__fieldRead551_85(__stackOp551_84_0) + 1));
    if (!((__fieldRead551_87(receiver) >= (__fieldRead551_88()).length))) {
        break lexical_join_254;
    }
    __fieldWrite551_89(receiver, 0);
    }
    lexical_cycle_254: while (true) {
    if (!((!__call551_90(receiver)))) {
        break lexical_join_272;
    }
    net.minecraft.client.gui.GuiCreateWorld __stackOp551_91_0 = receiver;
    __fieldWrite551_93(__stackOp551_91_0, (__fieldRead551_92(__stackOp551_91_0) + 1));
    if (!((__fieldRead551_94(receiver) >= (__fieldRead551_95()).length))) { continue lexical_cycle_254; }
    __fieldWrite551_96(receiver, 0);
    continue lexical_cycle_254;
    }
    }
    __fieldWrite551_97(receiver, "");
    __call551_98(receiver);
    __call551_100(receiver, __fieldRead551_99(receiver));
    break lexical_join_337;
    }
    if (!((__fieldRead551_101(p0) == __invokedynamic551_102(14768, (1246452801990516151L ^ life2_3))))) {
        break lexical_join_304;
    }
    __fieldWrite551_103(receiver, 1);
    spill551_2 = receiver;
    if (!((!__fieldRead551_104(receiver)))) {
        lexicalValue551_299_0 = spill551_2;
        break lexical_join_299;
    }
    lexicalValue551_300_0 = spill551_2;
    lexicalValue551_300_1 = 1;
    break lexical_join_300;
    }
    lexicalValue551_300_0 = lexicalValue551_299_0;
    lexicalValue551_300_1 = 0;
    }
    __fieldWrite551_105(lexicalValue551_300_0, lexicalValue551_300_1);
    __call551_106(receiver);
    break lexical_join_337;
    }
    if (!((__fieldRead551_107(p0) == __invokedynamic551_108(24109, (7620274693158844988L ^ life2_3))))) {
        break lexical_join_337;
    }
    if (!(((__fieldRead551_109())[__fieldRead551_110(receiver)] == __fieldRead551_111()))) {
        break lexical_join_328;
    }
    __call551_114(__fieldRead551_112(receiver), new moom.gK(receiver, __fieldRead551_113(receiver)));
    break lexical_join_337;
    }
    __call551_117(__fieldRead551_115(receiver), new moom.gN(receiver, __fieldRead551_116(receiver)));
    }
    return;
}
public static void h551_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055100_0(p0);
}
public static void h551_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055101_0(p0);
}
public static void h551_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055102_0(p0);
}
public static void h551_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055103_0(p0);
}
public static void h551_4(java.lang.NumberFormatException p0, net.minecraft.client.gui.GuiCreateWorld p1, long p2, java.lang.String p3, moom.EK p4) throws Throwable {
    java.lang.NumberFormatException life6_2;
    long life2_6;
    net.minecraft.world.WorldSettings$GameType life6_10;
    moom.EK life5_24;
    life6_2 = p0;
    life2_6 = ((long) __call3055104_0(p3));
    life6_10 = __call3055104_2(__fieldRead3055104_1(p1));
    life5_24 = new moom.EK(life2_6, life6_10, __fieldRead3055104_3(p1), __fieldRead3055104_4(p1), (__fieldRead3055104_5())[__fieldRead3055104_6(p1)]);
    __call3055104_8(life5_24, __fieldRead3055104_7(p1));
    if (__fieldRead3055104_9(p1)) {
        if ((!__fieldRead3055104_10(p1))) {
        __call3055104_11(life5_24);
    } else {
        
    }
    } else {
        
    }
    if (__fieldRead3055104_12(p1)) {
        if ((!__fieldRead3055104_13(p1))) {
        __call3055104_14(life5_24);
    } else {
        
    }
    } else {
        
    }
    __call3055104_20(__fieldRead3055104_15(p1), __fieldRead3055104_16(p1), __call3055104_19(__call3055104_18(__fieldRead3055104_17(p1))), life5_24);
    return;
}
public static void h551_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055105_0(p0);
}
public static void h551_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055106_0(p0);
}
public static void h551_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055107_0(p0);
}
public static void h551_8(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055108_0(p0);
}
public static void h551_9(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055109_0(p0);
}
public static void h551_10(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055110_0(p0);
}
public static void h551_11(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055111_0(p0);
}
public static void h551_12(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055112_0(p0);
}
public static void h551_13(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055113_0(p0);
}
public static void h551_14(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055114_0(p0);
}
public static void h551_15(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055115_0(p0);
}
public static void h551_16(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055116_0(p0);
}
public static void h551_17(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055117_0(p0);
}
public static void h551_18(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055118_0(p0);
}
public static void h551_19(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055119_0(p0);
}
public static void h551_20(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055120_0(p0);
}
public static void h551_21(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055121_0(p0);
}
public static void h551_22(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055122_0(p0);
}
public static void h551_23(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055123_0(p0);
}
public static void h551_24(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055124_0(p0);
}
public static void h551_25(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055125_0(p0);
}
public static void h551_26(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3055126_0(p0);
}
private static native long __fieldRead551_0() throws Throwable;
private static native boolean __fieldRead551_1(moom.gc a0) throws Throwable;
private static native int __fieldRead551_2(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead551_3(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead551_4(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __call551_5(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native int __fieldRead551_6(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead551_7(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __call551_8(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native boolean __fieldRead551_9(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_10(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native long __call551_11(java.util.Random a0) throws Throwable;
private static native moom.hJ __fieldRead551_12(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call551_13(moom.hJ a0) throws Throwable;
private static native boolean __call551_14(java.lang.String a0) throws Throwable;
private static native long __call551_15(java.lang.String a0) throws Throwable;
private static native int __numericCompare551_16(long a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead551_17(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call551_18(java.lang.String a0) throws Throwable;
private static native boolean __fieldRead551_19(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead551_20(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.world.WorldType[] __fieldRead551_21() throws Throwable;
private static native int __fieldRead551_22(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead551_23(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.EK __call551_24(moom.EK a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead551_25(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead551_26(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.EK __call551_27(moom.EK a0) throws Throwable;
private static native boolean __fieldRead551_28(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead551_29(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.EK __call551_30(moom.EK a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead551_31(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead551_32(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.hJ __fieldRead551_33(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call551_34(moom.hJ a0) throws Throwable;
private static native java.lang.String __call551_35(java.lang.String a0) throws Throwable;
private static native void __call551_36(net.minecraft.client.Minecraft a0, java.lang.String a1, java.lang.String a2, moom.EK a3) throws Throwable;
private static native int __fieldRead551_37(moom.gc a0) throws Throwable;
private static native void __call551_38(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __fieldRead551_39(moom.gc a0) throws Throwable;
private static native java.lang.String __fieldRead551_40(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __call551_41(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead551_42(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_43(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native void __fieldWrite551_44(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native void __fieldWrite551_45(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite551_46(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native moom.gc __fieldRead551_47(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_48(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead551_49(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_50(moom.gc a0, int a1) throws Throwable;
private static native void __call551_51(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead551_52(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __call551_53(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead551_54(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_55(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native void __fieldWrite551_56(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native void __fieldWrite551_57(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native void __call551_58(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_59(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native moom.gc __fieldRead551_60(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_61(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead551_62(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_63(moom.gc a0, int a1) throws Throwable;
private static native boolean __fieldRead551_64(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_65(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native void __fieldWrite551_66(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native void __call551_67(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.gc __fieldRead551_68(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_69(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead551_70(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_71(moom.gc a0, int a1) throws Throwable;
private static native void __fieldWrite551_72(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native void __call551_73(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __fieldRead551_74(moom.gc a0) throws Throwable;
private static native boolean __fieldRead551_75(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_76(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native void __call551_77(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __fieldRead551_78(moom.gc a0) throws Throwable;
private static native int __invokedynamic551_79(int a0, long a1) throws Throwable;
private static native boolean __fieldRead551_80(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_81(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native void __call551_82(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __fieldRead551_83(moom.gc a0) throws Throwable;
private static native int __fieldRead551_85(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_86(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native int __fieldRead551_87(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.world.WorldType[] __fieldRead551_88() throws Throwable;
private static native void __fieldWrite551_89(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native boolean __call551_90(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __fieldRead551_92(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_93(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native int __fieldRead551_94(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.world.WorldType[] __fieldRead551_95() throws Throwable;
private static native void __fieldWrite551_96(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native void __fieldWrite551_97(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native void __call551_98(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead551_99(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __call551_100(net.minecraft.client.gui.GuiCreateWorld a0, boolean a1) throws Throwable;
private static native int __fieldRead551_101(moom.gc a0) throws Throwable;
private static native int __invokedynamic551_102(int a0, long a1) throws Throwable;
private static native void __fieldWrite551_103(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native boolean __fieldRead551_104(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __fieldWrite551_105(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native void __call551_106(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native int __fieldRead551_107(moom.gc a0) throws Throwable;
private static native int __invokedynamic551_108(int a0, long a1) throws Throwable;
private static native net.minecraft.world.WorldType[] __fieldRead551_109() throws Throwable;
private static native int __fieldRead551_110(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead551_111() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead551_112(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead551_113(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __call551_114(net.minecraft.client.Minecraft a0, moom.gK a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead551_115(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead551_116(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __call551_117(net.minecraft.client.Minecraft a0, moom.gN a1) throws Throwable;
private static native java.lang.Exception __call3055100_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055101_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055102_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055103_0(java.lang.NumberFormatException a0) throws Throwable;
private static native int __call3055104_0(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead3055104_1(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call3055104_2(java.lang.String a0) throws Throwable;
private static native boolean __fieldRead3055104_3(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead3055104_4(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native net.minecraft.world.WorldType[] __fieldRead3055104_5() throws Throwable;
private static native int __fieldRead3055104_6(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead3055104_7(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.EK __call3055104_8(moom.EK a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead3055104_9(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead3055104_10(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.EK __call3055104_11(moom.EK a0) throws Throwable;
private static native boolean __fieldRead3055104_12(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead3055104_13(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.EK __call3055104_14(moom.EK a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3055104_15(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead3055104_16(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.hJ __fieldRead3055104_17(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call3055104_18(moom.hJ a0) throws Throwable;
private static native java.lang.String __call3055104_19(java.lang.String a0) throws Throwable;
private static native void __call3055104_20(net.minecraft.client.Minecraft a0, java.lang.String a1, java.lang.String a2, moom.EK a3) throws Throwable;
private static native java.lang.Exception __call3055105_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055106_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055107_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055108_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055109_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055110_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055111_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055112_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055113_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055114_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055115_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055116_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055117_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055118_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055119_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055120_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055121_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055122_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055123_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055124_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055125_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3055126_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_77abc389ca016bc72174(net.minecraft.client.gui.GuiCreateWorld a0) throws E;
private static final class __SourceHandler_77abc389ca016bc72174 {

public static void f1307(net.minecraft.client.gui.GuiCreateWorld receiver) throws Throwable {
    forward_join_154: {
    forward_join_143: {
    forward_join_101: {
    forward_join_90: {
    forward_join_64: {
    forward_join_53: {
    __fieldWrite1307_6(__fieldRead1307_0(receiver), __invokedynamic1307_5(__call1307_1("selectWorld.gameMode", new java.lang.Object[0]), __call1307_4(__invokedynamic1307_3(__fieldRead1307_2(receiver)), new java.lang.Object[0])));
    __fieldWrite1307_10(receiver, __call1307_9(__invokedynamic1307_8(__fieldRead1307_7(receiver)), new java.lang.Object[0]));
    __fieldWrite1307_14(receiver, __call1307_13(__invokedynamic1307_12(__fieldRead1307_11(receiver)), new java.lang.Object[0]));
    __fieldWrite1307_18(__fieldRead1307_15(receiver), __invokedynamic1307_17(__call1307_16("selectWorld.mapFeatures", new java.lang.Object[0])));
    if (!(__fieldRead1307_19(receiver))) { break forward_join_53; }
    __fieldWrite1307_25(__fieldRead1307_20(receiver), __invokedynamic1307_24(__fieldRead1307_22(__fieldRead1307_21(receiver)), __call1307_23("options.on", new java.lang.Object[0])));
    break forward_join_64;
    }
    __fieldWrite1307_31(__fieldRead1307_26(receiver), __invokedynamic1307_30(__fieldRead1307_28(__fieldRead1307_27(receiver)), __call1307_29("options.off", new java.lang.Object[0])));
    }
    __fieldWrite1307_35(__fieldRead1307_32(receiver), __invokedynamic1307_34(__call1307_33("selectWorld.bonusItems", new java.lang.Object[0])));
    if (!(__fieldRead1307_36(receiver))) { break forward_join_90; }
    if (!((!__fieldRead1307_37(receiver)))) { break forward_join_90; }
    __fieldWrite1307_43(__fieldRead1307_38(receiver), __invokedynamic1307_42(__fieldRead1307_40(__fieldRead1307_39(receiver)), __call1307_41("options.on", new java.lang.Object[0])));
    break forward_join_101;
    }
    __fieldWrite1307_49(__fieldRead1307_44(receiver), __invokedynamic1307_48(__fieldRead1307_46(__fieldRead1307_45(receiver)), __call1307_47("options.off", new java.lang.Object[0])));
    }
    __fieldWrite1307_57(__fieldRead1307_50(receiver), __invokedynamic1307_56(__call1307_51("selectWorld.mapType", new java.lang.Object[0]), __call1307_55(__call1307_54((__fieldRead1307_52())[__fieldRead1307_53(receiver)]), new java.lang.Object[0])));
    __fieldWrite1307_61(__fieldRead1307_58(receiver), __invokedynamic1307_60(__call1307_59("selectWorld.allowCommands", new java.lang.Object[0])));
    if (!(__fieldRead1307_62(receiver))) { break forward_join_143; }
    if (!((!__fieldRead1307_63(receiver)))) { break forward_join_143; }
    __fieldWrite1307_69(__fieldRead1307_64(receiver), __invokedynamic1307_68(__fieldRead1307_66(__fieldRead1307_65(receiver)), __call1307_67("options.on", new java.lang.Object[0])));
    break forward_join_154;
    }
    __fieldWrite1307_75(__fieldRead1307_70(receiver), __invokedynamic1307_74(__fieldRead1307_72(__fieldRead1307_71(receiver)), __call1307_73("options.off", new java.lang.Object[0])));
    }
    return;
}
public static void h1307_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130700_0(p0);
}
public static void h1307_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130701_0(p0);
}
public static void h1307_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130702_0(p0);
}
public static void h1307_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130703_0(p0);
}
public static void h1307_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130704_0(p0);
}
private static native moom.gc __fieldRead1307_0(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1307_1(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __fieldRead1307_2(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __invokedynamic1307_3(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1307_4(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic1307_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1307_6(moom.gc a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead1307_7(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __invokedynamic1307_8(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1307_9(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite1307_10(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead1307_11(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __invokedynamic1307_12(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1307_13(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite1307_14(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native moom.gc __fieldRead1307_15(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1307_16(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic1307_17(java.lang.String a0) throws Throwable;
private static native void __fieldWrite1307_18(moom.gc a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead1307_19(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.gc __fieldRead1307_20(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.gc __fieldRead1307_21(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead1307_22(moom.gc a0) throws Throwable;
private static native java.lang.String __call1307_23(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic1307_24(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1307_25(moom.gc a0, java.lang.String a1) throws Throwable;
private static native moom.gc __fieldRead1307_26(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.gc __fieldRead1307_27(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead1307_28(moom.gc a0) throws Throwable;
private static native java.lang.String __call1307_29(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic1307_30(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1307_31(moom.gc a0, java.lang.String a1) throws Throwable;
private static native moom.gc __fieldRead1307_32(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1307_33(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic1307_34(java.lang.String a0) throws Throwable;
private static native void __fieldWrite1307_35(moom.gc a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead1307_36(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead1307_37(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.gc __fieldRead1307_38(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.gc __fieldRead1307_39(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead1307_40(moom.gc a0) throws Throwable;
private static native java.lang.String __call1307_41(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic1307_42(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1307_43(moom.gc a0, java.lang.String a1) throws Throwable;
private static native moom.gc __fieldRead1307_44(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.gc __fieldRead1307_45(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead1307_46(moom.gc a0) throws Throwable;
private static native java.lang.String __call1307_47(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic1307_48(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1307_49(moom.gc a0, java.lang.String a1) throws Throwable;
private static native moom.gc __fieldRead1307_50(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1307_51(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.world.WorldType[] __fieldRead1307_52() throws Throwable;
private static native int __fieldRead1307_53(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1307_54(net.minecraft.world.WorldType a0) throws Throwable;
private static native java.lang.String __call1307_55(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic1307_56(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1307_57(moom.gc a0, java.lang.String a1) throws Throwable;
private static native moom.gc __fieldRead1307_58(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __call1307_59(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic1307_60(java.lang.String a0) throws Throwable;
private static native void __fieldWrite1307_61(moom.gc a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead1307_62(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __fieldRead1307_63(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.gc __fieldRead1307_64(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.gc __fieldRead1307_65(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead1307_66(moom.gc a0) throws Throwable;
private static native java.lang.String __call1307_67(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic1307_68(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1307_69(moom.gc a0, java.lang.String a1) throws Throwable;
private static native moom.gc __fieldRead1307_70(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native moom.gc __fieldRead1307_71(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native java.lang.String __fieldRead1307_72(moom.gc a0) throws Throwable;
private static native java.lang.String __call1307_73(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic1307_74(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1307_75(moom.gc a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1130700_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130701_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130702_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130703_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130704_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_eb07ec237b5619b0ad80(net.minecraft.client.gui.GuiCreateWorld a0) throws E;
private static final class __SourceHandler_eb07ec237b5619b0ad80 {

public static boolean f1308(net.minecraft.client.gui.GuiCreateWorld receiver) throws Throwable {
    int forwardValue1308_18_0;
    net.minecraft.world.WorldType life1_4;
    forward_join_18: {
    forward_join_17: {
    forward_join_15: {
    life1_4 = (__fieldRead1308_0())[__fieldRead1308_1(receiver)];
    if (!((life1_4 != null))) {
        break forward_join_17;
    }
    if (!(__call1308_2(life1_4))) {
        break forward_join_17;
    }
    if (!((life1_4 == __fieldRead1308_3()))) {
        break forward_join_15;
    }
    if (!(__call1308_4())) {
        break forward_join_17;
    }
    }
    forwardValue1308_18_0 = 1;
    break forward_join_18;
    }
    forwardValue1308_18_0 = 0;
    }
    return __integerCategory1308_5(forwardValue1308_18_0);
}
public static void h1308_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130800_0(p0);
}
public static void h1308_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130801_0(p0);
}
public static void h1308_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130802_0(p0);
}
public static void h1308_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1130803_0(p0);
}
private static native net.minecraft.world.WorldType[] __fieldRead1308_0() throws Throwable;
private static native int __fieldRead1308_1(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native boolean __call1308_2(net.minecraft.world.WorldType a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead1308_3() throws Throwable;
private static native boolean __call1308_4() throws Throwable;
private static native boolean __integerCategory1308_5(int value) throws Throwable;
private static native java.lang.Exception __call1130800_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130801_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130802_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1130803_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_617dd068948edf0fdc59(net.minecraft.client.gui.GuiCreateWorld a0) throws E;
private static final class __SourceHandler_617dd068948edf0fdc59 {

public static void f2237(net.minecraft.client.gui.GuiCreateWorld receiver) throws Throwable {
    net.minecraft.client.gui.GuiCreateWorld spill2237_0 = receiver;
    __call2237_1(spill2237_0, ((!__fieldRead2237_0(receiver)) ? 1 : 0));
    return;
}
public static void h2237_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1223700_0(p0);
}
private static native boolean __fieldRead2237_0(net.minecraft.client.gui.GuiCreateWorld a0) throws Throwable;
private static native void __call2237_1(net.minecraft.client.gui.GuiCreateWorld a0, int a1) throws Throwable;
private static native java.lang.Exception __call1223700_0(java.lang.NumberFormatException a0) throws Throwable;

}


private void b() { __sourceHandlerCall_77abc389ca016bc72174(this); }


private boolean e__Boolean() { return __sourceHandlerCall_eb07ec237b5619b0ad80(this); }


public void c__Void() {
java.util.List spill100145_0;
    moom.gc spill100145_1;
    java.util.List spill100145_2;
    moom.gc spill100145_3;
    java.util.List spill100145_4;
    moom.gc spill100145_5;
    java.util.List spill100145_6;
    moom.gc spill100145_7;
    java.util.List spill100145_8;
    moom.gc spill100145_9;
    java.util.List spill100145_10;
    moom.gc spill100145_11;
    java.util.List spill100145_12;
    moom.gc spill100145_13;
    long life1_3;
    life1_3 = (net.minecraft.client.gui.GuiCreateWorld.X ^ 87009718589104L);
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(true)));
    ((java.util.List)(this.m)).clear();
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(0, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_6(22092, (1823290568672715660L ^ life1_3))), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_8(9136, (3791549069655823950L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_9(9188, (8787659692137502214L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_10(20303, (5429582734792440474L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.create")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(1, ((this.k / 2) + 5), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_16(8473, (9165092302134760657L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_17(24325, (4665834323985410794L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_18(10024, (7610267801965023980L ^ life1_3)), moom.oO.a(((java.lang.String)("gui.cancel")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    spill100145_0 = this.m;
    net.minecraft.client.gui.GuiCreateWorld __stackOp100145_28_0 = this;
    moom.gc __stackOp100145_28_1 = new moom.gc(2, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_23(31527, (8012349615944109816L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_24(7014, (1792210406144011929L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_25(24325, (4665834323985410794L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_26(10024, (7610267801965023980L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.gameMode")), ((java.lang.Object[])(new java.lang.Object[0]))));
    spill100145_1 = __stackOp100145_28_1;
    ((net.minecraft.client.gui.GuiCreateWorld)(__stackOp100145_28_0)).J = ((moom.gc)(__stackOp100145_28_1));
    ((java.util.List)(spill100145_0)).add(((java.lang.Object)(spill100145_1)));
    spill100145_2 = this.m;
    net.minecraft.client.gui.GuiCreateWorld __stackOp100145_38_0 = this;
    moom.gc __stackOp100145_38_1 = new moom.gc(3, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_33(1919, (5950169553831490194L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_34(14826, (7903428569982323774L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_35(24325, (4665834323985410794L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_36(10024, (7610267801965023980L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.moreWorldOptions")), ((java.lang.Object[])(new java.lang.Object[0]))));
    spill100145_3 = __stackOp100145_38_1;
    ((net.minecraft.client.gui.GuiCreateWorld)(__stackOp100145_38_0)).K = ((moom.gc)(__stackOp100145_38_1));
    ((java.util.List)(spill100145_2)).add(((java.lang.Object)(spill100145_3)));
    spill100145_4 = this.m;
    net.minecraft.client.gui.GuiCreateWorld __stackOp100145_48_0 = this;
    moom.gc __stackOp100145_48_1 = new moom.gc(4, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_43(14958, (5723253726965649290L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_44(10715, (6004837550004296712L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_45(24325, (4665834323985410794L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_46(10024, (7610267801965023980L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.mapFeatures")), ((java.lang.Object[])(new java.lang.Object[0]))));
    spill100145_5 = __stackOp100145_48_1;
    ((net.minecraft.client.gui.GuiCreateWorld)(__stackOp100145_48_0)).L = ((moom.gc)(__stackOp100145_48_1));
    ((java.util.List)(spill100145_4)).add(((java.lang.Object)(spill100145_5)));
    ((moom.gc)(this.L)).n = ((boolean)(false));
    spill100145_6 = this.m;
    net.minecraft.client.gui.GuiCreateWorld __stackOp100145_60_0 = this;
    moom.gc __stackOp100145_60_1 = new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic100145_54(12948, (3439731747542943614L ^ life1_3)), ((this.k / 2) + 5), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_56(28501, (3508088772447247002L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_57(24325, (4665834323985410794L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_58(10024, (7610267801965023980L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.bonusItems")), ((java.lang.Object[])(new java.lang.Object[0]))));
    spill100145_7 = __stackOp100145_60_1;
    ((net.minecraft.client.gui.GuiCreateWorld)(__stackOp100145_60_0)).M = ((moom.gc)(__stackOp100145_60_1));
    ((java.util.List)(spill100145_6)).add(((java.lang.Object)(spill100145_7)));
    ((moom.gc)(this.M)).n = ((boolean)(false));
    spill100145_8 = this.m;
    net.minecraft.client.gui.GuiCreateWorld __stackOp100145_71_0 = this;
    moom.gc __stackOp100145_71_1 = new moom.gc(5, ((this.k / 2) + 5), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_67(27342, (2938734730237157148L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_68(24325, (4665834323985410794L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_69(10024, (7610267801965023980L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.mapType")), ((java.lang.Object[])(new java.lang.Object[0]))));
    spill100145_9 = __stackOp100145_71_1;
    ((net.minecraft.client.gui.GuiCreateWorld)(__stackOp100145_71_0)).N = ((moom.gc)(__stackOp100145_71_1));
    ((java.util.List)(spill100145_8)).add(((java.lang.Object)(spill100145_9)));
    ((moom.gc)(this.N)).n = ((boolean)(false));
    spill100145_10 = this.m;
    net.minecraft.client.gui.GuiCreateWorld __stackOp100145_84_0 = this;
    moom.gc __stackOp100145_84_1 = new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic100145_77(25950, (2400171013921280155L ^ life1_3)), ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_79(14958, (5723253726965649290L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_80(22200, (1699940933031076682L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_81(24325, (4665834323985410794L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_82(10024, (7610267801965023980L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.allowCommands")), ((java.lang.Object[])(new java.lang.Object[0]))));
    spill100145_11 = __stackOp100145_84_1;
    ((net.minecraft.client.gui.GuiCreateWorld)(__stackOp100145_84_0)).O = ((moom.gc)(__stackOp100145_84_1));
    ((java.util.List)(spill100145_10)).add(((java.lang.Object)(spill100145_11)));
    ((moom.gc)(this.O)).n = ((boolean)(false));
    spill100145_12 = this.m;
    net.minecraft.client.gui.GuiCreateWorld __stackOp100145_96_0 = this;
    moom.gc __stackOp100145_96_1 = new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic100145_90(22131, (6571879279517311901L ^ life1_3)), ((this.k / 2) + 5), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_92(13697, (622488643292774509L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_93(24325, (4665834323985410794L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_94(10024, (7610267801965023980L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.customizeType")), ((java.lang.Object[])(new java.lang.Object[0]))));
    spill100145_13 = __stackOp100145_96_1;
    ((net.minecraft.client.gui.GuiCreateWorld)(__stackOp100145_96_0)).P = ((moom.gc)(__stackOp100145_96_1));
    ((java.util.List)(spill100145_12)).add(((java.lang.Object)(spill100145_13)));
    ((moom.gc)(this.P)).n = ((boolean)(false));
    this.x = ((moom.hJ)(new moom.hJ(__sourceIntrinsic_7ac46ee229a8_invokedynamic100145_101(19581, (5797391836404431258L ^ life1_3)), this.p, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_104(27342, (2938734730237157148L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_105(16505, (8135413127109850555L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_106(31840, (908993913850300820L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_107(10024, (7610267801965023980L ^ life1_3)))));
    ((moom.hJ)(this.x)).b(((boolean)(true)));
    ((moom.hJ)(this.x)).a(((java.lang.String)(this.T)));
    this.y = ((moom.hJ)(new moom.hJ(__sourceIntrinsic_7ac46ee229a8_invokedynamic100145_114(21558, (2980167932853821918L ^ life1_3)), this.p, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_117(27342, (2938734730237157148L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_118(32164, (8215879103991711866L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_119(23203, (1222575751007547241L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_120(10024, (7610267801965023980L ^ life1_3)))));
    ((moom.hJ)(this.y)).a(((java.lang.String)(this.S)));
    ((net.minecraft.client.gui.GuiCreateWorld)(this)).a(((boolean)(this.I)));
    ((net.minecraft.client.gui.GuiCreateWorld)(this)).a();
    ((net.minecraft.client.gui.GuiCreateWorld)(this)).b();
    return;
}


public void h() {
org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10233_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.world.storage.WorldInfo p0) { __sourceHandlerCall_12dacd4eb3419e5ab9e4(this, p0); }


public void a(int p0, int p1, float p2) { __sourceHandlerCall_b793acb56ac5948c6e51(this, p0, p1, p2); }


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_78a2f5687cb290264dae(this, p0, p1, p2); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiCreateWorld.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9905;
      if (Z[var3] == null) {
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
         long var5 = Y[var3];
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
         Object[] var9 = (Object[])ab.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               ab.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gL", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Z[var3] = var15;
      }

      return Z[var3];
}


private void a() {
long life1_3;
    char[] life3_11;
    int life4_14;
    int life5_16;
    int life6_23;
    life1_3 = (net.minecraft.client.gui.GuiCreateWorld.X ^ 19878143344451L);
    this.z = ((java.lang.String)(((java.lang.String)(((moom.hJ)(this.x)).a__String())).trim()));
    life3_11 = moom.CH.a;
    life4_14 = (life3_11).length;
    life5_16 = 0;
    loop_region_17: while ((life5_16 < life4_14)) {
        life6_23 = ((int)((life3_11)[life5_16]));
        this.z = ((java.lang.String)(((java.lang.String)(this.z)).replace(((char)(life6_23)), ((char)(__sourceIntrinsic_2c8ae721fed4_invokedynamic2271_8(20642, (4041516022291418256L ^ life1_3)))))));
        life5_16 += 1;
    }
    try {
        if (org.apache.commons.lang3.StringUtils.isEmpty(((java.lang.CharSequence)(this.z)))) {
        this.z = ((java.lang.String)("World"));
    }
    } catch (java.lang.NumberFormatException caught_rethrow_0) {
        throw net.minecraft.client.gui.GuiCreateWorld.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    this.z = ((java.lang.String)(net.minecraft.client.gui.GuiCreateWorld.a(((net.minecraft.world.storage.ISaveFormat)(((net.minecraft.client.Minecraft)(this.i)).a__IK())), ((java.lang.String)(this.z)))));
    return;
}


public static java.lang.String a(net.minecraft.world.storage.ISaveFormat p0, java.lang.String p1) {
java.lang.StringBuilder life2_7;
    java.lang.String[] life3_9;
    int life4_12;
    int life5_14;
    java.lang.String life6_21;
    java.lang.String life1_37;
    life2_7 = new java.lang.StringBuilder(((java.lang.String)(p1)).replaceAll(((java.lang.String)("[\\./\"]")), ((java.lang.String)("_"))));
    life3_9 = net.minecraft.client.gui.GuiCreateWorld.W;
    life4_12 = (life3_9).length;
    life5_14 = 0;
    while ((life5_14 < life4_12)) {
        life6_21 = (life3_9)[life5_14];
        if (((java.lang.String)(((java.lang.StringBuilder)(life2_7)).toString())).equalsIgnoreCase(((java.lang.String)(life6_21)))) {
        life2_7 = new java.lang.StringBuilder(__sourceIntrinsic_dbc2bb03b5b3_invokedynamic8358_4(life2_7));
    }
        life5_14 += 1;
    }
    life1_37 = ((java.lang.StringBuilder)(life2_7)).toString();
    while ((((net.minecraft.world.storage.ISaveFormat)(p0)).a(((java.lang.String)(life1_37))) != null)) {
        life1_37 = __sourceIntrinsic_dbc2bb03b5b3_invokedynamic8358_7(life1_37);
    }
    return life1_37;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_8cea4eb9064f4e5b7117(this, p0); }


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_ed7b0b5a6deba04d9986(this, p0, p1); }


private void a(boolean p0) { __sourceHandlerCall_7d6cff202afb44ee01fa(this, p0); }


public void g() {
((moom.hJ)(this.x)).a__Void();
    ((moom.hJ)(this.y)).a__Void();
    return;
}


private void j() { __sourceHandlerCall_617dd068948edf0fdc59(this); }


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1770_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic2271_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10233_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dbc2bb03b5b3_invokedynamic8358_4(java.lang.StringBuilder a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dbc2bb03b5b3_invokedynamic8358_7(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100145_120(int a0, long a1) throws E;
}
