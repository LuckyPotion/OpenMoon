package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiIngameMenu extends net.minecraft.client.gui.GuiScreen {

private int w;

private int x;

private static long y;

private static long[] z;

private static java.lang.Integer[] A;

private static java.util.Map B;

public GuiIngameMenu() {
super();
}


static {
y = ((long)(((moom._a)(moom._c.a(((long)(6357464809322375169L)), ((long)(2903569583820077396L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(134631791015299L)))));
    B = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiIngameMenu.y ^ 85619250909623L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1774_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1774_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1774_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1774_14 = new byte[8];
    (__sourceSpill1774_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1774_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1774_16 = __sourceSpill1774_14;
    ((javax.crypto.Cipher)(__sourceSpill1774_11)).init(((int)(__sourceSpill1774_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1774_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1774_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[17];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "í¢á ±GÆ`ñQÍL©Ð°\003\017`Dµ$§<*¥\036\032\016S0.-o.¯Â-³'4Jë·\031ÕÜùd\005Á\024/\031P²kÉvÄÌ÷¥wPâõ·%ÌN}£\007ú\020U {xu\022âb¥É¥\030¤¦ç]\003=\004\t0hü*"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1774_25 = local6_life21;
        int __sourceSpill1774_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1774_25)).substring(((int)(__sourceSpill1774_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1774_30 = local8_life19;
        int __sourceSpill1774_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1774_33 = new byte[8];
        (__sourceSpill1774_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1774_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1774_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1774_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1774_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1774_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1774_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1774_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1774_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1774_34)).doFinal(((byte[])(__sourceSpill1774_33)));
        (__sourceSpill1774_30)[__sourceSpill1774_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\026¤C¥ù¾«;£Ü9©mØò°"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1774_38 = local6_life21;
        int __sourceSpill1774_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1774_38)).substring(((int)(__sourceSpill1774_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1774_43 = local8_life19;
        int __sourceSpill1774_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1774_46 = new byte[8];
        (__sourceSpill1774_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1774_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1774_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1774_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1774_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1774_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1774_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1774_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1774_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1774_47)).doFinal(((byte[])(__sourceSpill1774_46)));
        (__sourceSpill1774_43)[__sourceSpill1774_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    z = ((long[])(local8_life19));
    A = ((java.lang.Integer[])(new java.lang.Integer[17]));
}

private static native <E extends Throwable> void __sourceHandlerCall_79d9bad97aba119c265c(net.minecraft.client.gui.GuiIngameMenu a0, moom.gc a1) throws E;
private static final class __SourceHandler_79d9bad97aba119c265c {

public static void f483(net.minecraft.client.gui.GuiIngameMenu receiver, moom.gc p0) throws Throwable {
    int life2_19;
    int life3_23;
    switch (__fieldRead483_0(p0)) {
case 0:
{
        __call483_4(__fieldRead483_1(receiver), new net.minecraft.client.gui.GuiOptions(receiver, __fieldRead483_3(__fieldRead483_2(receiver))));
        break;
    }
case 1:
{
        life2_19 = __integerCategory483_7(__call483_6(__fieldRead483_5(receiver)));
        life3_23 = __integerCategory483_10(__call483_9(__fieldRead483_8(receiver)));
        __fieldWrite483_11(p0, 0);
        __call483_14(__fieldRead483_13(__fieldRead483_12(receiver)));
        __call483_16(__fieldRead483_15(receiver), null);
        if ((life2_19 != 0)) {
        __call483_18(__fieldRead483_17(receiver), new net.minecraft.client.gui.GuiMainMenu());
    } else {
        __call483_20(__fieldRead483_19(receiver), new net.minecraft.client.gui.GuiMultiplayer(new net.minecraft.client.gui.GuiMainMenu()));
    }
    }
case 2:
case 3:
default:
{
        break;
    }
case 4:
{
        __call483_22(__fieldRead483_21(receiver), null);
        __call483_24(__fieldRead483_23(receiver));
        break;
    }
case 5:
{
        __call483_29(__fieldRead483_25(receiver), new net.minecraft.client.gui.achievement.GuiAchievements(receiver, __call483_28(__fieldRead483_27(__fieldRead483_26(receiver)))));
        break;
    }
case 6:
{
        __call483_34(__fieldRead483_30(receiver), new net.minecraft.client.gui.achievement.GuiStats(receiver, __call483_33(__fieldRead483_32(__fieldRead483_31(receiver)))));
        break;
    }
case 7:
{
        __call483_36(__fieldRead483_35(receiver), new net.minecraft.client.gui.GuiShareToLan(receiver));
        break;
    }
}
    return;
}
public static void h483_0(java.io.IOException p0) throws Throwable {
    throw __call2048300_0(p0);
}
public static void h483_1(java.io.IOException p0) throws Throwable {
    throw __call2048301_0(p0);
}
private static native int __fieldRead483_0(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_1(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_2(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead483_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call483_4(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiOptions a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_5(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native boolean __call483_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory483_7(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_8(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native boolean __call483_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory483_10(boolean value) throws Throwable;
private static native void __fieldWrite483_11(moom.gc a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_12(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead483_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call483_14(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_15(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native void __call483_16(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_17(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native void __call483_18(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiMainMenu a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_19(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native void __call483_20(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiMultiplayer a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_21(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native void __call483_22(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_23(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native void __call483_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_25(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_26(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead483_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.B2 __call483_28(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call483_29(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.achievement.GuiAchievements a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_30(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_31(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead483_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.B2 __call483_33(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call483_34(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.achievement.GuiStats a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead483_35(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native void __call483_36(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiShareToLan a1) throws Throwable;
private static native java.lang.Exception __call2048300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2048301_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_349b4b179819f4619a10(net.minecraft.client.gui.GuiIngameMenu a0) throws E;
private static final class __SourceHandler_349b4b179819f4619a10 {

public static void f202(net.minecraft.client.gui.GuiIngameMenu receiver) throws Throwable {
    moom.gc forwardValue202_294_0;
    moom.gc forwardValue202_295_0;
    int forwardValue202_295_1;
    moom.gc spill202_0;
    long life1_3;
    int life3_15;
    int life4_21;
    moom.gc life5_194;
    forward_join_295: {
    forward_join_294: {
    forward_join_70: {
    life1_3 = (__fieldRead202_0() ^ 104833345290183L);
    __fieldWrite202_1(receiver, 0);
    __call202_3(__fieldRead202_2(receiver));
    life3_15 = __invokedynamic202_4(18941, (6794212758346814123L ^ life1_3));
    life4_21 = __invokedynamic202_5(30505, (5966693927620406386L ^ life1_3));
    __call202_12(__fieldRead202_6(receiver), new moom.gc(1, ((__fieldRead202_7(receiver) / 2) - __invokedynamic202_8(31022, (1721438221994582637L ^ life1_3))), (((__fieldRead202_9(receiver) / 4) + __invokedynamic202_10(5327, (755941932600299418L ^ life1_3))) + life3_15), __call202_11("menu.returnToMenu", new java.lang.Object[0])));
    if (!((!__call202_14(__fieldRead202_13(receiver))))) {
        break forward_join_70;
    }
    __fieldWrite202_19(__cast202_17(__call202_16(__fieldRead202_15(receiver), 0)), __call202_18("menu.disconnect", new java.lang.Object[0]));
    }
    __call202_26(__fieldRead202_20(receiver), new moom.gc(4, ((__fieldRead202_21(receiver) / 2) - __invokedynamic202_22(12806, (3778690639906646362L ^ life1_3))), (((__fieldRead202_23(receiver) / 4) + __invokedynamic202_24(6731, (5881649685068710162L ^ life1_3))) + life3_15), __call202_25("menu.returnToGame", new java.lang.Object[0])));
    __call202_35(__fieldRead202_27(receiver), new moom.gc(0, ((__fieldRead202_28(receiver) / 2) - __invokedynamic202_29(12806, (3778690639906646362L ^ life1_3))), (((__fieldRead202_30(receiver) / 4) + __invokedynamic202_31(2984, (2932588544519966970L ^ life1_3))) + life3_15), __invokedynamic202_32(20476, (2098105662427583659L ^ life1_3)), __invokedynamic202_33(20323, (7301223393151603763L ^ life1_3)), __call202_34("menu.options", new java.lang.Object[0])));
    __call202_44(__fieldRead202_36(receiver), (life5_194 = new moom.gc(__invokedynamic202_37(16754, (5193668907362802223L ^ life1_3)), ((__fieldRead202_38(receiver) / 2) + 2), (((__fieldRead202_39(receiver) / 4) + __invokedynamic202_40(28991, (1091668489174215276L ^ life1_3))) + life3_15), __invokedynamic202_41(20476, (2098105662427583659L ^ life1_3)), __invokedynamic202_42(28303, (5223264647096923614L ^ life1_3)), __call202_43("menu.shareToLan", new java.lang.Object[0]))));
    __call202_53(__fieldRead202_45(receiver), new moom.gc(5, ((__fieldRead202_46(receiver) / 2) - __invokedynamic202_47(12806, (3778690639906646362L ^ life1_3))), (((__fieldRead202_48(receiver) / 4) + __invokedynamic202_49(9388, (7488744828296282102L ^ life1_3))) + life3_15), __invokedynamic202_50(20476, (2098105662427583659L ^ life1_3)), __invokedynamic202_51(28303, (5223264647096923614L ^ life1_3)), __call202_52("gui.achievements", new java.lang.Object[0])));
    __call202_62(__fieldRead202_54(receiver), new moom.gc(__invokedynamic202_55(28992, (1834562708561390110L ^ life1_3)), ((__fieldRead202_56(receiver) / 2) + 2), (((__fieldRead202_57(receiver) / 4) + __invokedynamic202_58(9721, (4007658278255935137L ^ life1_3))) + life3_15), __invokedynamic202_59(20476, (2098105662427583659L ^ life1_3)), __invokedynamic202_60(28303, (5223264647096923614L ^ life1_3)), __call202_61("gui.stats", new java.lang.Object[0])));
    spill202_0 = life5_194;
    if (!(__call202_64(__fieldRead202_63(receiver)))) {
        forwardValue202_294_0 = spill202_0;
        break forward_join_294;
    }
    if (!((!__call202_67(__call202_66(__fieldRead202_65(receiver)))))) {
        forwardValue202_294_0 = spill202_0;
        break forward_join_294;
    }
    forwardValue202_295_0 = spill202_0;
    forwardValue202_295_1 = 1;
    break forward_join_295;
    }
    forwardValue202_295_0 = forwardValue202_294_0;
    forwardValue202_295_1 = 0;
    }
    __fieldWrite202_68(forwardValue202_295_0, forwardValue202_295_1);
    return;
}
public static void h202_0(moom.Oo p0) throws Throwable {
    throw __call1020200_0(p0);
}
public static void h202_1(moom.Oo p0) throws Throwable {
    throw __call1020201_0(p0);
}
public static void h202_2(moom.Oo p0) throws Throwable {
    throw __call1020202_0(p0);
}
private static native long __fieldRead202_0() throws Throwable;
private static native void __fieldWrite202_1(net.minecraft.client.gui.GuiIngameMenu a0, int a1) throws Throwable;
private static native java.util.List __fieldRead202_2(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native void __call202_3(java.util.List a0) throws Throwable;
private static native int __invokedynamic202_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic202_5(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead202_6(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __fieldRead202_7(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __invokedynamic202_8(int a0, long a1) throws Throwable;
private static native int __fieldRead202_9(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __invokedynamic202_10(int a0, long a1) throws Throwable;
private static native java.lang.String __call202_11(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call202_12(java.util.List a0, moom.gc a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead202_13(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native boolean __call202_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead202_15(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native java.lang.Object __call202_16(java.util.List a0, int a1) throws Throwable;
private static native moom.gc __cast202_17(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call202_18(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite202_19(moom.gc a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead202_20(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __fieldRead202_21(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __invokedynamic202_22(int a0, long a1) throws Throwable;
private static native int __fieldRead202_23(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __invokedynamic202_24(int a0, long a1) throws Throwable;
private static native java.lang.String __call202_25(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call202_26(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead202_27(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __fieldRead202_28(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __invokedynamic202_29(int a0, long a1) throws Throwable;
private static native int __fieldRead202_30(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __invokedynamic202_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic202_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic202_33(int a0, long a1) throws Throwable;
private static native java.lang.String __call202_34(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call202_35(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead202_36(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __invokedynamic202_37(int a0, long a1) throws Throwable;
private static native int __fieldRead202_38(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __fieldRead202_39(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __invokedynamic202_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic202_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic202_42(int a0, long a1) throws Throwable;
private static native java.lang.String __call202_43(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call202_44(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead202_45(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __fieldRead202_46(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __invokedynamic202_47(int a0, long a1) throws Throwable;
private static native int __fieldRead202_48(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __invokedynamic202_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic202_50(int a0, long a1) throws Throwable;
private static native int __invokedynamic202_51(int a0, long a1) throws Throwable;
private static native java.lang.String __call202_52(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call202_53(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead202_54(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __invokedynamic202_55(int a0, long a1) throws Throwable;
private static native int __fieldRead202_56(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __fieldRead202_57(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native int __invokedynamic202_58(int a0, long a1) throws Throwable;
private static native int __invokedynamic202_59(int a0, long a1) throws Throwable;
private static native int __invokedynamic202_60(int a0, long a1) throws Throwable;
private static native java.lang.String __call202_61(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call202_62(java.util.List a0, moom.gc a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead202_63(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native boolean __call202_64(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead202_65(net.minecraft.client.gui.GuiIngameMenu a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __call202_66(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call202_67(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __fieldWrite202_68(moom.gc a0, int a1) throws Throwable;
private static native java.lang.Exception __call1020200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1020201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1020202_0(moom.Oo a0) throws Throwable;

}


public void c__Void() { __sourceHandlerCall_349b4b179819f4619a10(this); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18468;
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
            throw new RuntimeException("moom/gT", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         A[var3] = var15;
      }

      return A[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiIngameMenu.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10273_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gT"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1, float p2) {
long local4 = (net.minecraft.client.gui.GuiIngameMenu.y ^ 107773254695489L);
    ((net.minecraft.client.gui.GuiIngameMenu)(this)).i();
    ((net.minecraft.client.gui.GuiIngameMenu)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("menu.game")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1780_5(27624, (3956914971475113274L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1780_6(3246, (2864001740445454967L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_79d9bad97aba119c265c(this, p0); }


public void g() {
super.g();
    this.x += 1;
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1780_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1780_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10273_0() throws E;
}
