package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiMultiplayer extends net.minecraft.client.gui.GuiScreen implements net.minecraft.client.gui.GuiYesNoCallback {

private static org.apache.logging.log4j.Logger w;

private moom.jZ x;

private net.minecraft.client.gui.GuiScreen y;

private moom.ib z;

private moom.jM A;

private moom.gc B;

private moom.gc C;

private moom.gc D;

private boolean E;

private boolean F;

private boolean G;

private boolean H;

private java.lang.String I;

private moom.jL J;

private moom.jP K;

private moom.Ot L;

private boolean M;

private static long N;

private static long[] O;

private static java.lang.Integer[] P;

private static java.util.Map Q;

public GuiMultiplayer(net.minecraft.client.gui.GuiScreen p0) {
super();
    this.x = new moom.jZ();
    this.y = p0;
}


static {
N = ((long)(((moom._a)(moom._c.a(((long)(-6936275322293172272L)), ((long)(6720765766588035676L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(118763463055045L)))));
    Q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiMultiplayer.N ^ 29914110788971L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1777_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1777_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1777_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1777_14 = new byte[8];
    (__sourceSpill1777_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1777_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1777_16 = __sourceSpill1777_14;
    ((javax.crypto.Cipher)(__sourceSpill1777_11)).init(((int)(__sourceSpill1777_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1777_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1777_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[34];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "O-ñ«Ï\røx\025\016-\"j©M¥µÑ\017LT¯ùM)ÓãS\033\0041\n>ªDPÿ`\032\026@ª^Ècø\007ÏfA\034\006¤þT&A×\001O\023«¨Õà¦í\r\006:i]T\031\026¥\035f·n\n\035\034âòYÓë.ÔÉäü\030^T|`lG&á¦ÿókf\027CñJL%\r\031\025+lð¢\020ßÇÏo©Ý¸\036ãÕH½xÁ=ÈR£½n´d&çîÐ0ÍÝ#\017Kzð·ò\ro«²tp\020\032qPàQ\035Þ±c\033ht\n \025/]ºrµ:C\02211OaBj÷%¤ÀO'X%a§FÙ/(&c,R«\031þÝ0"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1777_25 = local6_life21;
        int __sourceSpill1777_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1777_25)).substring(((int)(__sourceSpill1777_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1777_30 = local8_life19;
        int __sourceSpill1777_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1777_33 = new byte[8];
        (__sourceSpill1777_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1777_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1777_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1777_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1777_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1777_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1777_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1777_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1777_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1777_34)).doFinal(((byte[])(__sourceSpill1777_33)));
        (__sourceSpill1777_30)[__sourceSpill1777_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ýs'9öÖ÷<.L\024ácÍX"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1777_38 = local6_life21;
        int __sourceSpill1777_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1777_38)).substring(((int)(__sourceSpill1777_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1777_43 = local8_life19;
        int __sourceSpill1777_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1777_46 = new byte[8];
        (__sourceSpill1777_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1777_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1777_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1777_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1777_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1777_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1777_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1777_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1777_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1777_47)).doFinal(((byte[])(__sourceSpill1777_46)));
        (__sourceSpill1777_43)[__sourceSpill1777_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    O = ((long[])(local8_life19));
    P = ((java.lang.Integer[])(new java.lang.Integer[34]));
    w = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_2f438ea1f03c029e31c5(net.minecraft.client.gui.GuiMultiplayer a0, char a1, int a2) throws E;
private static final class __SourceHandler_2f438ea1f03c029e31c5 {

public static void f1315(net.minecraft.client.gui.GuiMultiplayer receiver, char p0, int p1) throws Throwable {
    moom.hO forwardValue1315_16_0;
    long life3_3;
    int life5_7;
    moom.hO life6_18;
    forward_join_249: {
    forward_join_245: {
    forward_join_237: {
    forward_join_218: {
    forward_join_214: {
    forward_join_210: {
    forward_join_161: {
    forward_join_121: {
    forward_join_117: {
    forward_join_113: {
    forward_join_70: {
    forward_join_27: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (__fieldRead1315_0() ^ 107422000884762L);
    life5_7 = __call1315_2(__fieldRead1315_1(receiver));
    if (!((life5_7 < 0))) {
        break forward_join_12;
    }
    forwardValue1315_16_0 = null;
    break forward_join_16;
    }
    forwardValue1315_16_0 = __call1315_4(__fieldRead1315_3(receiver), life5_7);
    }
    life6_18 = forwardValue1315_16_0;
    if (!((p1 == __invokedynamic1315_5(23407, (7458726614173792075L ^ life3_3))))) {
        break forward_join_27;
    }
    __call1315_6(receiver);
    break forward_join_249;
    }
    if (!((life5_7 >= 0))) {
        break forward_join_245;
    }
    if (!((p1 == __invokedynamic1315_7(20840, (3024519023573089648L ^ life3_3))))) {
        break forward_join_121;
    }
    if (!(__call1315_8())) {
        break forward_join_70;
    }
    if (!((life5_7 > 0))) {
        break forward_join_249;
    }
    if (!((__instanceOf1315_9(life6_18) != 0))) {
        break forward_join_249;
    }
    __call1315_11(__fieldRead1315_10(receiver), life5_7, (life5_7 - 1));
    __call1315_14(receiver, (__call1315_13(__fieldRead1315_12(receiver)) - 1));
    __call1315_18(__fieldRead1315_15(receiver), (-__call1315_17(__fieldRead1315_16(receiver))));
    __call1315_21(__fieldRead1315_19(receiver), __fieldRead1315_20(receiver));
    break forward_join_249;
    }
    if (!((life5_7 > 0))) {
        break forward_join_117;
    }
    __call1315_24(receiver, (__call1315_23(__fieldRead1315_22(receiver)) - 1));
    __call1315_28(__fieldRead1315_25(receiver), (-__call1315_27(__fieldRead1315_26(receiver))));
    if (!((__instanceOf1315_33(__call1315_32(__fieldRead1315_29(receiver), __call1315_31(__fieldRead1315_30(receiver)))) != 0))) {
        break forward_join_249;
    }
    if (!((__call1315_35(__fieldRead1315_34(receiver)) > 0))) {
        break forward_join_113;
    }
    __call1315_38(receiver, (__call1315_37(__fieldRead1315_36(receiver)) - 1));
    __call1315_42(__fieldRead1315_39(receiver), (-__call1315_41(__fieldRead1315_40(receiver))));
    break forward_join_249;
    }
    __call1315_43(receiver, -1);
    break forward_join_249;
    }
    __call1315_44(receiver, -1);
    break forward_join_249;
    }
    if (!((p1 == __invokedynamic1315_45(26351, (8826445442730035957L ^ life3_3))))) {
        break forward_join_218;
    }
    if (!(__call1315_46())) {
        break forward_join_161;
    }
    if (!((life5_7 < (__call1315_48(__fieldRead1315_47(receiver)) - 1)))) {
        break forward_join_249;
    }
    __call1315_50(__fieldRead1315_49(receiver), life5_7, (life5_7 + 1));
    __call1315_51(receiver, (life5_7 + 1));
    __call1315_55(__fieldRead1315_52(receiver), __call1315_54(__fieldRead1315_53(receiver)));
    __call1315_58(__fieldRead1315_56(receiver), __fieldRead1315_57(receiver));
    break forward_join_249;
    }
    if (!((life5_7 < __call1315_60(__fieldRead1315_59(receiver))))) {
        break forward_join_214;
    }
    __call1315_63(receiver, (__call1315_62(__fieldRead1315_61(receiver)) + 1));
    __call1315_67(__fieldRead1315_64(receiver), __call1315_66(__fieldRead1315_65(receiver)));
    if (!((__instanceOf1315_72(__call1315_71(__fieldRead1315_68(receiver), __call1315_70(__fieldRead1315_69(receiver)))) != 0))) {
        break forward_join_249;
    }
    if (!((__call1315_74(__fieldRead1315_73(receiver)) < (__call1315_76(__fieldRead1315_75(receiver)) - 1)))) {
        break forward_join_210;
    }
    __call1315_79(receiver, (__call1315_78(__fieldRead1315_77(receiver)) + 1));
    __call1315_83(__fieldRead1315_80(receiver), __call1315_82(__fieldRead1315_81(receiver)));
    break forward_join_249;
    }
    __call1315_84(receiver, -1);
    break forward_join_249;
    }
    __call1315_85(receiver, -1);
    break forward_join_249;
    }
    if (!((p1 != __invokedynamic1315_86(19510, (8375800917481431099L ^ life3_3))))) {
        break forward_join_237;
    }
    if (!((p1 != __invokedynamic1315_87(10082, (3768712013644745568L ^ life3_3))))) {
        break forward_join_237;
    }
    __call1315_88(receiver, p0, p1);
    break forward_join_249;
    }
    __call1315_92(receiver, __cast1315_91(__call1315_90(__fieldRead1315_89(receiver), 2)));
    break forward_join_249;
    }
    __call1315_93(receiver, p0, p1);
    }
    return;
}
public static void h1315_0(java.io.IOException p0) throws Throwable {
    throw __call1131500_0(p0);
}
public static void h1315_1(java.io.IOException p0) throws Throwable {
    throw __call1131501_0(p0);
}
public static void h1315_2(java.io.IOException p0) throws Throwable {
    throw __call1131502_0(p0);
}
public static void h1315_3(java.io.IOException p0) throws Throwable {
    throw __call1131503_0(p0);
}
public static void h1315_4(java.io.IOException p0) throws Throwable {
    throw __call1131504_0(p0);
}
public static void h1315_5(java.io.IOException p0) throws Throwable {
    throw __call1131505_0(p0);
}
public static void h1315_6(java.io.IOException p0) throws Throwable {
    throw __call1131506_0(p0);
}
public static void h1315_7(java.io.IOException p0) throws Throwable {
    throw __call1131507_0(p0);
}
public static void h1315_8(java.io.IOException p0) throws Throwable {
    throw __call1131508_0(p0);
}
public static void h1315_9(java.io.IOException p0) throws Throwable {
    throw __call1131509_0(p0);
}
public static void h1315_10(java.io.IOException p0) throws Throwable {
    throw __call1131510_0(p0);
}
public static void h1315_11(java.io.IOException p0) throws Throwable {
    throw __call1131511_0(p0);
}
public static void h1315_12(java.io.IOException p0) throws Throwable {
    throw __call1131512_0(p0);
}
public static void h1315_13(java.io.IOException p0) throws Throwable {
    throw __call1131513_0(p0);
}
public static void h1315_14(java.io.IOException p0) throws Throwable {
    throw __call1131514_0(p0);
}
public static void h1315_15(java.io.IOException p0) throws Throwable {
    throw __call1131515_0(p0);
}
public static void h1315_16(java.io.IOException p0) throws Throwable {
    throw __call1131516_0(p0);
}
public static void h1315_17(java.io.IOException p0) throws Throwable {
    throw __call1131517_0(p0);
}
private static native long __fieldRead1315_0() throws Throwable;
private static native moom.ib __fieldRead1315_1(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_2(moom.ib a0) throws Throwable;
private static native moom.ib __fieldRead1315_3(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.hO __call1315_4(moom.ib a0, int a1) throws Throwable;
private static native int __invokedynamic1315_5(int a0, long a1) throws Throwable;
private static native void __call1315_6(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __invokedynamic1315_7(int a0, long a1) throws Throwable;
private static native boolean __call1315_8() throws Throwable;
private static native int __instanceOf1315_9(moom.hO a0) throws Throwable;
private static native moom.jM __fieldRead1315_10(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1315_11(moom.jM a0, int a1, int a2) throws Throwable;
private static native moom.ib __fieldRead1315_12(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_13(moom.ib a0) throws Throwable;
private static native void __call1315_14(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native moom.ib __fieldRead1315_15(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.ib __fieldRead1315_16(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_17(moom.ib a0) throws Throwable;
private static native void __call1315_18(moom.ib a0, int a1) throws Throwable;
private static native moom.ib __fieldRead1315_19(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.jM __fieldRead1315_20(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1315_21(moom.ib a0, moom.jM a1) throws Throwable;
private static native moom.ib __fieldRead1315_22(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_23(moom.ib a0) throws Throwable;
private static native void __call1315_24(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native moom.ib __fieldRead1315_25(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.ib __fieldRead1315_26(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_27(moom.ib a0) throws Throwable;
private static native void __call1315_28(moom.ib a0, int a1) throws Throwable;
private static native moom.ib __fieldRead1315_29(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.ib __fieldRead1315_30(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_31(moom.ib a0) throws Throwable;
private static native moom.hO __call1315_32(moom.ib a0, int a1) throws Throwable;
private static native int __instanceOf1315_33(moom.hO a0) throws Throwable;
private static native moom.ib __fieldRead1315_34(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_35(moom.ib a0) throws Throwable;
private static native moom.ib __fieldRead1315_36(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_37(moom.ib a0) throws Throwable;
private static native void __call1315_38(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native moom.ib __fieldRead1315_39(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.ib __fieldRead1315_40(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_41(moom.ib a0) throws Throwable;
private static native void __call1315_42(moom.ib a0, int a1) throws Throwable;
private static native void __call1315_43(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native void __call1315_44(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native int __invokedynamic1315_45(int a0, long a1) throws Throwable;
private static native boolean __call1315_46() throws Throwable;
private static native moom.jM __fieldRead1315_47(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_48(moom.jM a0) throws Throwable;
private static native moom.jM __fieldRead1315_49(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1315_50(moom.jM a0, int a1, int a2) throws Throwable;
private static native void __call1315_51(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native moom.ib __fieldRead1315_52(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.ib __fieldRead1315_53(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_54(moom.ib a0) throws Throwable;
private static native void __call1315_55(moom.ib a0, int a1) throws Throwable;
private static native moom.ib __fieldRead1315_56(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.jM __fieldRead1315_57(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1315_58(moom.ib a0, moom.jM a1) throws Throwable;
private static native moom.ib __fieldRead1315_59(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_60(moom.ib a0) throws Throwable;
private static native moom.ib __fieldRead1315_61(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_62(moom.ib a0) throws Throwable;
private static native void __call1315_63(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native moom.ib __fieldRead1315_64(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.ib __fieldRead1315_65(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_66(moom.ib a0) throws Throwable;
private static native void __call1315_67(moom.ib a0, int a1) throws Throwable;
private static native moom.ib __fieldRead1315_68(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.ib __fieldRead1315_69(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_70(moom.ib a0) throws Throwable;
private static native moom.hO __call1315_71(moom.ib a0, int a1) throws Throwable;
private static native int __instanceOf1315_72(moom.hO a0) throws Throwable;
private static native moom.ib __fieldRead1315_73(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_74(moom.ib a0) throws Throwable;
private static native moom.ib __fieldRead1315_75(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_76(moom.ib a0) throws Throwable;
private static native moom.ib __fieldRead1315_77(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_78(moom.ib a0) throws Throwable;
private static native void __call1315_79(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native moom.ib __fieldRead1315_80(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.ib __fieldRead1315_81(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1315_82(moom.ib a0) throws Throwable;
private static native void __call1315_83(moom.ib a0, int a1) throws Throwable;
private static native void __call1315_84(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native void __call1315_85(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native int __invokedynamic1315_86(int a0, long a1) throws Throwable;
private static native int __invokedynamic1315_87(int a0, long a1) throws Throwable;
private static native void __call1315_88(net.minecraft.client.gui.GuiMultiplayer a0, char a1, int a2) throws Throwable;
private static native java.util.List __fieldRead1315_89(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native java.lang.Object __call1315_90(java.util.List a0, int a1) throws Throwable;
private static native moom.gc __cast1315_91(java.lang.Object a0) throws Throwable;
private static native void __call1315_92(net.minecraft.client.gui.GuiMultiplayer a0, moom.gc a1) throws Throwable;
private static native void __call1315_93(net.minecraft.client.gui.GuiMultiplayer a0, char a1, int a2) throws Throwable;
private static native java.lang.Exception __call1131500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131501_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131502_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131503_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131504_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131505_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131506_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131507_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131508_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131509_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131510_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131511_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131512_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131513_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131514_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131515_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131516_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1131517_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9e416fbbf6fe5e2f9dcd(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws E;
private static final class __SourceHandler_9e416fbbf6fe5e2f9dcd {

public static void f2262(net.minecraft.client.gui.GuiMultiplayer receiver, int p0) throws Throwable {
    moom.hO life2_14;
    __call2262_1(__fieldRead2262_0(receiver), p0);
    life2_14 = ((p0 < 0) ? null : __call2262_3(__fieldRead2262_2(receiver), p0));
    __fieldWrite2262_5(__fieldRead2262_4(receiver), 0);
    __fieldWrite2262_7(__fieldRead2262_6(receiver), 0);
    __fieldWrite2262_9(__fieldRead2262_8(receiver), 0);
    if ((life2_14 != null)) {
        if ((__instanceOf2262_10(life2_14) == 0)) {
        __fieldWrite2262_12(__fieldRead2262_11(receiver), 1);
        if ((__instanceOf2262_13(life2_14) != 0)) {
        __fieldWrite2262_15(__fieldRead2262_14(receiver), 1);
        __fieldWrite2262_17(__fieldRead2262_16(receiver), 1);
    }
    }
    }
    return;
}
public static void h2262_0(moom.Oo p0) throws Throwable {
    throw __call1226200_0(p0);
}
public static void h2262_1(moom.Oo p0) throws Throwable {
    throw __call1226201_0(p0);
}
public static void h2262_2(moom.Oo p0) throws Throwable {
    throw __call1226202_0(p0);
}
public static void h2262_3(moom.Oo p0) throws Throwable {
    throw __call1226203_0(p0);
}
private static native moom.ib __fieldRead2262_0(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call2262_1(moom.ib a0, int a1) throws Throwable;
private static native moom.ib __fieldRead2262_2(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.hO __call2262_3(moom.ib a0, int a1) throws Throwable;
private static native moom.gc __fieldRead2262_4(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __fieldWrite2262_5(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead2262_6(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __fieldWrite2262_7(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead2262_8(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __fieldWrite2262_9(moom.gc a0, int a1) throws Throwable;
private static native int __instanceOf2262_10(moom.hO a0) throws Throwable;
private static native moom.gc __fieldRead2262_11(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __fieldWrite2262_12(moom.gc a0, int a1) throws Throwable;
private static native int __instanceOf2262_13(moom.hO a0) throws Throwable;
private static native moom.gc __fieldRead2262_14(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __fieldWrite2262_15(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead2262_16(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __fieldWrite2262_17(moom.gc a0, int a1) throws Throwable;
private static native java.lang.Exception __call1226200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1226201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1226202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1226203_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_e0b06d586864b39b5dbf(net.minecraft.client.gui.GuiMultiplayer a0, moom.iu a1, int a2) throws E;
private static final class __SourceHandler_e0b06d586864b39b5dbf {

public static boolean f2263(net.minecraft.client.gui.GuiMultiplayer receiver, moom.iu p0, int p1) throws Throwable {
    return ((p1 > 0) ? true : false);
}
public static void h2263_0(moom.Oo p0) throws Throwable {
    throw __call1226300_0(p0);
}
private static native java.lang.Exception __call1226300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_485d8b11f5d67f8543c7(net.minecraft.client.gui.GuiMultiplayer a0, moom.iu a1, int a2, boolean a3) throws E;
private static final class __SourceHandler_485d8b11f5d67f8543c7 {

public static void f2264(net.minecraft.client.gui.GuiMultiplayer receiver, moom.iu p0, int p1, boolean p2) throws Throwable {
    int life4_9;
    life4_9 = (p2 ? 0 : (p1 - 1));
    __call2264_1(__fieldRead2264_0(receiver), p1, life4_9);
    if ((__call2264_3(__fieldRead2264_2(receiver)) == p1)) {
        __call2264_4(receiver, life4_9);
    }
    __call2264_7(__fieldRead2264_5(receiver), __fieldRead2264_6(receiver));
    return;
}
public static void h2264_0(moom.Oo p0) throws Throwable {
    throw __call1226400_0(p0);
}
public static void h2264_1(moom.Oo p0) throws Throwable {
    throw __call1226401_0(p0);
}
private static native moom.jM __fieldRead2264_0(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call2264_1(moom.jM a0, int a1, int a2) throws Throwable;
private static native moom.ib __fieldRead2264_2(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call2264_3(moom.ib a0) throws Throwable;
private static native void __call2264_4(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native moom.ib __fieldRead2264_5(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.jM __fieldRead2264_6(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call2264_7(moom.ib a0, moom.jM a1) throws Throwable;
private static native java.lang.Exception __call1226400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1226401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e691cfffa049f8f1c793(net.minecraft.client.gui.GuiMultiplayer a0, boolean a1, int a2) throws E;
private static final class __SourceHandler_e691cfffa049f8f1c793 {

public static void f1316(net.minecraft.client.gui.GuiMultiplayer receiver, boolean p0, int p1) throws Throwable {
    moom.hO forwardValue1316_12_0;
    moom.hO life3_14;
    moom.jL life4_137;
    forward_join_136: {
    forward_join_132: {
    forward_join_95: {
    forward_join_90: {
    forward_join_65: {
    forward_join_60: {
    forward_join_47: {
    forward_join_42: {
    forward_join_12: {
    forward_join_6: {
    if (!((__call1316_1(__fieldRead1316_0(receiver)) < 0))) {
        break forward_join_6;
    }
    forwardValue1316_12_0 = null;
    break forward_join_12;
    }
    forwardValue1316_12_0 = __call1316_5(__fieldRead1316_2(receiver), __call1316_4(__fieldRead1316_3(receiver)));
    }
    life3_14 = forwardValue1316_12_0;
    if (!(__fieldRead1316_6(receiver))) {
        break forward_join_47;
    }
    __fieldWrite1316_7(receiver, 0);
    if (!(p0)) {
        break forward_join_42;
    }
    if (!((__instanceOf1316_8(life3_14) != 0))) {
        break forward_join_42;
    }
    __call1316_12(__fieldRead1316_9(receiver), __call1316_11(__fieldRead1316_10(receiver)));
    __call1316_14(__fieldRead1316_13(receiver));
    __call1316_16(__fieldRead1316_15(receiver), -1);
    __call1316_19(__fieldRead1316_17(receiver), __fieldRead1316_18(receiver));
    }
    __call1316_21(__fieldRead1316_20(receiver), receiver);
    break forward_join_136;
    }
    if (!(__fieldRead1316_22(receiver))) {
        break forward_join_65;
    }
    __fieldWrite1316_23(receiver, 0);
    if (!(p0)) {
        break forward_join_60;
    }
    __call1316_25(receiver, __fieldRead1316_24(receiver));
    break forward_join_136;
    }
    __call1316_27(__fieldRead1316_26(receiver), receiver);
    break forward_join_136;
    }
    if (!(__fieldRead1316_28(receiver))) {
        break forward_join_95;
    }
    __fieldWrite1316_29(receiver, 0);
    if (!(p0)) {
        break forward_join_90;
    }
    __call1316_32(__fieldRead1316_30(receiver), __fieldRead1316_31(receiver));
    __call1316_34(__fieldRead1316_33(receiver));
    __call1316_36(__fieldRead1316_35(receiver), -1);
    __call1316_39(__fieldRead1316_37(receiver), __fieldRead1316_38(receiver));
    }
    __call1316_41(__fieldRead1316_40(receiver), receiver);
    break forward_join_136;
    }
    if (!(__fieldRead1316_42(receiver))) {
        break forward_join_136;
    }
    __fieldWrite1316_43(receiver, 0);
    if (!(p0)) {
        break forward_join_132;
    }
    if (!((__instanceOf1316_44(life3_14) != 0))) {
        break forward_join_132;
    }
    life4_137 = __call1316_46(__cast1316_45(life3_14));
    __fieldWrite1316_49(life4_137, __fieldRead1316_48(__fieldRead1316_47(receiver)));
    __fieldWrite1316_52(life4_137, __fieldRead1316_51(__fieldRead1316_50(receiver)));
    __call1316_54(life4_137, __fieldRead1316_53(receiver));
    __call1316_56(__fieldRead1316_55(receiver));
    __call1316_59(__fieldRead1316_57(receiver), __fieldRead1316_58(receiver));
    }
    __call1316_61(__fieldRead1316_60(receiver), receiver);
    }
    return;
}
public static void h1316_0(moom.Oo p0) throws Throwable {
    throw __call1131600_0(p0);
}
public static void h1316_1(moom.Oo p0) throws Throwable {
    throw __call1131601_0(p0);
}
public static void h1316_2(moom.Oo p0) throws Throwable {
    throw __call1131602_0(p0);
}
public static void h1316_3(moom.Oo p0) throws Throwable {
    throw __call1131603_0(p0);
}
public static void h1316_4(moom.Oo p0) throws Throwable {
    throw __call1131604_0(p0);
}
public static void h1316_5(moom.Oo p0) throws Throwable {
    throw __call1131605_0(p0);
}
public static void h1316_6(moom.Oo p0) throws Throwable {
    throw __call1131606_0(p0);
}
public static void h1316_7(moom.Oo p0) throws Throwable {
    throw __call1131607_0(p0);
}
public static void h1316_8(moom.Oo p0) throws Throwable {
    throw __call1131608_0(p0);
}
public static void h1316_9(moom.Oo p0) throws Throwable {
    throw __call1131609_0(p0);
}
private static native moom.ib __fieldRead1316_0(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1316_1(moom.ib a0) throws Throwable;
private static native moom.ib __fieldRead1316_2(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.ib __fieldRead1316_3(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1316_4(moom.ib a0) throws Throwable;
private static native moom.hO __call1316_5(moom.ib a0, int a1) throws Throwable;
private static native boolean __fieldRead1316_6(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __fieldWrite1316_7(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native int __instanceOf1316_8(moom.hO a0) throws Throwable;
private static native moom.jM __fieldRead1316_9(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.ib __fieldRead1316_10(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call1316_11(moom.ib a0) throws Throwable;
private static native void __call1316_12(moom.jM a0, int a1) throws Throwable;
private static native moom.jM __fieldRead1316_13(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_14(moom.jM a0) throws Throwable;
private static native moom.ib __fieldRead1316_15(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_16(moom.ib a0, int a1) throws Throwable;
private static native moom.ib __fieldRead1316_17(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.jM __fieldRead1316_18(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_19(moom.ib a0, moom.jM a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1316_20(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_21(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiMultiplayer a1) throws Throwable;
private static native boolean __fieldRead1316_22(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __fieldWrite1316_23(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native moom.jL __fieldRead1316_24(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_25(net.minecraft.client.gui.GuiMultiplayer a0, moom.jL a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1316_26(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_27(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiMultiplayer a1) throws Throwable;
private static native boolean __fieldRead1316_28(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __fieldWrite1316_29(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native moom.jM __fieldRead1316_30(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.jL __fieldRead1316_31(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_32(moom.jM a0, moom.jL a1) throws Throwable;
private static native moom.jM __fieldRead1316_33(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_34(moom.jM a0) throws Throwable;
private static native moom.ib __fieldRead1316_35(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_36(moom.ib a0, int a1) throws Throwable;
private static native moom.ib __fieldRead1316_37(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.jM __fieldRead1316_38(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_39(moom.ib a0, moom.jM a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1316_40(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_41(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiMultiplayer a1) throws Throwable;
private static native boolean __fieldRead1316_42(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __fieldWrite1316_43(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native int __instanceOf1316_44(moom.hO a0) throws Throwable;
private static native moom.iu __cast1316_45(moom.hO a0) throws Throwable;
private static native moom.jL __call1316_46(moom.iu a0) throws Throwable;
private static native moom.jL __fieldRead1316_47(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native java.lang.String __fieldRead1316_48(moom.jL a0) throws Throwable;
private static native void __fieldWrite1316_49(moom.jL a0, java.lang.String a1) throws Throwable;
private static native moom.jL __fieldRead1316_50(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native java.lang.String __fieldRead1316_51(moom.jL a0) throws Throwable;
private static native void __fieldWrite1316_52(moom.jL a0, java.lang.String a1) throws Throwable;
private static native moom.jL __fieldRead1316_53(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_54(moom.jL a0, moom.jL a1) throws Throwable;
private static native moom.jM __fieldRead1316_55(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_56(moom.jM a0) throws Throwable;
private static native moom.ib __fieldRead1316_57(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.jM __fieldRead1316_58(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_59(moom.ib a0, moom.jM a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1316_60(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1316_61(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiMultiplayer a1) throws Throwable;
private static native java.lang.Exception __call1131600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131609_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3263ae3604afed9bbed8(net.minecraft.client.gui.GuiMultiplayer a0, moom.gc a1) throws E;
private static final class __SourceHandler_3263ae3604afed9bbed8 {

public static void f300120(net.minecraft.client.gui.GuiMultiplayer receiver, moom.gc p0) throws Throwable {
    moom.hO forestValue300120_19_0;
    moom.hb spill300120_0;
    net.minecraft.client.Minecraft spill300120_1;
    moom.g6 spill300120_2;
    moom.g6 spill300120_3;
    net.minecraft.client.gui.GuiMultiplayer spill300120_4;
    net.minecraft.client.gui.GuiMultiplayer spill300120_5;
    moom.jL spill300120_6;
    moom.jL spill300120_7;
    net.minecraft.client.Minecraft spill300120_8;
    moom.g0 spill300120_9;
    moom.g0 spill300120_10;
    net.minecraft.client.gui.GuiMultiplayer spill300120_11;
    net.minecraft.client.gui.GuiMultiplayer spill300120_12;
    moom.jL spill300120_13;
    moom.jL spill300120_14;
    net.minecraft.client.gui.GuiMultiplayer spill300120_15;
    moom.jL spill300120_16;
    net.minecraft.client.Minecraft spill300120_17;
    moom.g0 spill300120_18;
    long life2_3;
    moom.hO life4_20;
    java.lang.String life5_33;
    java.lang.String life6_43;
    java.lang.String life7_50;
    java.lang.String life8_55;
    java.lang.String life9_60;
    moom.hb life10_72;
    moom.jL life5_157;
    forest_join_198: {
    forest_join_188: {
    forest_join_179: {
    forest_join_137: {
    forest_join_110: {
    forest_join_83: {
    forest_join_76: {
    forest_join_75: {
    forest_join_19: {
    forest_join_13: {
    life2_3 = (__fieldRead300120_0() ^ 46406794469814L);
    if (!(__fieldRead300120_1(p0))) {
        break forest_join_198;
    }
    if (!((__call300120_3(__fieldRead300120_2(receiver)) < 0))) {
        break forest_join_13;
    }
    forestValue300120_19_0 = null;
    break forest_join_19;
    }
    forestValue300120_19_0 = __call300120_7(__fieldRead300120_4(receiver), __call300120_6(__fieldRead300120_5(receiver)));
    }
    life4_20 = forestValue300120_19_0;
    if (!((__fieldRead300120_8(p0) == 2))) {
        break forest_join_76;
    }
    if (!((__instanceOf300120_9(life4_20) != 0))) {
        break forest_join_76;
    }
    life5_33 = __fieldRead300120_12(__call300120_11(__cast300120_10(life4_20)));
    if (!((life5_33 != null))) {
        break forest_join_75;
    }
    __fieldWrite300120_13(receiver, 1);
    life6_43 = __call300120_14("selectServer.deleteQuestion", new java.lang.Object[0]);
    life7_50 = __invokedynamic300120_16(life5_33, __call300120_15("selectServer.deleteWarning", new java.lang.Object[0]));
    life8_55 = __call300120_17("selectServer.deleteButton", new java.lang.Object[0]);
    life9_60 = __call300120_18("gui.cancel", new java.lang.Object[0]);
    moom.hb __stackOp300120_20_0 = __sourceUninitializedNEW300120_19();
    spill300120_0 = __stackOp300120_20_0;
    __explicitNewInit300120_23(__stackOp300120_20_0, receiver, life6_43, life7_50, life8_55, life9_60, __call300120_22(__fieldRead300120_21(receiver)));
    life10_72 = spill300120_0;
    __call300120_25(__fieldRead300120_24(receiver), life10_72);
    }
    break forest_join_198;
    }
    if (!((__fieldRead300120_26(p0) == 1))) {
        break forest_join_83;
    }
    __call300120_27(receiver);
    break forest_join_198;
    }
    if (!((__fieldRead300120_28(p0) == 4))) {
        break forest_join_110;
    }
    __fieldWrite300120_29(receiver, 1);
    spill300120_1 = __fieldRead300120_30(receiver);
    moom.g6 __stackOp300120_32_0 = __sourceUninitializedNEW300120_31();
    spill300120_2 = __stackOp300120_32_0;
    spill300120_3 = __stackOp300120_32_0;
    spill300120_4 = receiver;
    spill300120_5 = receiver;
    moom.jL __stackOp300120_34_0 = __sourceUninitializedNEW300120_33();
    spill300120_6 = __stackOp300120_34_0;
    __explicitNewInit300120_36(__stackOp300120_34_0, __call300120_35("selectServer.defaultName", new java.lang.Object[0]), "", false);
    net.minecraft.client.gui.GuiMultiplayer __stackOp300120_37_0 = spill300120_5;
    moom.jL __stackOp300120_37_1 = spill300120_6;
    spill300120_7 = __stackOp300120_37_1;
    __fieldWrite300120_38(__stackOp300120_37_0, __stackOp300120_37_1);
    __explicitNewInit300120_39(spill300120_3, spill300120_4, spill300120_7);
    __call300120_40(spill300120_1, spill300120_2);
    break forest_join_198;
    }
    if (!((__fieldRead300120_41(p0) == 3))) {
        break forest_join_137;
    }
    __fieldWrite300120_42(receiver, 1);
    spill300120_8 = __fieldRead300120_43(receiver);
    moom.g0 __stackOp300120_45_0 = __sourceUninitializedNEW300120_44();
    spill300120_9 = __stackOp300120_45_0;
    spill300120_10 = __stackOp300120_45_0;
    spill300120_11 = receiver;
    spill300120_12 = receiver;
    moom.jL __stackOp300120_47_0 = __sourceUninitializedNEW300120_46();
    spill300120_13 = __stackOp300120_47_0;
    __explicitNewInit300120_49(__stackOp300120_47_0, __call300120_48("selectServer.defaultName", new java.lang.Object[0]), "", false);
    net.minecraft.client.gui.GuiMultiplayer __stackOp300120_50_0 = spill300120_12;
    moom.jL __stackOp300120_50_1 = spill300120_13;
    spill300120_14 = __stackOp300120_50_1;
    __fieldWrite300120_51(__stackOp300120_50_0, __stackOp300120_50_1);
    __explicitNewInit300120_52(spill300120_10, spill300120_11, spill300120_14);
    __call300120_53(spill300120_8, spill300120_9);
    break forest_join_198;
    }
    if (!((__fieldRead300120_54(p0) == __invokedynamic300120_55(32079, (4043834345853770988L ^ life2_3))))) {
        break forest_join_179;
    }
    if (!((__instanceOf300120_56(life4_20) != 0))) {
        break forest_join_179;
    }
    __fieldWrite300120_57(receiver, 1);
    life5_157 = __call300120_59(__cast300120_58(life4_20));
    spill300120_15 = receiver;
    moom.jL __stackOp300120_61_0 = __sourceUninitializedNEW300120_60();
    spill300120_16 = __stackOp300120_61_0;
    __explicitNewInit300120_64(__stackOp300120_61_0, __fieldRead300120_62(life5_157), __fieldRead300120_63(life5_157), false);
    __fieldWrite300120_65(spill300120_15, spill300120_16);
    __call300120_67(__fieldRead300120_66(receiver), life5_157);
    spill300120_17 = __fieldRead300120_68(receiver);
    moom.g0 __stackOp300120_70_0 = __sourceUninitializedNEW300120_69();
    spill300120_18 = __stackOp300120_70_0;
    __explicitNewInit300120_72(__stackOp300120_70_0, receiver, __fieldRead300120_71(receiver));
    __call300120_73(spill300120_17, spill300120_18);
    break forest_join_198;
    }
    if (!((__fieldRead300120_74(p0) == 0))) {
        break forest_join_188;
    }
    __call300120_77(__fieldRead300120_75(receiver), __fieldRead300120_76(receiver));
    break forest_join_198;
    }
    if (!((__fieldRead300120_78(p0) == __invokedynamic300120_79(7067, (5169551554260777524L ^ life2_3))))) {
        break forest_join_198;
    }
    __call300120_80(receiver);
    }
    return;
}
public static void h300120_0(java.io.IOException p0) throws Throwable {
    throw __call33012000_0(p0);
}
public static void h300120_1(java.io.IOException p0) throws Throwable {
    throw __call33012001_0(p0);
}
public static void h300120_2(java.io.IOException p0) throws Throwable {
    throw __call33012002_0(p0);
}
public static void h300120_3(java.io.IOException p0) throws Throwable {
    throw __call33012003_0(p0);
}
public static void h300120_4(java.io.IOException p0) throws Throwable {
    throw __call33012004_0(p0);
}
public static void h300120_5(java.io.IOException p0) throws Throwable {
    throw __call33012005_0(p0);
}
public static void h300120_6(java.io.IOException p0) throws Throwable {
    throw __call33012006_0(p0);
}
public static void h300120_7(java.io.IOException p0) throws Throwable {
    throw __call33012007_0(p0);
}
public static void h300120_8(java.io.IOException p0) throws Throwable {
    throw __call33012008_0(p0);
}
private static native long __fieldRead300120_0() throws Throwable;
private static native boolean __fieldRead300120_1(moom.gc a0) throws Throwable;
private static native moom.ib __fieldRead300120_2(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call300120_3(moom.ib a0) throws Throwable;
private static native moom.ib __fieldRead300120_4(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.ib __fieldRead300120_5(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call300120_6(moom.ib a0) throws Throwable;
private static native moom.hO __call300120_7(moom.ib a0, int a1) throws Throwable;
private static native int __fieldRead300120_8(moom.gc a0) throws Throwable;
private static native int __instanceOf300120_9(moom.hO a0) throws Throwable;
private static native moom.iu __cast300120_10(moom.hO a0) throws Throwable;
private static native moom.jL __call300120_11(moom.iu a0) throws Throwable;
private static native java.lang.String __fieldRead300120_12(moom.jL a0) throws Throwable;
private static native void __fieldWrite300120_13(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native java.lang.String __call300120_14(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __call300120_15(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic300120_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call300120_17(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __call300120_18(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.hb __sourceUninitializedNEW300120_19() throws Throwable;
private static native moom.ib __fieldRead300120_21(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call300120_22(moom.ib a0) throws Throwable;
private static native void __explicitNewInit300120_23(moom.hb a0, net.minecraft.client.gui.GuiYesNoCallback a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, int a6) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead300120_24(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call300120_25(net.minecraft.client.Minecraft a0, moom.hb a1) throws Throwable;
private static native int __fieldRead300120_26(moom.gc a0) throws Throwable;
private static native void __call300120_27(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __fieldRead300120_28(moom.gc a0) throws Throwable;
private static native void __fieldWrite300120_29(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead300120_30(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.g6 __sourceUninitializedNEW300120_31() throws Throwable;
private static native moom.jL __sourceUninitializedNEW300120_33() throws Throwable;
private static native java.lang.String __call300120_35(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit300120_36(moom.jL a0, java.lang.String a1, java.lang.String a2, boolean a3) throws Throwable;
private static native void __fieldWrite300120_38(net.minecraft.client.gui.GuiMultiplayer a0, moom.jL a1) throws Throwable;
private static native void __explicitNewInit300120_39(moom.g6 a0, net.minecraft.client.gui.GuiScreen a1, moom.jL a2) throws Throwable;
private static native void __call300120_40(net.minecraft.client.Minecraft a0, moom.g6 a1) throws Throwable;
private static native int __fieldRead300120_41(moom.gc a0) throws Throwable;
private static native void __fieldWrite300120_42(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead300120_43(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.g0 __sourceUninitializedNEW300120_44() throws Throwable;
private static native moom.jL __sourceUninitializedNEW300120_46() throws Throwable;
private static native java.lang.String __call300120_48(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit300120_49(moom.jL a0, java.lang.String a1, java.lang.String a2, boolean a3) throws Throwable;
private static native void __fieldWrite300120_51(net.minecraft.client.gui.GuiMultiplayer a0, moom.jL a1) throws Throwable;
private static native void __explicitNewInit300120_52(moom.g0 a0, net.minecraft.client.gui.GuiScreen a1, moom.jL a2) throws Throwable;
private static native void __call300120_53(net.minecraft.client.Minecraft a0, moom.g0 a1) throws Throwable;
private static native int __fieldRead300120_54(moom.gc a0) throws Throwable;
private static native int __invokedynamic300120_55(int a0, long a1) throws Throwable;
private static native int __instanceOf300120_56(moom.hO a0) throws Throwable;
private static native void __fieldWrite300120_57(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native moom.iu __cast300120_58(moom.hO a0) throws Throwable;
private static native moom.jL __call300120_59(moom.iu a0) throws Throwable;
private static native moom.jL __sourceUninitializedNEW300120_60() throws Throwable;
private static native java.lang.String __fieldRead300120_62(moom.jL a0) throws Throwable;
private static native java.lang.String __fieldRead300120_63(moom.jL a0) throws Throwable;
private static native void __explicitNewInit300120_64(moom.jL a0, java.lang.String a1, java.lang.String a2, boolean a3) throws Throwable;
private static native void __fieldWrite300120_65(net.minecraft.client.gui.GuiMultiplayer a0, moom.jL a1) throws Throwable;
private static native moom.jL __fieldRead300120_66(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call300120_67(moom.jL a0, moom.jL a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead300120_68(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.g0 __sourceUninitializedNEW300120_69() throws Throwable;
private static native moom.jL __fieldRead300120_71(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __explicitNewInit300120_72(moom.g0 a0, net.minecraft.client.gui.GuiScreen a1, moom.jL a2) throws Throwable;
private static native void __call300120_73(net.minecraft.client.Minecraft a0, moom.g0 a1) throws Throwable;
private static native int __fieldRead300120_74(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead300120_75(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead300120_76(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call300120_77(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native int __fieldRead300120_78(moom.gc a0) throws Throwable;
private static native int __invokedynamic300120_79(int a0, long a1) throws Throwable;
private static native void __call300120_80(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native java.lang.Exception __call33012000_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call33012001_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call33012002_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call33012003_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call33012004_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call33012005_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call33012006_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call33012007_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call33012008_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_34ebee0c3ad292bc5607(net.minecraft.client.gui.GuiMultiplayer a0, moom.iu a1, int a2) throws E;
private static final class __SourceHandler_34ebee0c3ad292bc5607 {

public static boolean f2267(net.minecraft.client.gui.GuiMultiplayer receiver, moom.iu p0, int p1) throws Throwable {
    return ((p1 < (__call2267_1(__fieldRead2267_0(receiver)) - 1)) ? true : false);
}
public static void h2267_0(moom.Oo p0) throws Throwable {
    throw __call1226700_0(p0);
}
private static native moom.jM __fieldRead2267_0(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call2267_1(moom.jM a0) throws Throwable;
private static native java.lang.Exception __call1226700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5fdac2a06f22d67825d5(net.minecraft.client.gui.GuiMultiplayer a0, moom.iu a1, int a2, boolean a3) throws E;
private static final class __SourceHandler_5fdac2a06f22d67825d5 {

public static void f2268(net.minecraft.client.gui.GuiMultiplayer receiver, moom.iu p0, int p1, boolean p2) throws Throwable {
    int life4_13;
    life4_13 = (p2 ? (__call2268_1(__fieldRead2268_0(receiver)) - 1) : (p1 + 1));
    __call2268_3(__fieldRead2268_2(receiver), p1, life4_13);
    if ((__call2268_5(__fieldRead2268_4(receiver)) == p1)) {
        __call2268_6(receiver, life4_13);
    }
    __call2268_9(__fieldRead2268_7(receiver), __fieldRead2268_8(receiver));
    return;
}
public static void h2268_0(moom.Oo p0) throws Throwable {
    throw __call1226800_0(p0);
}
public static void h2268_1(moom.Oo p0) throws Throwable {
    throw __call1226801_0(p0);
}
private static native moom.jM __fieldRead2268_0(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call2268_1(moom.jM a0) throws Throwable;
private static native moom.jM __fieldRead2268_2(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call2268_3(moom.jM a0, int a1, int a2) throws Throwable;
private static native moom.ib __fieldRead2268_4(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call2268_5(moom.ib a0) throws Throwable;
private static native void __call2268_6(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native moom.ib __fieldRead2268_7(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.jM __fieldRead2268_8(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call2268_9(moom.ib a0, moom.jM a1) throws Throwable;
private static native java.lang.Exception __call1226800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1226801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_326d0cd8812837e2728f(net.minecraft.client.gui.GuiMultiplayer a0) throws E;
private static final class __SourceHandler_326d0cd8812837e2728f {

public static void f555(net.minecraft.client.gui.GuiMultiplayer receiver) throws Throwable {
    long life1_3;
    forest_join_96: {
    forest_join_76: {
    life1_3 = (__fieldRead555_0() ^ 116242247348311L);
    __call555_1(1);
    __call555_3(__fieldRead555_2(receiver));
    if (!((!__fieldRead555_4(receiver)))) {
        break forest_join_76;
    }
    __fieldWrite555_5(receiver, 1);
    __fieldWrite555_7(receiver, new moom.jM(__fieldRead555_6(receiver)));
    __call555_9(__fieldRead555_8(receiver));
    __fieldWrite555_10(receiver, new moom.jP());
    __fieldWrite555_12(receiver, new moom.Ot(__fieldRead555_11(receiver)));
    __call555_14(__fieldRead555_13(receiver));
    __fieldWrite555_22(receiver, new moom.ib(receiver, __fieldRead555_15(receiver), __fieldRead555_16(receiver), __fieldRead555_17(receiver), __invokedynamic555_18(603, (7014989820280287757L ^ life1_3)), (__fieldRead555_19(receiver) - __invokedynamic555_20(27414, (4378672579501415253L ^ life1_3))), __invokedynamic555_21(1122, (3998424493909816383L ^ life1_3))));
    __call555_25(__fieldRead555_23(receiver), __fieldRead555_24(receiver));
    break forest_join_96;
    }
    __call555_32(__fieldRead555_26(receiver), __fieldRead555_27(receiver), __fieldRead555_28(receiver), __invokedynamic555_29(25491, (4694651376602731477L ^ life1_3)), (__fieldRead555_30(receiver) - __invokedynamic555_31(18437, (11520623697000538L ^ life1_3))));
    }
    __call555_33(receiver);
    return;
}
public static void h555_0(java.lang.Exception p0, net.minecraft.client.gui.GuiMultiplayer p1, long p2) throws Throwable {
    java.lang.Exception life4_2;
    life4_2 = p0;
    __call3055500_3(__fieldRead3055500_0(), __invokedynamic3055500_2(__call3055500_1(life4_2)));
    __fieldWrite3055500_11(p1, new moom.ib(p1, __fieldRead3055500_4(p1), __fieldRead3055500_5(p1), __fieldRead3055500_6(p1), __invokedynamic3055500_7(603, (7014989820280287757L ^ p2)), (__fieldRead3055500_8(p1) - __invokedynamic3055500_9(27414, (4378672579501415253L ^ p2))), __invokedynamic3055500_10(1122, (3998424493909816383L ^ p2))));
    __call3055500_14(__fieldRead3055500_12(p1), __fieldRead3055500_13(p1));
    __call3055500_15(p1);
    return;
}
private static native long __fieldRead555_0() throws Throwable;
private static native void __call555_1(int a0) throws Throwable;
private static native java.util.List __fieldRead555_2(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call555_3(java.util.List a0) throws Throwable;
private static native boolean __fieldRead555_4(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __fieldWrite555_5(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead555_6(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __fieldWrite555_7(net.minecraft.client.gui.GuiMultiplayer a0, moom.jM a1) throws Throwable;
private static native moom.jM __fieldRead555_8(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call555_9(moom.jM a0) throws Throwable;
private static native void __fieldWrite555_10(net.minecraft.client.gui.GuiMultiplayer a0, moom.jP a1) throws Throwable;
private static native moom.jP __fieldRead555_11(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __fieldWrite555_12(net.minecraft.client.gui.GuiMultiplayer a0, moom.Ot a1) throws Throwable;
private static native moom.Ot __fieldRead555_13(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call555_14(moom.Ot a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead555_15(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __fieldRead555_16(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __fieldRead555_17(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __invokedynamic555_18(int a0, long a1) throws Throwable;
private static native int __fieldRead555_19(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __invokedynamic555_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic555_21(int a0, long a1) throws Throwable;
private static native void __fieldWrite555_22(net.minecraft.client.gui.GuiMultiplayer a0, moom.ib a1) throws Throwable;
private static native moom.ib __fieldRead555_23(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.jM __fieldRead555_24(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call555_25(moom.ib a0, moom.jM a1) throws Throwable;
private static native moom.ib __fieldRead555_26(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __fieldRead555_27(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __fieldRead555_28(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __invokedynamic555_29(int a0, long a1) throws Throwable;
private static native int __fieldRead555_30(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __invokedynamic555_31(int a0, long a1) throws Throwable;
private static native void __call555_32(moom.ib a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call555_33(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3055500_0() throws Throwable;
private static native java.lang.String __call3055500_1(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic3055500_2(java.lang.String a0) throws Throwable;
private static native void __call3055500_3(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3055500_4(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __fieldRead3055500_5(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __fieldRead3055500_6(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __invokedynamic3055500_7(int a0, long a1) throws Throwable;
private static native int __fieldRead3055500_8(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __invokedynamic3055500_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic3055500_10(int a0, long a1) throws Throwable;
private static native void __fieldWrite3055500_11(net.minecraft.client.gui.GuiMultiplayer a0, moom.ib a1) throws Throwable;
private static native moom.ib __fieldRead3055500_12(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.jM __fieldRead3055500_13(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call3055500_14(moom.ib a0, moom.jM a1) throws Throwable;
private static native void __call3055500_15(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_638183a40a84b6097f9f(net.minecraft.client.gui.GuiMultiplayer a0) throws E;
private static final class __SourceHandler_638183a40a84b6097f9f {

public static void f100147(net.minecraft.client.gui.GuiMultiplayer receiver) throws Throwable {
    forest_join_11: {
    __call100147_0(0);
    if (!((__fieldRead100147_1(receiver) != null))) {
        break forest_join_11;
    }
    __call100147_3(__fieldRead100147_2(receiver));
    __fieldWrite100147_4(receiver, null);
    }
    __call100147_6(__fieldRead100147_5(receiver));
    return;
}
public static void h100147_0(moom.Oo p0) throws Throwable {
    throw __call13014700_0(p0);
}
private static native void __call100147_0(int a0) throws Throwable;
private static native moom.Ot __fieldRead100147_1(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.Ot __fieldRead100147_2(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call100147_3(moom.Ot a0) throws Throwable;
private static native void __fieldWrite100147_4(net.minecraft.client.gui.GuiMultiplayer a0, java.lang.Object a1) throws Throwable;
private static native moom.jZ __fieldRead100147_5(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call100147_6(moom.jZ a0) throws Throwable;
private static native java.lang.Exception __call13014700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f3f28d1db60f43999400(net.minecraft.client.gui.GuiMultiplayer a0) throws E;
private static final class __SourceHandler_f3f28d1db60f43999400 {

public static void f2271(net.minecraft.client.gui.GuiMultiplayer receiver) throws Throwable {
    moom.hO life1_14;
    moom.jO life2_32;
    life1_14 = ((__call2271_1(__fieldRead2271_0(receiver)) < 0) ? null : __call2271_5(__fieldRead2271_2(receiver), __call2271_4(__fieldRead2271_3(receiver))));
    if ((__instanceOf2271_6(life1_14) != 0)) {
        __call2271_9(receiver, __call2271_8(__cast2271_7(life1_14)));
    } else {
        if ((__instanceOf2271_10(life1_14) != 0)) {
        life2_32 = __call2271_12(__cast2271_11(life1_14));
        __call2271_15(receiver, new moom.jL(__call2271_13(life2_32), __call2271_14(life2_32), true));
    }
    }
    return;
}
public static void h2271_0(moom.Oo p0) throws Throwable {
    throw __call1227100_0(p0);
}
public static void h2271_1(moom.Oo p0) throws Throwable {
    throw __call1227101_0(p0);
}
private static native moom.ib __fieldRead2271_0(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call2271_1(moom.ib a0) throws Throwable;
private static native moom.ib __fieldRead2271_2(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native moom.ib __fieldRead2271_3(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __call2271_4(moom.ib a0) throws Throwable;
private static native moom.hO __call2271_5(moom.ib a0, int a1) throws Throwable;
private static native int __instanceOf2271_6(moom.hO a0) throws Throwable;
private static native moom.iu __cast2271_7(moom.hO a0) throws Throwable;
private static native moom.jL __call2271_8(moom.iu a0) throws Throwable;
private static native void __call2271_9(net.minecraft.client.gui.GuiMultiplayer a0, moom.jL a1) throws Throwable;
private static native int __instanceOf2271_10(moom.hO a0) throws Throwable;
private static native moom.is __cast2271_11(moom.hO a0) throws Throwable;
private static native moom.jO __call2271_12(moom.is a0) throws Throwable;
private static native java.lang.String __call2271_13(moom.jO a0) throws Throwable;
private static native java.lang.String __call2271_14(moom.jO a0) throws Throwable;
private static native void __call2271_15(net.minecraft.client.gui.GuiMultiplayer a0, moom.jL a1) throws Throwable;
private static native java.lang.Exception __call1227100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1227101_0(moom.Oo a0) throws Throwable;

}


public void b(moom.iu p0, int p1, boolean p2) { __sourceHandlerCall_5fdac2a06f22d67825d5(this, p0, p1, p2); }


private void b() {
((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.GuiMultiplayer(this.y))));
    return;
}


public boolean b(moom.iu p0, int p1) { return __sourceHandlerCall_34ebee0c3ad292bc5607(this, p0, p1); }


protected void b(int p0, int p1, int p2) {
super.b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    ((moom.ib)(this.z)).b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void e() throws java.io.IOException {
super.e();
    ((moom.ib)(this.z)).c__Void();
    return;
}


public void c__Void() { __sourceHandlerCall_326d0cd8812837e2728f(this); }


public void h() { __sourceHandlerCall_638183a40a84b6097f9f(this); }


public moom.jM a() {
return this.A;
}


public boolean a(moom.iu p0, int p1) { return __sourceHandlerCall_e0b06d586864b39b5dbf(this, p0, p1); }


protected void a(int p0, int p1, int p2) throws java.io.IOException {
super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    ((moom.ib)(this.z)).a__Boolean(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10298_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiMultiplayer.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25406;
      if (P[var3] == null) {
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
         long var5 = O[var3];
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
         Object[] var9 = (Object[])Q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               Q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gX", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         P[var3] = var15;
      }

      return P[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(moom.iu p0, int p1, boolean p2) { __sourceHandlerCall_485d8b11f5d67f8543c7(this, p0, p1, p2); }


public void a(int p0, int p1, float p2) {
long life4_3;
    life4_3 = (net.minecraft.client.gui.GuiMultiplayer.N ^ 93339321759185L);
    try {
        this.I = ((java.lang.String)(null));
        ((net.minecraft.client.gui.GuiMultiplayer)(this)).i();
        ((moom.ib)(this.z)).a(((int)(p0)), ((int)(p1)), ((float)(p2)));
        ((net.minecraft.client.gui.GuiMultiplayer)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("multiplayer.title")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic2308_8(1848, (5863450358785913583L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic2308_9(13382, (7546336524805243268L ^ life4_3)))));
        super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
        if ((this.I != null)) {
        ((net.minecraft.client.gui.GuiMultiplayer)(this)).a(((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(((com.google.common.base.Splitter)(com.google.common.base.Splitter.on(((java.lang.String)("\n"))))).split(((java.lang.CharSequence)(this.I)))))))), ((int)(p0)), ((int)(p1)));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw net.minecraft.client.gui.GuiMultiplayer.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_2f438ea1f03c029e31c5(this, p0, p1); }


public void a(boolean p0, int p1) { __sourceHandlerCall_e691cfffa049f8f1c793(this, p0, p1); }


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_3263ae3604afed9bbed8(this, p0); }


public void a__Void() {
long life1_3;
    life1_3 = (net.minecraft.client.gui.GuiMultiplayer.N ^ 58286223444541L);
    java.util.List spill486_0 = this.m;
    net.minecraft.client.gui.GuiMultiplayer __stackOp486_10_0 = this;
    moom.gc __stackOp486_10_1 = new moom.gc(__sourceIntrinsic_b82a5b29b709_invokedynamic486_2(10079, (5737859929782660478L ^ life1_3)), ((this.k / 2) - __sourceIntrinsic_b82a5b29b709_invokedynamic486_4(19075, (4573376538346963107L ^ life1_3))), (this.l - __sourceIntrinsic_b82a5b29b709_invokedynamic486_6(32397, (1107170133908780203L ^ life1_3))), __sourceIntrinsic_b82a5b29b709_invokedynamic486_7(29511, (1809766305630189893L ^ life1_3)), __sourceIntrinsic_b82a5b29b709_invokedynamic486_8(30114, (6015759608499765125L ^ life1_3)), moom.oO.a(((java.lang.String)("selectServer.edit")), ((java.lang.Object[])(new java.lang.Object[0]))));
    moom.gc spill486_1 = __stackOp486_10_1;
    ((net.minecraft.client.gui.GuiMultiplayer)(__stackOp486_10_0)).B = ((moom.gc)(__stackOp486_10_1));
    ((java.util.List)(spill486_0)).add(((java.lang.Object)(spill486_1)));
    java.util.List spill486_2 = this.m;
    net.minecraft.client.gui.GuiMultiplayer __stackOp486_21_0 = this;
    moom.gc __stackOp486_21_1 = new moom.gc(2, ((this.k / 2) - __sourceIntrinsic_b82a5b29b709_invokedynamic486_15(25497, (5491983766911871405L ^ life1_3))), (this.l - __sourceIntrinsic_b82a5b29b709_invokedynamic486_17(32397, (1107170133908780203L ^ life1_3))), __sourceIntrinsic_b82a5b29b709_invokedynamic486_18(1290, (4712705520999042856L ^ life1_3)), __sourceIntrinsic_b82a5b29b709_invokedynamic486_19(30114, (6015759608499765125L ^ life1_3)), moom.oO.a(((java.lang.String)("selectServer.delete")), ((java.lang.Object[])(new java.lang.Object[0]))));
    moom.gc spill486_3 = __stackOp486_21_1;
    ((net.minecraft.client.gui.GuiMultiplayer)(__stackOp486_21_0)).D = ((moom.gc)(__stackOp486_21_1));
    ((java.util.List)(spill486_2)).add(((java.lang.Object)(spill486_3)));
    java.util.List spill486_4 = this.m;
    net.minecraft.client.gui.GuiMultiplayer __stackOp486_32_0 = this;
    moom.gc __stackOp486_32_1 = new moom.gc(1, ((this.k / 2) - __sourceIntrinsic_b82a5b29b709_invokedynamic486_26(2719, (7277259189381922994L ^ life1_3))), (this.l - __sourceIntrinsic_b82a5b29b709_invokedynamic486_28(12901, (116394623864944714L ^ life1_3))), __sourceIntrinsic_b82a5b29b709_invokedynamic486_29(28384, (916415054226941142L ^ life1_3)), __sourceIntrinsic_b82a5b29b709_invokedynamic486_30(30114, (6015759608499765125L ^ life1_3)), moom.oO.a(((java.lang.String)("selectServer.select")), ((java.lang.Object[])(new java.lang.Object[0]))));
    moom.gc spill486_5 = __stackOp486_32_1;
    ((net.minecraft.client.gui.GuiMultiplayer)(__stackOp486_32_0)).C = ((moom.gc)(__stackOp486_32_1));
    ((java.util.List)(spill486_4)).add(((java.lang.Object)(spill486_5)));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(4, ((this.k / 2) - __sourceIntrinsic_b82a5b29b709_invokedynamic486_37(21258, (763758768792557883L ^ life1_3))), (this.l - __sourceIntrinsic_b82a5b29b709_invokedynamic486_39(11134, (1956328802763415878L ^ life1_3))), __sourceIntrinsic_b82a5b29b709_invokedynamic486_40(6399, (5141129448039060172L ^ life1_3)), __sourceIntrinsic_b82a5b29b709_invokedynamic486_41(30114, (6015759608499765125L ^ life1_3)), moom.oO.a(((java.lang.String)("selectServer.direct")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(3, (((this.k / 2) + 4) + __sourceIntrinsic_b82a5b29b709_invokedynamic486_46(8114, (8634101446353196441L ^ life1_3))), (this.l - __sourceIntrinsic_b82a5b29b709_invokedynamic486_48(11134, (1956328802763415878L ^ life1_3))), __sourceIntrinsic_b82a5b29b709_invokedynamic486_49(6399, (5141129448039060172L ^ life1_3)), __sourceIntrinsic_b82a5b29b709_invokedynamic486_50(30114, (6015759608499765125L ^ life1_3)), moom.oO.a(((java.lang.String)("selectServer.add")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_b82a5b29b709_invokedynamic486_54(19799, (2832686524016576365L ^ life1_3)), ((this.k / 2) + 4), (this.l - __sourceIntrinsic_b82a5b29b709_invokedynamic486_57(32397, (1107170133908780203L ^ life1_3))), __sourceIntrinsic_b82a5b29b709_invokedynamic486_58(1290, (4712705520999042856L ^ life1_3)), __sourceIntrinsic_b82a5b29b709_invokedynamic486_59(30114, (6015759608499765125L ^ life1_3)), moom.oO.a(((java.lang.String)("selectServer.refresh")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(0, (((this.k / 2) + 4) + __sourceIntrinsic_b82a5b29b709_invokedynamic486_64(25845, (524686681484488406L ^ life1_3))), (this.l - __sourceIntrinsic_b82a5b29b709_invokedynamic486_66(32397, (1107170133908780203L ^ life1_3))), __sourceIntrinsic_b82a5b29b709_invokedynamic486_67(19869, (1476281650733172643L ^ life1_3)), __sourceIntrinsic_b82a5b29b709_invokedynamic486_68(30114, (6015759608499765125L ^ life1_3)), moom.oO.a(((java.lang.String)("gui.cancel")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new com.moon.pd(__sourceIntrinsic_b82a5b29b709_invokedynamic486_72(12693, (1149704373125823397L ^ life1_3)), (this.k - __sourceIntrinsic_b82a5b29b709_invokedynamic486_74(22706, (1361177659322356352L ^ life1_3))), __sourceIntrinsic_b82a5b29b709_invokedynamic486_75(3062, (1770172284976792015L ^ life1_3)), "Test Slider", 0, ((com.moon.cl.values()).length - 1), ((float) (((com.moon.cl.values()).length - ((com.moon.cl)(com.moon.cl.a(((int)(((com.moon.o4)(com.moon.o4.a__o4())).b()))))).ordinal()) - 1))))));
    ((net.minecraft.client.gui.GuiMultiplayer)(this)).a__sourceReturn_d00df7729d(((int)(((moom.ib)(this.z)).h())));
    return;
}


public void a(java.lang.String p0) {
this.I = ((java.lang.String)(p0));
    return;
}


public void a__sourceReturn_d00df7729d(int p0) { __sourceHandlerCall_9e416fbbf6fe5e2f9dcd(this, p0); }


private void a(moom.jL p0) {
((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(new moom.hw(this, this.i, p0))));
    return;
}


public moom.jZ a__jZ() {
return this.x;
}


public void g() {
java.util.List life1_9;
    super.g();
    if (((moom.jP)(this.K)).a__Boolean()) {
        life1_9 = ((moom.jP)(this.K)).a();
        ((moom.jP)(this.K)).a__Void();
        ((moom.ib)(this.z)).a(((java.util.List)(life1_9)));
    }
    ((moom.jZ)(this.x)).a();
    return;
}


public void j() { __sourceHandlerCall_f3f28d1db60f43999400(this); }


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic2308_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic2308_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10298_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic486_75(int a0, long a1) throws E;
}
