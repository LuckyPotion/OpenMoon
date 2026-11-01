package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiGameOver extends net.minecraft.client.gui.GuiScreen implements net.minecraft.client.gui.GuiYesNoCallback {

private int w;

private boolean x;

private static long y;

private static long[] z;

private static java.lang.Integer[] A;

private static java.util.Map B;

public GuiGameOver() {
super();
    this.x = false;
}


static {
y = ((long)(((moom._a)(moom._c.a(((long)(-6559736320383374837L)), ((long)(-7688101373219492928L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(42951779799282L)))));
    B = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiGameOver.y ^ 60593915963231L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1772_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1772_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1772_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1772_14 = new byte[8];
    (__sourceSpill1772_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1772_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1772_16 = __sourceSpill1772_14;
    ((javax.crypto.Cipher)(__sourceSpill1772_11)).init(((int)(__sourceSpill1772_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1772_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1772_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "T\021¨óÔ|ê5Ã\r\030@;ëYX\000&Ý\016*!ÛÃfõµ\034O\007\027rô+ÊË¼<A6õ¥]¢¦4D\0367\be®\021\031C©\002@[Ô±<5¡Ã¿¤¸ZáxóL¸\027xå\n°"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1772_25 = local6_life21;
        int __sourceSpill1772_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1772_25)).substring(((int)(__sourceSpill1772_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1772_30 = local8_life19;
        int __sourceSpill1772_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1772_33 = new byte[8];
        (__sourceSpill1772_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1772_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1772_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1772_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1772_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1772_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1772_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1772_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1772_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1772_34)).doFinal(((byte[])(__sourceSpill1772_33)));
        (__sourceSpill1772_30)[__sourceSpill1772_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "SWc©a\bUwª>ìj\027¡w"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1772_38 = local6_life21;
        int __sourceSpill1772_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1772_38)).substring(((int)(__sourceSpill1772_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1772_43 = local8_life19;
        int __sourceSpill1772_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1772_46 = new byte[8];
        (__sourceSpill1772_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1772_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1772_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1772_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1772_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1772_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1772_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1772_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1772_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1772_47)).doFinal(((byte[])(__sourceSpill1772_46)));
        (__sourceSpill1772_43)[__sourceSpill1772_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    z = ((long[])(local8_life19));
    A = ((java.lang.Integer[])(new java.lang.Integer[13]));
}

private static native <E extends Throwable> void __sourceHandlerCall_1fc3d4aedb95a1ac7c63(net.minecraft.client.gui.GuiGameOver a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_1fc3d4aedb95a1ac7c63 {

public static void f2242(net.minecraft.client.gui.GuiGameOver receiver, int p0, int p1, float p2) throws Throwable {
    long life4_3;
    int life6_32;
    java.lang.String life7_46;
    life4_3 = (__fieldRead2242_0() ^ 82608320369626L);
    __call2242_5(receiver, 0, 0, __fieldRead2242_1(receiver), __fieldRead2242_2(receiver), __invokedynamic2242_3(22551, (1506680254673069659L ^ life4_3)), __invokedynamic2242_4(9434, (302707453060733597L ^ life4_3)));
    __call2242_6();
    __call2242_7(0x1.0p1f, 0x1.0p1f, 0x1.0p1f);
    life6_32 = __integerCategory2242_12(__call2242_11(__call2242_10(__fieldRead2242_9(__fieldRead2242_8(receiver)))));
    life7_46 = ((life6_32 != 0) ? __call2242_13("deathScreen.title.hardcore", new java.lang.Object[0]) : __call2242_14("deathScreen.title", new java.lang.Object[0]));
    __call2242_19(receiver, __fieldRead2242_15(receiver), life7_46, ((__fieldRead2242_16(receiver) / 2) / 2), __invokedynamic2242_17(23119, (9145329761119347721L ^ life4_3)), __invokedynamic2242_18(27920, (5518333136500888403L ^ life4_3)));
    __call2242_20();
    if ((life6_32 != 0)) {
        __call2242_26(receiver, __fieldRead2242_21(receiver), __call2242_22("deathScreen.hardcoreInfo", new java.lang.Object[0]), (__fieldRead2242_23(receiver) / 2), __invokedynamic2242_24(18835, (3517201810862847960L ^ life4_3)), __invokedynamic2242_25(6075, (1795979483591600635L ^ life4_3)));
    }
    __call2242_37(receiver, __fieldRead2242_27(receiver), __invokedynamic2242_33(__call2242_28("deathScreen.score", new java.lang.Object[0]), __fieldRead2242_29(), __call2242_32(__fieldRead2242_31(__fieldRead2242_30(receiver)))), (__fieldRead2242_34(receiver) / 2), __invokedynamic2242_35(15966, (7943084907121033243L ^ life4_3)), __invokedynamic2242_36(6075, (1795979483591600635L ^ life4_3)));
    __call2242_38(receiver, p0, p1, p2);
    return;
}
public static void h2242_0(moom.Oo p0) throws Throwable {
    throw __call1224200_0(p0);
}
public static void h2242_1(moom.Oo p0) throws Throwable {
    throw __call1224201_0(p0);
}
private static native long __fieldRead2242_0() throws Throwable;
private static native int __fieldRead2242_1(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __fieldRead2242_2(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __invokedynamic2242_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic2242_4(int a0, long a1) throws Throwable;
private static native void __call2242_5(net.minecraft.client.gui.GuiGameOver a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native void __call2242_6() throws Throwable;
private static native void __call2242_7(float a0, float a1, float a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2242_8(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2242_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call2242_10(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call2242_11(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native int __integerCategory2242_12(boolean value) throws Throwable;
private static native java.lang.String __call2242_13(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __call2242_14(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead2242_15(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __fieldRead2242_16(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __invokedynamic2242_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic2242_18(int a0, long a1) throws Throwable;
private static native void __call2242_19(net.minecraft.client.gui.GuiGameOver a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native void __call2242_20() throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead2242_21(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native java.lang.String __call2242_22(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __fieldRead2242_23(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __invokedynamic2242_24(int a0, long a1) throws Throwable;
private static native int __invokedynamic2242_25(int a0, long a1) throws Throwable;
private static native void __call2242_26(net.minecraft.client.gui.GuiGameOver a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead2242_27(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native java.lang.String __call2242_28(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead2242_29() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2242_30(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead2242_31(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call2242_32(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native java.lang.String __invokedynamic2242_33(java.lang.String a0, net.minecraft.util.EnumChatFormatting a1, int a2) throws Throwable;
private static native int __fieldRead2242_34(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __invokedynamic2242_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic2242_36(int a0, long a1) throws Throwable;
private static native void __call2242_37(net.minecraft.client.gui.GuiGameOver a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native void __call2242_38(net.minecraft.client.gui.GuiGameOver a0, int a1, int a2, float a3) throws Throwable;
private static native java.lang.Exception __call1224200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1224201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cd6bd96a32b9858641ad(net.minecraft.client.gui.GuiGameOver a0, boolean a1, int a2) throws E;
private static final class __SourceHandler_cd6bd96a32b9858641ad {

public static void f2243(net.minecraft.client.gui.GuiGameOver receiver, boolean p0, int p1) throws Throwable {
    if (p0) {
        __call2243_2(__fieldRead2243_1(__fieldRead2243_0(receiver)));
        __call2243_4(__fieldRead2243_3(receiver), null);
        __call2243_6(__fieldRead2243_5(receiver), new net.minecraft.client.gui.GuiMainMenu());
    } else {
        __call2243_9(__fieldRead2243_8(__fieldRead2243_7(receiver)));
        __call2243_11(__fieldRead2243_10(receiver), null);
    }
    return;
}
public static void h2243_0(moom.Oo p0) throws Throwable {
    throw __call1224300_0(p0);
}
private static native net.minecraft.client.Minecraft __fieldRead2243_0(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2243_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2243_2(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2243_3(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native void __call2243_4(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2243_5(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native void __call2243_6(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiMainMenu a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2243_7(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead2243_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2243_9(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2243_10(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native void __call2243_11(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Exception __call1224300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_065f7af44964c993f7a5(net.minecraft.client.gui.GuiGameOver a0, moom.gc a1) throws E;
private static final class __SourceHandler_065f7af44964c993f7a5 {

public static void f982(net.minecraft.client.gui.GuiGameOver receiver, moom.gc p0) throws Throwable {
    long life2_3;
    moom.hb life4_47;
    forest_join_59: {
    forest_join_29: {
    forest_join_16: {
    forest_join_7: {
    life2_3 = (__fieldRead982_0() ^ 59309521455037L);
    switch (__fieldRead982_1(p0)) {
case 0:
{
        break forest_join_7;
    }
case 1:
{
        break forest_join_16;
    }
default:
{
        break forest_join_59;
    }
}
    }
    __call982_4(__fieldRead982_3(__fieldRead982_2(receiver)));
    __call982_6(__fieldRead982_5(receiver), null);
    break forest_join_59;
    }
    if (!(__call982_10(__call982_9(__fieldRead982_8(__fieldRead982_7(receiver)))))) {
        break forest_join_29;
    }
    __call982_12(__fieldRead982_11(receiver), new net.minecraft.client.gui.GuiMainMenu());
    break forest_join_59;
    }
    life4_47 = new moom.hb(receiver, __call982_13("deathScreen.quit.confirm", new java.lang.Object[0]), "", __call982_14("deathScreen.titleScreen", new java.lang.Object[0]), __call982_15("deathScreen.respawn", new java.lang.Object[0]), 0);
    __call982_17(__fieldRead982_16(receiver), life4_47);
    __call982_19(life4_47, __invokedynamic982_18(19349, (6813878683621106108L ^ life2_3)));
    }
    return;
}
public static void h982_0(java.io.IOException p0) throws Throwable {
    throw __call3098200_0(p0);
}
public static void h982_1(java.io.IOException p0) throws Throwable {
    throw __call3098201_0(p0);
}
private static native long __fieldRead982_0() throws Throwable;
private static native int __fieldRead982_1(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead982_2(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead982_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call982_4(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead982_5(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native void __call982_6(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead982_7(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead982_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call982_9(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call982_10(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead982_11(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native void __call982_12(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiMainMenu a1) throws Throwable;
private static native java.lang.String __call982_13(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __call982_14(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __call982_15(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead982_16(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native void __call982_17(net.minecraft.client.Minecraft a0, moom.hb a1) throws Throwable;
private static native int __invokedynamic982_18(int a0, long a1) throws Throwable;
private static native void __call982_19(moom.hb a0, int a1) throws Throwable;
private static native java.lang.Exception __call3098200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3098201_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b8b94cad0b1c9f3e1f27(net.minecraft.client.gui.GuiGameOver a0) throws E;
private static final class __SourceHandler_b8b94cad0b1c9f3e1f27 {

public static void f1310(net.minecraft.client.gui.GuiGameOver receiver) throws Throwable {
    long life1_3;
    java.util.Iterator life3_169;
    moom.gc life4_176;
    lexical_join_173: {
    lexical_join_158: {
    lexical_join_83: {
    lexical_join_50: {
    life1_3 = (__fieldRead1310_0() ^ 130280305645148L);
    __call1310_2(__fieldRead1310_1(receiver));
    if (!(__call1310_6(__call1310_5(__fieldRead1310_4(__fieldRead1310_3(receiver)))))) {
        break lexical_join_83;
    }
    if (!(__call1310_8(__fieldRead1310_7(receiver)))) {
        break lexical_join_50;
    }
    __call1310_15(__fieldRead1310_9(receiver), new moom.gc(1, ((__fieldRead1310_10(receiver) / 2) - __invokedynamic1310_11(25285, (3839198588332480769L ^ life1_3))), ((__fieldRead1310_12(receiver) / 4) + __invokedynamic1310_13(18577, (1404999074725671768L ^ life1_3))), __call1310_14("deathScreen.deleteWorld", new java.lang.Object[0])));
    break lexical_join_158;
    }
    __call1310_22(__fieldRead1310_16(receiver), new moom.gc(1, ((__fieldRead1310_17(receiver) / 2) - __invokedynamic1310_18(25285, (3839198588332480769L ^ life1_3))), ((__fieldRead1310_19(receiver) / 4) + __invokedynamic1310_20(8467, (2032000985934420692L ^ life1_3))), __call1310_21("deathScreen.leaveServer", new java.lang.Object[0])));
    break lexical_join_158;
    }
    __call1310_29(__fieldRead1310_23(receiver), new moom.gc(0, ((__fieldRead1310_24(receiver) / 2) - __invokedynamic1310_25(25285, (3839198588332480769L ^ life1_3))), ((__fieldRead1310_26(receiver) / 4) + __invokedynamic1310_27(23598, (7252012153748989932L ^ life1_3))), __call1310_28("deathScreen.respawn", new java.lang.Object[0])));
    __call1310_36(__fieldRead1310_30(receiver), new moom.gc(1, ((__fieldRead1310_31(receiver) / 2) - __invokedynamic1310_32(25285, (3839198588332480769L ^ life1_3))), ((__fieldRead1310_33(receiver) / 4) + __invokedynamic1310_34(8467, (2032000985934420692L ^ life1_3))), __call1310_35("deathScreen.titleScreen", new java.lang.Object[0])));
    if (!((__call1310_38(__fieldRead1310_37(receiver)) == null))) {
        break lexical_join_158;
    }
    __fieldWrite1310_42(__cast1310_41(__call1310_40(__fieldRead1310_39(receiver), 1)), 0);
    }
    life3_169 = __call1310_44(__fieldRead1310_43(receiver));
    lexical_cycle_162: while (true) {
    if (!(__call1310_45(life3_169))) {
        break lexical_join_173;
    }
    life4_176 = __cast1310_47(__call1310_46(life3_169));
    __fieldWrite1310_48(life4_176, 0);
    continue lexical_cycle_162;
    }
    }
    return;
}
public static void h1310_0(moom.Oo p0) throws Throwable {
    throw __call1131000_0(p0);
}
public static void h1310_1(moom.Oo p0) throws Throwable {
    throw __call1131001_0(p0);
}
public static void h1310_2(moom.Oo p0) throws Throwable {
    throw __call1131002_0(p0);
}
private static native long __fieldRead1310_0() throws Throwable;
private static native java.util.List __fieldRead1310_1(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native void __call1310_2(java.util.List a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1310_3(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1310_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call1310_5(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call1310_6(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1310_7(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native boolean __call1310_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead1310_9(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __fieldRead1310_10(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __invokedynamic1310_11(int a0, long a1) throws Throwable;
private static native int __fieldRead1310_12(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __invokedynamic1310_13(int a0, long a1) throws Throwable;
private static native java.lang.String __call1310_14(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call1310_15(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead1310_16(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __fieldRead1310_17(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __invokedynamic1310_18(int a0, long a1) throws Throwable;
private static native int __fieldRead1310_19(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __invokedynamic1310_20(int a0, long a1) throws Throwable;
private static native java.lang.String __call1310_21(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call1310_22(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead1310_23(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __fieldRead1310_24(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __invokedynamic1310_25(int a0, long a1) throws Throwable;
private static native int __fieldRead1310_26(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __invokedynamic1310_27(int a0, long a1) throws Throwable;
private static native java.lang.String __call1310_28(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call1310_29(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead1310_30(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __fieldRead1310_31(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __invokedynamic1310_32(int a0, long a1) throws Throwable;
private static native int __fieldRead1310_33(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native int __invokedynamic1310_34(int a0, long a1) throws Throwable;
private static native java.lang.String __call1310_35(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call1310_36(java.util.List a0, moom.gc a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1310_37(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native net.minecraft.util.Session __call1310_38(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead1310_39(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native java.lang.Object __call1310_40(java.util.List a0, int a1) throws Throwable;
private static native moom.gc __cast1310_41(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite1310_42(moom.gc a0, int a1) throws Throwable;
private static native java.util.List __fieldRead1310_43(net.minecraft.client.gui.GuiGameOver a0) throws Throwable;
private static native java.util.Iterator __call1310_44(java.util.List a0) throws Throwable;
private static native boolean __call1310_45(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1310_46(java.util.Iterator a0) throws Throwable;
private static native moom.gc __cast1310_47(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite1310_48(moom.gc a0, int a1) throws Throwable;
private static native java.lang.Exception __call1131000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1131002_0(moom.Oo a0) throws Throwable;

}


public void c__Void() { __sourceHandlerCall_b8b94cad0b1c9f3e1f27(this); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiGameOver.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10422;
      if (A[var3] == null) {
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
         long var5 = z[var3];
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
         Object[] var9 = (Object[])B.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               B.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gS", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         A[var3] = var15;
      }

      return A[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10249_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_065f7af44964c993f7a5(this, p0); }


protected void a(char p0, int p1) throws java.io.IOException {
return;
}


public void a(int p0, int p1, float p2) { __sourceHandlerCall_1fc3d4aedb95a1ac7c63(this, p0, p1, p2); }


public boolean a__Boolean() {
return ((0) != 0);
}


public void a(boolean p0, int p1) { __sourceHandlerCall_cd6bd96a32b9858641ad(this, p0, p1); }


public void g() {
long life1_3;
    java.util.Iterator life3_23;
    moom.gc life4_30;
    life1_3 = (net.minecraft.client.gui.GuiGameOver.y ^ 34630875189495L);
    super.g();
    net.minecraft.client.gui.GuiGameOver __stackOp1479_2_0 = this;
    ((net.minecraft.client.gui.GuiGameOver)(__stackOp1479_2_0)).w = ((int)((((net.minecraft.client.gui.GuiGameOver)(__stackOp1479_2_0)).w + 1)));
    if ((this.w == __sourceIntrinsic_5176b1a6fbd6_invokedynamic1479_6(31038, (5268487294926210142L ^ life1_3)))) {
        life3_23 = ((java.util.List)(this.m)).iterator();
        loop_region_24: while (((java.util.Iterator)(life3_23)).hasNext()) {
        life4_30 = ((moom.gc)(((java.util.Iterator)(life3_23)).next()));
        ((moom.gc)(life4_30)).m = ((boolean)(true));
    }
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10249_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5176b1a6fbd6_invokedynamic1479_6(int a0, long a1) throws E;
}
