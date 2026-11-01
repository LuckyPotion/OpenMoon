package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiRepair extends moom.hg implements net.minecraft.inventory.ICrafting {

private static moom.DD Z;

private moom.wk aa;

private moom.hJ ab;

private net.minecraft.entity.player.InventoryPlayer ac;

private static long cb;

private static long[] fb;

private static java.lang.Integer[] pb;

private static java.util.Map qb;

public GuiRepair(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.world.World p1) {
super(new moom.wk(p0, p1, net.minecraft.client.Minecraft.a__fM().K));
    this.ac = p0;
    this.aa = ((moom.wk) (this.z));
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-6012907299387174180L)), ((long)(4774914548030293529L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(145687838657075L)))));
    qb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiRepair.cb ^ 122329611659521L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1781_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1781_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1781_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1781_14 = new byte[8];
    (__sourceSpill1781_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1781_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1781_16 = __sourceSpill1781_14;
    ((javax.crypto.Cipher)(__sourceSpill1781_11)).init(((int)(__sourceSpill1781_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1781_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1781_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[29];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\"\024·K<+d\003ïrÒÐx\003önð¡Ç1õ z=_5\037\f¾\025§ aK¡ád²rq_°Ç·¿ÀÚ¡+k\\×uÇÍ>M\020Llxd8OÕó£ÙæõEáÿ9½¸\fqÂ«A \bÛ§Ub\"ÈjpÞd7­4jÞÌ¥Xèð4m±FïF«yÆcEÖ\007äÞ\021h3Þ°a^#%8ô7\"<4,\032NÐ\036\023(~\024JÀFÿ10à\r\037Ã»$æÿ\000S*X[ÞÈ\f¬o.`W\013÷Wîft³WCqË=yS®\f#¾[yú¬"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1781_25 = local6_life21;
        int __sourceSpill1781_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1781_25)).substring(((int)(__sourceSpill1781_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1781_30 = local8_life19;
        int __sourceSpill1781_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1781_33 = new byte[8];
        (__sourceSpill1781_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1781_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1781_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1781_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1781_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1781_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1781_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1781_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1781_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1781_34)).doFinal(((byte[])(__sourceSpill1781_33)));
        (__sourceSpill1781_30)[__sourceSpill1781_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ô-z¦\rµis¨*l{"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1781_38 = local6_life21;
        int __sourceSpill1781_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1781_38)).substring(((int)(__sourceSpill1781_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1781_43 = local8_life19;
        int __sourceSpill1781_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1781_46 = new byte[8];
        (__sourceSpill1781_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1781_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1781_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1781_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1781_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1781_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1781_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1781_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1781_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1781_47)).doFinal(((byte[])(__sourceSpill1781_46)));
        (__sourceSpill1781_43)[__sourceSpill1781_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    fb = ((long[])(local8_life19));
    pb = ((java.lang.Integer[])(new java.lang.Integer[29]));
    Z = ((moom.DD)(new moom.DD("textures/gui/container/anvil.png")));
}

private static native <E extends Throwable> void __sourceHandlerCall_84f71ee459e6f939e08e(net.minecraft.client.gui.GuiRepair a0, char a1, int a2) throws E;
private static final class __SourceHandler_84f71ee459e6f939e08e {

public static void f2275(net.minecraft.client.gui.GuiRepair receiver, char p0, int p1) throws Throwable {
    if (__call2275_1(__fieldRead2275_0(receiver), p0, p1)) {
        __call2275_2(receiver);
    } else {
        __call2275_3(receiver, p0, p1);
    }
    return;
}
public static void h2275_0(java.io.IOException p0) throws Throwable {
    throw __call1227500_0(p0);
}
private static native moom.hJ __fieldRead2275_0(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native boolean __call2275_1(moom.hJ a0, char a1, int a2) throws Throwable;
private static native void __call2275_2(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native void __call2275_3(net.minecraft.client.gui.GuiRepair a0, char a1, int a2) throws Throwable;
private static native java.lang.Exception __call1227500_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6870efa18f9980dad8b8(net.minecraft.client.gui.GuiRepair a0, float a1, int a2, int a3) throws E;
private static final class __SourceHandler_6870efa18f9980dad8b8 {

public static void f1319(net.minecraft.client.gui.GuiRepair receiver, float p0, int p1, int p2) throws Throwable {
    net.minecraft.client.gui.GuiRepair forwardValue1319_66_0;
    int forwardValue1319_66_1;
    int forwardValue1319_66_2;
    int forwardValue1319_66_3;
    int forwardValue1319_66_4;
    net.minecraft.client.gui.GuiRepair forwardValue1319_71_0;
    int forwardValue1319_71_1;
    int forwardValue1319_71_2;
    int forwardValue1319_71_3;
    int forwardValue1319_71_4;
    int forwardValue1319_71_5;
    net.minecraft.client.gui.GuiRepair spill1319_0;
    int spill1319_1;
    int spill1319_2;
    int spill1319_3;
    int spill1319_4;
    long life4_3;
    int life6_21;
    int life7_29;
    forward_join_130: {
    forward_join_95: {
    forward_join_71: {
    forward_join_66: {
    life4_3 = (__fieldRead1319_0() ^ 43867084808607L);
    __call1319_1(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call1319_5(__call1319_3(__fieldRead1319_2(receiver)), __fieldRead1319_4());
    life6_21 = ((__fieldRead1319_6(receiver) - __fieldRead1319_7(receiver)) / 2);
    life7_29 = ((__fieldRead1319_8(receiver) - __fieldRead1319_9(receiver)) / 2);
    __call1319_12(receiver, life6_21, life7_29, 0, 0, __fieldRead1319_10(receiver), __fieldRead1319_11(receiver));
    spill1319_0 = receiver;
    spill1319_1 = (life6_21 + __invokedynamic1319_13(13663, (6538077871296773458L ^ life4_3)));
    spill1319_2 = (life7_29 + __invokedynamic1319_14(24357, (3698983900310411051L ^ life4_3)));
    spill1319_3 = 0;
    spill1319_4 = __fieldRead1319_15(receiver);
    if (!(__call1319_18(__call1319_17(__fieldRead1319_16(receiver), 0)))) {
        forwardValue1319_66_0 = spill1319_0;
        forwardValue1319_66_1 = spill1319_1;
        forwardValue1319_66_2 = spill1319_2;
        forwardValue1319_66_3 = spill1319_3;
        forwardValue1319_66_4 = spill1319_4;
        break forward_join_66;
    }
    forwardValue1319_71_0 = spill1319_0;
    forwardValue1319_71_1 = spill1319_1;
    forwardValue1319_71_2 = spill1319_2;
    forwardValue1319_71_3 = spill1319_3;
    forwardValue1319_71_4 = spill1319_4;
    forwardValue1319_71_5 = 0;
    break forward_join_71;
    }
    forwardValue1319_71_0 = forwardValue1319_66_0;
    forwardValue1319_71_1 = forwardValue1319_66_1;
    forwardValue1319_71_2 = forwardValue1319_66_2;
    forwardValue1319_71_3 = forwardValue1319_66_3;
    forwardValue1319_71_4 = forwardValue1319_66_4;
    forwardValue1319_71_5 = __invokedynamic1319_19(21887, (370722683065703782L ^ life4_3));
    }
    __call1319_22(forwardValue1319_71_0, forwardValue1319_71_1, forwardValue1319_71_2, forwardValue1319_71_3, (forwardValue1319_71_4 + forwardValue1319_71_5), __invokedynamic1319_20(29297, (5579680687915514482L ^ life4_3)), __invokedynamic1319_21(5050, (3695800459211168699L ^ life4_3)));
    if (!((!__call1319_25(__call1319_24(__fieldRead1319_23(receiver), 0))))) {
        break forward_join_95;
    }
    if (!(__call1319_28(__call1319_27(__fieldRead1319_26(receiver), 1)))) {
        break forward_join_130;
    }
    }
    if (!((!__call1319_31(__call1319_30(__fieldRead1319_29(receiver), 2))))) {
        break forward_join_130;
    }
    __call1319_37(receiver, (life6_21 + __invokedynamic1319_32(26639, (857761482270285850L ^ life4_3))), (life7_29 + __invokedynamic1319_33(7243, (5002682949295395919L ^ life4_3))), __fieldRead1319_34(receiver), 0, __invokedynamic1319_35(271, (3438690852961536256L ^ life4_3)), __invokedynamic1319_36(14002, (7557262531177905827L ^ life4_3)));
    }
    return;
}
public static void h1319_0(moom.Oo p0) throws Throwable {
    throw __call1131900_0(p0);
}
public static void h1319_1(moom.Oo p0) throws Throwable {
    throw __call1131901_0(p0);
}
public static void h1319_2(moom.Oo p0) throws Throwable {
    throw __call1131902_0(p0);
}
public static void h1319_3(moom.Oo p0) throws Throwable {
    throw __call1131903_0(p0);
}
private static native long __fieldRead1319_0() throws Throwable;
private static native void __call1319_1(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1319_2(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1319_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead1319_4() throws Throwable;
private static native void __call1319_5(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __fieldRead1319_6(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __fieldRead1319_7(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __fieldRead1319_8(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __fieldRead1319_9(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __fieldRead1319_10(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __fieldRead1319_11(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native void __call1319_12(net.minecraft.client.gui.GuiRepair a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic1319_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic1319_14(int a0, long a1) throws Throwable;
private static native int __fieldRead1319_15(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native moom.wk __fieldRead1319_16(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native moom.wB __call1319_17(moom.wk a0, int a1) throws Throwable;
private static native boolean __call1319_18(moom.wB a0) throws Throwable;
private static native int __invokedynamic1319_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic1319_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic1319_21(int a0, long a1) throws Throwable;
private static native void __call1319_22(net.minecraft.client.gui.GuiRepair a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native moom.wk __fieldRead1319_23(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native moom.wB __call1319_24(moom.wk a0, int a1) throws Throwable;
private static native boolean __call1319_25(moom.wB a0) throws Throwable;
private static native moom.wk __fieldRead1319_26(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native moom.wB __call1319_27(moom.wk a0, int a1) throws Throwable;
private static native boolean __call1319_28(moom.wB a0) throws Throwable;
private static native moom.wk __fieldRead1319_29(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native moom.wB __call1319_30(moom.wk a0, int a1) throws Throwable;
private static native boolean __call1319_31(moom.wB a0) throws Throwable;
private static native int __invokedynamic1319_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic1319_33(int a0, long a1) throws Throwable;
private static native int __fieldRead1319_34(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __invokedynamic1319_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic1319_36(int a0, long a1) throws Throwable;
private static native void __call1319_37(net.minecraft.client.gui.GuiRepair a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native java.lang.Exception __call1131900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e290c101b868e80d9542(net.minecraft.client.gui.GuiRepair a0, moom.v8 a1, int a2, net.minecraft.item.ItemStack a3) throws E;
private static final class __SourceHandler_e290c101b868e80d9542 {

public static void f2277(net.minecraft.client.gui.GuiRepair receiver, moom.v8 p0, int p1, net.minecraft.item.ItemStack p2) throws Throwable {
    if ((p1 == 0)) {
        moom.hJ spill2277_0 = __fieldRead2277_0(receiver);
        __call2277_2(spill2277_0, ((p2 == null) ? "" : __call2277_1(p2)));
        moom.hJ spill2277_1 = __fieldRead2277_3(receiver);
        __call2277_4(spill2277_1, ((p2 != null) ? 1 : 0));
        if ((p2 != null)) {
        __call2277_5(receiver);
    }
    }
    return;
}
public static void h2277_0(moom.Oo p0) throws Throwable {
    throw __call1227700_0(p0);
}
public static void h2277_1(moom.Oo p0) throws Throwable {
    throw __call1227701_0(p0);
}
public static void h2277_2(moom.Oo p0) throws Throwable {
    throw __call1227702_0(p0);
}
public static void h2277_3(moom.Oo p0) throws Throwable {
    throw __call1227703_0(p0);
}
private static native moom.hJ __fieldRead2277_0(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native java.lang.String __call2277_1(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __call2277_2(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native moom.hJ __fieldRead2277_3(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native void __call2277_4(moom.hJ a0, int a1) throws Throwable;
private static native void __call2277_5(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native java.lang.Exception __call1227700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1227701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1227702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1227703_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b320eb0353bbbeeac76a(net.minecraft.client.gui.GuiRepair a0) throws E;
private static final class __SourceHandler_b320eb0353bbbeeac76a {

public static void f2278(net.minecraft.client.gui.GuiRepair receiver) throws Throwable {
    java.lang.String life1_3;
    moom.wB life2_8;
    life1_3 = __call2278_1(__fieldRead2278_0(receiver));
    life2_8 = __call2278_3(__fieldRead2278_2(receiver), 0);
    if ((life2_8 != null)) {
        if (__call2278_4(life2_8)) {
        if ((!__call2278_6(__call2278_5(life2_8)))) {
        if (__call2278_9(life1_3, __call2278_8(__call2278_7(life2_8)))) {
        life1_3 = "";
    }
    }
    }
    }
    __call2278_11(__fieldRead2278_10(receiver), life1_3);
    __call2278_17(__fieldRead2278_14(__fieldRead2278_13(__fieldRead2278_12(receiver))), new moom.zq("MC|ItemName", __call2278_16(new net.minecraft.network.PacketBuffer(__call2278_15()), life1_3)));
    return;
}
public static void h2278_0(moom.Oo p0) throws Throwable {
    throw __call1227800_0(p0);
}
public static void h2278_1(moom.Oo p0) throws Throwable {
    throw __call1227801_0(p0);
}
public static void h2278_2(moom.Oo p0) throws Throwable {
    throw __call1227802_0(p0);
}
private static native moom.hJ __fieldRead2278_0(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native java.lang.String __call2278_1(moom.hJ a0) throws Throwable;
private static native moom.wk __fieldRead2278_2(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native moom.wB __call2278_3(moom.wk a0, int a1) throws Throwable;
private static native boolean __call2278_4(moom.wB a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call2278_5(moom.wB a0) throws Throwable;
private static native boolean __call2278_6(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call2278_7(moom.wB a0) throws Throwable;
private static native java.lang.String __call2278_8(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call2278_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.wk __fieldRead2278_10(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native void __call2278_11(moom.wk a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2278_12(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead2278_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead2278_14(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call2278_15() throws Throwable;
private static native net.minecraft.network.PacketBuffer __call2278_16(net.minecraft.network.PacketBuffer a0, java.lang.String a1) throws Throwable;
private static native void __call2278_17(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zq a1) throws Throwable;
private static native java.lang.Exception __call1227800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1227801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1227802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_87ac9ba18457d06c8c96(net.minecraft.client.gui.GuiRepair a0, int a1, int a2) throws E;
private static final class __SourceHandler_87ac9ba18457d06c8c96 {

public static void f1320(net.minecraft.client.gui.GuiRepair receiver, int p0, int p1) throws Throwable {
    long life3_3;
    int life5_30;
    int life6_32;
    java.lang.String life7_44;
    int life8_124;
    int life9_138;
    int life10_144;
    forward_join_249: {
    forward_join_239: {
    forward_join_201: {
    forward_join_96: {
    forward_join_81: {
    forward_join_72: {
    life3_3 = (__fieldRead1320_0() ^ 108629846871358L);
    __call1320_1();
    __call1320_2();
    __call1320_6(__fieldRead1320_3(receiver), __call1320_4("container.repair", new java.lang.Object[0]), 0x1.ep5f, 0x1.8p2f, __invokedynamic1320_5(26980, (2671575584657509854L ^ life3_3)));
    if (!((__fieldRead1320_8(__fieldRead1320_7(receiver)) > 0))) { break forward_join_249; }
    life5_30 = __invokedynamic1320_9(430, (3196840174921114885L ^ life3_3));
    life6_32 = 1;
    life7_44 = __call1320_13("container.repair.cost", new java.lang.Object[] {__call1320_12(__fieldRead1320_11(__fieldRead1320_10(receiver)))});
    if (!((__fieldRead1320_15(__fieldRead1320_14(receiver)) >= __invokedynamic1320_16(20308, (2156798492742659053L ^ life3_3))))) { break forward_join_72; }
    if (!((!__fieldRead1320_20(__fieldRead1320_19(__fieldRead1320_18(__fieldRead1320_17(receiver))))))) { break forward_join_72; }
    life7_44 = __call1320_21("container.repair.expensive", new java.lang.Object[0]);
    life5_30 = __invokedynamic1320_22(15887, (7205510503418682032L ^ life3_3));
    break forward_join_96;
    }
    if (!((!__call1320_25(__call1320_24(__fieldRead1320_23(receiver), 2))))) { break forward_join_81; }
    life6_32 = 0;
    break forward_join_96;
    }
    if (!((!__call1320_30(__call1320_27(__fieldRead1320_26(receiver), 2), __fieldRead1320_29(__fieldRead1320_28(receiver)))))) { break forward_join_96; }
    life5_30 = __invokedynamic1320_31(5605, (6191140465366987087L ^ life3_3));
    }
    if (!((life6_32 != 0))) { break forward_join_249; }
    life8_124 = ((__invokedynamic1320_32(577, (1810790668364801782L ^ life3_3)) | ((life5_30 & __invokedynamic1320_33(14647, (4681491574772915586L ^ life3_3))) >> 2)) | (life5_30 & __invokedynamic1320_34(88, (6999535917087941877L ^ life3_3))));
    life9_138 = ((__fieldRead1320_35(receiver) - __invokedynamic1320_36(16920, (3396365927977395878L ^ life3_3))) - __call1320_38(__fieldRead1320_37(receiver), life7_44));
    life10_144 = __invokedynamic1320_39(30608, (8763579727865647916L ^ life3_3));
    if (!(__call1320_41(__fieldRead1320_40(receiver)))) { break forward_join_201; }
    __call1320_46((life9_138 - 3), (life10_144 - 2), (__fieldRead1320_42(receiver) - __invokedynamic1320_43(31642, (7328837322180370209L ^ life3_3))), (life10_144 + __invokedynamic1320_44(21777, (1131007578357379490L ^ life3_3))), __invokedynamic1320_45(88, (6999535917087941877L ^ life3_3)));
    __call1320_51((life9_138 - 2), (life10_144 - 1), (__fieldRead1320_47(receiver) - __invokedynamic1320_48(32059, (1426839574581254537L ^ life3_3))), (life10_144 + __invokedynamic1320_49(16306, (3726978473747307291L ^ life3_3))), __invokedynamic1320_50(24078, (9137862038209837734L ^ life3_3)));
    break forward_join_239;
    }
    __call1320_53(__fieldRead1320_52(receiver), life7_44, ((float) life9_138), ((float) (life10_144 + 1)), life8_124);
    __call1320_55(__fieldRead1320_54(receiver), life7_44, ((float) (life9_138 + 1)), ((float) life10_144), life8_124);
    __call1320_57(__fieldRead1320_56(receiver), life7_44, ((float) (life9_138 + 1)), ((float) (life10_144 + 1)), life8_124);
    }
    __call1320_59(__fieldRead1320_58(receiver), life7_44, ((float) life9_138), ((float) life10_144), life5_30);
    }
    __call1320_60();
    return;
}
public static void h1320_0(moom.Oo p0) throws Throwable {
    throw __call1132000_0(p0);
}
public static void h1320_1(moom.Oo p0) throws Throwable {
    throw __call1132001_0(p0);
}
private static native long __fieldRead1320_0() throws Throwable;
private static native void __call1320_1() throws Throwable;
private static native void __call1320_2() throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1320_3(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native java.lang.String __call1320_4(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __invokedynamic1320_5(int a0, long a1) throws Throwable;
private static native int __call1320_6(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native moom.wk __fieldRead1320_7(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __fieldRead1320_8(moom.wk a0) throws Throwable;
private static native int __invokedynamic1320_9(int a0, long a1) throws Throwable;
private static native moom.wk __fieldRead1320_10(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __fieldRead1320_11(moom.wk a0) throws Throwable;
private static native java.lang.Integer __call1320_12(int a0) throws Throwable;
private static native java.lang.String __call1320_13(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.wk __fieldRead1320_14(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __fieldRead1320_15(moom.wk a0) throws Throwable;
private static native int __invokedynamic1320_16(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1320_17(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1320_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead1320_19(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native boolean __fieldRead1320_20(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native java.lang.String __call1320_21(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __invokedynamic1320_22(int a0, long a1) throws Throwable;
private static native moom.wk __fieldRead1320_23(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native moom.wB __call1320_24(moom.wk a0, int a1) throws Throwable;
private static native boolean __call1320_25(moom.wB a0) throws Throwable;
private static native moom.wk __fieldRead1320_26(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native moom.wB __call1320_27(moom.wk a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead1320_28(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __fieldRead1320_29(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native boolean __call1320_30(moom.wB a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native int __invokedynamic1320_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic1320_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic1320_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic1320_34(int a0, long a1) throws Throwable;
private static native int __fieldRead1320_35(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __invokedynamic1320_36(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1320_37(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __call1320_38(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1320_39(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1320_40(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native boolean __call1320_41(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __fieldRead1320_42(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __invokedynamic1320_43(int a0, long a1) throws Throwable;
private static native int __invokedynamic1320_44(int a0, long a1) throws Throwable;
private static native int __invokedynamic1320_45(int a0, long a1) throws Throwable;
private static native void __call1320_46(int a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native int __fieldRead1320_47(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __invokedynamic1320_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic1320_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic1320_50(int a0, long a1) throws Throwable;
private static native void __call1320_51(int a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1320_52(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __call1320_53(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1320_54(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __call1320_55(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1320_56(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __call1320_57(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1320_58(net.minecraft.client.gui.GuiRepair a0) throws Throwable;
private static native int __call1320_59(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native void __call1320_60() throws Throwable;
private static native java.lang.Exception __call1132000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1132001_0(moom.Oo a0) throws Throwable;

}


protected void b(int p0, int p1) { __sourceHandlerCall_87ac9ba18457d06c8c96(this, p0, p1); }


private void b__sourceReturn_da8c82d5d4() { __sourceHandlerCall_b320eb0353bbbeeac76a(this); }


public void c__Void() {
long local1_life2 = (net.minecraft.client.gui.GuiRepair.cb ^ 75026600726419L);
    super.c__Void();
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(true)));
    int local3_life7 = ((this.k - this.x) / 2);
    int local4_life10 = ((this.l - this.y) / 2);
    this.ab = ((moom.hJ)(new moom.hJ(0, this.p, (local3_life7 + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite795_13(10196, (5685643145685074383L ^ local1_life2))), (local4_life10 + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite795_15(21819, (3128830109527274283L ^ local1_life2))), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite795_17(15464, (8320219429989718630L ^ local1_life2)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite795_19(9980, (230723069611737328L ^ local1_life2)))));
    ((moom.hJ)(this.ab)).f(((int)(-1)));
    ((moom.hJ)(this.ab)).g(((int)(-1)));
    ((moom.hJ)(this.ab)).a(((boolean)(false)));
    ((moom.hJ)(this.ab)).e(((int)(__sourceIntrinsic_7ac46ee229a8_originalDynamicSite795_29(32767, (4494031403670788579L ^ local1_life2)))));
    ((moom.v8)(this.z)).b(((net.minecraft.inventory.ICrafting)(this)));
    ((moom.v8)(this.z)).a(((net.minecraft.inventory.ICrafting)(this)));
    return;
}


private static java.lang.Exception c(java.lang.Exception p0) {
return p0;
}


public void h() {
super.h();
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    ((moom.v8)(this.z)).b(((net.minecraft.inventory.ICrafting)(this)));
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10327_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiRepair.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30051;
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
            throw new RuntimeException("moom/hk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         pb[var3] = var15;
      }

      return pb[var3];
}


public void a(int p0, int p1, float p2) {
super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    moom.kZ.f();
    moom.kZ.k();
    ((moom.hJ)(this.ab)).d__Void();
    return;
}


protected void a(int p0, int p1, int p2) throws java.io.IOException {
super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    ((moom.hJ)(this.ab)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_84f71ee459e6f939e08e(this, p0, p1); }


public void a(moom.v8 p0, java.util.List<net.minecraft.item.ItemStack> p1) {
((net.minecraft.client.gui.GuiRepair)(this)).a(((moom.v8)(p0)), ((int)(0)), ((net.minecraft.item.ItemStack)(((moom.wB)(((moom.v8)(p0)).a__wB(((int)(0))))).a__xW())));
    return;
}


public void a(moom.v8 p0, int p1, net.minecraft.item.ItemStack p2) { __sourceHandlerCall_e290c101b868e80d9542(this, p0, p1, p2); }


public void a(moom.v8 p0, int p1, int p2) {
return;
}


public void a(moom.v8 p0, net.minecraft.inventory.IInventory p1) {
return;
}


protected void a(float p0, int p1, int p2) { __sourceHandlerCall_6870efa18f9980dad8b8(this, p0, p1, p2); }


private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite795_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite795_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite795_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite795_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite795_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10327_0() throws E;
}
