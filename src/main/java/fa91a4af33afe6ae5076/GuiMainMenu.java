package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiMainMenu extends net.minecraft.client.gui.GuiScreen implements net.minecraft.client.gui.GuiYesNoCallback {

public static java.lang.String w;

private static java.util.concurrent.atomic.AtomicInteger x;

private static org.apache.logging.log4j.Logger y;

private static java.util.Random z;

private static moom.DD A;

private static moom.DD B;

private static moom.DD[] C;

private float D;

private boolean E;

private java.lang.Object F;

public java.lang.String G;

private moom.gc H;

private int I;

private moom.n3 J;

private java.lang.String K;

private java.lang.String L;

private java.lang.String M;

private int N;

private int O;

private int P;

private int Q;

private int R;

private int S;

private moom.DD T;

private boolean U;

private net.minecraft.client.gui.GuiScreen V;

private net.minecraft.client.gui.GuiScreen W;

private static long X;

private static long[] Y;

private static java.lang.Integer[] Z;

private static java.util.Map ab;

private static long cb;

public GuiMainMenu() { super(); __sourceHandlerCall_3277814f32b6d89fed23(this); }


static {
X = ((long)(((moom._a)(moom._c.a(((long)(8161537526353356026L)), ((long)(2593582719891230789L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(172056069478092L)))));
    long local16_life6 = (net.minecraft.client.gui.GuiMainMenu.X ^ 99273712766756L);
    ab = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life9;
    javax.crypto.Cipher __sourceSpill1164_11 = (local5_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1164_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1164_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1164_14 = new byte[8];
    (__sourceSpill1164_14)[0] = ((byte) ((int) (local16_life6 >>> 56)));
    int local6_life15 = 1;
    while ((local6_life15 < 8)) {
        (__sourceSpill1164_14)[local6_life15] = ((byte) ((int) ((local16_life6 << (local6_life15 * 8)) >>> 56)));
        local6_life15 += 1;
    }
    byte[] __sourcePreallocation1164_16 = __sourceSpill1164_14;
    ((javax.crypto.Cipher)(__sourceSpill1164_11)).init(((int)(__sourceSpill1164_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1164_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1164_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local11_life19 = new long[72];
    int local8_life20 = 0;
    java.lang.String local9_life21;
    int local10_life23 = ((java.lang.String)((local9_life21 = "Da\002ºÝ^Y)Â¨âå\\NB\n)jhJmö\003tR.¼W\032©ZÆEfAçoSbJlK,\017ÇÉnMogGùø/ÁoÆ­yØ@3Z£Vm>Òc§+Shï&yw3ïâìfQ3õù>õæ\000ÉÓÌÖÌ¯ºrÄ?dÙØSØé2ßMhBïsH%m\1773øW)±ÜÜõ+?\036ä²Ë½yû±ïèþ0îøg!úÎ2\022V½°@qu\\3ê;>û*\f\035×ò½ù\013V\030!\035HÚé[Ëò\020©5iµ¸Ív\035i\026^\0354Wï\031âw¤¦è¯Íz{\023@ßñªÅA\037\016Ûn/Åí<\025:3 M\030êÔ1¶²\017c\020A\002\027ûñOö1v+N_©CD\bðª\\ÝÀ3ªã½çö|\017:âÎ â¿8v>áð,Ó§\037  A\002\013±ù^¤õ¾¢Ø&^°N­Èo+A\003ðK\024-7×C_²Gòî\f),ee½fAóý´éfP·o®ÕÀÖ\036ê3@\001×f«·êÐ\n*\033\022IXû{,\022\005¨G\036ÇÉÙR\032rô°}\tgtÄ\037¤\027Aõª6ÈîjÐYã i¢\fùõ\026äÞ^ g±\bÜâU5þ¨\003ü×Ì;ÔtÏ,\021P!`Î¿C®³g{¤GçR{\nº \tX£¥\bO\bfJpF\032§\004ÿ½ã¼¸PÌ\032ëW,Ú\004åIË½öÄ4¨=yÓê-)ÔâX8äÇØ2ºïNY\177v®æ"))).length();
    int local7_life24 = 0;
    do {
        java.lang.String __sourceSpill1164_25 = local9_life21;
        int __sourceSpill1164_26 = local7_life24;
        local7_life24 += 8;
        byte[] local12_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1164_25)).substring(((int)(__sourceSpill1164_26)), ((int)(local7_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1164_30 = local11_life19;
        int __sourceSpill1164_31 = local8_life20;
        local8_life20 += 1;
        long local13_life32 = (((((((((((long) (local12_life29)[0]) & 255L) << 56) | ((((long) (local12_life29)[1]) & 255L) << 48)) | ((((long) (local12_life29)[2]) & 255L) << 40)) | ((((long) (local12_life29)[3]) & 255L) << 32)) | ((((long) (local12_life29)[4]) & 255L) << 24)) | ((((long) (local12_life29)[5]) & 255L) << 16)) | ((((long) (local12_life29)[6]) & 255L) << 8)) | (((long) (local12_life29)[7]) & 255L));
        byte[] __sourceSpill1164_33 = new byte[8];
        (__sourceSpill1164_33)[0] = ((byte) ((int) (local13_life32 >>> 56)));
        (__sourceSpill1164_33)[1] = ((byte) ((int) (local13_life32 >>> 48)));
        (__sourceSpill1164_33)[2] = ((byte) ((int) (local13_life32 >>> 40)));
        (__sourceSpill1164_33)[3] = ((byte) ((int) (local13_life32 >>> 32)));
        (__sourceSpill1164_33)[4] = ((byte) ((int) (local13_life32 >>> 24)));
        (__sourceSpill1164_33)[5] = ((byte) ((int) (local13_life32 >>> 16)));
        (__sourceSpill1164_33)[6] = ((byte) ((int) (local13_life32 >>> 8)));
        (__sourceSpill1164_33)[7] = ((byte) ((int) local13_life32));
        javax.crypto.Cipher __sourceSpill1164_34 = local5_life9;
        byte[] local15_life36 = ((javax.crypto.Cipher)(__sourceSpill1164_34)).doFinal(((byte[])(__sourceSpill1164_33)));
        (__sourceSpill1164_30)[__sourceSpill1164_31] = (((((((((((long) (local15_life36)[0]) & 255L) << 56) | ((((long) (local15_life36)[1]) & 255L) << 48)) | ((((long) (local15_life36)[2]) & 255L) << 40)) | ((((long) (local15_life36)[3]) & 255L) << 32)) | ((((long) (local15_life36)[4]) & 255L) << 24)) | ((((long) (local15_life36)[5]) & 255L) << 16)) | ((((long) (local15_life36)[6]) & 255L) << 8)) | (((long) (local15_life36)[7]) & 255L));
    } while ((!(local7_life24 >= local10_life23)));
    local10_life23 = ((java.lang.String)((local9_life21 = "æ4¹\005^ó=£\002`r¹¥kq"))).length();
    local7_life24 = 0;
    do {
        java.lang.String __sourceSpill1164_38 = local9_life21;
        int __sourceSpill1164_39 = local7_life24;
        local7_life24 += 8;
        byte[] local12_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1164_38)).substring(((int)(__sourceSpill1164_39)), ((int)(local7_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1164_43 = local11_life19;
        int __sourceSpill1164_44 = local8_life20;
        local8_life20 += 1;
        long local13_life45 = (((((((((((long) (local12_life42)[0]) & 255L) << 56) | ((((long) (local12_life42)[1]) & 255L) << 48)) | ((((long) (local12_life42)[2]) & 255L) << 40)) | ((((long) (local12_life42)[3]) & 255L) << 32)) | ((((long) (local12_life42)[4]) & 255L) << 24)) | ((((long) (local12_life42)[5]) & 255L) << 16)) | ((((long) (local12_life42)[6]) & 255L) << 8)) | (((long) (local12_life42)[7]) & 255L));
        byte[] __sourceSpill1164_46 = new byte[8];
        (__sourceSpill1164_46)[0] = ((byte) ((int) (local13_life45 >>> 56)));
        (__sourceSpill1164_46)[1] = ((byte) ((int) (local13_life45 >>> 48)));
        (__sourceSpill1164_46)[2] = ((byte) ((int) (local13_life45 >>> 40)));
        (__sourceSpill1164_46)[3] = ((byte) ((int) (local13_life45 >>> 32)));
        (__sourceSpill1164_46)[4] = ((byte) ((int) (local13_life45 >>> 24)));
        (__sourceSpill1164_46)[5] = ((byte) ((int) (local13_life45 >>> 16)));
        (__sourceSpill1164_46)[6] = ((byte) ((int) (local13_life45 >>> 8)));
        (__sourceSpill1164_46)[7] = ((byte) ((int) local13_life45));
        javax.crypto.Cipher __sourceSpill1164_47 = local5_life9;
        byte[] local15_life49 = ((javax.crypto.Cipher)(__sourceSpill1164_47)).doFinal(((byte[])(__sourceSpill1164_46)));
        (__sourceSpill1164_43)[__sourceSpill1164_44] = (((((((((((long) (local15_life49)[0]) & 255L) << 56) | ((((long) (local15_life49)[1]) & 255L) << 48)) | ((((long) (local15_life49)[2]) & 255L) << 40)) | ((((long) (local15_life49)[3]) & 255L) << 32)) | ((((long) (local15_life49)[4]) & 255L) << 24)) | ((((long) (local15_life49)[5]) & 255L) << 16)) | ((((long) (local15_life49)[6]) & 255L) << 8)) | (((long) (local15_life49)[7]) & 255L));
    } while ((!(local7_life24 >= local10_life23)));
    Y = ((long[])(local11_life19));
    Z = ((java.lang.Integer[])(new java.lang.Integer[72]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill1164_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1164_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1164_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1164_58 = new byte[8];
    (__sourceSpill1164_58)[0] = ((byte) ((int) (local16_life6 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill1164_58)[local1_life59] = ((byte) ((int) ((local16_life6 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation1164_60 = __sourceSpill1164_58;
    ((javax.crypto.Cipher)(__sourceSpill1164_55)).init(((int)(__sourceSpill1164_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1164_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1164_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = -1333925481225944307L;
    byte[] __sourceSpill1164_64 = new byte[8];
    (__sourceSpill1164_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill1164_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill1164_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill1164_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill1164_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill1164_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill1164_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill1164_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill1164_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill1164_65)).doFinal(((byte[])(__sourceSpill1164_64)));
    cb = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
    w = ((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1164_71(net.minecraft.util.EnumChatFormatting.UNDERLINE, net.minecraft.util.EnumChatFormatting.RESET)));
    x = ((java.util.concurrent.atomic.AtomicInteger)(new java.util.concurrent.atomic.AtomicInteger(0)));
    y = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    z = ((java.util.Random)(new java.util.Random()));
    A = ((moom.DD)(new moom.DD("texts/splashes.txt")));
    B = ((moom.DD)(new moom.DD("textures/gui/title/minecraft.png")));
    moom.DD[] __sourceSpill1164_80 = new moom.DD[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1164_79(22926, (8913391427447241678L ^ local16_life6))];
    (__sourceSpill1164_80)[0] = new moom.DD("textures/gui/title/background/panorama_0.png");
    (__sourceSpill1164_80)[1] = new moom.DD("textures/gui/title/background/panorama_1.png");
    (__sourceSpill1164_80)[2] = new moom.DD("textures/gui/title/background/panorama_2.png");
    (__sourceSpill1164_80)[3] = new moom.DD("textures/gui/title/background/panorama_3.png");
    (__sourceSpill1164_80)[4] = new moom.DD("textures/gui/title/background/panorama_4.png");
    (__sourceSpill1164_80)[5] = new moom.DD("textures/gui/title/background/panorama_5.png");
    C = ((moom.DD[])(__sourceSpill1164_80));
}

private static native <E extends Throwable> void __sourceHandlerCall_3277814f32b6d89fed23(net.minecraft.client.gui.GuiMainMenu a0) throws E;
private static final class __SourceHandler_3277814f32b6d89fed23 {

public static void f400020(net.minecraft.client.gui.GuiMainMenu receiver) throws Throwable {
    long life1_3;
    java.lang.Object life3_24;
    java.util.ArrayList life4_26;
    java.io.BufferedReader life3_39;
    java.lang.String life5_43;
    java.lang.String life5_47;
    forest_join_108: {
    forest_join_81: {
    forest_join_77: {
    forest_join_56: {
    life1_3 = (__fieldRead400020_0() ^ 46955490446156L);
    __directSuperInit400020_1(receiver);
    __fieldWrite400020_2(receiver, 1);
    __fieldWrite400020_3(receiver, new java.lang.Object());
    __fieldWrite400020_5(receiver, __fieldRead400020_4());
    __fieldWrite400020_6(receiver, 0);
    __fieldWrite400020_7(receiver, "missingno");
    life3_24 = null;
    life4_26 = __call400020_8();
    life3_39 = new java.io.BufferedReader(new java.io.InputStreamReader(__call400020_13(__call400020_12(__call400020_10(__call400020_9()), __fieldRead400020_11())), __fieldRead400020_14()));
    forest_cycle_40: while (true) {
    if (!(((life5_43 = __call400020_15(life3_39)) != null))) {
        break forest_join_56;
    }
    life5_47 = __call400020_16(life5_43);
    if (!((!__call400020_17(life5_47)))) {
        continue forest_cycle_40;
    }
    __call400020_18(life4_26, life5_47);
    continue forest_cycle_40;
    }
    }
    if (!((!__call400020_19(life4_26)))) {
        break forest_join_77;
    }
    forest_cycle_59: while (true) {
    __fieldWrite400020_25(receiver, __cast400020_24(__call400020_23(life4_26, __call400020_22(__fieldRead400020_20(), __call400020_21(life4_26)))));
    if (!((__call400020_27(__fieldRead400020_26(receiver)) != __invokedynamic400020_28(18326, (8117031080689672609L ^ life1_3))))) {
        continue forest_cycle_59;
    }
    break forest_cycle_59;
    }
    }
    if (!((life3_39 != null))) {
        break forest_join_81;
    }
    __call400020_29(life3_39);
    }
    __fieldWrite400020_32(receiver, __call400020_31(__fieldRead400020_30()));
    __fieldWrite400020_33(receiver, "");
    if (!((!__fieldRead400020_35(__call400020_34())))) {
        break forest_join_108;
    }
    if (!((!__call400020_36()))) {
        break forest_join_108;
    }
    __fieldWrite400020_38(receiver, __call400020_37("title.oldgl1", new java.lang.Object[0]));
    __fieldWrite400020_40(receiver, __call400020_39("title.oldgl2", new java.lang.Object[0]));
    __fieldWrite400020_41(receiver, "https://help.mojang.com/customer/portal/articles/325948?ref=game");
    }
    return;
}
public static void h400020_0(java.io.IOException p0) throws Throwable {
    throw __call43002000_0(p0);
}
public static void h400020_1(moom.Oo p0) throws Throwable {
    throw __call43002001_0(p0);
}
public static void h400020_2(java.io.IOException p0, net.minecraft.client.gui.GuiMainMenu p1) throws Throwable {
    java.io.IOException life2_2;
    forest_join_29: {
    life2_2 = p0;
    __fieldWrite43002002_2(p1, __call43002002_1(__fieldRead43002002_0()));
    __fieldWrite43002002_3(p1, "");
    if (!((!__fieldRead43002002_5(__call43002002_4())))) {
        break forest_join_29;
    }
    if (!((!__call43002002_6()))) {
        break forest_join_29;
    }
    __fieldWrite43002002_8(p1, __call43002002_7("title.oldgl1", new java.lang.Object[0]));
    __fieldWrite43002002_10(p1, __call43002002_9("title.oldgl2", new java.lang.Object[0]));
    __fieldWrite43002002_11(p1, "https://help.mojang.com/customer/portal/articles/325948?ref=game");
    }
    return;
}
public static void h400020_3(java.io.IOException p0, net.minecraft.client.gui.GuiMainMenu p1, java.io.BufferedReader p2) throws Throwable {
    java.io.IOException life3_2;
    forest_join_33: {
    forest_join_6: {
    life3_2 = p0;
    if (!((p2 != null))) {
        break forest_join_6;
    }
    __call43002003_0(p2);
    }
    __fieldWrite43002003_3(p1, __call43002003_2(__fieldRead43002003_1()));
    __fieldWrite43002003_4(p1, "");
    if (!((!__fieldRead43002003_6(__call43002003_5())))) {
        break forest_join_33;
    }
    if (!((!__call43002003_7()))) {
        break forest_join_33;
    }
    __fieldWrite43002003_9(p1, __call43002003_8("title.oldgl1", new java.lang.Object[0]));
    __fieldWrite43002003_11(p1, __call43002003_10("title.oldgl2", new java.lang.Object[0]));
    __fieldWrite43002003_12(p1, "https://help.mojang.com/customer/portal/articles/325948?ref=game");
    }
    return;
}
public static void h400020_4(moom.Oo p0) throws Throwable {
    throw __call43002004_0(p0);
}
public static void h400020_5(java.io.IOException p0, net.minecraft.client.gui.GuiMainMenu p1) throws Throwable {
    java.io.IOException life2_2;
    forest_join_29: {
    life2_2 = p0;
    __fieldWrite43002005_2(p1, __call43002005_1(__fieldRead43002005_0()));
    __fieldWrite43002005_3(p1, "");
    if (!((!__fieldRead43002005_5(__call43002005_4())))) {
        break forest_join_29;
    }
    if (!((!__call43002005_6()))) {
        break forest_join_29;
    }
    __fieldWrite43002005_8(p1, __call43002005_7("title.oldgl1", new java.lang.Object[0]));
    __fieldWrite43002005_10(p1, __call43002005_9("title.oldgl2", new java.lang.Object[0]));
    __fieldWrite43002005_11(p1, "https://help.mojang.com/customer/portal/articles/325948?ref=game");
    }
    return;
}
public static void h400020_6(java.lang.Throwable p0, java.io.BufferedReader p1) throws Throwable {
    java.lang.Throwable life2_2;
    forest_join_6: {
    life2_2 = p0;
    if (!((p1 != null))) {
        break forest_join_6;
    }
    __call43002006_0(p1);
    }
    throw life2_2;
}
public static void h400020_7(moom.Oo p0) throws Throwable {
    throw __call43002007_0(p0);
}
public static void h400020_8(java.io.IOException p0, java.lang.Throwable p1) throws Throwable {
    java.io.IOException life2_2;
    life2_2 = p0;
    throw p1;
}
public static void h400020_9(java.io.IOException p0) throws Throwable {
    throw __call43002009_0(p0);
}
public static void h400020_10(java.io.IOException p0) throws Throwable {
    throw __call43002010_0(p0);
}
private static native long __fieldRead400020_0() throws Throwable;
private static native void __directSuperInit400020_1(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __fieldWrite400020_2(net.minecraft.client.gui.GuiMainMenu a0, int a1) throws Throwable;
private static native void __fieldWrite400020_3(net.minecraft.client.gui.GuiMainMenu a0, java.lang.Object a1) throws Throwable;
private static native java.lang.String __fieldRead400020_4() throws Throwable;
private static native void __fieldWrite400020_5(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite400020_6(net.minecraft.client.gui.GuiMainMenu a0, int a1) throws Throwable;
private static native void __fieldWrite400020_7(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native java.util.ArrayList __call400020_8() throws Throwable;
private static native net.minecraft.client.Minecraft __call400020_9() throws Throwable;
private static native moom.oR __call400020_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead400020_11() throws Throwable;
private static native net.minecraft.client.resources.IResource __call400020_12(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call400020_13(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead400020_14() throws Throwable;
private static native java.lang.String __call400020_15(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.String __call400020_16(java.lang.String a0) throws Throwable;
private static native boolean __call400020_17(java.lang.String a0) throws Throwable;
private static native boolean __call400020_18(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native boolean __call400020_19(java.util.ArrayList a0) throws Throwable;
private static native java.util.Random __fieldRead400020_20() throws Throwable;
private static native int __call400020_21(java.util.ArrayList a0) throws Throwable;
private static native int __call400020_22(java.util.Random a0, int a1) throws Throwable;
private static native java.lang.Object __call400020_23(java.util.ArrayList a0, int a1) throws Throwable;
private static native java.lang.String __cast400020_24(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite400020_25(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead400020_26(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __call400020_27(java.lang.String a0) throws Throwable;
private static native int __invokedynamic400020_28(int a0, long a1) throws Throwable;
private static native void __call400020_29(java.io.BufferedReader a0) throws Throwable;
private static native java.util.Random __fieldRead400020_30() throws Throwable;
private static native float __call400020_31(java.util.Random a0) throws Throwable;
private static native void __fieldWrite400020_32(net.minecraft.client.gui.GuiMainMenu a0, float a1) throws Throwable;
private static native void __fieldWrite400020_33(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call400020_34() throws Throwable;
private static native boolean __fieldRead400020_35(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __call400020_36() throws Throwable;
private static native java.lang.String __call400020_37(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite400020_38(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call400020_39(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite400020_40(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite400020_41(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call43002000_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call43002001_0(moom.Oo a0) throws Throwable;
private static native java.util.Random __fieldRead43002002_0() throws Throwable;
private static native float __call43002002_1(java.util.Random a0) throws Throwable;
private static native void __fieldWrite43002002_2(net.minecraft.client.gui.GuiMainMenu a0, float a1) throws Throwable;
private static native void __fieldWrite43002002_3(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call43002002_4() throws Throwable;
private static native boolean __fieldRead43002002_5(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __call43002002_6() throws Throwable;
private static native java.lang.String __call43002002_7(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite43002002_8(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call43002002_9(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite43002002_10(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite43002002_11(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native void __call43002003_0(java.io.BufferedReader a0) throws Throwable;
private static native java.util.Random __fieldRead43002003_1() throws Throwable;
private static native float __call43002003_2(java.util.Random a0) throws Throwable;
private static native void __fieldWrite43002003_3(net.minecraft.client.gui.GuiMainMenu a0, float a1) throws Throwable;
private static native void __fieldWrite43002003_4(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call43002003_5() throws Throwable;
private static native boolean __fieldRead43002003_6(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __call43002003_7() throws Throwable;
private static native java.lang.String __call43002003_8(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite43002003_9(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call43002003_10(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite43002003_11(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite43002003_12(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call43002004_0(moom.Oo a0) throws Throwable;
private static native java.util.Random __fieldRead43002005_0() throws Throwable;
private static native float __call43002005_1(java.util.Random a0) throws Throwable;
private static native void __fieldWrite43002005_2(net.minecraft.client.gui.GuiMainMenu a0, float a1) throws Throwable;
private static native void __fieldWrite43002005_3(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call43002005_4() throws Throwable;
private static native boolean __fieldRead43002005_5(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native boolean __call43002005_6() throws Throwable;
private static native java.lang.String __call43002005_7(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite43002005_8(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call43002005_9(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite43002005_10(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite43002005_11(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native void __call43002006_0(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.Throwable __call43002007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call43002009_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call43002010_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1c8d5df7ed7d7e7c65d1(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_1c8d5df7ed7d7e7c65d1 {

public static void f1311(net.minecraft.client.gui.GuiMainMenu receiver, int p0, int p1, float p2) throws Throwable {
    long life4_3;
    net.minecraft.client.renderer.Tessellator life6_12;
    moom.lw life7_15;
    int life8_21;
    int life9_30;
    int life10_36;
    int life11_42;
    int life12_48;
    int life13_50;
    int life14_56;
    moom.JB life15_58;
    float life16_340;
    float life16_357;
    java.lang.String life17_381;
    java.lang.String life18_405;
    forward_join_504: {
    forward_join_495: {
    forward_join_481: {
    forward_join_375: {
    forward_join_290: {
    forward_join_248: {
    forward_join_101: {
    forward_join_91: {
    forward_join_87: {
    forward_join_77: {
    forward_join_73: {
    life4_3 = (__fieldRead1311_0() ^ 20774637786500L);
    __call1311_1();
    __call1311_2(receiver, p0, p1, p2);
    __call1311_3();
    life6_12 = __call1311_4();
    life7_15 = __call1311_5(life6_12);
    life8_21 = __invokedynamic1311_6(11483, (7958893192269632540L ^ life4_3));
    life9_30 = ((__fieldRead1311_7(receiver) / 2) - (life8_21 / 2));
    life10_36 = __invokedynamic1311_8(2751, (4778589292653982278L ^ life4_3));
    life11_42 = __invokedynamic1311_9(15718, (7233085293448594864L ^ life4_3));
    life12_48 = __invokedynamic1311_10(9836, (8326814687507553926L ^ life4_3));
    life13_50 = 0;
    life14_56 = __invokedynamic1311_11(15200, (5691748671622415266L ^ life4_3));
    life15_58 = __call1311_12();
    if (!((life15_58 != null))) { break forward_join_73; }
    life11_42 = __call1311_13(life15_58);
    life12_48 = __call1311_14(life15_58);
    life13_50 = __call1311_15(life15_58);
    life14_56 = __call1311_16(life15_58);
    }
    if (!((life11_42 == 0))) { break forward_join_77; }
    if (!((life12_48 != 0))) { break forward_join_87; }
    }
    __call1311_19(receiver, 0, 0, __fieldRead1311_17(receiver), __fieldRead1311_18(receiver), life11_42, life12_48);
    }
    if (!((life13_50 == 0))) { break forward_join_91; }
    if (!((life14_56 != 0))) { break forward_join_101; }
    }
    __call1311_22(receiver, 0, 0, __fieldRead1311_20(receiver), __fieldRead1311_21(receiver), life13_50, life14_56);
    }
    __call1311_26(__call1311_24(__fieldRead1311_23(receiver)), __fieldRead1311_25());
    __call1311_27(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    if (!((__numericCompare1311_29(((double) __fieldRead1311_28(receiver)), 0x1.a36e2eb1c432dp-14d) < 0))) { break forward_join_248; }
    __call1311_32(receiver, life9_30, life10_36, 0, 0, __invokedynamic1311_30(8470, (165467998001764814L ^ life4_3)), __invokedynamic1311_31(9582, (4904159839690988985L ^ life4_3)));
    __call1311_37(receiver, (life9_30 + __invokedynamic1311_33(7132, (8346106539075674912L ^ life4_3))), life10_36, __invokedynamic1311_34(17346, (1389164659832748808L ^ life4_3)), 0, __invokedynamic1311_35(23898, (8764979822522033547L ^ life4_3)), __invokedynamic1311_36(30026, (4417705840547548638L ^ life4_3)));
    __call1311_42(receiver, ((life9_30 + __invokedynamic1311_38(7132, (8346106539075674912L ^ life4_3))) + __invokedynamic1311_39(6131, (3199310056373825322L ^ life4_3))), life10_36, __invokedynamic1311_40(11469, (6086326765632984112L ^ life4_3)), 0, 3, __invokedynamic1311_41(30026, (4417705840547548638L ^ life4_3)));
    __call1311_48(receiver, (((life9_30 + __invokedynamic1311_43(7132, (8346106539075674912L ^ life4_3))) + __invokedynamic1311_44(26156, (8800146715927371474L ^ life4_3))) + 3), life10_36, __invokedynamic1311_45(7132, (8346106539075674912L ^ life4_3)), 0, __invokedynamic1311_46(26156, (8800146715927371474L ^ life4_3)), __invokedynamic1311_47(30026, (4417705840547548638L ^ life4_3)));
    __call1311_53(receiver, (life9_30 + __invokedynamic1311_49(3585, (6416361024112965369L ^ life4_3))), life10_36, 0, __invokedynamic1311_50(2621, (4843814550069883590L ^ life4_3)), __invokedynamic1311_51(16409, (8737130924568770776L ^ life4_3)), __invokedynamic1311_52(30026, (4417705840547548638L ^ life4_3)));
    break forward_join_290;
    }
    __call1311_56(receiver, life9_30, life10_36, 0, 0, __invokedynamic1311_54(16409, (8737130924568770776L ^ life4_3)), __invokedynamic1311_55(30026, (4417705840547548638L ^ life4_3)));
    __call1311_61(receiver, (life9_30 + __invokedynamic1311_57(16409, (8737130924568770776L ^ life4_3))), life10_36, 0, __invokedynamic1311_58(9517, (7458896528026312165L ^ life4_3)), __invokedynamic1311_59(16409, (8737130924568770776L ^ life4_3)), __invokedynamic1311_60(30026, (4417705840547548638L ^ life4_3)));
    }
    __call1311_62();
    __call1311_65(((float) ((__fieldRead1311_63(receiver) / 2) + __invokedynamic1311_64(16375, (8209340339816236855L ^ life4_3)))), 0x1.18p6f, 0x0.0p0f);
    __call1311_66(-0x1.4p4f, 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
    life16_340 = (0x1.ccccccp0f - __call1311_70((__call1311_69((((((float) (__call1311_67() % __fieldRead1311_68())) / 0x1.f4p9f) * 0x1.921fb6p1f) * 0x1.0p1f)) * 0x1.99999ap-4f)));
    life16_357 = ((life16_340 * 0x1.9p6f) / ((float) (__call1311_73(__fieldRead1311_71(receiver), __fieldRead1311_72(receiver)) + __invokedynamic1311_74(6178, (1069827383934787791L ^ life4_3)))));
    __call1311_75(life16_357, life16_357, life16_357);
    __call1311_80(receiver, __fieldRead1311_76(receiver), __fieldRead1311_77(receiver), 0, __invokedynamic1311_78(6181, (1064480009332662452L ^ life4_3)), __invokedynamic1311_79(30677, (10323289152606013L ^ life4_3)));
    __call1311_81();
    life17_381 = "Moon Client";
    if (!(__call1311_83(__fieldRead1311_82(receiver)))) { break forward_join_375; }
    life17_381 = __invokedynamic1311_84(life17_381);
    }
    __call1311_88(receiver, __fieldRead1311_85(receiver), life17_381, 2, (__fieldRead1311_86(receiver) - __invokedynamic1311_87(2252, (6708449788027580444L ^ life4_3))), -1);
    life18_405 = "Copyright Mojang AB. Do not distribute!";
    __call1311_95(receiver, __fieldRead1311_89(receiver), life18_405, ((__fieldRead1311_90(receiver) - __call1311_92(__fieldRead1311_91(receiver), life18_405)) - 2), (__fieldRead1311_93(receiver) - __invokedynamic1311_94(14476, (7460988150607609981L ^ life4_3))), -1);
    if (!((__fieldRead1311_96(receiver) != null))) { break forward_join_481; }
    if (!((__call1311_98(__fieldRead1311_97(receiver)) > 0))) { break forward_join_481; }
    __call1311_104((__fieldRead1311_99(receiver) - 2), (__fieldRead1311_100(receiver) - 2), (__fieldRead1311_101(receiver) + 2), (__fieldRead1311_102(receiver) - 1), __invokedynamic1311_103(19262, (7769001505117926357L ^ life4_3)));
    __call1311_109(receiver, __fieldRead1311_105(receiver), __fieldRead1311_106(receiver), __fieldRead1311_107(receiver), __fieldRead1311_108(receiver), -1);
    __call1311_119(receiver, __fieldRead1311_110(receiver), __fieldRead1311_111(receiver), ((__fieldRead1311_112(receiver) - __fieldRead1311_113(receiver)) / 2), (__fieldRead1311_117(__cast1311_116(__call1311_115(__fieldRead1311_114(receiver), 0))) - __invokedynamic1311_118(522, (7937386087942306539L ^ life4_3))), -1);
    }
    __call1311_120(receiver, p0, p1, p2);
    if (!(__call1311_121(receiver))) { break forward_join_495; }
    __call1311_123(__fieldRead1311_122(receiver), p0, p1, p2);
    }
    if (!((__fieldRead1311_124(receiver) != null))) { break forward_join_504; }
    __call1311_126(__fieldRead1311_125(receiver), p0, p1, p2);
    }
    return;
}
public static void h1311_0(moom.Oo p0) throws Throwable {
    throw __call1131100_0(p0);
}
public static void h1311_1(moom.Oo p0) throws Throwable {
    throw __call1131101_0(p0);
}
public static void h1311_2(moom.Oo p0) throws Throwable {
    throw __call1131102_0(p0);
}
public static void h1311_3(moom.Oo p0) throws Throwable {
    throw __call1131103_0(p0);
}
public static void h1311_4(moom.Oo p0) throws Throwable {
    throw __call1131104_0(p0);
}
public static void h1311_5(moom.Oo p0) throws Throwable {
    throw __call1131105_0(p0);
}
public static void h1311_6(moom.Oo p0) throws Throwable {
    throw __call1131106_0(p0);
}
public static void h1311_7(moom.Oo p0) throws Throwable {
    throw __call1131107_0(p0);
}
public static void h1311_8(moom.Oo p0) throws Throwable {
    throw __call1131108_0(p0);
}
private static native long __fieldRead1311_0() throws Throwable;
private static native void __call1311_1() throws Throwable;
private static native void __call1311_2(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, float a3) throws Throwable;
private static native void __call1311_3() throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call1311_4() throws Throwable;
private static native moom.lw __call1311_5(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __invokedynamic1311_6(int a0, long a1) throws Throwable;
private static native int __fieldRead1311_7(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic1311_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_11(int a0, long a1) throws Throwable;
private static native moom.JB __call1311_12() throws Throwable;
private static native int __call1311_13(moom.JB a0) throws Throwable;
private static native int __call1311_14(moom.JB a0) throws Throwable;
private static native int __call1311_15(moom.JB a0) throws Throwable;
private static native int __call1311_16(moom.JB a0) throws Throwable;
private static native int __fieldRead1311_17(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead1311_18(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call1311_19(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __fieldRead1311_20(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead1311_21(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call1311_22(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1311_23(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1311_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead1311_25() throws Throwable;
private static native void __call1311_26(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call1311_27(float a0, float a1, float a2, float a3) throws Throwable;
private static native float __fieldRead1311_28(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __numericCompare1311_29(double a0, double a1) throws Throwable;
private static native int __invokedynamic1311_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_31(int a0, long a1) throws Throwable;
private static native void __call1311_32(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic1311_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_36(int a0, long a1) throws Throwable;
private static native void __call1311_37(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic1311_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_41(int a0, long a1) throws Throwable;
private static native void __call1311_42(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic1311_43(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_44(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_45(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_46(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_47(int a0, long a1) throws Throwable;
private static native void __call1311_48(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic1311_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_50(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_51(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_52(int a0, long a1) throws Throwable;
private static native void __call1311_53(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic1311_54(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_55(int a0, long a1) throws Throwable;
private static native void __call1311_56(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic1311_57(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_58(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_59(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_60(int a0, long a1) throws Throwable;
private static native void __call1311_61(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call1311_62() throws Throwable;
private static native int __fieldRead1311_63(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic1311_64(int a0, long a1) throws Throwable;
private static native void __call1311_65(float a0, float a1, float a2) throws Throwable;
private static native void __call1311_66(float a0, float a1, float a2, float a3) throws Throwable;
private static native long __call1311_67() throws Throwable;
private static native long __fieldRead1311_68() throws Throwable;
private static native float __call1311_69(float a0) throws Throwable;
private static native float __call1311_70(float a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1311_71(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native java.lang.String __fieldRead1311_72(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __call1311_73(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1311_74(int a0, long a1) throws Throwable;
private static native void __call1311_75(float a0, float a1, float a2) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1311_76(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native java.lang.String __fieldRead1311_77(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic1311_78(int a0, long a1) throws Throwable;
private static native int __invokedynamic1311_79(int a0, long a1) throws Throwable;
private static native void __call1311_80(net.minecraft.client.gui.GuiMainMenu a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native void __call1311_81() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1311_82(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native boolean __call1311_83(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __invokedynamic1311_84(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1311_85(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead1311_86(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic1311_87(int a0, long a1) throws Throwable;
private static native void __call1311_88(net.minecraft.client.gui.GuiMainMenu a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1311_89(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead1311_90(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1311_91(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __call1311_92(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead1311_93(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic1311_94(int a0, long a1) throws Throwable;
private static native void __call1311_95(net.minecraft.client.gui.GuiMainMenu a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native java.lang.String __fieldRead1311_96(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native java.lang.String __fieldRead1311_97(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __call1311_98(java.lang.String a0) throws Throwable;
private static native int __fieldRead1311_99(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead1311_100(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead1311_101(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead1311_102(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic1311_103(int a0, long a1) throws Throwable;
private static native void __call1311_104(int a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1311_105(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native java.lang.String __fieldRead1311_106(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead1311_107(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead1311_108(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call1311_109(net.minecraft.client.gui.GuiMainMenu a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1311_110(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native java.lang.String __fieldRead1311_111(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead1311_112(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead1311_113(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native java.util.List __fieldRead1311_114(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native java.lang.Object __call1311_115(java.util.List a0, int a1) throws Throwable;
private static native moom.gc __cast1311_116(java.lang.Object a0) throws Throwable;
private static native int __fieldRead1311_117(moom.gc a0) throws Throwable;
private static native int __invokedynamic1311_118(int a0, long a1) throws Throwable;
private static native void __call1311_119(net.minecraft.client.gui.GuiMainMenu a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native void __call1311_120(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, float a3) throws Throwable;
private static native boolean __call1311_121(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1311_122(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call1311_123(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, float a3) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1311_124(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1311_125(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call1311_126(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, float a3) throws Throwable;
private static native java.lang.Throwable __call1131100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1131101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1131102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1131103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1131104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1131105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1131106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1131107_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1131108_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5f028aa7ca519bb366ca(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_5f028aa7ca519bb366ca {

public static void f552(net.minecraft.client.gui.GuiMainMenu receiver, int p0, int p1, int p2) throws Throwable {
    long life4_3;
    java.lang.Object life6_12;
    net.minecraft.client.gui.GuiConfirmOpenLink life7_49;
    forest_join_64: {
    forest_join_53: {
    life4_3 = (__fieldRead552_0() ^ 140705888915096L);
    __call552_1(receiver, p0, p1, p2);
    __monitorEnter552_3((life6_12 = __fieldRead552_2(receiver)));
    if (!((__call552_5(__fieldRead552_4(receiver)) > 0))) {
        break forest_join_53;
    }
    if (!((p0 >= __fieldRead552_6(receiver)))) {
        break forest_join_53;
    }
    if (!((p0 <= __fieldRead552_7(receiver)))) {
        break forest_join_53;
    }
    if (!((p1 >= __fieldRead552_8(receiver)))) {
        break forest_join_53;
    }
    if (!((p1 <= __fieldRead552_9(receiver)))) {
        break forest_join_53;
    }
    life7_49 = new net.minecraft.client.gui.GuiConfirmOpenLink(receiver, __fieldRead552_10(receiver), __invokedynamic552_11(19737, (3061603463799107273L ^ life4_3)), true);
    __call552_12(life7_49);
    __call552_14(__fieldRead552_13(receiver), life7_49);
    }
    __monitorExit552_15(life6_12);
    if (!(__call552_16(receiver))) {
        break forest_join_64;
    }
    __call552_18(__fieldRead552_17(receiver), p0, p1, p2);
    }
    return;
}
public static void h552_0(java.io.IOException p0) throws Throwable {
    throw __call3055200_0(p0);
}
public static void h552_1(java.io.IOException p0) throws Throwable {
    throw __call3055201_0(p0);
}
public static void h552_2(java.io.IOException p0) throws Throwable {
    throw __call3055202_0(p0);
}
public static void h552_3(java.lang.Throwable p0, java.lang.Object p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3055203_0(p1);
    throw life2_2;
}
public static void h552_4(java.io.IOException p0) throws Throwable {
    throw __call3055204_0(p0);
}
private static native long __fieldRead552_0() throws Throwable;
private static native void __call552_1(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Object __fieldRead552_2(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __monitorEnter552_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead552_4(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __call552_5(java.lang.String a0) throws Throwable;
private static native int __fieldRead552_6(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead552_7(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead552_8(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead552_9(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native java.lang.String __fieldRead552_10(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic552_11(int a0, long a1) throws Throwable;
private static native void __call552_12(net.minecraft.client.gui.GuiConfirmOpenLink a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead552_13(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call552_14(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiConfirmOpenLink a1) throws Throwable;
private static native void __monitorExit552_15(java.lang.Object a0) throws Throwable;
private static native boolean __call552_16(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead552_17(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call552_18(net.minecraft.client.gui.GuiScreen a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Throwable __call3055200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3055201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3055202_0(java.io.IOException a0) throws Throwable;
private static native void __monitorExit3055203_0(java.lang.Object a0) throws Throwable;
private static native java.lang.Throwable __call3055204_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_590b23e398df4ed37553(net.minecraft.client.gui.GuiMainMenu a0, boolean a1, int a2) throws E;
private static final class __SourceHandler_590b23e398df4ed37553 {

public static void f553(net.minecraft.client.gui.GuiMainMenu receiver, boolean p0, int p1) throws Throwable {
    java.lang.Class spill553_0;
    java.lang.String spill553_1;
    java.lang.Class[] spill553_2;
    java.lang.reflect.Method spill553_3;
    java.lang.Object spill553_4;
    java.lang.Object[] spill553_5;
    long life3_3;
    net.minecraft.world.storage.ISaveFormat life5_17;
    java.lang.Class life5_41;
    java.lang.Object life6_51;
    forest_join_76: {
    forest_join_72: {
    forest_join_28: {
    life3_3 = (__fieldRead553_0() ^ 134285098636525L);
    if (!(p0)) {
        break forest_join_28;
    }
    if (!((p1 == __invokedynamic553_1(3393, (7999172440082724077L ^ life3_3))))) {
        break forest_join_28;
    }
    life5_17 = __call553_3(__fieldRead553_2(receiver));
    __call553_4(life5_17);
    __call553_5(life5_17, "Demo_World");
    __call553_7(__fieldRead553_6(receiver), receiver);
    break forest_join_76;
    }
    if (!((p1 == __invokedynamic553_8(27640, (4991379253235667534L ^ life3_3))))) {
        break forest_join_76;
    }
    if (!(p0)) {
        break forest_join_72;
    }
    life5_41 = __call553_9("java.awt.Desktop");
    life6_51 = __call553_11(__call553_10(life5_41, "getDesktop", new java.lang.Class[0]), null, new java.lang.Object[0]);
    spill553_0 = life5_41;
    spill553_1 = "browse";
    java.lang.Class[] __stackOp553_12_0 = new java.lang.Class[1];
    spill553_2 = __stackOp553_12_0;
    (__stackOp553_12_0)[0] = __classLiteral553_13();
    spill553_3 = __call553_14(spill553_0, spill553_1, spill553_2);
    spill553_4 = life6_51;
    java.lang.Object[] __stackOp553_15_0 = new java.lang.Object[1];
    spill553_5 = __stackOp553_15_0;
    (__stackOp553_15_0)[0] = new java.net.URI(__fieldRead553_16(receiver));
    __call553_17(spill553_3, spill553_4, spill553_5);
    }
    __call553_19(__fieldRead553_18(receiver), receiver);
    }
    return;
}
public static void h553_0(java.lang.Throwable p0) throws Throwable {
    throw __call3055300_0(p0);
}
public static void h553_1(java.lang.Throwable p0) throws Throwable {
    throw __call3055301_0(p0);
}
public static void h553_2(java.lang.Throwable p0, net.minecraft.client.gui.GuiMainMenu p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3055302_1(__fieldRead3055302_0(), "Couldn't open link", life2_2);
    __call3055302_3(__fieldRead3055302_2(p1), p1);
    return;
}
private static native long __fieldRead553_0() throws Throwable;
private static native int __invokedynamic553_1(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead553_2(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveFormat __call553_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call553_4(net.minecraft.world.storage.ISaveFormat a0) throws Throwable;
private static native boolean __call553_5(net.minecraft.world.storage.ISaveFormat a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead553_6(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call553_7(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiMainMenu a1) throws Throwable;
private static native int __invokedynamic553_8(int a0, long a1) throws Throwable;
private static native java.lang.Class __call553_9(java.lang.String a0) throws Throwable;
private static native java.lang.reflect.Method __call553_10(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call553_11(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Class __classLiteral553_13() throws Throwable;
private static native java.lang.reflect.Method __call553_14(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.String __fieldRead553_16(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native java.lang.Object __call553_17(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead553_18(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call553_19(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiMainMenu a1) throws Throwable;
private static native java.lang.Throwable __call3055300_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3055301_0(java.lang.Throwable a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3055302_0() throws Throwable;
private static native void __call3055302_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3055302_2(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call3055302_3(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiMainMenu a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1d97275ae3eb1d0d3244(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_1d97275ae3eb1d0d3244 {

public static void f100146(net.minecraft.client.gui.GuiMainMenu receiver, int p0, int p1, float p2) throws Throwable {
    int spill100146_0;
    int spill100146_1;
    long life4_3;
    net.minecraft.client.renderer.Tessellator life6_5;
    moom.lw life7_8;
    int life8_68;
    int life9_74;
    moom.JB life10_76;
    int life11_83;
    float life12_99;
    float life13_111;
    float life14_113;
    int life15_147;
    moom.DD[] life16_203;
    int life17_233;
    float life18_235;
    forest_join_347: {
    forest_join_82: {
    life4_3 = (__fieldRead100146_0() ^ 41582517902294L);
    life6_5 = __call100146_1();
    life7_8 = __call100146_2(life6_5);
    __call100146_4(__invokedynamic100146_3(12607, (7119680556860835758L ^ life4_3)));
    __call100146_5();
    __call100146_6();
    __call100146_7(0x1.ep6f, 0x1.0p0f, 0x1.99999ap-5f, 0x1.4p3f);
    __call100146_9(__invokedynamic100146_8(21560, (5406223219846374064L ^ life4_3)));
    __call100146_10();
    __call100146_11();
    __call100146_12(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call100146_13(0x1.68p7f, 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
    __call100146_14(0x1.68p6f, 0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
    __call100146_15();
    __call100146_16();
    __call100146_17();
    __call100146_18(0);
    __call100146_21(__invokedynamic100146_19(20000, (256300290915858588L ^ life4_3)), __invokedynamic100146_20(26154, (5962634661357375653L ^ life4_3)), 1, 0);
    life8_68 = __invokedynamic100146_22(29655, (2529986209804600695L ^ life4_3));
    life9_74 = __invokedynamic100146_23(23813, (5636670654185106334L ^ life4_3));
    life10_76 = __call100146_24();
    if (!((life10_76 != null))) {
        break forest_join_82;
    }
    life9_74 = __call100146_25(life10_76);
    }
    life11_83 = 0;
    forest_cycle_84: while (true) {
    forest_join_339: {
    if (!((life11_83 < life9_74))) {
        break forest_join_347;
    }
    __call100146_26();
    life12_99 = (((((float) (life11_83 % life8_68)) / ((float) life8_68)) - 0x1.0p-1f) / 0x1.0p6f);
    life13_111 = (((((float) (life11_83 / life8_68)) / ((float) life8_68)) - 0x1.0p-1f) / 0x1.0p6f);
    life14_113 = 0x0.0p0f;
    __call100146_27(life12_99, life13_111, life14_113);
    __call100146_30(((__call100146_29(((((float) __fieldRead100146_28(receiver)) + p2) / 0x1.9p8f)) * 0x1.9p4f) + 0x1.4p4f), 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
    __call100146_32(((-(((float) __fieldRead100146_31(receiver)) + p2)) * 0x1.99999ap-4f), 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    life15_147 = 0;
    forest_cycle_148: while (true) {
    forest_join_203: {
    forest_join_196: {
    forest_join_188: {
    forest_join_180: {
    forest_join_172: {
    forest_join_164: {
    if (!((life15_147 < __invokedynamic100146_33(16930, (5034471538446038190L ^ life4_3))))) {
        break forest_join_339;
    }
    __call100146_34();
    if (!((life15_147 == 1))) {
        break forest_join_164;
    }
    __call100146_35(0x1.68p6f, 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    }
    if (!((life15_147 == 2))) {
        break forest_join_172;
    }
    __call100146_36(0x1.68p7f, 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    }
    if (!((life15_147 == 3))) {
        break forest_join_180;
    }
    __call100146_37(-0x1.68p6f, 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    }
    if (!((life15_147 == 4))) {
        break forest_join_188;
    }
    __call100146_38(0x1.68p6f, 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
    }
    if (!((life15_147 == 5))) {
        break forest_join_196;
    }
    __call100146_39(-0x1.68p6f, 0x1.0p0f, 0x0.0p0f, 0x0.0p0f);
    }
    life16_203 = __fieldRead100146_40();
    if (!((life10_76 != null))) {
        break forest_join_203;
    }
    life16_203 = __call100146_41(life10_76);
    }
    __call100146_44(__call100146_43(__fieldRead100146_42(receiver)), (life16_203)[life15_147]);
    __call100146_47(life7_8, __invokedynamic100146_45(26854, (5282801956768833106L ^ life4_3)), __fieldRead100146_46());
    life17_233 = (__invokedynamic100146_48(4181, (3619838899137095378L ^ life4_3)) / (life11_83 + 1));
    life18_235 = 0x0.0p0f;
    __call100146_55(__call100146_54(__call100146_50(__call100146_49(life7_8, -0x1.0p0d, -0x1.0p0d, 0x1.0p0d), 0x0.0p0d, 0x0.0p0d), __invokedynamic100146_51(21419, (8209699331856295171L ^ life4_3)), __invokedynamic100146_52(21419, (8209699331856295171L ^ life4_3)), __invokedynamic100146_53(21419, (8209699331856295171L ^ life4_3)), life17_233));
    __call100146_62(__call100146_61(__call100146_57(__call100146_56(life7_8, 0x1.0p0d, -0x1.0p0d, 0x1.0p0d), 0x1.0p0d, 0x0.0p0d), __invokedynamic100146_58(21419, (8209699331856295171L ^ life4_3)), __invokedynamic100146_59(21419, (8209699331856295171L ^ life4_3)), __invokedynamic100146_60(21419, (8209699331856295171L ^ life4_3)), life17_233));
    __call100146_69(__call100146_68(__call100146_64(__call100146_63(life7_8, 0x1.0p0d, 0x1.0p0d, 0x1.0p0d), 0x1.0p0d, 0x1.0p0d), __invokedynamic100146_65(21419, (8209699331856295171L ^ life4_3)), __invokedynamic100146_66(21419, (8209699331856295171L ^ life4_3)), __invokedynamic100146_67(21419, (8209699331856295171L ^ life4_3)), life17_233));
    __call100146_76(__call100146_75(__call100146_71(__call100146_70(life7_8, -0x1.0p0d, 0x1.0p0d, 0x1.0p0d), 0x0.0p0d, 0x1.0p0d), __invokedynamic100146_72(21419, (8209699331856295171L ^ life4_3)), __invokedynamic100146_73(21419, (8209699331856295171L ^ life4_3)), __invokedynamic100146_74(21419, (8209699331856295171L ^ life4_3)), life17_233));
    __call100146_77(life6_5);
    __call100146_78();
    life15_147 += 1;
    continue forest_cycle_148;
    }
    }
    __call100146_79();
    __call100146_80(1, 1, 1, 0);
    life11_83 += 1;
    continue forest_cycle_84;
    }
    }
    __call100146_81(life7_8, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d);
    spill100146_0 = 12095;
    __call100146_82(1, 1, 1, 1);
    __call100146_84(__invokedynamic100146_83(spill100146_0, (8111277376761371130L ^ life4_3)));
    spill100146_1 = 29476;
    __call100146_85();
    __call100146_87(__invokedynamic100146_86(spill100146_1, (8143343816804746725L ^ life4_3)));
    __call100146_88();
    __call100146_89(1);
    __call100146_90();
    __call100146_91();
    return;
}
public static void h100146_0(moom.Oo p0) throws Throwable {
    throw __call13014600_0(p0);
}
public static void h100146_1(moom.Oo p0) throws Throwable {
    throw __call13014601_0(p0);
}
public static void h100146_2(moom.Oo p0) throws Throwable {
    throw __call13014602_0(p0);
}
public static void h100146_3(moom.Oo p0) throws Throwable {
    throw __call13014603_0(p0);
}
public static void h100146_4(moom.Oo p0) throws Throwable {
    throw __call13014604_0(p0);
}
public static void h100146_5(moom.Oo p0) throws Throwable {
    throw __call13014605_0(p0);
}
private static native long __fieldRead100146_0() throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call100146_1() throws Throwable;
private static native moom.lw __call100146_2(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __invokedynamic100146_3(int a0, long a1) throws Throwable;
private static native void __call100146_4(int a0) throws Throwable;
private static native void __call100146_5() throws Throwable;
private static native void __call100146_6() throws Throwable;
private static native void __call100146_7(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic100146_8(int a0, long a1) throws Throwable;
private static native void __call100146_9(int a0) throws Throwable;
private static native void __call100146_10() throws Throwable;
private static native void __call100146_11() throws Throwable;
private static native void __call100146_12(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call100146_13(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call100146_14(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call100146_15() throws Throwable;
private static native void __call100146_16() throws Throwable;
private static native void __call100146_17() throws Throwable;
private static native void __call100146_18(int a0) throws Throwable;
private static native int __invokedynamic100146_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic100146_20(int a0, long a1) throws Throwable;
private static native void __call100146_21(int a0, int a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic100146_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic100146_23(int a0, long a1) throws Throwable;
private static native moom.JB __call100146_24() throws Throwable;
private static native int __call100146_25(moom.JB a0) throws Throwable;
private static native void __call100146_26() throws Throwable;
private static native void __call100146_27(float a0, float a1, float a2) throws Throwable;
private static native int __fieldRead100146_28(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native float __call100146_29(float a0) throws Throwable;
private static native void __call100146_30(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __fieldRead100146_31(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call100146_32(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic100146_33(int a0, long a1) throws Throwable;
private static native void __call100146_34() throws Throwable;
private static native void __call100146_35(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call100146_36(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call100146_37(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call100146_38(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call100146_39(float a0, float a1, float a2, float a3) throws Throwable;
private static native moom.DD[] __fieldRead100146_40() throws Throwable;
private static native moom.DD[] __call100146_41(moom.JB a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100146_42(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call100146_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call100146_44(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic100146_45(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead100146_46() throws Throwable;
private static native void __call100146_47(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native int __invokedynamic100146_48(int a0, long a1) throws Throwable;
private static native moom.lw __call100146_49(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call100146_50(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic100146_51(int a0, long a1) throws Throwable;
private static native int __invokedynamic100146_52(int a0, long a1) throws Throwable;
private static native int __invokedynamic100146_53(int a0, long a1) throws Throwable;
private static native moom.lw __call100146_54(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call100146_55(moom.lw a0) throws Throwable;
private static native moom.lw __call100146_56(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call100146_57(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic100146_58(int a0, long a1) throws Throwable;
private static native int __invokedynamic100146_59(int a0, long a1) throws Throwable;
private static native int __invokedynamic100146_60(int a0, long a1) throws Throwable;
private static native moom.lw __call100146_61(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call100146_62(moom.lw a0) throws Throwable;
private static native moom.lw __call100146_63(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call100146_64(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic100146_65(int a0, long a1) throws Throwable;
private static native int __invokedynamic100146_66(int a0, long a1) throws Throwable;
private static native int __invokedynamic100146_67(int a0, long a1) throws Throwable;
private static native moom.lw __call100146_68(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call100146_69(moom.lw a0) throws Throwable;
private static native moom.lw __call100146_70(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call100146_71(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic100146_72(int a0, long a1) throws Throwable;
private static native int __invokedynamic100146_73(int a0, long a1) throws Throwable;
private static native int __invokedynamic100146_74(int a0, long a1) throws Throwable;
private static native moom.lw __call100146_75(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call100146_76(moom.lw a0) throws Throwable;
private static native void __call100146_77(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call100146_78() throws Throwable;
private static native void __call100146_79() throws Throwable;
private static native void __call100146_80(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call100146_81(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native void __call100146_82(int a0, int a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic100146_83(int a0, long a1) throws Throwable;
private static native void __call100146_84(int a0) throws Throwable;
private static native void __call100146_85() throws Throwable;
private static native int __invokedynamic100146_86(int a0, long a1) throws Throwable;
private static native void __call100146_87(int a0) throws Throwable;
private static native void __call100146_88() throws Throwable;
private static native void __call100146_89(int a0) throws Throwable;
private static native void __call100146_90() throws Throwable;
private static native void __call100146_91() throws Throwable;
private static native java.lang.Throwable __call13014600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13014601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13014602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13014603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13014604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call13014605_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_23c0284103a9575d9449(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2) throws E;
private static final class __SourceHandler_23c0284103a9575d9449 {

public static void f203(net.minecraft.client.gui.GuiMainMenu receiver, int p0, int p1) throws Throwable {
    long life3_3;
    net.minecraft.world.storage.ISaveFormat life5_66;
    net.minecraft.world.storage.WorldInfo life6_70;
    life3_3 = (__fieldRead203_0() ^ 66222673063389L);
    __call203_6(__fieldRead203_1(receiver), new moom.gc(__invokedynamic203_2(15822, (5148107822180416844L ^ life3_3)), ((__fieldRead203_3(receiver) / 2) - __invokedynamic203_4(17944, (4616362803064620682L ^ life3_3))), p0, __call203_5("menu.playdemo", new java.lang.Object[0])));
    java.util.List spill203_0 = __fieldRead203_7(receiver);
    net.minecraft.client.gui.GuiMainMenu __stackOp203_12_0 = receiver;
    moom.gc __stackOp203_12_1 = new moom.gc(__invokedynamic203_8(3393, (7999099825021029853L ^ life3_3)), ((__fieldRead203_9(receiver) / 2) - __invokedynamic203_10(17944, (4616362803064620682L ^ life3_3))), (p0 + p1), __call203_11("menu.resetdemo", new java.lang.Object[0]));
    moom.gc spill203_1 = __stackOp203_12_1;
    __fieldWrite203_13(__stackOp203_12_0, __stackOp203_12_1);
    __call203_14(spill203_0, spill203_1);
    life5_66 = __call203_16(__fieldRead203_15(receiver));
    life6_70 = __call203_17(life5_66, "Demo_World");
    if ((life6_70 == null)) {
        __fieldWrite203_19(__fieldRead203_18(receiver), 0);
    }
    return;
}
public static void h203_0(moom.Oo p0) throws Throwable {
    throw __call1020300_0(p0);
}
private static native long __fieldRead203_0() throws Throwable;
private static native java.util.List __fieldRead203_1(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic203_2(int a0, long a1) throws Throwable;
private static native int __fieldRead203_3(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic203_4(int a0, long a1) throws Throwable;
private static native java.lang.String __call203_5(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call203_6(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead203_7(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic203_8(int a0, long a1) throws Throwable;
private static native int __fieldRead203_9(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic203_10(int a0, long a1) throws Throwable;
private static native java.lang.String __call203_11(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite203_13(net.minecraft.client.gui.GuiMainMenu a0, moom.gc a1) throws Throwable;
private static native boolean __call203_14(java.util.List a0, moom.gc a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead203_15(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveFormat __call203_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call203_17(net.minecraft.world.storage.ISaveFormat a0, java.lang.String a1) throws Throwable;
private static native moom.gc __fieldRead203_18(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __fieldWrite203_19(moom.gc a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1020300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b4624030f5024e766f15(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_b4624030f5024e766f15 {

public static void f2253(net.minecraft.client.gui.GuiMainMenu receiver, int p0, int p1, float p2) throws Throwable {
    long life4_3;
    int life6_30;
    moom.JB life7_32;
    int life8_39;
    float life8_85;
    float life9_93;
    float life10_101;
    int life11_104;
    int life12_107;
    net.minecraft.client.renderer.Tessellator life13_109;
    moom.lw life14_112;
    life4_3 = (__fieldRead2253_0() ^ 130350825300663L);
    __call2253_3(__call2253_2(__fieldRead2253_1(receiver)));
    __call2253_6(0, 0, __invokedynamic2253_4(28766, (6474889009082433451L ^ life4_3)), __invokedynamic2253_5(28766, (6474889009082433451L ^ life4_3)));
    __call2253_7(receiver, p0, p1, p2);
    __call2253_8(receiver, p2);
    life6_30 = 3;
    life7_32 = __call2253_9();
    if ((life7_32 != null)) {
        life6_30 = __call2253_10(life7_32);
    }
    life8_39 = 0;
    loop_region_40: while ((life8_39 < life6_30)) {
        __call2253_11(receiver, p2);
        __call2253_12(receiver, p2);
        life8_39 += 1;
    }
    __call2253_15(__call2253_14(__fieldRead2253_13(receiver)), 1);
    __call2253_20(0, 0, __fieldRead2253_17(__fieldRead2253_16(receiver)), __fieldRead2253_19(__fieldRead2253_18(receiver)));
    life8_85 = ((__fieldRead2253_21(receiver) > __fieldRead2253_22(receiver)) ? (0x1.ep6f / ((float) __fieldRead2253_23(receiver))) : (0x1.ep6f / ((float) __fieldRead2253_24(receiver))));
    life9_93 = ((((float) __fieldRead2253_25(receiver)) * life8_85) / 0x1.0p8f);
    life10_101 = ((((float) __fieldRead2253_26(receiver)) * life8_85) / 0x1.0p8f);
    life11_104 = __fieldRead2253_27(receiver);
    life12_107 = __fieldRead2253_28(receiver);
    life13_109 = __call2253_29();
    life14_112 = __call2253_30(life13_109);
    __call2253_33(life14_112, __invokedynamic2253_31(26605, (6695775515914266682L ^ life4_3)), __fieldRead2253_32());
    __call2253_38(__call2253_37(__call2253_36(__call2253_35(life14_112, 0x0.0p0d, ((double) life12_107), ((double) __fieldRead2253_34(receiver))), ((double) (0x1.0p-1f - life9_93)), ((double) (0x1.0p-1f + life10_101))), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f));
    __call2253_43(__call2253_42(__call2253_41(__call2253_40(life14_112, ((double) life11_104), ((double) life12_107), ((double) __fieldRead2253_39(receiver))), ((double) (0x1.0p-1f - life9_93)), ((double) (0x1.0p-1f - life10_101))), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f));
    __call2253_48(__call2253_47(__call2253_46(__call2253_45(life14_112, ((double) life11_104), 0x0.0p0d, ((double) __fieldRead2253_44(receiver))), ((double) (0x1.0p-1f + life9_93)), ((double) (0x1.0p-1f - life10_101))), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f));
    __call2253_53(__call2253_52(__call2253_51(__call2253_50(life14_112, 0x0.0p0d, 0x0.0p0d, ((double) __fieldRead2253_49(receiver))), ((double) (0x1.0p-1f + life9_93)), ((double) (0x1.0p-1f + life10_101))), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f));
    __call2253_54(life13_109);
    return;
}
public static void h2253_0(moom.Oo p0) throws Throwable {
    throw __call1225300_0(p0);
}
public static void h2253_1(moom.Oo p0) throws Throwable {
    throw __call1225301_0(p0);
}
private static native long __fieldRead2253_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2253_1(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __call2253_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2253_3(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __invokedynamic2253_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic2253_5(int a0, long a1) throws Throwable;
private static native void __call2253_6(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call2253_7(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2, float a3) throws Throwable;
private static native void __call2253_8(net.minecraft.client.gui.GuiMainMenu a0, float a1) throws Throwable;
private static native moom.JB __call2253_9() throws Throwable;
private static native int __call2253_10(moom.JB a0) throws Throwable;
private static native void __call2253_11(net.minecraft.client.gui.GuiMainMenu a0, float a1) throws Throwable;
private static native void __call2253_12(net.minecraft.client.gui.GuiMainMenu a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2253_13(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __call2253_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2253_15(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2253_16(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead2253_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2253_18(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead2253_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2253_20(int a0, int a1, int a2, int a3) throws Throwable;
private static native int __fieldRead2253_21(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead2253_22(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead2253_23(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead2253_24(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead2253_25(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead2253_26(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead2253_27(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead2253_28(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call2253_29() throws Throwable;
private static native moom.lw __call2253_30(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __invokedynamic2253_31(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead2253_32() throws Throwable;
private static native void __call2253_33(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native float __fieldRead2253_34(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native moom.lw __call2253_35(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2253_36(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call2253_37(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call2253_38(moom.lw a0) throws Throwable;
private static native float __fieldRead2253_39(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native moom.lw __call2253_40(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2253_41(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call2253_42(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call2253_43(moom.lw a0) throws Throwable;
private static native float __fieldRead2253_44(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native moom.lw __call2253_45(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2253_46(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call2253_47(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call2253_48(moom.lw a0) throws Throwable;
private static native float __fieldRead2253_49(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native moom.lw __call2253_50(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2253_51(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call2253_52(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call2253_53(moom.lw a0) throws Throwable;
private static native void __call2253_54(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native java.lang.Throwable __call1225300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1225301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7f0242e77d7d658bc683(net.minecraft.client.gui.GuiMainMenu a0) throws E;
private static final class __SourceHandler_7f0242e77d7d658bc683 {

public static void f554(net.minecraft.client.gui.GuiMainMenu receiver) throws Throwable {
    long life1_3;
    java.util.Calendar life3_29;
    int life4_107;
    int life5_118;
    java.lang.Object life6_324;
    int life7_345;
    forest_join_410: {
    forest_join_397: {
    forest_join_136: {
    forest_join_128: {
    forest_join_98: {
    forest_join_75: {
    forest_join_59: {
    life1_3 = (__fieldRead554_0() ^ 52469336264706L);
    __fieldWrite554_3(receiver, new moom.n3(__invokedynamic554_1(24548, (3853930016715465361L ^ life1_3)), __invokedynamic554_2(28766, (6474826107919355166L ^ life1_3))));
    __fieldWrite554_8(receiver, __call554_7(__call554_5(__fieldRead554_4(receiver)), "background", __fieldRead554_6(receiver)));
    life3_29 = __call554_9();
    __call554_10(life3_29, new java.util.Date());
    if (!(((__call554_11(life3_29, 2) + 1) == __invokedynamic554_12(3393, (7999115773614600194L ^ life1_3))))) {
        break forest_join_59;
    }
    if (!((__call554_13(life3_29, 5) == __invokedynamic554_14(9779, (7930850578878864165L ^ life1_3))))) {
        break forest_join_59;
    }
    __fieldWrite554_15(receiver, "Merry X-mas!");
    break forest_join_98;
    }
    if (!(((__call554_16(life3_29, 2) + 1) == 1))) {
        break forest_join_75;
    }
    if (!((__call554_17(life3_29, 5) == 1))) {
        break forest_join_75;
    }
    __fieldWrite554_18(receiver, "Happy new year!");
    break forest_join_98;
    }
    if (!(((__call554_19(life3_29, 2) + 1) == __invokedynamic554_20(14476, (7461053281643267579L ^ life1_3))))) {
        break forest_join_98;
    }
    if (!((__call554_21(life3_29, 5) == __invokedynamic554_22(28567, (2949060310186349299L ^ life1_3))))) {
        break forest_join_98;
    }
    __fieldWrite554_23(receiver, "OOoooOOOoooo! Spooky!");
    }
    life4_107 = __invokedynamic554_24(3188, (809612530412925188L ^ life1_3));
    life5_118 = ((__fieldRead554_25(receiver) / 4) + __invokedynamic554_26(6608, (1842452279085376665L ^ life1_3)));
    if (!(__call554_28(__fieldRead554_27(receiver)))) {
        break forest_join_128;
    }
    __call554_30(receiver, life5_118, __invokedynamic554_29(3188, (809612530412925188L ^ life1_3)));
    break forest_join_136;
    }
    __call554_32(receiver, life5_118, __invokedynamic554_31(3188, (809612530412925188L ^ life1_3)));
    }
    __call554_41(__fieldRead554_33(receiver), new moom.gc(__invokedynamic554_34(732, (7031709981029941199L ^ life1_3)), ((__fieldRead554_35(receiver) / 2) - __invokedynamic554_36(15620, (8186151641474728045L ^ life1_3))), ((life5_118 + __invokedynamic554_37(7785, (5797371424623502107L ^ life1_3))) + __invokedynamic554_38(3393, (7999115773614600194L ^ life1_3))), __invokedynamic554_39(23018, (8813219434685588641L ^ life1_3)), __invokedynamic554_40(8696, (858108258785336471L ^ life1_3)), "Account Manager"));
    __call554_51(__fieldRead554_42(receiver), new moom.gc(0, ((__fieldRead554_43(receiver) / 2) - __invokedynamic554_44(17944, (4616345749045607253L ^ life1_3))), (((life5_118 + __invokedynamic554_45(21537, (709864874470238546L ^ life1_3))) + __invokedynamic554_46(3393, (7999115773614600194L ^ life1_3))) + __invokedynamic554_47(3188, (809612530412925188L ^ life1_3))), __invokedynamic554_48(27257, (7303322382476760847L ^ life1_3)), __invokedynamic554_49(23190, (9119536277430724548L ^ life1_3)), __call554_50("menu.options", new java.lang.Object[0])));
    __call554_60(__fieldRead554_52(receiver), new moom.gc(4, ((__fieldRead554_53(receiver) / 2) + 2), (((life5_118 + __invokedynamic554_54(21537, (709864874470238546L ^ life1_3))) + __invokedynamic554_55(3393, (7999115773614600194L ^ life1_3))) + __invokedynamic554_56(3188, (809612530412925188L ^ life1_3))), __invokedynamic554_57(20456, (1750061256819307168L ^ life1_3)), __invokedynamic554_58(23190, (9119536277430724548L ^ life1_3)), __call554_59("menu.quit", new java.lang.Object[0])));
    __call554_67(__fieldRead554_61(receiver), new moom.gd(5, ((__fieldRead554_62(receiver) / 2) - __invokedynamic554_63(21902, (5371045192444471508L ^ life1_3))), (((life5_118 + __invokedynamic554_64(21537, (709864874470238546L ^ life1_3))) + __invokedynamic554_65(3393, (7999115773614600194L ^ life1_3))) + __invokedynamic554_66(3188, (809612530412925188L ^ life1_3)))));
    __monitorEnter554_69((life6_324 = __fieldRead554_68(receiver)));
    __fieldWrite554_73(receiver, __call554_72(__fieldRead554_70(receiver), __fieldRead554_71(receiver)));
    __fieldWrite554_77(receiver, __call554_76(__fieldRead554_74(receiver), __fieldRead554_75(receiver)));
    life7_345 = __call554_80(__fieldRead554_78(receiver), __fieldRead554_79(receiver));
    __fieldWrite554_82(receiver, ((__fieldRead554_81(receiver) - life7_345) / 2));
    __fieldWrite554_88(receiver, (__fieldRead554_86(__cast554_85(__call554_84(__fieldRead554_83(receiver), 0))) - __invokedynamic554_87(3188, (809612530412925188L ^ life1_3))));
    __fieldWrite554_90(receiver, (__fieldRead554_89(receiver) + life7_345));
    __fieldWrite554_93(receiver, (__fieldRead554_91(receiver) + __invokedynamic554_92(3188, (809612530412925188L ^ life1_3))));
    __monitorExit554_94(life6_324);
    __call554_96(__fieldRead554_95(receiver), 0);
    if (!(__call554_100(__fieldRead554_98(__call554_97()), __fieldRead554_99()))) {
        break forest_join_397;
    }
    if (!((!__fieldRead554_101(receiver)))) {
        break forest_join_397;
    }
    __fieldWrite554_102(receiver, 1);
    }
    if (!(__call554_103(receiver))) {
        break forest_join_410;
    }
    __call554_107(__fieldRead554_104(receiver), __fieldRead554_105(receiver), __fieldRead554_106(receiver));
    __call554_109(__fieldRead554_108(receiver));
    }
    return;
}
public static void h554_0(moom.Oo p0) throws Throwable {
    throw __call3055400_0(p0);
}
public static void h554_1(moom.Oo p0) throws Throwable {
    throw __call3055401_0(p0);
}
public static void h554_2(moom.Oo p0) throws Throwable {
    throw __call3055402_0(p0);
}
public static void h554_3(moom.Oo p0) throws Throwable {
    throw __call3055403_0(p0);
}
public static void h554_4(moom.Oo p0) throws Throwable {
    throw __call3055404_0(p0);
}
public static void h554_5(moom.Oo p0) throws Throwable {
    throw __call3055405_0(p0);
}
public static void h554_6(moom.Oo p0) throws Throwable {
    throw __call3055406_0(p0);
}
public static void h554_7(java.lang.Throwable p0, java.lang.Object p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3055407_0(p1);
    throw life2_2;
}
public static void h554_8(moom.Oo p0) throws Throwable {
    throw __call3055408_0(p0);
}
public static void h554_9(moom.Oo p0) throws Throwable {
    throw __call3055409_0(p0);
}
public static void h554_10(moom.Oo p0) throws Throwable {
    throw __call3055410_0(p0);
}
private static native long __fieldRead554_0() throws Throwable;
private static native int __invokedynamic554_1(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_2(int a0, long a1) throws Throwable;
private static native void __fieldWrite554_3(net.minecraft.client.gui.GuiMainMenu a0, moom.n3 a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead554_4(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call554_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.n3 __fieldRead554_6(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native moom.DD __call554_7(net.minecraft.client.renderer.texture.TextureManager a0, java.lang.String a1, moom.n3 a2) throws Throwable;
private static native void __fieldWrite554_8(net.minecraft.client.gui.GuiMainMenu a0, moom.DD a1) throws Throwable;
private static native java.util.Calendar __call554_9() throws Throwable;
private static native void __call554_10(java.util.Calendar a0, java.util.Date a1) throws Throwable;
private static native int __call554_11(java.util.Calendar a0, int a1) throws Throwable;
private static native int __invokedynamic554_12(int a0, long a1) throws Throwable;
private static native int __call554_13(java.util.Calendar a0, int a1) throws Throwable;
private static native int __invokedynamic554_14(int a0, long a1) throws Throwable;
private static native void __fieldWrite554_15(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native int __call554_16(java.util.Calendar a0, int a1) throws Throwable;
private static native int __call554_17(java.util.Calendar a0, int a1) throws Throwable;
private static native void __fieldWrite554_18(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native int __call554_19(java.util.Calendar a0, int a1) throws Throwable;
private static native int __invokedynamic554_20(int a0, long a1) throws Throwable;
private static native int __call554_21(java.util.Calendar a0, int a1) throws Throwable;
private static native int __invokedynamic554_22(int a0, long a1) throws Throwable;
private static native void __fieldWrite554_23(net.minecraft.client.gui.GuiMainMenu a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic554_24(int a0, long a1) throws Throwable;
private static native int __fieldRead554_25(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic554_26(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead554_27(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native boolean __call554_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic554_29(int a0, long a1) throws Throwable;
private static native void __call554_30(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic554_31(int a0, long a1) throws Throwable;
private static native void __call554_32(net.minecraft.client.gui.GuiMainMenu a0, int a1, int a2) throws Throwable;
private static native java.util.List __fieldRead554_33(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic554_34(int a0, long a1) throws Throwable;
private static native int __fieldRead554_35(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic554_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_40(int a0, long a1) throws Throwable;
private static native boolean __call554_41(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead554_42(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead554_43(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic554_44(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_45(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_46(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_47(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_49(int a0, long a1) throws Throwable;
private static native java.lang.String __call554_50(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call554_51(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead554_52(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead554_53(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic554_54(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_55(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_56(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_57(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_58(int a0, long a1) throws Throwable;
private static native java.lang.String __call554_59(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call554_60(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead554_61(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead554_62(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic554_63(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_64(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_65(int a0, long a1) throws Throwable;
private static native int __invokedynamic554_66(int a0, long a1) throws Throwable;
private static native boolean __call554_67(java.util.List a0, moom.gd a1) throws Throwable;
private static native java.lang.Object __fieldRead554_68(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __monitorEnter554_69(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead554_70(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native java.lang.String __fieldRead554_71(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __call554_72(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite554_73(net.minecraft.client.gui.GuiMainMenu a0, int a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead554_74(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native java.lang.String __fieldRead554_75(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __call554_76(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite554_77(net.minecraft.client.gui.GuiMainMenu a0, int a1) throws Throwable;
private static native int __fieldRead554_78(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead554_79(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __call554_80(int a0, int a1) throws Throwable;
private static native int __fieldRead554_81(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __fieldWrite554_82(net.minecraft.client.gui.GuiMainMenu a0, int a1) throws Throwable;
private static native java.util.List __fieldRead554_83(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native java.lang.Object __call554_84(java.util.List a0, int a1) throws Throwable;
private static native moom.gc __cast554_85(java.lang.Object a0) throws Throwable;
private static native int __fieldRead554_86(moom.gc a0) throws Throwable;
private static native int __invokedynamic554_87(int a0, long a1) throws Throwable;
private static native void __fieldWrite554_88(net.minecraft.client.gui.GuiMainMenu a0, int a1) throws Throwable;
private static native int __fieldRead554_89(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __fieldWrite554_90(net.minecraft.client.gui.GuiMainMenu a0, int a1) throws Throwable;
private static native int __fieldRead554_91(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __invokedynamic554_92(int a0, long a1) throws Throwable;
private static native void __fieldWrite554_93(net.minecraft.client.gui.GuiMainMenu a0, int a1) throws Throwable;
private static native void __monitorExit554_94(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead554_95(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call554_96(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call554_97() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead554_98(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __fieldRead554_99() throws Throwable;
private static native boolean __call554_100(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1) throws Throwable;
private static native boolean __fieldRead554_101(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __fieldWrite554_102(net.minecraft.client.gui.GuiMainMenu a0, int a1) throws Throwable;
private static native boolean __call554_103(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead554_104(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead554_105(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native int __fieldRead554_106(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call554_107(net.minecraft.client.gui.GuiScreen a0, int a1, int a2) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead554_108(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call554_109(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native java.lang.Throwable __call3055400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3055401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3055402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3055403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3055404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3055405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3055406_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3055407_0(java.lang.Object a0) throws Throwable;
private static native java.lang.Throwable __call3055408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3055409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3055410_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_013a14b605ca695d8f7c(net.minecraft.client.gui.GuiMainMenu a0) throws E;
private static final class __SourceHandler_013a14b605ca695d8f7c {

public static boolean f1312(net.minecraft.client.gui.GuiMainMenu receiver) throws Throwable {
    int forwardValue1312_11_0;
    forward_join_11: {
    forward_join_10: {
    if (!(__call1312_3(__fieldRead1312_1(__call1312_0()), __fieldRead1312_2()))) {
        break forward_join_10;
    }
    if (!((__fieldRead1312_4(receiver) != null))) {
        break forward_join_10;
    }
    forwardValue1312_11_0 = 1;
    break forward_join_11;
    }
    forwardValue1312_11_0 = 0;
    }
    return __integerCategory1312_5(forwardValue1312_11_0);
}
public static void h1312_0(moom.Oo p0) throws Throwable {
    throw __call1131200_0(p0);
}
public static void h1312_1(moom.Oo p0) throws Throwable {
    throw __call1131201_0(p0);
}
private static native net.minecraft.client.Minecraft __call1312_0() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1312_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __fieldRead1312_2() throws Throwable;
private static native boolean __call1312_3(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1312_4(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native boolean __integerCategory1312_5(int value) throws Throwable;
private static native java.lang.Throwable __call1131200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1131201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b6cbdddb736a7f0c8813(net.minecraft.client.gui.GuiMainMenu a0) throws E;
private static final class __SourceHandler_b6cbdddb736a7f0c8813 {

public static void f204(net.minecraft.client.gui.GuiMainMenu receiver) throws Throwable {
    net.minecraft.client.gui.GuiMainMenu __stackOp204_0_0 = receiver;
    __fieldWrite204_2(__stackOp204_0_0, (__fieldRead204_1(__stackOp204_0_0) + 1));
    if (__call204_3(receiver)) {
        __call204_5(__fieldRead204_4(receiver));
    }
    return;
}
public static void h204_0(moom.Oo p0) throws Throwable {
    throw __call1020400_0(p0);
}
private static native int __fieldRead204_1(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __fieldWrite204_2(net.minecraft.client.gui.GuiMainMenu a0, int a1) throws Throwable;
private static native boolean __call204_3(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead204_4(net.minecraft.client.gui.GuiMainMenu a0) throws Throwable;
private static native void __call204_5(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native java.lang.Throwable __call1020400_0(moom.Oo a0) throws Throwable;

}


private void b(int p0, int p1) {
long local3 = (net.minecraft.client.gui.GuiMainMenu.X ^ 60527970903750L);
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(1, ((this.k / 2) - __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1782_3(17944, (4616355320714579345L ^ local3))), p0, moom.oO.a(((java.lang.String)("menu.singleplayer")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(2, ((this.k / 2) - __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1782_8(17944, (4616355320714579345L ^ local3))), (p0 + p1), moom.oO.a(((java.lang.String)("menu.multiplayer")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    return;
}


private void b(int p0, int p1, float p2) { __sourceHandlerCall_1d97275ae3eb1d0d3244(this, p0, p1, p2); }


private boolean e__Boolean() { return __sourceHandlerCall_013a14b605ca695d8f7c(this); }


private void c(int p0, int p1) { __sourceHandlerCall_23c0284103a9575d9449(this, p0, p1); }


private void c(int p0, int p1, float p2) { __sourceHandlerCall_b4624030f5024e766f15(this, p0, p1, p2); }


public void c__Void() { __sourceHandlerCall_7f0242e77d7d658bc683(this); }


public void h() {
try {
        if ((this.V != null)) {
        ((net.minecraft.client.gui.GuiScreen)(this.V)).h();
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw net.minecraft.client.gui.GuiMainMenu.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    return;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_5f028aa7ca519bb366ca(this, p0, p1, p2); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28192;
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
            throw new RuntimeException("moom/gV", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Z[var3] = var15;
      }

      return Z[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiMainMenu.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10282_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a__Void(moom.gc p0) throws java.io.IOException {
long life2_3;
    net.minecraft.world.storage.ISaveFormat life4_106;
    net.minecraft.world.storage.WorldInfo life5_110;
    moom.hb life6_122;
    life2_3 = (net.minecraft.client.gui.GuiMainMenu.X ^ 118972028928483L);
    try {
        if ((((moom.gc)(p0)).l == 0)) {
        ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.GuiOptions(this, ((net.minecraft.client.Minecraft)(this.i)).W))));
    }
    } catch (java.io.IOException caught_rethrow_0) {
        throw net.minecraft.client.gui.GuiMainMenu.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    try {
        if ((((moom.gc)(p0)).l == 5)) {
        ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(new moom.gU(this, ((net.minecraft.client.Minecraft)(this.i)).W, ((net.minecraft.client.Minecraft)(this.i)).a__oV()))));
    }
    } catch (java.io.IOException caught_rethrow_1) {
        throw net.minecraft.client.gui.GuiMainMenu.a(((java.lang.Throwable)(caught_rethrow_1)));
    }
    try {
        if ((((moom.gc)(p0)).l == 1)) {
        ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.GuiSelectWorld(this))));
    }
    } catch (java.io.IOException caught_rethrow_2) {
        throw net.minecraft.client.gui.GuiMainMenu.a(((java.lang.Throwable)(caught_rethrow_2)));
    }
    try {
        if ((((moom.gc)(p0)).l == 2)) {
        ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.GuiMultiplayer(this))));
    }
    } catch (java.io.IOException caught_rethrow_3) {
        throw net.minecraft.client.gui.GuiMainMenu.a(((java.lang.Throwable)(caught_rethrow_3)));
    }
    try {
        if ((((moom.gc)(p0)).l == 4)) {
        ((net.minecraft.client.Minecraft)(this.i)).p();
    }
    } catch (java.io.IOException caught_rethrow_4) {
        throw net.minecraft.client.gui.GuiMainMenu.a(((java.lang.Throwable)(caught_rethrow_4)));
    }
    try {
        if ((((moom.gc)(p0)).l == __sourceIntrinsic_60da6f6f15c0_invokedynamic2294_28(29591, (5368659051414314775L ^ life2_3)))) {
        ((net.minecraft.client.Minecraft)(this.i)).a(((java.lang.String)("Demo_World")), ((java.lang.String)("Demo_World")), ((moom.EK)(moom.Ey.al)));
    }
    } catch (java.io.IOException caught_rethrow_5) {
        throw net.minecraft.client.gui.GuiMainMenu.a(((java.lang.Throwable)(caught_rethrow_5)));
    }
    if ((((moom.gc)(p0)).l == __sourceIntrinsic_60da6f6f15c0_invokedynamic2294_34(3393, (7999187773819331043L ^ life2_3)))) {
        life4_106 = ((net.minecraft.client.Minecraft)(this.i)).a__IK();
        life5_110 = ((net.minecraft.world.storage.ISaveFormat)(life4_106)).a(((java.lang.String)("Demo_World")));
        if ((life5_110 != null)) {
        life6_122 = net.minecraft.client.gui.GuiSelectWorld.a(((net.minecraft.client.gui.GuiYesNoCallback)(this)), ((java.lang.String)(((net.minecraft.world.storage.WorldInfo)(life5_110)).a__String())), ((int)(__sourceIntrinsic_60da6f6f15c0_invokedynamic2294_39(3393, (7999187773819331043L ^ life2_3)))));
        ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(life6_122)));
    }
    }
    try {
        if ((((moom.gc)(p0)).l == __sourceIntrinsic_60da6f6f15c0_invokedynamic2294_44(16867, (1088019051938147681L ^ life2_3)))) {
        ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__pe())));
    }
    } catch (java.io.IOException caught_rethrow_6) {
        throw net.minecraft.client.gui.GuiMainMenu.a(((java.lang.Throwable)(caught_rethrow_6)));
    }
    return;
}


public void a(boolean p0, int p1) { __sourceHandlerCall_590b23e398df4ed37553(this, p0, p1); }


public boolean a__Boolean() {
return ((0) != 0);
}


public void a(int p0, int p1, float p2) { __sourceHandlerCall_1c8d5df7ed7d7e7c65d1(this, p0, p1, p2); }


protected void a(char p0, int p1) throws java.io.IOException {
return;
}


private void a(float p0) {
long life2_3;
    net.minecraft.client.renderer.Tessellator life4_83;
    moom.lw life5_86;
    int life6_97;
    int life7_99;
    moom.JB life8_101;
    int life9_108;
    float life10_118;
    int life11_121;
    int life12_124;
    float life13_133;
    life2_3 = (net.minecraft.client.gui.GuiMainMenu.X ^ 136555756598528L);
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.i)).a__ok())).a__Void(((moom.DD)(this.T)));
    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_5(25511, (2587321147418131377L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_6(6002, (3887183629252284181L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_7(17260, (9213969951389555500L ^ life2_3)))));
    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_9(18282, (1889111890601516825L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_10(32666, (7467432411206166514L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_11(17168, (3619051811116522310L ^ life2_3)))));
    org.lwjgl.opengl.GL11.glCopyTexSubImage2D(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_13(18282, (1889111890601516825L ^ life2_3)))), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_14(28766, (6474882690432509980L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_15(28766, (6474882690432509980L ^ life2_3)))));
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_18(31850, (8685405388307473469L ^ life2_3)))), ((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_19(23454, (8656962863880569740L ^ life2_3)))), ((int)(1)), ((int)(0)));
    moom.kZ.a(((boolean)(true)), ((boolean)(true)), ((boolean)(true)), ((boolean)(false)));
    life4_83 = net.minecraft.client.renderer.Tessellator.a();
    life5_86 = ((net.minecraft.client.renderer.Tessellator)(life4_83)).a__lw();
    ((moom.lw)(life5_86)).a(((int)(__sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_24(26605, (6695769510280806285L ^ life2_3)))), ((moom.oD)(moom.oB.k)));
    moom.kZ.c__Void();
    life6_97 = 3;
    life7_99 = 3;
    life8_101 = moom.JA.a();
    if ((life8_101 != null)) {
        life7_99 = ((moom.JB)(life8_101)).c();
    }
    life9_108 = 0;
    loop_region_109: while ((life9_108 < life7_99)) {
        life10_118 = (0x1.0p0f / ((float) (life9_108 + 1)));
        life11_121 = this.k;
        life12_124 = this.l;
        life13_133 = (((float) (life9_108 - (life6_97 / 2))) / 0x1.0p8f);
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life5_86)).a(((double)(((double) life11_121))), ((double)(((double) life12_124))), ((double)(((double) this.d)))))).a(((double)(((double) (0x0.0p0f + life13_133)))), ((double)(0x1.0p0d))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(life10_118))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life5_86)).a(((double)(((double) life11_121))), ((double)(0x0.0p0d)), ((double)(((double) this.d)))))).a(((double)(((double) (0x1.0p0f + life13_133)))), ((double)(0x1.0p0d))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(life10_118))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life5_86)).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(((double) this.d)))))).a(((double)(((double) (0x1.0p0f + life13_133)))), ((double)(0x0.0p0d))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(life10_118))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life5_86)).a(((double)(0x0.0p0d)), ((double)(((double) life12_124))), ((double)(((double) this.d)))))).a(((double)(((double) (0x0.0p0f + life13_133)))), ((double)(0x0.0p0d))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(life10_118))))).c__Void();
        life9_108 += 1;
    }
    ((net.minecraft.client.renderer.Tessellator)(life4_83)).a__Void();
    moom.kZ.d__Void();
    moom.kZ.a(((boolean)(true)), ((boolean)(true)), ((boolean)(true)), ((boolean)(true)));
    return;
}


public void g() { __sourceHandlerCall_b6cbdddb736a7f0c8813(this); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1164_71(net.minecraft.util.EnumChatFormatting a0, net.minecraft.util.EnumChatFormatting a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1164_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b9ded72a2a_invokedynamic4791_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10282_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic2294_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic2294_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic2294_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_60da6f6f15c0_invokedynamic2294_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1782_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1782_8(int a0, long a1) throws E;
}
