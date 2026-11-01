package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiScreenResourcePacks extends net.minecraft.client.gui.GuiScreen {

private static org.apache.logging.log4j.Logger w;

private net.minecraft.client.gui.GuiScreen x;

private java.util.List<moom.oY> y;

private java.util.List<moom.oY> z;

private moom.h_ A;

private moom.ia B;

private boolean C;

private static long D;

private static long[] E;

private static java.lang.Integer[] F;

private static java.util.Map G;

public GuiScreenResourcePacks(net.minecraft.client.gui.GuiScreen p0) {
super();
    this.C = false;
    this.x = p0;
}


static {
D = ((long)(((moom._a)(moom._c.a(((long)(-6434591885752243800L)), ((long)(-7461595179343846103L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(197468345842690L)))));
    G = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiScreenResourcePacks.D ^ 60618136281362L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1785_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1785_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1785_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1785_14 = new byte[8];
    (__sourceSpill1785_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1785_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1785_16 = __sourceSpill1785_14;
    ((javax.crypto.Cipher)(__sourceSpill1785_11)).init(((int)(__sourceSpill1785_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1785_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1785_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[14];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¦|uÁ}ÙÂ7ÊÓÚ§»Ø7öó0ø·ìÏB\n3rÙ¶³âÿeKìØÉÔÛ=îBö\017è~4ÆÌ\006uØ²M\007'ü!\nÊ\002e\031Æ\023Ã@p<ÏÓ\"¦¿ª·x¾ÖW¹§lQ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1785_25 = local6_life21;
        int __sourceSpill1785_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1785_25)).substring(((int)(__sourceSpill1785_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1785_30 = local8_life19;
        int __sourceSpill1785_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1785_33 = new byte[8];
        (__sourceSpill1785_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1785_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1785_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1785_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1785_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1785_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1785_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1785_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1785_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1785_34)).doFinal(((byte[])(__sourceSpill1785_33)));
        (__sourceSpill1785_30)[__sourceSpill1785_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¿E¥7]ÏH¹ª%uÖ}<à"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1785_38 = local6_life21;
        int __sourceSpill1785_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1785_38)).substring(((int)(__sourceSpill1785_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1785_43 = local8_life19;
        int __sourceSpill1785_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1785_46 = new byte[8];
        (__sourceSpill1785_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1785_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1785_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1785_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1785_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1785_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1785_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1785_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1785_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1785_47)).doFinal(((byte[])(__sourceSpill1785_46)));
        (__sourceSpill1785_43)[__sourceSpill1785_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    E = ((long[])(local8_life19));
    F = ((java.lang.Integer[])(new java.lang.Integer[14]));
    w = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_3be201f9e2db9ec1f509(net.minecraft.client.gui.GuiScreenResourcePacks a0, moom.oY a1) throws E;
private static final class __SourceHandler_3be201f9e2db9ec1f509 {

public static java.util.List f2317(net.minecraft.client.gui.GuiScreenResourcePacks receiver, moom.oY p0) throws Throwable {
    return (__call2317_0(receiver, p0) ? __fieldRead2317_1(receiver) : __fieldRead2317_2(receiver));
}
public static void h2317_0(moom.Oo p0) throws Throwable {
    throw __call1231700_0(p0);
}
private static native boolean __call2317_0(net.minecraft.client.gui.GuiScreenResourcePacks a0, moom.oY a1) throws Throwable;
private static native java.util.List __fieldRead2317_1(net.minecraft.client.gui.GuiScreenResourcePacks a0) throws Throwable;
private static native java.util.List __fieldRead2317_2(net.minecraft.client.gui.GuiScreenResourcePacks a0) throws Throwable;
private static native java.lang.Exception __call1231700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_23c26a46a1998259e7c5(net.minecraft.client.gui.GuiScreenResourcePacks a0, moom.gc a1) throws E;
private static final class __SourceHandler_23c26a46a1998259e7c5 {

public static void f565(net.minecraft.client.gui.GuiScreenResourcePacks receiver, moom.gc p0) throws Throwable {
    java.lang.Runtime spill565_0;
    java.lang.String[] spill565_1;
    java.lang.String[] spill565_2;
    java.lang.String spill565_3;
    java.lang.Object[] spill565_4;
    java.lang.Class spill565_5;
    java.lang.String spill565_6;
    java.lang.Class[] spill565_7;
    java.lang.reflect.Method spill565_8;
    java.lang.Object spill565_9;
    java.lang.Object[] spill565_10;
    java.io.File life2_12;
    java.lang.String life3_15;
    java.lang.String life4_47;
    int life4_54;
    java.lang.Class life5_57;
    java.lang.Object life6_67;
    java.util.ArrayList life2_108;
    java.util.Iterator life3_112;
    moom.oY life4_119;
    java.util.Iterator life3_150;
    net.minecraft.client.resources.ResourcePackRepository$Entry life4_157;
    forest_join_186: {
    forest_join_181: {
    forest_join_174: {
    forest_join_126: {
    forest_join_96: {
    forest_join_95: {
    forest_join_52: {
    forest_join_35: {
    if (!(__fieldRead565_0(p0))) {
        break forest_join_186;
    }
    if (!((__fieldRead565_1(p0) == 2))) {
        break forest_join_96;
    }
    life2_12 = __call565_4(__call565_3(__fieldRead565_2(receiver)));
    life3_15 = __call565_5(life2_12);
    if (!((__call565_6() == __fieldRead565_7()))) {
        break forest_join_35;
    }
    __call565_9(__fieldRead565_8(), life3_15);
    spill565_0 = __call565_10();
    java.lang.String[] __stackOp565_11_0 = new java.lang.String[2];
    spill565_1 = __stackOp565_11_0;
    (__stackOp565_11_0)[0] = "/usr/bin/open";
    java.lang.String[] __stackOp565_12_0 = spill565_1;
    spill565_2 = __stackOp565_12_0;
    (__stackOp565_12_0)[1] = life3_15;
    __call565_13(spill565_0, spill565_2);
    return;
    }
    if (!((__call565_14() == __fieldRead565_15()))) {
        break forest_join_52;
    }
    spill565_3 = "cmd.exe /C start \"Open file\" \"%s\"";
    java.lang.Object[] __stackOp565_16_0 = new java.lang.Object[1];
    spill565_4 = __stackOp565_16_0;
    (__stackOp565_16_0)[0] = life3_15;
    life4_47 = __call565_17(spill565_3, spill565_4);
    __call565_19(__call565_18(), life4_47);
    return;
    }
    life4_54 = 0;
    life5_57 = __call565_20("java.awt.Desktop");
    life6_67 = __call565_22(__call565_21(life5_57, "getDesktop", new java.lang.Class[0]), null, new java.lang.Object[0]);
    spill565_5 = life5_57;
    spill565_6 = "browse";
    java.lang.Class[] __stackOp565_23_0 = new java.lang.Class[1];
    spill565_7 = __stackOp565_23_0;
    (__stackOp565_23_0)[0] = __classLiteral565_24();
    spill565_8 = __call565_25(spill565_5, spill565_6, spill565_7);
    spill565_9 = life6_67;
    java.lang.Object[] __stackOp565_26_0 = new java.lang.Object[1];
    spill565_10 = __stackOp565_26_0;
    (__stackOp565_26_0)[0] = __call565_27(life2_12);
    __call565_28(spill565_8, spill565_9, spill565_10);
    if (!((life4_54 != 0))) {
        break forest_join_95;
    }
    __call565_30(__fieldRead565_29(), "Opening via system class!");
    __call565_32(__invokedynamic565_31(life3_15));
    }
    break forest_join_186;
    }
    if (!((__fieldRead565_33(p0) == 1))) {
        break forest_join_186;
    }
    if (!(__fieldRead565_34(receiver))) {
        break forest_join_181;
    }
    life2_108 = __call565_35();
    life3_112 = __call565_37(__fieldRead565_36(receiver));
    forest_cycle_109: while (true) {
    forest_join_125: {
    if (!(__call565_38(life3_112))) {
        break forest_join_126;
    }
    life4_119 = __cast565_40(__call565_39(life3_112));
    if (!((__instanceOf565_41(life4_119) != 0))) {
        break forest_join_125;
    }
    __call565_44(life2_108, __call565_43(__cast565_42(life4_119)));
    }
    continue forest_cycle_109;
    }
    }
    __call565_45(life2_108);
    __call565_48(__call565_47(__fieldRead565_46(receiver)), life2_108);
    __call565_52(__fieldRead565_51(__fieldRead565_50(__fieldRead565_49(receiver))));
    __call565_56(__fieldRead565_55(__fieldRead565_54(__fieldRead565_53(receiver))));
    life3_150 = __call565_57(life2_108);
    forest_cycle_146: while (true) {
    forest_join_173: {
    if (!(__call565_58(life3_150))) {
        break forest_join_174;
    }
    life4_157 = __cast565_60(__call565_59(life3_150));
    __call565_65(__fieldRead565_63(__fieldRead565_62(__fieldRead565_61(receiver))), __call565_64(life4_157));
    if (!((__call565_66(life4_157) != 1))) {
        break forest_join_173;
    }
    __call565_71(__fieldRead565_69(__fieldRead565_68(__fieldRead565_67(receiver))), __call565_70(life4_157));
    }
    continue forest_cycle_146;
    }
    }
    __call565_74(__fieldRead565_73(__fieldRead565_72(receiver)));
    __call565_76(__fieldRead565_75(receiver));
    }
    __call565_79(__fieldRead565_77(receiver), __fieldRead565_78(receiver));
    }
    return;
}
public static void h565_0(java.io.IOException p0) throws Throwable {
    throw __call3056500_0(p0);
}
public static void h565_1(moom.Oo p0) throws Throwable {
    throw __call3056501_0(p0);
}
public static void h565_2(java.io.IOException p0, java.io.File p1, java.lang.String p2, int p3) throws Throwable {
    java.lang.Class spill3056502_0;
    java.lang.String spill3056502_1;
    java.lang.Class[] spill3056502_2;
    java.lang.reflect.Method spill3056502_3;
    java.lang.Object spill3056502_4;
    java.lang.Object[] spill3056502_5;
    java.io.IOException life3_2;
    int life3_9;
    java.lang.Class life4_12;
    java.lang.Object life5_22;
    forest_join_49: {
    life3_2 = p0;
    __call3056502_1(__fieldRead3056502_0(), "Couldn't open file", life3_2);
    life3_9 = 0;
    life4_12 = __call3056502_2("java.awt.Desktop");
    life5_22 = __call3056502_4(__call3056502_3(life4_12, "getDesktop", new java.lang.Class[0]), null, new java.lang.Object[0]);
    spill3056502_0 = life4_12;
    spill3056502_1 = "browse";
    java.lang.Class[] __stackOp3056502_5_0 = new java.lang.Class[1];
    spill3056502_2 = __stackOp3056502_5_0;
    (__stackOp3056502_5_0)[0] = __classLiteral3056502_6();
    spill3056502_3 = __call3056502_7(spill3056502_0, spill3056502_1, spill3056502_2);
    spill3056502_4 = life5_22;
    java.lang.Object[] __stackOp3056502_8_0 = new java.lang.Object[1];
    spill3056502_5 = __stackOp3056502_8_0;
    (__stackOp3056502_8_0)[0] = __call3056502_9(p1);
    __call3056502_10(spill3056502_3, spill3056502_4, spill3056502_5);
    if (!((life3_9 != 0))) {
        break forest_join_49;
    }
    __call3056502_12(__fieldRead3056502_11(), "Opening via system class!");
    __call3056502_14(__invokedynamic3056502_13(p2));
    }
    return;
}
public static void h565_3(java.io.IOException p0, java.io.File p1, java.lang.String p2, int p3) throws Throwable {
    java.lang.Class spill3056503_0;
    java.lang.String spill3056503_1;
    java.lang.Class[] spill3056503_2;
    java.lang.reflect.Method spill3056503_3;
    java.lang.Object spill3056503_4;
    java.lang.Object[] spill3056503_5;
    java.io.IOException life4_2;
    int life3_8;
    java.lang.Class life4_11;
    java.lang.Object life5_21;
    forest_join_49: {
    life4_2 = p0;
    __call3056503_1(__fieldRead3056503_0(), "Couldn't open file", life4_2);
    life3_8 = 0;
    life4_11 = __call3056503_2("java.awt.Desktop");
    life5_21 = __call3056503_4(__call3056503_3(life4_11, "getDesktop", new java.lang.Class[0]), null, new java.lang.Object[0]);
    spill3056503_0 = life4_11;
    spill3056503_1 = "browse";
    java.lang.Class[] __stackOp3056503_5_0 = new java.lang.Class[1];
    spill3056503_2 = __stackOp3056503_5_0;
    (__stackOp3056503_5_0)[0] = __classLiteral3056503_6();
    spill3056503_3 = __call3056503_7(spill3056503_0, spill3056503_1, spill3056503_2);
    spill3056503_4 = life5_21;
    java.lang.Object[] __stackOp3056503_8_0 = new java.lang.Object[1];
    spill3056503_5 = __stackOp3056503_8_0;
    (__stackOp3056503_8_0)[0] = __call3056503_9(p1);
    __call3056503_10(spill3056503_3, spill3056503_4, spill3056503_5);
    if (!((life3_8 != 0))) {
        break forest_join_49;
    }
    __call3056503_12(__fieldRead3056503_11(), "Opening via system class!");
    __call3056503_14(__invokedynamic3056503_13(p2));
    }
    return;
}
public static void h565_4(java.lang.Throwable p0, java.lang.String p1, int p2) throws Throwable {
    java.lang.Throwable life3_2;
    int life2_8;
    forest_join_17: {
    life3_2 = p0;
    __call3056504_1(__fieldRead3056504_0(), "Couldn't open link", life3_2);
    life2_8 = 1;
    if (!((life2_8 != 0))) {
        break forest_join_17;
    }
    __call3056504_3(__fieldRead3056504_2(), "Opening via system class!");
    __call3056504_5(__invokedynamic3056504_4(p1));
    }
    return;
}
public static void h565_5(java.io.IOException p0) throws Throwable {
    throw __call3056505_0(p0);
}
public static void h565_6(java.io.IOException p0) throws Throwable {
    throw __call3056506_0(p0);
}
public static void h565_7(java.io.IOException p0) throws Throwable {
    throw __call3056507_0(p0);
}
public static void h565_8(java.io.IOException p0) throws Throwable {
    throw __call3056508_0(p0);
}
private static native boolean __fieldRead565_0(moom.gc a0) throws Throwable;
private static native int __fieldRead565_1(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead565_2(net.minecraft.client.gui.GuiScreenResourcePacks a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __call565_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.io.File __call565_4(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.lang.String __call565_5(java.io.File a0) throws Throwable;
private static native net.minecraft.util.Util$EnumOS __call565_6() throws Throwable;
private static native net.minecraft.util.Util$EnumOS __fieldRead565_7() throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead565_8() throws Throwable;
private static native void __call565_9(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Runtime __call565_10() throws Throwable;
private static native java.lang.Process __call565_13(java.lang.Runtime a0, java.lang.String[] a1) throws Throwable;
private static native net.minecraft.util.Util$EnumOS __call565_14() throws Throwable;
private static native net.minecraft.util.Util$EnumOS __fieldRead565_15() throws Throwable;
private static native java.lang.String __call565_17(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Runtime __call565_18() throws Throwable;
private static native java.lang.Process __call565_19(java.lang.Runtime a0, java.lang.String a1) throws Throwable;
private static native java.lang.Class __call565_20(java.lang.String a0) throws Throwable;
private static native java.lang.reflect.Method __call565_21(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call565_22(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Class __classLiteral565_24() throws Throwable;
private static native java.lang.reflect.Method __call565_25(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.net.URI __call565_27(java.io.File a0) throws Throwable;
private static native java.lang.Object __call565_28(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead565_29() throws Throwable;
private static native void __call565_30(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic565_31(java.lang.String a0) throws Throwable;
private static native boolean __call565_32(java.lang.String a0) throws Throwable;
private static native int __fieldRead565_33(moom.gc a0) throws Throwable;
private static native boolean __fieldRead565_34(net.minecraft.client.gui.GuiScreenResourcePacks a0) throws Throwable;
private static native java.util.ArrayList __call565_35() throws Throwable;
private static native java.util.List __fieldRead565_36(net.minecraft.client.gui.GuiScreenResourcePacks a0) throws Throwable;
private static native java.util.Iterator __call565_37(java.util.List a0) throws Throwable;
private static native boolean __call565_38(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call565_39(java.util.Iterator a0) throws Throwable;
private static native moom.oY __cast565_40(java.lang.Object a0) throws Throwable;
private static native int __instanceOf565_41(moom.oY a0) throws Throwable;
private static native moom.o0 __cast565_42(moom.oY a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository$Entry __call565_43(moom.o0 a0) throws Throwable;
private static native boolean __call565_44(java.util.ArrayList a0, net.minecraft.client.resources.ResourcePackRepository$Entry a1) throws Throwable;
private static native void __call565_45(java.util.ArrayList a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead565_46(net.minecraft.client.gui.GuiScreenResourcePacks a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __call565_47(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call565_48(net.minecraft.client.resources.ResourcePackRepository a0, java.util.ArrayList a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead565_49(net.minecraft.client.gui.GuiScreenResourcePacks a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead565_50(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead565_51(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call565_52(java.util.List a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead565_53(net.minecraft.client.gui.GuiScreenResourcePacks a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead565_54(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead565_55(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call565_56(java.util.List a0) throws Throwable;
private static native java.util.Iterator __call565_57(java.util.ArrayList a0) throws Throwable;
private static native boolean __call565_58(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call565_59(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository$Entry __cast565_60(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead565_61(net.minecraft.client.gui.GuiScreenResourcePacks a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead565_62(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead565_63(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.String __call565_64(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native boolean __call565_65(java.util.List a0, java.lang.String a1) throws Throwable;
private static native int __call565_66(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead565_67(net.minecraft.client.gui.GuiScreenResourcePacks a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead565_68(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead565_69(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.String __call565_70(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native boolean __call565_71(java.util.List a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead565_72(net.minecraft.client.gui.GuiScreenResourcePacks a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead565_73(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call565_74(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead565_75(net.minecraft.client.gui.GuiScreenResourcePacks a0) throws Throwable;
private static native void __call565_76(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead565_77(net.minecraft.client.gui.GuiScreenResourcePacks a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead565_78(net.minecraft.client.gui.GuiScreenResourcePacks a0) throws Throwable;
private static native void __call565_79(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native java.lang.Exception __call3056500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3056501_0(moom.Oo a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3056504_0() throws Throwable;
private static native void __call3056504_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3056504_2() throws Throwable;
private static native void __call3056504_3(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic3056504_4(java.lang.String a0) throws Throwable;
private static native boolean __call3056504_5(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call3056505_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3056506_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3056507_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3056508_0(java.io.IOException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3056502_0() throws Throwable;
private static native void __call3056502_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.io.IOException a2) throws Throwable;
private static native java.lang.Class __call3056502_2(java.lang.String a0) throws Throwable;
private static native java.lang.reflect.Method __call3056502_3(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call3056502_4(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Class __classLiteral3056502_6() throws Throwable;
private static native java.lang.reflect.Method __call3056502_7(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.net.URI __call3056502_9(java.io.File a0) throws Throwable;
private static native java.lang.Object __call3056502_10(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3056502_11() throws Throwable;
private static native void __call3056502_12(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic3056502_13(java.lang.String a0) throws Throwable;
private static native boolean __call3056502_14(java.lang.String a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3056503_0() throws Throwable;
private static native void __call3056503_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.io.IOException a2) throws Throwable;
private static native java.lang.Class __call3056503_2(java.lang.String a0) throws Throwable;
private static native java.lang.reflect.Method __call3056503_3(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call3056503_4(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Class __classLiteral3056503_6() throws Throwable;
private static native java.lang.reflect.Method __call3056503_7(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.net.URI __call3056503_9(java.io.File a0) throws Throwable;
private static native java.lang.Object __call3056503_10(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3056503_11() throws Throwable;
private static native void __call3056503_12(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic3056503_13(java.lang.String a0) throws Throwable;
private static native boolean __call3056503_14(java.lang.String a0) throws Throwable;

}


public java.util.List<moom.oY> b() {
return this.z;
}


protected void b(int p0, int p1, int p2) {
super.b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void e() throws java.io.IOException {
super.e();
    ((moom.ia)(this.B)).c__Void();
    ((moom.h_)(this.A)).c__Void();
    return;
}


public void c__Void() {
long life1_3;
    net.minecraft.client.resources.ResourcePackRepository life3_72;
    java.util.ArrayList life4_78;
    java.util.Iterator life5_86;
    net.minecraft.client.resources.ResourcePackRepository$Entry life6_93;
    java.util.Iterator life5_108;
    net.minecraft.client.resources.ResourcePackRepository$Entry life6_115;
    life1_3 = (net.minecraft.client.gui.GuiScreenResourcePacks.D ^ 49890087680425L);
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gi(2, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_3(25614, (5747159787222606587L ^ life1_3))), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_5(2122, (9122011489221660337L ^ life1_3))), moom.oO.a(((java.lang.String)("resourcePack.openFolder")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gi(1, ((this.k / 2) + 4), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_11(20266, (3379600318625679836L ^ life1_3))), moom.oO.a(((java.lang.String)("gui.done")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    if ((!this.C)) {
        this.y = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
        this.z = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
        life3_72 = ((net.minecraft.client.Minecraft)(this.i)).a__o1();
        ((net.minecraft.client.resources.ResourcePackRepository)(life3_72)).b__Void();
        life4_78 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(((net.minecraft.client.resources.ResourcePackRepository)(life3_72)).b())));
        ((java.util.List)(life4_78)).removeAll(((java.util.Collection)(((net.minecraft.client.resources.ResourcePackRepository)(life3_72)).c())));
        life5_86 = ((java.util.List)(life4_78)).iterator();
        while (((java.util.Iterator)(life5_86)).hasNext()) {
        life6_93 = ((net.minecraft.client.resources.ResourcePackRepository$Entry)(((java.util.Iterator)(life5_86)).next()));
        ((java.util.List)(this.y)).add(((java.lang.Object)(new moom.o0(this, life6_93))));
    }
        life5_108 = ((java.util.List)(com.google.common.collect.Lists.reverse(((java.util.List)(((net.minecraft.client.resources.ResourcePackRepository)(life3_72)).c()))))).iterator();
        while (((java.util.Iterator)(life5_108)).hasNext()) {
        life6_115 = ((net.minecraft.client.resources.ResourcePackRepository$Entry)(((java.util.Iterator)(life5_108)).next()));
        ((java.util.List)(this.z)).add(((java.lang.Object)(new moom.o0(this, life6_115))));
    }
        ((java.util.List)(this.z)).add(((java.lang.Object)(new moom.oZ(this))));
    }
    this.A = ((moom.h_)(new moom.h_(this.i, __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_43(30483, (3892607405685354979L ^ life1_3)), this.l, this.y)));
    ((moom.h_)(this.A)).b(((int)((((this.k / 2) - 4) - __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_49(32292, (2849644829700470997L ^ life1_3))))));
    ((moom.h_)(this.A)).c(((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic8472_52(23353, (8712712806349807045L ^ life1_3)))), ((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic8472_53(13507, (6201899396367938107L ^ life1_3)))));
    this.B = ((moom.ia)(new moom.ia(this.i, __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_56(32292, (2849644829700470997L ^ life1_3)), this.l, this.z)));
    ((moom.ia)(this.B)).b(((int)(((this.k / 2) + 4))));
    ((moom.ia)(this.B)).c(((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic8472_64(22632, (4227692278477430417L ^ life1_3)))), ((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic8472_65(32059, (4817706180570692550L ^ life1_3)))));
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a__Void() {
this.C = ((boolean)(true));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5515;
      if (F[var3] == null) {
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
         long var5 = E[var3];
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
         Object[] var9 = (Object[])G.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               G.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/g5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         F[var3] = var15;
      }

      return F[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiScreenResourcePacks.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10375_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/g5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(moom.oY p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.List)(this.z)).contains(((java.lang.Object)(p0))))) != 0);
}


public java.util.List<moom.oY> a(moom.oY p0) { return __sourceHandlerCall_3be201f9e2db9ec1f509(this, p0); }


public java.util.List<moom.oY> a() {
return this.y;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_23c26a46a1998259e7c5(this, p0); }


protected void a(int p0, int p1, int p2) throws java.io.IOException {
super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    ((moom.h_)(this.A)).a__Boolean(((int)(p0)), ((int)(p1)), ((int)(p2)));
    ((moom.ia)(this.B)).a__Boolean(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void a(int p0, int p1, float p2) {
long local4 = (net.minecraft.client.gui.GuiScreenResourcePacks.D ^ 17606953516079L);
    ((net.minecraft.client.gui.GuiScreenResourcePacks)(this)).c(((int)(0)));
    ((moom.h_)(this.A)).a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    ((moom.ia)(this.B)).a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    ((net.minecraft.client.gui.GuiScreenResourcePacks)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("resourcePack.title")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1797_9(622, (5649905986517385503L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1797_10(24808, (8838045441240146842L ^ local4)))));
    ((net.minecraft.client.gui.GuiScreenResourcePacks)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("resourcePack.folderInfo")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)(((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1797_15(22876, (7669869101707368997L ^ local4))))), ((int)((this.l - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1797_17(12973, (1763330605846622677L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1797_18(7341, (6697012427015774161L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1797_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1797_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1797_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1797_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1797_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10375_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8472_65(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
