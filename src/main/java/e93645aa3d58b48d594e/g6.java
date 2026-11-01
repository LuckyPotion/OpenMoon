package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class g6 extends net.minecraft.client.gui.GuiScreen {

private net.minecraft.client.gui.GuiScreen w;

private moom.jL x;

private moom.hJ y;

private static long z;

private static long[] A;

private static java.lang.Integer[] B;

private static java.util.Map C;

public g6(net.minecraft.client.gui.GuiScreen p0, moom.jL p1) {
super();
    this.w = p0;
    this.x = p1;
}


static {
z = ((long)(((moom._a)(moom._c.a(((long)(-7206785652010623187L)), ((long)(-8975378179622594807L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(189838147685511L)))));
    C = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.g6.z ^ 79470157763407L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1205_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1205_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1205_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1205_14 = new byte[8];
    (__sourceSpill1205_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1205_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1205_16 = __sourceSpill1205_14;
    ((javax.crypto.Cipher)(__sourceSpill1205_11)).init(((int)(__sourceSpill1205_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1205_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1205_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[15];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "q ¶\177ZìÎqÁ6ý¨ÙÛµ«õÎét|y}ØTJªßþ\006ì \032§q5m\001ÿÒG\016\fµà!r¹Xiy°ü¾«P\036È²÷$]W«ÃÏ§ÇÒ ¥æ^W`ÓD\001øHL-Qc®ÒÐÓ="))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1205_25 = local6_life21;
        int __sourceSpill1205_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1205_25)).substring(((int)(__sourceSpill1205_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1205_30 = local8_life19;
        int __sourceSpill1205_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1205_33 = new byte[8];
        (__sourceSpill1205_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1205_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1205_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1205_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1205_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1205_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1205_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1205_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1205_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1205_34)).doFinal(((byte[])(__sourceSpill1205_33)));
        (__sourceSpill1205_30)[__sourceSpill1205_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "û L[S¯ÎWf, \004y!¬\r"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1205_38 = local6_life21;
        int __sourceSpill1205_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1205_38)).substring(((int)(__sourceSpill1205_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1205_43 = local8_life19;
        int __sourceSpill1205_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1205_46 = new byte[8];
        (__sourceSpill1205_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1205_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1205_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1205_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1205_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1205_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1205_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1205_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1205_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1205_47)).doFinal(((byte[])(__sourceSpill1205_46)));
        (__sourceSpill1205_43)[__sourceSpill1205_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    A = ((long[])(local8_life19));
    B = ((java.lang.Integer[])(new java.lang.Integer[15]));
}

private static native <E extends Throwable> void __sourceHandlerCall_42e9bceea9f84e9310c9(moom.g6 a0, char a1, int a2) throws E;
private static final class __SourceHandler_42e9bceea9f84e9310c9 {

public static void f1030(moom.g6 receiver, char p0, int p1) throws Throwable {
    moom.gc forwardValue1030_29_0;
    moom.gc forwardValue1030_30_0;
    int forwardValue1030_30_1;
    moom.gc spill1030_0;
    long life3_3;
    forward_join_53: {
    forward_join_46: {
    forward_join_32: {
    forward_join_30: {
    forward_join_29: {
    life3_3 = (__fieldRead1030_0() ^ 32887124595132L);
    if (!(__call1030_2(__fieldRead1030_1(receiver), p0, p1))) {
        break forward_join_32;
    }
    spill1030_0 = __cast1030_5(__call1030_4(__fieldRead1030_3(receiver), 0));
    if (!((__call1030_8(__call1030_7(__fieldRead1030_6(receiver))) > 0))) {
        forwardValue1030_29_0 = spill1030_0;
        break forward_join_29;
    }
    if (!(((__call1030_11(__call1030_10(__fieldRead1030_9(receiver)), ":")).length > 0))) {
        forwardValue1030_29_0 = spill1030_0;
        break forward_join_29;
    }
    forwardValue1030_30_0 = spill1030_0;
    forwardValue1030_30_1 = 1;
    break forward_join_30;
    }
    forwardValue1030_30_0 = forwardValue1030_29_0;
    forwardValue1030_30_1 = 0;
    }
    __fieldWrite1030_12(forwardValue1030_30_0, forwardValue1030_30_1);
    break forward_join_53;
    }
    if (!((p1 != __invokedynamic1030_13(20071, (2372167629980433478L ^ life3_3))))) {
        break forward_join_46;
    }
    if (!((p1 == __invokedynamic1030_14(3606, (6678444668744743985L ^ life3_3))))) {
        break forward_join_53;
    }
    }
    __call1030_18(receiver, __cast1030_17(__call1030_16(__fieldRead1030_15(receiver), 0)));
    }
    return;
}
public static void h1030_0(java.io.IOException p0) throws Throwable {
    throw __call1103000_0(p0);
}
public static void h1030_1(java.io.IOException p0) throws Throwable {
    throw __call1103001_0(p0);
}
public static void h1030_2(java.io.IOException p0) throws Throwable {
    throw __call1103002_0(p0);
}
public static void h1030_3(java.io.IOException p0) throws Throwable {
    throw __call1103003_0(p0);
}
public static void h1030_4(java.io.IOException p0) throws Throwable {
    throw __call1103004_0(p0);
}
private static native long __fieldRead1030_0() throws Throwable;
private static native moom.hJ __fieldRead1030_1(moom.g6 a0) throws Throwable;
private static native boolean __call1030_2(moom.hJ a0, char a1, int a2) throws Throwable;
private static native java.util.List __fieldRead1030_3(moom.g6 a0) throws Throwable;
private static native java.lang.Object __call1030_4(java.util.List a0, int a1) throws Throwable;
private static native moom.gc __cast1030_5(java.lang.Object a0) throws Throwable;
private static native moom.hJ __fieldRead1030_6(moom.g6 a0) throws Throwable;
private static native java.lang.String __call1030_7(moom.hJ a0) throws Throwable;
private static native int __call1030_8(java.lang.String a0) throws Throwable;
private static native moom.hJ __fieldRead1030_9(moom.g6 a0) throws Throwable;
private static native java.lang.String __call1030_10(moom.hJ a0) throws Throwable;
private static native java.lang.String[] __call1030_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1030_12(moom.gc a0, int a1) throws Throwable;
private static native int __invokedynamic1030_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic1030_14(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead1030_15(moom.g6 a0) throws Throwable;
private static native java.lang.Object __call1030_16(java.util.List a0, int a1) throws Throwable;
private static native moom.gc __cast1030_17(java.lang.Object a0) throws Throwable;
private static native void __call1030_18(moom.g6 a0, moom.gc a1) throws Throwable;
private static native java.lang.Exception __call1103000_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103001_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103002_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103003_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103004_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fb842e81242533f6a322(moom.g6 a0, moom.gc a1) throws E;
private static final class __SourceHandler_fb842e81242533f6a322 {

public static void f1729(moom.g6 receiver, moom.gc p0) throws Throwable {
    if (__fieldRead1729_0(p0)) {
        if ((__fieldRead1729_1(p0) == 1)) {
        __call1729_3(__fieldRead1729_2(receiver), 0, 0);
    } else {
        if ((__fieldRead1729_4(p0) == 0)) {
        __fieldWrite1729_8(__fieldRead1729_5(receiver), __call1729_7(__fieldRead1729_6(receiver)));
        __call1729_10(__fieldRead1729_9(receiver), 1, 0);
    }
    }
    }
    return;
}
public static void h1729_0(java.io.IOException p0) throws Throwable {
    throw __call1172900_0(p0);
}
public static void h1729_1(java.io.IOException p0) throws Throwable {
    throw __call1172901_0(p0);
}
public static void h1729_2(java.io.IOException p0) throws Throwable {
    throw __call1172902_0(p0);
}
private static native boolean __fieldRead1729_0(moom.gc a0) throws Throwable;
private static native int __fieldRead1729_1(moom.gc a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1729_2(moom.g6 a0) throws Throwable;
private static native void __call1729_3(net.minecraft.client.gui.GuiScreen a0, int a1, int a2) throws Throwable;
private static native int __fieldRead1729_4(moom.gc a0) throws Throwable;
private static native moom.jL __fieldRead1729_5(moom.g6 a0) throws Throwable;
private static native moom.hJ __fieldRead1729_6(moom.g6 a0) throws Throwable;
private static native java.lang.String __call1729_7(moom.hJ a0) throws Throwable;
private static native void __fieldWrite1729_8(moom.jL a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1729_9(moom.g6 a0) throws Throwable;
private static native void __call1729_10(net.minecraft.client.gui.GuiScreen a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1172900_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1172901_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1172902_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_20f1fd434af16e34d6bd(moom.g6 a0) throws E;
private static final class __SourceHandler_20f1fd434af16e34d6bd {

public static void f1031(moom.g6 receiver) throws Throwable {
    moom.gc forwardValue1031_156_0;
    moom.gc forwardValue1031_157_0;
    int forwardValue1031_157_1;
    moom.gc spill1031_0;
    long life1_3;
    forward_join_157: {
    forward_join_156: {
    life1_3 = (__fieldRead1031_0() ^ 24063670570481L);
    __call1031_1(1);
    __call1031_3(__fieldRead1031_2(receiver));
    __call1031_11(__fieldRead1031_4(receiver), new moom.gc(0, ((__fieldRead1031_5(receiver) / 2) - __invokedynamic1031_6(1786, (2093135678933788828L ^ life1_3))), (((__fieldRead1031_7(receiver) / 4) + __invokedynamic1031_8(17431, (5947780883467643511L ^ life1_3))) + __invokedynamic1031_9(16380, (7019125113447731605L ^ life1_3))), __call1031_10("selectServer.select", new java.lang.Object[0])));
    __call1031_19(__fieldRead1031_12(receiver), new moom.gc(1, ((__fieldRead1031_13(receiver) / 2) - __invokedynamic1031_14(20126, (7185292745826377981L ^ life1_3))), (((__fieldRead1031_15(receiver) / 4) + __invokedynamic1031_16(27582, (5968881676449318364L ^ life1_3))) + __invokedynamic1031_17(24226, (7732279222830313674L ^ life1_3))), __call1031_18("gui.cancel", new java.lang.Object[0])));
    __fieldWrite1031_26(receiver, new moom.hJ(2, __fieldRead1031_20(receiver), ((__fieldRead1031_21(receiver) / 2) - __invokedynamic1031_22(20126, (7185292745826377981L ^ life1_3))), __invokedynamic1031_23(4955, (4357275205478874420L ^ life1_3)), __invokedynamic1031_24(4054, (4166595304549573051L ^ life1_3)), __invokedynamic1031_25(18837, (4175701363973203966L ^ life1_3))));
    __call1031_29(__fieldRead1031_27(receiver), __invokedynamic1031_28(25065, (786219486935486343L ^ life1_3)));
    __call1031_31(__fieldRead1031_30(receiver), 1);
    __call1031_36(__fieldRead1031_32(receiver), __fieldRead1031_35(__fieldRead1031_34(__fieldRead1031_33(receiver))));
    spill1031_0 = __cast1031_39(__call1031_38(__fieldRead1031_37(receiver), 0));
    if (!((__call1031_42(__call1031_41(__fieldRead1031_40(receiver))) > 0))) {
        forwardValue1031_156_0 = spill1031_0;
        break forward_join_156;
    }
    if (!(((__call1031_45(__call1031_44(__fieldRead1031_43(receiver)), ":")).length > 0))) {
        forwardValue1031_156_0 = spill1031_0;
        break forward_join_156;
    }
    forwardValue1031_157_0 = spill1031_0;
    forwardValue1031_157_1 = 1;
    break forward_join_157;
    }
    forwardValue1031_157_0 = forwardValue1031_156_0;
    forwardValue1031_157_1 = 0;
    }
    __fieldWrite1031_46(forwardValue1031_157_0, forwardValue1031_157_1);
    return;
}
public static void h1031_0(moom.Oo p0) throws Throwable {
    throw __call1103100_0(p0);
}
public static void h1031_1(moom.Oo p0) throws Throwable {
    throw __call1103101_0(p0);
}
private static native long __fieldRead1031_0() throws Throwable;
private static native void __call1031_1(int a0) throws Throwable;
private static native java.util.List __fieldRead1031_2(moom.g6 a0) throws Throwable;
private static native void __call1031_3(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1031_4(moom.g6 a0) throws Throwable;
private static native int __fieldRead1031_5(moom.g6 a0) throws Throwable;
private static native int __invokedynamic1031_6(int a0, long a1) throws Throwable;
private static native int __fieldRead1031_7(moom.g6 a0) throws Throwable;
private static native int __invokedynamic1031_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic1031_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call1031_10(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call1031_11(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead1031_12(moom.g6 a0) throws Throwable;
private static native int __fieldRead1031_13(moom.g6 a0) throws Throwable;
private static native int __invokedynamic1031_14(int a0, long a1) throws Throwable;
private static native int __fieldRead1031_15(moom.g6 a0) throws Throwable;
private static native int __invokedynamic1031_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic1031_17(int a0, long a1) throws Throwable;
private static native java.lang.String __call1031_18(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call1031_19(java.util.List a0, moom.gc a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1031_20(moom.g6 a0) throws Throwable;
private static native int __fieldRead1031_21(moom.g6 a0) throws Throwable;
private static native int __invokedynamic1031_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic1031_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic1031_24(int a0, long a1) throws Throwable;
private static native int __invokedynamic1031_25(int a0, long a1) throws Throwable;
private static native void __fieldWrite1031_26(moom.g6 a0, moom.hJ a1) throws Throwable;
private static native moom.hJ __fieldRead1031_27(moom.g6 a0) throws Throwable;
private static native int __invokedynamic1031_28(int a0, long a1) throws Throwable;
private static native void __call1031_29(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead1031_30(moom.g6 a0) throws Throwable;
private static native void __call1031_31(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead1031_32(moom.g6 a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1031_33(moom.g6 a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1031_34(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __fieldRead1031_35(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call1031_36(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead1031_37(moom.g6 a0) throws Throwable;
private static native java.lang.Object __call1031_38(java.util.List a0, int a1) throws Throwable;
private static native moom.gc __cast1031_39(java.lang.Object a0) throws Throwable;
private static native moom.hJ __fieldRead1031_40(moom.g6 a0) throws Throwable;
private static native java.lang.String __call1031_41(moom.hJ a0) throws Throwable;
private static native int __call1031_42(java.lang.String a0) throws Throwable;
private static native moom.hJ __fieldRead1031_43(moom.g6 a0) throws Throwable;
private static native java.lang.String __call1031_44(moom.hJ a0) throws Throwable;
private static native java.lang.String[] __call1031_45(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1031_46(moom.gc a0, int a1) throws Throwable;
private static native java.lang.Exception __call1103100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1103101_0(moom.Oo a0) throws Throwable;

}


public void c__Void() { __sourceHandlerCall_20f1fd434af16e34d6bd(this); }


public void h() {
org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.i)).W)).aT = ((java.lang.String)(((moom.hJ)(this.y)).a__String()));
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.i)).W)).b();
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.g6.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 15641;
      if (B[var3] == null) {
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
         long var5 = A[var3];
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
         Object[] var9 = (Object[])C.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               C.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/g6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         B[var3] = var15;
      }

      return B[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7670_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/g6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_fb842e81242533f6a322(this, p0); }


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_42e9bceea9f84e9310c9(this, p0, p1); }


protected void a(int p0, int p1, int p2) throws java.io.IOException {
super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    ((moom.hJ)(this.y)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void a(int p0, int p1, float p2) {
long local4 = (moom.g6.z ^ 44797620963447L);
    ((moom.g6)(this)).i();
    ((moom.g6)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("selectServer.direct")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1441_5(29059, (8060955078193715810L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1441_6(3433, (2580110621275940491L ^ local4)))));
    ((moom.g6)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("addServer.enterIp")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)(((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1441_11(20126, (7185340314749347195L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1441_12(20126, (7185340314749347195L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1441_13(24364, (228678349732885711L ^ local4)))));
    ((moom.hJ)(this.y)).d__Void();
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


public void g() {
((moom.hJ)(this.y)).a__Void();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1441_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1441_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1441_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1441_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1441_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7670_0() throws E;
}
