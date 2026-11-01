package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiOptions extends net.minecraft.client.gui.GuiScreen implements net.minecraft.client.gui.GuiYesNoCallback {

private static net.minecraft.client.settings.GameSettings$Options[] w;

private net.minecraft.client.gui.GuiScreen x;

private net.minecraft.client.settings.GameSettings y;

private moom.gc z;

private moom.gg A;

protected java.lang.String B;

private static long C;

private static long[] D;

private static java.lang.Integer[] E;

private static java.util.Map F;

public GuiOptions(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1) {
super();
    this.B = "Options";
    this.x = p0;
    this.y = p1;
}


static {
C = ((long)(((moom._a)(moom._c.a(((long)(-688327881474161050L)), ((long)(-5021118855538998747L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(231031116272355L)))));
    F = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiOptions.C ^ 110023121991459L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1778_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1778_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1778_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1778_14 = new byte[8];
    (__sourceSpill1778_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1778_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1778_16 = __sourceSpill1778_14;
    ((javax.crypto.Cipher)(__sourceSpill1778_11)).init(((int)(__sourceSpill1778_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1778_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1778_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[52];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ô¸\b\034ÑBo*K«r\023\032\017û\034\026Fñ;G`J)mq·A\031QüUÅÀ\004ðÜÃô\022Å7ùP4\016äÆîdUA\026ýåÕó¦[Lù´Ð\0008ÕqÜ\020Ñ²bïRËYRÅ)\022,*¦ÊØÕRFwÁ·U[lã´ÒÅrþÁÞ1åy¼Çzï5o¤?ýy´³1 ²\005ÿ(Éßåù\030óo\006Vi©\035\036hú(5\013´h\004\025ºä´«¼>]s\036 ¤Ý\022\023so~Ôxâµu%?ÂuÓ]@n:\0019õø9eÎÁÈ\002?]ÙÜ®¤31~§Ûa\0334ÇMPýkè±U)Üý0°î÷&ÉºQ\020x»¹fný²\027Hìye¸XnñH¯Zß®n¥k\037?\025N´ý<Q|+Æë\000æêõû2\023¨\025zW ³\0349~?Îäµ 'YÃ\021Ì$´~ñ{¡|Ä±dø|\023ÆN¦ñ0ÿ\026P\032+%ÚÕrêí\030J]\bLÇÍ\034ê7æmºJõ9u[©NIryì*ÉýÈy\034$Ý§XCÞ\033êK¥\017\b"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1778_25 = local6_life21;
        int __sourceSpill1778_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1778_25)).substring(((int)(__sourceSpill1778_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1778_30 = local8_life19;
        int __sourceSpill1778_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1778_33 = new byte[8];
        (__sourceSpill1778_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1778_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1778_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1778_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1778_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1778_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1778_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1778_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1778_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1778_34)).doFinal(((byte[])(__sourceSpill1778_33)));
        (__sourceSpill1778_30)[__sourceSpill1778_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "·.¶½QZÞ\032a\000TDvÈ±"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1778_38 = local6_life21;
        int __sourceSpill1778_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1778_38)).substring(((int)(__sourceSpill1778_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1778_43 = local8_life19;
        int __sourceSpill1778_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1778_46 = new byte[8];
        (__sourceSpill1778_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1778_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1778_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1778_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1778_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1778_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1778_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1778_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1778_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1778_47)).doFinal(((byte[])(__sourceSpill1778_46)));
        (__sourceSpill1778_43)[__sourceSpill1778_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    D = ((long[])(local8_life19));
    E = ((java.lang.Integer[])(new java.lang.Integer[52]));
    net.minecraft.client.settings.GameSettings$Options[] __sourceSpill1778_53 = new net.minecraft.client.settings.GameSettings$Options[1];
    (__sourceSpill1778_53)[0] = net.minecraft.client.settings.GameSettings$Options.FOV;
    w = ((net.minecraft.client.settings.GameSettings$Options[])(__sourceSpill1778_53));
}

private static native <E extends Throwable> void __sourceHandlerCall_779cd1bf547b6ff6fbe1(net.minecraft.client.gui.GuiOptions a0, boolean a1, int a2) throws E;
private static final class __SourceHandler_779cd1bf547b6ff6fbe1 {

public static void f2272(net.minecraft.client.gui.GuiOptions receiver, boolean p0, int p1) throws Throwable {
    long life3_3;
    life3_3 = (__fieldRead2272_0() ^ 137514841097130L);
    __call2272_2(__fieldRead2272_1(receiver), receiver);
    if ((p1 == __invokedynamic2272_3(17181, (718180153201855309L ^ life3_3)))) {
        if (p0) {
        if ((__fieldRead2272_5(__fieldRead2272_4(receiver)) != null)) {
        __call2272_9(__call2272_8(__fieldRead2272_7(__fieldRead2272_6(receiver))), 1);
        __call2272_11(__fieldRead2272_10(receiver), 1);
        __fieldWrite2272_13(__fieldRead2272_12(receiver), 0);
        __fieldWrite2272_15(__fieldRead2272_14(receiver), 0);
    }
    }
    }
    return;
}
public static void h2272_0(moom.Oo p0) throws Throwable {
    throw __call1227200_0(p0);
}
public static void h2272_1(moom.Oo p0) throws Throwable {
    throw __call1227201_0(p0);
}
public static void h2272_2(moom.Oo p0) throws Throwable {
    throw __call1227202_0(p0);
}
private static native long __fieldRead2272_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2272_1(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native void __call2272_2(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiOptions a1) throws Throwable;
private static native int __invokedynamic2272_3(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2272_4(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2272_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2272_6(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2272_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call2272_8(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call2272_9(net.minecraft.world.storage.WorldInfo a0, int a1) throws Throwable;
private static native moom.gg __fieldRead2272_10(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native void __call2272_11(moom.gg a0, int a1) throws Throwable;
private static native moom.gg __fieldRead2272_12(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native void __fieldWrite2272_13(moom.gg a0, int a1) throws Throwable;
private static native moom.gc __fieldRead2272_14(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native void __fieldWrite2272_15(moom.gc a0, int a1) throws Throwable;
private static native java.lang.Exception __call1227200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1227201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1227202_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_67ab7fe650e23344a94c(net.minecraft.client.gui.GuiOptions a0, moom.gc a1) throws E;
private static final class __SourceHandler_67ab7fe650e23344a94c {

public static void f2273(net.minecraft.client.gui.GuiOptions receiver, moom.gc p0) throws Throwable {
    long life2_3;
    net.minecraft.client.settings.GameSettings$Options life4_27;
    life2_3 = (__fieldRead2273_0() ^ 117666289211044L);
    if (__fieldRead2273_1(p0)) {
        if ((__fieldRead2273_2(p0) < __invokedynamic2273_3(20280, (3303731754489156173L ^ life2_3)))) {
        if ((__instanceOf2273_4(p0) != 0)) {
        life4_27 = __call2273_6(__cast2273_5(p0));
        __call2273_8(__fieldRead2273_7(receiver), life4_27, 1);
        __fieldWrite2273_13(p0, __call2273_12(__fieldRead2273_9(receiver), __call2273_11(__fieldRead2273_10(p0))));
    }
    }
        if ((__fieldRead2273_14(p0) == __invokedynamic2273_15(12680, (7881288209904758005L ^ life2_3)))) {
        __call2273_24(__call2273_18(__fieldRead2273_17(__fieldRead2273_16(receiver))), __call2273_23((__call2273_22(__call2273_21(__fieldRead2273_20(__fieldRead2273_19(receiver)))) + 1)));
        __fieldWrite2273_30(__fieldRead2273_25(receiver), __call2273_29(receiver, __call2273_28(__fieldRead2273_27(__fieldRead2273_26(receiver)))));
    }
        if ((__fieldRead2273_31(p0) == __invokedynamic2273_32(9206, (6007127538205621937L ^ life2_3)))) {
        __call2273_42(__fieldRead2273_33(receiver), new moom.hb(receiver, __call2273_34(new moom.CN("difficulty.lock.title", new java.lang.Object[0])), __call2273_40(new moom.CN("difficulty.lock.question", new java.lang.Object[] {new moom.CN(__call2273_39(__call2273_38(__call2273_37(__fieldRead2273_36(__fieldRead2273_35(receiver))))), new java.lang.Object[0])})), __invokedynamic2273_41(17181, (718160445106200131L ^ life2_3))));
    }
        if ((__fieldRead2273_43(p0) == __invokedynamic2273_44(12266, (449635264956166791L ^ life2_3)))) {
        __call2273_47(__fieldRead2273_46(__fieldRead2273_45(receiver)));
        __call2273_49(__fieldRead2273_48(receiver), new moom.gM(receiver));
    }
        if ((__fieldRead2273_50(p0) == __invokedynamic2273_51(9598, (3788221565425285168L ^ life2_3)))) {
        __call2273_54(__fieldRead2273_53(__fieldRead2273_52(receiver)));
    }
        if ((__fieldRead2273_55(p0) == __invokedynamic2273_56(4782, (928116804735946696L ^ life2_3)))) {
        __call2273_59(__fieldRead2273_58(__fieldRead2273_57(receiver)));
        __call2273_62(__fieldRead2273_60(receiver), new net.minecraft.client.gui.GuiVideoSettings(receiver, __fieldRead2273_61(receiver)));
    }
        if ((__fieldRead2273_63(p0) == __invokedynamic2273_64(4171, (5854709094889639183L ^ life2_3)))) {
        __call2273_67(__fieldRead2273_66(__fieldRead2273_65(receiver)));
        __call2273_70(__fieldRead2273_68(receiver), new net.minecraft.client.gui.GuiControls(receiver, __fieldRead2273_69(receiver)));
    }
        if ((__fieldRead2273_71(p0) == __invokedynamic2273_72(2152, (4266233388100605206L ^ life2_3)))) {
        __call2273_75(__fieldRead2273_74(__fieldRead2273_73(receiver)));
        __call2273_80(__fieldRead2273_76(receiver), new moom.gU(receiver, __fieldRead2273_77(receiver), __call2273_79(__fieldRead2273_78(receiver))));
    }
        if ((__fieldRead2273_81(p0) == __invokedynamic2273_82(8291, (2442684216247385344L ^ life2_3)))) {
        __call2273_85(__fieldRead2273_84(__fieldRead2273_83(receiver)));
        __call2273_88(__fieldRead2273_86(receiver), new moom.hd(receiver, __fieldRead2273_87(receiver)));
    }
        if ((__fieldRead2273_89(p0) == __invokedynamic2273_90(26380, (1182951860635449935L ^ life2_3)))) {
        __call2273_93(__fieldRead2273_92(__fieldRead2273_91(receiver)));
        __call2273_96(__fieldRead2273_94(receiver), new net.minecraft.client.gui.GuiSnooper(receiver, __fieldRead2273_95(receiver)));
    }
        if ((__fieldRead2273_97(p0) == __invokedynamic2273_98(14267, (7914413059093818110L ^ life2_3)))) {
        __call2273_101(__fieldRead2273_100(__fieldRead2273_99(receiver)));
        __call2273_104(__fieldRead2273_102(receiver), __fieldRead2273_103(receiver));
    }
        if ((__fieldRead2273_105(p0) == __invokedynamic2273_106(15331, (626237637255423629L ^ life2_3)))) {
        __call2273_109(__fieldRead2273_108(__fieldRead2273_107(receiver)));
        __call2273_111(__fieldRead2273_110(receiver), new net.minecraft.client.gui.GuiScreenResourcePacks(receiver));
    }
        if ((__fieldRead2273_112(p0) == __invokedynamic2273_113(13643, (4686401791764686887L ^ life2_3)))) {
        __call2273_116(__fieldRead2273_115(__fieldRead2273_114(receiver)));
        __call2273_119(__fieldRead2273_117(receiver), new moom.g4(receiver, __fieldRead2273_118(receiver)));
    }
    }
    return;
}
public static void h2273_0(java.io.IOException p0) throws Throwable {
    throw __call1227300_0(p0);
}
public static void h2273_1(java.io.IOException p0) throws Throwable {
    throw __call1227301_0(p0);
}
public static void h2273_2(java.io.IOException p0) throws Throwable {
    throw __call1227302_0(p0);
}
public static void h2273_3(java.io.IOException p0) throws Throwable {
    throw __call1227303_0(p0);
}
public static void h2273_4(java.io.IOException p0) throws Throwable {
    throw __call1227304_0(p0);
}
public static void h2273_5(java.io.IOException p0) throws Throwable {
    throw __call1227305_0(p0);
}
public static void h2273_6(java.io.IOException p0) throws Throwable {
    throw __call1227306_0(p0);
}
public static void h2273_7(java.io.IOException p0) throws Throwable {
    throw __call1227307_0(p0);
}
public static void h2273_8(java.io.IOException p0) throws Throwable {
    throw __call1227308_0(p0);
}
public static void h2273_9(java.io.IOException p0) throws Throwable {
    throw __call1227309_0(p0);
}
public static void h2273_10(java.io.IOException p0) throws Throwable {
    throw __call1227310_0(p0);
}
public static void h2273_11(java.io.IOException p0) throws Throwable {
    throw __call1227311_0(p0);
}
public static void h2273_12(java.io.IOException p0) throws Throwable {
    throw __call1227312_0(p0);
}
public static void h2273_13(java.io.IOException p0) throws Throwable {
    throw __call1227313_0(p0);
}
private static native long __fieldRead2273_0() throws Throwable;
private static native boolean __fieldRead2273_1(moom.gc a0) throws Throwable;
private static native int __fieldRead2273_2(moom.gc a0) throws Throwable;
private static native int __invokedynamic2273_3(int a0, long a1) throws Throwable;
private static native int __instanceOf2273_4(moom.gc a0) throws Throwable;
private static native moom.gi __cast2273_5(moom.gc a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __call2273_6(moom.gi a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_7(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native void __call2273_8(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1, int a2) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_9(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __fieldRead2273_10(moom.gc a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __call2273_11(int a0) throws Throwable;
private static native java.lang.String __call2273_12(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1) throws Throwable;
private static native void __fieldWrite2273_13(moom.gc a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead2273_14(moom.gc a0) throws Throwable;
private static native int __invokedynamic2273_15(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_16(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2273_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call2273_18(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_19(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2273_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call2273_21(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call2273_22(net.minecraft.world.EnumDifficulty a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call2273_23(int a0) throws Throwable;
private static native void __call2273_24(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native moom.gc __fieldRead2273_25(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_26(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2273_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call2273_28(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.lang.String __call2273_29(net.minecraft.client.gui.GuiOptions a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native void __fieldWrite2273_30(moom.gc a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead2273_31(moom.gc a0) throws Throwable;
private static native int __invokedynamic2273_32(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_33(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native java.lang.String __call2273_34(moom.CN a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_35(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead2273_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call2273_37(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call2273_38(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native java.lang.String __call2273_39(net.minecraft.world.EnumDifficulty a0) throws Throwable;
private static native java.lang.String __call2273_40(moom.CN a0) throws Throwable;
private static native int __invokedynamic2273_41(int a0, long a1) throws Throwable;
private static native void __call2273_42(net.minecraft.client.Minecraft a0, moom.hb a1) throws Throwable;
private static native int __fieldRead2273_43(moom.gc a0) throws Throwable;
private static native int __invokedynamic2273_44(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_45(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_46(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2273_47(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_48(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native void __call2273_49(net.minecraft.client.Minecraft a0, moom.gM a1) throws Throwable;
private static native int __fieldRead2273_50(moom.gc a0) throws Throwable;
private static native int __invokedynamic2273_51(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_52(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead2273_53(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2273_54(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __fieldRead2273_55(moom.gc a0) throws Throwable;
private static native int __invokedynamic2273_56(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_57(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_58(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2273_59(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_60(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_61(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native void __call2273_62(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiVideoSettings a1) throws Throwable;
private static native int __fieldRead2273_63(moom.gc a0) throws Throwable;
private static native int __invokedynamic2273_64(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_65(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_66(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2273_67(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_68(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_69(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native void __call2273_70(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiControls a1) throws Throwable;
private static native int __fieldRead2273_71(moom.gc a0) throws Throwable;
private static native int __invokedynamic2273_72(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_73(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_74(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2273_75(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_76(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_77(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_78(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.resources.LanguageManager __call2273_79(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2273_80(net.minecraft.client.Minecraft a0, moom.gU a1) throws Throwable;
private static native int __fieldRead2273_81(moom.gc a0) throws Throwable;
private static native int __invokedynamic2273_82(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_83(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_84(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2273_85(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_86(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_87(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native void __call2273_88(net.minecraft.client.Minecraft a0, moom.hd a1) throws Throwable;
private static native int __fieldRead2273_89(moom.gc a0) throws Throwable;
private static native int __invokedynamic2273_90(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_91(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_92(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2273_93(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_94(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_95(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native void __call2273_96(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiSnooper a1) throws Throwable;
private static native int __fieldRead2273_97(moom.gc a0) throws Throwable;
private static native int __invokedynamic2273_98(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_99(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_100(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2273_101(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_102(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead2273_103(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native void __call2273_104(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native int __fieldRead2273_105(moom.gc a0) throws Throwable;
private static native int __invokedynamic2273_106(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_107(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_108(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2273_109(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_110(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native void __call2273_111(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreenResourcePacks a1) throws Throwable;
private static native int __fieldRead2273_112(moom.gc a0) throws Throwable;
private static native int __invokedynamic2273_113(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_114(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_115(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call2273_116(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2273_117(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2273_118(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native void __call2273_119(net.minecraft.client.Minecraft a0, moom.g4 a1) throws Throwable;
private static native java.lang.Exception __call1227300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1227301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1227302_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1227303_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1227304_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1227305_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1227306_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1227307_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1227308_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1227309_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1227310_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1227311_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1227312_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1227313_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_23b8e16fc930e7b51781(net.minecraft.client.gui.GuiOptions a0) throws E;
private static final class __SourceHandler_23b8e16fc930e7b51781 {

public static void f556(net.minecraft.client.gui.GuiOptions receiver) throws Throwable {
    moom.gg forestValue556_293_0;
    moom.gg forestValue556_294_0;
    int forestValue556_294_1;
    moom.gc forestValue556_303_0;
    moom.gc forestValue556_304_0;
    int forestValue556_304_1;
    moom.gg spill556_0;
    moom.gc spill556_1;
    long life1_3;
    int life3_5;
    net.minecraft.client.settings.GameSettings$Options[] life4_13;
    int life5_16;
    int life6_18;
    net.minecraft.client.settings.GameSettings$Options life7_25;
    moom.gi life8_138;
    net.minecraft.world.EnumDifficulty life4_155;
    moom.gi life4_367;
    forest_join_371: {
    forest_join_311: {
    forest_join_310: {
    forest_join_306: {
    forest_join_304: {
    forest_join_303: {
    forest_join_294: {
    forest_join_293: {
    forest_join_147: {
    life1_3 = (__fieldRead556_0() ^ 44566677636933L);
    life3_5 = 0;
    __fieldWrite556_2(receiver, __call556_1("options.title", new java.lang.Object[0]));
    life4_13 = __fieldRead556_3();
    life5_16 = (life4_13).length;
    life6_18 = 0;
    forest_cycle_19: while (true) {
    forest_join_144: {
    forest_join_84: {
    if (!((life6_18 < life5_16))) {
        break forest_join_147;
    }
    life7_25 = (life4_13)[life6_18];
    if (!(__call556_4(life7_25))) {
        break forest_join_84;
    }
    __call556_14(__fieldRead556_5(receiver), new moom.gk(__call556_6(life7_25), (((__fieldRead556_7(receiver) / 2) - __invokedynamic556_8(32615, (8495414709715284973L ^ life1_3))) + ((life3_5 % 2) * __invokedynamic556_9(24366, (559969947411485610L ^ life1_3)))), (((__fieldRead556_10(receiver) / __invokedynamic556_11(83, (4379222511338278088L ^ life1_3))) - __invokedynamic556_12(21932, (6862466364468336907L ^ life1_3))) + (__invokedynamic556_13(23474, (6191906078882928431L ^ life1_3)) * (life3_5 >> 1))), life7_25));
    break forest_join_144;
    }
    life8_138 = new moom.gi(__call556_15(life7_25), (((__fieldRead556_16(receiver) / 2) - __invokedynamic556_17(16939, (4107122463318609546L ^ life1_3))) + ((life3_5 % 2) * __invokedynamic556_18(21766, (9066605798318217608L ^ life1_3)))), (((__fieldRead556_19(receiver) / __invokedynamic556_20(28466, (6819201295228019599L ^ life1_3))) - __invokedynamic556_21(30853, (5795995567642784796L ^ life1_3))) + (__invokedynamic556_22(30301, (2951620224536656624L ^ life1_3)) * (life3_5 >> 1))), life7_25, __call556_24(__fieldRead556_23(receiver), life7_25));
    __call556_26(__fieldRead556_25(receiver), life8_138);
    }
    life3_5 += 1;
    life6_18 += 1;
    continue forest_cycle_19;
    }
    }
    if (!((__fieldRead556_28(__fieldRead556_27(receiver)) != null))) {
        break forest_join_311;
    }
    life4_155 = __call556_31(__fieldRead556_30(__fieldRead556_29(receiver)));
    __fieldWrite556_43(receiver, new moom.gc(__invokedynamic556_32(14582, (6967820163298915431L ^ life1_3)), (((__fieldRead556_33(receiver) / 2) - __invokedynamic556_34(16939, (4107122463318609546L ^ life1_3))) + ((life3_5 % 2) * __invokedynamic556_35(21766, (9066605798318217608L ^ life1_3)))), (((__fieldRead556_36(receiver) / __invokedynamic556_37(28466, (6819201295228019599L ^ life1_3))) - __invokedynamic556_38(30853, (5795995567642784796L ^ life1_3))) + (__invokedynamic556_39(30301, (2951620224536656624L ^ life1_3)) * (life3_5 >> 1))), __invokedynamic556_40(15958, (1969697011245675229L ^ life1_3)), __invokedynamic556_41(27212, (6237007473941128935L ^ life1_3)), __call556_42(receiver, life4_155)));
    __call556_46(__fieldRead556_44(receiver), __fieldRead556_45(receiver));
    if (!(__call556_48(__fieldRead556_47(receiver)))) {
        break forest_join_306;
    }
    if (!((!__call556_52(__call556_51(__fieldRead556_50(__fieldRead556_49(receiver))))))) {
        break forest_join_306;
    }
    __call556_57(__fieldRead556_53(receiver), (__call556_55(__fieldRead556_54(receiver)) - __invokedynamic556_56(19585, (8993365491423576097L ^ life1_3))));
    __fieldWrite556_65(receiver, new moom.gg(__invokedynamic556_58(17181, (718087275332308898L ^ life1_3)), (__fieldRead556_60(__fieldRead556_59(receiver)) + __call556_62(__fieldRead556_61(receiver))), __fieldRead556_64(__fieldRead556_63(receiver))));
    __call556_68(__fieldRead556_66(receiver), __fieldRead556_67(receiver));
    __call556_74(__fieldRead556_69(receiver), __call556_73(__call556_72(__fieldRead556_71(__fieldRead556_70(receiver)))));
    spill556_0 = __fieldRead556_75(receiver);
    if (!((!__call556_77(__fieldRead556_76(receiver))))) {
        forestValue556_293_0 = spill556_0;
        break forest_join_293;
    }
    forestValue556_294_0 = spill556_0;
    forestValue556_294_1 = 1;
    break forest_join_294;
    }
    forestValue556_294_0 = forestValue556_293_0;
    forestValue556_294_1 = 0;
    }
    __fieldWrite556_78(forestValue556_294_0, forestValue556_294_1);
    spill556_1 = __fieldRead556_79(receiver);
    if (!((!__call556_81(__fieldRead556_80(receiver))))) {
        forestValue556_303_0 = spill556_1;
        break forest_join_303;
    }
    forestValue556_304_0 = spill556_1;
    forestValue556_304_1 = 1;
    break forest_join_304;
    }
    forestValue556_304_0 = forestValue556_303_0;
    forestValue556_304_1 = 0;
    }
    __fieldWrite556_82(forestValue556_304_0, forestValue556_304_1);
    break forest_join_310;
    }
    __fieldWrite556_84(__fieldRead556_83(receiver), 0);
    }
    break forest_join_371;
    }
    life4_367 = new moom.gi(__call556_86(__fieldRead556_85()), (((__fieldRead556_87(receiver) / 2) - __invokedynamic556_88(16939, (4107122463318609546L ^ life1_3))) + ((life3_5 % 2) * __invokedynamic556_89(21766, (9066605798318217608L ^ life1_3)))), (((__fieldRead556_90(receiver) / __invokedynamic556_91(28466, (6819201295228019599L ^ life1_3))) - __invokedynamic556_92(30853, (5795995567642784796L ^ life1_3))) + (__invokedynamic556_93(30301, (2951620224536656624L ^ life1_3)) * (life3_5 >> 1))), __fieldRead556_94(), __call556_97(__fieldRead556_95(receiver), __fieldRead556_96()));
    __call556_99(__fieldRead556_98(receiver), life4_367);
    }
    __call556_111(__fieldRead556_100(receiver), new moom.gc(__invokedynamic556_101(9756, (1924635840032369312L ^ life1_3)), ((__fieldRead556_102(receiver) / 2) - __invokedynamic556_103(16939, (4107122463318609546L ^ life1_3))), (((__fieldRead556_104(receiver) / __invokedynamic556_105(28466, (6819201295228019599L ^ life1_3))) + __invokedynamic556_106(31901, (8899030486377410563L ^ life1_3))) - __invokedynamic556_107(28466, (6819201295228019599L ^ life1_3))), __invokedynamic556_108(12514, (14974397237460040L ^ life1_3)), __invokedynamic556_109(19585, (8993365491423576097L ^ life1_3)), __call556_110("options.skinCustomisation", new java.lang.Object[0])));
    __call556_121(__fieldRead556_112(receiver), new moom.gm(receiver, __invokedynamic556_113(8487, (439668683029245337L ^ life1_3)), ((__fieldRead556_114(receiver) / 2) + 5), (((__fieldRead556_115(receiver) / __invokedynamic556_116(28466, (6819201295228019599L ^ life1_3))) + __invokedynamic556_117(14864, (6141225402056865427L ^ life1_3))) - __invokedynamic556_118(28466, (6819201295228019599L ^ life1_3))), __invokedynamic556_119(12514, (14974397237460040L ^ life1_3)), __invokedynamic556_120(19585, (8993365491423576097L ^ life1_3)), "Super Secret Settings..."));
    __call556_133(__fieldRead556_122(receiver), new moom.gc(__invokedynamic556_123(30038, (7324069544170797566L ^ life1_3)), ((__fieldRead556_124(receiver) / 2) - __invokedynamic556_125(16939, (4107122463318609546L ^ life1_3))), (((__fieldRead556_126(receiver) / __invokedynamic556_127(28466, (6819201295228019599L ^ life1_3))) + __invokedynamic556_128(8179, (4207030858572518237L ^ life1_3))) - __invokedynamic556_129(28466, (6819201295228019599L ^ life1_3))), __invokedynamic556_130(12514, (14974397237460040L ^ life1_3)), __invokedynamic556_131(19585, (8993365491423576097L ^ life1_3)), __call556_132("options.sounds", new java.lang.Object[0])));
    __call556_144(__fieldRead556_134(receiver), new moom.gc(__invokedynamic556_135(4350, (2597504867581910143L ^ life1_3)), ((__fieldRead556_136(receiver) / 2) + 5), (((__fieldRead556_137(receiver) / __invokedynamic556_138(28466, (6819201295228019599L ^ life1_3))) + __invokedynamic556_139(1306, (6655566066844879286L ^ life1_3))) - __invokedynamic556_140(28466, (6819201295228019599L ^ life1_3))), __invokedynamic556_141(12514, (14974397237460040L ^ life1_3)), __invokedynamic556_142(19585, (8993365491423576097L ^ life1_3)), __call556_143("options.stream", new java.lang.Object[0])));
    __call556_156(__fieldRead556_145(receiver), new moom.gc(__invokedynamic556_146(10690, (9058208229738177867L ^ life1_3)), ((__fieldRead556_147(receiver) / 2) - __invokedynamic556_148(16939, (4107122463318609546L ^ life1_3))), (((__fieldRead556_149(receiver) / __invokedynamic556_150(28466, (6819201295228019599L ^ life1_3))) + __invokedynamic556_151(5146, (3948958003243341970L ^ life1_3))) - __invokedynamic556_152(28466, (6819201295228019599L ^ life1_3))), __invokedynamic556_153(12514, (14974397237460040L ^ life1_3)), __invokedynamic556_154(19585, (8993365491423576097L ^ life1_3)), __call556_155("options.video", new java.lang.Object[0])));
    __call556_167(__fieldRead556_157(receiver), new moom.gc(__invokedynamic556_158(4171, (5854777830965435630L ^ life1_3)), ((__fieldRead556_159(receiver) / 2) + 5), (((__fieldRead556_160(receiver) / __invokedynamic556_161(28466, (6819201295228019599L ^ life1_3))) + __invokedynamic556_162(29547, (1401705407658573820L ^ life1_3))) - __invokedynamic556_163(28466, (6819201295228019599L ^ life1_3))), __invokedynamic556_164(12514, (14974397237460040L ^ life1_3)), __invokedynamic556_165(19585, (8993365491423576097L ^ life1_3)), __call556_166("options.controls", new java.lang.Object[0])));
    __call556_179(__fieldRead556_168(receiver), new moom.gc(__invokedynamic556_169(17680, (2577448972559583624L ^ life1_3)), ((__fieldRead556_170(receiver) / 2) - __invokedynamic556_171(16939, (4107122463318609546L ^ life1_3))), (((__fieldRead556_172(receiver) / __invokedynamic556_173(28466, (6819201295228019599L ^ life1_3))) + __invokedynamic556_174(16796, (3326101719104064783L ^ life1_3))) - __invokedynamic556_175(28466, (6819201295228019599L ^ life1_3))), __invokedynamic556_176(12514, (14974397237460040L ^ life1_3)), __invokedynamic556_177(19585, (8993365491423576097L ^ life1_3)), __call556_178("options.language", new java.lang.Object[0])));
    __call556_190(__fieldRead556_180(receiver), new moom.gc(__invokedynamic556_181(31716, (7902414419702167396L ^ life1_3)), ((__fieldRead556_182(receiver) / 2) + 5), (((__fieldRead556_183(receiver) / __invokedynamic556_184(28466, (6819201295228019599L ^ life1_3))) + __invokedynamic556_185(30767, (6218885531065627829L ^ life1_3))) - __invokedynamic556_186(28466, (6819201295228019599L ^ life1_3))), __invokedynamic556_187(12514, (14974397237460040L ^ life1_3)), __invokedynamic556_188(19585, (8993365491423576097L ^ life1_3)), __call556_189("options.chat.title", new java.lang.Object[0])));
    __call556_202(__fieldRead556_191(receiver), new moom.gc(__invokedynamic556_192(4714, (7852948514980945603L ^ life1_3)), ((__fieldRead556_193(receiver) / 2) - __invokedynamic556_194(16939, (4107122463318609546L ^ life1_3))), (((__fieldRead556_195(receiver) / __invokedynamic556_196(28466, (6819201295228019599L ^ life1_3))) + __invokedynamic556_197(14631, (362386335366673826L ^ life1_3))) - __invokedynamic556_198(28466, (6819201295228019599L ^ life1_3))), __invokedynamic556_199(12514, (14974397237460040L ^ life1_3)), __invokedynamic556_200(19585, (8993365491423576097L ^ life1_3)), __call556_201("options.resourcepack", new java.lang.Object[0])));
    __call556_213(__fieldRead556_203(receiver), new moom.gc(__invokedynamic556_204(8708, (3319537359405936258L ^ life1_3)), ((__fieldRead556_205(receiver) / 2) + 5), (((__fieldRead556_206(receiver) / __invokedynamic556_207(28466, (6819201295228019599L ^ life1_3))) + __invokedynamic556_208(24603, (3059257472603729033L ^ life1_3))) - __invokedynamic556_209(28466, (6819201295228019599L ^ life1_3))), __invokedynamic556_210(12514, (14974397237460040L ^ life1_3)), __invokedynamic556_211(19585, (8993365491423576097L ^ life1_3)), __call556_212("options.snooper.view", new java.lang.Object[0])));
    __call556_222(__fieldRead556_214(receiver), new moom.gc(__invokedynamic556_215(17182, (5757337540519956360L ^ life1_3)), ((__fieldRead556_216(receiver) / 2) - __invokedynamic556_217(4171, (5854777830965435630L ^ life1_3))), ((__fieldRead556_218(receiver) / __invokedynamic556_219(28466, (6819201295228019599L ^ life1_3))) + __invokedynamic556_220(27376, (207881915693803104L ^ life1_3))), __call556_221("gui.done", new java.lang.Object[0])));
    return;
}
public static void h556_0(moom.Oo p0) throws Throwable {
    throw __call3055600_0(p0);
}
public static void h556_1(moom.Oo p0) throws Throwable {
    throw __call3055601_0(p0);
}
public static void h556_2(moom.Oo p0) throws Throwable {
    throw __call3055602_0(p0);
}
public static void h556_3(moom.Oo p0) throws Throwable {
    throw __call3055603_0(p0);
}
public static void h556_4(moom.Oo p0) throws Throwable {
    throw __call3055604_0(p0);
}
private static native long __fieldRead556_0() throws Throwable;
private static native java.lang.String __call556_1(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite556_2(net.minecraft.client.gui.GuiOptions a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options[] __fieldRead556_3() throws Throwable;
private static native boolean __call556_4(net.minecraft.client.settings.GameSettings$Options a0) throws Throwable;
private static native java.util.List __fieldRead556_5(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __call556_6(net.minecraft.client.settings.GameSettings$Options a0) throws Throwable;
private static native int __fieldRead556_7(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_9(int a0, long a1) throws Throwable;
private static native int __fieldRead556_10(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_13(int a0, long a1) throws Throwable;
private static native boolean __call556_14(java.util.List a0, moom.gk a1) throws Throwable;
private static native int __call556_15(net.minecraft.client.settings.GameSettings$Options a0) throws Throwable;
private static native int __fieldRead556_16(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_18(int a0, long a1) throws Throwable;
private static native int __fieldRead556_19(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_22(int a0, long a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead556_23(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native java.lang.String __call556_24(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1) throws Throwable;
private static native java.util.List __fieldRead556_25(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native boolean __call556_26(java.util.List a0, moom.gi a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead556_27(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead556_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead556_29(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead556_30(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call556_31(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __invokedynamic556_32(int a0, long a1) throws Throwable;
private static native int __fieldRead556_33(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_35(int a0, long a1) throws Throwable;
private static native int __fieldRead556_36(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_41(int a0, long a1) throws Throwable;
private static native java.lang.String __call556_42(net.minecraft.client.gui.GuiOptions a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native void __fieldWrite556_43(net.minecraft.client.gui.GuiOptions a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead556_44(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native moom.gc __fieldRead556_45(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native boolean __call556_46(java.util.List a0, moom.gc a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead556_47(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native boolean __call556_48(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead556_49(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead556_50(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call556_51(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call556_52(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native moom.gc __fieldRead556_53(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native moom.gc __fieldRead556_54(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __call556_55(moom.gc a0) throws Throwable;
private static native int __invokedynamic556_56(int a0, long a1) throws Throwable;
private static native void __call556_57(moom.gc a0, int a1) throws Throwable;
private static native int __invokedynamic556_58(int a0, long a1) throws Throwable;
private static native moom.gc __fieldRead556_59(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __fieldRead556_60(moom.gc a0) throws Throwable;
private static native moom.gc __fieldRead556_61(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __call556_62(moom.gc a0) throws Throwable;
private static native moom.gc __fieldRead556_63(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __fieldRead556_64(moom.gc a0) throws Throwable;
private static native void __fieldWrite556_65(net.minecraft.client.gui.GuiOptions a0, moom.gg a1) throws Throwable;
private static native java.util.List __fieldRead556_66(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native moom.gg __fieldRead556_67(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native boolean __call556_68(java.util.List a0, moom.gg a1) throws Throwable;
private static native moom.gg __fieldRead556_69(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead556_70(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead556_71(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call556_72(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call556_73(net.minecraft.world.storage.WorldInfo a0) throws Throwable;
private static native void __call556_74(moom.gg a0, boolean a1) throws Throwable;
private static native moom.gg __fieldRead556_75(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native moom.gg __fieldRead556_76(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native boolean __call556_77(moom.gg a0) throws Throwable;
private static native void __fieldWrite556_78(moom.gg a0, int a1) throws Throwable;
private static native moom.gc __fieldRead556_79(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native moom.gg __fieldRead556_80(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native boolean __call556_81(moom.gg a0) throws Throwable;
private static native void __fieldWrite556_82(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead556_83(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native void __fieldWrite556_84(moom.gc a0, int a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __fieldRead556_85() throws Throwable;
private static native int __call556_86(net.minecraft.client.settings.GameSettings$Options a0) throws Throwable;
private static native int __fieldRead556_87(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_88(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_89(int a0, long a1) throws Throwable;
private static native int __fieldRead556_90(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_91(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_92(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_93(int a0, long a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __fieldRead556_94() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead556_95(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __fieldRead556_96() throws Throwable;
private static native java.lang.String __call556_97(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1) throws Throwable;
private static native java.util.List __fieldRead556_98(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native boolean __call556_99(java.util.List a0, moom.gi a1) throws Throwable;
private static native java.util.List __fieldRead556_100(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_101(int a0, long a1) throws Throwable;
private static native int __fieldRead556_102(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_103(int a0, long a1) throws Throwable;
private static native int __fieldRead556_104(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_105(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_106(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_107(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_108(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_109(int a0, long a1) throws Throwable;
private static native java.lang.String __call556_110(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call556_111(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead556_112(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_113(int a0, long a1) throws Throwable;
private static native int __fieldRead556_114(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __fieldRead556_115(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_116(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_117(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_118(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_119(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_120(int a0, long a1) throws Throwable;
private static native boolean __call556_121(java.util.List a0, moom.gm a1) throws Throwable;
private static native java.util.List __fieldRead556_122(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_123(int a0, long a1) throws Throwable;
private static native int __fieldRead556_124(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_125(int a0, long a1) throws Throwable;
private static native int __fieldRead556_126(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_127(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_128(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_129(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_130(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_131(int a0, long a1) throws Throwable;
private static native java.lang.String __call556_132(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call556_133(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead556_134(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_135(int a0, long a1) throws Throwable;
private static native int __fieldRead556_136(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __fieldRead556_137(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_138(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_139(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_140(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_141(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_142(int a0, long a1) throws Throwable;
private static native java.lang.String __call556_143(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call556_144(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead556_145(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_146(int a0, long a1) throws Throwable;
private static native int __fieldRead556_147(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_148(int a0, long a1) throws Throwable;
private static native int __fieldRead556_149(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_150(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_151(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_152(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_153(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_154(int a0, long a1) throws Throwable;
private static native java.lang.String __call556_155(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call556_156(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead556_157(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_158(int a0, long a1) throws Throwable;
private static native int __fieldRead556_159(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __fieldRead556_160(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_161(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_162(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_163(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_164(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_165(int a0, long a1) throws Throwable;
private static native java.lang.String __call556_166(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call556_167(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead556_168(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_169(int a0, long a1) throws Throwable;
private static native int __fieldRead556_170(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_171(int a0, long a1) throws Throwable;
private static native int __fieldRead556_172(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_173(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_174(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_175(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_176(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_177(int a0, long a1) throws Throwable;
private static native java.lang.String __call556_178(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call556_179(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead556_180(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_181(int a0, long a1) throws Throwable;
private static native int __fieldRead556_182(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __fieldRead556_183(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_184(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_185(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_186(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_187(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_188(int a0, long a1) throws Throwable;
private static native java.lang.String __call556_189(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call556_190(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead556_191(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_192(int a0, long a1) throws Throwable;
private static native int __fieldRead556_193(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_194(int a0, long a1) throws Throwable;
private static native int __fieldRead556_195(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_196(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_197(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_198(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_199(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_200(int a0, long a1) throws Throwable;
private static native java.lang.String __call556_201(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call556_202(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead556_203(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_204(int a0, long a1) throws Throwable;
private static native int __fieldRead556_205(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __fieldRead556_206(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_207(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_208(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_209(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_210(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_211(int a0, long a1) throws Throwable;
private static native java.lang.String __call556_212(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call556_213(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead556_214(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_215(int a0, long a1) throws Throwable;
private static native int __fieldRead556_216(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_217(int a0, long a1) throws Throwable;
private static native int __fieldRead556_218(net.minecraft.client.gui.GuiOptions a0) throws Throwable;
private static native int __invokedynamic556_219(int a0, long a1) throws Throwable;
private static native int __invokedynamic556_220(int a0, long a1) throws Throwable;
private static native java.lang.String __call556_221(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call556_222(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.lang.Exception __call3055600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3055601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3055602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3055603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3055604_0(moom.Oo a0) throws Throwable;

}


public void c__Void() { __sourceHandlerCall_23b8e16fc930e7b51781(this); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiOptions.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8185;
      if (E[var3] == null) {
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
         long var5 = D[var3];
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
         Object[] var9 = (Object[])F.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               F.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gY", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         E[var3] = var15;
      }

      return E[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10308_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String a(net.minecraft.world.EnumDifficulty p0) {
moom.CM local2 = new moom.CM("");
    ((net.minecraft.util.IChatComponent)(local2)).a(((net.minecraft.util.IChatComponent)(new moom.CN("options.difficulty", new java.lang.Object[0]))));
    ((net.minecraft.util.IChatComponent)(local2)).a(((java.lang.String)(": ")));
    ((net.minecraft.util.IChatComponent)(local2)).a(((net.minecraft.util.IChatComponent)(new moom.CN(((net.minecraft.world.EnumDifficulty)(p0)).a__String(), new java.lang.Object[0]))));
    return ((net.minecraft.util.IChatComponent)(local2)).c();
}


public void a(boolean p0, int p1) { __sourceHandlerCall_779cd1bf547b6ff6fbe1(this, p0, p1); }


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_67ab7fe650e23344a94c(this, p0); }


public void a(int p0, int p1, float p2) {
long local4 = (net.minecraft.client.gui.GuiOptions.C ^ 24004509090499L);
    ((net.minecraft.client.gui.GuiOptions)(this)).i();
    ((net.minecraft.client.gui.GuiOptions)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.B)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1786_5(18282, (3323655119626604111L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1786_6(21699, (5115303748410842576L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1786_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1786_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10308_0() throws E;
}
