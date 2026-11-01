package net.minecraft.client.network;


public class NetHandlerLoginClient implements moom.yU {

private static org.apache.logging.log4j.Logger a;

private net.minecraft.client.Minecraft b;

private net.minecraft.client.gui.GuiScreen c;

private net.minecraft.network.NetworkManager d;

private com.mojang.authlib.GameProfile e;

private static long f;

private static long g;

public NetHandlerLoginClient(net.minecraft.network.NetworkManager p0, net.minecraft.client.Minecraft p1, net.minecraft.client.gui.GuiScreen p2) {
super();
    this.d = p0;
    this.b = p1;
    this.c = p2;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(3181740894297455988L)), ((long)(8484645821708636436L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(259175479914475L)))));
    long local0_life6 = (net.minecraft.client.network.NetHandlerLoginClient.f ^ 129190508996009L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1168_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1168_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1168_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1168_13 = new byte[8];
    (__sourceSpill1168_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1168_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1168_15 = __sourceSpill1168_13;
    ((javax.crypto.Cipher)(__sourceSpill1168_10)).init(((int)(__sourceSpill1168_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1168_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1168_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4466654111105391620L;
    byte[] __sourceSpill1168_19 = new byte[8];
    (__sourceSpill1168_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1168_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1168_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1168_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1168_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1168_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1168_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1168_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1168_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1168_20)).doFinal(((byte[])(__sourceSpill1168_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_e6e1b335905964a436b3(net.minecraft.client.network.NetHandlerLoginClient a0, moom.y1 a1) throws E;
private static final class __SourceHandler_e6e1b335905964a436b3 {

public static void f1347(net.minecraft.client.network.NetHandlerLoginClient receiver, moom.y1 p0) throws Throwable {
    net.minecraft.network.NetworkManager forwardValue1347_14_0;
    net.minecraft.network.NetworkManager spill1347_0;
    long life2_3;
    int life4_5;
    forward_join_17: {
    forward_join_14: {
    life2_3 = (__fieldRead1347_0() ^ 38512416695388L);
    life4_5 = __integerCategory1347_2(__call1347_1());
    spill1347_0 = __fieldRead1347_3(receiver);
    if (!((life4_5 == 0))) {
        forwardValue1347_14_0 = spill1347_0;
        break forward_join_14;
    }
    if (!((!__call1347_4(spill1347_0)))) {
        break forward_join_17;
    }
    forwardValue1347_14_0 = __fieldRead1347_5(receiver);
    }
    __call1347_7(forwardValue1347_14_0, __call1347_6(p0));
    }
    return;
}
public static void h1347_0(moom.Oo p0) throws Throwable {
    throw __call1134700_0(p0);
}
public static void h1347_1(moom.Oo p0) throws Throwable {
    throw __call1134701_0(p0);
}
private static native long __fieldRead1347_0() throws Throwable;
private static native boolean __call1347_1() throws Throwable;
private static native int __integerCategory1347_2(boolean value) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1347_3(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native boolean __call1347_4(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead1347_5(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native int __call1347_6(moom.y1 a0) throws Throwable;
private static native void __call1347_7(net.minecraft.network.NetworkManager a0, int a1) throws Throwable;
private static native java.lang.Exception __call1134700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1134701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4817fb0486a24d9440fc(net.minecraft.client.network.NetHandlerLoginClient a0, moom.yZ a1) throws E;
private static final class __SourceHandler_4817fb0486a24d9440fc {

public static void f160(net.minecraft.client.network.NetHandlerLoginClient receiver, moom.yZ p0) throws Throwable {
    net.minecraft.client.network.NetHandlerLoginClient forwardValue160_52_0;
    boolean spill160_0;
    net.minecraft.client.network.NetHandlerLoginClient spill160_1;
    net.minecraft.client.network.NetHandlerLoginClient spill160_2;
    long life2_3;
    javax.crypto.SecretKey life5_6;
    int life4_7;
    java.lang.String life6_10;
    java.security.PublicKey life7_13;
    java.lang.String life8_24;
    forward_join_63: {
    forward_join_52: {
    forward_join_51: {
    life2_3 = (__fieldRead160_0() ^ 125255478481292L);
    spill160_0 = __call160_1();
    life5_6 = __call160_2();
    life4_7 = __integerCategory160_3(spill160_0);
    life6_10 = __call160_4(p0);
    life7_13 = __call160_5(p0);
    life8_24 = __call160_8(new java.math.BigInteger(__call160_6(life6_10, life7_13, life5_6)), ((int) __fieldRead160_7()));
    spill160_1 = receiver;
    if (!((life4_7 == 0))) {
        forwardValue160_52_0 = spill160_1;
        break forward_join_52;
    }
    if (!((__call160_10(__fieldRead160_9(spill160_1)) != null))) {
        break forward_join_51;
    }
    spill160_2 = receiver;
    if (!((life4_7 == 0))) {
        forwardValue160_52_0 = spill160_2;
        break forward_join_52;
    }
    if (!(__call160_13(__call160_12(__fieldRead160_11(spill160_2))))) {
        break forward_join_51;
    }
    __call160_21(__call160_14(receiver), __call160_17(__call160_16(__fieldRead160_15(receiver))), __call160_20(__call160_19(__fieldRead160_18(receiver))), life8_24);
    break forward_join_63;
    }
    forwardValue160_52_0 = receiver;
    }
    __call160_29(__call160_22(forwardValue160_52_0), __call160_25(__call160_24(__fieldRead160_23(receiver))), __call160_28(__call160_27(__fieldRead160_26(receiver))), life8_24);
    }
    __call160_33(__fieldRead160_30(receiver), new moom.yX(life5_6, life7_13, __call160_31(p0)), __invokedynamic160_32(receiver, life5_6), new io.netty.util.concurrent.GenericFutureListener[0]);
    return;
}
public static void h160_0(com.mojang.authlib.exceptions.AuthenticationException p0) throws Throwable {
    throw __call3016000_0(p0);
}
public static void h160_1(com.mojang.authlib.exceptions.AuthenticationException p0) throws Throwable {
    throw __call3016001_0(p0);
}
public static void h160_2(com.mojang.authlib.exceptions.AuthenticationException p0) throws Throwable {
    throw __call3016002_0(p0);
}
public static void h160_3(moom.Oo p0) throws Throwable {
    throw __call3016003_0(p0);
}
public static void h160_4(com.mojang.authlib.exceptions.AuthenticationException p0, net.minecraft.client.network.NetHandlerLoginClient p1, moom.yZ p2, int p3, javax.crypto.SecretKey p4, java.security.PublicKey p5, java.lang.String p6) throws Throwable {
    com.mojang.authlib.exceptions.AuthenticationException life7_2;
    life7_2 = p0;
    __call3016004_1(__fieldRead3016004_0(), "Couldn't connect to auth servers but will continue to join LAN");
    if ((p3 != 0)) {
        __call3016004_9(__call3016004_2(p1), __call3016004_5(__call3016004_4(__fieldRead3016004_3(p1))), __call3016004_8(__call3016004_7(__fieldRead3016004_6(p1))), p6);
    } else {
        
    }
    __call3016004_13(__fieldRead3016004_10(p1), new moom.yX(p4, p5, __call3016004_11(p2)), __invokedynamic3016004_12(p1, p4), new io.netty.util.concurrent.GenericFutureListener[0]);
    return;
}
public static void h160_5(com.mojang.authlib.exceptions.AuthenticationUnavailableException p0, net.minecraft.client.network.NetHandlerLoginClient p1) throws Throwable {
    com.mojang.authlib.exceptions.AuthenticationUnavailableException life2_2;
    life2_2 = p0;
    __call3016005_1(__fieldRead3016005_0(p1), new moom.CN("disconnect.loginFailedInfo", new java.lang.Object[] {new moom.CN("disconnect.loginFailedInfo.serversUnavailable", new java.lang.Object[0])}));
    return;
}
public static void h160_6(com.mojang.authlib.exceptions.InvalidCredentialsException p0, net.minecraft.client.network.NetHandlerLoginClient p1) throws Throwable {
    com.mojang.authlib.exceptions.InvalidCredentialsException life2_2;
    life2_2 = p0;
    __call3016006_1(__fieldRead3016006_0(p1), new moom.CN("disconnect.loginFailedInfo", new java.lang.Object[] {new moom.CN("disconnect.loginFailedInfo.invalidSession", new java.lang.Object[0])}));
    return;
}
public static void h160_7(com.mojang.authlib.exceptions.AuthenticationException p0, net.minecraft.client.network.NetHandlerLoginClient p1) throws Throwable {
    com.mojang.authlib.exceptions.AuthenticationException life2_2;
    life2_2 = p0;
    __call3016007_2(__fieldRead3016007_0(p1), new moom.CN("disconnect.loginFailedInfo", new java.lang.Object[] {__call3016007_1(life2_2)}));
    return;
}
private static native long __fieldRead160_0() throws Throwable;
private static native boolean __call160_1() throws Throwable;
private static native javax.crypto.SecretKey __call160_2() throws Throwable;
private static native int __integerCategory160_3(boolean value) throws Throwable;
private static native java.lang.String __call160_4(moom.yZ a0) throws Throwable;
private static native java.security.PublicKey __call160_5(moom.yZ a0) throws Throwable;
private static native byte[] __call160_6(java.lang.String a0, java.security.PublicKey a1, javax.crypto.SecretKey a2) throws Throwable;
private static native long __fieldRead160_7() throws Throwable;
private static native java.lang.String __call160_8(java.math.BigInteger a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead160_9(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native moom.jL __call160_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead160_11(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native moom.jL __call160_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call160_13(moom.jL a0) throws Throwable;
private static native com.mojang.authlib.minecraft.MinecraftSessionService __call160_14(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead160_15(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native net.minecraft.util.Session __call160_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call160_17(net.minecraft.util.Session a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead160_18(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native net.minecraft.util.Session __call160_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call160_20(net.minecraft.util.Session a0) throws Throwable;
private static native void __call160_21(com.mojang.authlib.minecraft.MinecraftSessionService a0, com.mojang.authlib.GameProfile a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native com.mojang.authlib.minecraft.MinecraftSessionService __call160_22(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead160_23(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native net.minecraft.util.Session __call160_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call160_25(net.minecraft.util.Session a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead160_26(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native net.minecraft.util.Session __call160_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call160_28(net.minecraft.util.Session a0) throws Throwable;
private static native void __call160_29(com.mojang.authlib.minecraft.MinecraftSessionService a0, com.mojang.authlib.GameProfile a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead160_30(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native byte[] __call160_31(moom.yZ a0) throws Throwable;
private static native io.netty.util.concurrent.GenericFutureListener __invokedynamic160_32(net.minecraft.client.network.NetHandlerLoginClient a0, javax.crypto.SecretKey a1) throws Throwable;
private static native void __call160_33(net.minecraft.network.NetworkManager a0, moom.yX a1, io.netty.util.concurrent.GenericFutureListener a2, io.netty.util.concurrent.GenericFutureListener[] a3) throws Throwable;
private static native java.lang.Exception __call3016000_0(com.mojang.authlib.exceptions.AuthenticationException a0) throws Throwable;
private static native java.lang.Exception __call3016001_0(com.mojang.authlib.exceptions.AuthenticationException a0) throws Throwable;
private static native java.lang.Exception __call3016002_0(com.mojang.authlib.exceptions.AuthenticationException a0) throws Throwable;
private static native java.lang.Exception __call3016003_0(moom.Oo a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3016004_0() throws Throwable;
private static native void __call3016004_1(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native com.mojang.authlib.minecraft.MinecraftSessionService __call3016004_2(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3016004_3(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native net.minecraft.util.Session __call3016004_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call3016004_5(net.minecraft.util.Session a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3016004_6(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native net.minecraft.util.Session __call3016004_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call3016004_8(net.minecraft.util.Session a0) throws Throwable;
private static native void __call3016004_9(com.mojang.authlib.minecraft.MinecraftSessionService a0, com.mojang.authlib.GameProfile a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead3016004_10(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native byte[] __call3016004_11(moom.yZ a0) throws Throwable;
private static native io.netty.util.concurrent.GenericFutureListener __invokedynamic3016004_12(net.minecraft.client.network.NetHandlerLoginClient a0, javax.crypto.SecretKey a1) throws Throwable;
private static native void __call3016004_13(net.minecraft.network.NetworkManager a0, moom.yX a1, io.netty.util.concurrent.GenericFutureListener a2, io.netty.util.concurrent.GenericFutureListener[] a3) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead3016005_0(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native void __call3016005_1(net.minecraft.network.NetworkManager a0, moom.CN a1) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead3016006_0(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native void __call3016006_1(net.minecraft.network.NetworkManager a0, moom.CN a1) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead3016007_0(net.minecraft.client.network.NetHandlerLoginClient a0) throws Throwable;
private static native java.lang.String __call3016007_1(com.mojang.authlib.exceptions.AuthenticationException a0) throws Throwable;
private static native void __call3016007_2(net.minecraft.network.NetworkManager a0, moom.CN a1) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(moom.y1 p0) { __sourceHandlerCall_e6e1b335905964a436b3(this, p0); }


public void a(moom.yY p0) {
((net.minecraft.network.NetworkManager)(this.d)).a(((net.minecraft.util.IChatComponent)(((moom.yY)(p0)).a())));
    return;
}


private com.mojang.authlib.minecraft.MinecraftSessionService a() {
return ((net.minecraft.client.Minecraft)(this.b)).a__MinecraftSessionService();
}


public void a(moom.yZ p0) { __sourceHandlerCall_4817fb0486a24d9440fc(this, p0); }


public void a(moom.y0 p0) {
this.e = ((com.mojang.authlib.GameProfile)(((moom.y0)(p0)).a()));
    ((net.minecraft.network.NetworkManager)(this.d)).a(((net.minecraft.network.EnumConnectionState)(net.minecraft.network.EnumConnectionState.PLAY)));
    ((net.minecraft.network.NetworkManager)(this.d)).a(((moom.yE)(new net.minecraft.client.network.NetHandlerPlayClient(this.b, this.c, this.d, this.e))));
    return;
}


public void a(net.minecraft.util.IChatComponent p0) {
((net.minecraft.client.Minecraft)(this.b)).a(((net.minecraft.client.gui.GuiScreen)(new moom.gO(this.c, "connect.failed", p0))));
    return;
}


private void lambda$handleEncryptionRequest$0(javax.crypto.SecretKey p0, io.netty.util.concurrent.Future p1) throws java.lang.Exception {
((net.minecraft.network.NetworkManager)(this.d)).a(((javax.crypto.SecretKey)(p0)));
    return;
}

}
