package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiCommandBlock extends net.minecraft.client.gui.GuiScreen {

private static org.apache.logging.log4j.Logger w;

private moom.hJ x;

private moom.hJ y;

private moom.qV z;

private moom.gc A;

private moom.gc B;

private moom.gc C;

private boolean D;

private static long E;

private static long[] F;

private static java.lang.Integer[] G;

private static java.util.Map H;

public GuiCommandBlock(moom.qV p0) {
super();
    this.z = p0;
}


static {
E = ((long)(((moom._a)(moom._c.a(((long)(-1817413118639898642L)), ((long)(-4529792883392885892L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(48947932648578L)))));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiCommandBlock.E ^ 84645964821188L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1767_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1767_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1767_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1767_14 = new byte[8];
    (__sourceSpill1767_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1767_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1767_16 = __sourceSpill1767_14;
    ((javax.crypto.Cipher)(__sourceSpill1767_11)).init(((int)(__sourceSpill1767_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1767_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1767_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[21];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Uác$Yó=)¡H3(n\037¹s/Ùtôk\020èSy2\nõ\032\006bHxa\004\031Q¸1/\003©U\020îÇá\r[\024\030®MNè\005à-ª\031êî'\033ì\022\007S>ü³aÝ\035zÅj­W\005´oðîcý³ûÎ\034-\rì\003øö:\006þ¥75dy\000p%ßL]Ó(\000\026r¹Î¶Ïnö\030¦°©SºG^ YºUæÆ_S=«ú\017"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1767_25 = local6_life21;
        int __sourceSpill1767_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1767_25)).substring(((int)(__sourceSpill1767_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1767_30 = local8_life19;
        int __sourceSpill1767_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1767_33 = new byte[8];
        (__sourceSpill1767_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1767_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1767_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1767_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1767_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1767_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1767_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1767_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1767_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1767_34)).doFinal(((byte[])(__sourceSpill1767_33)));
        (__sourceSpill1767_30)[__sourceSpill1767_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\013|;\036S\0209^\024Ð\fào"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1767_38 = local6_life21;
        int __sourceSpill1767_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1767_38)).substring(((int)(__sourceSpill1767_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1767_43 = local8_life19;
        int __sourceSpill1767_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1767_46 = new byte[8];
        (__sourceSpill1767_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1767_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1767_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1767_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1767_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1767_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1767_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1767_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1767_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1767_47)).doFinal(((byte[])(__sourceSpill1767_46)));
        (__sourceSpill1767_43)[__sourceSpill1767_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    F = ((long[])(local8_life19));
    G = ((java.lang.Integer[])(new java.lang.Integer[21]));
    w = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_a8ba03f2a3ec7a35540a(net.minecraft.client.gui.GuiCommandBlock a0) throws E;
private static final class __SourceHandler_a8ba03f2a3ec7a35540a {

public static void f1300(net.minecraft.client.gui.GuiCommandBlock receiver) throws Throwable {
    forward_join_28: {
    forward_join_20: {
    if (!(__call1300_1(__fieldRead1300_0(receiver)))) { break forward_join_20; }
    __fieldWrite1300_3(__fieldRead1300_2(receiver), "O");
    if (!((__call1300_5(__fieldRead1300_4(receiver)) != null))) { break forward_join_28; }
    __call1300_10(__fieldRead1300_6(receiver), __call1300_9(__call1300_8(__fieldRead1300_7(receiver))));
    break forward_join_28;
    }
    __fieldWrite1300_12(__fieldRead1300_11(receiver), "X");
    __call1300_14(__fieldRead1300_13(receiver), "-");
    }
    return;
}
public static void h1300_0(moom.Oo p0) throws Throwable {
    throw __call1130000_0(p0);
}
public static void h1300_1(moom.Oo p0) throws Throwable {
    throw __call1130001_0(p0);
}
private static native moom.qV __fieldRead1300_0(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native boolean __call1300_1(moom.qV a0) throws Throwable;
private static native moom.gc __fieldRead1300_2(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native void __fieldWrite1300_3(moom.gc a0, java.lang.String a1) throws Throwable;
private static native moom.qV __fieldRead1300_4(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1300_5(moom.qV a0) throws Throwable;
private static native moom.hJ __fieldRead1300_6(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native moom.qV __fieldRead1300_7(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1300_8(moom.qV a0) throws Throwable;
private static native java.lang.String __call1300_9(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native void __call1300_10(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native moom.gc __fieldRead1300_11(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native void __fieldWrite1300_12(moom.gc a0, java.lang.String a1) throws Throwable;
private static native moom.hJ __fieldRead1300_13(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native void __call1300_14(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1130000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1130001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_910c26307c655fdee58d(net.minecraft.client.gui.GuiCommandBlock a0, char a1, int a2) throws E;
private static final class __SourceHandler_910c26307c655fdee58d {

public static void f1301(net.minecraft.client.gui.GuiCommandBlock receiver, char p0, int p1) throws Throwable {
    moom.gc forwardValue1301_26_0;
    moom.gc forwardValue1301_27_0;
    int forwardValue1301_27_1;
    moom.gc spill1301_0;
    long life3_3;
    forward_join_54: {
    forward_join_50: {
    forward_join_27: {
    forward_join_26: {
    life3_3 = (__fieldRead1301_0() ^ 50277121207052L);
    __call1301_2(__fieldRead1301_1(receiver), p0, p1);
    __call1301_4(__fieldRead1301_3(receiver), p0, p1);
    spill1301_0 = __fieldRead1301_5(receiver);
    if (!((__call1301_9(__call1301_8(__call1301_7(__fieldRead1301_6(receiver)))) > 0))) {
        forwardValue1301_26_0 = spill1301_0;
        break forward_join_26;
    }
    forwardValue1301_27_0 = spill1301_0;
    forwardValue1301_27_1 = 1;
    break forward_join_27;
    }
    forwardValue1301_27_0 = forwardValue1301_26_0;
    forwardValue1301_27_1 = 0;
    }
    __fieldWrite1301_10(forwardValue1301_27_0, forwardValue1301_27_1);
    if (!((p1 != __invokedynamic1301_11(32383, (4609157763062395054L ^ life3_3))))) {
        break forward_join_50;
    }
    if (!((p1 != __invokedynamic1301_12(20469, (7604377615803334973L ^ life3_3))))) {
        break forward_join_50;
    }
    if (!((p1 == 1))) {
        break forward_join_54;
    }
    __call1301_14(receiver, __fieldRead1301_13(receiver));
    break forward_join_54;
    }
    __call1301_16(receiver, __fieldRead1301_15(receiver));
    }
    return;
}
public static void h1301_0(java.io.IOException p0) throws Throwable {
    throw __call1130100_0(p0);
}
public static void h1301_1(java.io.IOException p0) throws Throwable {
    throw __call1130101_0(p0);
}
public static void h1301_2(java.io.IOException p0) throws Throwable {
    throw __call1130102_0(p0);
}
public static void h1301_3(java.io.IOException p0) throws Throwable {
    throw __call1130103_0(p0);
}
private static native long __fieldRead1301_0() throws Throwable;
private static native moom.hJ __fieldRead1301_1(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native boolean __call1301_2(moom.hJ a0, char a1, int a2) throws Throwable;
private static native moom.hJ __fieldRead1301_3(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native boolean __call1301_4(moom.hJ a0, char a1, int a2) throws Throwable;
private static native moom.gc __fieldRead1301_5(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native moom.hJ __fieldRead1301_6(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native java.lang.String __call1301_7(moom.hJ a0) throws Throwable;
private static native java.lang.String __call1301_8(java.lang.String a0) throws Throwable;
private static native int __call1301_9(java.lang.String a0) throws Throwable;
private static native void __fieldWrite1301_10(moom.gc a0, int a1) throws Throwable;
private static native int __invokedynamic1301_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic1301_12(int a0, long a1) throws Throwable;
private static native moom.gc __fieldRead1301_13(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native void __call1301_14(net.minecraft.client.gui.GuiCommandBlock a0, moom.gc a1) throws Throwable;
private static native moom.gc __fieldRead1301_15(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native void __call1301_16(net.minecraft.client.gui.GuiCommandBlock a0, moom.gc a1) throws Throwable;
private static native java.lang.Exception __call1130100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1130101_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1130102_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1130103_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0ba638902e4d7526788e(net.minecraft.client.gui.GuiCommandBlock a0, moom.gc a1) throws E;
private static final class __SourceHandler_0ba638902e4d7526788e {

public static void f2220(net.minecraft.client.gui.GuiCommandBlock receiver, moom.gc p0) throws Throwable {
    net.minecraft.network.PacketBuffer life2_29;
    if (__fieldRead2220_0(p0)) {
        if ((__fieldRead2220_1(p0) == 1)) {
        __call2220_4(__fieldRead2220_2(receiver), __fieldRead2220_3(receiver));
        __call2220_6(__fieldRead2220_5(receiver), null);
    } else {
        if ((__fieldRead2220_7(p0) == 0)) {
        life2_29 = new net.minecraft.network.PacketBuffer(__call2220_8());
        __call2220_11(life2_29, __call2220_10(__fieldRead2220_9(receiver)));
        __call2220_13(__fieldRead2220_12(receiver), life2_29);
        __call2220_16(life2_29, __call2220_15(__fieldRead2220_14(receiver)));
        __call2220_19(life2_29, __call2220_18(__fieldRead2220_17(receiver)));
        __call2220_22(__call2220_21(__fieldRead2220_20(receiver)), new moom.zq("MC|AdvCdm", life2_29));
        if ((!__call2220_24(__fieldRead2220_23(receiver)))) {
        __call2220_26(__fieldRead2220_25(receiver), null);
    }
        __call2220_28(__fieldRead2220_27(receiver), null);
    } else {
        if ((__fieldRead2220_29(p0) == 4)) {
        moom.qV spill2220_0 = __fieldRead2220_30(receiver);
        __call2220_33(spill2220_0, ((!__call2220_32(__fieldRead2220_31(receiver))) ? 1 : 0));
        __call2220_34(receiver);
    }
    }
    }
    }
    return;
}
public static void h2220_0(java.io.IOException p0) throws Throwable {
    throw __call1222000_0(p0);
}
public static void h2220_1(java.io.IOException p0) throws Throwable {
    throw __call1222001_0(p0);
}
public static void h2220_2(java.io.IOException p0) throws Throwable {
    throw __call1222002_0(p0);
}
public static void h2220_3(java.io.IOException p0) throws Throwable {
    throw __call1222003_0(p0);
}
public static void h2220_4(java.io.IOException p0) throws Throwable {
    throw __call1222004_0(p0);
}
private static native boolean __fieldRead2220_0(moom.gc a0) throws Throwable;
private static native int __fieldRead2220_1(moom.gc a0) throws Throwable;
private static native moom.qV __fieldRead2220_2(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native boolean __fieldRead2220_3(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native void __call2220_4(moom.qV a0, boolean a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2220_5(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native void __call2220_6(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native int __fieldRead2220_7(moom.gc a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call2220_8() throws Throwable;
private static native moom.qV __fieldRead2220_9(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __call2220_10(moom.qV a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call2220_11(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native moom.qV __fieldRead2220_12(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native void __call2220_13(moom.qV a0, net.minecraft.network.PacketBuffer a1) throws Throwable;
private static native moom.hJ __fieldRead2220_14(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native java.lang.String __call2220_15(moom.hJ a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call2220_16(net.minecraft.network.PacketBuffer a0, java.lang.String a1) throws Throwable;
private static native moom.qV __fieldRead2220_17(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native boolean __call2220_18(moom.qV a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call2220_19(net.minecraft.network.PacketBuffer a0, boolean a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2220_20(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __call2220_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2220_22(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zq a1) throws Throwable;
private static native moom.qV __fieldRead2220_23(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native boolean __call2220_24(moom.qV a0) throws Throwable;
private static native moom.qV __fieldRead2220_25(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native void __call2220_26(moom.qV a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2220_27(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native void __call2220_28(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native int __fieldRead2220_29(moom.gc a0) throws Throwable;
private static native moom.qV __fieldRead2220_30(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native moom.qV __fieldRead2220_31(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native boolean __call2220_32(moom.qV a0) throws Throwable;
private static native void __call2220_33(moom.qV a0, int a1) throws Throwable;
private static native void __call2220_34(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native java.lang.Exception __call1222000_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1222001_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1222002_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1222003_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1222004_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_72ba3273cd51a81241c1(net.minecraft.client.gui.GuiCommandBlock a0) throws E;
private static final class __SourceHandler_72ba3273cd51a81241c1 {

public static void f199(net.minecraft.client.gui.GuiCommandBlock receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead199_0() ^ 41446134216513L);
    __call199_1(1);
    __call199_3(__fieldRead199_2(receiver));
    java.util.List spill199_0 = __fieldRead199_4(receiver);
    net.minecraft.client.gui.GuiCommandBlock __stackOp199_13_0 = receiver;
    moom.gc __stackOp199_13_1 = new moom.gc(0, (((__fieldRead199_5(receiver) / 2) - 4) - __invokedynamic199_6(15434, (6508486202562473675L ^ life1_3))), (((__fieldRead199_7(receiver) / 4) + __invokedynamic199_8(17011, (97819014155079920L ^ life1_3))) + __invokedynamic199_9(26532, (7102708201007068459L ^ life1_3))), __invokedynamic199_10(15434, (6508486202562473675L ^ life1_3)), __invokedynamic199_11(31176, (2309992619024231246L ^ life1_3)), __call199_12("gui.done", new java.lang.Object[0]));
    moom.gc spill199_1 = __stackOp199_13_1;
    __fieldWrite199_14(__stackOp199_13_0, __stackOp199_13_1);
    __call199_15(spill199_0, spill199_1);
    java.util.List spill199_2 = __fieldRead199_16(receiver);
    net.minecraft.client.gui.GuiCommandBlock __stackOp199_24_0 = receiver;
    moom.gc __stackOp199_24_1 = new moom.gc(1, ((__fieldRead199_17(receiver) / 2) + 4), (((__fieldRead199_18(receiver) / 4) + __invokedynamic199_19(15754, (419953512872603406L ^ life1_3))) + __invokedynamic199_20(24806, (2208111764613902952L ^ life1_3))), __invokedynamic199_21(15434, (6508486202562473675L ^ life1_3)), __invokedynamic199_22(31176, (2309992619024231246L ^ life1_3)), __call199_23("gui.cancel", new java.lang.Object[0]));
    moom.gc spill199_3 = __stackOp199_24_1;
    __fieldWrite199_25(__stackOp199_24_0, __stackOp199_24_1);
    __call199_26(spill199_2, spill199_3);
    java.util.List spill199_4 = __fieldRead199_27(receiver);
    net.minecraft.client.gui.GuiCommandBlock __stackOp199_34_0 = receiver;
    moom.gc __stackOp199_34_1 = new moom.gc(4, (((__fieldRead199_28(receiver) / 2) + __invokedynamic199_29(15434, (6508486202562473675L ^ life1_3))) - __invokedynamic199_30(31176, (2309992619024231246L ^ life1_3))), __invokedynamic199_31(15434, (6508486202562473675L ^ life1_3)), __invokedynamic199_32(31176, (2309992619024231246L ^ life1_3)), __invokedynamic199_33(31176, (2309992619024231246L ^ life1_3)), "O");
    moom.gc spill199_5 = __stackOp199_34_1;
    __fieldWrite199_35(__stackOp199_34_0, __stackOp199_34_1);
    __call199_36(spill199_4, spill199_5);
    __fieldWrite199_43(receiver, new moom.hJ(2, __fieldRead199_37(receiver), ((__fieldRead199_38(receiver) / 2) - __invokedynamic199_39(15434, (6508486202562473675L ^ life1_3))), __invokedynamic199_40(4184, (2197020695010329306L ^ life1_3)), __invokedynamic199_41(12498, (941773194887914059L ^ life1_3)), __invokedynamic199_42(31176, (2309992619024231246L ^ life1_3))));
    __call199_46(__fieldRead199_44(receiver), __invokedynamic199_45(29097, (2827353260149383987L ^ life1_3)));
    __call199_48(__fieldRead199_47(receiver), 1);
    __call199_52(__fieldRead199_49(receiver), __call199_51(__fieldRead199_50(receiver)));
    __fieldWrite199_59(receiver, new moom.hJ(3, __fieldRead199_53(receiver), ((__fieldRead199_54(receiver) / 2) - __invokedynamic199_55(15434, (6508486202562473675L ^ life1_3))), __invokedynamic199_56(15434, (6508486202562473675L ^ life1_3)), __invokedynamic199_57(8634, (6745792413926880033L ^ life1_3)), __invokedynamic199_58(31176, (2309992619024231246L ^ life1_3))));
    __call199_62(__fieldRead199_60(receiver), __invokedynamic199_61(24989, (1591664960986002199L ^ life1_3)));
    __call199_64(__fieldRead199_63(receiver), 0);
    __call199_66(__fieldRead199_65(receiver), "-");
    __fieldWrite199_69(receiver, __call199_68(__fieldRead199_67(receiver)));
    __call199_70(receiver);
    moom.gc spill199_6 = __fieldRead199_71(receiver);
    __fieldWrite199_76(spill199_6, ((__call199_75(__call199_74(__call199_73(__fieldRead199_72(receiver)))) > 0) ? 1 : 0));
    return;
}
public static void h199_0(moom.Oo p0) throws Throwable {
    throw __call1019900_0(p0);
}
private static native long __fieldRead199_0() throws Throwable;
private static native void __call199_1(int a0) throws Throwable;
private static native java.util.List __fieldRead199_2(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native void __call199_3(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead199_4(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __fieldRead199_5(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __invokedynamic199_6(int a0, long a1) throws Throwable;
private static native int __fieldRead199_7(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __invokedynamic199_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_11(int a0, long a1) throws Throwable;
private static native java.lang.String __call199_12(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite199_14(net.minecraft.client.gui.GuiCommandBlock a0, moom.gc a1) throws Throwable;
private static native boolean __call199_15(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead199_16(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __fieldRead199_17(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __fieldRead199_18(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __invokedynamic199_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_22(int a0, long a1) throws Throwable;
private static native java.lang.String __call199_23(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite199_25(net.minecraft.client.gui.GuiCommandBlock a0, moom.gc a1) throws Throwable;
private static native boolean __call199_26(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead199_27(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __fieldRead199_28(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __invokedynamic199_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_33(int a0, long a1) throws Throwable;
private static native void __fieldWrite199_35(net.minecraft.client.gui.GuiCommandBlock a0, moom.gc a1) throws Throwable;
private static native boolean __call199_36(java.util.List a0, moom.gc a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead199_37(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __fieldRead199_38(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __invokedynamic199_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_42(int a0, long a1) throws Throwable;
private static native void __fieldWrite199_43(net.minecraft.client.gui.GuiCommandBlock a0, moom.hJ a1) throws Throwable;
private static native moom.hJ __fieldRead199_44(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __invokedynamic199_45(int a0, long a1) throws Throwable;
private static native void __call199_46(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead199_47(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native void __call199_48(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead199_49(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native moom.qV __fieldRead199_50(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native java.lang.String __call199_51(moom.qV a0) throws Throwable;
private static native void __call199_52(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead199_53(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __fieldRead199_54(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __invokedynamic199_55(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_56(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_57(int a0, long a1) throws Throwable;
private static native int __invokedynamic199_58(int a0, long a1) throws Throwable;
private static native void __fieldWrite199_59(net.minecraft.client.gui.GuiCommandBlock a0, moom.hJ a1) throws Throwable;
private static native moom.hJ __fieldRead199_60(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native int __invokedynamic199_61(int a0, long a1) throws Throwable;
private static native void __call199_62(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead199_63(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native void __call199_64(moom.hJ a0, int a1) throws Throwable;
private static native moom.hJ __fieldRead199_65(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native void __call199_66(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native moom.qV __fieldRead199_67(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native boolean __call199_68(moom.qV a0) throws Throwable;
private static native void __fieldWrite199_69(net.minecraft.client.gui.GuiCommandBlock a0, boolean a1) throws Throwable;
private static native void __call199_70(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native moom.gc __fieldRead199_71(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native moom.hJ __fieldRead199_72(net.minecraft.client.gui.GuiCommandBlock a0) throws Throwable;
private static native java.lang.String __call199_73(moom.hJ a0) throws Throwable;
private static native java.lang.String __call199_74(java.lang.String a0) throws Throwable;
private static native int __call199_75(java.lang.String a0) throws Throwable;
private static native void __fieldWrite199_76(moom.gc a0, int a1) throws Throwable;
private static native java.lang.Exception __call1019900_0(moom.Oo a0) throws Throwable;

}


public void c__Void() { __sourceHandlerCall_72ba3273cd51a81241c1(this); }


public void h() {
org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    return;
}


private void a() { __sourceHandlerCall_a8ba03f2a3ec7a35540a(this); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 511;
      if (G[var3] == null) {
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
         long var5 = F[var3];
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
         Object[] var9 = (Object[])H.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               H.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gI", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         G[var3] = var15;
      }

      return G[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiCommandBlock.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10217_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_0ba638902e4d7526788e(this, p0); }


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_910c26307c655fdee58d(this, p0, p1); }


protected void a(int p0, int p1, int p2) throws java.io.IOException {
super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    ((moom.hJ)(this.x)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    ((moom.hJ)(this.y)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void a(int p0, int p1, float p2) {
long life4_3;
    int life6_64;
    int life7_66;
    int life6_237;
    life4_3 = (net.minecraft.client.gui.GuiCommandBlock.E ^ 27408046158535L);
    ((net.minecraft.client.gui.GuiCommandBlock)(this)).i();
    ((net.minecraft.client.gui.GuiCommandBlock)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("advMode.setCommand")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_5(10730, (5872434693406359276L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_6(980, (4933610991318422745L ^ life4_3)))));
    ((net.minecraft.client.gui.GuiCommandBlock)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("advMode.command")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)(((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_11(9774, (7217624834279895333L ^ life4_3))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_12(28361, (726805954346564039L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_13(2996, (4718249546231667902L ^ life4_3)))));
    ((moom.hJ)(this.x)).d__Void();
    life6_64 = __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_17(18855, (2815798516807212729L ^ life4_3));
    life7_66 = 0;
    ((net.minecraft.client.gui.GuiCommandBlock)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("advMode.nearestPlayer")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)(((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_21(15434, (6508533702757575501L ^ life4_3))))), ((int)((life6_64 + ((life7_66++) * ((net.minecraft.client.gui.FontRenderer)(this.p)).c)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_24(2543, (8248765755485282030L ^ life4_3)))));
    ((net.minecraft.client.gui.GuiCommandBlock)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("advMode.randomPlayer")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)(((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_29(15434, (6508533702757575501L ^ life4_3))))), ((int)((life6_64 + ((life7_66++) * ((net.minecraft.client.gui.FontRenderer)(this.p)).c)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_32(2543, (8248765755485282030L ^ life4_3)))));
    ((net.minecraft.client.gui.GuiCommandBlock)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("advMode.allPlayers")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)(((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_37(15434, (6508533702757575501L ^ life4_3))))), ((int)((life6_64 + ((life7_66++) * ((net.minecraft.client.gui.FontRenderer)(this.p)).c)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_40(2543, (8248765755485282030L ^ life4_3)))));
    ((net.minecraft.client.gui.GuiCommandBlock)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("advMode.allEntities")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)(((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_45(15434, (6508533702757575501L ^ life4_3))))), ((int)((life6_64 + ((life7_66++) * ((net.minecraft.client.gui.FontRenderer)(this.p)).c)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_48(2543, (8248765755485282030L ^ life4_3)))));
    ((net.minecraft.client.gui.GuiCommandBlock)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)("")), ((int)(((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_52(15434, (6508533702757575501L ^ life4_3))))), ((int)((life6_64 + ((life7_66++) * ((net.minecraft.client.gui.FontRenderer)(this.p)).c)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_55(2543, (8248765755485282030L ^ life4_3)))));
    if ((((java.lang.String)(((moom.hJ)(this.y)).a__String())).length() > 0)) {
        life6_237 = ((life6_64 + (life7_66 * ((net.minecraft.client.gui.FontRenderer)(this.p)).c)) + __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_62(7345, (2223611601102293950L ^ life4_3)));
        ((net.minecraft.client.gui.GuiCommandBlock)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("advMode.previousOutput")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)(((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_66(15434, (6508533702757575501L ^ life4_3))))), ((int)(life6_237)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_67(2543, (8248765755485282030L ^ life4_3)))));
        ((moom.hJ)(this.y)).d__Void();
    }
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


public void g() {
((moom.hJ)(this.x)).a__Void();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic5412_67(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10217_0() throws E;
}
