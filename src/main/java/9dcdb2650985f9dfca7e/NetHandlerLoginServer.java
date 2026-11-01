package net.minecraft.server.network;


public class NetHandlerLoginServer implements moom.yV, net.minecraft.util.ITickable {

private static java.util.concurrent.atomic.AtomicInteger a;

private static org.apache.logging.log4j.Logger b;

private static java.util.Random c;

private byte[] d;

private moom.Bl e;

public net.minecraft.network.NetworkManager f;

private net.minecraft.server.network.NetHandlerLoginServer$LoginState g;

private int h;

private com.mojang.authlib.GameProfile i;

private java.lang.String j;

private javax.crypto.SecretKey k;

private net.minecraft.entity.player.EntityPlayerMP l;

private static int[] m;

private static long n;

private static long o;

public NetHandlerLoginServer(moom.Bl p0, net.minecraft.network.NetworkManager p1) { super(); }

private static void __sourceConstructorBody_762703cbcf8f4c81(net.minecraft.server.network.NetHandlerLoginServer receiver, moom.Bl p0, net.minecraft.network.NetworkManager p1) throws Throwable {
long local3_life1 = (net.minecraft.server.network.NetHandlerLoginServer.n ^ 125621818496212L);
    net.minecraft.server.network.NetHandlerLoginServer.__sourceConstructorInit_762703cbcf8f4c81_0(((net.minecraft.server.network.NetHandlerLoginServer)(receiver)));
    ((net.minecraft.server.network.NetHandlerLoginServer)(receiver)).d = ((byte[])(new byte[4]));
    ((net.minecraft.server.network.NetHandlerLoginServer)(receiver)).g = ((net.minecraft.server.network.NetHandlerLoginServer$LoginState)(net.minecraft.server.network.NetHandlerLoginServer$LoginState.HELLO));
    ((net.minecraft.server.network.NetHandlerLoginServer)(receiver)).j = ((java.lang.String)(""));
    int[] __sourceSpill967_9 = net.minecraft.server.network.NetHandlerLoginServer.b();
    ((net.minecraft.server.network.NetHandlerLoginServer)(receiver)).e = ((moom.Bl)(p0));
    int[] local5_life10 = __sourceSpill967_9;
    ((net.minecraft.server.network.NetHandlerLoginServer)(receiver)).f = ((net.minecraft.network.NetworkManager)(p1));
    ((java.util.Random)(net.minecraft.server.network.NetHandlerLoginServer.c)).nextBytes(((byte[])(((net.minecraft.server.network.NetHandlerLoginServer)(receiver)).d)));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        net.minecraft.server.network.NetHandlerLoginServer.b(((int[])(new int[4])));
    }
    return;
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-1200597404629798700L)), ((long)(9133342637367861352L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(83912977256002L)))));
    int[] __sourceSpill1206_6 = new int[5];
    long local0_life7 = (net.minecraft.server.network.NetHandlerLoginServer.n ^ 47594931086838L);
    net.minecraft.server.network.NetHandlerLoginServer.b(((int[])(__sourceSpill1206_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill1206_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1206_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1206_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1206_15 = new byte[8];
    (__sourceSpill1206_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill1206_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation1206_17 = __sourceSpill1206_15;
    ((javax.crypto.Cipher)(__sourceSpill1206_12)).init(((int)(__sourceSpill1206_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1206_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1206_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = 1634903493813115756L;
    byte[] __sourceSpill1206_21 = new byte[8];
    (__sourceSpill1206_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill1206_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill1206_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill1206_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill1206_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill1206_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill1206_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill1206_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill1206_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill1206_22)).doFinal(((byte[])(__sourceSpill1206_21)));
    o = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
    a = ((java.util.concurrent.atomic.AtomicInteger)(new java.util.concurrent.atomic.AtomicInteger(0)));
    b = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    c = ((java.util.Random)(new java.util.Random()));
}

private static native <E extends Throwable> void __sourceConstructorInit_762703cbcf8f4c81_0(net.minecraft.server.network.NetHandlerLoginServer a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_b41f49e4a41ae2c2c429(net.minecraft.server.network.NetHandlerLoginServer a0, moom.yW a1) throws E;
private static final class __SourceHandler_b41f49e4a41ae2c2c429 {

public static void f300138(net.minecraft.server.network.NetHandlerLoginServer receiver, moom.yW p0) throws Throwable {
    int forwardValue300138_13_0;
    net.minecraft.server.network.NetHandlerLoginServer forwardValue300138_55_0;
    net.minecraft.server.network.NetHandlerLoginServer spill300138_0;
    net.minecraft.server.network.NetHandlerLoginServer spill300138_1;
    net.minecraft.network.NetworkManager spill300138_2;
    moom.yZ spill300138_3;
    moom.yZ spill300138_4;
    long life2_3;
    int[] life4_5;
    forward_join_57: {
    forward_join_55: {
    forward_join_54: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (__fieldRead300138_0() ^ 17885598430943L);
    life4_5 = __call300138_1();
    if (!((__fieldRead300138_2(receiver) == __fieldRead300138_3()))) {
        break forward_join_12;
    }
    forwardValue300138_13_0 = 1;
    break forward_join_13;
    }
    forwardValue300138_13_0 = 0;
    }
    __call300138_4(forwardValue300138_13_0, "Unexpected hello packet", new java.lang.Object[0]);
    __fieldWrite300138_6(receiver, __call300138_5(p0));
    spill300138_0 = receiver;
    if (!((life4_5 != null))) {
        forwardValue300138_55_0 = spill300138_0;
        break forward_join_55;
    }
    if (!(__call300138_8(__fieldRead300138_7(spill300138_0)))) {
        break forward_join_54;
    }
    spill300138_1 = receiver;
    if (!((life4_5 != null))) {
        forwardValue300138_55_0 = spill300138_1;
        break forward_join_55;
    }
    if (!((!__call300138_10(__fieldRead300138_9(spill300138_1))))) {
        break forward_join_54;
    }
    __fieldWrite300138_12(receiver, __fieldRead300138_11());
    spill300138_2 = __fieldRead300138_13(receiver);
    moom.yZ __stackOp300138_15_0 = __sourceUninitializedNEW300138_14();
    spill300138_3 = __stackOp300138_15_0;
    spill300138_4 = __stackOp300138_15_0;
    __call300138_16(receiver);
    __explicitNewInit300138_21(spill300138_4, "", __call300138_19(__call300138_18(__fieldRead300138_17(receiver))), __fieldRead300138_20(receiver));
    __call300138_22(spill300138_2, spill300138_3);
    if (!((life4_5 == null))) {
        break forward_join_57;
    }
    }
    forwardValue300138_55_0 = receiver;
    }
    __fieldWrite300138_24(forwardValue300138_55_0, __fieldRead300138_23());
    }
    return;
}
private static native long __fieldRead300138_0() throws Throwable;
private static native int[] __call300138_1() throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer$LoginState __fieldRead300138_2(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer$LoginState __fieldRead300138_3() throws Throwable;
private static native void __call300138_4(int a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native com.mojang.authlib.GameProfile __call300138_5(moom.yW a0) throws Throwable;
private static native void __fieldWrite300138_6(net.minecraft.server.network.NetHandlerLoginServer a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native moom.Bl __fieldRead300138_7(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native boolean __call300138_8(moom.Bl a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead300138_9(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native boolean __call300138_10(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer$LoginState __fieldRead300138_11() throws Throwable;
private static native void __fieldWrite300138_12(net.minecraft.server.network.NetHandlerLoginServer a0, net.minecraft.server.network.NetHandlerLoginServer$LoginState a1) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead300138_13(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native moom.yZ __sourceUninitializedNEW300138_14() throws Throwable;
private static native java.lang.Object __call300138_16(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native moom.Bl __fieldRead300138_17(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native java.security.KeyPair __call300138_18(moom.Bl a0) throws Throwable;
private static native java.security.PublicKey __call300138_19(java.security.KeyPair a0) throws Throwable;
private static native byte[] __fieldRead300138_20(net.minecraft.server.network.NetHandlerLoginServer a0) throws Throwable;
private static native void __explicitNewInit300138_21(moom.yZ a0, java.lang.String a1, java.security.PublicKey a2, byte[] a3) throws Throwable;
private static native void __call300138_22(net.minecraft.network.NetworkManager a0, moom.yZ a1) throws Throwable;
private static native net.minecraft.server.network.NetHandlerLoginServer$LoginState __fieldRead300138_23() throws Throwable;
private static native void __fieldWrite300138_24(net.minecraft.server.network.NetHandlerLoginServer a0, net.minecraft.server.network.NetHandlerLoginServer$LoginState a1) throws Throwable;

}


public static int[] b() {
return net.minecraft.server.network.NetHandlerLoginServer.m;
}


public static void b(int[] p0) {
m = ((int[])(p0));
    return;
}


public void c__Void() {
net.minecraft.server.network.NetHandlerLoginServer$LoginState forwardValue5624_21_0;
    net.minecraft.server.network.NetHandlerLoginServer$LoginState forwardValue5624_21_1;
    net.minecraft.server.network.NetHandlerLoginServer forwardValue5624_49_0;
    net.minecraft.server.network.NetHandlerLoginServer forwardValue5624_61_0;
    net.minecraft.server.network.NetHandlerLoginServer$LoginState spill5624_0;
    net.minecraft.server.network.NetHandlerLoginServer$LoginState spill5624_1;
    net.minecraft.server.network.NetHandlerLoginServer spill5624_2;
    net.minecraft.server.network.NetHandlerLoginServer spill5624_3;
    int spill5624_4;
    long life1_3;
    int[] life3_5;
    net.minecraft.entity.player.EntityPlayerMP life4_46;
    forward_join_63: {
    forward_join_61: {
    forward_join_49: {
    forward_join_48: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (net.minecraft.server.network.NetHandlerLoginServer.n ^ 7517611421675L);
    life3_5 = net.minecraft.server.network.NetHandlerLoginServer.b();
    spill5624_0 = this.g;
    spill5624_1 = net.minecraft.server.network.NetHandlerLoginServer$LoginState.READY_TO_ACCEPT;
    if (!((life3_5 != null))) {
        forwardValue5624_21_0 = spill5624_0;
        forwardValue5624_21_1 = spill5624_1;
        break forward_join_21;
    }
    if (!((spill5624_0 == spill5624_1))) {
        break forward_join_16;
    }
    ((net.minecraft.server.network.NetHandlerLoginServer)(this)).a__Void();
    if (!((life3_5 == null))) {
        break forward_join_48;
    }
    }
    spill5624_2 = this;
    if (!((life3_5 != null))) {
        forwardValue5624_49_0 = spill5624_2;
        break forward_join_49;
    }
    forwardValue5624_21_0 = ((net.minecraft.server.network.NetHandlerLoginServer)(spill5624_2)).g;
    forwardValue5624_21_1 = net.minecraft.server.network.NetHandlerLoginServer$LoginState.DELAY_ACCEPT;
    }
    if (!((forwardValue5624_21_0 == forwardValue5624_21_1))) {
        break forward_join_48;
    }
    spill5624_3 = this;
    if (!((life3_5 != null))) {
        forwardValue5624_49_0 = spill5624_3;
        break forward_join_49;
    }
    life4_46 = ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(((net.minecraft.server.network.NetHandlerLoginServer)(spill5624_3)).e)).a__BA())).a(((java.util.UUID)(((com.mojang.authlib.GameProfile)(this.i)).getId())));
    if (!((life4_46 == null))) {
        break forward_join_48;
    }
    this.g = ((net.minecraft.server.network.NetHandlerLoginServer$LoginState)(net.minecraft.server.network.NetHandlerLoginServer$LoginState.READY_TO_ACCEPT));
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.e)).a__BA())).a(((net.minecraft.network.NetworkManager)(this.f)), ((net.minecraft.entity.player.EntityPlayerMP)(this.l)));
    this.l = ((net.minecraft.entity.player.EntityPlayerMP)(null));
    }
    forwardValue5624_49_0 = this;
    }
    if (!((life3_5 != null))) {
        forwardValue5624_61_0 = forwardValue5624_49_0;
        break forward_join_61;
    }
    net.minecraft.server.network.NetHandlerLoginServer __stackOp5624_20_0 = forwardValue5624_49_0;
    net.minecraft.server.network.NetHandlerLoginServer __stackOp5624_22_0 = __stackOp5624_20_0;
    int __stackOp5624_22_1 = ((net.minecraft.server.network.NetHandlerLoginServer)(__stackOp5624_20_0)).h;
    spill5624_4 = __stackOp5624_22_1;
    ((net.minecraft.server.network.NetHandlerLoginServer)(__stackOp5624_22_0)).h = ((int)((__stackOp5624_22_1 + 1)));
    if (!((spill5624_4 == ((int) net.minecraft.server.network.NetHandlerLoginServer.o)))) {
        break forward_join_63;
    }
    forwardValue5624_61_0 = this;
    }
    ((net.minecraft.server.network.NetHandlerLoginServer)(forwardValue5624_61_0)).a(((java.lang.String)("Took too long to log in")));
    }
    return;
}


public void a(moom.yX p0) {
int forwardValue5622_13_0;
    net.minecraft.server.network.NetHandlerLoginServer forwardValue5622_45_0;
    net.minecraft.server.network.NetHandlerLoginServer spill5622_0;
    long life2_3;
    int[] life4_5;
    java.security.PrivateKey life5_23;
    forward_join_62: {
    forward_join_45: {
    forward_join_36: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (net.minecraft.server.network.NetHandlerLoginServer.n ^ 26971927719932L);
    life4_5 = net.minecraft.server.network.NetHandlerLoginServer.b();
    if (!((this.g == net.minecraft.server.network.NetHandlerLoginServer$LoginState.KEY))) {
        break forward_join_12;
    }
    forwardValue5622_13_0 = 1;
    break forward_join_13;
    }
    forwardValue5622_13_0 = 0;
    }
    org.apache.commons.lang3.Validate.validState(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue5622_13_0))), ((java.lang.String)("Unexpected key packet")), ((java.lang.Object[])(new java.lang.Object[0])));
    life5_23 = ((java.security.KeyPair)(((moom.Bl)(this.e)).a__KeyPair())).getPrivate();
    spill5622_0 = this;
    if (!((life4_5 != null))) {
        forwardValue5622_45_0 = spill5622_0;
        break forward_join_45;
    }
    if (!((!java.util.Arrays.equals(((byte[])(((net.minecraft.server.network.NetHandlerLoginServer)(spill5622_0)).d)), ((byte[])(((moom.yX)(p0)).a__ArrayByte(((java.security.PrivateKey)(life5_23))))))))) {
        break forward_join_36;
    }
    throw new java.lang.IllegalStateException("Invalid nonce!");
    }
    this.k = ((javax.crypto.SecretKey)(((moom.yX)(p0)).a(((java.security.PrivateKey)(life5_23)))));
    this.g = ((net.minecraft.server.network.NetHandlerLoginServer$LoginState)(net.minecraft.server.network.NetHandlerLoginServer$LoginState.AUTHENTICATING));
    forwardValue5622_45_0 = this;
    }
    ((net.minecraft.network.NetworkManager)(((net.minecraft.server.network.NetHandlerLoginServer)(forwardValue5622_45_0)).f)).a(((javax.crypto.SecretKey)(this.k)));
    ((moom.Ov)(new moom.Ov(this, __sourceIntrinsic_ca8fb057bfbb_invokedynamic5622_20(((java.util.concurrent.atomic.AtomicInteger)(net.minecraft.server.network.NetHandlerLoginServer.a)).incrementAndGet())))).start();
    if (!((life4_5 == null))) {
        break forward_join_62;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


protected com.mojang.authlib.GameProfile a(com.mojang.authlib.GameProfile p0) {
java.util.UUID local2 = java.util.UUID.nameUUIDFromBytes(((byte[])(((java.lang.String)(__sourceIntrinsic_da8533a31aeb_originalDynamicSite2040_1(((com.mojang.authlib.GameProfile)(p0)).getName()))).getBytes(((java.nio.charset.Charset)(com.google.common.base.Charsets.UTF_8))))));
    return new com.mojang.authlib.GameProfile(local2, ((com.mojang.authlib.GameProfile)(p0)).getName());
}


private static java.lang.IllegalStateException a(java.lang.IllegalStateException p0) {
return p0;
}


public void a(java.lang.String p0) {
moom.CM life2_10;
    try {
        ((org.apache.logging.log4j.Logger)(net.minecraft.server.network.NetHandlerLoginServer.b)).info(((java.lang.String)(__sourceIntrinsic_474b89cf9bbb_invokedynamic10098_2(((net.minecraft.server.network.NetHandlerLoginServer)(this)).a(), p0))));
        life2_10 = new moom.CM(p0);
        ((net.minecraft.network.NetworkManager)(this.f)).a(((moom.yK)(new moom.yY(life2_10))));
        ((net.minecraft.network.NetworkManager)(this.f)).a(((net.minecraft.util.IChatComponent)(life2_10)));
    } catch (java.lang.Exception life2_23) {
        ((org.apache.logging.log4j.Logger)(net.minecraft.server.network.NetHandlerLoginServer.b)).error(((java.lang.String)("Error whilst disconnecting player")), ((java.lang.Throwable)(life2_23)));
    }
    return;
}


public void a__Void() {
net.minecraft.server.network.NetHandlerLoginServer forwardValue5623_19_0;
    net.minecraft.network.NetworkManager forwardValue5623_67_0;
    moom.Bl forwardValue5623_75_0;
    net.minecraft.server.network.NetHandlerLoginServer spill5623_0;
    moom.Bl spill5623_1;
    net.minecraft.network.NetworkManager spill5623_2;
    long life1_3;
    int[] life3_5;
    java.lang.String life4_33;
    net.minecraft.entity.player.EntityPlayerMP life5_107;
    forward_join_110: {
    forward_join_98: {
    forward_join_96: {
    forward_join_75: {
    forward_join_67: {
    forward_join_65: {
    forward_join_40: {
    forward_join_37: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (net.minecraft.server.network.NetHandlerLoginServer.n ^ 109668828194570L);
    life3_5 = net.minecraft.server.network.NetHandlerLoginServer.b();
    spill5623_0 = this;
    if (!((life3_5 != null))) {
        forwardValue5623_19_0 = spill5623_0;
        break forward_join_19;
    }
    if (!((!((com.mojang.authlib.GameProfile)(((net.minecraft.server.network.NetHandlerLoginServer)(spill5623_0)).i)).isComplete()))) {
        break forward_join_18;
    }
    this.i = ((com.mojang.authlib.GameProfile)(((net.minecraft.server.network.NetHandlerLoginServer)(this)).a(((com.mojang.authlib.GameProfile)(this.i)))));
    }
    forwardValue5623_19_0 = this;
    }
    life4_33 = ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(((net.minecraft.server.network.NetHandlerLoginServer)(forwardValue5623_19_0)).e)).a__BA())).a(((java.net.SocketAddress)(((net.minecraft.network.NetworkManager)(this.f)).a__SocketAddress())), ((com.mojang.authlib.GameProfile)(this.i)));
    if (!((life3_5 != null))) {
        break forward_join_40;
    }
    if (!((life4_33 != null))) {
        break forward_join_37;
    }
    ((net.minecraft.server.network.NetHandlerLoginServer)(this)).a(((java.lang.String)(life4_33)));
    if (!((life3_5 == null))) {
        break forward_join_110;
    }
    }
    this.g = ((net.minecraft.server.network.NetHandlerLoginServer$LoginState)(net.minecraft.server.network.NetHandlerLoginServer$LoginState.ACCEPTED));
    }
    spill5623_1 = this.e;
    if (!((life3_5 != null))) {
        forwardValue5623_75_0 = spill5623_1;
        break forward_join_75;
    }
    if (!((((moom.Bl)(spill5623_1)).i() >= 0))) {
        break forward_join_65;
    }
    spill5623_2 = this.f;
    if (!((life3_5 != null))) {
        forwardValue5623_67_0 = spill5623_2;
        break forward_join_67;
    }
    if (!((!((net.minecraft.network.NetworkManager)(spill5623_2)).a__Boolean()))) {
        break forward_join_65;
    }
    ((net.minecraft.network.NetworkManager)(this.f)).a(((moom.yK)(new moom.y1(((moom.Bl)(this.e)).i()))), ((io.netty.util.concurrent.GenericFutureListener)(__sourceIntrinsic_b82a5b29b709_invokedynamic5623_23(this))), ((io.netty.util.concurrent.GenericFutureListener[])(new io.netty.util.concurrent.GenericFutureListener[0])));
    }
    forwardValue5623_67_0 = this.f;
    }
    ((net.minecraft.network.NetworkManager)(forwardValue5623_67_0)).a(((moom.yK)(new moom.y0(this.i))));
    forwardValue5623_75_0 = this.e;
    }
    life5_107 = ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(forwardValue5623_75_0)).a__BA())).a(((java.util.UUID)(((com.mojang.authlib.GameProfile)(this.i)).getId())));
    if (!((life3_5 != null))) {
        break forward_join_96;
    }
    if (!((life5_107 != null))) {
        break forward_join_98;
    }
    this.g = ((net.minecraft.server.network.NetHandlerLoginServer$LoginState)(net.minecraft.server.network.NetHandlerLoginServer$LoginState.DELAY_ACCEPT));
    this.l = ((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.e)).a__BA())).a(((com.mojang.authlib.GameProfile)(this.i)))));
    }
    if (!((life3_5 == null))) {
        break forward_join_110;
    }
    }
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.e)).a__BA())).a(((net.minecraft.network.NetworkManager)(this.f)), ((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.e)).a__BA())).a(((com.mojang.authlib.GameProfile)(this.i))))));
    }
    return;
}


