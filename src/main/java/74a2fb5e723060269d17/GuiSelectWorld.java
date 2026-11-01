package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiSelectWorld extends net.minecraft.client.gui.GuiScreen implements net.minecraft.client.gui.GuiYesNoCallback {

private static org.apache.logging.log4j.Logger w;

private java.text.DateFormat x;

protected net.minecraft.client.gui.GuiScreen y;

protected java.lang.String z;

private boolean A;

private int B;

private java.util.List<moom.IQ> C;

private moom.id D;

private java.lang.String E;

private java.lang.String F;

private java.lang.String[] G;

private boolean H;

private moom.gc I;

private moom.gc J;

private moom.gc K;

private moom.gc L;

private static long M;

private static long[] N;

private static java.lang.Integer[] O;

private static java.util.Map P;

public GuiSelectWorld(net.minecraft.client.gui.GuiScreen p0) {
super();
    this.x = new java.text.SimpleDateFormat();
    this.z = "Select world";
    this.G = new java.lang.String[4];
    this.y = p0;
}


static {
M = ((long)(((moom._a)(moom._c.a(((long)(-8986538011647371920L)), ((long)(-2041635517301837148L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(94299243838331L)))));
    P = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiSelectWorld.M ^ 138841309635030L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1786_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1786_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1786_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1786_14 = new byte[8];
    (__sourceSpill1786_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1786_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1786_16 = __sourceSpill1786_14;
    ((javax.crypto.Cipher)(__sourceSpill1786_11)).init(((int)(__sourceSpill1786_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1786_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1786_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[19];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ï¶j^\b¼A#mk\0277\016\004oêå\022£YÄ&\030÷Ê®¿\035¹©\fê½ØQt¤KìUÄ\rÊE´Tt¶üq`ey¹èG<æ÷ÀÁåºwO\032ò2\037\031ÄF@%k~<54\027Gl\027Ç7>\007§$\016ªQ\026\177õBñ5\033{©\025£ÁÄMØÔw\036IeU\020ñ¾\002%"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1786_25 = local6_life21;
        int __sourceSpill1786_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1786_25)).substring(((int)(__sourceSpill1786_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1786_30 = local8_life19;
        int __sourceSpill1786_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1786_33 = new byte[8];
        (__sourceSpill1786_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1786_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1786_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1786_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1786_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1786_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1786_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1786_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1786_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1786_34)).doFinal(((byte[])(__sourceSpill1786_33)));
        (__sourceSpill1786_30)[__sourceSpill1786_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\t:ÕÑ$ %Ë¸Xàq"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1786_38 = local6_life21;
        int __sourceSpill1786_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1786_38)).substring(((int)(__sourceSpill1786_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1786_43 = local8_life19;
        int __sourceSpill1786_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1786_46 = new byte[8];
        (__sourceSpill1786_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1786_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1786_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1786_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1786_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1786_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1786_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1786_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1786_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1786_47)).doFinal(((byte[])(__sourceSpill1786_46)));
        (__sourceSpill1786_43)[__sourceSpill1786_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    N = ((long[])(local8_life19));
    O = ((java.lang.Integer[])(new java.lang.Integer[19]));
    w = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_0e76fa0127d98f9e36a3(net.minecraft.client.gui.GuiSelectWorld a0, boolean a1, int a2) throws E;
private static final class __SourceHandler_0e76fa0127d98f9e36a3 {

public static void f228(net.minecraft.client.gui.GuiSelectWorld receiver, boolean p0, int p1) throws Throwable {
    net.minecraft.world.storage.ISaveFormat life3_14;
    if (__fieldRead228_0(receiver)) {
        __fieldWrite228_1(receiver, 0);
        if (p0) {
        life3_14 = __call228_3(__fieldRead228_2(receiver));
        __call228_4(life3_14);
        __call228_6(life3_14, __call228_5(receiver, p1));
        __call228_7(receiver);
    }
        __call228_9(__fieldRead228_8(receiver), receiver);
    }
    return;
}
public static void h228_0(net.minecraft.client.AnvilConverterException p0) throws Throwable {
    throw __call2022800_0(p0);
}
public static void h228_1(net.minecraft.client.AnvilConverterException p0, net.minecraft.client.gui.GuiSelectWorld p1) throws Throwable {
    net.minecraft.client.AnvilConverterException local2 = p0;
    __call2022801_1(__fieldRead2022801_0(), "Couldn't load level list", local2);
    __call2022801_3(__fieldRead2022801_2(p1), p1);
    return;
}
private static native boolean __fieldRead228_0(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native void __fieldWrite228_1(net.minecraft.client.gui.GuiSelectWorld a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead228_2(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveFormat __call228_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call228_4(net.minecraft.world.storage.ISaveFormat a0) throws Throwable;
private static native java.lang.String __call228_5(net.minecraft.client.gui.GuiSelectWorld a0, int a1) throws Throwable;
private static native boolean __call228_6(net.minecraft.world.storage.ISaveFormat a0, java.lang.String a1) throws Throwable;
private static native void __call228_7(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead228_8(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native void __call228_9(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiSelectWorld a1) throws Throwable;
private static native java.lang.Exception __call2022800_0(net.minecraft.client.AnvilConverterException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2022801_0() throws Throwable;
private static native void __call2022801_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, net.minecraft.client.AnvilConverterException a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2022801_2(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native void __call2022801_3(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiSelectWorld a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_763a66e96da914afe08a(net.minecraft.client.gui.GuiSelectWorld a0, moom.gc a1) throws E;
private static final class __SourceHandler_763a66e96da914afe08a {

public static void f566(net.minecraft.client.gui.GuiSelectWorld receiver, moom.gc p0) throws Throwable {
    long life2_3;
    java.lang.String life4_16;
    moom.hb life5_27;
    net.minecraft.client.gui.GuiCreateWorld life4_95;
    net.minecraft.world.storage.ISaveHandler life5_105;
    net.minecraft.world.storage.WorldInfo life6_108;
    forest_join_122: {
    forest_join_118: {
    forest_join_82: {
    forest_join_73: {
    forest_join_53: {
    forest_join_41: {
    forest_join_32: {
    forest_join_31: {
    life2_3 = (__fieldRead566_0() ^ 33108353526509L);
    if (!(__fieldRead566_1(p0))) {
        break forest_join_122;
    }
    if (!((__fieldRead566_2(p0) == 2))) {
        break forest_join_32;
    }
    life4_16 = __call566_4(receiver, __fieldRead566_3(receiver));
    if (!((life4_16 != null))) {
        break forest_join_31;
    }
    __fieldWrite566_5(receiver, 1);
    life5_27 = __call566_7(receiver, life4_16, __fieldRead566_6(receiver));
    __call566_9(__fieldRead566_8(receiver), life5_27);
    }
    break forest_join_122;
    }
    if (!((__fieldRead566_10(p0) == 1))) {
        break forest_join_41;
    }
    __call566_12(receiver, __fieldRead566_11(receiver));
    break forest_join_122;
    }
    if (!((__fieldRead566_13(p0) == 3))) {
        break forest_join_53;
    }
    __call566_15(__fieldRead566_14(receiver), new net.minecraft.client.gui.GuiCreateWorld(receiver));
    break forest_join_122;
    }
    if (!((__fieldRead566_16(p0) == __invokedynamic566_17(10836, (1210764887641877323L ^ life2_3))))) {
        break forest_join_73;
    }
    __call566_21(__fieldRead566_18(receiver), new net.minecraft.client.gui.GuiRenameWorld(receiver, __call566_20(receiver, __fieldRead566_19(receiver))));
    break forest_join_122;
    }
    if (!((__fieldRead566_22(p0) == 0))) {
        break forest_join_82;
    }
    __call566_25(__fieldRead566_23(receiver), __fieldRead566_24(receiver));
    break forest_join_122;
    }
    if (!((__fieldRead566_26(p0) == __invokedynamic566_27(7040, (7755895910210656915L ^ life2_3))))) {
        break forest_join_118;
    }
    life4_95 = new net.minecraft.client.gui.GuiCreateWorld(receiver);
    life5_105 = __call566_32(__call566_29(__fieldRead566_28(receiver)), __call566_31(receiver, __fieldRead566_30(receiver)), 0);
    life6_108 = __call566_33(life5_105);
    __call566_34(life5_105);
    __call566_35(life4_95, life6_108);
    __call566_37(__fieldRead566_36(receiver), life4_95);
    break forest_join_122;
    }
    __call566_39(__fieldRead566_38(receiver), p0);
    }
    return;
}
public static void h566_0(java.io.IOException p0) throws Throwable {
    throw __call3056600_0(p0);
}
public static void h566_1(java.io.IOException p0) throws Throwable {
    throw __call3056601_0(p0);
}
public static void h566_2(java.io.IOException p0) throws Throwable {
    throw __call3056602_0(p0);
}
public static void h566_3(java.io.IOException p0) throws Throwable {
    throw __call3056603_0(p0);
}
public static void h566_4(java.io.IOException p0) throws Throwable {
    throw __call3056604_0(p0);
}
private static native long __fieldRead566_0() throws Throwable;
private static native boolean __fieldRead566_1(moom.gc a0) throws Throwable;
private static native int __fieldRead566_2(moom.gc a0) throws Throwable;
private static native int __fieldRead566_3(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native java.lang.String __call566_4(net.minecraft.client.gui.GuiSelectWorld a0, int a1) throws Throwable;
private static native void __fieldWrite566_5(net.minecraft.client.gui.GuiSelectWorld a0, int a1) throws Throwable;
private static native int __fieldRead566_6(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native moom.hb __call566_7(net.minecraft.client.gui.GuiSelectWorld a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead566_8(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native void __call566_9(net.minecraft.client.Minecraft a0, moom.hb a1) throws Throwable;
private static native int __fieldRead566_10(moom.gc a0) throws Throwable;
private static native int __fieldRead566_11(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native void __call566_12(net.minecraft.client.gui.GuiSelectWorld a0, int a1) throws Throwable;
private static native int __fieldRead566_13(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead566_14(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native void __call566_15(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiCreateWorld a1) throws Throwable;
private static native int __fieldRead566_16(moom.gc a0) throws Throwable;
private static native int __invokedynamic566_17(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead566_18(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native int __fieldRead566_19(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native java.lang.String __call566_20(net.minecraft.client.gui.GuiSelectWorld a0, int a1) throws Throwable;
private static native void __call566_21(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiRenameWorld a1) throws Throwable;
private static native int __fieldRead566_22(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead566_23(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead566_24(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native void __call566_25(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native int __fieldRead566_26(moom.gc a0) throws Throwable;
private static native int __invokedynamic566_27(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead566_28(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveFormat __call566_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead566_30(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native java.lang.String __call566_31(net.minecraft.client.gui.GuiSelectWorld a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __call566_32(net.minecraft.world.storage.ISaveFormat a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call566_33(net.minecraft.world.storage.ISaveHandler a0) throws Throwable;
private static native void __call566_34(net.minecraft.world.storage.ISaveHandler a0) throws Throwable;
private static native void __call566_35(net.minecraft.client.gui.GuiCreateWorld a0, net.minecraft.world.storage.WorldInfo a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead566_36(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native void __call566_37(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiCreateWorld a1) throws Throwable;
private static native moom.id __fieldRead566_38(net.minecraft.client.gui.GuiSelectWorld a0) throws Throwable;
private static native void __call566_39(moom.id a0, moom.gc a1) throws Throwable;
private static native java.lang.Exception __call3056600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3056601_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3056602_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3056603_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3056604_0(java.io.IOException a0) throws Throwable;

}


protected java.lang.String b__sourceReturn_b52d34d971(int p0) {
java.lang.String local2 = ((moom.IQ)(((moom.IQ)(((java.util.List)(this.C)).get(((int)(p0))))))).b__String();
    if (org.apache.commons.lang3.StringUtils.isEmpty(((java.lang.CharSequence)(local2)))) {
        local2 = __sourceIntrinsic_e0c698876dbb_invokedynamic10378_6(moom.oO.a(((java.lang.String)("selectWorld.world")), ((java.lang.Object[])(new java.lang.Object[0]))), (p0 + 1));
    }
    return local2;
}


public void b() {
long life1_3;
    life1_3 = (net.minecraft.client.gui.GuiSelectWorld.M ^ 84616418635375L);
    java.util.List spill490_0 = this.m;
    net.minecraft.client.gui.GuiSelectWorld __stackOp490_9_0 = this;
    moom.gc __stackOp490_9_1 = new moom.gc(1, ((this.k / 2) - __sourceIntrinsic_938da207dded_invokedynamic490_3(23285, (8342355502839373669L ^ life1_3))), (this.l - __sourceIntrinsic_938da207dded_invokedynamic490_5(26991, (5833119722600606968L ^ life1_3))), __sourceIntrinsic_938da207dded_invokedynamic490_6(20010, (7902932573679094716L ^ life1_3)), __sourceIntrinsic_938da207dded_invokedynamic490_7(16001, (7516862170876902175L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.select")), ((java.lang.Object[])(new java.lang.Object[0]))));
    moom.gc spill490_1 = __stackOp490_9_1;
    ((net.minecraft.client.gui.GuiSelectWorld)(__stackOp490_9_0)).J = ((moom.gc)(__stackOp490_9_1));
    ((java.util.List)(spill490_0)).add(((java.lang.Object)(spill490_1)));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(3, ((this.k / 2) + 4), (this.l - __sourceIntrinsic_938da207dded_invokedynamic490_15(31074, (5825940515982195952L ^ life1_3))), __sourceIntrinsic_938da207dded_invokedynamic490_16(6918, (715748644974157442L ^ life1_3)), __sourceIntrinsic_938da207dded_invokedynamic490_17(16001, (7516862170876902175L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.create")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    java.util.List spill490_2 = this.m;
    net.minecraft.client.gui.GuiSelectWorld __stackOp490_29_0 = this;
    moom.gc __stackOp490_29_1 = new moom.gc(__sourceIntrinsic_938da207dded_invokedynamic490_21(25950, (8022169946469802178L ^ life1_3)), ((this.k / 2) - __sourceIntrinsic_938da207dded_invokedynamic490_23(31816, (1410071247555246557L ^ life1_3))), (this.l - __sourceIntrinsic_938da207dded_invokedynamic490_25(32129, (6387529341587863578L ^ life1_3))), __sourceIntrinsic_938da207dded_invokedynamic490_26(3496, (5984963317782005809L ^ life1_3)), __sourceIntrinsic_938da207dded_invokedynamic490_27(16001, (7516862170876902175L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.rename")), ((java.lang.Object[])(new java.lang.Object[0]))));
    moom.gc spill490_3 = __stackOp490_29_1;
    ((net.minecraft.client.gui.GuiSelectWorld)(__stackOp490_29_0)).K = ((moom.gc)(__stackOp490_29_1));
    ((java.util.List)(spill490_2)).add(((java.lang.Object)(spill490_3)));
    java.util.List spill490_4 = this.m;
    net.minecraft.client.gui.GuiSelectWorld __stackOp490_40_0 = this;
    moom.gc __stackOp490_40_1 = new moom.gc(2, ((this.k / 2) - __sourceIntrinsic_938da207dded_invokedynamic490_34(24799, (902797393822197081L ^ life1_3))), (this.l - __sourceIntrinsic_938da207dded_invokedynamic490_36(16674, (1311236797604824241L ^ life1_3))), __sourceIntrinsic_938da207dded_invokedynamic490_37(14803, (8293312328044248139L ^ life1_3)), __sourceIntrinsic_938da207dded_invokedynamic490_38(16001, (7516862170876902175L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.delete")), ((java.lang.Object[])(new java.lang.Object[0]))));
    moom.gc spill490_5 = __stackOp490_40_1;
    ((net.minecraft.client.gui.GuiSelectWorld)(__stackOp490_40_0)).I = ((moom.gc)(__stackOp490_40_1));
    ((java.util.List)(spill490_4)).add(((java.lang.Object)(spill490_5)));
    java.util.List spill490_6 = this.m;
    net.minecraft.client.gui.GuiSelectWorld __stackOp490_51_0 = this;
    moom.gc __stackOp490_51_1 = new moom.gc(__sourceIntrinsic_938da207dded_invokedynamic490_44(19924, (5932962591388207168L ^ life1_3)), ((this.k / 2) + 4), (this.l - __sourceIntrinsic_938da207dded_invokedynamic490_47(16674, (1311236797604824241L ^ life1_3))), __sourceIntrinsic_938da207dded_invokedynamic490_48(14803, (8293312328044248139L ^ life1_3)), __sourceIntrinsic_938da207dded_invokedynamic490_49(16001, (7516862170876902175L ^ life1_3)), moom.oO.a(((java.lang.String)("selectWorld.recreate")), ((java.lang.Object[])(new java.lang.Object[0]))));
    moom.gc spill490_7 = __stackOp490_51_1;
    ((net.minecraft.client.gui.GuiSelectWorld)(__stackOp490_51_0)).L = ((moom.gc)(__stackOp490_51_1));
    ((java.util.List)(spill490_6)).add(((java.lang.Object)(spill490_7)));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(0, ((this.k / 2) + __sourceIntrinsic_938da207dded_invokedynamic490_56(696, (229861742070875965L ^ life1_3))), (this.l - __sourceIntrinsic_938da207dded_invokedynamic490_58(16674, (1311236797604824241L ^ life1_3))), __sourceIntrinsic_938da207dded_invokedynamic490_59(14803, (8293312328044248139L ^ life1_3)), __sourceIntrinsic_938da207dded_invokedynamic490_60(16001, (7516862170876902175L ^ life1_3)), moom.oO.a(((java.lang.String)("gui.cancel")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((moom.gc)(this.J)).m = ((boolean)(false));
    ((moom.gc)(this.I)).m = ((boolean)(false));
    ((moom.gc)(this.K)).m = ((boolean)(false));
    ((moom.gc)(this.L)).m = ((boolean)(false));
    return;
}


public void e() throws java.io.IOException {
super.e();
    ((moom.id)(this.D)).c__Void();
    return;
}


public void c__Void() {
this.z = ((java.lang.String)(moom.oO.a(((java.lang.String)("selectWorld.title")), ((java.lang.Object[])(new java.lang.Object[0])))));
    try {
        ((net.minecraft.client.gui.GuiSelectWorld)(this)).a();
    } catch (net.minecraft.client.AnvilConverterException caught1) {
        ((org.apache.logging.log4j.Logger)(net.minecraft.client.gui.GuiSelectWorld.w)).error(((java.lang.String)("Couldn't load level list")), ((java.lang.Throwable)(caught1)));
        ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(new moom.gQ("Unable to load worlds", ((net.minecraft.client.AnvilConverterException)(caught1)).getMessage()))));
        return;
    }
    this.E = ((java.lang.String)(moom.oO.a(((java.lang.String)("selectWorld.world")), ((java.lang.Object[])(new java.lang.Object[0])))));
    this.F = ((java.lang.String)(moom.oO.a(((java.lang.String)("selectWorld.conversion")), ((java.lang.Object[])(new java.lang.Object[0])))));
    (this.G)[((net.minecraft.world.WorldSettings$GameType)(net.minecraft.world.WorldSettings$GameType.SURVIVAL)).a()] = moom.oO.a(((java.lang.String)("gameMode.survival")), ((java.lang.Object[])(new java.lang.Object[0])));
    (this.G)[((net.minecraft.world.WorldSettings$GameType)(net.minecraft.world.WorldSettings$GameType.CREATIVE)).a()] = moom.oO.a(((java.lang.String)("gameMode.creative")), ((java.lang.Object[])(new java.lang.Object[0])));
    (this.G)[((net.minecraft.world.WorldSettings$GameType)(net.minecraft.world.WorldSettings$GameType.ADVENTURE)).a()] = moom.oO.a(((java.lang.String)("gameMode.adventure")), ((java.lang.Object[])(new java.lang.Object[0])));
    (this.G)[((net.minecraft.world.WorldSettings$GameType)(net.minecraft.world.WorldSettings$GameType.SPECTATOR)).a()] = moom.oO.a(((java.lang.String)("gameMode.spectator")), ((java.lang.Object[])(new java.lang.Object[0])));
    this.D = ((moom.id)(new moom.id(this, this.i)));
    ((moom.id)(this.D)).c(((int)(4)), ((int)(5)));
    ((net.minecraft.client.gui.GuiSelectWorld)(this)).b();
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static moom.hb a(net.minecraft.client.gui.GuiYesNoCallback p0, java.lang.String p1, int p2) {
java.lang.String local3 = moom.oO.a(((java.lang.String)("selectWorld.deleteQuestion")), ((java.lang.Object[])(new java.lang.Object[0])));
    java.lang.String local4 = __sourceIntrinsic_8cb2d9856353_originalDynamicSite1799_2(p1, moom.oO.a(((java.lang.String)("selectWorld.deleteWarning")), ((java.lang.Object[])(new java.lang.Object[0]))));
    java.lang.String local5 = moom.oO.a(((java.lang.String)("selectWorld.deleteButton")), ((java.lang.Object[])(new java.lang.Object[0])));
    java.lang.String local6 = moom.oO.a(((java.lang.String)("gui.cancel")), ((java.lang.Object[])(new java.lang.Object[0])));
    return new moom.hb(p0, local3, local4, local5, local6, p2);
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 896;
      if (O[var3] == null) {
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
         long var5 = N[var3];
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
         Object[] var9 = (Object[])P.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               P.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/g8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         O[var3] = var15;
      }

      return O[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10380_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/g8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiSelectWorld.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private void a() throws net.minecraft.client.AnvilConverterException {
java.lang.Object local1 = ((net.minecraft.client.Minecraft)(this.i)).a__IK();
    this.C = ((java.util.List)(((net.minecraft.world.storage.ISaveFormat)(local1)).a__List()));
    java.util.Collections.sort(((java.util.List)(this.C)));
    this.B = ((int)(-1));
    return;
}


protected java.lang.String a__sourceReturn_b52d34d971(int p0) {
return ((moom.IQ)(((moom.IQ)(((java.util.List)(this.C)).get(((int)(p0))))))).a__String();
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_763a66e96da914afe08a(this, p0); }


public void a__Void(int p0) {
java.lang.String life2_13;
    java.lang.String life3_22;
    ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(null)));
    if ((!this.A)) {
        this.A = ((boolean)(true));
        life2_13 = ((net.minecraft.client.gui.GuiSelectWorld)(this)).a__sourceReturn_b52d34d971(((int)(p0)));
        if ((life2_13 == null)) {
        life2_13 = __sourceIntrinsic_6fc3381d0590_invokedynamic2368_5(p0);
    }
        life3_22 = ((net.minecraft.client.gui.GuiSelectWorld)(this)).b__sourceReturn_b52d34d971(((int)(p0)));
        if ((life3_22 == null)) {
        life3_22 = __sourceIntrinsic_6fc3381d0590_invokedynamic2368_7(p0);
    }
        try {
        if (((net.minecraft.world.storage.ISaveFormat)(((net.minecraft.client.Minecraft)(this.i)).a__IK())).e(((java.lang.String)(life2_13)))) {
        ((net.minecraft.client.Minecraft)(this.i)).a(((java.lang.String)(life2_13)), ((java.lang.String)(life3_22)), ((moom.EK)(null)));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw net.minecraft.client.gui.GuiSelectWorld.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    }
    return;
}


public void a(boolean p0, int p1) { __sourceHandlerCall_0e76fa0127d98f9e36a3(this, p0, p1); }


public void a(int p0, int p1, float p2) {
long local4 = (net.minecraft.client.gui.GuiSelectWorld.M ^ 106429537369738L);
    ((moom.id)(this.D)).a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    ((net.minecraft.client.gui.GuiSelectWorld)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.z)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1800_6(30966, (1696920463274290572L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1800_7(29275, (3549234409594693412L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1800_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1800_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10380_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8cb2d9856353_originalDynamicSite1799_2(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6fc3381d0590_invokedynamic2368_5(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6fc3381d0590_invokedynamic2368_7(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic490_60(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e0c698876dbb_invokedynamic10378_6(java.lang.String a0, int a1) throws E;
}
