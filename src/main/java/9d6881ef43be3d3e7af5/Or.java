package moom;


class Or extends java.lang.Thread {

java.lang.String a;

int b;

moom.hw c;

private static long d;

private static long e;

Or(moom.hw p0, java.lang.String p1, java.lang.String p2, int p3) { super((java.lang.String)null); }

private static void __sourceConstructorBody_a90865ce6e9c8a87(moom.Or receiver, moom.hw p0, java.lang.String p1, java.lang.String p2, int p3) throws Throwable {
((moom.Or)(receiver)).c = ((moom.hw)(p0));
    ((moom.Or)(receiver)).a = ((java.lang.String)(p2));
    ((moom.Or)(receiver)).b = ((int)(p3));
    moom.Or.__sourceConstructorInit_a90865ce6e9c8a87_0(((moom.Or)(receiver)), ((java.lang.String)(p1)));
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(7164375414557195810L)), ((long)(-9063596075937984915L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(278147281430673L)))));
    long local0_life6 = (moom.Or.d ^ 122155171381874L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill750_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill750_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill750_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill750_13 = new byte[8];
    (__sourceSpill750_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill750_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation750_15 = __sourceSpill750_13;
    ((javax.crypto.Cipher)(__sourceSpill750_10)).init(((int)(__sourceSpill750_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill750_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation750_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -3313249192594871157L;
    byte[] __sourceSpill750_19 = new byte[8];
    (__sourceSpill750_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill750_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill750_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill750_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill750_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill750_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill750_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill750_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill750_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill750_20)).doFinal(((byte[])(__sourceSpill750_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_a90865ce6e9c8a87_0(moom.Or a0, java.lang.String a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_2804ea1a39df9141d8f3(moom.Or a0) throws E;
private static final class __SourceHandler_2804ea1a39df9141d8f3 {

public static void f383(moom.Or receiver) throws Throwable {
    moom.Or forestValue383_16_0;
    net.minecraft.entity.Entity[] spill383_0;
    moom.Or spill383_1;
    net.minecraft.network.NetworkManager spill383_2;
    net.minecraft.client.network.NetHandlerLoginClient spill383_3;
    net.minecraft.network.NetworkManager spill383_4;
    moom.yT spill383_5;
    net.minecraft.network.NetworkManager spill383_6;
    moom.yW spill383_7;
    long life1_3;
    java.lang.Object life4_6;
    net.minecraft.entity.Entity[] life3_7;
    java.net.InetAddress life4_18;
    forest_join_16: {
    forest_join_15: {
    life1_3 = (__fieldRead383_0() ^ 57199835582569L);
    spill383_0 = __call383_1();
    life4_6 = null;
    life3_7 = spill383_0;
    spill383_1 = receiver;
    if (!((life3_7 == null))) {
        forestValue383_16_0 = spill383_1;
        break forest_join_16;
    }
    if (!(__fieldRead383_3(__fieldRead383_2(spill383_1)))) {
        break forest_join_15;
    }
    return;
    }
    forestValue383_16_0 = receiver;
    }
    life4_18 = __call383_5(__fieldRead383_4(forestValue383_16_0));
    __fieldWrite383_13(__fieldRead383_6(receiver), __call383_12(life4_18, __fieldRead383_7(receiver), __call383_11(__fieldRead383_10(__call383_9(__fieldRead383_8(receiver))))));
    spill383_2 = __fieldRead383_15(__fieldRead383_14(receiver));
    net.minecraft.client.network.NetHandlerLoginClient __stackOp383_17_0 = __sourceUninitializedNEW383_16();
    spill383_3 = __stackOp383_17_0;
    __explicitNewInit383_24(__stackOp383_17_0, __fieldRead383_19(__fieldRead383_18(receiver)), __call383_21(__fieldRead383_20(receiver)), __fieldRead383_23(__fieldRead383_22(receiver)));
    __call383_25(spill383_2, spill383_3);
    spill383_4 = __fieldRead383_27(__fieldRead383_26(receiver));
    moom.yT __stackOp383_29_0 = __sourceUninitializedNEW383_28();
    spill383_5 = __stackOp383_29_0;
    __explicitNewInit383_34(__stackOp383_29_0, ((int) __fieldRead383_30()), __fieldRead383_31(receiver), __fieldRead383_32(receiver), __fieldRead383_33());
    __call383_35(spill383_4, spill383_5);
    spill383_6 = __fieldRead383_37(__fieldRead383_36(receiver));
    moom.yW __stackOp383_39_0 = __sourceUninitializedNEW383_38();
    spill383_7 = __stackOp383_39_0;
    __explicitNewInit383_44(__stackOp383_39_0, __call383_43(__call383_42(__call383_41(__fieldRead383_40(receiver)))));
    __call383_45(spill383_6, spill383_7);
    return;
}
public static void h383_0(java.net.UnknownHostException p0, moom.Or p1, net.minecraft.entity.Entity[] p2) throws Throwable {
    moom.hw forestValue3038300_15_0;
    moom.hw spill3038300_0;
    net.minecraft.client.Minecraft spill3038300_1;
    moom.gO spill3038300_2;
    moom.gO spill3038300_3;
    net.minecraft.client.gui.GuiScreen spill3038300_4;
    java.lang.String spill3038300_5;
    moom.CN spill3038300_6;
    moom.CN spill3038300_7;
    java.lang.String spill3038300_8;
    java.lang.Object[] spill3038300_9;
    java.net.UnknownHostException life3_2;
    forest_join_15: {
    forest_join_9: {
    life3_2 = p0;
    spill3038300_0 = __fieldRead3038300_0(p1);
    if (!((p2 == null))) {
        forestValue3038300_15_0 = spill3038300_0;
        break forest_join_15;
    }
    if (!(__fieldRead3038300_1(spill3038300_0))) {
        break forest_join_9;
    }
    return;
    }
    __call3038300_3(__fieldRead3038300_2(), "Couldn't connect to server", life3_2);
    forestValue3038300_15_0 = __fieldRead3038300_4(p1);
    }
    spill3038300_1 = __call3038300_5(forestValue3038300_15_0);
    moom.gO __stackOp3038300_7_0 = __sourceUninitializedNEW3038300_6();
    spill3038300_2 = __stackOp3038300_7_0;
    spill3038300_3 = __stackOp3038300_7_0;
    spill3038300_4 = __fieldRead3038300_9(__fieldRead3038300_8(p1));
    spill3038300_5 = "connect.failed";
    moom.CN __stackOp3038300_11_0 = __sourceUninitializedNEW3038300_10();
    spill3038300_6 = __stackOp3038300_11_0;
    spill3038300_7 = __stackOp3038300_11_0;
    spill3038300_8 = "disconnect.genericReason";
    java.lang.Object[] __stackOp3038300_12_0 = new java.lang.Object[1];
    spill3038300_9 = __stackOp3038300_12_0;
    (__stackOp3038300_12_0)[0] = "Unknown host";
    __explicitNewInit3038300_13(spill3038300_7, spill3038300_8, spill3038300_9);
    __explicitNewInit3038300_14(spill3038300_3, spill3038300_4, spill3038300_5, spill3038300_6);
    __call3038300_15(spill3038300_1, spill3038300_2);
    return;
}
public static void h383_1(java.net.UnknownHostException p0) throws Throwable {
    throw __call3038301_0(p0);
}
public static void h383_2(java.net.UnknownHostException p0) throws Throwable {
    throw __call3038302_0(p0);
}
public static void h383_3(java.lang.Exception p0, moom.Or p1, net.minecraft.entity.Entity[] p2, java.net.InetAddress p3) throws Throwable {
    java.net.InetAddress forestValue3038303_21_0;
    java.net.InetAddress spill3038303_0;
    net.minecraft.client.Minecraft spill3038303_1;
    moom.gO spill3038303_2;
    moom.gO spill3038303_3;
    net.minecraft.client.gui.GuiScreen spill3038303_4;
    java.lang.String spill3038303_5;
    moom.CN spill3038303_6;
    moom.CN spill3038303_7;
    java.lang.String spill3038303_8;
    java.lang.Object[] spill3038303_9;
    java.lang.Exception life4_2;
    java.lang.String life5_17;
    java.lang.String life6_27;
    forest_join_30: {
    forest_join_21: {
    forest_join_13: {
    forest_join_9: {
    life4_2 = p0;
    if (!((p2 == null))) {
        break forest_join_13;
    }
    if (!(__fieldRead3038303_1(__fieldRead3038303_0(p1)))) {
        break forest_join_9;
    }
    return;
    }
    __call3038303_3(__fieldRead3038303_2(), "Couldn't connect to server", life4_2);
    }
    life5_17 = __call3038303_4(life4_2);
    spill3038303_0 = p3;
    if (!((p2 == null))) {
        forestValue3038303_21_0 = spill3038303_0;
        break forest_join_21;
    }
    if (!((spill3038303_0 != null))) {
        break forest_join_30;
    }
    forestValue3038303_21_0 = p3;
    }
    life6_27 = __invokedynamic3038303_6(forestValue3038303_21_0, __fieldRead3038303_5(p1));
    life5_17 = __call3038303_7(life5_17, life6_27, "");
    }
    spill3038303_1 = __call3038303_9(__fieldRead3038303_8(p1));
    moom.gO __stackOp3038303_11_0 = __sourceUninitializedNEW3038303_10();
    spill3038303_2 = __stackOp3038303_11_0;
    spill3038303_3 = __stackOp3038303_11_0;
    spill3038303_4 = __fieldRead3038303_13(__fieldRead3038303_12(p1));
    spill3038303_5 = "connect.failed";
    moom.CN __stackOp3038303_15_0 = __sourceUninitializedNEW3038303_14();
    spill3038303_6 = __stackOp3038303_15_0;
    spill3038303_7 = __stackOp3038303_15_0;
    spill3038303_8 = "disconnect.genericReason";
    java.lang.Object[] __stackOp3038303_16_0 = new java.lang.Object[1];
    spill3038303_9 = __stackOp3038303_16_0;
    (__stackOp3038303_16_0)[0] = life5_17;
    __explicitNewInit3038303_17(spill3038303_7, spill3038303_8, spill3038303_9);
    __explicitNewInit3038303_18(spill3038303_3, spill3038303_4, spill3038303_5, spill3038303_6);
    __call3038303_19(spill3038303_1, spill3038303_2);
    return;
}
public static void h383_4(java.net.UnknownHostException p0) throws Throwable {
    throw __call3038304_0(p0);
}
public static void h383_5(java.net.UnknownHostException p0) throws Throwable {
    throw __call3038305_0(p0);
}
public static void h383_6(java.net.UnknownHostException p0) throws Throwable {
    throw __call3038306_0(p0);
}
private static native long __fieldRead383_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call383_1() throws Throwable;
private static native moom.hw __fieldRead383_2(moom.Or a0) throws Throwable;
private static native boolean __fieldRead383_3(moom.hw a0) throws Throwable;
private static native java.lang.String __fieldRead383_4(moom.Or a0) throws Throwable;
private static native java.net.InetAddress __call383_5(java.lang.String a0) throws Throwable;
private static native moom.hw __fieldRead383_6(moom.Or a0) throws Throwable;
private static native int __fieldRead383_7(moom.Or a0) throws Throwable;
private static native moom.hw __fieldRead383_8(moom.Or a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call383_9(moom.hw a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead383_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call383_11(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __call383_12(java.net.InetAddress a0, int a1, boolean a2) throws Throwable;
private static native void __fieldWrite383_13(moom.hw a0, net.minecraft.network.NetworkManager a1) throws Throwable;
private static native moom.hw __fieldRead383_14(moom.Or a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead383_15(moom.hw a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerLoginClient __sourceUninitializedNEW383_16() throws Throwable;
private static native moom.hw __fieldRead383_18(moom.Or a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead383_19(moom.hw a0) throws Throwable;
private static native moom.hw __fieldRead383_20(moom.Or a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call383_21(moom.hw a0) throws Throwable;
private static native moom.hw __fieldRead383_22(moom.Or a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead383_23(moom.hw a0) throws Throwable;
private static native void __explicitNewInit383_24(net.minecraft.client.network.NetHandlerLoginClient a0, net.minecraft.network.NetworkManager a1, net.minecraft.client.Minecraft a2, net.minecraft.client.gui.GuiScreen a3) throws Throwable;
private static native void __call383_25(net.minecraft.network.NetworkManager a0, net.minecraft.client.network.NetHandlerLoginClient a1) throws Throwable;
private static native moom.hw __fieldRead383_26(moom.Or a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead383_27(moom.hw a0) throws Throwable;
private static native moom.yT __sourceUninitializedNEW383_28() throws Throwable;
private static native long __fieldRead383_30() throws Throwable;
private static native java.lang.String __fieldRead383_31(moom.Or a0) throws Throwable;
private static native int __fieldRead383_32(moom.Or a0) throws Throwable;
private static native net.minecraft.network.EnumConnectionState __fieldRead383_33() throws Throwable;
private static native void __explicitNewInit383_34(moom.yT a0, int a1, java.lang.String a2, int a3, net.minecraft.network.EnumConnectionState a4) throws Throwable;
private static native void __call383_35(net.minecraft.network.NetworkManager a0, moom.yT a1) throws Throwable;
private static native moom.hw __fieldRead383_36(moom.Or a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead383_37(moom.hw a0) throws Throwable;
private static native moom.yW __sourceUninitializedNEW383_38() throws Throwable;
private static native moom.hw __fieldRead383_40(moom.Or a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call383_41(moom.hw a0) throws Throwable;
private static native net.minecraft.util.Session __call383_42(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call383_43(net.minecraft.util.Session a0) throws Throwable;
private static native void __explicitNewInit383_44(moom.yW a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native void __call383_45(net.minecraft.network.NetworkManager a0, moom.yW a1) throws Throwable;
private static native moom.hw __fieldRead3038300_0(moom.Or a0) throws Throwable;
private static native boolean __fieldRead3038300_1(moom.hw a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3038300_2() throws Throwable;
private static native void __call3038300_3(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.net.UnknownHostException a2) throws Throwable;
private static native moom.hw __fieldRead3038300_4(moom.Or a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call3038300_5(moom.hw a0) throws Throwable;
private static native moom.gO __sourceUninitializedNEW3038300_6() throws Throwable;
private static native moom.hw __fieldRead3038300_8(moom.Or a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead3038300_9(moom.hw a0) throws Throwable;
private static native moom.CN __sourceUninitializedNEW3038300_10() throws Throwable;
private static native void __explicitNewInit3038300_13(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __explicitNewInit3038300_14(moom.gO a0, net.minecraft.client.gui.GuiScreen a1, java.lang.String a2, net.minecraft.util.IChatComponent a3) throws Throwable;
private static native void __call3038300_15(net.minecraft.client.Minecraft a0, moom.gO a1) throws Throwable;
private static native java.net.UnknownHostException __call3038301_0(java.net.UnknownHostException a0) throws Throwable;
private static native java.net.UnknownHostException __call3038302_0(java.net.UnknownHostException a0) throws Throwable;
private static native moom.hw __fieldRead3038303_0(moom.Or a0) throws Throwable;
private static native boolean __fieldRead3038303_1(moom.hw a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3038303_2() throws Throwable;
private static native void __call3038303_3(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native java.lang.String __call3038303_4(java.lang.Exception a0) throws Throwable;
private static native int __fieldRead3038303_5(moom.Or a0) throws Throwable;
private static native java.lang.String __invokedynamic3038303_6(java.net.InetAddress a0, int a1) throws Throwable;
private static native java.lang.String __call3038303_7(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native moom.hw __fieldRead3038303_8(moom.Or a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call3038303_9(moom.hw a0) throws Throwable;
private static native moom.gO __sourceUninitializedNEW3038303_10() throws Throwable;
private static native moom.hw __fieldRead3038303_12(moom.Or a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead3038303_13(moom.hw a0) throws Throwable;
private static native moom.CN __sourceUninitializedNEW3038303_14() throws Throwable;
private static native void __explicitNewInit3038303_17(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __explicitNewInit3038303_18(moom.gO a0, net.minecraft.client.gui.GuiScreen a1, java.lang.String a2, net.minecraft.util.IChatComponent a3) throws Throwable;
private static native void __call3038303_19(net.minecraft.client.Minecraft a0, moom.gO a1) throws Throwable;
private static native java.net.UnknownHostException __call3038304_0(java.net.UnknownHostException a0) throws Throwable;
private static native java.net.UnknownHostException __call3038305_0(java.net.UnknownHostException a0) throws Throwable;
private static native java.net.UnknownHostException __call3038306_0(java.net.UnknownHostException a0) throws Throwable;

}


public void run() { __sourceHandlerCall_2804ea1a39df9141d8f3(this); }


private static java.net.UnknownHostException a(java.net.UnknownHostException p0) {
return p0;
}

}