public void a(net.minecraft.util.IChatComponent p0) {
((org.apache.logging.log4j.Logger)(net.minecraft.server.network.NetHandlerLoginServer.b)).info(((java.lang.String)(__sourceIntrinsic_2586c2e710d8_originalDynamicSite2041_3(((net.minecraft.server.network.NetHandlerLoginServer)(this)).a(), ((net.minecraft.util.IChatComponent)(p0)).b()))));
    return;
}


public java.lang.String a() {
net.minecraft.server.network.NetHandlerLoginServer forwardValue5620_20_0;
    java.lang.String forwardValue5620_23_0;
    net.minecraft.server.network.NetHandlerLoginServer spill5620_0;
    long life1_3;
    int[] life3_5;
    forward_join_23: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (net.minecraft.server.network.NetHandlerLoginServer.n ^ 100472930265405L);
    life3_5 = net.minecraft.server.network.NetHandlerLoginServer.b();
    spill5620_0 = this;
    if (!((life3_5 != null))) {
        forwardValue5620_20_0 = spill5620_0;
        break forward_join_20;
    }
    if (!((((net.minecraft.server.network.NetHandlerLoginServer)(spill5620_0)).i != null))) {
        break forward_join_19;
    }
    forwardValue5620_23_0 = __sourceIntrinsic_63ef3276e4d3_invokedynamic5620_7(this.i, ((java.lang.Object)(((net.minecraft.network.NetworkManager)(this.f)).a__SocketAddress())).toString());
    break forward_join_23;
    }
    forwardValue5620_20_0 = this;
    }
    forwardValue5620_23_0 = java.lang.String.valueOf(((java.lang.Object)(((net.minecraft.network.NetworkManager)(((net.minecraft.server.network.NetHandlerLoginServer)(forwardValue5620_20_0)).f)).a__SocketAddress())));
    }
    return forwardValue5620_23_0;
}


public void a(moom.yW p0) { __sourceHandlerCall_b41f49e4a41ae2c2c429(this, p0); }


private void lambda$tryAcceptPlayer$0(io.netty.channel.ChannelFuture p0) throws java.lang.Exception {
((net.minecraft.network.NetworkManager)(this.f)).a(((int)(((moom.Bl)(this.e)).i())));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic5620_7(com.mojang.authlib.GameProfile a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da8533a31aeb_originalDynamicSite2040_1(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_invokedynamic10098_2(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ca8fb057bfbb_invokedynamic5622_20(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2586c2e710d8_originalDynamicSite2041_3(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> io.netty.channel.ChannelFutureListener __sourceIntrinsic_b82a5b29b709_invokedynamic5623_23(net.minecraft.server.network.NetHandlerLoginServer a0) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
