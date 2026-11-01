package net.minecraft.client.gui.inventory;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiBeacon extends moom.hg {

private static org.apache.logging.log4j.Logger Z;

private static moom.DD aa;

public net.minecraft.inventory.IInventory ab;

private moom.gs ac;

private boolean ad;

private static long cb;

private static long[] fb;

private static java.lang.Integer[] pb;

private static java.util.Map qb;

public GuiBeacon(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.inventory.IInventory p1) { super((moom.v8)null); }

private static void __sourceConstructorBody_4063fe3c73d2eb5a(net.minecraft.client.gui.inventory.GuiBeacon receiver, net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.inventory.IInventory p1) throws Throwable {
long local3_life1 = (net.minecraft.client.gui.inventory.GuiBeacon.cb ^ 119102347356616L);
    net.minecraft.client.gui.inventory.GuiBeacon.__sourceConstructorInit_4063fe3c73d2eb5a_0(((net.minecraft.client.gui.inventory.GuiBeacon)(receiver)), ((moom.wa)(new moom.wa(p0, p1))));
    ((net.minecraft.client.gui.inventory.GuiBeacon)(receiver)).ab = ((net.minecraft.inventory.IInventory)(p1));
    ((net.minecraft.client.gui.inventory.GuiBeacon)(receiver)).x = ((int)(__sourceIntrinsic_4063fe3c73d2eb5a_originalDynamicSite1049_4(22342, (6814316539924831333L ^ local3_life1))));
    ((net.minecraft.client.gui.inventory.GuiBeacon)(receiver)).y = ((int)(__sourceIntrinsic_4063fe3c73d2eb5a_originalDynamicSite1049_6(2326, (2550415152726245922L ^ local3_life1))));
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(1031976389449023119L)), ((long)(-3977312658394148428L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(48862247400875L)))));
    qb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.inventory.GuiBeacon.cb ^ 82688174213389L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1793_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1793_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1793_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1793_14 = new byte[8];
    (__sourceSpill1793_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1793_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1793_16 = __sourceSpill1793_14;
    ((javax.crypto.Cipher)(__sourceSpill1793_11)).init(((int)(__sourceSpill1793_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1793_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1793_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[33];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÜÊY9´roNd\020D©I!\016AÍ¬?©è\001¦\bùlÎ\f^2\005pQê(:\000¿²§¬x,\031BfäHMúZ=íë\000+Á4¡\001~\0211+5\031Î­è]xêÜ9©Á\017k\026*ü\035lí+ö»5\006Y\022W\000V»^\007çF¡\030®\000Æß´Ãèk FHÅÍ3§6Ù=ã°\022cüÓKÜ\017\013g)ÍñÖ»pJuÖÎCR-»0B1Êìä¹\017LY¹\001.7\bü½î[NªJ®ñv^\007Q­\177°{d0`DÌ\023\022©\013Ñª`qkJ:Ó\037>j§H·×Wûøù:?«\nÝdG7EßòÒþ¿\030<\t"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1793_25 = local6_life21;
        int __sourceSpill1793_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1793_25)).substring(((int)(__sourceSpill1793_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1793_30 = local8_life19;
        int __sourceSpill1793_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1793_33 = new byte[8];
        (__sourceSpill1793_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1793_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1793_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1793_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1793_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1793_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1793_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1793_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1793_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1793_34)).doFinal(((byte[])(__sourceSpill1793_33)));
        (__sourceSpill1793_30)[__sourceSpill1793_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ó°\001T\037Ëqù^ý¶-UÃ»"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1793_38 = local6_life21;
        int __sourceSpill1793_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1793_38)).substring(((int)(__sourceSpill1793_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1793_43 = local8_life19;
        int __sourceSpill1793_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1793_46 = new byte[8];
        (__sourceSpill1793_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1793_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1793_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1793_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1793_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1793_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1793_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1793_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1793_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1793_47)).doFinal(((byte[])(__sourceSpill1793_46)));
        (__sourceSpill1793_43)[__sourceSpill1793_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    fb = ((long[])(local8_life19));
    pb = ((java.lang.Integer[])(new java.lang.Integer[33]));
    Z = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    aa = ((moom.DD)(new moom.DD("textures/gui/container/beacon.png")));
}

private static native <E extends Throwable> void __sourceConstructorInit_4063fe3c73d2eb5a_0(net.minecraft.client.gui.inventory.GuiBeacon a0, moom.wa a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_caeb6579facaba049d6c(net.minecraft.client.gui.inventory.GuiBeacon a0, moom.gc a1) throws E;
private static final class __SourceHandler_caeb6579facaba049d6c {

public static void f2338(net.minecraft.client.gui.inventory.GuiBeacon receiver, moom.gc p0) throws Throwable {
    long life2_3;
    java.lang.String life4_24;
    net.minecraft.network.PacketBuffer life5_29;
    int life4_73;
    int life5_81;
    int life6_89;
    life2_3 = (__fieldRead2338_0() ^ 64295768550709L);
    if ((__fieldRead2338_1(p0) == __invokedynamic2338_2(7900, (3583795464483885324L ^ life2_3)))) {
        __call2338_4(__fieldRead2338_3(receiver), null);
    } else {
        if ((__fieldRead2338_5(p0) == -1)) {
        life4_24 = "MC|Beacon";
        life5_29 = new net.minecraft.network.PacketBuffer(__call2338_6());
        __call2338_9(life5_29, __call2338_8(__fieldRead2338_7(receiver), 1));
        __call2338_12(life5_29, __call2338_11(__fieldRead2338_10(receiver), 2));
        __call2338_15(__call2338_14(__fieldRead2338_13(receiver)), new moom.zq(life4_24, life5_29));
        __call2338_17(__fieldRead2338_16(receiver), null);
    } else {
        if ((__instanceOf2338_18(p0) != 0)) {
        if (__call2338_20(__cast2338_19(p0))) {
        return;
    }
        life4_73 = __fieldRead2338_21(p0);
        life5_81 = (life4_73 & __invokedynamic2338_22(22853, (399660138008680079L ^ life2_3)));
        life6_89 = (life4_73 >> __invokedynamic2338_23(9579, (9039806644143352494L ^ life2_3)));
        if ((life6_89 < 3)) {
        __call2338_25(__fieldRead2338_24(receiver), 1, life5_81);
    } else {
        __call2338_27(__fieldRead2338_26(receiver), 2, life5_81);
    }
        __call2338_29(__fieldRead2338_28(receiver));
        __call2338_30(receiver);
        __call2338_31(receiver);
    }
    }
    }
    return;
}
public static void h2338_0(java.io.IOException p0) throws Throwable {
    throw __call1233800_0(p0);
}
public static void h2338_1(java.io.IOException p0) throws Throwable {
    throw __call1233801_0(p0);
}
public static void h2338_2(java.io.IOException p0) throws Throwable {
    throw __call1233802_0(p0);
}
public static void h2338_3(java.io.IOException p0) throws Throwable {
    throw __call1233803_0(p0);
}
private static native long __fieldRead2338_0() throws Throwable;
private static native int __fieldRead2338_1(moom.gc a0) throws Throwable;
private static native int __invokedynamic2338_2(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2338_3(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native void __call2338_4(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native int __fieldRead2338_5(moom.gc a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call2338_6() throws Throwable;
private static native net.minecraft.inventory.IInventory __fieldRead2338_7(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native int __call2338_8(net.minecraft.inventory.IInventory a0, int a1) throws Throwable;
private static native io.netty.buffer.ByteBuf __call2338_9(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native net.minecraft.inventory.IInventory __fieldRead2338_10(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native int __call2338_11(net.minecraft.inventory.IInventory a0, int a1) throws Throwable;
private static native io.netty.buffer.ByteBuf __call2338_12(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2338_13(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __call2338_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2338_15(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zq a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2338_16(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native void __call2338_17(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native int __instanceOf2338_18(moom.gc a0) throws Throwable;
private static native moom.gt __cast2338_19(moom.gc a0) throws Throwable;
private static native boolean __call2338_20(moom.gt a0) throws Throwable;
private static native int __fieldRead2338_21(moom.gc a0) throws Throwable;
private static native int __invokedynamic2338_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic2338_23(int a0, long a1) throws Throwable;
private static native net.minecraft.inventory.IInventory __fieldRead2338_24(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native void __call2338_25(net.minecraft.inventory.IInventory a0, int a1, int a2) throws Throwable;
private static native net.minecraft.inventory.IInventory __fieldRead2338_26(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native void __call2338_27(net.minecraft.inventory.IInventory a0, int a1, int a2) throws Throwable;
private static native java.util.List __fieldRead2338_28(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native void __call2338_29(java.util.List a0) throws Throwable;
private static native void __call2338_30(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native void __call2338_31(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native java.lang.Exception __call1233800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1233801_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1233802_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1233803_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e06340b8a5710ce54e0f(net.minecraft.client.gui.inventory.GuiBeacon a0, int a1, int a2) throws E;
private static final class __SourceHandler_e06340b8a5710ce54e0f {

public static void f570(net.minecraft.client.gui.inventory.GuiBeacon receiver, int p0, int p1) throws Throwable {
    long life3_3;
    java.util.Iterator life5_54;
    moom.gc life6_61;
    forest_join_77: {
    forest_join_67: {
    life3_3 = (__fieldRead570_0() ^ 104479598820985L);
    __call570_1();
    __call570_7(receiver, __fieldRead570_2(receiver), __call570_3("tile.beacon.primary", new java.lang.Object[0]), __invokedynamic570_4(29204, (7687841706849398430L ^ life3_3)), __invokedynamic570_5(936, (8882258163625369399L ^ life3_3)), __invokedynamic570_6(1724, (7065060262609328699L ^ life3_3)));
    __call570_13(receiver, __fieldRead570_8(receiver), __call570_9("tile.beacon.secondary", new java.lang.Object[0]), __invokedynamic570_10(20918, (5046325082507300131L ^ life3_3)), __invokedynamic570_11(6051, (1228476554989865772L ^ life3_3)), __invokedynamic570_12(10255, (4839854754896655501L ^ life3_3)));
    life5_54 = __call570_15(__fieldRead570_14(receiver));
    forest_cycle_55: while (true) {
    forest_join_66: {
    if (!(__call570_16(life5_54))) {
        break forest_join_77;
    }
    life6_61 = __cast570_18(__call570_17(life5_54));
    if (!(__call570_19(life6_61))) {
        break forest_join_66;
    }
    break forest_join_67;
    }
    continue forest_cycle_55;
    }
    }
    __call570_22(life6_61, (p0 - __fieldRead570_20(receiver)), (p1 - __fieldRead570_21(receiver)));
    }
    __call570_23();
    return;
}
public static void h570_0(moom.Oo p0) throws Throwable {
    throw __call3057000_0(p0);
}
private static native long __fieldRead570_0() throws Throwable;
private static native void __call570_1() throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead570_2(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native java.lang.String __call570_3(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __invokedynamic570_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic570_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic570_6(int a0, long a1) throws Throwable;
private static native void __call570_7(net.minecraft.client.gui.inventory.GuiBeacon a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead570_8(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native java.lang.String __call570_9(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __invokedynamic570_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic570_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic570_12(int a0, long a1) throws Throwable;
private static native void __call570_13(net.minecraft.client.gui.inventory.GuiBeacon a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native java.util.List __fieldRead570_14(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native java.util.Iterator __call570_15(java.util.List a0) throws Throwable;
private static native boolean __call570_16(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call570_17(java.util.Iterator a0) throws Throwable;
private static native moom.gc __cast570_18(java.lang.Object a0) throws Throwable;
private static native boolean __call570_19(moom.gc a0) throws Throwable;
private static native int __fieldRead570_20(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native int __fieldRead570_21(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native void __call570_22(moom.gc a0, int a1, int a2) throws Throwable;
private static native void __call570_23() throws Throwable;
private static native java.lang.Exception __call3057000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_70b28386c6ce1dc67bd5(net.minecraft.client.gui.inventory.GuiBeacon a0) throws E;
private static final class __SourceHandler_70b28386c6ce1dc67bd5 {

public static void f1333(net.minecraft.client.gui.inventory.GuiBeacon receiver) throws Throwable {
    moom.gs lexicalValue1333_317_0;
    moom.gs lexicalValue1333_318_0;
    int lexicalValue1333_318_1;
    moom.gs spill1333_0;
    long life1_3;
    int life3_10;
    int life4_15;
    int life5_20;
    int life6_33;
    int life7_41;
    int life8_55;
    int life9_57;
    int life10_67;
    moom.gt life11_119;
    int life6_148;
    int life7_155;
    int life8_169;
    int life9_171;
    int life10_183;
    moom.gt life11_227;
    moom.gt life9_300;
    lexical_join_318: {
    lexical_join_317: {
    lexical_join_306: {
    lexical_join_300: {
    lexical_join_240: {
    lexical_join_139: {
    life1_3 = (__fieldRead1333_0() ^ 18641056119423L);
    __call1333_1(receiver);
    life3_10 = __call1333_3(__fieldRead1333_2(receiver), 0);
    life4_15 = __call1333_5(__fieldRead1333_4(receiver), 1);
    life5_20 = __call1333_7(__fieldRead1333_6(receiver), 2);
    if (!(__fieldRead1333_8(receiver))) {
        break lexical_join_306;
    }
    if (!((life3_10 >= 0))) {
        break lexical_join_306;
    }
    __fieldWrite1333_9(receiver, 0);
    life6_33 = 0;
    lexical_cycle_31: while (true) {
    lexical_join_137: {
    if (!((life6_33 <= 2))) {
        break lexical_join_139;
    }
    life7_41 = ((__fieldRead1333_10())[life6_33]).length;
    life8_55 = ((life7_41 * __invokedynamic1333_11(21912, (238873162639625491L ^ life1_3))) + ((life7_41 - 1) * 2));
    life9_57 = 0;
    lexical_cycle_55: while (true) {
    lexical_join_135: {
    lexical_join_129: {
    if (!((life9_57 < life7_41))) {
        break lexical_join_137;
    }
    life10_67 = __fieldRead1333_13(((__fieldRead1333_12())[life6_33])[life9_57]);
    life11_119 = new moom.gt(receiver, ((life6_33 << __invokedynamic1333_14(15443, (6655427917759784153L ^ life1_3))) | life10_67), (((__fieldRead1333_15(receiver) + __invokedynamic1333_16(19468, (1886797780769920142L ^ life1_3))) + (life9_57 * __invokedynamic1333_17(24220, (8118879966234592770L ^ life1_3)))) - (life8_55 / 2)), ((__fieldRead1333_18(receiver) + __invokedynamic1333_19(21912, (238873162639625491L ^ life1_3))) + (life6_33 * __invokedynamic1333_20(29119, (3878878803511798058L ^ life1_3)))), life10_67, life6_33);
    __call1333_22(__fieldRead1333_21(receiver), life11_119);
    if (!((life6_33 >= life3_10))) {
        break lexical_join_129;
    }
    __fieldWrite1333_23(life11_119, 0);
    break lexical_join_135;
    }
    if (!((life10_67 == life4_15))) {
        break lexical_join_135;
    }
    __call1333_24(life11_119, 1);
    }
    life9_57 += 1;
    continue lexical_cycle_55;
    }
    }
    life6_33 += 1;
    continue lexical_cycle_31;
    }
    }
    life6_148 = 3;
    life7_155 = (((__fieldRead1333_25())[life6_148]).length + 1);
    life8_169 = ((life7_155 * __invokedynamic1333_26(21912, (238873162639625491L ^ life1_3))) + ((life7_155 - 1) * 2));
    life9_171 = 0;
    lexical_cycle_164: while (true) {
    lexical_join_238: {
    lexical_join_232: {
    if (!((life9_171 < (life7_155 - 1)))) {
        break lexical_join_240;
    }
    life10_183 = __fieldRead1333_28(((__fieldRead1333_27())[life6_148])[life9_171]);
    life11_227 = new moom.gt(receiver, ((life6_148 << __invokedynamic1333_29(15443, (6655427917759784153L ^ life1_3))) | life10_183), (((__fieldRead1333_30(receiver) + __invokedynamic1333_31(3417, (5457286995108074972L ^ life1_3))) + (life9_171 * __invokedynamic1333_32(28859, (8104815637110220838L ^ life1_3)))) - (life8_169 / 2)), (__fieldRead1333_33(receiver) + __invokedynamic1333_34(23367, (4252188306514658271L ^ life1_3))), life10_183, life6_148);
    __call1333_36(__fieldRead1333_35(receiver), life11_227);
    if (!((life6_148 >= life3_10))) {
        break lexical_join_232;
    }
    __fieldWrite1333_37(life11_227, 0);
    break lexical_join_238;
    }
    if (!((life10_183 == life5_20))) {
        break lexical_join_238;
    }
    __call1333_38(life11_227, 1);
    }
    life9_171 += 1;
    continue lexical_cycle_164;
    }
    }
    if (!((life4_15 > 0))) {
        break lexical_join_306;
    }
    life9_300 = new moom.gt(receiver, ((life6_148 << __invokedynamic1333_39(15443, (6655427917759784153L ^ life1_3))) | life4_15), (((__fieldRead1333_40(receiver) + __invokedynamic1333_41(10524, (3909778450774569357L ^ life1_3))) + ((life7_155 - 1) * __invokedynamic1333_42(28859, (8104815637110220838L ^ life1_3)))) - (life8_169 / 2)), (__fieldRead1333_43(receiver) + __invokedynamic1333_44(12167, (6923594359605802767L ^ life1_3))), life4_15, life6_148);
    __call1333_46(__fieldRead1333_45(receiver), life9_300);
    if (!((life6_148 >= life3_10))) {
        break lexical_join_300;
    }
    __fieldWrite1333_47(life9_300, 0);
    break lexical_join_306;
    }
    if (!((life4_15 == life5_20))) {
        break lexical_join_306;
    }
    __call1333_48(life9_300, 1);
    }
    spill1333_0 = __fieldRead1333_49(receiver);
    if (!((__call1333_51(__fieldRead1333_50(receiver), 0) != null))) {
        lexicalValue1333_317_0 = spill1333_0;
        break lexical_join_317;
    }
    if (!((life4_15 > 0))) {
        lexicalValue1333_317_0 = spill1333_0;
        break lexical_join_317;
    }
    lexicalValue1333_318_0 = spill1333_0;
    lexicalValue1333_318_1 = 1;
    break lexical_join_318;
    }
    lexicalValue1333_318_0 = lexicalValue1333_317_0;
    lexicalValue1333_318_1 = 0;
    }
    __fieldWrite1333_52(lexicalValue1333_318_0, lexicalValue1333_318_1);
    return;
}
public static void h1333_0(moom.Oo p0) throws Throwable {
    throw __call1133300_0(p0);
}
public static void h1333_1(moom.Oo p0) throws Throwable {
    throw __call1133301_0(p0);
}
public static void h1333_2(moom.Oo p0) throws Throwable {
    throw __call1133302_0(p0);
}
public static void h1333_3(moom.Oo p0) throws Throwable {
    throw __call1133303_0(p0);
}
public static void h1333_4(moom.Oo p0) throws Throwable {
    throw __call1133304_0(p0);
}
public static void h1333_5(moom.Oo p0) throws Throwable {
    throw __call1133305_0(p0);
}
public static void h1333_6(moom.Oo p0) throws Throwable {
    throw __call1133306_0(p0);
}
public static void h1333_7(moom.Oo p0) throws Throwable {
    throw __call1133307_0(p0);
}
public static void h1333_8(moom.Oo p0) throws Throwable {
    throw __call1133308_0(p0);
}
private static native long __fieldRead1333_0() throws Throwable;
private static native void __call1333_1(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native net.minecraft.inventory.IInventory __fieldRead1333_2(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native int __call1333_3(net.minecraft.inventory.IInventory a0, int a1) throws Throwable;
private static native net.minecraft.inventory.IInventory __fieldRead1333_4(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native int __call1333_5(net.minecraft.inventory.IInventory a0, int a1) throws Throwable;
private static native net.minecraft.inventory.IInventory __fieldRead1333_6(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native int __call1333_7(net.minecraft.inventory.IInventory a0, int a1) throws Throwable;
private static native boolean __fieldRead1333_8(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native void __fieldWrite1333_9(net.minecraft.client.gui.inventory.GuiBeacon a0, int a1) throws Throwable;
private static native net.minecraft.potion.Potion[][] __fieldRead1333_10() throws Throwable;
private static native int __invokedynamic1333_11(int a0, long a1) throws Throwable;
private static native net.minecraft.potion.Potion[][] __fieldRead1333_12() throws Throwable;
private static native int __fieldRead1333_13(net.minecraft.potion.Potion a0) throws Throwable;
private static native int __invokedynamic1333_14(int a0, long a1) throws Throwable;
private static native int __fieldRead1333_15(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native int __invokedynamic1333_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic1333_17(int a0, long a1) throws Throwable;
private static native int __fieldRead1333_18(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native int __invokedynamic1333_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic1333_20(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead1333_21(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native boolean __call1333_22(java.util.List a0, moom.gt a1) throws Throwable;
private static native void __fieldWrite1333_23(moom.gt a0, int a1) throws Throwable;
private static native void __call1333_24(moom.gt a0, int a1) throws Throwable;
private static native net.minecraft.potion.Potion[][] __fieldRead1333_25() throws Throwable;
private static native int __invokedynamic1333_26(int a0, long a1) throws Throwable;
private static native net.minecraft.potion.Potion[][] __fieldRead1333_27() throws Throwable;
private static native int __fieldRead1333_28(net.minecraft.potion.Potion a0) throws Throwable;
private static native int __invokedynamic1333_29(int a0, long a1) throws Throwable;
private static native int __fieldRead1333_30(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native int __invokedynamic1333_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic1333_32(int a0, long a1) throws Throwable;
private static native int __fieldRead1333_33(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native int __invokedynamic1333_34(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead1333_35(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native boolean __call1333_36(java.util.List a0, moom.gt a1) throws Throwable;
private static native void __fieldWrite1333_37(moom.gt a0, int a1) throws Throwable;
private static native void __call1333_38(moom.gt a0, int a1) throws Throwable;
private static native int __invokedynamic1333_39(int a0, long a1) throws Throwable;
private static native int __fieldRead1333_40(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native int __invokedynamic1333_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic1333_42(int a0, long a1) throws Throwable;
private static native int __fieldRead1333_43(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native int __invokedynamic1333_44(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead1333_45(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native boolean __call1333_46(java.util.List a0, moom.gt a1) throws Throwable;
private static native void __fieldWrite1333_47(moom.gt a0, int a1) throws Throwable;
private static native void __call1333_48(moom.gt a0, int a1) throws Throwable;
private static native moom.gs __fieldRead1333_49(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native net.minecraft.inventory.IInventory __fieldRead1333_50(net.minecraft.client.gui.inventory.GuiBeacon a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1333_51(net.minecraft.inventory.IInventory a0, int a1) throws Throwable;
private static native void __fieldWrite1333_52(moom.gs a0, int a1) throws Throwable;
private static native java.lang.Exception __call1133300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133308_0(moom.Oo a0) throws Throwable;

}


protected void b(int p0, int p1) { __sourceHandlerCall_e06340b8a5710ce54e0f(this, p0, p1); }


static void b(net.minecraft.client.gui.inventory.GuiBeacon p0, java.lang.String p1, int p2, int p3) {
((net.minecraft.client.gui.inventory.GuiBeacon)(p0)).a(((java.lang.String)(p1)), ((int)(p2)), ((int)(p3)));
    return;
}


static void c(net.minecraft.client.gui.inventory.GuiBeacon p0, java.lang.String p1, int p2, int p3) {
((net.minecraft.client.gui.inventory.GuiBeacon)(p0)).a(((java.lang.String)(p1)), ((int)(p2)), ((int)(p3)));
    return;
}


private static java.lang.Exception c(java.lang.Exception p0) {
return p0;
}


public void c__Void() {
long life1_3;
    life1_3 = (net.minecraft.client.gui.inventory.GuiBeacon.cb ^ 134098204130516L);
    super.c__Void();
    java.util.List spill492_0 = this.m;
    net.minecraft.client.gui.inventory.GuiBeacon __stackOp492_7_0 = this;
    moom.gs __stackOp492_7_1 = new moom.gs(this, -1, (this.A + __sourceIntrinsic_7ac46ee229a8_invokedynamic492_4(12027, (2321003401824006348L ^ life1_3))), (this.B + __sourceIntrinsic_7ac46ee229a8_invokedynamic492_6(10962, (7279539308592100599L ^ life1_3))));
    moom.gs spill492_1 = __stackOp492_7_1;
    ((net.minecraft.client.gui.inventory.GuiBeacon)(__stackOp492_7_0)).ac = ((moom.gs)(__stackOp492_7_1));
    ((java.util.List)(spill492_0)).add(((java.lang.Object)(spill492_1)));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gr(this, __sourceIntrinsic_7ac46ee229a8_invokedynamic492_11(18809, (3093783005683554125L ^ life1_3)), (this.A + __sourceIntrinsic_7ac46ee229a8_invokedynamic492_13(18270, (8632752812927490368L ^ life1_3))), (this.B + __sourceIntrinsic_7ac46ee229a8_invokedynamic492_15(2488, (1643713389565106078L ^ life1_3)))))));
    this.ad = ((boolean)(true));
    ((moom.gs)(this.ac)).m = ((boolean)(false));
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10423_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hl"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3401;
      if (pb[var3] == null) {
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
         long var5 = fb[var3];
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
         Object[] var9 = (Object[])qb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               qb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         pb[var3] = var15;
      }

      return pb[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.inventory.GuiBeacon.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_caeb6579facaba049d6c(this, p0); }


static void a(net.minecraft.client.gui.inventory.GuiBeacon p0, java.lang.String p1, int p2, int p3) {
((net.minecraft.client.gui.inventory.GuiBeacon)(p0)).a(((java.lang.String)(p1)), ((int)(p2)), ((int)(p3)));
    return;
}


protected void a(float p0, int p1, int p2) {
long local4 = (net.minecraft.client.gui.inventory.GuiBeacon.cb ^ 28792591553240L);
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.i)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.inventory.GuiBeacon.aa)));
    int local6 = ((this.k - this.x) / 2);
    int local7 = ((this.l - this.y) / 2);
    ((net.minecraft.client.gui.inventory.GuiBeacon)(this)).b(((int)(local6)), ((int)(local7)), ((int)(0)), ((int)(0)), ((int)(this.x)), ((int)(this.y)));
    ((net.minecraft.client.renderer.entity.RenderItem)(this.j)).d = ((float)(0x1.9p6f));
    ((net.minecraft.client.renderer.entity.RenderItem)(this.j)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bD))), ((int)((local6 + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_17(4148, (1876228508102860803L ^ local4))))), ((int)((local7 + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_18(24284, (5750615730895154921L ^ local4))))));
    ((net.minecraft.client.renderer.entity.RenderItem)(this.j)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.i))), ((int)(((local6 + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_22(7629, (3405799879960047084L ^ local4))) + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_23(5279, (3572673731242173631L ^ local4))))), ((int)((local7 + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_24(9068, (1679586580786647901L ^ local4))))));
    ((net.minecraft.client.renderer.entity.RenderItem)(this.j)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.k))), ((int)(((local6 + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_28(7629, (3405799879960047084L ^ local4))) + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_29(29189, (5470800381285188149L ^ local4))))), ((int)((local7 + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_30(9068, (1679586580786647901L ^ local4))))));
    ((net.minecraft.client.renderer.entity.RenderItem)(this.j)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.j))), ((int)(((local6 + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_34(7629, (3405799879960047084L ^ local4))) + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_35(2429, (769804459090524481L ^ local4))))), ((int)((local7 + __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_36(9068, (1679586580786647901L ^ local4))))));
    ((net.minecraft.client.renderer.entity.RenderItem)(this.j)).d = ((float)(0x0.0p0f));
    return;
}


public void g() { __sourceHandlerCall_70b28386c6ce1dc67bd5(this); }


private static native <E extends Throwable> int __sourceIntrinsic_4063fe3c73d2eb5a_originalDynamicSite1049_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4063fe3c73d2eb5a_originalDynamicSite1049_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_originalDynamicSite1807_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic492_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic492_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic492_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic492_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic492_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10423_0() throws E;
}
