package net.minecraft.client.multiplayer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class WorldClient extends net.minecraft.world.World {

private net.minecraft.client.network.NetHandlerPlayClient S;

private moom.jH T;

private java.util.Set<net.minecraft.entity.Entity> U;

private java.util.Set<net.minecraft.entity.Entity> V;

private net.minecraft.client.Minecraft W;

private java.util.Set<moom.Ee> X;

private boolean Y;

private static net.minecraft.entity.Entity[] Z;

private static long ab;

private static long[] cb;

private static java.lang.Integer[] db;

private static java.util.Map hb;

public WorldClient(net.minecraft.client.network.NetHandlerPlayClient p0, moom.EK p1, int p2, net.minecraft.world.EnumDifficulty p3, moom.A9 p4) { super((net.minecraft.world.storage.ISaveHandler)null, (net.minecraft.world.storage.WorldInfo)null, (moom.EA)null, (moom.A9)null, false); __sourceHandlerCall_faa4ee4f4491b387d39b(this, p0, p1, p2, p3, p4); }


static {
ab = ((long)(((moom._a)(moom._c.a(((long)(558094465718715646L)), ((long)(-3867281333145099528L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(126785787458911L)))));
    java.lang.Object __sourceSpill1796_6 = null;
    hb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (net.minecraft.client.multiplayer.WorldClient.ab ^ 106230658053394L);
    net.minecraft.client.multiplayer.WorldClient.b(((net.minecraft.entity.Entity[])(__sourceSpill1796_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1796_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1796_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1796_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1796_16 = new byte[8];
    (__sourceSpill1796_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1796_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1796_18 = __sourceSpill1796_16;
    ((javax.crypto.Cipher)(__sourceSpill1796_13)).init(((int)(__sourceSpill1796_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1796_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1796_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[11];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "Ð\032YÒOS\013ó.\002ÕKÍòÌÙ\nuß\relîÙS\tÀ¿e·X\036`\003\026÷Ð\032Õ\025wªNî¾*ûØ¸%²%FÄ.Ë´p:\026\036ãe"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1796_27 = local6_life23;
        int __sourceSpill1796_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1796_27)).substring(((int)(__sourceSpill1796_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1796_32 = local8_life21;
        int __sourceSpill1796_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1796_35 = new byte[8];
        (__sourceSpill1796_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1796_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1796_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1796_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1796_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1796_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1796_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1796_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1796_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1796_36)).doFinal(((byte[])(__sourceSpill1796_35)));
        (__sourceSpill1796_32)[__sourceSpill1796_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "§§ÌMû|÷;Û¦ÖJ\001ÿ"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1796_40 = local6_life23;
        int __sourceSpill1796_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1796_40)).substring(((int)(__sourceSpill1796_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1796_45 = local8_life21;
        int __sourceSpill1796_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1796_48 = new byte[8];
        (__sourceSpill1796_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1796_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1796_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1796_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1796_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1796_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1796_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1796_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1796_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1796_49)).doFinal(((byte[])(__sourceSpill1796_48)));
        (__sourceSpill1796_45)[__sourceSpill1796_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    cb = ((long[])(local8_life21));
    db = ((java.lang.Integer[])(new java.lang.Integer[11]));
}

private static native <E extends Throwable> void __sourceHandlerCall_faa4ee4f4491b387d39b(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.client.network.NetHandlerPlayClient a1, moom.EK a2, int a3, net.minecraft.world.EnumDifficulty a4, moom.A9 a5) throws E;
private static final class __SourceHandler_faa4ee4f4491b387d39b {

public static void f534(net.minecraft.client.multiplayer.WorldClient receiver, net.minecraft.client.network.NetHandlerPlayClient p0, moom.EK p1, int p2, net.minecraft.world.EnumDifficulty p3, moom.A9 p4) throws Throwable {
    moom.jI forwardValue534_88_0;
    moom.jI forwardValue534_105_0;
    net.minecraft.entity.Entity[] spill534_0;
    moom.jI spill534_1;
    long life6_3;
    net.minecraft.entity.Entity[] life8_78;
    forward_join_112: {
    forward_join_107: {
    forward_join_105: {
    forward_join_88: {
    life6_3 = (__fieldRead534_0() ^ 112775190620674L);
    __directSuperInit534_2(receiver, new net.minecraft.world.storage.SaveHandlerMP(), new net.minecraft.world.storage.WorldInfo(p1, "MpServer"), __call534_1(p2), p4, true);
    __fieldWrite534_4(receiver, __call534_3());
    __fieldWrite534_6(receiver, __call534_5());
    __fieldWrite534_8(receiver, __call534_7());
    __fieldWrite534_10(receiver, __call534_9());
    __fieldWrite534_11(receiver, 0);
    __fieldWrite534_12(receiver, p0);
    __call534_14(__call534_13(receiver), p3);
    __call534_16(__fieldRead534_15(receiver), receiver);
    __call534_20(receiver, new moom.DT(__invokedynamic534_17(12823, (7119638485158888846L ^ life6_3)), __invokedynamic534_18(15718, (6213743970996914942L ^ life6_3)), __invokedynamic534_19(26063, (6137083213162041936L ^ life6_3))));
    spill534_0 = __call534_21();
    __fieldWrite534_23(receiver, __call534_22(receiver));
    __fieldWrite534_24(receiver, new moom.IP());
    __call534_25(receiver);
    __call534_26(receiver);
    life8_78 = spill534_0;
    spill534_1 = __fieldRead534_28(__fieldRead534_27(receiver));
    if (!((life8_78 == null))) {
        forwardValue534_88_0 = spill534_1;
        break forward_join_88;
    }
    if (!((spill534_1 != null))) {
        break forward_join_107;
    }
    forwardValue534_88_0 = __fieldRead534_30(__fieldRead534_29(receiver));
    }
    if (!((life8_78 == null))) {
        forwardValue534_105_0 = forwardValue534_88_0;
        break forward_join_105;
    }
    if (!((__call534_31(forwardValue534_88_0) == __classLiteral534_32()))) {
        break forward_join_107;
    }
    __fieldWrite534_35(__fieldRead534_33(receiver), new moom.jJ(__fieldRead534_34(receiver), p0));
    forwardValue534_105_0 = __fieldRead534_37(__fieldRead534_36(receiver));
    }
    __call534_39(__cast534_38(forwardValue534_105_0));
    }
    if (!((life8_78 != null))) {
        break forward_join_112;
    }
    __call534_40(new java.lang.String[2]);
    }
    return;
}
public static void h534_0(moom.Oo p0) throws Throwable {
    throw __call3053400_0(p0);
}
public static void h534_1(moom.Oo p0) throws Throwable {
    throw __call3053401_0(p0);
}
public static void h534_2(moom.Oo p0) throws Throwable {
    throw __call3053402_0(p0);
}
public static void h534_3(moom.Oo p0) throws Throwable {
    throw __call3053403_0(p0);
}
public static void h534_4(moom.Oo p0) throws Throwable {
    throw __call3053404_0(p0);
}
private static native long __fieldRead534_0() throws Throwable;
private static native moom.EA __call534_1(int a0) throws Throwable;
private static native void __directSuperInit534_2(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.world.storage.ISaveHandler a1, net.minecraft.world.storage.WorldInfo a2, moom.EA a3, moom.A9 a4, boolean a5) throws Throwable;
private static native java.util.HashSet __call534_3() throws Throwable;
private static native void __fieldWrite534_4(net.minecraft.client.multiplayer.WorldClient a0, java.util.HashSet a1) throws Throwable;
private static native java.util.HashSet __call534_5() throws Throwable;
private static native void __fieldWrite534_6(net.minecraft.client.multiplayer.WorldClient a0, java.util.HashSet a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call534_7() throws Throwable;
private static native void __fieldWrite534_8(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.client.Minecraft a1) throws Throwable;
private static native java.util.HashSet __call534_9() throws Throwable;
private static native void __fieldWrite534_10(net.minecraft.client.multiplayer.WorldClient a0, java.util.HashSet a1) throws Throwable;
private static native void __fieldWrite534_11(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native void __fieldWrite534_12(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.client.network.NetHandlerPlayClient a1) throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call534_13(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call534_14(net.minecraft.world.storage.WorldInfo a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native moom.EA __fieldRead534_15(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call534_16(moom.EA a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native int __invokedynamic534_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic534_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic534_19(int a0, long a1) throws Throwable;
private static native void __call534_20(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call534_21() throws Throwable;
private static native moom.Fn __call534_22(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __fieldWrite534_23(net.minecraft.client.multiplayer.WorldClient a0, moom.Fn a1) throws Throwable;
private static native void __fieldWrite534_24(net.minecraft.client.multiplayer.WorldClient a0, moom.IP a1) throws Throwable;
private static native void __call534_25(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call534_26(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead534_27(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native moom.jI __fieldRead534_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead534_29(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native moom.jI __fieldRead534_30(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Class __call534_31(moom.jI a0) throws Throwable;
private static native java.lang.Class __classLiteral534_32() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead534_33(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead534_34(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __fieldWrite534_35(net.minecraft.client.Minecraft a0, moom.jJ a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead534_36(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native moom.jI __fieldRead534_37(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.jJ __cast534_38(moom.jI a0) throws Throwable;
private static native void __call534_39(moom.jJ a0) throws Throwable;
private static native void __call534_40(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call3053400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3053401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3053402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3053403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3053404_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6d633acad65a5127dadd(net.minecraft.client.multiplayer.WorldClient a0, double a1, double a2, double a3, java.lang.String a4, float a5, float a6, boolean a7) throws E;
private static final class __SourceHandler_6d633acad65a5127dadd {

public static void f1334(net.minecraft.client.multiplayer.WorldClient receiver, double p0, double p1, double p2, java.lang.String p3, float p4, float p5, boolean p6) throws Throwable {
    int forwardValue1334_39_0;
    double forwardValue1334_43_0;
    double forwardValue1334_43_1;
    net.minecraft.entity.Entity[] spill1334_0;
    boolean spill1334_1;
    double spill1334_2;
    double spill1334_3;
    long life11_3;
    double life14_11;
    moom.fY life16_28;
    net.minecraft.entity.Entity[] life13_29;
    double life17_56;
    forward_join_61: {
    forward_join_56: {
    forward_join_43: {
    forward_join_39: {
    life11_3 = (__fieldRead1334_0() ^ 61382990286923L);
    life14_11 = __call1334_3(__call1334_2(__fieldRead1334_1(receiver)), p0, p1, p2);
    spill1334_0 = __call1334_4();
    life16_28 = new moom.fY(new moom.DD(p3), p4, p5, ((float) p0), ((float) p1), ((float) p2));
    life13_29 = spill1334_0;
    spill1334_1 = p6;
    if (!((life13_29 == null))) {
        forwardValue1334_39_0 = __integerCategory1334_5(spill1334_1);
        break forward_join_39;
    }
    if (!(spill1334_1)) {
        break forward_join_56;
    }
    spill1334_2 = life14_11;
    spill1334_3 = 0x1.9p6d;
    if (!((life13_29 == null))) {
        forwardValue1334_43_0 = spill1334_2;
        forwardValue1334_43_1 = spill1334_3;
        break forward_join_43;
    }
    forwardValue1334_39_0 = __numericCompare1334_6(spill1334_2, spill1334_3);
    }
    if (!((forwardValue1334_39_0 > 0))) {
        break forward_join_56;
    }
    forwardValue1334_43_0 = __call1334_7(life14_11);
    forwardValue1334_43_1 = 0x1.4p5d;
    }
    life17_56 = (forwardValue1334_43_0 / forwardValue1334_43_1);
    __call1334_10(__call1334_9(__fieldRead1334_8(receiver)), life16_28, ((int) (life17_56 * 0x1.4p4d)));
    if (!((life13_29 != null))) {
        break forward_join_61;
    }
    }
    __call1334_13(__call1334_12(__fieldRead1334_11(receiver)), life16_28);
    }
    return;
}
public static void h1334_0(moom.Oo p0) throws Throwable {
    throw __call1133400_0(p0);
}
public static void h1334_1(moom.Oo p0) throws Throwable {
    throw __call1133401_0(p0);
}
public static void h1334_2(moom.Oo p0) throws Throwable {
    throw __call1133402_0(p0);
}
public static void h1334_3(moom.Oo p0) throws Throwable {
    throw __call1133403_0(p0);
}
public static void h1334_4(moom.Oo p0) throws Throwable {
    throw __call1133404_0(p0);
}
private static native long __fieldRead1334_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1334_1(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.entity.Entity __call1334_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call1334_3(net.minecraft.entity.Entity a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.entity.Entity[] __call1334_4() throws Throwable;
private static native int __integerCategory1334_5(boolean value) throws Throwable;
private static native int __numericCompare1334_6(double a0, double a1) throws Throwable;
private static native double __call1334_7(double a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1334_8(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __call1334_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1334_10(net.minecraft.client.audio.SoundHandler a0, moom.fY a1, int a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1334_11(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __call1334_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1334_13(net.minecraft.client.audio.SoundHandler a0, moom.fY a1) throws Throwable;
private static native java.lang.Exception __call1133400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133404_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.Entity __sourceHandlerCall_56e2e5ff086e3acd8a89(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws E;
private static final class __SourceHandler_56e2e5ff086e3acd8a89 {

public static net.minecraft.entity.Entity f493(net.minecraft.client.multiplayer.WorldClient receiver, int p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue493_17_0;
    long life2_3;
    forward_join_17: {
    forward_join_14: {
    life2_3 = (__fieldRead493_0() ^ 35389871752515L);
    if (!((p0 == __call493_3(__fieldRead493_2(__fieldRead493_1(receiver)))))) {
        break forward_join_14;
    }
    forwardValue493_17_0 = __fieldRead493_5(__fieldRead493_4(receiver));
    break forward_join_17;
    }
    forwardValue493_17_0 = __call493_6(receiver, p0);
    }
    return forwardValue493_17_0;
}
public static net.minecraft.entity.Entity h493_0(moom.Oo p0) throws Throwable {
    throw __call2049300_0(p0);
}
private static native long __fieldRead493_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead493_1(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead493_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call493_3(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead493_4(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead493_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __call493_6(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native java.lang.Exception __call2049300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0241786e35a662946b03(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_0241786e35a662946b03 {

public static void f1335(net.minecraft.client.multiplayer.WorldClient receiver, int p0, int p1, int p2) throws Throwable {
    net.minecraft.item.ItemStack lexicalValue1335_32_0;
    int lexicalValue1335_39_0;
    net.minecraft.entity.Entity[] spill1335_0;
    net.minecraft.item.ItemStack spill1335_1;
    long life4_3;
    int life7_10;
    net.minecraft.entity.Entity[] life6_11;
    java.util.Random life8_15;
    net.minecraft.item.ItemStack life9_20;
    int life10_47;
    moom.DU life11_51;
    int life12_53;
    int life13_72;
    int life14_84;
    int life15_96;
    net.minecraft.block.state.IBlockState life16_106;
    lexical_join_140: {
    lexical_join_39: {
    lexical_join_38: {
    lexical_join_32: {
    life4_3 = (__fieldRead1335_0() ^ 108569644384479L);
    spill1335_0 = __call1335_1();
    life7_10 = __invokedynamic1335_2(15652, (2920215908237205605L ^ life4_3));
    life6_11 = spill1335_0;
    life8_15 = new java.util.Random();
    life9_20 = __call1335_5(__fieldRead1335_4(__fieldRead1335_3(receiver)));
    if (!((__call1335_8(__fieldRead1335_7(__fieldRead1335_6(receiver))) == __fieldRead1335_9()))) {
        break lexical_join_38;
    }
    spill1335_1 = life9_20;
    if (!((life6_11 == null))) {
        lexicalValue1335_32_0 = spill1335_1;
        break lexical_join_32;
    }
    if (!((spill1335_1 != null))) {
        break lexical_join_38;
    }
    lexicalValue1335_32_0 = life9_20;
    }
    if (!((__call1335_11(__call1335_10(lexicalValue1335_32_0)) == __fieldRead1335_12()))) {
        break lexical_join_38;
    }
    lexicalValue1335_39_0 = 1;
    break lexical_join_39;
    }
    lexicalValue1335_39_0 = 0;
    }
    life10_47 = lexicalValue1335_39_0;
    life11_51 = new moom.DU();
    life12_53 = 0;
    lexical_cycle_46: while (true) {
    lexical_join_138: {
    lexical_join_137: {
    if (!((life12_53 < __invokedynamic1335_13(2511, (309602422730445960L ^ life4_3))))) {
        break lexical_join_140;
    }
    life13_72 = ((p0 + __call1335_15(__fieldRead1335_14(receiver), life7_10)) - __call1335_17(__fieldRead1335_16(receiver), life7_10));
    life14_84 = ((p1 + __call1335_19(__fieldRead1335_18(receiver), life7_10)) - __call1335_21(__fieldRead1335_20(receiver), life7_10));
    life15_96 = ((p2 + __call1335_23(__fieldRead1335_22(receiver), life7_10)) - __call1335_25(__fieldRead1335_24(receiver), life7_10));
    __call1335_26(life11_51, life13_72, life14_84, life15_96);
    life16_106 = __call1335_27(receiver, life11_51);
    __call1335_29(__call1335_28(life16_106), receiver, life11_51, life16_106, life8_15);
    if (!((life6_11 == null))) {
        break lexical_join_138;
    }
    if (!((life10_47 != 0))) {
        break lexical_join_137;
    }
    if (!((__call1335_30(life16_106) == __fieldRead1335_31()))) {
        break lexical_join_137;
    }
    __call1335_33(receiver, __fieldRead1335_32(), ((double) (((float) life13_72) + 0x1.0p-1f)), ((double) (((float) life14_84) + 0x1.0p-1f)), ((double) (((float) life15_96) + 0x1.0p-1f)), 0x0.0p0d, 0x0.0p0d, 0x0.0p0d, new int[0]);
    }
    life12_53 += 1;
    }
    if (!((life6_11 != null))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    return;
}
public static void h1335_0(moom.Oo p0) throws Throwable {
    throw __call1133500_0(p0);
}
public static void h1335_1(moom.Oo p0) throws Throwable {
    throw __call1133501_0(p0);
}
public static void h1335_2(moom.Oo p0) throws Throwable {
    throw __call1133502_0(p0);
}
public static void h1335_3(moom.Oo p0) throws Throwable {
    throw __call1133503_0(p0);
}
public static void h1335_4(moom.Oo p0) throws Throwable {
    throw __call1133504_0(p0);
}
public static void h1335_5(moom.Oo p0) throws Throwable {
    throw __call1133505_0(p0);
}
private static native long __fieldRead1335_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1335_1() throws Throwable;
private static native int __invokedynamic1335_2(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1335_3(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1335_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1335_5(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1335_6(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native moom.jI __fieldRead1335_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call1335_8(moom.jI a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead1335_9() throws Throwable;
private static native net.minecraft.item.Item __call1335_10(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.block.Block __call1335_11(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead1335_12() throws Throwable;
private static native int __invokedynamic1335_13(int a0, long a1) throws Throwable;
private static native java.util.Random __fieldRead1335_14(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call1335_15(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead1335_16(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call1335_17(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead1335_18(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call1335_19(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead1335_20(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call1335_21(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead1335_22(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call1335_23(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead1335_24(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call1335_25(java.util.Random a0, int a1) throws Throwable;
private static native moom.DU __call1335_26(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1335_27(net.minecraft.client.multiplayer.WorldClient a0, moom.DU a1) throws Throwable;
private static native net.minecraft.block.Block __call1335_28(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __call1335_29(net.minecraft.block.Block a0, net.minecraft.client.multiplayer.WorldClient a1, moom.DU a2, net.minecraft.block.state.IBlockState a3, java.util.Random a4) throws Throwable;
private static native net.minecraft.block.Block __call1335_30(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead1335_31() throws Throwable;
private static native net.minecraft.util.EnumParticleTypes __fieldRead1335_32() throws Throwable;
private static native void __call1335_33(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.util.EnumParticleTypes a1, double a2, double a3, double a4, double a5, double a6, double a7, int[] a8) throws Throwable;
private static native java.lang.Exception __call1133500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133505_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_001aee16ecf9989c6bb4(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2, boolean a3) throws E;
private static final class __SourceHandler_001aee16ecf9989c6bb4 {

public static void f1336(net.minecraft.client.multiplayer.WorldClient receiver, int p0, int p1, boolean p2) throws Throwable {
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_73: {
    forward_join_23: {
    forward_join_18: {
    forward_join_16: {
    life4_3 = (__fieldRead1336_0() ^ 58870729522042L);
    life6_5 = __call1336_1();
    if (!((life6_5 == null))) { break forward_join_16; }
    if (!(p2)) { break forward_join_18; }
    __call1336_3(__fieldRead1336_2(receiver), p0, p1);
    }
    if (!((life6_5 != null))) { break forward_join_23; }
    }
    __call1336_5(__fieldRead1336_4(receiver), p0, p1);
    }
    if (!((!p2))) { break forward_join_73; }
    __call1336_13(receiver, (p0 * __invokedynamic1336_6(15504, (3914259150299241084L ^ life4_3))), 0, (p1 * __invokedynamic1336_7(15504, (3914259150299241084L ^ life4_3))), ((p0 * __invokedynamic1336_8(15504, (3914259150299241084L ^ life4_3))) + __invokedynamic1336_9(17655, (5222348407698383385L ^ life4_3))), __invokedynamic1336_10(2925, (767833230392929672L ^ life4_3)), ((p1 * __invokedynamic1336_11(15504, (3914259150299241084L ^ life4_3))) + __invokedynamic1336_12(3643, (105933922017323229L ^ life4_3))));
    }
    return;
}
public static void h1336_0(moom.Oo p0) throws Throwable {
    throw __call1133600_0(p0);
}
public static void h1336_1(moom.Oo p0) throws Throwable {
    throw __call1133601_0(p0);
}
public static void h1336_2(moom.Oo p0) throws Throwable {
    throw __call1133602_0(p0);
}
public static void h1336_3(moom.Oo p0) throws Throwable {
    throw __call1133603_0(p0);
}
private static native long __fieldRead1336_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1336_1() throws Throwable;
private static native moom.jH __fieldRead1336_2(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1336_3(moom.jH a0, int a1, int a2) throws Throwable;
private static native moom.jH __fieldRead1336_4(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call1336_5(moom.jH a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic1336_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic1336_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic1336_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic1336_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic1336_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic1336_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic1336_12(int a0, long a1) throws Throwable;
private static native void __call1336_13(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native java.lang.Exception __call1133600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133603_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f5645f0e7b7130aa8a75(net.minecraft.client.multiplayer.WorldClient a0, int a1, net.minecraft.entity.Entity a2) throws E;
private static final class __SourceHandler_f5645f0e7b7130aa8a75 {

public static void f1337(net.minecraft.client.multiplayer.WorldClient receiver, int p0, net.minecraft.entity.Entity p1) throws Throwable {
    net.minecraft.entity.Entity forwardValue1337_23_0;
    net.minecraft.client.multiplayer.WorldClient forwardValue1337_37_0;
    net.minecraft.entity.Entity[] spill1337_0;
    net.minecraft.entity.Entity spill1337_1;
    net.minecraft.client.multiplayer.WorldClient spill1337_2;
    long life3_3;
    net.minecraft.entity.Entity life6_8;
    net.minecraft.entity.Entity[] life5_9;
    forward_join_37: {
    forward_join_36: {
    forward_join_23: {
    forward_join_17: {
    life3_3 = (__fieldRead1337_0() ^ 61299916391467L);
    spill1337_0 = __call1337_1();
    life6_8 = __call1337_2(receiver, p0);
    life5_9 = spill1337_0;
    spill1337_1 = life6_8;
    if (!((life5_9 == null))) {
        forwardValue1337_23_0 = spill1337_1;
        break forward_join_23;
    }
    if (!((spill1337_1 != null))) {
        break forward_join_17;
    }
    __call1337_3(receiver, life6_8);
    }
    __call1337_5(__fieldRead1337_4(receiver), p1);
    forwardValue1337_23_0 = p1;
    }
    __call1337_6(forwardValue1337_23_0, p0);
    spill1337_2 = receiver;
    if (!((life5_9 == null))) {
        forwardValue1337_37_0 = spill1337_2;
        break forward_join_37;
    }
    if (!((!__call1337_7(spill1337_2, p1)))) {
        break forward_join_36;
    }
    __call1337_9(__fieldRead1337_8(receiver), p1);
    }
    forwardValue1337_37_0 = receiver;
    }
    __call1337_11(__fieldRead1337_10(forwardValue1337_37_0), p0, p1);
    return;
}
public static void h1337_0(moom.Oo p0) throws Throwable {
    throw __call1133700_0(p0);
}
public static void h1337_1(moom.Oo p0) throws Throwable {
    throw __call1133701_0(p0);
}
public static void h1337_2(moom.Oo p0) throws Throwable {
    throw __call1133702_0(p0);
}
public static void h1337_3(moom.Oo p0) throws Throwable {
    throw __call1133703_0(p0);
}
private static native long __fieldRead1337_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1337_1() throws Throwable;
private static native net.minecraft.entity.Entity __call1337_2(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native void __call1337_3(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.util.Set __fieldRead1337_4(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call1337_5(java.util.Set a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native void __call1337_6(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native boolean __call1337_7(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.util.Set __fieldRead1337_8(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call1337_9(java.util.Set a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native moom.Dd __fieldRead1337_10(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call1337_11(moom.Dd a0, int a1, net.minecraft.entity.Entity a2) throws Throwable;
private static native java.lang.Exception __call1133700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133703_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_bf07ab0325f53b1f6c91(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, int a2) throws E;
private static final class __SourceHandler_bf07ab0325f53b1f6c91 {

public static int f1338(net.minecraft.client.multiplayer.WorldClient receiver, moom.DT p0, int p1) throws Throwable {
    int forwardValue1338_20_0;
    net.minecraft.entity.Entity[] spill1338_0;
    boolean spill1338_1;
    long life3_3;
    int life6_9;
    net.minecraft.entity.Entity[] life5_10;
    forward_join_20: {
    forward_join_19: {
    life3_3 = (__fieldRead1338_0() ^ 8082580431753L);
    spill1338_0 = __call1338_1();
    life6_9 = __call1338_2(receiver, p0, p1);
    life5_10 = spill1338_0;
    spill1338_1 = __call1338_3();
    if (!((life5_10 == null))) {
        forwardValue1338_20_0 = __integerCategory1338_4(spill1338_1);
        break forward_join_20;
    }
    if (!(spill1338_1)) {
        break forward_join_19;
    }
    life6_9 = __call1338_5(p0, life6_9);
    }
    forwardValue1338_20_0 = life6_9;
    }
    return forwardValue1338_20_0;
}
public static void h1338_0(moom.Oo p0) throws Throwable {
    throw __call1133800_0(p0);
}
private static native long __fieldRead1338_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1338_1() throws Throwable;
private static native int __call1338_2(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1, int a2) throws Throwable;
private static native boolean __call1338_3() throws Throwable;
private static native int __integerCategory1338_4(boolean value) throws Throwable;
private static native int __call1338_5(moom.DT a0, int a1) throws Throwable;
private static native java.lang.Exception __call1133800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.entity.Entity __sourceHandlerCall_b1ce57309da55dffd5f4(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws E;
private static final class __SourceHandler_b1ce57309da55dffd5f4 {

public static net.minecraft.entity.Entity f1339(net.minecraft.client.multiplayer.WorldClient receiver, int p0) throws Throwable {
    net.minecraft.entity.Entity forwardValue1339_25_0;
    net.minecraft.entity.Entity[] spill1339_0;
    net.minecraft.entity.Entity spill1339_1;
    long life2_3;
    net.minecraft.entity.Entity life5_10;
    net.minecraft.entity.Entity[] life4_11;
    forward_join_25: {
    forward_join_24: {
    life2_3 = (__fieldRead1339_0() ^ 129553614781537L);
    spill1339_0 = __call1339_1();
    life5_10 = __cast1339_4(__call1339_3(__fieldRead1339_2(receiver), p0));
    life4_11 = spill1339_0;
    spill1339_1 = life5_10;
    if (!((life4_11 == null))) {
        forwardValue1339_25_0 = spill1339_1;
        break forward_join_25;
    }
    if (!((spill1339_1 != null))) {
        break forward_join_24;
    }
    __call1339_6(__fieldRead1339_5(receiver), life5_10);
    __call1339_7(receiver, life5_10);
    }
    forwardValue1339_25_0 = life5_10;
    }
    return forwardValue1339_25_0;
}
public static void h1339_0(moom.Oo p0) throws Throwable {
    throw __call1133900_0(p0);
}
public static void h1339_1(moom.Oo p0) throws Throwable {
    throw __call1133901_0(p0);
}
private static native long __fieldRead1339_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1339_1() throws Throwable;
private static native moom.Dd __fieldRead1339_2(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.lang.Object __call1339_3(moom.Dd a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __cast1339_4(java.lang.Object a0) throws Throwable;
private static native java.util.Set __fieldRead1339_5(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call1339_6(java.util.Set a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native void __call1339_7(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.lang.Exception __call1133900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1133901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6fbe7069fd69a9e2db5a(net.minecraft.client.multiplayer.WorldClient a0, long a1) throws E;
private static final class __SourceHandler_6fbe7069fd69a9e2db5a {

public static void f1340(net.minecraft.client.multiplayer.WorldClient receiver, long p0) throws Throwable {
    long forwardValue1340_14_0;
    long spill1340_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_27: {
    forward_join_22: {
    forward_join_14: {
    life3_3 = (__fieldRead1340_0() ^ 94255287101480L);
    life5_5 = __call1340_1();
    spill1340_0 = p0;
    if (!((life5_5 == null))) {
        forwardValue1340_14_0 = spill1340_0;
        break forward_join_14;
    }
    if (!((__numericCompare1340_2(spill1340_0, 0L) < 0))) {
        break forward_join_22;
    }
    forwardValue1340_14_0 = (-p0);
    }
    p0 = forwardValue1340_14_0;
    __call1340_4(__call1340_3(receiver), "doDaylightCycle", "false");
    if (!((life5_5 != null))) {
        break forward_join_27;
    }
    }
    __call1340_6(__call1340_5(receiver), "doDaylightCycle", "true");
    }
    __call1340_7(receiver, p0);
    return;
}
public static void h1340_0(moom.Oo p0) throws Throwable {
    throw __call1134000_0(p0);
}
public static void h1340_1(moom.Oo p0) throws Throwable {
    throw __call1134001_0(p0);
}
public static void h1340_2(moom.Oo p0) throws Throwable {
    throw __call1134002_0(p0);
}
private static native long __fieldRead1340_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1340_1() throws Throwable;
private static native int __numericCompare1340_2(long a0, long a1) throws Throwable;
private static native net.minecraft.world.GameRules __call1340_3(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call1340_4(net.minecraft.world.GameRules a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.world.GameRules __call1340_5(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call1340_6(net.minecraft.world.GameRules a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call1340_7(net.minecraft.client.multiplayer.WorldClient a0, long a1) throws Throwable;
private static native java.lang.Exception __call1134000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1134001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1134002_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_97736ab817a2dc4f1f22(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_97736ab817a2dc4f1f22 {

public static void f216(net.minecraft.client.multiplayer.WorldClient receiver, net.minecraft.entity.Entity p0) throws Throwable {
    int forwardValue216_20_0;
    int forwardValue216_36_0;
    net.minecraft.entity.Entity[] spill216_0;
    boolean spill216_1;
    long life2_3;
    int life5_9;
    net.minecraft.entity.Entity[] life4_10;
    int life5_38;
    forward_join_37: {
    forward_join_36: {
    forward_join_32: {
    forward_join_20: {
    life2_3 = (__fieldRead216_0() ^ 95265002349624L);
    __call216_1(receiver, p0);
    spill216_0 = __call216_2();
    life5_9 = 0;
    life4_10 = spill216_0;
    spill216_1 = __call216_4(__fieldRead216_3(receiver), p0);
    if (!((life4_10 == null))) {
        forwardValue216_20_0 = __integerCategory216_5(spill216_1);
        break forward_join_20;
    }
    if (!(spill216_1)) {
        break forward_join_37;
    }
    forwardValue216_20_0 = __integerCategory216_7(__call216_6(p0));
    }
    if (!((life4_10 == null))) {
        forwardValue216_36_0 = forwardValue216_20_0;
        break forward_join_36;
    }
    if (!((forwardValue216_20_0 != 0))) {
        break forward_join_32;
    }
    __call216_9(__fieldRead216_8(receiver), p0);
    life5_38 = 1;
    if (!((life4_10 != null))) {
        break forward_join_37;
    }
    }
    forwardValue216_36_0 = __integerCategory216_12(__call216_11(__fieldRead216_10(receiver), p0));
    }
    __discardScalar216_13(forwardValue216_36_0);
    }
    return;
}
public static void h216_0(moom.Oo p0) throws Throwable {
    throw __call1021600_0(p0);
}
public static void h216_1(moom.Oo p0) throws Throwable {
    throw __call1021601_0(p0);
}
public static void h216_2(moom.Oo p0) throws Throwable {
    throw __call1021602_0(p0);
}
public static void h216_3(moom.Oo p0) throws Throwable {
    throw __call1021603_0(p0);
}
private static native long __fieldRead216_0() throws Throwable;
private static native void __call216_1(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call216_2() throws Throwable;
private static native java.util.Set __fieldRead216_3(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call216_4(java.util.Set a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory216_5(boolean value) throws Throwable;
private static native boolean __call216_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory216_7(boolean value) throws Throwable;
private static native java.util.Set __fieldRead216_8(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call216_9(java.util.Set a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.util.Set __fieldRead216_10(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call216_11(java.util.Set a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory216_12(boolean value) throws Throwable;
private static native void __discardScalar216_13(int a0) throws Throwable;
private static native java.lang.Exception __call1021600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1021601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1021602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1021603_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_40009ed38a0fd37825df(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_40009ed38a0fd37825df {

public static boolean f1342(net.minecraft.client.multiplayer.WorldClient receiver, net.minecraft.entity.Entity p0) throws Throwable {
    int forwardValue1342_28_0;
    int forwardValue1342_41_0;
    net.minecraft.entity.Entity[] spill1342_0;
    int spill1342_1;
    long life2_3;
    int life5_8;
    net.minecraft.entity.Entity[] life4_9;
    forward_join_41: {
    forward_join_40: {
    forward_join_28: {
    forward_join_26: {
    life2_3 = (__fieldRead1342_0() ^ 107364170782242L);
    spill1342_0 = __call1342_1();
    life5_8 = __integerCategory1342_3(__call1342_2(receiver, p0));
    life4_9 = spill1342_0;
    __call1342_5(__fieldRead1342_4(receiver), p0);
    spill1342_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue1342_28_0 = spill1342_1;
        break forward_join_28;
    }
    if (!((spill1342_1 == 0))) {
        break forward_join_26;
    }
    __call1342_7(__fieldRead1342_6(receiver), p0);
    if (!((life4_9 != null))) {
        break forward_join_40;
    }
    }
    forwardValue1342_28_0 = __instanceOf1342_8(p0);
    }
    if (!((life4_9 == null))) {
        forwardValue1342_41_0 = forwardValue1342_28_0;
        break forward_join_41;
    }
    if (!((forwardValue1342_28_0 != 0))) {
        break forward_join_40;
    }
    __call1342_12(__call1342_10(__fieldRead1342_9(receiver)), new moom.fW(__cast1342_11(p0)));
    }
    forwardValue1342_41_0 = life5_8;
    }
    return __integerCategory1342_13(forwardValue1342_41_0);
}
public static void h1342_0(moom.Oo p0) throws Throwable {
    throw __call1134200_0(p0);
}
public static void h1342_1(moom.Oo p0) throws Throwable {
    throw __call1134201_0(p0);
}
public static void h1342_2(moom.Oo p0) throws Throwable {
    throw __call1134202_0(p0);
}
public static void h1342_3(moom.Oo p0) throws Throwable {
    throw __call1134203_0(p0);
}
public static void h1342_4(moom.Oo p0) throws Throwable {
    throw __call1134204_0(p0);
}
private static native long __fieldRead1342_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1342_1() throws Throwable;
private static native boolean __call1342_2(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory1342_3(boolean value) throws Throwable;
private static native java.util.Set __fieldRead1342_4(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call1342_5(java.util.Set a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.util.Set __fieldRead1342_6(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call1342_7(java.util.Set a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __instanceOf1342_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1342_9(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __call1342_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart __cast1342_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call1342_12(net.minecraft.client.audio.SoundHandler a0, moom.fW a1) throws Throwable;
private static native boolean __integerCategory1342_13(int value) throws Throwable;
private static native java.lang.Exception __call1134200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1134201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1134202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1134203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1134204_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_b778d3541c648efab05e(net.minecraft.client.multiplayer.WorldClient a0) throws E;
private static final class __SourceHandler_b778d3541c648efab05e {

public static boolean f1343(net.minecraft.client.multiplayer.WorldClient receiver) throws Throwable {
    int forwardValue1343_22_0;
    net.minecraft.entity.Entity[] spill1343_0;
    int spill1343_1;
    long life1_3;
    moom.jI life5_8;
    net.minecraft.entity.Entity[] life3_9;
    moom.jJ life4_20;
    forward_join_22: {
    forward_join_21: {
    life1_3 = (__fieldRead1343_0() ^ 53386444246132L);
    spill1343_0 = __call1343_1();
    life5_8 = __fieldRead1343_3(__fieldRead1343_2(receiver));
    life3_9 = spill1343_0;
    spill1343_1 = __instanceOf1343_4(life5_8);
    if (!((life3_9 == null))) {
        forwardValue1343_22_0 = spill1343_1;
        break forward_join_22;
    }
    if (!((spill1343_1 != 0))) {
        break forward_join_21;
    }
    life4_20 = __cast1343_5(life5_8);
    return __call1343_6(life4_20);
    }
    forwardValue1343_22_0 = 0;
    }
    return __integerCategory1343_7(forwardValue1343_22_0);
}
public static void h1343_0(moom.Oo p0) throws Throwable {
    throw __call1134300_0(p0);
}
private static native long __fieldRead1343_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1343_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1343_2(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native moom.jI __fieldRead1343_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf1343_4(moom.jI a0) throws Throwable;
private static native moom.jJ __cast1343_5(moom.jI a0) throws Throwable;
private static native boolean __call1343_6(moom.jJ a0) throws Throwable;
private static native boolean __integerCategory1343_7(int value) throws Throwable;
private static native java.lang.Exception __call1134300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f3ebc73257ee9def9811(net.minecraft.client.multiplayer.WorldClient a0) throws E;
private static final class __SourceHandler_f3ebc73257ee9def9811 {

public static void f217(net.minecraft.client.multiplayer.WorldClient receiver) throws Throwable {
    int lexicalValue217_32_0;
    int lexicalValue217_80_0;
    net.minecraft.entity.Entity[] spill217_0;
    boolean spill217_1;
    boolean spill217_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    int life4_38;
    net.minecraft.entity.Entity life5_65;
    lexical_join_80: {
    lexical_join_73: {
    lexical_join_32: {
    lexical_join_27: {
    life1_3 = (__fieldRead217_0() ^ 9395603060106L);
    spill217_0 = __call217_1();
    __call217_2(receiver);
    life3_7 = spill217_0;
    __call217_4(receiver, (__call217_3(receiver) + 1L));
    spill217_1 = __call217_6(__call217_5(receiver), "doDaylightCycle");
    if (!((life3_7 == null))) {
        lexicalValue217_32_0 = __integerCategory217_7(spill217_1);
        break lexical_join_32;
    }
    if (!(spill217_1)) {
        break lexical_join_27;
    }
    __call217_9(receiver, (__call217_8(receiver) + 1L));
    }
    __call217_11(__fieldRead217_10(receiver), "reEntryProcessing");
    lexicalValue217_32_0 = 0;
    }
    life4_38 = lexicalValue217_32_0;
    lexical_cycle_33: while (true) {
    lexical_join_71: {
    lexical_join_70: {
    if (!((life4_38 < __invokedynamic217_12(11293, (7372689374317708302L ^ life1_3))))) {
        break lexical_join_73;
    }
    spill217_2 = __call217_14(__fieldRead217_13(receiver));
    if (!((life3_7 == null))) {
        lexicalValue217_80_0 = __integerCategory217_15(spill217_2);
        break lexical_join_80;
    }
    if (!((life3_7 == null))) {
        lexicalValue217_80_0 = __integerCategory217_16(spill217_2);
        break lexical_join_80;
    }
    if (!((!spill217_2))) {
        break lexical_join_73;
    }
    life5_65 = __cast217_20(__call217_19(__call217_18(__fieldRead217_17(receiver))));
    __call217_22(__fieldRead217_21(receiver), life5_65);
    if (!((life3_7 == null))) {
        break lexical_join_71;
    }
    if (!((!__call217_24(__fieldRead217_23(receiver), life5_65)))) {
        break lexical_join_70;
    }
    __call217_25(receiver, life5_65);
    }
    life4_38 += 1;
    }
    if (!((life3_7 != null))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    __call217_27(__fieldRead217_26(receiver), "chunkCache");
    lexicalValue217_80_0 = __integerCategory217_30(__call217_29(__fieldRead217_28(receiver)));
    }
    __discardScalar217_31(lexicalValue217_80_0);
    __call217_33(__fieldRead217_32(receiver), "blocks");
    __call217_34(receiver);
    __call217_36(__fieldRead217_35(receiver));
    return;
}
public static void h217_0(moom.Oo p0) throws Throwable {
    throw __call1021700_0(p0);
}
public static void h217_1(moom.Oo p0) throws Throwable {
    throw __call1021701_0(p0);
}
public static void h217_2(moom.Oo p0) throws Throwable {
    throw __call1021702_0(p0);
}
public static void h217_3(moom.Oo p0) throws Throwable {
    throw __call1021703_0(p0);
}
public static void h217_4(moom.Oo p0) throws Throwable {
    throw __call1021704_0(p0);
}
public static void h217_5(moom.Oo p0) throws Throwable {
    throw __call1021705_0(p0);
}
private static native long __fieldRead217_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call217_1() throws Throwable;
private static native void __call217_2(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native long __call217_3(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call217_4(net.minecraft.client.multiplayer.WorldClient a0, long a1) throws Throwable;
private static native net.minecraft.world.GameRules __call217_5(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call217_6(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory217_7(boolean value) throws Throwable;
private static native long __call217_8(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call217_9(net.minecraft.client.multiplayer.WorldClient a0, long a1) throws Throwable;
private static native moom.A9 __fieldRead217_10(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call217_11(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic217_12(int a0, long a1) throws Throwable;
private static native java.util.Set __fieldRead217_13(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call217_14(java.util.Set a0) throws Throwable;
private static native int __integerCategory217_15(boolean value) throws Throwable;
private static native int __integerCategory217_16(boolean value) throws Throwable;
private static native java.util.Set __fieldRead217_17(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.util.Iterator __call217_18(java.util.Set a0) throws Throwable;
private static native java.lang.Object __call217_19(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast217_20(java.lang.Object a0) throws Throwable;
private static native java.util.Set __fieldRead217_21(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call217_22(java.util.Set a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.util.List __fieldRead217_23(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call217_24(java.util.List a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native boolean __call217_25(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native moom.A9 __fieldRead217_26(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call217_27(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.jH __fieldRead217_28(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call217_29(moom.jH a0) throws Throwable;
private static native int __integerCategory217_30(boolean value) throws Throwable;
private static native void __discardScalar217_31(int a0) throws Throwable;
private static native moom.A9 __fieldRead217_32(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call217_33(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call217_34(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native moom.A9 __fieldRead217_35(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call217_36(moom.A9 a0) throws Throwable;
private static native java.lang.Exception __call1021700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1021701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1021702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1021703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1021704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1021705_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4878518999247b9861e7(net.minecraft.client.multiplayer.WorldClient a0) throws E;
private static final class __SourceHandler_4878518999247b9861e7 {

public static void f1345(net.minecraft.client.multiplayer.WorldClient receiver) throws Throwable {
    int lexicalValue1345_27_0;
    int lexicalValue1345_54_0;
    net.minecraft.entity.Entity[] spill1345_0;
    int spill1345_1;
    boolean spill1345_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_13;
    int life4_33;
    java.util.Iterator life5_37;
    moom.Ee life6_44;
    int life7_66;
    int life8_75;
    net.minecraft.world.chunk.Chunk life9_86;
    lexical_join_99: {
    lexical_join_27: {
    lexical_join_26: {
    life1_3 = (__fieldRead1345_0() ^ 129324001045047L);
    __call1345_1(receiver);
    spill1345_0 = __call1345_2();
    __call1345_5(__fieldRead1345_3(receiver), __fieldRead1345_4(receiver));
    life3_13 = spill1345_0;
    spill1345_1 = __call1345_7(__fieldRead1345_6(receiver));
    if (!((life3_13 == null))) {
        lexicalValue1345_27_0 = spill1345_1;
        break lexical_join_27;
    }
    if (!((spill1345_1 == __call1345_9(__fieldRead1345_8(receiver))))) {
        break lexical_join_26;
    }
    __call1345_11(__fieldRead1345_10(receiver));
    }
    lexicalValue1345_27_0 = 0;
    }
    life4_33 = lexicalValue1345_27_0;
    life5_37 = __call1345_13(__fieldRead1345_12(receiver));
    lexical_cycle_32: while (true) {
    lexical_join_97: {
    lexical_join_54: {
    if (!(__call1345_14(life5_37))) {
        break lexical_join_99;
    }
    life6_44 = __cast1345_16(__call1345_15(life5_37));
    spill1345_2 = __call1345_18(__fieldRead1345_17(receiver), life6_44);
    if (!((life3_13 == null))) {
        lexicalValue1345_54_0 = __integerCategory1345_19(spill1345_2);
        break lexical_join_54;
    }
    if (!((!spill1345_2))) {
        break lexical_join_97;
    }
    lexicalValue1345_54_0 = (__fieldRead1345_20(life6_44) * __invokedynamic1345_21(15504, (3914329431923460913L ^ life1_3)));
    }
    life7_66 = lexicalValue1345_54_0;
    life8_75 = (__fieldRead1345_22(life6_44) * __invokedynamic1345_23(15504, (3914329431923460913L ^ life1_3)));
    __call1345_25(__fieldRead1345_24(receiver), "getChunk");
    life9_86 = __call1345_28(receiver, __fieldRead1345_26(life6_44), __fieldRead1345_27(life6_44));
    __call1345_29(receiver, life7_66, life8_75, life9_86);
    __call1345_31(__fieldRead1345_30(receiver));
    __call1345_33(__fieldRead1345_32(receiver), life6_44);
    life4_33 += 1;
    if (!((life4_33 >= __invokedynamic1345_34(2107, (7506017719455235993L ^ life1_3))))) {
        break lexical_join_97;
    }
    return;
    }
    if (!((life3_13 != null))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    return;
}
public static void h1345_0(moom.Oo p0) throws Throwable {
    throw __call1134500_0(p0);
}
public static void h1345_1(moom.Oo p0) throws Throwable {
    throw __call1134501_0(p0);
}
public static void h1345_2(moom.Oo p0) throws Throwable {
    throw __call1134502_0(p0);
}
public static void h1345_3(moom.Oo p0) throws Throwable {
    throw __call1134503_0(p0);
}
public static void h1345_4(moom.Oo p0) throws Throwable {
    throw __call1134504_0(p0);
}
private static native long __fieldRead1345_0() throws Throwable;
private static native void __call1345_1(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call1345_2() throws Throwable;
private static native java.util.Set __fieldRead1345_3(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.util.Set __fieldRead1345_4(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call1345_5(java.util.Set a0, java.util.Set a1) throws Throwable;
private static native java.util.Set __fieldRead1345_6(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call1345_7(java.util.Set a0) throws Throwable;
private static native java.util.Set __fieldRead1345_8(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call1345_9(java.util.Set a0) throws Throwable;
private static native java.util.Set __fieldRead1345_10(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call1345_11(java.util.Set a0) throws Throwable;
private static native java.util.Set __fieldRead1345_12(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.util.Iterator __call1345_13(java.util.Set a0) throws Throwable;
private static native boolean __call1345_14(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1345_15(java.util.Iterator a0) throws Throwable;
private static native moom.Ee __cast1345_16(java.lang.Object a0) throws Throwable;
private static native java.util.Set __fieldRead1345_17(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call1345_18(java.util.Set a0, moom.Ee a1) throws Throwable;
private static native int __integerCategory1345_19(boolean value) throws Throwable;
private static native int __fieldRead1345_20(moom.Ee a0) throws Throwable;
private static native int __invokedynamic1345_21(int a0, long a1) throws Throwable;
private static native int __fieldRead1345_22(moom.Ee a0) throws Throwable;
private static native int __invokedynamic1345_23(int a0, long a1) throws Throwable;
private static native moom.A9 __fieldRead1345_24(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call1345_25(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead1345_26(moom.Ee a0) throws Throwable;
private static native int __fieldRead1345_27(moom.Ee a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1345_28(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2) throws Throwable;
private static native void __call1345_29(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2, net.minecraft.world.chunk.Chunk a3) throws Throwable;
private static native moom.A9 __fieldRead1345_30(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call1345_31(moom.A9 a0) throws Throwable;
private static native java.util.Set __fieldRead1345_32(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call1345_33(java.util.Set a0, moom.Ee a1) throws Throwable;
private static native int __invokedynamic1345_34(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1134500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1134501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1134502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1134503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1134504_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_30e71f3c0d003b52d99e(net.minecraft.client.multiplayer.WorldClient a0) throws E;
private static final class __SourceHandler_30e71f3c0d003b52d99e {

public static void f993(net.minecraft.client.multiplayer.WorldClient receiver) throws Throwable {
    int forestValue993_43_0;
    net.minecraft.client.multiplayer.WorldClient forestValue993_47_0;
    int forestValue993_47_1;
    int forestValue993_47_2;
    int forestValue993_71_0;
    net.minecraft.entity.Entity forestValue993_128_0;
    net.minecraft.entity.Entity forestValue993_131_0;
    int forestValue993_137_0;
    java.lang.Object forestValue993_165_0;
    net.minecraft.client.multiplayer.WorldClient forestValue993_167_0;
    net.minecraft.entity.Entity[] spill993_0;
    boolean spill993_1;
    net.minecraft.client.multiplayer.WorldClient spill993_2;
    int spill993_3;
    int spill993_4;
    boolean spill993_5;
    net.minecraft.entity.Entity spill993_6;
    net.minecraft.entity.Entity spill993_7;
    net.minecraft.entity.Entity spill993_8;
    boolean spill993_9;
    net.minecraft.entity.Entity spill993_10;
    net.minecraft.client.multiplayer.WorldClient spill993_11;
    long life1_3;
    net.minecraft.entity.Entity[] life3_11;
    java.util.Iterator life4_15;
    net.minecraft.entity.Entity life5_24;
    int life6_27;
    int life7_30;
    java.util.Iterator life4_69;
    net.minecraft.entity.Entity life5_79;
    net.minecraft.entity.Entity life5_94;
    int life4_114;
    net.minecraft.entity.Entity life5_127;
    int life6_182;
    int life7_185;
    forest_join_172: {
    forest_join_90: {
    forest_join_87: {
    forest_join_71: {
    forest_join_52: {
    life1_3 = (__fieldRead993_0() ^ 98453500119926L);
    spill993_0 = __call993_1();
    __call993_4(__fieldRead993_2(receiver), __fieldRead993_3(receiver));
    life3_11 = spill993_0;
    life4_15 = __call993_6(__fieldRead993_5(receiver));
    forest_cycle_16: while (true) {
    forest_join_50: {
    forest_join_47: {
    forest_join_43: {
    if (!(__call993_7(life4_15))) {
        break forest_join_52;
    }
    life5_24 = __cast993_9(__call993_8(life4_15));
    life6_27 = __fieldRead993_10(life5_24);
    life7_30 = __fieldRead993_11(life5_24);
    spill993_1 = __fieldRead993_12(life5_24);
    if (!((life3_11 == null))) {
        forestValue993_71_0 = __integerCategory993_13(spill993_1);
        break forest_join_71;
    }
    if (!((life3_11 == null))) {
        forestValue993_43_0 = __integerCategory993_14(spill993_1);
        break forest_join_43;
    }
    if (!(spill993_1)) {
        break forest_join_50;
    }
    spill993_2 = receiver;
    spill993_3 = life6_27;
    spill993_4 = life7_30;
    if (!((life3_11 == null))) {
        forestValue993_47_0 = spill993_2;
        forestValue993_47_1 = spill993_3;
        forestValue993_47_2 = spill993_4;
        break forest_join_47;
    }
    forestValue993_43_0 = __integerCategory993_16(__call993_15(spill993_2, spill993_3, spill993_4, 1));
    }
    if (!((forestValue993_43_0 != 0))) {
        break forest_join_50;
    }
    forestValue993_47_0 = receiver;
    forestValue993_47_1 = life6_27;
    forestValue993_47_2 = life7_30;
    }
    __call993_18(__call993_17(forestValue993_47_0, forestValue993_47_1, forestValue993_47_2), life5_24);
    }
    if (!((life3_11 != null))) {
        continue forest_cycle_16;
    }
    break forest_cycle_16;
    }
    }
    life4_69 = __call993_20(__fieldRead993_19(receiver));
    forest_cycle_56: while (true) {
    if (!(__call993_21(life4_69))) {
        break forest_join_87;
    }
    life5_79 = __cast993_23(__call993_22(life4_69));
    __call993_24(receiver, life5_79);
    if (!((life3_11 == null))) {
        break forest_join_90;
    }
    if (!((life3_11 != null))) {
        continue forest_cycle_56;
    }
    break forest_cycle_56;
    }
    break forest_join_87;
    }
    forest_cycle_71: while (true) {
    forest_join_84: {
    if (!((forestValue993_71_0 != 0))) {
        break forest_join_87;
    }
    life5_94 = __cast993_26(__call993_25(life4_15));
    __call993_27(receiver, life5_94);
    if (!((life3_11 == null))) {
        break forest_join_90;
    }
    if (!((life3_11 != null))) {
        break forest_join_84;
    }
    break forest_join_87;
    }
    spill993_5 = __call993_28(life4_15);
    forestValue993_71_0 = __integerCategory993_29(spill993_5);
    continue forest_cycle_71;
    }
    }
    __call993_31(__fieldRead993_30(receiver));
    }
    life4_114 = 0;
    forest_cycle_92: while (true) {
    forest_join_169: {
    forest_join_167: {
    forest_join_165: {
    forest_join_160: {
    forest_join_137: {
    forest_join_131: {
    forest_join_130: {
    forest_join_128: {
    forest_join_123: {
    if (!((life4_114 < __call993_33(__fieldRead993_32(receiver))))) {
        break forest_join_172;
    }
    life5_127 = __cast993_36(__call993_35(__fieldRead993_34(receiver), life4_114));
    spill993_6 = __fieldRead993_37(life5_127);
    if (!((life3_11 == null))) {
        forestValue993_131_0 = spill993_6;
        break forest_join_131;
    }
    if (!((spill993_6 != null))) {
        break forest_join_130;
    }
    spill993_7 = __fieldRead993_38(life5_127);
    if (!((life3_11 == null))) {
        forestValue993_128_0 = spill993_7;
        break forest_join_128;
    }
    if (!((!__fieldRead993_39(spill993_7)))) {
        break forest_join_123;
    }
    spill993_8 = __fieldRead993_41(__fieldRead993_40(life5_127));
    if (!((life3_11 == null))) {
        forestValue993_128_0 = spill993_8;
        break forest_join_128;
    }
    if (!((spill993_8 == life5_127))) {
        break forest_join_123;
    }
    if (!((life3_11 != null))) {
        break forest_join_169;
    }
    }
    __fieldWrite993_43(__fieldRead993_42(life5_127), null);
    forestValue993_128_0 = life5_127;
    }
    __fieldWrite993_44(forestValue993_128_0, null);
    }
    forestValue993_131_0 = life5_127;
    }
    spill993_9 = __fieldRead993_45(forestValue993_131_0);
    if (!((life3_11 == null))) {
        forestValue993_137_0 = __integerCategory993_46(spill993_9);
        break forest_join_137;
    }
    if (!(spill993_9)) {
        break forest_join_169;
    }
    forestValue993_137_0 = __fieldRead993_47(life5_127);
    }
    life6_182 = forestValue993_137_0;
    life7_185 = __fieldRead993_48(life5_127);
    spill993_10 = life5_127;
    if (!((life3_11 == null))) {
        forestValue993_165_0 = spill993_10;
        break forest_join_165;
    }
    if (!(__fieldRead993_49(spill993_10))) {
        break forest_join_160;
    }
    spill993_11 = receiver;
    if (!((life3_11 == null))) {
        forestValue993_167_0 = spill993_11;
        break forest_join_167;
    }
    if (!(__call993_50(spill993_11, life6_182, life7_185, 1))) {
        break forest_join_160;
    }
    __call993_52(__call993_51(receiver, life6_182, life7_185), life5_127);
    }
    forestValue993_165_0 = __call993_54(__fieldRead993_53(receiver), (life4_114--));
    }
    __discardScalar993_55(forestValue993_165_0);
    forestValue993_167_0 = receiver;
    }
    __call993_56(forestValue993_167_0, life5_127);
    }
    life4_114 += 1;
    if (!((life3_11 != null))) {
        continue forest_cycle_92;
    }
    break forest_cycle_92;
    }
    }
    return;
}
public static void h993_0(moom.Oo p0) throws Throwable {
    throw __call3099300_0(p0);
}
public static void h993_1(moom.Oo p0) throws Throwable {
    throw __call3099301_0(p0);
}
public static void h993_2(moom.Oo p0) throws Throwable {
    throw __call3099302_0(p0);
}
public static void h993_3(moom.Oo p0) throws Throwable {
    throw __call3099303_0(p0);
}
public static void h993_4(moom.Oo p0) throws Throwable {
    throw __call3099304_0(p0);
}
public static void h993_5(moom.Oo p0) throws Throwable {
    throw __call3099305_0(p0);
}
public static void h993_6(moom.Oo p0) throws Throwable {
    throw __call3099306_0(p0);
}
public static void h993_7(moom.Oo p0) throws Throwable {
    throw __call3099307_0(p0);
}
public static void h993_8(moom.Oo p0) throws Throwable {
    throw __call3099308_0(p0);
}
public static void h993_9(moom.Oo p0) throws Throwable {
    throw __call3099309_0(p0);
}
public static void h993_10(moom.Oo p0) throws Throwable {
    throw __call3099310_0(p0);
}
public static void h993_11(moom.Oo p0) throws Throwable {
    throw __call3099311_0(p0);
}
public static void h993_12(moom.Oo p0) throws Throwable {
    throw __call3099312_0(p0);
}
public static void h993_13(moom.Oo p0) throws Throwable {
    throw __call3099313_0(p0);
}
public static void h993_14(moom.Oo p0) throws Throwable {
    throw __call3099314_0(p0);
}
public static void h993_15(moom.Oo p0) throws Throwable {
    throw __call3099315_0(p0);
}
public static void h993_16(moom.Oo p0) throws Throwable {
    throw __call3099316_0(p0);
}
public static void h993_17(moom.Oo p0) throws Throwable {
    throw __call3099317_0(p0);
}
public static void h993_18(moom.Oo p0) throws Throwable {
    throw __call3099318_0(p0);
}
private static native long __fieldRead993_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call993_1() throws Throwable;
private static native java.util.List __fieldRead993_2(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.util.List __fieldRead993_3(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native boolean __call993_4(java.util.List a0, java.util.List a1) throws Throwable;
private static native java.util.List __fieldRead993_5(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.util.Iterator __call993_6(java.util.List a0) throws Throwable;
private static native boolean __call993_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call993_8(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast993_9(java.lang.Object a0) throws Throwable;
private static native int __fieldRead993_10(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead993_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead993_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory993_13(boolean value) throws Throwable;
private static native int __integerCategory993_14(boolean value) throws Throwable;
private static native boolean __call993_15(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory993_16(boolean value) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call993_17(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2) throws Throwable;
private static native void __call993_18(net.minecraft.world.chunk.Chunk a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.util.List __fieldRead993_19(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.util.Iterator __call993_20(java.util.List a0) throws Throwable;
private static native boolean __call993_21(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call993_22(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast993_23(java.lang.Object a0) throws Throwable;
private static native void __call993_24(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.lang.Object __call993_25(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast993_26(java.lang.Object a0) throws Throwable;
private static native void __call993_27(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native boolean __call993_28(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory993_29(boolean value) throws Throwable;
private static native java.util.List __fieldRead993_30(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call993_31(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead993_32(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int __call993_33(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead993_34(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.lang.Object __call993_35(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __cast993_36(java.lang.Object a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead993_37(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead993_38(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead993_39(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead993_40(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead993_41(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead993_42(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite993_43(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite993_44(net.minecraft.entity.Entity a0, java.lang.Object a1) throws Throwable;
private static native boolean __fieldRead993_45(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory993_46(boolean value) throws Throwable;
private static native int __fieldRead993_47(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __fieldRead993_48(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead993_49(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call993_50(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call993_51(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2) throws Throwable;
private static native void __call993_52(net.minecraft.world.chunk.Chunk a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.util.List __fieldRead993_53(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.lang.Object __call993_54(java.util.List a0, int a1) throws Throwable;
private static native void __discardScalar993_55(java.lang.Object a0) throws Throwable;
private static native void __call993_56(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native java.lang.Exception __call3099300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099308_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099309_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099310_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099311_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099312_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099313_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099314_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099315_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099316_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099317_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3099318_0(moom.Oo a0) throws Throwable;

}


public void i() {
((net.minecraft.network.NetworkManager)(((net.minecraft.client.network.NetHandlerPlayClient)(this.S)).a__r())).a(((net.minecraft.util.IChatComponent)(new moom.CM("Quitting"))));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10433_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ev"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected int b() {
return ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.W)).W)).n;
}


public boolean b(moom.DT p0, net.minecraft.block.state.IBlockState p1) {
int local3 = ((moom.DT)(p0)).a();
    int local4 = ((moom.DT)(p0)).b();
    int local5 = ((moom.DT)(p0)).c();
    ((net.minecraft.client.multiplayer.WorldClient)(this)).b(((int)(local3)), ((int)(local4)), ((int)(local5)), ((int)(local3)), ((int)(local4)), ((int)(local5)));
    return (__sourceIntrinsic_booleanComparison((super.a(((moom.DT)(p0)), ((net.minecraft.block.state.IBlockState)(p1)), ((int)(3))))) != 0);
}


public net.minecraft.entity.Entity b__sourceReturn_b6fcdeb6b7(int p0) { return __sourceHandlerCall_b1ce57309da55dffd5f4(this, p0); }


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.multiplayer.WorldClient.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19855;
      if (db[var3] == null) {
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
         long var5 = cb[var3];
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
         Object[] var9 = (Object[])hb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               hb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Ev", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


public static void b(net.minecraft.entity.Entity[] p0) {
Z = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public void b(long p0) { __sourceHandlerCall_6fbe7069fd69a9e2db5a(this, p0); }


protected void b(net.minecraft.entity.Entity p0) { __sourceHandlerCall_97736ab817a2dc4f1f22(this, p0); }


public boolean b__Boolean(net.minecraft.entity.Entity p0) { return __sourceHandlerCall_40009ed38a0fd37825df(this, p0); }


public void b(int p0, int p1, int p2, int p3, int p4, int p5) {
return;
}


private boolean c__sourceReturn_aae029aa0a() { return __sourceHandlerCall_b778d3541c648efab05e(this); }


public void c(net.minecraft.entity.Entity p0) {
super.c(((net.minecraft.entity.Entity)(p0)));
    ((java.util.Set)(this.U)).remove(((java.lang.Object)(p0)));
    return;
}


protected void h() { __sourceHandlerCall_4878518999247b9861e7(this); }


protected void f__Void() {
return;
}


public void l() { __sourceHandlerCall_30e71f3c0d003b52d99e(this); }


public void d__Void() { __sourceHandlerCall_f3ebc73257ee9def9811(this); }


public boolean a(moom.DT p0, net.minecraft.block.state.IBlockState p1, int p2) {
this.Y = ((boolean)(((net.minecraft.client.multiplayer.WorldClient)(this)).c__sourceReturn_aae029aa0a()));
    int local4 = __sourceIntrinsic_booleanToInteger(super.a(((moom.DT)(p0)), ((net.minecraft.block.state.IBlockState)(p1)), ((int)(p2))));
    this.Y = ((boolean)(false));
    return ((local4) != 0);
}


public int a(moom.DT p0, int p1) { return __sourceHandlerCall_bf07ab0325f53b1f6c91(this, p0, p1); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(moom.DT p0, java.lang.String p1, float p2, float p3, boolean p4) {
((net.minecraft.client.multiplayer.WorldClient)(this)).a(((double)((((double) ((moom.DT)(p0)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p0)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p0)).c()) + 0x1.0p-1d))), ((java.lang.String)(p1)), ((float)(p2)), ((float)(p3)), ((boolean)(p4)));
    return;
}


protected moom.Fn a__Fn() {
this.T = ((moom.jH)(new moom.jH(this)));
    return this.T;
}


public static net.minecraft.entity.Entity[] a__Arrayr3() {
return net.minecraft.client.multiplayer.WorldClient.Z;
}


public void a__sourceReturn_23922dd444(int p0, int p1, int p2) { __sourceHandlerCall_0241786e35a662946b03(this, p0, p1, p2); }


public moom.qZ a(moom.qY p0) {
moom.qZ local2 = super.a(((moom.qY)(p0)));
    ((moom.qZ)(local2)).a(((java.lang.String)("Forced entities")), ((java.util.concurrent.Callable)(__sourceIntrinsic_2b1f246bb48c_originalDynamicSite1808_1(this))));
    ((moom.qZ)(local2)).a(((java.lang.String)("Retry entities")), ((java.util.concurrent.Callable)(__sourceIntrinsic_2b1f246bb48c_originalDynamicSite1808_3(this))));
    ((moom.qZ)(local2)).a(((java.lang.String)("Server brand")), ((java.util.concurrent.Callable)(__sourceIntrinsic_2b1f246bb48c_originalDynamicSite1808_5(this))));
    ((moom.qZ)(local2)).a(((java.lang.String)("Server type")), ((java.util.concurrent.Callable)(__sourceIntrinsic_2b1f246bb48c_originalDynamicSite1808_7(this))));
    return local2;
}


public void a(double p0, double p1, double p2, java.lang.String p3, float p4, float p5, boolean p6) { __sourceHandlerCall_6d633acad65a5127dadd(this, p0, p1, p2, p3, p4, p5, p6); }


public void a(double p0, double p1, double p2, double p3, double p4, double p5, net.minecraft.nbt.NBTTagCompound p6) {
((net.minecraft.client.particle.EffectRenderer)(((net.minecraft.client.Minecraft)(this.W)).M)).a(((net.minecraft.client.particle.EntityFX)(new net.minecraft.client.particle.EntityFirework$StarterFX(this, p0, p1, p2, p3, p4, p5, ((net.minecraft.client.Minecraft)(this.W)).M, p6))));
    return;
}


protected void a(net.minecraft.entity.Entity p0) {
super.a(((net.minecraft.entity.Entity)(p0)));
    ((java.util.Set)(this.V)).remove(((java.lang.Object)(p0)));
    return;
}


public void a(int p0, net.minecraft.entity.Entity p1) { __sourceHandlerCall_f5645f0e7b7130aa8a75(this, p0, p1); }


public net.minecraft.entity.Entity a(int p0) { return __sourceHandlerCall_56e2e5ff086e3acd8a89(this, p0); }


public void a__sourceReturn_6f2808fbee(int p0, int p1, boolean p2) { __sourceHandlerCall_001aee16ecf9989c6bb4(this, p0, p1, p2); }


public void a(net.minecraft.scoreboard.Scoreboard p0) {
this.F = ((net.minecraft.scoreboard.Scoreboard)(p0));
    return;
}


public boolean j__sourceReturn_aae029aa0a() {
return ((((this.Y) ? 1 : 0)) != 0);
}


private java.lang.String lambda$addWorldInfoToCrashReport$2() throws java.lang.Exception {
return ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.W)).K)).j__sourceReturn_0e30dfc966();
}


private java.lang.String lambda$addWorldInfoToCrashReport$1() throws java.lang.Exception {
return __sourceIntrinsic_8e43d9111291_originalDynamicSite1809_3(((java.util.Set)(this.V)).size(), this.V);
}


private java.lang.String lambda$addWorldInfoToCrashReport$3() throws java.lang.Exception {
long local1 = (net.minecraft.client.multiplayer.WorldClient.ab ^ 10778151142692L);
    return ((((net.minecraft.client.Minecraft)(this.W)).a__Bm() == null) ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
}


private java.lang.String lambda$addWorldInfoToCrashReport$0() throws java.lang.Exception {
return __sourceIntrinsic_194babd50d9c_originalDynamicSite1810_3(((java.util.Set)(this.U)).size(), this.U);
}


private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_2b1f246bb48c_originalDynamicSite1808_1(net.minecraft.client.multiplayer.WorldClient a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_2b1f246bb48c_originalDynamicSite1808_3(net.minecraft.client.multiplayer.WorldClient a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_2b1f246bb48c_originalDynamicSite1808_5(net.minecraft.client.multiplayer.WorldClient a0) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_2b1f246bb48c_originalDynamicSite1808_7(net.minecraft.client.multiplayer.WorldClient a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10433_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_194babd50d9c_originalDynamicSite1810_3(int a0, java.util.Set a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8e43d9111291_originalDynamicSite1809_3(int a0, java.util.Set a1) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
