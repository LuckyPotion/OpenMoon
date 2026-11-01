package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiShareToLan extends net.minecraft.client.gui.GuiScreen {

private net.minecraft.client.gui.GuiScreen w;

private moom.gc x;

private moom.gc y;

private java.lang.String z;

private boolean A;

private static long B;

private static long[] C;

private static java.lang.Integer[] D;

private static java.util.Map E;

public GuiShareToLan(net.minecraft.client.gui.GuiScreen p0) {
super();
    this.z = "survival";
    this.w = p0;
}


static {
B = ((long)(((moom._a)(moom._c.a(((long)(3094046932391373427L)), ((long)(9114158008472450516L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(112931802628362L)))));
    E = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiShareToLan.B ^ 77716879227688L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1787_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1787_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1787_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1787_14 = new byte[8];
    (__sourceSpill1787_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1787_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1787_16 = __sourceSpill1787_14;
    ((javax.crypto.Cipher)(__sourceSpill1787_11)).init(((int)(__sourceSpill1787_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1787_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1787_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[22];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "t²\r:ËmP5\034¶¹Nì\005ü¯0÷8ê\030Ó¿÷\026\f{ªà\nçoJé,%áCß°&\033,÷ÇÜêO«Mï#\neÏ cL¹NáÎÌé·é\bc,\177L*È^gÇ»+©ìõZMÝÙÝÓzv¸\f÷å1\022´ä¢¬üå«Á%Çm0ØæUÝ}{|\003öÅ£¹4ekgÏÝÁ^þ\035£ ÛßE\004üi\nA£ÿ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1787_25 = local6_life21;
        int __sourceSpill1787_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1787_25)).substring(((int)(__sourceSpill1787_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1787_30 = local8_life19;
        int __sourceSpill1787_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1787_33 = new byte[8];
        (__sourceSpill1787_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1787_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1787_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1787_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1787_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1787_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1787_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1787_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1787_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1787_34)).doFinal(((byte[])(__sourceSpill1787_33)));
        (__sourceSpill1787_30)[__sourceSpill1787_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\fø²-\001Ï\fÞXQ\005q8Æ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1787_38 = local6_life21;
        int __sourceSpill1787_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1787_38)).substring(((int)(__sourceSpill1787_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1787_43 = local8_life19;
        int __sourceSpill1787_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1787_46 = new byte[8];
        (__sourceSpill1787_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1787_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1787_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1787_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1787_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1787_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1787_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1787_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1787_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1787_47)).doFinal(((byte[])(__sourceSpill1787_46)));
        (__sourceSpill1787_43)[__sourceSpill1787_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    C = ((long[])(local8_life19));
    D = ((java.lang.Integer[])(new java.lang.Integer[22]));
}

private static native <E extends Throwable> void __sourceHandlerCall_f48f16865ecd71e2e515(net.minecraft.client.gui.GuiShareToLan a0) throws E;
private static final class __SourceHandler_f48f16865ecd71e2e515 {

public static void f2321(net.minecraft.client.gui.GuiShareToLan receiver) throws Throwable {
    __fieldWrite2321_6(__fieldRead2321_0(receiver), __invokedynamic2321_5(__call2321_1("selectWorld.gameMode", new java.lang.Object[0]), __call2321_4(__invokedynamic2321_3(__fieldRead2321_2(receiver)), new java.lang.Object[0])));
    __fieldWrite2321_10(__fieldRead2321_7(receiver), __invokedynamic2321_9(__call2321_8("selectWorld.allowCommands", new java.lang.Object[0])));
    if (__fieldRead2321_11(receiver)) {
        __fieldWrite2321_17(__fieldRead2321_12(receiver), __invokedynamic2321_16(__fieldRead2321_14(__fieldRead2321_13(receiver)), __call2321_15("options.on", new java.lang.Object[0])));
    } else {
        __fieldWrite2321_23(__fieldRead2321_18(receiver), __invokedynamic2321_22(__fieldRead2321_20(__fieldRead2321_19(receiver)), __call2321_21("options.off", new java.lang.Object[0])));
    }
    return;
}
public static void h2321_0(moom.Oo p0) throws Throwable {
    throw __call1232100_0(p0);
}
private static native moom.gc __fieldRead2321_0(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native java.lang.String __call2321_1(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __fieldRead2321_2(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native java.lang.String __invokedynamic2321_3(java.lang.String a0) throws Throwable;
private static native java.lang.String __call2321_4(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic2321_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite2321_6(moom.gc a0, java.lang.String a1) throws Throwable;
private static native moom.gc __fieldRead2321_7(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native java.lang.String __call2321_8(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic2321_9(java.lang.String a0) throws Throwable;
private static native void __fieldWrite2321_10(moom.gc a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead2321_11(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native moom.gc __fieldRead2321_12(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native moom.gc __fieldRead2321_13(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native java.lang.String __fieldRead2321_14(moom.gc a0) throws Throwable;
private static native java.lang.String __call2321_15(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic2321_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite2321_17(moom.gc a0, java.lang.String a1) throws Throwable;
private static native moom.gc __fieldRead2321_18(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native moom.gc __fieldRead2321_19(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native java.lang.String __fieldRead2321_20(moom.gc a0) throws Throwable;
private static native java.lang.String __call2321_21(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic2321_22(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite2321_23(moom.gc a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1232100_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fda1ff2947312da1a62a(net.minecraft.client.gui.GuiShareToLan a0, moom.gc a1) throws E;
private static final class __SourceHandler_fda1ff2947312da1a62a {

public static void f567(net.minecraft.client.gui.GuiShareToLan receiver, moom.gc p0) throws Throwable {
    net.minecraft.client.gui.GuiShareToLan forestValue567_73_0;
    net.minecraft.client.gui.GuiShareToLan forestValue567_74_0;
    int forestValue567_74_1;
    net.minecraft.client.gui.GuiShareToLan spill567_0;
    moom.CN spill567_1;
    moom.CN spill567_2;
    java.lang.String spill567_3;
    java.lang.Object[] spill567_4;
    moom.CM spill567_5;
    long life2_3;
    java.lang.String life4_101;
    moom.CJ life5_114;
    forest_join_125: {
    forest_join_119: {
    forest_join_114: {
    forest_join_78: {
    forest_join_74: {
    forest_join_73: {
    forest_join_59: {
    forest_join_56: {
    forest_join_53: {
    forest_join_44: {
    forest_join_35: {
    forest_join_18: {
    life2_3 = (__fieldRead567_0() ^ 135868392147491L);
    if (!((__fieldRead567_1(p0) == __invokedynamic567_2(16574, (8056982621636029457L ^ life2_3))))) {
        break forest_join_18;
    }
    __call567_5(__fieldRead567_3(receiver), __fieldRead567_4(receiver));
    break forest_join_125;
    }
    if (!((__fieldRead567_6(p0) == __invokedynamic567_7(1542, (3350368727106398901L ^ life2_3))))) {
        break forest_join_59;
    }
    if (!(__call567_9(__fieldRead567_8(receiver), "spectator"))) {
        break forest_join_35;
    }
    __fieldWrite567_10(receiver, "creative");
    break forest_join_56;
    }
    if (!(__call567_12(__fieldRead567_11(receiver), "creative"))) {
        break forest_join_44;
    }
    __fieldWrite567_13(receiver, "adventure");
    break forest_join_56;
    }
    if (!(__call567_15(__fieldRead567_14(receiver), "adventure"))) {
        break forest_join_53;
    }
    __fieldWrite567_16(receiver, "survival");
    break forest_join_56;
    }
    __fieldWrite567_17(receiver, "spectator");
    }
    __call567_18(receiver);
    break forest_join_125;
    }
    if (!((__fieldRead567_19(p0) == __invokedynamic567_20(7321, (6354345458184138789L ^ life2_3))))) {
        break forest_join_78;
    }
    spill567_0 = receiver;
    if (!((!__fieldRead567_21(receiver)))) {
        forestValue567_73_0 = spill567_0;
        break forest_join_73;
    }
    forestValue567_74_0 = spill567_0;
    forestValue567_74_1 = 1;
    break forest_join_74;
    }
    forestValue567_74_0 = forestValue567_73_0;
    forestValue567_74_1 = 0;
    }
    __fieldWrite567_22(forestValue567_74_0, forestValue567_74_1);
    __call567_23(receiver);
    break forest_join_125;
    }
    if (!((__fieldRead567_24(p0) == __invokedynamic567_25(22359, (1215477066384964581L ^ life2_3))))) {
        break forest_join_125;
    }
    __call567_27(__fieldRead567_26(receiver), null);
    life4_101 = __call567_33(__call567_29(__fieldRead567_28(receiver)), __call567_31(__fieldRead567_30(receiver)), __fieldRead567_32(receiver));
    if (!((life4_101 != null))) {
        break forest_join_114;
    }
    moom.CN __stackOp567_35_0 = __sourceUninitializedNEW567_34();
    spill567_1 = __stackOp567_35_0;
    spill567_2 = __stackOp567_35_0;
    spill567_3 = "commands.publish.started";
    java.lang.Object[] __stackOp567_36_0 = new java.lang.Object[1];
    spill567_4 = __stackOp567_36_0;
    (__stackOp567_36_0)[0] = life4_101;
    __explicitNewInit567_37(spill567_2, spill567_3, spill567_4);
    life5_114 = spill567_1;
    break forest_join_119;
    }
    moom.CM __stackOp567_39_0 = __sourceUninitializedNEW567_38();
    spill567_5 = __stackOp567_39_0;
    __explicitNewInit567_40(__stackOp567_39_0, "commands.publish.failed");
    life5_114 = spill567_5;
    }
    __call567_44(__call567_43(__fieldRead567_42(__fieldRead567_41(receiver))), life5_114);
    }
    return;
}
public static void h567_0(java.io.IOException p0) throws Throwable {
    throw __call3056700_0(p0);
}
public static void h567_1(java.io.IOException p0) throws Throwable {
    throw __call3056701_0(p0);
}
public static void h567_2(java.io.IOException p0) throws Throwable {
    throw __call3056702_0(p0);
}
public static void h567_3(java.io.IOException p0) throws Throwable {
    throw __call3056703_0(p0);
}
public static void h567_4(java.io.IOException p0) throws Throwable {
    throw __call3056704_0(p0);
}
public static void h567_5(java.io.IOException p0) throws Throwable {
    throw __call3056705_0(p0);
}
public static void h567_6(java.io.IOException p0) throws Throwable {
    throw __call3056706_0(p0);
}
private static native long __fieldRead567_0() throws Throwable;
private static native int __fieldRead567_1(moom.gc a0) throws Throwable;
private static native int __invokedynamic567_2(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead567_3(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead567_4(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native void __call567_5(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native int __fieldRead567_6(moom.gc a0) throws Throwable;
private static native int __invokedynamic567_7(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead567_8(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native boolean __call567_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite567_10(net.minecraft.client.gui.GuiShareToLan a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead567_11(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native boolean __call567_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite567_13(net.minecraft.client.gui.GuiShareToLan a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead567_14(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native boolean __call567_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite567_16(net.minecraft.client.gui.GuiShareToLan a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite567_17(net.minecraft.client.gui.GuiShareToLan a0, java.lang.String a1) throws Throwable;
private static native void __call567_18(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native int __fieldRead567_19(moom.gc a0) throws Throwable;
private static native int __invokedynamic567_20(int a0, long a1) throws Throwable;
private static native boolean __fieldRead567_21(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native void __fieldWrite567_22(net.minecraft.client.gui.GuiShareToLan a0, int a1) throws Throwable;
private static native void __call567_23(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native int __fieldRead567_24(moom.gc a0) throws Throwable;
private static native int __invokedynamic567_25(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead567_26(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native void __call567_27(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead567_28(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __call567_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __fieldRead567_30(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call567_31(java.lang.String a0) throws Throwable;
private static native boolean __fieldRead567_32(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native java.lang.String __call567_33(net.minecraft.server.integrated.IntegratedServer a0, net.minecraft.world.WorldSettings$GameType a1, boolean a2) throws Throwable;
private static native moom.CN __sourceUninitializedNEW567_34() throws Throwable;
private static native void __explicitNewInit567_37(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native moom.CM __sourceUninitializedNEW567_38() throws Throwable;
private static native void __explicitNewInit567_40(moom.CM a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead567_41(net.minecraft.client.gui.GuiShareToLan a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead567_42(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call567_43(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call567_44(moom.gB a0, moom.CJ a1) throws Throwable;
private static native java.lang.Exception __call3056700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3056701_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3056702_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3056703_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3056704_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3056705_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3056706_0(java.io.IOException a0) throws Throwable;

}


public void c__Void() {
long life1_3;
    life1_3 = (net.minecraft.client.gui.GuiShareToLan.B ^ 61703629020098L);
    ((java.util.List)(this.m)).clear();
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic491_4(2579, (1872484602045642567L ^ life1_3)), ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic491_6(14381, (4007406762300015972L ^ life1_3))), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic491_8(2944, (8058205345944614604L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic491_9(32197, (198285163660066974L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic491_10(24196, (7747777565355566043L ^ life1_3)), moom.oO.a(((java.lang.String)("lanServer.start")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic491_14(17108, (7864248516838719388L ^ life1_3)), ((this.k / 2) + 5), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic491_17(26988, (7523760591647429692L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic491_18(9256, (5722083331479181689L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic491_19(18349, (8047187998147705595L ^ life1_3)), moom.oO.a(((java.lang.String)("gui.cancel")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    java.util.List spill491_0 = this.m;
    net.minecraft.client.gui.GuiShareToLan __stackOp491_30_0 = this;
    moom.gc __stackOp491_30_1 = new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic491_23(8363, (520623589940665843L ^ life1_3)), ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic491_25(29399, (4788351531873488770L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic491_26(21646, (6154099725513779671L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic491_27(9256, (5722083331479181689L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic491_28(18349, (8047187998147705595L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.gameMode")), ((java.lang.Object[])(new java.lang.Object[0]))));
    moom.gc spill491_1 = __stackOp491_30_1;
    ((net.minecraft.client.gui.GuiShareToLan)(__stackOp491_30_0)).y = ((moom.gc)(__stackOp491_30_1));
    ((java.util.List)(spill491_0)).add(((java.lang.Object)(spill491_1)));
    java.util.List spill491_2 = this.m;
    net.minecraft.client.gui.GuiShareToLan __stackOp491_40_0 = this;
    moom.gc __stackOp491_40_1 = new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic491_34(146, (7455392224269155784L ^ life1_3)), ((this.k / 2) + 5), __sourceIntrinsic_7ac46ee229a8_invokedynamic491_36(25105, (810130372474265436L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic491_37(9256, (5722083331479181689L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic491_38(18349, (8047187998147705595L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.allowCommands")), ((java.lang.Object[])(new java.lang.Object[0]))));
    moom.gc spill491_3 = __stackOp491_40_1;
    ((net.minecraft.client.gui.GuiShareToLan)(__stackOp491_40_0)).x = ((moom.gc)(__stackOp491_40_1));
    ((java.util.List)(spill491_2)).add(((java.lang.Object)(spill491_3)));
    ((net.minecraft.client.gui.GuiShareToLan)(this)).a();
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28202;
      if (D[var3] == null) {
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
         long var5 = C[var3];
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
         Object[] var9 = (Object[])E.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               E.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/g9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         D[var3] = var15;
      }

      return D[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiShareToLan.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10384_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/g9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1, float p2) {
long local4 = (net.minecraft.client.gui.GuiShareToLan.B ^ 5785289629252L);
    ((net.minecraft.client.gui.GuiShareToLan)(this)).i();
    ((net.minecraft.client.gui.GuiShareToLan)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("lanServer.title")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1802_5(24633, (6135337799861197025L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1802_6(3277, (2458367339589121047L ^ local4)))));
    ((net.minecraft.client.gui.GuiShareToLan)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("lanServer.otherPlayers")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1802_11(27505, (3405320576186930080L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1802_12(5509, (4664367970152230220L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_fda1ff2947312da1a62a(this, p0); }


private void a() { __sourceHandlerCall_f48f16865ecd71e2e515(this); }


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1802_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1802_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1802_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1802_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10384_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic491_38(int a0, long a1) throws E;
}
