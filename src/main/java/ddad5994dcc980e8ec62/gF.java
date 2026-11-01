package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gF extends net.minecraft.client.gui.GuiScreen {

private static org.apache.logging.log4j.Logger w;

private java.util.List<java.lang.String> x;

protected moom.hJ y;

private java.lang.String z;

private int A;

private boolean B;

private boolean C;

private int D;

private java.lang.String E;

private static long F;

private static long[] K;

private static java.lang.Integer[] L;

private static java.util.Map M;

public gF() {
super();
    this.x = com.google.common.collect.Lists.newArrayList();
    this.z = "";
    this.A = -1;
    this.E = "";
}


public gF(java.lang.String p0) {
super();
    this.x = com.google.common.collect.Lists.newArrayList();
    this.z = "";
    this.A = -1;
    this.E = "";
    this.E = p0;
}


static {
F = ((long)(((moom._a)(moom._c.a(((long)(-3432910272341813036L)), ((long)(-2600802175543571208L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(247466986200014L)))));
    M = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gF.F ^ 80417255301923L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1210_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1210_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1210_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1210_14 = new byte[8];
    (__sourceSpill1210_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1210_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1210_16 = __sourceSpill1210_14;
    ((javax.crypto.Cipher)(__sourceSpill1210_11)).init(((int)(__sourceSpill1210_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1210_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1210_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[19];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÔÄ`àk\032J\030ÿÐÀqe\024ê3RHÞ`è­'àÁ.¡Å:îÎþéioõcÊ¦Øx©Aª·äOÑ¿ÿºJ_\t=eoj¿ôY0#úù¶$,Þå'ñÓ@ð3ê0mEä\003u\016ÂÛ+x\016JÓ\f\033Îµ8çcEMBes\"°¶ü>\n\005k~KBÆ´ÚÃôÎ0©¾"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1210_25 = local6_life21;
        int __sourceSpill1210_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1210_25)).substring(((int)(__sourceSpill1210_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1210_30 = local8_life19;
        int __sourceSpill1210_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1210_33 = new byte[8];
        (__sourceSpill1210_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1210_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1210_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1210_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1210_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1210_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1210_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1210_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1210_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1210_34)).doFinal(((byte[])(__sourceSpill1210_33)));
        (__sourceSpill1210_30)[__sourceSpill1210_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ÿâÀ\005Õ#\034$|z[ÿß"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1210_38 = local6_life21;
        int __sourceSpill1210_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1210_38)).substring(((int)(__sourceSpill1210_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1210_43 = local8_life19;
        int __sourceSpill1210_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1210_46 = new byte[8];
        (__sourceSpill1210_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1210_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1210_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1210_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1210_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1210_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1210_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1210_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1210_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1210_47)).doFinal(((byte[])(__sourceSpill1210_46)));
        (__sourceSpill1210_43)[__sourceSpill1210_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    K = ((long[])(local8_life19));
    L = ((java.lang.Integer[])(new java.lang.Integer[19]));
    w = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_293e5eff81e03e61f9b8(moom.gF a0) throws E;
private static final class __SourceHandler_293e5eff81e03e61f9b8 {

public static void f849(moom.gF receiver) throws Throwable {
    moom.hJ spill849_0;
    java.util.List spill849_1;
    int spill849_2;
    int life1_37;
    java.lang.String life2_50;
    java.lang.String life3_59;
    java.lang.StringBuilder life1_88;
    java.util.Iterator life2_92;
    java.lang.String life3_99;
    forest_join_122: {
    forest_join_111: {
    forest_join_79: {
    forest_join_68: {
    forest_join_28: {
    if (!(__fieldRead849_0(receiver))) {
        break forest_join_28;
    }
    __call849_8(__fieldRead849_1(receiver), (__call849_5(__fieldRead849_2(receiver), -1, __call849_4(__fieldRead849_3(receiver)), 0) - __call849_7(__fieldRead849_6(receiver))));
    if (!((__fieldRead849_9(receiver) >= __call849_11(__fieldRead849_10(receiver))))) {
        break forest_join_79;
    }
    __fieldWrite849_12(receiver, 0);
    break forest_join_79;
    }
    life1_37 = __call849_16(__fieldRead849_13(receiver), -1, __call849_15(__fieldRead849_14(receiver)), 0);
    __call849_18(__fieldRead849_17(receiver));
    __fieldWrite849_19(receiver, 0);
    life2_50 = __call849_23(__call849_22(__call849_21(__fieldRead849_20(receiver)), life1_37));
    life3_59 = __call849_28(__call849_25(__fieldRead849_24(receiver)), 0, __call849_27(__fieldRead849_26(receiver)));
    __call849_29(receiver, life3_59, life2_50);
    if (!(__call849_31(__fieldRead849_30(receiver)))) {
        break forest_join_68;
    }
    return;
    }
    __fieldWrite849_32(receiver, 1);
    __call849_36(__fieldRead849_33(receiver), (life1_37 - __call849_35(__fieldRead849_34(receiver))));
    }
    if (!((__call849_38(__fieldRead849_37(receiver)) > 1))) {
        break forest_join_122;
    }
    life1_88 = new java.lang.StringBuilder();
    life2_92 = __call849_40(__fieldRead849_39(receiver));
    forest_cycle_92: while (true) {
    forest_join_106: {
    if (!(__call849_41(life2_92))) {
        break forest_join_111;
    }
    life3_99 = __cast849_43(__call849_42(life2_92));
    if (!((__call849_44(life1_88) > 0))) {
        break forest_join_106;
    }
    __call849_45(life1_88, ", ");
    }
    __call849_46(life1_88, life3_99);
    continue forest_cycle_92;
    }
    }
    __call849_51(__call849_49(__fieldRead849_48(__fieldRead849_47(receiver))), new moom.CM(__call849_50(life1_88)), 1);
    }
    spill849_0 = __fieldRead849_52(receiver);
    spill849_1 = __fieldRead849_53(receiver);
    moom.gF __stackOp849_54_0 = receiver;
    moom.gF __stackOp849_56_0 = __stackOp849_54_0;
    int __stackOp849_56_1 = __fieldRead849_55(__stackOp849_54_0);
    spill849_2 = __stackOp849_56_1;
    __fieldWrite849_57(__stackOp849_56_0, (__stackOp849_56_1 + 1));
    __call849_60(spill849_0, __cast849_59(__call849_58(spill849_1, spill849_2)));
    return;
}
public static void h849_0(moom.Oo p0) throws Throwable {
    throw __call3084900_0(p0);
}
public static void h849_1(moom.Oo p0) throws Throwable {
    throw __call3084901_0(p0);
}
public static void h849_2(moom.Oo p0) throws Throwable {
    throw __call3084902_0(p0);
}
public static void h849_3(moom.Oo p0) throws Throwable {
    throw __call3084903_0(p0);
}
private static native boolean __fieldRead849_0(moom.gF a0) throws Throwable;
private static native moom.hJ __fieldRead849_1(moom.gF a0) throws Throwable;
private static native moom.hJ __fieldRead849_2(moom.gF a0) throws Throwable;
private static native moom.hJ __fieldRead849_3(moom.gF a0) throws Throwable;
private static native int __call849_4(moom.hJ a0) throws Throwable;
private static native int __call849_5(moom.hJ a0, int a1, int a2, int a3) throws Throwable;
private static native moom.hJ __fieldRead849_6(moom.gF a0) throws Throwable;
private static native int __call849_7(moom.hJ a0) throws Throwable;
private static native void __call849_8(moom.hJ a0, int a1) throws Throwable;
private static native int __fieldRead849_9(moom.gF a0) throws Throwable;
private static native java.util.List __fieldRead849_10(moom.gF a0) throws Throwable;
private static native int __call849_11(java.util.List a0) throws Throwable;
private static native void __fieldWrite849_12(moom.gF a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead849_13(moom.gF a0) throws Throwable;
private static native moom.hJ __fieldRead849_14(moom.gF a0) throws Throwable;
private static native int __call849_15(moom.hJ a0) throws Throwable;
private static native int __call849_16(moom.hJ a0, int a1, int a2, int a3) throws Throwable;
private static native java.util.List __fieldRead849_17(moom.gF a0) throws Throwable;
private static native void __call849_18(java.util.List a0) throws Throwable;
private static native void __fieldWrite849_19(moom.gF a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead849_20(moom.gF a0) throws Throwable;
private static native java.lang.String __call849_21(moom.hJ a0) throws Throwable;
private static native java.lang.String __call849_22(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call849_23(java.lang.String a0) throws Throwable;
private static native moom.hJ __fieldRead849_24(moom.gF a0) throws Throwable;
private static native java.lang.String __call849_25(moom.hJ a0) throws Throwable;
private static native moom.hJ __fieldRead849_26(moom.gF a0) throws Throwable;
private static native int __call849_27(moom.hJ a0) throws Throwable;
private static native java.lang.String __call849_28(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __call849_29(moom.gF a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.util.List __fieldRead849_30(moom.gF a0) throws Throwable;
private static native boolean __call849_31(java.util.List a0) throws Throwable;
private static native void __fieldWrite849_32(moom.gF a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead849_33(moom.gF a0) throws Throwable;
private static native moom.hJ __fieldRead849_34(moom.gF a0) throws Throwable;
private static native int __call849_35(moom.hJ a0) throws Throwable;
private static native void __call849_36(moom.hJ a0, int a1) throws Throwable;
private static native java.util.List __fieldRead849_37(moom.gF a0) throws Throwable;
private static native int __call849_38(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead849_39(moom.gF a0) throws Throwable;
private static native java.util.Iterator __call849_40(java.util.List a0) throws Throwable;
private static native boolean __call849_41(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call849_42(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast849_43(java.lang.Object a0) throws Throwable;
private static native int __call849_44(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.StringBuilder __call849_45(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call849_46(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead849_47(moom.gF a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead849_48(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call849_49(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native java.lang.String __call849_50(java.lang.StringBuilder a0) throws Throwable;
private static native void __call849_51(moom.gB a0, moom.CM a1, int a2) throws Throwable;
private static native moom.hJ __fieldRead849_52(moom.gF a0) throws Throwable;
private static native java.util.List __fieldRead849_53(moom.gF a0) throws Throwable;
private static native int __fieldRead849_55(moom.gF a0) throws Throwable;
private static native void __fieldWrite849_57(moom.gF a0, int a1) throws Throwable;
private static native java.lang.Object __call849_58(java.util.List a0, int a1) throws Throwable;
private static native java.lang.String __cast849_59(java.lang.Object a0) throws Throwable;
private static native void __call849_60(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3084900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3084901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3084902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3084903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e63f3d078d230e47fd22(moom.gF a0, char a1, int a2) throws E;
private static final class __SourceHandler_e63f3d078d230e47fd22 {

public static void f1033(moom.gF receiver, char p0, int p1) throws Throwable {
    long life3_3;
    java.lang.String life5_26;
    com.moon.ek life6_33;
    java.lang.String[] life7_50;
    java.lang.String[] life8_55;
    java.lang.String life9_62;
    java.lang.String life10_69;
    java.lang.String life5_213;
    forward_join_196: {
    forward_join_192: {
    forward_join_181: {
    forward_join_174: {
    forward_join_153: {
    forward_join_133: {
    forward_join_122: {
    forward_join_97: {
    forward_join_89: {
    forward_join_86: {
    forward_join_83: {
    forward_join_78: {
    life3_3 = (__fieldRead1033_0() ^ 119289296467068L);
    __fieldWrite1033_1(receiver, 0);
    if (!((p1 == __invokedynamic1033_2(31142, (6887035272801052038L ^ life3_3))))) { break forward_join_86; }
    if (!(__call1033_5(__fieldRead1033_4(__fieldRead1033_3(receiver)), "."))) { break forward_join_83; }
    life5_26 = __call1033_7(__fieldRead1033_6(receiver));
    life6_33 = new com.moon.ek(life5_26, "", false);
    __call1033_10(__call1033_9(__call1033_8()), life6_33);
    if (!((__call1033_11(life6_33) != null))) { break forward_join_83; }
    if (!(__call1033_12(life6_33))) { break forward_join_83; }
    life7_50 = __call1033_13(life5_26, " ");
    life8_55 = __call1033_15(__call1033_14(life6_33), " ");
    life9_62 = (life8_55)[((life8_55).length - 1)];
    life10_69 = (life7_50)[((life7_50).length - 1)];
    if (!((!__call1033_16(life9_62, life10_69)))) { break forward_join_83; }
    if (!((!__call1033_19(__fieldRead1033_18(__fieldRead1033_17(receiver)), " ")))) { break forward_join_78; }
    __call1033_21(__fieldRead1033_20(receiver), -1);
    }
    __call1033_23(__fieldRead1033_22(receiver), life9_62);
    return;
    }
    __call1033_24(receiver);
    break forward_join_89;
    }
    __fieldWrite1033_25(receiver, 0);
    }
    if (!((p1 == 1))) { break forward_join_97; }
    __call1033_27(__fieldRead1033_26(receiver), null);
    break forward_join_196;
    }
    if (!((p1 != __invokedynamic1033_28(30914, (4171416971564279011L ^ life3_3))))) { break forward_join_181; }
    if (!((p1 != __invokedynamic1033_29(9725, (5008383908917361118L ^ life3_3))))) { break forward_join_181; }
    if (!((p1 == __invokedynamic1033_30(12902, (953000652676640346L ^ life3_3))))) { break forward_join_122; }
    __call1033_31(receiver, -1);
    break forward_join_196;
    }
    if (!((p1 == __invokedynamic1033_32(27628, (4985850629288851394L ^ life3_3))))) { break forward_join_133; }
    __call1033_33(receiver, 1);
    break forward_join_196;
    }
    if (!((p1 == __invokedynamic1033_34(21861, (1587336041607055707L ^ life3_3))))) { break forward_join_153; }
    __call1033_42(__call1033_37(__fieldRead1033_36(__fieldRead1033_35(receiver))), (__call1033_41(__call1033_40(__fieldRead1033_39(__fieldRead1033_38(receiver)))) - 1));
    break forward_join_196;
    }
    if (!((p1 == __invokedynamic1033_43(3146, (7388845424399683692L ^ life3_3))))) { break forward_join_174; }
    __call1033_51(__call1033_46(__fieldRead1033_45(__fieldRead1033_44(receiver))), ((-__call1033_50(__call1033_49(__fieldRead1033_48(__fieldRead1033_47(receiver))))) + 1));
    break forward_join_196;
    }
    __call1033_53(__fieldRead1033_52(receiver), p0, p1);
    break forward_join_196;
    }
    life5_213 = __call1033_56(__call1033_55(__fieldRead1033_54(receiver)));
    if (!((__call1033_57(life5_213) > 0))) { break forward_join_192; }
    __call1033_58(receiver, life5_213);
    }
    __call1033_60(__fieldRead1033_59(receiver), null);
    }
    return;
}
public static void h1033_0(java.io.IOException p0) throws Throwable {
    throw __call1103300_0(p0);
}
public static void h1033_1(java.io.IOException p0) throws Throwable {
    throw __call1103301_0(p0);
}
public static void h1033_2(java.io.IOException p0) throws Throwable {
    throw __call1103302_0(p0);
}
public static void h1033_3(java.io.IOException p0) throws Throwable {
    throw __call1103303_0(p0);
}
public static void h1033_4(java.io.IOException p0) throws Throwable {
    throw __call1103304_0(p0);
}
public static void h1033_5(java.io.IOException p0) throws Throwable {
    throw __call1103305_0(p0);
}
public static void h1033_6(java.io.IOException p0) throws Throwable {
    throw __call1103306_0(p0);
}
public static void h1033_7(java.io.IOException p0) throws Throwable {
    throw __call1103307_0(p0);
}
public static void h1033_8(java.io.IOException p0) throws Throwable {
    throw __call1103308_0(p0);
}
public static void h1033_9(java.io.IOException p0) throws Throwable {
    throw __call1103309_0(p0);
}
public static void h1033_10(java.io.IOException p0) throws Throwable {
    throw __call1103310_0(p0);
}
public static void h1033_11(java.io.IOException p0) throws Throwable {
    throw __call1103311_0(p0);
}
private static native long __fieldRead1033_0() throws Throwable;
private static native void __fieldWrite1033_1(moom.gF a0, int a1) throws Throwable;
private static native int __invokedynamic1033_2(int a0, long a1) throws Throwable;
private static native moom.hJ __fieldRead1033_3(moom.gF a0) throws Throwable;
private static native java.lang.String __fieldRead1033_4(moom.hJ a0) throws Throwable;
private static native boolean __call1033_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.hJ __fieldRead1033_6(moom.gF a0) throws Throwable;
private static native java.lang.String __call1033_7(moom.hJ a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call1033_8() throws Throwable;
private static native com.moon.events.EventBus __call1033_9(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call1033_10(com.moon.events.EventBus a0, com.moon.ek a1) throws Throwable;
private static native java.lang.String __call1033_11(com.moon.ek a0) throws Throwable;
private static native boolean __call1033_12(com.moon.ek a0) throws Throwable;
private static native java.lang.String[] __call1033_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1033_14(com.moon.ek a0) throws Throwable;
private static native java.lang.String[] __call1033_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call1033_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.hJ __fieldRead1033_17(moom.gF a0) throws Throwable;
private static native java.lang.String __fieldRead1033_18(moom.hJ a0) throws Throwable;
private static native boolean __call1033_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.hJ __fieldRead1033_20(moom.gF a0) throws Throwable;
private static native void __call1033_21(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead1033_22(moom.gF a0) throws Throwable;
private static native void __call1033_23(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native void __call1033_24(moom.gF a0) throws Throwable;
private static native void __fieldWrite1033_25(moom.gF a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1033_26(moom.gF a0) throws Throwable;
private static native void __call1033_27(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native int __invokedynamic1033_28(int a0, long a1) throws Throwable;
private static native int __invokedynamic1033_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic1033_30(int a0, long a1) throws Throwable;
private static native void __call1033_31(moom.gF a0, int a1) throws Throwable;
private static native int __invokedynamic1033_32(int a0, long a1) throws Throwable;
private static native void __call1033_33(moom.gF a0, int a1) throws Throwable;
private static native int __invokedynamic1033_34(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1033_35(moom.gF a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1033_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call1033_37(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1033_38(moom.gF a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1033_39(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call1033_40(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native int __call1033_41(moom.gB a0) throws Throwable;
private static native void __call1033_42(moom.gB a0, int a1) throws Throwable;
private static native int __invokedynamic1033_43(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1033_44(moom.gF a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1033_45(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call1033_46(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1033_47(moom.gF a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1033_48(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call1033_49(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native int __call1033_50(moom.gB a0) throws Throwable;
private static native void __call1033_51(moom.gB a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead1033_52(moom.gF a0) throws Throwable;
private static native boolean __call1033_53(moom.hJ a0, char a1, int a2) throws Throwable;
private static native moom.hJ __fieldRead1033_54(moom.gF a0) throws Throwable;
private static native java.lang.String __call1033_55(moom.hJ a0) throws Throwable;
private static native java.lang.String __call1033_56(java.lang.String a0) throws Throwable;
private static native int __call1033_57(java.lang.String a0) throws Throwable;
private static native void __call1033_58(moom.gF a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1033_59(moom.gF a0) throws Throwable;
private static native void __call1033_60(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Exception __call1103300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103302_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103303_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103304_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103305_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103306_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103307_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103308_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103309_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103310_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1103311_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f8e1b5df8574346ea493(moom.gF a0, int a1) throws E;
private static final class __SourceHandler_f8e1b5df8574346ea493 {

public static void f1733(moom.gF receiver, int p0) throws Throwable {
    int life2_4;
    int life3_11;
    int life2_16;
    life2_4 = (__fieldRead1733_0(receiver) + p0);
    life3_11 = __call1733_5(__call1733_4(__call1733_3(__fieldRead1733_2(__fieldRead1733_1(receiver)))));
    life2_16 = __call1733_6(life2_4, 0, life3_11);
    if ((life2_16 != __fieldRead1733_7(receiver))) {
        if ((life2_16 == life3_11)) {
        __fieldWrite1733_8(receiver, life3_11);
        __call1733_11(__fieldRead1733_9(receiver), __fieldRead1733_10(receiver));
    } else {
        if ((__fieldRead1733_12(receiver) == life3_11)) {
        __fieldWrite1733_15(receiver, __call1733_14(__fieldRead1733_13(receiver)));
    }
        __call1733_23(__fieldRead1733_16(receiver), __cast1733_22(__call1733_21(__call1733_20(__call1733_19(__fieldRead1733_18(__fieldRead1733_17(receiver)))), life2_16)));
        __fieldWrite1733_24(receiver, life2_16);
    }
    }
    return;
}
public static void h1733_0(moom.Oo p0) throws Throwable {
    throw __call1173300_0(p0);
}
public static void h1733_1(moom.Oo p0) throws Throwable {
    throw __call1173301_0(p0);
}
public static void h1733_2(moom.Oo p0) throws Throwable {
    throw __call1173302_0(p0);
}
private static native int __fieldRead1733_0(moom.gF a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1733_1(moom.gF a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1733_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call1733_3(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native java.util.List __call1733_4(moom.gB a0) throws Throwable;
private static native int __call1733_5(java.util.List a0) throws Throwable;
private static native int __call1733_6(int a0, int a1, int a2) throws Throwable;
private static native int __fieldRead1733_7(moom.gF a0) throws Throwable;
private static native void __fieldWrite1733_8(moom.gF a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead1733_9(moom.gF a0) throws Throwable;
private static native java.lang.String __fieldRead1733_10(moom.gF a0) throws Throwable;
private static native void __call1733_11(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead1733_12(moom.gF a0) throws Throwable;
private static native moom.hJ __fieldRead1733_13(moom.gF a0) throws Throwable;
private static native java.lang.String __call1733_14(moom.hJ a0) throws Throwable;
private static native void __fieldWrite1733_15(moom.gF a0, java.lang.String a1) throws Throwable;
private static native moom.hJ __fieldRead1733_16(moom.gF a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1733_17(moom.gF a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1733_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call1733_19(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native java.util.List __call1733_20(moom.gB a0) throws Throwable;
private static native java.lang.Object __call1733_21(java.util.List a0, int a1) throws Throwable;
private static native java.lang.String __cast1733_22(java.lang.Object a0) throws Throwable;
private static native void __call1733_23(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1733_24(moom.gF a0, int a1) throws Throwable;
private static native java.lang.Exception __call1173300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1173301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1173302_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dbc5a6db6362b5a2c1ae(moom.gF a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_dbc5a6db6362b5a2c1ae {

public static void f1034(moom.gF receiver, int p0, int p1, float p2) throws Throwable {
    long life4_3;
    java.lang.String life6_30;
    com.moon.ek life7_37;
    net.minecraft.util.IChatComponent life8_155;
    forward_join_156: {
    forward_join_134: {
    forward_join_133: {
    forward_join_105: {
    forward_join_81: {
    life4_3 = (__fieldRead1034_0() ^ 98034089061815L);
    __call1034_6(2, (__fieldRead1034_1(receiver) - __invokedynamic1034_2(30114, (8875658853421822022L ^ life4_3))), (__fieldRead1034_3(receiver) - 2), (__fieldRead1034_4(receiver) - 2), __invokedynamic1034_5(10272, (4607729615919836609L ^ life4_3)));
    life6_30 = __call1034_8(__fieldRead1034_7(receiver));
    life7_37 = new com.moon.ek(life6_30, "", false);
    __call1034_11(__call1034_10(__call1034_9()), life7_37);
    if (!(__call1034_12(life6_30, "."))) { break forward_join_134; }
    __call1034_19(2, (__fieldRead1034_13(receiver) - __invokedynamic1034_14(27079, (6345678708193569835L ^ life4_3))), (__fieldRead1034_15(receiver) - 2), (__fieldRead1034_16(receiver) - __invokedynamic1034_17(25944, (4174949352086544566L ^ life4_3))), __invokedynamic1034_18(19061, (4080904304022392727L ^ life4_3)));
    __call1034_20();
    if (!((__call1034_21(life7_37) != null))) { break forward_join_81; }
    if (!(__call1034_23(__call1034_22(life7_37)))) { break forward_join_105; }
    }
    __call1034_29(__fieldRead1034_25(__fieldRead1034_24(receiver)), life6_30, 0x1.0p2f, ((float) ((__fieldRead1034_26(receiver) - __invokedynamic1034_27(8115, (1154173245693975125L ^ life4_3))) + 2)), __invokedynamic1034_28(6298, (9046898102167756147L ^ life4_3)));
    break forward_join_133;
    }
    if (!((!__call1034_31(__call1034_30(life7_37))))) { break forward_join_133; }
    __call1034_38(__fieldRead1034_33(__fieldRead1034_32(receiver)), __call1034_34(life7_37), 0x1.0p2f, ((float) ((__fieldRead1034_35(receiver) - __invokedynamic1034_36(8115, (1154173245693975125L ^ life4_3))) + 2)), __invokedynamic1034_37(8126, (7434763004266502745L ^ life4_3)));
    }
    __call1034_39();
    }
    __call1034_41(__fieldRead1034_40(receiver));
    life8_155 = __call1034_47(__call1034_44(__fieldRead1034_43(__fieldRead1034_42(receiver))), __call1034_45(), __call1034_46());
    if (!((life8_155 != null))) { break forward_join_156; }
    if (!((__call1034_49(__call1034_48(life8_155)) != null))) { break forward_join_156; }
    __call1034_50(receiver, life8_155, p0, p1);
    }
    __call1034_51(receiver, p0, p1, p2);
    return;
}
public static void h1034_0(moom.Oo p0) throws Throwable {
    throw __call1103400_0(p0);
}
public static void h1034_1(moom.Oo p0) throws Throwable {
    throw __call1103401_0(p0);
}
public static void h1034_2(moom.Oo p0) throws Throwable {
    throw __call1103402_0(p0);
}
public static void h1034_3(moom.Oo p0) throws Throwable {
    throw __call1103403_0(p0);
}
public static void h1034_4(moom.Oo p0) throws Throwable {
    throw __call1103404_0(p0);
}
public static void h1034_5(moom.Oo p0) throws Throwable {
    throw __call1103405_0(p0);
}
private static native long __fieldRead1034_0() throws Throwable;
private static native int __fieldRead1034_1(moom.gF a0) throws Throwable;
private static native int __invokedynamic1034_2(int a0, long a1) throws Throwable;
private static native int __fieldRead1034_3(moom.gF a0) throws Throwable;
private static native int __fieldRead1034_4(moom.gF a0) throws Throwable;
private static native int __invokedynamic1034_5(int a0, long a1) throws Throwable;
private static native void __call1034_6(int a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native moom.hJ __fieldRead1034_7(moom.gF a0) throws Throwable;
private static native java.lang.String __call1034_8(moom.hJ a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call1034_9() throws Throwable;
private static native com.moon.events.EventBus __call1034_10(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call1034_11(com.moon.events.EventBus a0, com.moon.ek a1) throws Throwable;
private static native boolean __call1034_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead1034_13(moom.gF a0) throws Throwable;
private static native int __invokedynamic1034_14(int a0, long a1) throws Throwable;
private static native int __fieldRead1034_15(moom.gF a0) throws Throwable;
private static native int __fieldRead1034_16(moom.gF a0) throws Throwable;
private static native int __invokedynamic1034_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic1034_18(int a0, long a1) throws Throwable;
private static native void __call1034_19(int a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call1034_20() throws Throwable;
private static native java.lang.String __call1034_21(com.moon.ek a0) throws Throwable;
private static native java.lang.String __call1034_22(com.moon.ek a0) throws Throwable;
private static native boolean __call1034_23(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1034_24(moom.gF a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1034_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1034_26(moom.gF a0) throws Throwable;
private static native int __invokedynamic1034_27(int a0, long a1) throws Throwable;
private static native int __invokedynamic1034_28(int a0, long a1) throws Throwable;
private static native int __call1034_29(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native java.lang.String __call1034_30(com.moon.ek a0) throws Throwable;
private static native boolean __call1034_31(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1034_32(moom.gF a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1034_33(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call1034_34(com.moon.ek a0) throws Throwable;
private static native int __fieldRead1034_35(moom.gF a0) throws Throwable;
private static native int __invokedynamic1034_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic1034_37(int a0, long a1) throws Throwable;
private static native int __call1034_38(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native void __call1034_39() throws Throwable;
private static native moom.hJ __fieldRead1034_40(moom.gF a0) throws Throwable;
private static native void __call1034_41(moom.hJ a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1034_42(moom.gF a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1034_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call1034_44(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native int __call1034_45() throws Throwable;
private static native int __call1034_46() throws Throwable;
private static native net.minecraft.util.IChatComponent __call1034_47(moom.gB a0, int a1, int a2) throws Throwable;
private static native moom.CO __call1034_48(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native moom.v3 __call1034_49(moom.CO a0) throws Throwable;
private static native void __call1034_50(moom.gF a0, net.minecraft.util.IChatComponent a1, int a2, int a3) throws Throwable;
private static native void __call1034_51(moom.gF a0, int a1, int a2, float a3) throws Throwable;
private static native java.lang.Exception __call1103400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1103401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1103402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1103403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1103404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1103405_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6a5620d8333d98ef4133(moom.gF a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_6a5620d8333d98ef4133 {

public static void f100112(moom.gF receiver, int p0, int p1, int p2) throws Throwable {
    net.minecraft.util.IChatComponent life4_9;
    forest_join_15: {
    if (!((p2 == 0))) {
        break forest_join_15;
    }
    life4_9 = __call100112_5(__call100112_2(__fieldRead100112_1(__fieldRead100112_0(receiver))), __call100112_3(), __call100112_4());
    if (!(__call100112_6(receiver, life4_9))) {
        break forest_join_15;
    }
    return;
    }
    __call100112_8(__fieldRead100112_7(receiver), p0, p1, p2);
    __call100112_9(receiver, p0, p1, p2);
    return;
}
public static void h100112_0(java.io.IOException p0) throws Throwable {
    throw __call13011200_0(p0);
}
private static native net.minecraft.client.Minecraft __fieldRead100112_0(moom.gF a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead100112_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call100112_2(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native int __call100112_3() throws Throwable;
private static native int __call100112_4() throws Throwable;
private static native net.minecraft.util.IChatComponent __call100112_5(moom.gB a0, int a1, int a2) throws Throwable;
private static native boolean __call100112_6(moom.gF a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native moom.hJ __fieldRead100112_7(moom.gF a0) throws Throwable;
private static native void __call100112_8(moom.hJ a0, int a1, int a2, int a3) throws Throwable;
private static native void __call100112_9(moom.gF a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call13011200_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6fc4e6829091ed0c93a5(moom.gF a0, java.lang.String a1, java.lang.String a2) throws E;
private static final class __SourceHandler_6fc4e6829091ed0c93a5 {

public static void f1736(moom.gF receiver, java.lang.String p0, java.lang.String p1) throws Throwable {
    moom.DT life3_5;
    if ((__call1736_0(p0) >= 1)) {
        life3_5 = null;
        if ((__fieldRead1736_2(__fieldRead1736_1(receiver)) != null)) {
        if ((__fieldRead1736_5(__fieldRead1736_4(__fieldRead1736_3(receiver))) == __fieldRead1736_6())) {
        life3_5 = __call1736_9(__fieldRead1736_8(__fieldRead1736_7(receiver)));
    }
    }
        __call1736_13(__fieldRead1736_12(__fieldRead1736_11(__fieldRead1736_10(receiver))), new moom.zn(p0, life3_5));
        __fieldWrite1736_14(receiver, 1);
    }
    return;
}
public static void h1736_0(moom.Oo p0) throws Throwable {
    throw __call1173600_0(p0);
}
private static native int __call1736_0(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1736_1(moom.gF a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead1736_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1736_3(moom.gF a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead1736_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead1736_5(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead1736_6() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1736_7(moom.gF a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead1736_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DT __call1736_9(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1736_10(moom.gF a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1736_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead1736_12(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call1736_13(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zn a1) throws Throwable;
private static native void __fieldWrite1736_14(moom.gF a0, int a1) throws Throwable;
private static native java.lang.Exception __call1173600_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_99c9a99d7c3077835d1b(moom.gF a0, java.lang.String a1, boolean a2) throws E;
private static final class __SourceHandler_99c9a99d7c3077835d1b {

public static void f1737(moom.gF receiver, java.lang.String p0, boolean p1) throws Throwable {
    if (p1) {
        __call1737_1(__fieldRead1737_0(receiver), p0);
    } else {
        __call1737_3(__fieldRead1737_2(receiver), p0);
    }
    return;
}
public static void h1737_0(moom.Oo p0) throws Throwable {
    throw __call1173700_0(p0);
}
private static native moom.hJ __fieldRead1737_0(moom.gF a0) throws Throwable;
private static native void __call1737_1(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native moom.hJ __fieldRead1737_2(moom.gF a0) throws Throwable;
private static native void __call1737_3(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1173700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bc26d075c32ed26af797(moom.gF a0, java.lang.String[] a1) throws E;
private static final class __SourceHandler_bc26d075c32ed26af797 {

public static void f1035(moom.gF receiver, java.lang.String[] p0) throws Throwable {
    java.lang.String[] life2_10;
    int life3_13;
    int life4_15;
    java.lang.String life5_22;
    java.lang.String life2_48;
    java.lang.String life3_51;
    lexical_join_85: {
    lexical_join_76: {
    lexical_join_33: {
    if (!(__fieldRead1035_0(receiver))) {
        break lexical_join_85;
    }
    __fieldWrite1035_1(receiver, 0);
    __call1035_3(__fieldRead1035_2(receiver));
    life2_10 = p0;
    life3_13 = (life2_10).length;
    life4_15 = 0;
    lexical_cycle_16: while (true) {
    lexical_join_31: {
    if (!((life4_15 < life3_13))) {
        break lexical_join_33;
    }
    life5_22 = (life2_10)[life4_15];
    if (!((__call1035_4(life5_22) > 0))) {
        break lexical_join_31;
    }
    __call1035_6(__fieldRead1035_5(receiver), life5_22);
    }
    life4_15 += 1;
    continue lexical_cycle_16;
    }
    }
    life2_48 = __call1035_13(__call1035_8(__fieldRead1035_7(receiver)), __call1035_12(__fieldRead1035_9(receiver), -1, __call1035_11(__fieldRead1035_10(receiver)), 0));
    life3_51 = __call1035_14(p0);
    if (!((__call1035_15(life3_51) > 0))) {
        break lexical_join_76;
    }
    if (!((!__call1035_16(life2_48, life3_51)))) {
        break lexical_join_76;
    }
    __call1035_24(__fieldRead1035_17(receiver), (__call1035_21(__fieldRead1035_18(receiver), -1, __call1035_20(__fieldRead1035_19(receiver)), 0) - __call1035_23(__fieldRead1035_22(receiver))));
    __call1035_26(__fieldRead1035_25(receiver), life3_51);
    break lexical_join_85;
    }
    if (!((__call1035_28(__fieldRead1035_27(receiver)) > 0))) {
        break lexical_join_85;
    }
    __fieldWrite1035_29(receiver, 1);
    __call1035_30(receiver);
    }
    return;
}
public static void h1035_0(moom.Oo p0) throws Throwable {
    throw __call1103500_0(p0);
}
public static void h1035_1(moom.Oo p0) throws Throwable {
    throw __call1103501_0(p0);
}
public static void h1035_2(moom.Oo p0) throws Throwable {
    throw __call1103502_0(p0);
}
public static void h1035_3(moom.Oo p0) throws Throwable {
    throw __call1103503_0(p0);
}
private static native boolean __fieldRead1035_0(moom.gF a0) throws Throwable;
private static native void __fieldWrite1035_1(moom.gF a0, int a1) throws Throwable;
private static native java.util.List __fieldRead1035_2(moom.gF a0) throws Throwable;
private static native void __call1035_3(java.util.List a0) throws Throwable;
private static native int __call1035_4(java.lang.String a0) throws Throwable;
private static native java.util.List __fieldRead1035_5(moom.gF a0) throws Throwable;
private static native boolean __call1035_6(java.util.List a0, java.lang.String a1) throws Throwable;
private static native moom.hJ __fieldRead1035_7(moom.gF a0) throws Throwable;
private static native java.lang.String __call1035_8(moom.hJ a0) throws Throwable;
private static native moom.hJ __fieldRead1035_9(moom.gF a0) throws Throwable;
private static native moom.hJ __fieldRead1035_10(moom.gF a0) throws Throwable;
private static native int __call1035_11(moom.hJ a0) throws Throwable;
private static native int __call1035_12(moom.hJ a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.String __call1035_13(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call1035_14(java.lang.String[] a0) throws Throwable;
private static native int __call1035_15(java.lang.String a0) throws Throwable;
private static native boolean __call1035_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.hJ __fieldRead1035_17(moom.gF a0) throws Throwable;
private static native moom.hJ __fieldRead1035_18(moom.gF a0) throws Throwable;
private static native moom.hJ __fieldRead1035_19(moom.gF a0) throws Throwable;
private static native int __call1035_20(moom.hJ a0) throws Throwable;
private static native int __call1035_21(moom.hJ a0, int a1, int a2, int a3) throws Throwable;
private static native moom.hJ __fieldRead1035_22(moom.gF a0) throws Throwable;
private static native int __call1035_23(moom.hJ a0) throws Throwable;
private static native void __call1035_24(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead1035_25(moom.gF a0) throws Throwable;
private static native void __call1035_26(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead1035_27(moom.gF a0) throws Throwable;
private static native int __call1035_28(java.util.List a0) throws Throwable;
private static native void __fieldWrite1035_29(moom.gF a0, int a1) throws Throwable;
private static native void __call1035_30(moom.gF a0) throws Throwable;
private static native java.lang.Exception __call1103500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1103501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1103502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1103503_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f6afe912eb573713b786(moom.gF a0) throws E;
private static final class __SourceHandler_f6afe912eb573713b786 {

public static void f100111(moom.gF receiver) throws Throwable {
    long life1_3;
    int life3_7;
    forest_join_36: {
    forest_join_30: {
    forest_join_20: {
    forest_join_15: {
    life1_3 = (__fieldRead100111_0() ^ 40085078117731L);
    __call100111_1(receiver);
    life3_7 = __call100111_2();
    if (!((life3_7 != 0))) {
        break forest_join_36;
    }
    if (!((life3_7 > 1))) {
        break forest_join_15;
    }
    life3_7 = 1;
    }
    if (!((life3_7 < -1))) {
        break forest_join_20;
    }
    life3_7 = -1;
    }
    if (!((!__call100111_3()))) {
        break forest_join_30;
    }
    life3_7 = (life3_7 * __invokedynamic100111_4(8871, (6270048079824422791L ^ life1_3)));
    }
    __call100111_8(__call100111_7(__fieldRead100111_6(__fieldRead100111_5(receiver))), life3_7);
    }
    return;
}
public static void h100111_0(java.io.IOException p0) throws Throwable {
    throw __call13011100_0(p0);
}
private static native long __fieldRead100111_0() throws Throwable;
private static native void __call100111_1(moom.gF a0) throws Throwable;
private static native int __call100111_2() throws Throwable;
private static native boolean __call100111_3() throws Throwable;
private static native int __invokedynamic100111_4(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100111_5(moom.gF a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead100111_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call100111_7(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call100111_8(moom.gB a0, int a1) throws Throwable;
private static native java.lang.Exception __call13011100_0(java.io.IOException a0) throws Throwable;

}


public void e() throws java.io.IOException { __sourceHandlerCall_f6afe912eb573713b786(this); }


public void c__Void() {
long local1_life2 = (moom.gF.F ^ 110457294448689L);
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(true)));
    this.A = ((int)(((java.util.List)(((moom.gB)(((net.minecraft.client.gui.GuiIngame)(((net.minecraft.client.Minecraft)(this.i)).T)).a__gB())).a__List())).size()));
    this.y = ((moom.hJ)(new moom.hJ(0, this.p, 4, (this.l - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite655_13(7175, (3071943557272493166L ^ local1_life2))), (this.k - 4), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite655_16(4673, (3604883633063350823L ^ local1_life2)))));
    ((moom.hJ)(this.y)).e(((int)(__sourceIntrinsic_7ac46ee229a8_originalDynamicSite655_20(2190, (8821952795306019051L ^ local1_life2)))));
    ((moom.hJ)(this.y)).a(((boolean)(false)));
    ((moom.hJ)(this.y)).b(((boolean)(true)));
    ((moom.hJ)(this.y)).a(((java.lang.String)(this.E)));
    ((moom.hJ)(this.y)).d(((boolean)(false)));
    return;
}


public void h() {
org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    ((moom.gB)(((net.minecraft.client.gui.GuiIngame)(((net.minecraft.client.Minecraft)(this.i)).T)).a__gB())).c__Void();
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7693_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4884;
      if (L[var3] == null) {
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
         long var5 = K[var3];
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
         Object[] var9 = (Object[])M.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               M.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gF", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         L[var3] = var15;
      }

      return L[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gF.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean a__Boolean() {
return ((0) != 0);
}


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_6a5620d8333d98ef4133(this, p0, p1, p2); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_e63f3d078d230e47fd22(this, p0, p1); }


private void a(java.lang.String p0, java.lang.String p1) { __sourceHandlerCall_6fc4e6829091ed0c93a5(this, p0, p1); }


public void a() { __sourceHandlerCall_293e5eff81e03e61f9b8(this); }


protected void a(java.lang.String p0, boolean p1) { __sourceHandlerCall_99c9a99d7c3077835d1b(this, p0, p1); }


public void a__sourceReturn_d00df7729d(int p0) { __sourceHandlerCall_f8e1b5df8574346ea493(this, p0); }


public void a(int p0, int p1, float p2) { __sourceHandlerCall_dbc5a6db6362b5a2c1ae(this, p0, p1, p2); }


public void a(java.lang.String[] p0) { __sourceHandlerCall_bc26d075c32ed26af797(this, p0); }


public void g() {
((moom.hJ)(this.y)).a__Void();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite655_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite655_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite655_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7693_0() throws E;
}
