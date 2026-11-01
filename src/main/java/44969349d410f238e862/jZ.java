package moom;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;


public class jZ {

public static com.google.common.base.Splitter a;

private static org.apache.logging.log4j.Logger b;

private java.util.List<net.minecraft.network.NetworkManager> c;

private static long d;

private static long e;

private static long f;

public jZ() {
super();
    this.c = java.util.Collections.synchronizedList(com.google.common.collect.Lists.newArrayList());
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-457308900867385852L)), ((long)(-7437446920959301095L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(257385226908485L)))));
    long local5_life6 = (moom.jZ.d ^ 62189826380401L);
    javax.crypto.Cipher local7_life8;
    javax.crypto.Cipher __sourceSpill896_10 = (local7_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill896_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill896_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill896_13 = new byte[8];
    (__sourceSpill896_13)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local8_life14 = 1;
    while ((local8_life14 < 8)) {
        (__sourceSpill896_13)[local8_life14] = ((byte) ((int) ((local5_life6 << (local8_life14 * 8)) >>> 56)));
        local8_life14 += 1;
    }
    byte[] __sourcePreallocation896_15 = __sourceSpill896_13;
    ((javax.crypto.Cipher)(__sourceSpill896_10)).init(((int)(__sourceSpill896_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill896_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation896_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local9_life18 = 4270255356990312917L;
    byte[] __sourceSpill896_19 = new byte[8];
    (__sourceSpill896_19)[0] = ((byte) ((int) (local9_life18 >>> 56)));
    (__sourceSpill896_19)[1] = ((byte) ((int) (local9_life18 >>> 48)));
    (__sourceSpill896_19)[2] = ((byte) ((int) (local9_life18 >>> 40)));
    (__sourceSpill896_19)[3] = ((byte) ((int) (local9_life18 >>> 32)));
    (__sourceSpill896_19)[4] = ((byte) ((int) (local9_life18 >>> 24)));
    (__sourceSpill896_19)[5] = ((byte) ((int) (local9_life18 >>> 16)));
    (__sourceSpill896_19)[6] = ((byte) ((int) (local9_life18 >>> 8)));
    (__sourceSpill896_19)[7] = ((byte) ((int) local9_life18));
    javax.crypto.Cipher __sourceSpill896_20 = local7_life8;
    byte[] local11_life22 = ((javax.crypto.Cipher)(__sourceSpill896_20)).doFinal(((byte[])(__sourceSpill896_19)));
    e = ((long)((((((((((((long) (local11_life22)[0]) & 255L) << 56) | ((((long) (local11_life22)[1]) & 255L) << 48)) | ((((long) (local11_life22)[2]) & 255L) << 40)) | ((((long) (local11_life22)[3]) & 255L) << 32)) | ((((long) (local11_life22)[4]) & 255L) << 24)) | ((((long) (local11_life22)[5]) & 255L) << 16)) | ((((long) (local11_life22)[6]) & 255L) << 8)) | (((long) (local11_life22)[7]) & 255L))));
    javax.crypto.Cipher local0_life25;
    javax.crypto.Cipher __sourceSpill896_27 = (local0_life25 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill896_28 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill896_29 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill896_30 = new byte[8];
    (__sourceSpill896_30)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local1_life31 = 1;
    while ((local1_life31 < 8)) {
        (__sourceSpill896_30)[local1_life31] = ((byte) ((int) ((local5_life6 << (local1_life31 * 8)) >>> 56)));
        local1_life31 += 1;
    }
    byte[] __sourcePreallocation896_32 = __sourceSpill896_30;
    ((javax.crypto.Cipher)(__sourceSpill896_27)).init(((int)(__sourceSpill896_28)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill896_29)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation896_32)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life35 = 645129971234290117L;
    byte[] __sourceSpill896_36 = new byte[8];
    (__sourceSpill896_36)[0] = ((byte) ((int) (local2_life35 >>> 56)));
    (__sourceSpill896_36)[1] = ((byte) ((int) (local2_life35 >>> 48)));
    (__sourceSpill896_36)[2] = ((byte) ((int) (local2_life35 >>> 40)));
    (__sourceSpill896_36)[3] = ((byte) ((int) (local2_life35 >>> 32)));
    (__sourceSpill896_36)[4] = ((byte) ((int) (local2_life35 >>> 24)));
    (__sourceSpill896_36)[5] = ((byte) ((int) (local2_life35 >>> 16)));
    (__sourceSpill896_36)[6] = ((byte) ((int) (local2_life35 >>> 8)));
    (__sourceSpill896_36)[7] = ((byte) ((int) local2_life35));
    javax.crypto.Cipher __sourceSpill896_37 = local0_life25;
    byte[] local4_life39 = ((javax.crypto.Cipher)(__sourceSpill896_37)).doFinal(((byte[])(__sourceSpill896_36)));
    f = ((long)((((((((((((long) (local4_life39)[0]) & 255L) << 56) | ((((long) (local4_life39)[1]) & 255L) << 48)) | ((((long) (local4_life39)[2]) & 255L) << 40)) | ((((long) (local4_life39)[3]) & 255L) << 32)) | ((((long) (local4_life39)[4]) & 255L) << 24)) | ((((long) (local4_life39)[5]) & 255L) << 16)) | ((((long) (local4_life39)[6]) & 255L) << 8)) | (((long) (local4_life39)[7]) & 255L))));
    a = ((com.google.common.base.Splitter)(null));
    b = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_91da4ec7ff7daa24327a(moom.jZ a0) throws E;
private static final class __SourceHandler_91da4ec7ff7daa24327a {

public static void f449(moom.jZ receiver) throws Throwable {
    net.minecraft.network.NetworkManager forestValue449_36_0;
    boolean spill449_0;
    net.minecraft.network.NetworkManager spill449_1;
    long life1_3;
    java.util.List life4_8;
    int life3_10;
    java.util.Iterator life5_14;
    net.minecraft.network.NetworkManager life6_21;
    forest_join_41: {
    forest_join_39: {
    life1_3 = (__fieldRead449_0() ^ 1087927592090L);
    spill449_0 = __call449_1();
    __monitorEnter449_3((life4_8 = __fieldRead449_2(receiver)));
    life3_10 = __integerCategory449_4(spill449_0);
    life5_14 = __call449_6(__fieldRead449_5(receiver));
    forest_cycle_15: while (true) {
    forest_join_37: {
    forest_join_36: {
    forest_join_33: {
    if (!(__call449_7(life5_14))) {
        break forest_join_39;
    }
    life6_21 = __cast449_9(__call449_8(life5_14));
    if (!((life3_10 != 0))) {
        break forest_join_41;
    }
    spill449_1 = life6_21;
    if (!((life3_10 != 0))) {
        forestValue449_36_0 = spill449_1;
        break forest_join_36;
    }
    if (!(__call449_10(spill449_1))) {
        break forest_join_33;
    }
    __call449_11(life6_21);
    if (!((life3_10 == 0))) {
        break forest_join_37;
    }
    }
    __call449_12(life5_14);
    forestValue449_36_0 = life6_21;
    }
    __call449_13(forestValue449_36_0);
    }
    if (!((life3_10 == 0))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    }
    __monitorExit449_14(life4_8);
    }
    return;
}
public static void h449_0(moom.Oo p0) throws Throwable {
    throw __call3044900_0(p0);
}
public static void h449_1(moom.Oo p0) throws Throwable {
    throw __call3044901_0(p0);
}
public static void h449_2(moom.Oo p0) throws Throwable {
    throw __call3044902_0(p0);
}
public static void h449_3(moom.Oo p0) throws Throwable {
    throw __call3044903_0(p0);
}
public static void h449_4(java.lang.Throwable p0, java.util.List p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3044904_0(p1);
    throw life2_2;
}
private static native long __fieldRead449_0() throws Throwable;
private static native boolean __call449_1() throws Throwable;
private static native java.util.List __fieldRead449_2(moom.jZ a0) throws Throwable;
private static native void __monitorEnter449_3(java.util.List a0) throws Throwable;
private static native int __integerCategory449_4(boolean value) throws Throwable;
private static native java.util.List __fieldRead449_5(moom.jZ a0) throws Throwable;
private static native java.util.Iterator __call449_6(java.util.List a0) throws Throwable;
private static native boolean __call449_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call449_8(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __cast449_9(java.lang.Object a0) throws Throwable;
private static native boolean __call449_10(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native void __call449_11(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native void __call449_12(java.util.Iterator a0) throws Throwable;
private static native void __call449_13(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native void __monitorExit449_14(java.util.List a0) throws Throwable;
private static native moom.Oo __call3044900_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3044901_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3044902_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3044903_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3044904_0(java.util.List a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5a758b7b9ed95bc739d8(moom.jZ a0) throws E;
private static final class __SourceHandler_5a758b7b9ed95bc739d8 {

public static void f450(moom.jZ receiver) throws Throwable {
    net.minecraft.network.NetworkManager forestValue450_32_0;
    boolean spill450_0;
    net.minecraft.network.NetworkManager spill450_1;
    long life1_3;
    java.util.List life4_8;
    int life3_10;
    java.util.Iterator life5_14;
    net.minecraft.network.NetworkManager life6_21;
    forest_join_41: {
    forest_join_39: {
    life1_3 = (__fieldRead450_0() ^ 94449895836341L);
    spill450_0 = __call450_1();
    __monitorEnter450_3((life4_8 = __fieldRead450_2(receiver)));
    life3_10 = __integerCategory450_4(spill450_0);
    life5_14 = __call450_6(__fieldRead450_5(receiver));
    forest_cycle_15: while (true) {
    forest_join_37: {
    forest_join_32: {
    if (!(__call450_7(life5_14))) {
        break forest_join_39;
    }
    life6_21 = __cast450_9(__call450_8(life5_14));
    if (!((life3_10 == 0))) {
        break forest_join_41;
    }
    spill450_1 = life6_21;
    if (!((life3_10 == 0))) {
        forestValue450_32_0 = spill450_1;
        break forest_join_32;
    }
    if (!(__call450_10(spill450_1))) {
        break forest_join_37;
    }
    __call450_11(life5_14);
    forestValue450_32_0 = life6_21;
    }
    __call450_12(forestValue450_32_0, new moom.CM("Cancelled"));
    }
    if (!((life3_10 != 0))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    }
    __monitorExit450_13(life4_8);
    }
    return;
}
public static void h450_0(moom.Oo p0) throws Throwable {
    throw __call3045000_0(p0);
}
public static void h450_1(moom.Oo p0) throws Throwable {
    throw __call3045001_0(p0);
}
public static void h450_2(moom.Oo p0) throws Throwable {
    throw __call3045002_0(p0);
}
public static void h450_3(java.lang.Throwable p0, java.util.List p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3045003_0(p1);
    throw life2_2;
}
private static native long __fieldRead450_0() throws Throwable;
private static native boolean __call450_1() throws Throwable;
private static native java.util.List __fieldRead450_2(moom.jZ a0) throws Throwable;
private static native void __monitorEnter450_3(java.util.List a0) throws Throwable;
private static native int __integerCategory450_4(boolean value) throws Throwable;
private static native java.util.List __fieldRead450_5(moom.jZ a0) throws Throwable;
private static native java.util.Iterator __call450_6(java.util.List a0) throws Throwable;
private static native boolean __call450_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call450_8(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __cast450_9(java.lang.Object a0) throws Throwable;
private static native boolean __call450_10(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native void __call450_11(java.util.Iterator a0) throws Throwable;
private static native void __call450_12(net.minecraft.network.NetworkManager a0, moom.CM a1) throws Throwable;
private static native void __monitorExit450_13(java.util.List a0) throws Throwable;
private static native moom.Oo __call3045000_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3045001_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3045002_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3045003_0(java.util.List a0) throws Throwable;

}


public void b() { __sourceHandlerCall_5a758b7b9ed95bc739d8(this); }


private void b(moom.jL p0) {
moom.jK local2 = moom.jK.a(((java.lang.String)(((moom.jL)(p0)).b)));
    ((Bootstrap)(((Bootstrap)(((Bootstrap)(((Bootstrap)(((Bootstrap)(((Bootstrap)(((Bootstrap)(new Bootstrap())).group(((EventLoopGroup)(((EventLoopGroup)(((moom.Dh)(net.minecraft.network.NetworkManager.d)).a()))))))))).handler(((ChannelHandler)(new moom.l(this, local2, p0)))))))).channel(((java.lang.Class)(NioSocketChannel.class))))))).connect(((java.lang.String)(((moom.jK)(local2)).a__String())), ((int)(((moom.jK)(local2)).a())));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() { __sourceHandlerCall_91da4ec7ff7daa24327a(this); }


public void a(moom.jL p0) throws java.net.UnknownHostException {
long local2 = (moom.jZ.d ^ 55854158856177L);
    moom.jK local4 = moom.jK.a(((java.lang.String)(((moom.jL)(p0)).b)));
    net.minecraft.network.NetworkManager local5 = net.minecraft.network.NetworkManager.a(((java.net.InetAddress)(java.net.InetAddress.getByName(((java.lang.String)(((moom.jK)(local4)).a__String()))))), ((int)(((moom.jK)(local4)).a())), ((boolean)(false)));
    ((java.util.List)(this.c)).add(((java.lang.Object)(local5)));
    ((moom.jL)(p0)).d = ((java.lang.String)("Pinging..."));
    ((moom.jL)(p0)).e = ((long)(moom.jZ.f));
    ((moom.jL)(p0)).i = ((java.lang.String)(null));
    ((net.minecraft.network.NetworkManager)(local5)).a(((moom.yE)(new moom.j0(this, local5, p0))));
    try {
        ((net.minecraft.network.NetworkManager)(local5)).a(((moom.yK)(new moom.yT(((int) moom.jZ.e), ((moom.jK)(local4)).a__String(), ((moom.jK)(local4)).a(), net.minecraft.network.EnumConnectionState.STATUS))));
        ((net.minecraft.network.NetworkManager)(local5)).a(((moom.yK)(new moom.AO())));
    } catch (java.lang.Throwable caught6) {
        ((org.apache.logging.log4j.Logger)(moom.jZ.b)).error(((java.lang.Object)(caught6)));
    }
    return;
}

}
