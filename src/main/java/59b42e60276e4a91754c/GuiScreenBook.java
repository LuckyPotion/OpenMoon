package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiScreenBook extends net.minecraft.client.gui.GuiScreen {

private static org.apache.logging.log4j.Logger w;

private static moom.DD x;

private net.minecraft.entity.player.EntityPlayer y;

private net.minecraft.item.ItemStack z;

private boolean A;

private boolean B;

private boolean C;

private int D;

private int E;

private int F;

private int G;

private int H;

private net.minecraft.nbt.NBTTagList I;

private java.lang.String J;

private java.util.List<net.minecraft.util.IChatComponent> K;

private int L;

private moom.gn M;

private moom.gn N;

private moom.gc O;

private moom.gc P;

private moom.gc Q;

private moom.gc R;

private static long S;

private static long[] T;

private static java.lang.Integer[] U;

private static java.util.Map V;

public GuiScreenBook(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.item.ItemStack p1, boolean p2) { super(); __sourceHandlerCall_c2cf0af17e65893cf714(this, p0, p1, p2); }


static {
S = ((long)(((moom._a)(moom._c.a(((long)(-9106811773132291861L)), ((long)(179233263346318249L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(4410375190563L)))));
    V = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiScreenBook.S ^ 74775353032306L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1783_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1783_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1783_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1783_14 = new byte[8];
    (__sourceSpill1783_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1783_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1783_16 = __sourceSpill1783_14;
    ((javax.crypto.Cipher)(__sourceSpill1783_11)).init(((int)(__sourceSpill1783_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1783_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1783_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[32];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÏUhaºÄ\016\026\000ÿúáï¯\022j\007ÿl\002CñÃ´ò\\ |2\001t\001h\030ovdÍ{Ï^. mâÂ[\023\034ÍÞ@¸y\035ÍIúºá×\031C\036\036(ûñx#{±ª¦º÷9èYÔ\023ÿvè¹È%Å\017Jq\033\002\037\037ëÂ®\037U8z<WíÄªbz=>r#-§\033,\020ÎØ`çþ^ë%>AD\002Ü¼#Íþ\031ä©\tóg\017\034@\036þdÕÜ\016²=ú®îºÎ¦*qùT:\035ÄaP\002Îç¯\nì\023\025iûôáy4|iOøàá-Xq\023ô¾7\031\032Ö%ÔÌpÙ¾4¹qû¬S|àBA"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1783_25 = local6_life21;
        int __sourceSpill1783_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1783_25)).substring(((int)(__sourceSpill1783_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1783_30 = local8_life19;
        int __sourceSpill1783_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1783_33 = new byte[8];
        (__sourceSpill1783_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1783_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1783_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1783_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1783_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1783_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1783_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1783_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1783_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1783_34)).doFinal(((byte[])(__sourceSpill1783_33)));
        (__sourceSpill1783_30)[__sourceSpill1783_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "}\t\032ÿ=2Y%nô1ÝT.\026ü"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1783_38 = local6_life21;
        int __sourceSpill1783_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1783_38)).substring(((int)(__sourceSpill1783_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1783_43 = local8_life19;
        int __sourceSpill1783_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1783_46 = new byte[8];
        (__sourceSpill1783_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1783_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1783_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1783_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1783_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1783_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1783_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1783_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1783_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1783_47)).doFinal(((byte[])(__sourceSpill1783_46)));
        (__sourceSpill1783_43)[__sourceSpill1783_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    T = ((long[])(local8_life19));
    U = ((java.lang.Integer[])(new java.lang.Integer[32]));
    w = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    x = ((moom.DD)(new moom.DD("textures/gui/book.png")));
}

private static native <E extends Throwable> void __sourceHandlerCall_c2cf0af17e65893cf714(net.minecraft.client.gui.GuiScreenBook a0, net.minecraft.entity.player.EntityPlayer a1, net.minecraft.item.ItemStack a2, boolean a3) throws E;
private static final class __SourceHandler_c2cf0af17e65893cf714 {

public static void f532(net.minecraft.client.gui.GuiScreenBook receiver, net.minecraft.entity.player.EntityPlayer p0, net.minecraft.item.ItemStack p1, boolean p2) throws Throwable {
    long life4_3;
    net.minecraft.nbt.NBTTagCompound life6_43;
    life4_3 = (__fieldRead532_0() ^ 31538085077641L);
    __directSuperInit532_1(receiver);
    __fieldWrite532_3(receiver, __invokedynamic532_2(26426, (4603025238503097800L ^ life4_3)));
    __fieldWrite532_5(receiver, __invokedynamic532_4(26426, (4603025238503097800L ^ life4_3)));
    __fieldWrite532_6(receiver, 1);
    __fieldWrite532_7(receiver, "");
    __fieldWrite532_8(receiver, -1);
    __fieldWrite532_9(receiver, p0);
    __fieldWrite532_10(receiver, p1);
    __fieldWrite532_11(receiver, p2);
    if (__call532_12(p1)) {
        life6_43 = __call532_13(p1);
        __fieldWrite532_16(receiver, __call532_15(life6_43, "pages", __invokedynamic532_14(2474, (6828275253207231302L ^ life4_3))));
        if ((__fieldRead532_17(receiver) != null)) {
        __fieldWrite532_21(receiver, __cast532_20(__call532_19(__fieldRead532_18(receiver))));
        __fieldWrite532_24(receiver, __call532_23(__fieldRead532_22(receiver)));
        if ((__fieldRead532_25(receiver) < 1)) {
        __fieldWrite532_26(receiver, 1);
    } else {
        
    }
    } else {
        
    }
    } else {
        
    }
    if ((__fieldRead532_27(receiver) == null)) {
        if (p2) {
        __fieldWrite532_28(receiver, new net.minecraft.nbt.NBTTagList());
        __call532_30(__fieldRead532_29(receiver), new moom.yA(""));
        __fieldWrite532_31(receiver, 1);
    } else {
        
    }
    } else {
        
    }
    return;
}
public static void h532_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3053200_0(p0);
}
public static void h532_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3053201_0(p0);
}
public static void h532_2(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3053202_0(p0);
}
public static void h532_3(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3053203_0(p0);
}
private static native long __fieldRead532_0() throws Throwable;
private static native void __directSuperInit532_1(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic532_2(int a0, long a1) throws Throwable;
private static native void __fieldWrite532_3(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native int __invokedynamic532_4(int a0, long a1) throws Throwable;
private static native void __fieldWrite532_5(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native void __fieldWrite532_6(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native void __fieldWrite532_7(net.minecraft.client.gui.GuiScreenBook a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite532_8(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native void __fieldWrite532_9(net.minecraft.client.gui.GuiScreenBook a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native void __fieldWrite532_10(net.minecraft.client.gui.GuiScreenBook a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native void __fieldWrite532_11(net.minecraft.client.gui.GuiScreenBook a0, boolean a1) throws Throwable;
private static native boolean __call532_12(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call532_13(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __invokedynamic532_14(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call532_15(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite532_16(net.minecraft.client.gui.GuiScreenBook a0, net.minecraft.nbt.NBTTagList a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead532_17(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead532_18(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call532_19(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __cast532_20(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native void __fieldWrite532_21(net.minecraft.client.gui.GuiScreenBook a0, net.minecraft.nbt.NBTTagList a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead532_22(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call532_23(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native void __fieldWrite532_24(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native int __fieldRead532_25(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite532_26(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead532_27(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite532_28(net.minecraft.client.gui.GuiScreenBook a0, net.minecraft.nbt.NBTTagList a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead532_29(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call532_30(net.minecraft.nbt.NBTTagList a0, moom.yA a1) throws Throwable;
private static native void __fieldWrite532_31(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3053200_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call3053201_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call3053202_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call3053203_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ab851d9cb9eea6512920(net.minecraft.client.gui.GuiScreenBook a0) throws E;
private static final class __SourceHandler_ab851d9cb9eea6512920 {

public static void f1328(net.minecraft.client.gui.GuiScreenBook receiver) throws Throwable {
    moom.gn forwardValue1328_15_0;
    moom.gn forwardValue1328_17_0;
    moom.gn forwardValue1328_18_0;
    int forwardValue1328_18_1;
    moom.gn forwardValue1328_29_0;
    moom.gn forwardValue1328_30_0;
    int forwardValue1328_30_1;
    moom.gc forwardValue1328_39_0;
    moom.gc forwardValue1328_41_0;
    moom.gc forwardValue1328_42_0;
    int forwardValue1328_42_1;
    moom.gc forwardValue1328_53_0;
    moom.gc forwardValue1328_54_0;
    int forwardValue1328_54_1;
    moom.gc forwardValue1328_74_0;
    moom.gc forwardValue1328_75_0;
    int forwardValue1328_75_1;
    moom.gn spill1328_0;
    moom.gn spill1328_1;
    moom.gc spill1328_2;
    moom.gc spill1328_3;
    moom.gc spill1328_4;
    forward_join_76: {
    forward_join_75: {
    forward_join_74: {
    forward_join_54: {
    forward_join_53: {
    forward_join_42: {
    forward_join_41: {
    forward_join_39: {
    forward_join_30: {
    forward_join_29: {
    forward_join_18: {
    forward_join_17: {
    forward_join_15: {
    spill1328_0 = __fieldRead1328_0(receiver);
    if (!((!__fieldRead1328_1(receiver)))) {
        forwardValue1328_17_0 = spill1328_0;
        break forward_join_17;
    }
    if (!((__fieldRead1328_2(receiver) >= (__fieldRead1328_3(receiver) - 1)))) {
        forwardValue1328_15_0 = spill1328_0;
        break forward_join_15;
    }
    if (!(__fieldRead1328_4(receiver))) {
        forwardValue1328_17_0 = spill1328_0;
        break forward_join_17;
    }
    forwardValue1328_15_0 = spill1328_0;
    }
    forwardValue1328_18_0 = forwardValue1328_15_0;
    forwardValue1328_18_1 = 1;
    break forward_join_18;
    }
    forwardValue1328_18_0 = forwardValue1328_17_0;
    forwardValue1328_18_1 = 0;
    }
    __fieldWrite1328_5(forwardValue1328_18_0, forwardValue1328_18_1);
    spill1328_1 = __fieldRead1328_6(receiver);
    if (!((!__fieldRead1328_7(receiver)))) {
        forwardValue1328_29_0 = spill1328_1;
        break forward_join_29;
    }
    if (!((__fieldRead1328_8(receiver) > 0))) {
        forwardValue1328_29_0 = spill1328_1;
        break forward_join_29;
    }
    forwardValue1328_30_0 = spill1328_1;
    forwardValue1328_30_1 = 1;
    break forward_join_30;
    }
    forwardValue1328_30_0 = forwardValue1328_29_0;
    forwardValue1328_30_1 = 0;
    }
    __fieldWrite1328_9(forwardValue1328_30_0, forwardValue1328_30_1);
    spill1328_2 = __fieldRead1328_10(receiver);
    if (!(__fieldRead1328_11(receiver))) {
        forwardValue1328_39_0 = spill1328_2;
        break forward_join_39;
    }
    if (!((!__fieldRead1328_12(receiver)))) {
        forwardValue1328_41_0 = spill1328_2;
        break forward_join_41;
    }
    forwardValue1328_39_0 = spill1328_2;
    }
    forwardValue1328_42_0 = forwardValue1328_39_0;
    forwardValue1328_42_1 = 1;
    break forward_join_42;
    }
    forwardValue1328_42_0 = forwardValue1328_41_0;
    forwardValue1328_42_1 = 0;
    }
    __fieldWrite1328_13(forwardValue1328_42_0, forwardValue1328_42_1);
    if (!(__fieldRead1328_14(receiver))) {
        break forward_join_76;
    }
    spill1328_3 = __fieldRead1328_15(receiver);
    if (!((!__fieldRead1328_16(receiver)))) {
        forwardValue1328_53_0 = spill1328_3;
        break forward_join_53;
    }
    forwardValue1328_54_0 = spill1328_3;
    forwardValue1328_54_1 = 1;
    break forward_join_54;
    }
    forwardValue1328_54_0 = forwardValue1328_53_0;
    forwardValue1328_54_1 = 0;
    }
    __fieldWrite1328_17(forwardValue1328_54_0, forwardValue1328_54_1);
    __fieldWrite1328_20(__fieldRead1328_18(receiver), __fieldRead1328_19(receiver));
    __fieldWrite1328_23(__fieldRead1328_21(receiver), __fieldRead1328_22(receiver));
    spill1328_4 = __fieldRead1328_24(receiver);
    if (!((__call1328_27(__call1328_26(__fieldRead1328_25(receiver))) > 0))) {
        forwardValue1328_74_0 = spill1328_4;
        break forward_join_74;
    }
    forwardValue1328_75_0 = spill1328_4;
    forwardValue1328_75_1 = 1;
    break forward_join_75;
    }
    forwardValue1328_75_0 = forwardValue1328_74_0;
    forwardValue1328_75_1 = 0;
    }
    __fieldWrite1328_28(forwardValue1328_75_0, forwardValue1328_75_1);
    }
    return;
}
public static void h1328_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1132800_0(p0);
}
public static void h1328_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1132801_0(p0);
}
public static void h1328_2(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1132802_0(p0);
}
public static void h1328_3(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1132803_0(p0);
}
public static void h1328_4(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1132804_0(p0);
}
public static void h1328_5(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1132805_0(p0);
}
public static void h1328_6(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1132806_0(p0);
}
public static void h1328_7(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1132807_0(p0);
}
public static void h1328_8(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1132808_0(p0);
}
public static void h1328_9(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1132809_0(p0);
}
private static native moom.gn __fieldRead1328_0(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __fieldRead1328_1(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead1328_2(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead1328_3(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __fieldRead1328_4(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite1328_5(moom.gn a0, int a1) throws Throwable;
private static native moom.gn __fieldRead1328_6(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __fieldRead1328_7(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead1328_8(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite1328_9(moom.gn a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1328_10(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __fieldRead1328_11(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __fieldRead1328_12(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite1328_13(moom.gc a0, int a1) throws Throwable;
private static native boolean __fieldRead1328_14(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native moom.gc __fieldRead1328_15(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __fieldRead1328_16(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite1328_17(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1328_18(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __fieldRead1328_19(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite1328_20(moom.gc a0, boolean a1) throws Throwable;
private static native moom.gc __fieldRead1328_21(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __fieldRead1328_22(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite1328_23(moom.gc a0, boolean a1) throws Throwable;
private static native moom.gc __fieldRead1328_24(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __fieldRead1328_25(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __call1328_26(java.lang.String a0) throws Throwable;
private static native int __call1328_27(java.lang.String a0) throws Throwable;
private static native void __fieldWrite1328_28(moom.gc a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1132800_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1132801_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1132802_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1132803_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1132804_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1132805_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1132806_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1132807_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1132808_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1132809_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_791422cfb3c7ce5a9135(net.minecraft.client.gui.GuiScreenBook a0, char a1, int a2) throws E;
private static final class __SourceHandler_791422cfb3c7ce5a9135 {

public static void f2302(net.minecraft.client.gui.GuiScreenBook receiver, char p0, int p1) throws Throwable {
    __call2302_0(receiver, p0, p1);
    if (__fieldRead2302_1(receiver)) {
        if (__fieldRead2302_2(receiver)) {
        __call2302_3(receiver, p0, p1);
    } else {
        __call2302_4(receiver, p0, p1);
    }
    }
    return;
}
public static void h2302_0(java.io.IOException p0) throws Throwable {
    throw __call1230200_0(p0);
}
public static void h2302_1(java.io.IOException p0) throws Throwable {
    throw __call1230201_0(p0);
}
private static native void __call2302_0(net.minecraft.client.gui.GuiScreenBook a0, char a1, int a2) throws Throwable;
private static native boolean __fieldRead2302_1(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __fieldRead2302_2(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call2302_3(net.minecraft.client.gui.GuiScreenBook a0, char a1, int a2) throws Throwable;
private static native void __call2302_4(net.minecraft.client.gui.GuiScreenBook a0, char a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1230200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1230201_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.util.IChatComponent __sourceHandlerCall_b8c818378af6343bd2b3(net.minecraft.client.gui.GuiScreenBook a0, int a1, int a2) throws E;
private static final class __SourceHandler_b8c818378af6343bd2b3 {

public static net.minecraft.util.IChatComponent f562(net.minecraft.client.gui.GuiScreenBook receiver, int p0, int p1) throws Throwable {
    int spill562_0;
    int spill562_1;
    long life3_3;
    int life5_30;
    int life6_46;
    int life7_65;
    int life8_90;
    net.minecraft.util.IChatComponent life9_104;
    int life10_106;
    java.util.Iterator life11_109;
    net.minecraft.util.IChatComponent life12_116;
    forest_join_134: {
    forest_join_132: {
    forest_join_9: {
    life3_3 = (__fieldRead562_0() ^ 102492944871544L);
    if (!((__fieldRead562_1(receiver) == null))) {
        break forest_join_9;
    }
    return null;
    }
    spill562_0 = p0;
    spill562_1 = __fieldRead562_2(receiver);
    __call562_3(receiver);
    life5_30 = ((spill562_0 - ((spill562_1 - __invokedynamic562_4(26426, (4603095025107801913L ^ life3_3))) / 2)) - __invokedynamic562_5(24243, (5154908128397438637L ^ life3_3)));
    life6_46 = (((p1 - 2) - __invokedynamic562_6(20676, (7920924411125702862L ^ life3_3))) - __invokedynamic562_7(20676, (7920924411125702862L ^ life3_3)));
    if (!((life5_30 >= 0))) {
        break forest_join_134;
    }
    if (!((life6_46 >= 0))) {
        break forest_join_134;
    }
    life7_65 = __call562_13((__invokedynamic562_8(24374, (12927439116250922L ^ life3_3)) / __fieldRead562_10(__fieldRead562_9(receiver))), __call562_12(__fieldRead562_11(receiver)));
    if (!((life5_30 <= __invokedynamic562_14(6430, (1165748014382704909L ^ life3_3))))) {
        break forest_join_134;
    }
    if (!((life6_46 < ((__fieldRead562_17(__fieldRead562_16(__fieldRead562_15(receiver))) * life7_65) + life7_65)))) {
        break forest_join_134;
    }
    life8_90 = (life6_46 / __fieldRead562_20(__fieldRead562_19(__fieldRead562_18(receiver))));
    if (!((life8_90 >= 0))) {
        break forest_join_134;
    }
    if (!((life8_90 < __call562_22(__fieldRead562_21(receiver))))) {
        break forest_join_134;
    }
    life9_104 = __cast562_25(__call562_24(__fieldRead562_23(receiver), life8_90));
    life10_106 = 0;
    life11_109 = __call562_26(life9_104);
    forest_cycle_107: while (true) {
    forest_join_131: {
    if (!(__call562_27(life11_109))) {
        break forest_join_134;
    }
    life12_116 = __cast562_29(__call562_28(life11_109));
    if (!((__instanceOf562_30(life12_116) != 0))) {
        break forest_join_131;
    }
    life10_106 = (life10_106 + __call562_35(__fieldRead562_32(__fieldRead562_31(receiver)), __call562_34(__cast562_33(life12_116))));
    if (!((life10_106 > life5_30))) {
        break forest_join_131;
    }
    break forest_join_132;
    }
    continue forest_cycle_107;
    }
    }
    return life12_116;
    }
    return null;
}
public static net.minecraft.util.IChatComponent h562_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3056200_0(p0);
}
public static net.minecraft.util.IChatComponent h562_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3056201_0(p0);
}
public static net.minecraft.util.IChatComponent h562_2(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3056202_0(p0);
}
public static net.minecraft.util.IChatComponent h562_3(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3056203_0(p0);
}
public static net.minecraft.util.IChatComponent h562_4(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3056204_0(p0);
}
private static native long __fieldRead562_0() throws Throwable;
private static native java.util.List __fieldRead562_1(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead562_2(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.Object __call562_3(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic562_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic562_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic562_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic562_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic562_8(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead562_9(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead562_10(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native java.util.List __fieldRead562_11(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call562_12(java.util.List a0) throws Throwable;
private static native int __call562_13(int a0, int a1) throws Throwable;
private static native int __invokedynamic562_14(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead562_15(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead562_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead562_17(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead562_18(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead562_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead562_20(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native java.util.List __fieldRead562_21(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call562_22(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead562_23(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.Object __call562_24(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __cast562_25(java.lang.Object a0) throws Throwable;
private static native java.util.Iterator __call562_26(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native boolean __call562_27(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call562_28(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __cast562_29(java.lang.Object a0) throws Throwable;
private static native int __instanceOf562_30(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead562_31(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead562_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.CM __cast562_33(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native java.lang.String __call562_34(moom.CM a0) throws Throwable;
private static native int __call562_35(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call3056200_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call3056201_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call3056202_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call3056203_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call3056204_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b49aadab773351aa6e6e(net.minecraft.client.gui.GuiScreenBook a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_b49aadab773351aa6e6e {

public static void f992(net.minecraft.client.gui.GuiScreenBook receiver, int p0, int p1, float p2) throws Throwable {
    net.minecraft.client.gui.GuiScreenBook forestValue992_353_0;
    net.minecraft.client.gui.GuiScreenBook forestValue992_354_0;
    java.util.List forestValue992_354_1;
    int spill992_0;
    net.minecraft.client.gui.GuiScreenBook spill992_1;
    int spill992_2;
    int spill992_3;
    int spill992_4;
    int spill992_5;
    int spill992_6;
    java.lang.String spill992_7;
    java.lang.Object[] spill992_8;
    java.lang.String spill992_9;
    java.lang.Object[] spill992_10;
    java.lang.Object[] spill992_11;
    net.minecraft.client.gui.GuiScreenBook spill992_12;
    net.minecraft.client.gui.FontRenderer spill992_13;
    java.lang.String spill992_14;
    int spill992_15;
    long life4_3;
    int life6_27;
    int life7_29;
    java.lang.String life8_57;
    java.lang.String life9_86;
    int life10_91;
    int life11_134;
    java.lang.String life12_177;
    int life13_182;
    java.lang.String life14_227;
    java.lang.String life8_271;
    java.lang.String life9_273;
    net.minecraft.util.IChatComponent life10_340;
    moom.CM life10_366;
    int life10_379;
    int life11_460;
    int life12_462;
    net.minecraft.util.IChatComponent life13_471;
    net.minecraft.util.IChatComponent life12_513;
    forest_join_516: {
    forest_join_504: {
    forest_join_442: {
    forest_join_370: {
    forest_join_366: {
    forest_join_356: {
    forest_join_354: {
    forest_join_353: {
    forest_join_323: {
    forest_join_318: {
    forest_join_302: {
    forest_join_291: {
    forest_join_252: {
    forest_join_81: {
    forest_join_77: {
    life4_3 = (__fieldRead992_0() ^ 111188288134276L);
    __call992_1(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call992_5(__call992_3(__fieldRead992_2(receiver)), __fieldRead992_4());
    spill992_0 = __fieldRead992_6(receiver);
    __call992_7(receiver);
    life6_27 = ((spill992_0 - __invokedynamic992_8(26426, (4603033540707482565L ^ life4_3))) / 2);
    life7_29 = 2;
    spill992_1 = receiver;
    spill992_2 = life6_27;
    spill992_3 = life7_29;
    spill992_4 = 0;
    spill992_5 = 0;
    __call992_9(receiver);
    spill992_6 = __invokedynamic992_10(26426, (4603033540707482565L ^ life4_3));
    __call992_11(receiver);
    __call992_13(spill992_1, spill992_2, spill992_3, spill992_4, spill992_5, spill992_6, __invokedynamic992_12(26426, (4603033540707482565L ^ life4_3)));
    if (!(__fieldRead992_14(receiver))) {
        break forest_join_252;
    }
    life8_57 = __fieldRead992_15(receiver);
    if (!(__fieldRead992_16(receiver))) {
        break forest_join_81;
    }
    if (!((((__fieldRead992_17(receiver) / __invokedynamic992_18(29101, (6688414436112461121L ^ life4_3))) % 2) == 0))) {
        break forest_join_77;
    }
    life8_57 = __invokedynamic992_20(life8_57, __fieldRead992_19());
    break forest_join_81;
    }
    life8_57 = __invokedynamic992_22(life8_57, __fieldRead992_21());
    }
    life9_86 = __call992_23("book.editTitle", new java.lang.Object[0]);
    life10_91 = __call992_25(__fieldRead992_24(receiver), life9_86);
    __call992_31(__fieldRead992_26(receiver), life9_86, ((float) ((life6_27 + __invokedynamic992_27(32308, (6845608508941787844L ^ life4_3))) + ((__invokedynamic992_28(20422, (5965202061487100719L ^ life4_3)) - life10_91) / 2))), ((float) ((life7_29 + __invokedynamic992_29(249, (7852031854581849089L ^ life4_3))) + __invokedynamic992_30(20676, (7920986080720374834L ^ life4_3)))), 0);
    life11_134 = __call992_33(__fieldRead992_32(receiver), life8_57);
    __call992_38(__fieldRead992_34(receiver), life8_57, ((float) ((life6_27 + __invokedynamic992_35(24243, (5154881832262550097L ^ life4_3))) + ((__invokedynamic992_36(6430, (1165774468901832177L ^ life4_3)) - life11_134) / 2))), ((float) (life7_29 + __invokedynamic992_37(619, (7482199086283497094L ^ life4_3)))), 0);
    spill992_7 = "book.byAuthor";
    java.lang.Object[] __stackOp992_39_0 = new java.lang.Object[1];
    spill992_8 = __stackOp992_39_0;
    (__stackOp992_39_0)[0] = __call992_41(__fieldRead992_40(receiver));
    life12_177 = __call992_42(spill992_7, spill992_8);
    life13_182 = __call992_44(__fieldRead992_43(receiver), life12_177);
    __call992_52(__fieldRead992_45(receiver), __invokedynamic992_47(__fieldRead992_46(), life12_177), ((float) ((life6_27 + __invokedynamic992_48(24243, (5154881832262550097L ^ life4_3))) + ((__invokedynamic992_49(6430, (1165774468901832177L ^ life4_3)) - life13_182) / 2))), ((float) ((life7_29 + __invokedynamic992_50(6793, (6153986472475133539L ^ life4_3))) + __invokedynamic992_51(21445, (8685617526002634534L ^ life4_3)))), 0);
    life14_227 = __call992_53("book.finalizeWarning", new java.lang.Object[0]);
    __call992_58(__fieldRead992_54(receiver), life14_227, (life6_27 + __invokedynamic992_55(24243, (5154881832262550097L ^ life4_3))), (life7_29 + __invokedynamic992_56(12726, (1330297774945185107L ^ life4_3))), __invokedynamic992_57(6430, (1165774468901832177L ^ life4_3)), 0);
    break forest_join_516;
    }
    spill992_9 = "book.pageIndicator";
    java.lang.Object[] __stackOp992_59_0 = new java.lang.Object[2];
    spill992_10 = __stackOp992_59_0;
    (__stackOp992_59_0)[0] = __call992_61((__fieldRead992_60(receiver) + 1));
    java.lang.Object[] __stackOp992_62_0 = spill992_10;
    spill992_11 = __stackOp992_62_0;
    (__stackOp992_62_0)[1] = __call992_64(__fieldRead992_63(receiver));
    life8_271 = __call992_65(spill992_9, spill992_11);
    life9_273 = "";
    if (!((__fieldRead992_66(receiver) != null))) {
        break forest_join_291;
    }
    if (!((__fieldRead992_67(receiver) >= 0))) {
        break forest_join_291;
    }
    if (!((__fieldRead992_68(receiver) < __call992_70(__fieldRead992_69(receiver))))) {
        break forest_join_291;
    }
    life9_273 = __call992_73(__fieldRead992_71(receiver), __fieldRead992_72(receiver));
    }
    if (!(__fieldRead992_74(receiver))) {
        break forest_join_323;
    }
    if (!(__call992_76(__fieldRead992_75(receiver)))) {
        break forest_join_302;
    }
    life9_273 = __invokedynamic992_77(life9_273);
    break forest_join_370;
    }
    if (!((((__fieldRead992_78(receiver) / __invokedynamic992_79(23758, (363191740868182077L ^ life4_3))) % 2) == 0))) {
        break forest_join_318;
    }
    life9_273 = __invokedynamic992_81(life9_273, __fieldRead992_80());
    break forest_join_370;
    }
    life9_273 = __invokedynamic992_83(life9_273, __fieldRead992_82());
    break forest_join_370;
    }
    if (!((__fieldRead992_84(receiver) != __fieldRead992_85(receiver)))) {
        break forest_join_370;
    }
    if (!(__call992_88(__call992_87(__fieldRead992_86(receiver))))) {
        break forest_join_356;
    }
    life10_340 = __call992_89(life9_273);
    spill992_12 = receiver;
    if (!((life10_340 != null))) {
        forestValue992_353_0 = spill992_12;
        break forest_join_353;
    }
    forestValue992_354_0 = spill992_12;
    forestValue992_354_1 = __call992_92(life10_340, __invokedynamic992_90(6430, (1165774468901832177L ^ life4_3)), __fieldRead992_91(receiver), 1, 1, 0, null);
    break forest_join_354;
    }
    forestValue992_354_0 = forestValue992_353_0;
    forestValue992_354_1 = null;
    }
    __fieldWrite992_93(forestValue992_354_0, forestValue992_354_1);
    break forest_join_366;
    }
    life10_366 = new moom.CM(__invokedynamic992_95(__fieldRead992_94()));
    __fieldWrite992_97(receiver, __call992_96(life10_366));
    }
    __fieldWrite992_99(receiver, __fieldRead992_98(receiver));
    }
    life10_379 = __call992_101(__fieldRead992_100(receiver), life8_271);
    spill992_13 = __fieldRead992_102(receiver);
    spill992_14 = life8_271;
    spill992_15 = (life6_27 - life10_379);
    __call992_103(receiver);
    __call992_107(spill992_13, spill992_14, ((float) ((spill992_15 + __invokedynamic992_104(26426, (4603033540707482565L ^ life4_3))) - __invokedynamic992_105(14931, (271237420392326826L ^ life4_3)))), ((float) (life7_29 + __invokedynamic992_106(20676, (7920986080720374834L ^ life4_3)))), 0);
    if (!((__fieldRead992_108(receiver) == null))) {
        break forest_join_442;
    }
    __call992_114(__fieldRead992_109(receiver), life9_273, (life6_27 + __invokedynamic992_110(24243, (5154881832262550097L ^ life4_3))), ((life7_29 + __invokedynamic992_111(20676, (7920986080720374834L ^ life4_3))) + __invokedynamic992_112(20676, (7920986080720374834L ^ life4_3))), __invokedynamic992_113(6430, (1165774468901832177L ^ life4_3)), 0);
    break forest_join_516;
    }
    life11_460 = __call992_120((__invokedynamic992_115(29830, (2001987897708898424L ^ life4_3)) / __fieldRead992_117(__fieldRead992_116(receiver))), __call992_119(__fieldRead992_118(receiver)));
    life12_462 = 0;
    forest_cycle_458: while (true) {
    if (!((life12_462 < life11_460))) {
        break forest_join_504;
    }
    life13_471 = __cast992_123(__call992_122(__fieldRead992_121(receiver), life12_462));
    __call992_131(__fieldRead992_124(receiver), __call992_125(life13_471), ((float) (life6_27 + __invokedynamic992_126(24243, (5154881832262550097L ^ life4_3)))), ((float) (((life7_29 + __invokedynamic992_127(20676, (7920986080720374834L ^ life4_3))) + __invokedynamic992_128(20676, (7920986080720374834L ^ life4_3))) + (life12_462 * __fieldRead992_130(__fieldRead992_129(receiver))))), 0);
    life12_462 += 1;
    continue forest_cycle_458;
    }
    }
    life12_513 = __call992_132(receiver, p0, p1);
    if (!((life12_513 != null))) {
        break forest_join_516;
    }
    __call992_133(receiver, life12_513, p0, p1);
    }
    __call992_134(receiver, p0, p1, p2);
    return;
}
public static void h992_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3099200_0(p0);
}
public static void h992_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3099201_0(p0);
}
public static void h992_2(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3099202_0(p0);
}
public static void h992_3(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3099203_0(p0);
}
public static void h992_4(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3099204_0(p0);
}
public static void h992_5(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3099205_0(p0);
}
public static void h992_6(com.google.gson.JsonParseException p0, net.minecraft.client.gui.GuiScreenBook p1, int p2, int p3, float p4, long p5, int p6, int p7, java.lang.String p8, java.lang.String p9, int p10) throws Throwable {
    net.minecraft.client.gui.FontRenderer spill3099206_0;
    java.lang.String spill3099206_1;
    int spill3099206_2;
    com.google.gson.JsonParseException life12_2;
    int life12_15;
    int life11_96;
    int life13_98;
    net.minecraft.util.IChatComponent life14_107;
    net.minecraft.util.IChatComponent life13_149;
    forest_join_155: {
    forest_join_143: {
    forest_join_81: {
    life12_2 = p0;
    __fieldWrite3099206_0(p1, null);
    __fieldWrite3099206_2(p1, __fieldRead3099206_1(p1));
    life12_15 = __call3099206_4(__fieldRead3099206_3(p1), p8);
    spill3099206_0 = __fieldRead3099206_5(p1);
    spill3099206_1 = p8;
    spill3099206_2 = (p6 - life12_15);
    __call3099206_6(p1);
    __call3099206_10(spill3099206_0, spill3099206_1, ((float) ((spill3099206_2 + __invokedynamic3099206_7(26426, (4603033540707482565L ^ p5))) - __invokedynamic3099206_8(14931, (271237420392326826L ^ p5)))), ((float) (p7 + __invokedynamic3099206_9(20676, (7920986080720374834L ^ p5)))), 0);
    if (!((__fieldRead3099206_11(p1) == null))) {
        break forest_join_81;
    }
    __call3099206_17(__fieldRead3099206_12(p1), p9, (p6 + __invokedynamic3099206_13(24243, (5154881832262550097L ^ p5))), ((p7 + __invokedynamic3099206_14(20676, (7920986080720374834L ^ p5))) + __invokedynamic3099206_15(20676, (7920986080720374834L ^ p5))), __invokedynamic3099206_16(6430, (1165774468901832177L ^ p5)), 0);
    break forest_join_155;
    }
    life11_96 = __call3099206_23((__invokedynamic3099206_18(29830, (2001987897708898424L ^ p5)) / __fieldRead3099206_20(__fieldRead3099206_19(p1))), __call3099206_22(__fieldRead3099206_21(p1)));
    life13_98 = 0;
    forest_cycle_97: while (true) {
    if (!((life13_98 < life11_96))) {
        break forest_join_143;
    }
    life14_107 = __cast3099206_26(__call3099206_25(__fieldRead3099206_24(p1), life13_98));
    __call3099206_34(__fieldRead3099206_27(p1), __call3099206_28(life14_107), ((float) (p6 + __invokedynamic3099206_29(24243, (5154881832262550097L ^ p5)))), ((float) (((p7 + __invokedynamic3099206_30(20676, (7920986080720374834L ^ p5))) + __invokedynamic3099206_31(20676, (7920986080720374834L ^ p5))) + (life13_98 * __fieldRead3099206_33(__fieldRead3099206_32(p1))))), 0);
    life13_98 += 1;
    continue forest_cycle_97;
    }
    }
    life13_149 = __call3099206_35(p1, p2, p3);
    if (!((life13_149 != null))) {
        break forest_join_155;
    }
    __call3099206_36(p1, life13_149, p2, p3);
    }
    __call3099206_37(p1, p2, p3, p4);
    return;
}
public static void h992_7(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3099207_0(p0);
}
public static void h992_8(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3099208_0(p0);
}
private static native long __fieldRead992_0() throws Throwable;
private static native void __call992_1(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead992_2(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call992_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead992_4() throws Throwable;
private static native void __call992_5(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __fieldRead992_6(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.Object __call992_7(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic992_8(int a0, long a1) throws Throwable;
private static native java.lang.Object __call992_9(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic992_10(int a0, long a1) throws Throwable;
private static native java.lang.Object __call992_11(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic992_12(int a0, long a1) throws Throwable;
private static native void __call992_13(net.minecraft.client.gui.GuiScreenBook a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native boolean __fieldRead992_14(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __fieldRead992_15(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __fieldRead992_16(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead992_17(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic992_18(int a0, long a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead992_19() throws Throwable;
private static native java.lang.String __invokedynamic992_20(java.lang.String a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead992_21() throws Throwable;
private static native java.lang.String __invokedynamic992_22(java.lang.String a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native java.lang.String __call992_23(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_24(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call992_25(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_26(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic992_27(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_28(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_30(int a0, long a1) throws Throwable;
private static native int __call992_31(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_32(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call992_33(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_34(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic992_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_37(int a0, long a1) throws Throwable;
private static native int __call992_38(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __fieldRead992_40(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __call992_41(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native java.lang.String __call992_42(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_43(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call992_44(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_45(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead992_46() throws Throwable;
private static native java.lang.String __invokedynamic992_47(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic992_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_50(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_51(int a0, long a1) throws Throwable;
private static native int __call992_52(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native java.lang.String __call992_53(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_54(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic992_55(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_56(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_57(int a0, long a1) throws Throwable;
private static native void __call992_58(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native int __fieldRead992_60(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.Integer __call992_61(int a0) throws Throwable;
private static native int __fieldRead992_63(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.Integer __call992_64(int a0) throws Throwable;
private static native java.lang.String __call992_65(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead992_66(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead992_67(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead992_68(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead992_69(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call992_70(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead992_71(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead992_72(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __call992_73(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native boolean __fieldRead992_74(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_75(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __call992_76(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native java.lang.String __invokedynamic992_77(java.lang.String a0) throws Throwable;
private static native int __fieldRead992_78(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic992_79(int a0, long a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead992_80() throws Throwable;
private static native java.lang.String __invokedynamic992_81(java.lang.String a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead992_82() throws Throwable;
private static native java.lang.String __invokedynamic992_83(java.lang.String a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native int __fieldRead992_84(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead992_85(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead992_86(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call992_87(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call992_88(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call992_89(java.lang.String a0) throws Throwable;
private static native int __invokedynamic992_90(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_91(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.util.List __call992_92(net.minecraft.util.IChatComponent a0, int a1, net.minecraft.client.gui.FontRenderer a2, int a3, int a4, int a5, java.lang.Object a6) throws Throwable;
private static native void __fieldWrite992_93(net.minecraft.client.gui.GuiScreenBook a0, java.util.List a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead992_94() throws Throwable;
private static native java.lang.String __invokedynamic992_95(net.minecraft.util.EnumChatFormatting a0) throws Throwable;
private static native java.util.ArrayList __call992_96(moom.CM a0) throws Throwable;
private static native void __fieldWrite992_97(net.minecraft.client.gui.GuiScreenBook a0, java.util.ArrayList a1) throws Throwable;
private static native int __fieldRead992_98(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite992_99(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_100(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call992_101(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_102(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.Object __call992_103(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic992_104(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_105(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_106(int a0, long a1) throws Throwable;
private static native int __call992_107(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native java.util.List __fieldRead992_108(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_109(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic992_110(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_111(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_112(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_113(int a0, long a1) throws Throwable;
private static native void __call992_114(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native int __invokedynamic992_115(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_116(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead992_117(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native java.util.List __fieldRead992_118(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call992_119(java.util.List a0) throws Throwable;
private static native int __call992_120(int a0, int a1) throws Throwable;
private static native java.util.List __fieldRead992_121(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.Object __call992_122(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __cast992_123(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_124(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __call992_125(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native int __invokedynamic992_126(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_127(int a0, long a1) throws Throwable;
private static native int __invokedynamic992_128(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead992_129(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead992_130(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __call992_131(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native net.minecraft.util.IChatComponent __call992_132(net.minecraft.client.gui.GuiScreenBook a0, int a1, int a2) throws Throwable;
private static native void __call992_133(net.minecraft.client.gui.GuiScreenBook a0, net.minecraft.util.IChatComponent a1, int a2, int a3) throws Throwable;
private static native void __call992_134(net.minecraft.client.gui.GuiScreenBook a0, int a1, int a2, float a3) throws Throwable;
private static native java.lang.Throwable __call3099200_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call3099201_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call3099202_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call3099203_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call3099204_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call3099205_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native void __fieldWrite3099206_0(net.minecraft.client.gui.GuiScreenBook a0, java.lang.Object a1) throws Throwable;
private static native int __fieldRead3099206_1(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite3099206_2(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead3099206_3(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call3099206_4(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead3099206_5(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.Object __call3099206_6(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic3099206_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic3099206_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic3099206_9(int a0, long a1) throws Throwable;
private static native int __call3099206_10(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native java.util.List __fieldRead3099206_11(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead3099206_12(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic3099206_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic3099206_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic3099206_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic3099206_16(int a0, long a1) throws Throwable;
private static native void __call3099206_17(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native int __invokedynamic3099206_18(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead3099206_19(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead3099206_20(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native java.util.List __fieldRead3099206_21(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call3099206_22(java.util.List a0) throws Throwable;
private static native int __call3099206_23(int a0, int a1) throws Throwable;
private static native java.util.List __fieldRead3099206_24(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.Object __call3099206_25(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __cast3099206_26(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead3099206_27(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __call3099206_28(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native int __invokedynamic3099206_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic3099206_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic3099206_31(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead3099206_32(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead3099206_33(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __call3099206_34(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native net.minecraft.util.IChatComponent __call3099206_35(net.minecraft.client.gui.GuiScreenBook a0, int a1, int a2) throws Throwable;
private static native void __call3099206_36(net.minecraft.client.gui.GuiScreenBook a0, net.minecraft.util.IChatComponent a1, int a2, int a3) throws Throwable;
private static native void __call3099206_37(net.minecraft.client.gui.GuiScreenBook a0, int a1, int a2, float a3) throws Throwable;
private static native java.lang.Throwable __call3099207_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call3099208_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_878dde52005adff7d33b(net.minecraft.client.gui.GuiScreenBook a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_878dde52005adff7d33b {

public static void f2305(net.minecraft.client.gui.GuiScreenBook receiver, int p0, int p1, int p2) throws Throwable {
    net.minecraft.util.IChatComponent life4_6;
    if ((p2 == 0)) {
        life4_6 = __call2305_0(receiver, p0, p1);
        if (__call2305_1(receiver, life4_6)) {
        return;
    }
    }
    __call2305_2(receiver, p0, p1, p2);
    return;
}
public static void h2305_0(java.io.IOException p0) throws Throwable {
    throw __call1230500_0(p0);
}
private static native net.minecraft.util.IChatComponent __call2305_0(net.minecraft.client.gui.GuiScreenBook a0, int a1, int a2) throws Throwable;
private static native boolean __call2305_1(net.minecraft.client.gui.GuiScreenBook a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native void __call2305_2(net.minecraft.client.gui.GuiScreenBook a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Throwable __call1230500_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0880e4cc97846c1c4ef4(net.minecraft.client.gui.GuiScreenBook a0, java.lang.String a1) throws E;
private static final class __SourceHandler_0880e4cc97846c1c4ef4 {

public static void f2306(net.minecraft.client.gui.GuiScreenBook receiver, java.lang.String p0) throws Throwable {
    if ((__fieldRead2306_0(receiver) != null)) {
        if ((__fieldRead2306_1(receiver) >= 0)) {
        if ((__fieldRead2306_2(receiver) < __call2306_4(__fieldRead2306_3(receiver)))) {
        __call2306_7(__fieldRead2306_5(receiver), __fieldRead2306_6(receiver), new moom.yA(p0));
        __fieldWrite2306_8(receiver, 1);
    }
    }
    }
    return;
}
public static void h2306_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1230600_0(p0);
}
public static void h2306_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1230601_0(p0);
}
public static void h2306_2(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1230602_0(p0);
}
private static native net.minecraft.nbt.NBTTagList __fieldRead2306_0(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead2306_1(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead2306_2(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead2306_3(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call2306_4(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead2306_5(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead2306_6(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call2306_7(net.minecraft.nbt.NBTTagList a0, int a1, moom.yA a2) throws Throwable;
private static native void __fieldWrite2306_8(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1230600_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1230601_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1230602_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3f2eff547fd6b7930bda(net.minecraft.client.gui.GuiScreenBook a0, net.minecraft.util.IChatComponent a1) throws E;
private static final class __SourceHandler_3f2eff547fd6b7930bda {

public static boolean f225(net.minecraft.client.gui.GuiScreenBook receiver, net.minecraft.util.IChatComponent p0) throws Throwable {
    moom.v2 forwardValue225_7_0;
    moom.v2 life2_9;
    java.lang.String life3_22;
    int life4_27;
    int life3_58;
    forward_join_57: {
    forward_join_43: {
    forward_join_41: {
    forward_join_12: {
    forward_join_7: {
    forward_join_4: {
    if (!((p0 == null))) {
        break forward_join_4;
    }
    forwardValue225_7_0 = null;
    break forward_join_7;
    }
    forwardValue225_7_0 = __call225_1(__call225_0(p0));
    }
    life2_9 = forwardValue225_7_0;
    if (!((life2_9 == null))) {
        break forward_join_12;
    }
    return __integerCategory225_2(0);
    }
    if (!((__call225_3(life2_9) == __fieldRead225_4()))) {
        break forward_join_43;
    }
    life3_22 = __call225_5(life2_9);
    life4_27 = (__call225_6(life3_22) - 1);
    if (!((life4_27 >= 0))) {
        break forward_join_41;
    }
    if (!((life4_27 < __fieldRead225_7(receiver)))) {
        break forward_join_41;
    }
    if (!((life4_27 != __fieldRead225_8(receiver)))) {
        break forward_join_41;
    }
    __fieldWrite225_9(receiver, life4_27);
    __call225_10(receiver);
    return __integerCategory225_11(1);
    }
    return __integerCategory225_12(0);
    }
    life3_58 = __integerCategory225_14(__call225_13(receiver, p0));
    if (!((life3_58 != 0))) {
        break forward_join_57;
    }
    if (!((__call225_15(life2_9) == __fieldRead225_16()))) {
        break forward_join_57;
    }
    __call225_18(__fieldRead225_17(receiver), null);
    }
    return __integerCategory225_19(life3_58);
}
public static boolean h225_0(java.lang.Throwable p0) throws Throwable {
    throw __call2022500_0(p0);
}
public static boolean h225_1(java.lang.Throwable p0) throws Throwable {
    throw __call2022501_0(p0);
}
public static boolean h225_2(java.lang.Throwable p0) throws Throwable {
    throw __call2022502_0(p0);
}
public static boolean h225_3(java.lang.Throwable p0) throws Throwable {
    throw __call2022503_0(p0);
}
public static boolean h225_4(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable local1 = p0;
    return false;
}
public static boolean h225_5(java.lang.Throwable p0) throws Throwable {
    throw __call2022505_0(p0);
}
public static boolean h225_6(java.lang.Throwable p0) throws Throwable {
    throw __call2022506_0(p0);
}
private static native moom.CO __call225_0(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native moom.v2 __call225_1(moom.CO a0) throws Throwable;
private static native boolean __integerCategory225_2(int value) throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __call225_3(moom.v2 a0) throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __fieldRead225_4() throws Throwable;
private static native java.lang.String __call225_5(moom.v2 a0) throws Throwable;
private static native int __call225_6(java.lang.String a0) throws Throwable;
private static native int __fieldRead225_7(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead225_8(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite225_9(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native void __call225_10(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __integerCategory225_11(int value) throws Throwable;
private static native boolean __integerCategory225_12(int value) throws Throwable;
private static native boolean __call225_13(net.minecraft.client.gui.GuiScreenBook a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native int __integerCategory225_14(boolean value) throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __call225_15(moom.v2 a0) throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __fieldRead225_16() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead225_17(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call225_18(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native boolean __integerCategory225_19(int value) throws Throwable;
private static native java.lang.Throwable __call2022500_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2022501_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2022502_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2022503_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2022505_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2022506_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8697209d00ef0040e23e(net.minecraft.client.gui.GuiScreenBook a0, boolean a1) throws E;
private static final class __SourceHandler_8697209d00ef0040e23e {

public static void f2308(net.minecraft.client.gui.GuiScreenBook receiver, boolean p0) throws Throwable {
    java.lang.String life2_31;
    net.minecraft.nbt.NBTTagCompound life2_55;
    java.lang.String life2_69;
    int life3_95;
    java.lang.String life4_105;
    moom.CM life5_110;
    java.lang.String life4_113;
    net.minecraft.network.PacketBuffer life3_132;
    if (__fieldRead2308_0(receiver)) {
        if (__fieldRead2308_1(receiver)) {
        if ((__fieldRead2308_2(receiver) != null)) {
        loop_region_9: while ((__call2308_4(__fieldRead2308_3(receiver)) > 1)) {
        life2_31 = __call2308_8(__fieldRead2308_5(receiver), (__call2308_7(__fieldRead2308_6(receiver)) - 1));
        if ((__call2308_9(life2_31) != 0)) {
        break loop_region_9;
    }
        __call2308_13(__fieldRead2308_10(receiver), (__call2308_12(__fieldRead2308_11(receiver)) - 1));
    }
        if (__call2308_15(__fieldRead2308_14(receiver))) {
        life2_55 = __call2308_17(__fieldRead2308_16(receiver));
        __call2308_19(life2_55, "pages", __fieldRead2308_18(receiver));
    } else {
        __call2308_22(__fieldRead2308_20(receiver), "pages", __fieldRead2308_21(receiver));
    }
        life2_69 = "MC|BEdit";
        if (p0) {
        life2_69 = "MC|BSign";
        __call2308_26(__fieldRead2308_23(receiver), "author", new moom.yA(__call2308_25(__fieldRead2308_24(receiver))));
        __call2308_30(__fieldRead2308_27(receiver), "title", new moom.yA(__call2308_29(__fieldRead2308_28(receiver))));
        life3_95 = 0;
        loop_region_85: while ((life3_95 < __call2308_32(__fieldRead2308_31(receiver)))) {
        life4_105 = __call2308_34(__fieldRead2308_33(receiver), life3_95);
        life5_110 = new moom.CM(life4_105);
        life4_113 = __call2308_35(life5_110);
        __call2308_37(__fieldRead2308_36(receiver), life3_95, new moom.yA(life4_113));
        life3_95 += 1;
    }
        __call2308_40(__fieldRead2308_38(receiver), __fieldRead2308_39());
    }
        life3_132 = new net.minecraft.network.PacketBuffer(__call2308_41());
        __call2308_43(life3_132, __fieldRead2308_42(receiver));
        __call2308_46(__call2308_45(__fieldRead2308_44(receiver)), new moom.zq(life2_69, life3_132));
    }
    }
    }
    return;
}
public static void h2308_0(java.io.IOException p0) throws Throwable {
    throw __call1230800_0(p0);
}
public static void h2308_1(java.io.IOException p0) throws Throwable {
    throw __call1230801_0(p0);
}
public static void h2308_2(java.io.IOException p0) throws Throwable {
    throw __call1230802_0(p0);
}
public static void h2308_3(java.io.IOException p0) throws Throwable {
    throw __call1230803_0(p0);
}
private static native boolean __fieldRead2308_0(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __fieldRead2308_1(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead2308_2(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead2308_3(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call2308_4(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead2308_5(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead2308_6(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call2308_7(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.lang.String __call2308_8(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native int __call2308_9(java.lang.String a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead2308_10(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead2308_11(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call2308_12(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call2308_13(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead2308_14(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __call2308_15(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead2308_16(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call2308_17(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead2308_18(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call2308_19(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead2308_20(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead2308_21(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call2308_22(net.minecraft.item.ItemStack a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead2308_23(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __fieldRead2308_24(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __call2308_25(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __call2308_26(net.minecraft.item.ItemStack a0, java.lang.String a1, moom.yA a2) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead2308_27(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __fieldRead2308_28(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __call2308_29(java.lang.String a0) throws Throwable;
private static native void __call2308_30(net.minecraft.item.ItemStack a0, java.lang.String a1, moom.yA a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead2308_31(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call2308_32(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead2308_33(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __call2308_34(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native java.lang.String __call2308_35(moom.CM a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead2308_36(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call2308_37(net.minecraft.nbt.NBTTagList a0, int a1, moom.yA a2) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead2308_38(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead2308_39() throws Throwable;
private static native void __call2308_40(net.minecraft.item.ItemStack a0, net.minecraft.item.Item a1) throws Throwable;
private static native io.netty.buffer.ByteBuf __call2308_41() throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead2308_42(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call2308_43(net.minecraft.network.PacketBuffer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2308_44(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __call2308_45(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2308_46(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zq a1) throws Throwable;
private static native java.lang.Throwable __call1230800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1230801_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1230802_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1230803_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_da464e61443737aef290(net.minecraft.client.gui.GuiScreenBook a0, moom.gc a1) throws E;
private static final class __SourceHandler_da464e61443737aef290 {

public static void f208(net.minecraft.client.gui.GuiScreenBook receiver, moom.gc p0) throws Throwable {
    forward_join_103: {
    forward_join_101: {
    forward_join_91: {
    forward_join_76: {
    forward_join_62: {
    forward_join_43: {
    forward_join_25: {
    forward_join_14: {
    if (!(__fieldRead208_0(p0))) { break forward_join_103; }
    if (!((__fieldRead208_1(p0) == 0))) { break forward_join_14; }
    __call208_3(__fieldRead208_2(receiver), null);
    __call208_4(receiver, 0);
    break forward_join_101;
    }
    if (!((__fieldRead208_5(p0) == 3))) { break forward_join_25; }
    if (!(__fieldRead208_6(receiver))) { break forward_join_25; }
    __fieldWrite208_7(receiver, 1);
    break forward_join_101;
    }
    if (!((__fieldRead208_8(p0) == 1))) { break forward_join_62; }
    if (!((__fieldRead208_9(receiver) < (__fieldRead208_10(receiver) - 1)))) { break forward_join_43; }
    net.minecraft.client.gui.GuiScreenBook __stackOp208_11_0 = receiver;
    __fieldWrite208_13(__stackOp208_11_0, (__fieldRead208_12(__stackOp208_11_0) + 1));
    break forward_join_101;
    }
    if (!(__fieldRead208_14(receiver))) { break forward_join_101; }
    __call208_15(receiver);
    if (!((__fieldRead208_16(receiver) < (__fieldRead208_17(receiver) - 1)))) { break forward_join_101; }
    net.minecraft.client.gui.GuiScreenBook __stackOp208_18_0 = receiver;
    __fieldWrite208_20(__stackOp208_18_0, (__fieldRead208_19(__stackOp208_18_0) + 1));
    break forward_join_101;
    }
    if (!((__fieldRead208_21(p0) == 2))) { break forward_join_76; }
    if (!((__fieldRead208_22(receiver) > 0))) { break forward_join_101; }
    net.minecraft.client.gui.GuiScreenBook __stackOp208_23_0 = receiver;
    __fieldWrite208_25(__stackOp208_23_0, (__fieldRead208_24(__stackOp208_23_0) - 1));
    break forward_join_101;
    }
    if (!((__fieldRead208_26(p0) == 5))) { break forward_join_91; }
    if (!(__fieldRead208_27(receiver))) { break forward_join_91; }
    __call208_28(receiver, 1);
    __call208_30(__fieldRead208_29(receiver), null);
    break forward_join_101;
    }
    if (!((__fieldRead208_31(p0) == 4))) { break forward_join_101; }
    if (!(__fieldRead208_32(receiver))) { break forward_join_101; }
    __fieldWrite208_33(receiver, 0);
    }
    __call208_34(receiver);
    }
    return;
}
public static void h208_0(java.io.IOException p0) throws Throwable {
    throw __call1020800_0(p0);
}
public static void h208_1(java.io.IOException p0) throws Throwable {
    throw __call1020801_0(p0);
}
public static void h208_2(java.io.IOException p0) throws Throwable {
    throw __call1020802_0(p0);
}
public static void h208_3(java.io.IOException p0) throws Throwable {
    throw __call1020803_0(p0);
}
public static void h208_4(java.io.IOException p0) throws Throwable {
    throw __call1020804_0(p0);
}
public static void h208_5(java.io.IOException p0) throws Throwable {
    throw __call1020805_0(p0);
}
public static void h208_6(java.io.IOException p0) throws Throwable {
    throw __call1020806_0(p0);
}
public static void h208_7(java.io.IOException p0) throws Throwable {
    throw __call1020807_0(p0);
}
public static void h208_8(java.io.IOException p0) throws Throwable {
    throw __call1020808_0(p0);
}
public static void h208_9(java.io.IOException p0) throws Throwable {
    throw __call1020809_0(p0);
}
public static void h208_10(java.io.IOException p0) throws Throwable {
    throw __call1020810_0(p0);
}
public static void h208_11(java.io.IOException p0) throws Throwable {
    throw __call1020811_0(p0);
}
public static void h208_12(java.io.IOException p0) throws Throwable {
    throw __call1020812_0(p0);
}
public static void h208_13(java.io.IOException p0) throws Throwable {
    throw __call1020813_0(p0);
}
private static native boolean __fieldRead208_0(moom.gc a0) throws Throwable;
private static native int __fieldRead208_1(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead208_2(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call208_3(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native void __call208_4(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native int __fieldRead208_5(moom.gc a0) throws Throwable;
private static native boolean __fieldRead208_6(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite208_7(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native int __fieldRead208_8(moom.gc a0) throws Throwable;
private static native int __fieldRead208_9(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead208_10(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead208_12(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite208_13(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native boolean __fieldRead208_14(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call208_15(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead208_16(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead208_17(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead208_19(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite208_20(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native int __fieldRead208_21(moom.gc a0) throws Throwable;
private static native int __fieldRead208_22(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead208_24(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite208_25(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native int __fieldRead208_26(moom.gc a0) throws Throwable;
private static native boolean __fieldRead208_27(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call208_28(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead208_29(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call208_30(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native int __fieldRead208_31(moom.gc a0) throws Throwable;
private static native boolean __fieldRead208_32(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite208_33(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native void __call208_34(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.Throwable __call1020800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1020801_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1020802_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1020803_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1020804_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1020805_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1020806_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1020807_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1020808_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1020809_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1020810_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1020811_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1020812_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1020813_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f0b8bf4503fb84d3243f(net.minecraft.client.gui.GuiScreenBook a0) throws E;
private static final class __SourceHandler_f0b8bf4503fb84d3243f {

public static void f209(net.minecraft.client.gui.GuiScreenBook receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead209_0() ^ 71542307210310L);
    if ((__fieldRead209_1(receiver) != null)) {
        if ((__call209_3(__fieldRead209_2(receiver)) < __invokedynamic209_4(25231, (5327893405433325225L ^ life1_3)))) {
        __call209_6(__fieldRead209_5(receiver), new moom.yA(""));
        net.minecraft.client.gui.GuiScreenBook __stackOp209_7_0 = receiver;
        __fieldWrite209_9(__stackOp209_7_0, (__fieldRead209_8(__stackOp209_7_0) + 1));
        __fieldWrite209_10(receiver, 1);
    }
    }
    return;
}
public static void h209_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1020900_0(p0);
}
public static void h209_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1020901_0(p0);
}
private static native long __fieldRead209_0() throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead209_1(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead209_2(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call209_3(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __invokedynamic209_4(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead209_5(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call209_6(net.minecraft.nbt.NBTTagList a0, moom.yA a1) throws Throwable;
private static native int __fieldRead209_8(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite209_9(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native void __fieldWrite209_10(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1020900_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1020901_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5b31c9c715521c067c68(net.minecraft.client.gui.GuiScreenBook a0, char a1, int a2) throws E;
private static final class __SourceHandler_5b31c9c715521c067c68 {

public static void f2311(net.minecraft.client.gui.GuiScreenBook receiver, char p0, int p1) throws Throwable {
    java.lang.String life3_13;
    if (__call2311_0(p1)) {
        __call2311_2(receiver, __call2311_1());
    } else {
        switch (p1) {
case 14:
{
        life3_13 = __call2311_3(receiver);
        if ((__call2311_4(life3_13) > 0)) {
        __call2311_7(receiver, __call2311_6(life3_13, 0, (__call2311_5(life3_13) - 1)));
    }
        return;
    }
case 28:
case 156:
{
        __call2311_8(receiver, "\n");
        return;
    }
default:
{
        if (__call2311_9(p0)) {
        __call2311_11(receiver, __call2311_10(p0));
    }
        break;
    }
}
    }
    return;
}
public static void h2311_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1231100_0(p0);
}
public static void h2311_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1231101_0(p0);
}
public static void h2311_2(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1231102_0(p0);
}
private static native boolean __call2311_0(int a0) throws Throwable;
private static native java.lang.String __call2311_1() throws Throwable;
private static native void __call2311_2(net.minecraft.client.gui.GuiScreenBook a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2311_3(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call2311_4(java.lang.String a0) throws Throwable;
private static native int __call2311_5(java.lang.String a0) throws Throwable;
private static native java.lang.String __call2311_6(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __call2311_7(net.minecraft.client.gui.GuiScreenBook a0, java.lang.String a1) throws Throwable;
private static native void __call2311_8(net.minecraft.client.gui.GuiScreenBook a0, java.lang.String a1) throws Throwable;
private static native boolean __call2311_9(char a0) throws Throwable;
private static native java.lang.String __call2311_10(char a0) throws Throwable;
private static native void __call2311_11(net.minecraft.client.gui.GuiScreenBook a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call1231100_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1231101_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1231102_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_25ae6702b4479cbbe0b5(net.minecraft.client.gui.GuiScreenBook a0, java.lang.String a1) throws E;
private static final class __SourceHandler_25ae6702b4479cbbe0b5 {

public static void f2312(net.minecraft.client.gui.GuiScreenBook receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String life4_6;
    java.lang.String life5_10;
    int life6_22;
    life2_3 = (__fieldRead2312_0() ^ 89351661565173L);
    life4_6 = __call2312_1(receiver);
    life5_10 = __invokedynamic2312_2(life4_6, p0);
    life6_22 = __call2312_7(__fieldRead2312_3(receiver), __invokedynamic2312_5(life5_10, __fieldRead2312_4()), __invokedynamic2312_6(29266, (2608515681409402564L ^ life2_3)));
    if ((life6_22 <= __invokedynamic2312_8(24374, (12913881273805735L ^ life2_3)))) {
        if ((__call2312_9(life5_10) < __invokedynamic2312_10(13409, (8191538122314399970L ^ life2_3)))) {
        __call2312_11(receiver, life5_10);
    }
    }
    return;
}
public static void h2312_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1231200_0(p0);
}
public static void h2312_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1231201_0(p0);
}
private static native long __fieldRead2312_0() throws Throwable;
private static native java.lang.String __call2312_1(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __invokedynamic2312_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead2312_3(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead2312_4() throws Throwable;
private static native java.lang.String __invokedynamic2312_5(java.lang.String a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native int __invokedynamic2312_6(int a0, long a1) throws Throwable;
private static native int __call2312_7(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2) throws Throwable;
private static native int __invokedynamic2312_8(int a0, long a1) throws Throwable;
private static native int __call2312_9(java.lang.String a0) throws Throwable;
private static native int __invokedynamic2312_10(int a0, long a1) throws Throwable;
private static native void __call2312_11(net.minecraft.client.gui.GuiScreenBook a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call1231200_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1231201_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_abb591fb8d07d0525965(net.minecraft.client.gui.GuiScreenBook a0) throws E;
private static final class __SourceHandler_abb591fb8d07d0525965 {

public static java.lang.String f1330(net.minecraft.client.gui.GuiScreenBook receiver) throws Throwable {
    java.lang.String forwardValue1330_19_0;
    forward_join_19: {
    forward_join_18: {
    if (!((__fieldRead1330_0(receiver) != null))) {
        break forward_join_18;
    }
    if (!((__fieldRead1330_1(receiver) >= 0))) {
        break forward_join_18;
    }
    if (!((__fieldRead1330_2(receiver) < __call1330_4(__fieldRead1330_3(receiver))))) {
        break forward_join_18;
    }
    forwardValue1330_19_0 = __call1330_7(__fieldRead1330_5(receiver), __fieldRead1330_6(receiver));
    break forward_join_19;
    }
    forwardValue1330_19_0 = "";
    }
    return forwardValue1330_19_0;
}
public static void h1330_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1133000_0(p0);
}
public static void h1330_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1133001_0(p0);
}
public static void h1330_2(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1133002_0(p0);
}
private static native net.minecraft.nbt.NBTTagList __fieldRead1330_0(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead1330_1(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead1330_2(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead1330_3(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call1330_4(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __fieldRead1330_5(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __fieldRead1330_6(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __call1330_7(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1133000_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1133001_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1133002_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c8c7e825f1ef5ed2f645(net.minecraft.client.gui.GuiScreenBook a0, char a1, int a2) throws E;
private static final class __SourceHandler_c8c7e825f1ef5ed2f645 {

public static void f2314(net.minecraft.client.gui.GuiScreenBook receiver, char p0, int p1) throws Throwable {
    long life3_3;
    life3_3 = (__fieldRead2314_0() ^ 121677383124893L);
    switch (p1) {
case 14:
{
        if ((!__call2314_2(__fieldRead2314_1(receiver)))) {
        __fieldWrite2314_7(receiver, __call2314_6(__fieldRead2314_3(receiver), 0, (__call2314_5(__fieldRead2314_4(receiver)) - 1)));
        __call2314_8(receiver);
    }
        return;
    }
case 28:
case 156:
{
        if ((!__call2314_10(__fieldRead2314_9(receiver)))) {
        __call2314_11(receiver, 1);
        __call2314_13(__fieldRead2314_12(receiver), null);
    }
        return;
    }
default:
{
        if ((__call2314_15(__fieldRead2314_14(receiver)) < __invokedynamic2314_16(20676, (7920975593271645995L ^ life3_3)))) {
        if (__call2314_17(p0)) {
        __fieldWrite2314_20(receiver, __invokedynamic2314_19(__fieldRead2314_18(receiver), p0));
        __call2314_21(receiver);
        __fieldWrite2314_22(receiver, 1);
    }
    }
        return;
    }
}
}
public static void h2314_0(java.io.IOException p0) throws Throwable {
    throw __call1231400_0(p0);
}
public static void h2314_1(java.io.IOException p0) throws Throwable {
    throw __call1231401_0(p0);
}
public static void h2314_2(java.io.IOException p0) throws Throwable {
    throw __call1231402_0(p0);
}
public static void h2314_3(java.io.IOException p0) throws Throwable {
    throw __call1231403_0(p0);
}
public static void h2314_4(java.io.IOException p0) throws Throwable {
    throw __call1231404_0(p0);
}
private static native long __fieldRead2314_0() throws Throwable;
private static native java.lang.String __fieldRead2314_1(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __call2314_2(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead2314_3(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __fieldRead2314_4(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call2314_5(java.lang.String a0) throws Throwable;
private static native java.lang.String __call2314_6(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __fieldWrite2314_7(net.minecraft.client.gui.GuiScreenBook a0, java.lang.String a1) throws Throwable;
private static native void __call2314_8(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __fieldRead2314_9(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native boolean __call2314_10(java.lang.String a0) throws Throwable;
private static native void __call2314_11(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2314_12(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call2314_13(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native java.lang.String __fieldRead2314_14(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __call2314_15(java.lang.String a0) throws Throwable;
private static native int __invokedynamic2314_16(int a0, long a1) throws Throwable;
private static native boolean __call2314_17(char a0) throws Throwable;
private static native java.lang.String __fieldRead2314_18(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.String __invokedynamic2314_19(java.lang.String a0, char a1) throws Throwable;
private static native void __fieldWrite2314_20(net.minecraft.client.gui.GuiScreenBook a0, java.lang.String a1) throws Throwable;
private static native void __call2314_21(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __fieldWrite2314_22(net.minecraft.client.gui.GuiScreenBook a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1231400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1231401_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1231402_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1231403_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call1231404_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_34b3924732103709a827(net.minecraft.client.gui.GuiScreenBook a0) throws E;
private static final class __SourceHandler_34b3924732103709a827 {

public static void f563(net.minecraft.client.gui.GuiScreenBook receiver) throws Throwable {
    java.util.List spill563_0;
    net.minecraft.client.gui.GuiScreenBook spill563_1;
    moom.gc spill563_2;
    moom.gc spill563_3;
    int spill563_4;
    int spill563_5;
    int spill563_6;
    moom.gc spill563_7;
    java.util.List spill563_8;
    net.minecraft.client.gui.GuiScreenBook spill563_9;
    moom.gc spill563_10;
    moom.gc spill563_11;
    int spill563_12;
    int spill563_13;
    int spill563_14;
    moom.gc spill563_15;
    java.util.List spill563_16;
    net.minecraft.client.gui.GuiScreenBook spill563_17;
    moom.gc spill563_18;
    moom.gc spill563_19;
    int spill563_20;
    int spill563_21;
    int spill563_22;
    moom.gc spill563_23;
    java.util.List spill563_24;
    net.minecraft.client.gui.GuiScreenBook spill563_25;
    moom.gc spill563_26;
    moom.gc spill563_27;
    int spill563_28;
    int spill563_29;
    int spill563_30;
    moom.gc spill563_31;
    java.util.List spill563_32;
    net.minecraft.client.gui.GuiScreenBook spill563_33;
    moom.gc spill563_34;
    moom.gc spill563_35;
    int spill563_36;
    int spill563_37;
    int spill563_38;
    moom.gc spill563_39;
    int spill563_40;
    java.util.List spill563_41;
    net.minecraft.client.gui.GuiScreenBook spill563_42;
    moom.gn spill563_43;
    moom.gn spill563_44;
    java.util.List spill563_45;
    net.minecraft.client.gui.GuiScreenBook spill563_46;
    moom.gn spill563_47;
    moom.gn spill563_48;
    long life1_3;
    int life3_243;
    int life4_245;
    forest_join_230: {
    forest_join_185: {
    life1_3 = (__fieldRead563_0() ^ 97291925674242L);
    __call563_2(__fieldRead563_1(receiver));
    __call563_3(1);
    if (!(__fieldRead563_4(receiver))) {
        break forest_join_185;
    }
    spill563_0 = __fieldRead563_5(receiver);
    spill563_1 = receiver;
    moom.gc __stackOp563_7_0 = __sourceUninitializedNEW563_6();
    spill563_2 = __stackOp563_7_0;
    spill563_3 = __stackOp563_7_0;
    spill563_4 = 3;
    spill563_5 = ((__fieldRead563_8(receiver) / 2) - __invokedynamic563_9(17144, (7197732086880689027L ^ life1_3)));
    spill563_6 = 4;
    __call563_10(receiver);
    __explicitNewInit563_15(spill563_3, spill563_4, spill563_5, (spill563_6 + __invokedynamic563_11(29958, (7492081246791298164L ^ life1_3))), __invokedynamic563_12(31303, (4453926685208109872L ^ life1_3)), __invokedynamic563_13(11231, (9090851960637207203L ^ life1_3)), __call563_14("book.signButton", new java.lang.Object[0]));
    net.minecraft.client.gui.GuiScreenBook __stackOp563_16_0 = spill563_1;
    moom.gc __stackOp563_16_1 = spill563_2;
    spill563_7 = __stackOp563_16_1;
    __fieldWrite563_17(__stackOp563_16_0, __stackOp563_16_1);
    __call563_18(spill563_0, spill563_7);
    spill563_8 = __fieldRead563_19(receiver);
    spill563_9 = receiver;
    moom.gc __stackOp563_21_0 = __sourceUninitializedNEW563_20();
    spill563_10 = __stackOp563_21_0;
    spill563_11 = __stackOp563_21_0;
    spill563_12 = 0;
    spill563_13 = ((__fieldRead563_22(receiver) / 2) + 2);
    spill563_14 = 4;
    __call563_23(receiver);
    __explicitNewInit563_28(spill563_11, spill563_12, spill563_13, (spill563_14 + __invokedynamic563_24(26426, (4603100767695568451L ^ life1_3))), __invokedynamic563_25(11175, (1226937927699870415L ^ life1_3)), __invokedynamic563_26(4223, (5920109582303430926L ^ life1_3)), __call563_27("gui.done", new java.lang.Object[0]));
    net.minecraft.client.gui.GuiScreenBook __stackOp563_29_0 = spill563_9;
    moom.gc __stackOp563_29_1 = spill563_10;
    spill563_15 = __stackOp563_29_1;
    __fieldWrite563_30(__stackOp563_29_0, __stackOp563_29_1);
    __call563_31(spill563_8, spill563_15);
    spill563_16 = __fieldRead563_32(receiver);
    spill563_17 = receiver;
    moom.gc __stackOp563_34_0 = __sourceUninitializedNEW563_33();
    spill563_18 = __stackOp563_34_0;
    spill563_19 = __stackOp563_34_0;
    spill563_20 = 5;
    spill563_21 = ((__fieldRead563_35(receiver) / 2) - __invokedynamic563_36(2166, (5465794030948651288L ^ life1_3)));
    spill563_22 = 4;
    __call563_37(receiver);
    __explicitNewInit563_42(spill563_19, spill563_20, spill563_21, (spill563_22 + __invokedynamic563_38(26426, (4603100767695568451L ^ life1_3))), __invokedynamic563_39(11175, (1226937927699870415L ^ life1_3)), __invokedynamic563_40(4223, (5920109582303430926L ^ life1_3)), __call563_41("book.finalizeButton", new java.lang.Object[0]));
    net.minecraft.client.gui.GuiScreenBook __stackOp563_43_0 = spill563_17;
    moom.gc __stackOp563_43_1 = spill563_18;
    spill563_23 = __stackOp563_43_1;
    __fieldWrite563_44(__stackOp563_43_0, __stackOp563_43_1);
    __call563_45(spill563_16, spill563_23);
    spill563_24 = __fieldRead563_46(receiver);
    spill563_25 = receiver;
    moom.gc __stackOp563_48_0 = __sourceUninitializedNEW563_47();
    spill563_26 = __stackOp563_48_0;
    spill563_27 = __stackOp563_48_0;
    spill563_28 = 4;
    spill563_29 = ((__fieldRead563_49(receiver) / 2) + 2);
    spill563_30 = 4;
    __call563_50(receiver);
    __explicitNewInit563_55(spill563_27, spill563_28, spill563_29, (spill563_30 + __invokedynamic563_51(26426, (4603100767695568451L ^ life1_3))), __invokedynamic563_52(11175, (1226937927699870415L ^ life1_3)), __invokedynamic563_53(4223, (5920109582303430926L ^ life1_3)), __call563_54("gui.cancel", new java.lang.Object[0]));
    net.minecraft.client.gui.GuiScreenBook __stackOp563_56_0 = spill563_25;
    moom.gc __stackOp563_56_1 = spill563_26;
    spill563_31 = __stackOp563_56_1;
    __fieldWrite563_57(__stackOp563_56_0, __stackOp563_56_1);
    __call563_58(spill563_24, spill563_31);
    break forest_join_230;
    }
    spill563_32 = __fieldRead563_59(receiver);
    spill563_33 = receiver;
    moom.gc __stackOp563_61_0 = __sourceUninitializedNEW563_60();
    spill563_34 = __stackOp563_61_0;
    spill563_35 = __stackOp563_61_0;
    spill563_36 = 0;
    spill563_37 = ((__fieldRead563_62(receiver) / 2) - __invokedynamic563_63(2166, (5465794030948651288L ^ life1_3)));
    spill563_38 = 4;
    __call563_64(receiver);
    __explicitNewInit563_69(spill563_35, spill563_36, spill563_37, (spill563_38 + __invokedynamic563_65(26426, (4603100767695568451L ^ life1_3))), __invokedynamic563_66(7569, (8322719587762865387L ^ life1_3)), __invokedynamic563_67(4223, (5920109582303430926L ^ life1_3)), __call563_68("gui.done", new java.lang.Object[0]));
    net.minecraft.client.gui.GuiScreenBook __stackOp563_70_0 = spill563_33;
    moom.gc __stackOp563_70_1 = spill563_34;
    spill563_39 = __stackOp563_70_1;
    __fieldWrite563_71(__stackOp563_70_0, __stackOp563_70_1);
    __call563_72(spill563_32, spill563_39);
    }
    spill563_40 = __fieldRead563_73(receiver);
    __call563_74(receiver);
    life3_243 = ((spill563_40 - __invokedynamic563_75(26426, (4603100767695568451L ^ life1_3))) / 2);
    life4_245 = 2;
    spill563_41 = __fieldRead563_76(receiver);
    spill563_42 = receiver;
    moom.gn __stackOp563_78_0 = __sourceUninitializedNEW563_77();
    spill563_43 = __stackOp563_78_0;
    __explicitNewInit563_81(__stackOp563_78_0, 1, (life3_243 + __invokedynamic563_79(29280, (1132955740415322893L ^ life1_3))), (life4_245 + __invokedynamic563_80(16887, (3881934891718400151L ^ life1_3))), true);
    net.minecraft.client.gui.GuiScreenBook __stackOp563_82_0 = spill563_42;
    moom.gn __stackOp563_82_1 = spill563_43;
    spill563_44 = __stackOp563_82_1;
    __fieldWrite563_83(__stackOp563_82_0, __stackOp563_82_1);
    __call563_84(spill563_41, spill563_44);
    spill563_45 = __fieldRead563_85(receiver);
    spill563_46 = receiver;
    moom.gn __stackOp563_87_0 = __sourceUninitializedNEW563_86();
    spill563_47 = __stackOp563_87_0;
    __explicitNewInit563_90(__stackOp563_87_0, 2, (life3_243 + __invokedynamic563_88(9488, (4242160572157836387L ^ life1_3))), (life4_245 + __invokedynamic563_89(17736, (666750582132366389L ^ life1_3))), false);
    net.minecraft.client.gui.GuiScreenBook __stackOp563_91_0 = spill563_46;
    moom.gn __stackOp563_91_1 = spill563_47;
    spill563_48 = __stackOp563_91_1;
    __fieldWrite563_92(__stackOp563_91_0, __stackOp563_91_1);
    __call563_93(spill563_45, spill563_48);
    __call563_94(receiver);
    return;
}
public static void h563_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call3056300_0(p0);
}
private static native long __fieldRead563_0() throws Throwable;
private static native java.util.List __fieldRead563_1(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native void __call563_2(java.util.List a0) throws Throwable;
private static native void __call563_3(int a0) throws Throwable;
private static native boolean __fieldRead563_4(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.util.List __fieldRead563_5(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native moom.gc __sourceUninitializedNEW563_6() throws Throwable;
private static native int __fieldRead563_8(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic563_9(int a0, long a1) throws Throwable;
private static native java.lang.Object __call563_10(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic563_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic563_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic563_13(int a0, long a1) throws Throwable;
private static native java.lang.String __call563_14(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit563_15(moom.gc a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws Throwable;
private static native void __fieldWrite563_17(net.minecraft.client.gui.GuiScreenBook a0, moom.gc a1) throws Throwable;
private static native boolean __call563_18(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead563_19(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native moom.gc __sourceUninitializedNEW563_20() throws Throwable;
private static native int __fieldRead563_22(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.Object __call563_23(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic563_24(int a0, long a1) throws Throwable;
private static native int __invokedynamic563_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic563_26(int a0, long a1) throws Throwable;
private static native java.lang.String __call563_27(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit563_28(moom.gc a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws Throwable;
private static native void __fieldWrite563_30(net.minecraft.client.gui.GuiScreenBook a0, moom.gc a1) throws Throwable;
private static native boolean __call563_31(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead563_32(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native moom.gc __sourceUninitializedNEW563_33() throws Throwable;
private static native int __fieldRead563_35(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic563_36(int a0, long a1) throws Throwable;
private static native java.lang.Object __call563_37(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic563_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic563_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic563_40(int a0, long a1) throws Throwable;
private static native java.lang.String __call563_41(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit563_42(moom.gc a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws Throwable;
private static native void __fieldWrite563_44(net.minecraft.client.gui.GuiScreenBook a0, moom.gc a1) throws Throwable;
private static native boolean __call563_45(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead563_46(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native moom.gc __sourceUninitializedNEW563_47() throws Throwable;
private static native int __fieldRead563_49(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.Object __call563_50(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic563_51(int a0, long a1) throws Throwable;
private static native int __invokedynamic563_52(int a0, long a1) throws Throwable;
private static native int __invokedynamic563_53(int a0, long a1) throws Throwable;
private static native java.lang.String __call563_54(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit563_55(moom.gc a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws Throwable;
private static native void __fieldWrite563_57(net.minecraft.client.gui.GuiScreenBook a0, moom.gc a1) throws Throwable;
private static native boolean __call563_58(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead563_59(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native moom.gc __sourceUninitializedNEW563_60() throws Throwable;
private static native int __fieldRead563_62(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic563_63(int a0, long a1) throws Throwable;
private static native java.lang.Object __call563_64(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic563_65(int a0, long a1) throws Throwable;
private static native int __invokedynamic563_66(int a0, long a1) throws Throwable;
private static native int __invokedynamic563_67(int a0, long a1) throws Throwable;
private static native java.lang.String __call563_68(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit563_69(moom.gc a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws Throwable;
private static native void __fieldWrite563_71(net.minecraft.client.gui.GuiScreenBook a0, moom.gc a1) throws Throwable;
private static native boolean __call563_72(java.util.List a0, moom.gc a1) throws Throwable;
private static native int __fieldRead563_73(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.Object __call563_74(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native int __invokedynamic563_75(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead563_76(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native moom.gn __sourceUninitializedNEW563_77() throws Throwable;
private static native int __invokedynamic563_79(int a0, long a1) throws Throwable;
private static native int __invokedynamic563_80(int a0, long a1) throws Throwable;
private static native void __explicitNewInit563_81(moom.gn a0, int a1, int a2, int a3, boolean a4) throws Throwable;
private static native void __fieldWrite563_83(net.minecraft.client.gui.GuiScreenBook a0, moom.gn a1) throws Throwable;
private static native boolean __call563_84(java.util.List a0, moom.gn a1) throws Throwable;
private static native java.util.List __fieldRead563_85(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native moom.gn __sourceUninitializedNEW563_86() throws Throwable;
private static native int __invokedynamic563_88(int a0, long a1) throws Throwable;
private static native int __invokedynamic563_89(int a0, long a1) throws Throwable;
private static native void __explicitNewInit563_90(moom.gn a0, int a1, int a2, int a3, boolean a4) throws Throwable;
private static native void __fieldWrite563_92(net.minecraft.client.gui.GuiScreenBook a0, moom.gn a1) throws Throwable;
private static native boolean __call563_93(java.util.List a0, moom.gn a1) throws Throwable;
private static native void __call563_94(net.minecraft.client.gui.GuiScreenBook a0) throws Throwable;
private static native java.lang.Throwable __call3056300_0(com.google.gson.JsonParseException a0) throws Throwable;

}


private void b() { __sourceHandlerCall_f0b8bf4503fb84d3243f(this); }


private void b(char p0, int p1) { __sourceHandlerCall_5b31c9c715521c067c68(this, p0, p1); }


private void b(java.lang.String p0) { __sourceHandlerCall_25ae6702b4479cbbe0b5(this, p0); }


private void c(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_c8c7e825f1ef5ed2f645(this, p0, p1); }


private java.lang.String c() { return __sourceHandlerCall_abb591fb8d07d0525965(this); }


public void c__Void() { __sourceHandlerCall_34b3924732103709a827(this); }


public void h() {
org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    return;
}


public net.minecraft.util.IChatComponent a__sourceReturn_3fd36e71f9(int p0, int p1) { return __sourceHandlerCall_b8c818378af6343bd2b3(this, p0, p1); }


protected boolean a(net.minecraft.util.IChatComponent p0) { return __sourceHandlerCall_3f2eff547fd6b7930bda(this, p0); }


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_878dde52005adff7d33b(this, p0, p1, p2); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiScreenBook.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18963;
      if (U[var3] == null) {
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
         long var5 = T[var3];
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
         Object[] var9 = (Object[])V.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               V.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/g1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         U[var3] = var15;
      }

      return U[var3];
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10365_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/g1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a() { __sourceHandlerCall_ab851d9cb9eea6512920(this); }


private void a(boolean p0) throws java.io.IOException { __sourceHandlerCall_8697209d00ef0040e23e(this, p0); }


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_791422cfb3c7ce5a9135(this, p0, p1); }


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_da464e61443737aef290(this, p0); }


private void a(java.lang.String p0) { __sourceHandlerCall_0880e4cc97846c1c4ef4(this, p0); }


public void a(int p0, int p1, float p2) { __sourceHandlerCall_b49aadab773351aa6e6e(this, p0, p1, p2); }


public void g() {
super.g();
    this.D += 1;
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10365_0() throws E;
}
