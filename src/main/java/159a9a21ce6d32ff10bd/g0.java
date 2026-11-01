package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class g0 extends net.minecraft.client.gui.GuiScreen {

private net.minecraft.client.gui.GuiScreen w;

private moom.jL x;

private moom.hJ y;

private moom.hJ z;

private moom.gc A;

private com.google.common.base.Predicate<java.lang.String> B;

private static long C;

private static long[] D;

private static java.lang.Integer[] E;

private static java.util.Map F;

public g0(net.minecraft.client.gui.GuiScreen p0, moom.jL p1) {
super();
    this.B = ((com.google.common.base.Predicate)(__sourceIntrinsic_b0ed240f852e_originalDynamicSite4344_0()));
    this.w = ((net.minecraft.client.gui.GuiScreen)(p0));
    this.x = ((moom.jL)(p1));
    return;
}


static {
C = ((long)(((moom._a)(moom._c.a(((long)(3373965217691588818L)), ((long)(7732695000851913681L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(45194542057144L)))));
    F = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.g0.C ^ 90926797443301L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1202_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1202_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1202_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1202_14 = new byte[8];
    (__sourceSpill1202_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1202_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1202_16 = __sourceSpill1202_14;
    ((javax.crypto.Cipher)(__sourceSpill1202_11)).init(((int)(__sourceSpill1202_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1202_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1202_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[23];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "}áx2d«C¡+\013ÉtÍ6uÎ\006¬\177Z¿FÇ\035<\022ë|ÿª\001:(\r×Ä[Àõ¥~¼_Ud^)zÜX\026ÈÿÕ¥\026­°DË\030Nt3HIø?¾® r\036}AÖt>J÷ëH\021\035R`\tQ|>4î\033\001D\033úBÁ8ö-Ô-H\023($\031s¢ßð³[¯$\036ñë,t!ÃÁXFðdå¸h8¬¤®¦í\026G\006³è\035\003MØ%Ë¥»{F\036"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1202_25 = local6_life21;
        int __sourceSpill1202_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1202_25)).substring(((int)(__sourceSpill1202_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1202_30 = local8_life19;
        int __sourceSpill1202_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1202_33 = new byte[8];
        (__sourceSpill1202_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1202_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1202_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1202_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1202_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1202_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1202_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1202_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1202_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1202_34)).doFinal(((byte[])(__sourceSpill1202_33)));
        (__sourceSpill1202_30)[__sourceSpill1202_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¼Ø\013d®gÕ\006`\024ø½4"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1202_38 = local6_life21;
        int __sourceSpill1202_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1202_38)).substring(((int)(__sourceSpill1202_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1202_43 = local8_life19;
        int __sourceSpill1202_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1202_46 = new byte[8];
        (__sourceSpill1202_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1202_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1202_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1202_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1202_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1202_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1202_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1202_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1202_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1202_47)).doFinal(((byte[])(__sourceSpill1202_46)));
        (__sourceSpill1202_43)[__sourceSpill1202_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    D = ((long[])(local8_life19));
    E = ((java.lang.Integer[])(new java.lang.Integer[23]));
}

private static native <E extends Throwable> void __sourceHandlerCall_6447ad395f9413623221(moom.g0 a0, char a1, int a2) throws E;
private static final class __SourceHandler_6447ad395f9413623221 {

public static void f1028(moom.g0 receiver, char p0, int p1) throws Throwable {
    moom.hJ forwardValue1028_31_0;
    moom.hJ forwardValue1028_32_0;
    int forwardValue1028_32_1;
    moom.hJ forwardValue1028_41_0;
    moom.hJ forwardValue1028_42_0;
    int forwardValue1028_42_1;
    moom.gc forwardValue1028_88_0;
    moom.gc forwardValue1028_89_0;
    int forwardValue1028_89_1;
    moom.hJ spill1028_0;
    moom.hJ spill1028_1;
    moom.gc spill1028_2;
    long life3_3;
    forward_join_89: {
    forward_join_88: {
    forward_join_64: {
    forward_join_57: {
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_32: {
    forward_join_31: {
    life3_3 = (__fieldRead1028_0() ^ 10036361246163L);
    __call1028_2(__fieldRead1028_1(receiver), p0, p1);
    __call1028_4(__fieldRead1028_3(receiver), p0, p1);
    if (!((p1 == __invokedynamic1028_5(5127, (4349906544834250867L ^ life3_3))))) {
        break forward_join_43;
    }
    spill1028_0 = __fieldRead1028_6(receiver);
    if (!((!__call1028_8(__fieldRead1028_7(receiver))))) {
        forwardValue1028_31_0 = spill1028_0;
        break forward_join_31;
    }
    forwardValue1028_32_0 = spill1028_0;
    forwardValue1028_32_1 = 1;
    break forward_join_32;
    }
    forwardValue1028_32_0 = forwardValue1028_31_0;
    forwardValue1028_32_1 = 0;
    }
    __call1028_9(forwardValue1028_32_0, forwardValue1028_32_1);
    spill1028_1 = __fieldRead1028_10(receiver);
    if (!((!__call1028_12(__fieldRead1028_11(receiver))))) {
        forwardValue1028_41_0 = spill1028_1;
        break forward_join_41;
    }
    forwardValue1028_42_0 = spill1028_1;
    forwardValue1028_42_1 = 1;
    break forward_join_42;
    }
    forwardValue1028_42_0 = forwardValue1028_41_0;
    forwardValue1028_42_1 = 0;
    }
    __call1028_13(forwardValue1028_42_0, forwardValue1028_42_1);
    }
    if (!((p1 != __invokedynamic1028_14(30861, (8661959831323108603L ^ life3_3))))) {
        break forward_join_57;
    }
    if (!((p1 == __invokedynamic1028_15(1888, (8903172886353025820L ^ life3_3))))) {
        break forward_join_64;
    }
    }
    __call1028_19(receiver, __cast1028_18(__call1028_17(__fieldRead1028_16(receiver), 0)));
    }
    spill1028_2 = __cast1028_22(__call1028_21(__fieldRead1028_20(receiver), 0));
    if (!((__call1028_25(__call1028_24(__fieldRead1028_23(receiver))) > 0))) {
        forwardValue1028_88_0 = spill1028_2;
        break forward_join_88;
    }
    if (!(((__call1028_28(__call1028_27(__fieldRead1028_26(receiver)), ":")).length > 0))) {
        forwardValue1028_88_0 = spill1028_2;
        break forward_join_88;
    }
    if (!((__call1028_31(__call1028_30(__fieldRead1028_29(receiver))) > 0))) {
        forwardValue1028_88_0 = spill1028_2;
        break forward_join_88;
    }
    forwardValue1028_89_0 = spill1028_2;
    forwardValue1028_89_1 = 1;
    break forward_join_89;
    }
    forwardValue1028_89_0 = forwardValue1028_88_0;
    forwardValue1028_89_1 = 0;
    }
    __fieldWrite1028_32(forwardValue1028_89_0, forwardValue1028_89_1);
    return;
}
public static void h1028_0(java.io.IOException p0) throws Throwable {
    throw __call1102800_0(p0);
}
public static void h1028_1(java.io.IOException p0) throws Throwable {
    throw __call1102801_0(p0);
}
public static void h1028_2(java.io.IOException p0) throws Throwable {
    throw __call1102802_0(p0);
}
public static void h1028_3(java.io.IOException p0) throws Throwable {
    throw __call1102803_0(p0);
}
public static void h1028_4(java.io.IOException p0) throws Throwable {
    throw __call1102804_0(p0);
}
public static void h1028_5(java.io.IOException p0) throws Throwable {
    throw __call1102805_0(p0);
}
public static void h1028_6(java.io.IOException p0) throws Throwable {
    throw __call1102806_0(p0);
}
public static void h1028_7(java.io.IOException p0) throws Throwable {
    throw __call1102807_0(p0);
}
private static native long __fieldRead1028_0() throws Throwable;
private static native moom.hJ __fieldRead1028_1(moom.g0 a0) throws Throwable;
private static native boolean __call1028_2(moom.hJ a0, char a1, int a2) throws Throwable;
private static native moom.hJ __fieldRead1028_3(moom.g0 a0) throws Throwable;
private static native boolean __call1028_4(moom.hJ a0, char a1, int a2) throws Throwable;
private static native int __invokedynamic1028_5(int a0, long a1) throws Throwable;
private static native moom.hJ __fieldRead1028_6(moom.g0 a0) throws Throwable;
private static native moom.hJ __fieldRead1028_7(moom.g0 a0) throws Throwable;
private static native boolean __call1028_8(moom.hJ a0) throws Throwable;
private static native void __call1028_9(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead1028_10(moom.g0 a0) throws Throwable;
private static native moom.hJ __fieldRead1028_11(moom.g0 a0) throws Throwable;
private static native boolean __call1028_12(moom.hJ a0) throws Throwable;
private static native void __call1028_13(moom.hJ a0, int a1) throws Throwable;
private static native int __invokedynamic1028_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic1028_15(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead1028_16(moom.g0 a0) throws Throwable;
private static native java.lang.Object __call1028_17(java.util.List a0, int a1) throws Throwable;
private static native moom.gc __cast1028_18(java.lang.Object a0) throws Throwable;
private static native void __call1028_19(moom.g0 a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead1028_20(moom.g0 a0) throws Throwable;
private static native java.lang.Object __call1028_21(java.util.List a0, int a1) throws Throwable;
private static native moom.gc __cast1028_22(java.lang.Object a0) throws Throwable;
private static native moom.hJ __fieldRead1028_23(moom.g0 a0) throws Throwable;
private static native java.lang.String __call1028_24(moom.hJ a0) throws Throwable;
private static native int __call1028_25(java.lang.String a0) throws Throwable;
private static native moom.hJ __fieldRead1028_26(moom.g0 a0) throws Throwable;
private static native java.lang.String __call1028_27(moom.hJ a0) throws Throwable;
private static native java.lang.String[] __call1028_28(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.hJ __fieldRead1028_29(moom.g0 a0) throws Throwable;
private static native java.lang.String __call1028_30(moom.hJ a0) throws Throwable;
private static native int __call1028_31(java.lang.String a0) throws Throwable;
private static native void __fieldWrite1028_32(moom.gc a0, int a1) throws Throwable;
private static native java.lang.Exception __call1102800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1102801_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1102802_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1102803_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1102804_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1102805_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1102806_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1102807_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2145239991f76952e1f1(moom.g0 a0, moom.gc a1) throws E;
private static final class __SourceHandler_2145239991f76952e1f1 {

public static void f1721(moom.g0 receiver, moom.gc p0) throws Throwable {
    if (__fieldRead1721_0(p0)) {
        if ((__fieldRead1721_1(p0) == 2)) {
        __call1721_8(__fieldRead1721_2(receiver), (__call1721_3())[((__call1721_6(__call1721_5(__fieldRead1721_4(receiver))) + 1) % (__call1721_7()).length)]);
        __fieldWrite1721_16(__fieldRead1721_9(receiver), __invokedynamic1721_15(__call1721_10("addServer.resourcePack", new java.lang.Object[0]), __call1721_14(__call1721_13(__call1721_12(__fieldRead1721_11(receiver))))));
    } else {
        if ((__fieldRead1721_17(p0) == 1)) {
        __call1721_19(__fieldRead1721_18(receiver), 0, 0);
    } else {
        if ((__fieldRead1721_20(p0) == 0)) {
        __fieldWrite1721_24(__fieldRead1721_21(receiver), __call1721_23(__fieldRead1721_22(receiver)));
        __fieldWrite1721_28(__fieldRead1721_25(receiver), __call1721_27(__fieldRead1721_26(receiver)));
        __call1721_30(__fieldRead1721_29(receiver), 1, 0);
    }
    }
    }
    }
    return;
}
public static void h1721_0(java.io.IOException p0) throws Throwable {
    throw __call1172100_0(p0);
}
public static void h1721_1(java.io.IOException p0) throws Throwable {
    throw __call1172101_0(p0);
}
public static void h1721_2(java.io.IOException p0) throws Throwable {
    throw __call1172102_0(p0);
}
public static void h1721_3(java.io.IOException p0) throws Throwable {
    throw __call1172103_0(p0);
}
private static native boolean __fieldRead1721_0(moom.gc a0) throws Throwable;
private static native int __fieldRead1721_1(moom.gc a0) throws Throwable;
private static native moom.jL __fieldRead1721_2(moom.g0 a0) throws Throwable;
private static native moom.az[] __call1721_3() throws Throwable;
private static native moom.jL __fieldRead1721_4(moom.g0 a0) throws Throwable;
private static native moom.az __call1721_5(moom.jL a0) throws Throwable;
private static native int __call1721_6(moom.az a0) throws Throwable;
private static native moom.az[] __call1721_7() throws Throwable;
private static native void __call1721_8(moom.jL a0, moom.az a1) throws Throwable;
private static native moom.gc __fieldRead1721_9(moom.g0 a0) throws Throwable;
private static native java.lang.String __call1721_10(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.jL __fieldRead1721_11(moom.g0 a0) throws Throwable;
private static native moom.az __call1721_12(moom.jL a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1721_13(moom.az a0) throws Throwable;
private static native java.lang.String __call1721_14(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native java.lang.String __invokedynamic1721_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1721_16(moom.gc a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead1721_17(moom.gc a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1721_18(moom.g0 a0) throws Throwable;
private static native void __call1721_19(net.minecraft.client.gui.GuiScreen a0, int a1, int a2) throws Throwable;
private static native int __fieldRead1721_20(moom.gc a0) throws Throwable;
private static native moom.jL __fieldRead1721_21(moom.g0 a0) throws Throwable;
private static native moom.hJ __fieldRead1721_22(moom.g0 a0) throws Throwable;
private static native java.lang.String __call1721_23(moom.hJ a0) throws Throwable;
private static native void __fieldWrite1721_24(moom.jL a0, java.lang.String a1) throws Throwable;
private static native moom.jL __fieldRead1721_25(moom.g0 a0) throws Throwable;
private static native moom.hJ __fieldRead1721_26(moom.g0 a0) throws Throwable;
private static native java.lang.String __call1721_27(moom.hJ a0) throws Throwable;
private static native void __fieldWrite1721_28(moom.jL a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1721_29(moom.g0 a0) throws Throwable;
private static native void __call1721_30(net.minecraft.client.gui.GuiScreen a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1172100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1172101_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1172102_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1172103_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_62e3f85b559e693b5d1f(moom.g0 a0) throws E;
private static final class __SourceHandler_62e3f85b559e693b5d1f {

public static void f170(moom.g0 receiver) throws Throwable {
    moom.gc forwardValue170_245_0;
    moom.gc forwardValue170_246_0;
    int forwardValue170_246_1;
    java.util.List spill170_0;
    moom.gc spill170_1;
    moom.gc spill170_2;
    long life1_3;
    forward_join_246: {
    forward_join_245: {
    life1_3 = (__fieldRead170_0() ^ 1284838484382L);
    __call170_1(1);
    __call170_3(__fieldRead170_2(receiver));
    __call170_11(__fieldRead170_4(receiver), new moom.gc(0, ((__fieldRead170_5(receiver) / 2) - __invokedynamic170_6(31550, (8090891004416178955L ^ life1_3))), (((__fieldRead170_7(receiver) / 4) + __invokedynamic170_8(6814, (4304996513873156793L ^ life1_3))) + __invokedynamic170_9(20335, (8803832435595480917L ^ life1_3))), __call170_10("addServer.add", new java.lang.Object[0])));
    __call170_19(__fieldRead170_12(receiver), new moom.gc(1, ((__fieldRead170_13(receiver) / 2) - __invokedynamic170_14(31550, (8090891004416178955L ^ life1_3))), (((__fieldRead170_15(receiver) / 4) + __invokedynamic170_16(1004, (6384165094006375369L ^ life1_3))) + __invokedynamic170_17(20439, (107438259546951667L ^ life1_3))), __call170_18("gui.cancel", new java.lang.Object[0])));
    spill170_0 = __fieldRead170_20(receiver);
    moom.g0 __stackOp170_31_0 = receiver;
    moom.gc __stackOp170_31_1 = new moom.gc(2, ((__fieldRead170_21(receiver) / 2) - __invokedynamic170_22(31550, (8090891004416178955L ^ life1_3))), ((__fieldRead170_23(receiver) / 4) + __invokedynamic170_24(13554, (5886438811634365652L ^ life1_3))), __invokedynamic170_30(__call170_25("addServer.resourcePack", new java.lang.Object[0]), __call170_29(__call170_28(__call170_27(__fieldRead170_26(receiver))))));
    spill170_1 = __stackOp170_31_1;
    __fieldWrite170_32(__stackOp170_31_0, __stackOp170_31_1);
    __call170_33(spill170_0, spill170_1);
    __fieldWrite170_40(receiver, new moom.hJ(0, __fieldRead170_34(receiver), ((__fieldRead170_35(receiver) / 2) - __invokedynamic170_36(31550, (8090891004416178955L ^ life1_3))), __invokedynamic170_37(18764, (4811746450916116848L ^ life1_3)), __invokedynamic170_38(23051, (5816067747188251197L ^ life1_3)), __invokedynamic170_39(25283, (3713187839856157411L ^ life1_3))));
    __call170_42(__fieldRead170_41(receiver), 1);
    __call170_46(__fieldRead170_43(receiver), __fieldRead170_45(__fieldRead170_44(receiver)));
    __fieldWrite170_53(receiver, new moom.hJ(1, __fieldRead170_47(receiver), ((__fieldRead170_48(receiver) / 2) - __invokedynamic170_49(31550, (8090891004416178955L ^ life1_3))), __invokedynamic170_50(4452, (5176860700601700688L ^ life1_3)), __invokedynamic170_51(27967, (5725335987894627612L ^ life1_3)), __invokedynamic170_52(2033, (7800373046009022414L ^ life1_3))));
    __call170_56(__fieldRead170_54(receiver), __invokedynamic170_55(18319, (2309403695414740920L ^ life1_3)));
    __call170_60(__fieldRead170_57(receiver), __fieldRead170_59(__fieldRead170_58(receiver)));
    __call170_63(__fieldRead170_61(receiver), __fieldRead170_62(receiver));
    spill170_2 = __cast170_66(__call170_65(__fieldRead170_64(receiver), 0));
    if (!((__call170_69(__call170_68(__fieldRead170_67(receiver))) > 0))) {
        forwardValue170_245_0 = spill170_2;
        break forward_join_245;
    }
    if (!(((__call170_72(__call170_71(__fieldRead170_70(receiver)), ":")).length > 0))) {
        forwardValue170_245_0 = spill170_2;
        break forward_join_245;
    }
    if (!((__call170_75(__call170_74(__fieldRead170_73(receiver))) > 0))) {
        forwardValue170_245_0 = spill170_2;
        break forward_join_245;
    }
    forwardValue170_246_0 = spill170_2;
    forwardValue170_246_1 = 1;
    break forward_join_246;
    }
    forwardValue170_246_0 = forwardValue170_245_0;
    forwardValue170_246_1 = 0;
    }
    __fieldWrite170_76(forwardValue170_246_0, forwardValue170_246_1);
    return;
}
public static void h170_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017000_0(p0);
}
public static void h170_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017001_0(p0);
}
public static void h170_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017002_0(p0);
}
private static native long __fieldRead170_0() throws Throwable;
private static native void __call170_1(int a0) throws Throwable;
private static native java.util.List __fieldRead170_2(moom.g0 a0) throws Throwable;
private static native void __call170_3(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead170_4(moom.g0 a0) throws Throwable;
private static native int __fieldRead170_5(moom.g0 a0) throws Throwable;
private static native int __invokedynamic170_6(int a0, long a1) throws Throwable;
private static native int __fieldRead170_7(moom.g0 a0) throws Throwable;
private static native int __invokedynamic170_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic170_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call170_10(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call170_11(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead170_12(moom.g0 a0) throws Throwable;
private static native int __fieldRead170_13(moom.g0 a0) throws Throwable;
private static native int __invokedynamic170_14(int a0, long a1) throws Throwable;
private static native int __fieldRead170_15(moom.g0 a0) throws Throwable;
private static native int __invokedynamic170_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic170_17(int a0, long a1) throws Throwable;
private static native java.lang.String __call170_18(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call170_19(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead170_20(moom.g0 a0) throws Throwable;
private static native int __fieldRead170_21(moom.g0 a0) throws Throwable;
private static native int __invokedynamic170_22(int a0, long a1) throws Throwable;
private static native int __fieldRead170_23(moom.g0 a0) throws Throwable;
private static native int __invokedynamic170_24(int a0, long a1) throws Throwable;
private static native java.lang.String __call170_25(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.jL __fieldRead170_26(moom.g0 a0) throws Throwable;
private static native moom.az __call170_27(moom.jL a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call170_28(moom.az a0) throws Throwable;
private static native java.lang.String __call170_29(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native java.lang.String __invokedynamic170_30(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite170_32(moom.g0 a0, moom.gc a1) throws Throwable;
private static native boolean __call170_33(java.util.List a0, moom.gc a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead170_34(moom.g0 a0) throws Throwable;
private static native int __fieldRead170_35(moom.g0 a0) throws Throwable;
private static native int __invokedynamic170_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic170_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic170_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic170_39(int a0, long a1) throws Throwable;
private static native void __fieldWrite170_40(moom.g0 a0, moom.hJ a1) throws Throwable;
private static native moom.hJ __fieldRead170_41(moom.g0 a0) throws Throwable;
private static native void __call170_42(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead170_43(moom.g0 a0) throws Throwable;
private static native moom.jL __fieldRead170_44(moom.g0 a0) throws Throwable;
private static native java.lang.String __fieldRead170_45(moom.jL a0) throws Throwable;
private static native void __call170_46(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead170_47(moom.g0 a0) throws Throwable;
private static native int __fieldRead170_48(moom.g0 a0) throws Throwable;
private static native int __invokedynamic170_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic170_50(int a0, long a1) throws Throwable;
private static native int __invokedynamic170_51(int a0, long a1) throws Throwable;
private static native int __invokedynamic170_52(int a0, long a1) throws Throwable;
private static native void __fieldWrite170_53(moom.g0 a0, moom.hJ a1) throws Throwable;
private static native moom.hJ __fieldRead170_54(moom.g0 a0) throws Throwable;
private static native int __invokedynamic170_55(int a0, long a1) throws Throwable;
private static native void __call170_56(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead170_57(moom.g0 a0) throws Throwable;
private static native moom.jL __fieldRead170_58(moom.g0 a0) throws Throwable;
private static native java.lang.String __fieldRead170_59(moom.jL a0) throws Throwable;
private static native void __call170_60(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native moom.hJ __fieldRead170_61(moom.g0 a0) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead170_62(moom.g0 a0) throws Throwable;
private static native void __call170_63(moom.hJ a0, com.google.common.base.Predicate a1) throws Throwable;
private static native java.util.List __fieldRead170_64(moom.g0 a0) throws Throwable;
private static native java.lang.Object __call170_65(java.util.List a0, int a1) throws Throwable;
private static native moom.gc __cast170_66(java.lang.Object a0) throws Throwable;
private static native moom.hJ __fieldRead170_67(moom.g0 a0) throws Throwable;
private static native java.lang.String __call170_68(moom.hJ a0) throws Throwable;
private static native int __call170_69(java.lang.String a0) throws Throwable;
private static native moom.hJ __fieldRead170_70(moom.g0 a0) throws Throwable;
private static native java.lang.String __call170_71(moom.hJ a0) throws Throwable;
private static native java.lang.String[] __call170_72(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.hJ __fieldRead170_73(moom.g0 a0) throws Throwable;
private static native java.lang.String __call170_74(moom.hJ a0) throws Throwable;
private static native int __call170_75(java.lang.String a0) throws Throwable;
private static native void __fieldWrite170_76(moom.gc a0, int a1) throws Throwable;
private static native java.lang.Exception __call1017000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1017001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1017002_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_8cbb99b98859929687d9(java.lang.String a0) throws E;
private static final class __SourceHandler_8cbb99b98859929687d9 {

public static boolean f396(java.lang.String p0) throws Throwable {
    java.lang.String[] life1_10;
    java.lang.String life2_22;
    if ((__call396_0(p0) == 0)) {
        return true;
    }
    life1_10 = __call396_1(p0, ":");
    if (((life1_10).length == 0)) {
        return true;
    }
    life2_22 = __call396_2((life1_10)[0]);
    return true;
}
public static boolean h396_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2039600_0(p0);
}
public static boolean h396_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2039601_0(p0);
}
public static boolean h396_2(java.lang.IllegalArgumentException p0) throws Throwable {
    java.lang.IllegalArgumentException local1 = p0;
    return false;
}
private static native int __call396_0(java.lang.String a0) throws Throwable;
private static native java.lang.String[] __call396_1(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call396_2(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call2039600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2039601_0(java.lang.IllegalArgumentException a0) throws Throwable;

}


public void c__Void() { __sourceHandlerCall_62e3f85b559e693b5d1f(this); }


public void h() {
org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.g0.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4930;
      if (E[var3] == null) {
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
         long var5 = D[var3];
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
         Object[] var9 = (Object[])F.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               F.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/g0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         E[var3] = var15;
      }

      return E[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7657_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/g0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_2145239991f76952e1f1(this, p0); }


protected void a(int p0, int p1, int p2) throws java.io.IOException {
super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    ((moom.hJ)(this.y)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    ((moom.hJ)(this.z)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void a(int p0, int p1, float p2) {
long local4 = (moom.g0.C ^ 66484593683480L);
    ((moom.g0)(this)).i();
    ((moom.g0)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("addServer.title")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_5(11031, (6220309206450073250L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_6(20641, (4835708564748637466L ^ local4)))));
    ((moom.g0)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("addServer.enterName")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)(((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_11(21399, (7014530173502035503L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_12(5178, (2859059151958102412L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_13(8831, (7664652547885033409L ^ local4)))));
    ((moom.g0)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("addServer.enterIp")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)(((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_18(31550, (8090896899254566541L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_19(26275, (948652462333764356L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_20(28015, (5961291917472049371L ^ local4)))));
    ((moom.hJ)(this.z)).d__Void();
    ((moom.hJ)(this.y)).d__Void();
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_6447ad395f9413623221(this, p0, p1); }


public void g() {
((moom.hJ)(this.z)).a__Void();
    ((moom.hJ)(this.y)).a__Void();
    return;
}


private static boolean lambda$new$0(java.lang.String p0) { return __sourceHandlerCall_8cbb99b98859929687d9(p0); }


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_b0ed240f852e_originalDynamicSite4344_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1437_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7657_0() throws E;
}
