package moom;

import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.timeout.ReadTimeoutHandler;


class o extends ChannelInitializer<Channel> {

net.minecraft.network.NetworkSystem a;

private static long b;

private static long c;

o(net.minecraft.network.NetworkSystem p0) { super(); }

private static void __sourceConstructorBody_b369fd99d5c2dc92(moom.o receiver, net.minecraft.network.NetworkSystem p0) throws Throwable {
((moom.o)(receiver)).a = ((net.minecraft.network.NetworkSystem)(p0));
    moom.o.__sourceConstructorInit_b369fd99d5c2dc92_0(((moom.o)(receiver)));
    return;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(4632470641709474336L)), ((long)(-2919253356229306468L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(46777495964019L)))));
    long local0_life6 = (moom.o.b ^ 27274581076913L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill948_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill948_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill948_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill948_13 = new byte[8];
    (__sourceSpill948_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill948_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation948_15 = __sourceSpill948_13;
    ((javax.crypto.Cipher)(__sourceSpill948_10)).init(((int)(__sourceSpill948_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill948_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation948_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3577171074314404305L;
    byte[] __sourceSpill948_19 = new byte[8];
    (__sourceSpill948_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill948_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill948_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill948_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill948_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill948_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill948_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill948_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill948_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill948_20)).doFinal(((byte[])(__sourceSpill948_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_b369fd99d5c2dc92_0(moom.o a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_aecc3a83bc01212d7149(moom.o a0, Channel a1) throws E;
private static final class __SourceHandler_aecc3a83bc01212d7149 {

public static void f470(moom.o receiver, Channel p0) throws Throwable {
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.network.NetworkManager life5_57;
    life2_3 = (__fieldRead470_0() ^ 68835892302001L);
    life4_5 = __call470_1();
    __call470_5(__call470_2(p0), __fieldRead470_3(), __fieldRead470_4());
    __call470_16(__call470_14(__call470_13(__call470_11(__call470_10(__call470_8(__call470_6(p0), "timeout", new ReadTimeoutHandler(((int) __fieldRead470_7()))), "legacy_query", new moom.k(__fieldRead470_9(receiver))), "splitter", new moom.u()), "decoder", new moom.t(__fieldRead470_12())), "prepender", new moom.y()), "encoder", new moom.x(__fieldRead470_15()));
    life5_57 = new net.minecraft.network.NetworkManager(__fieldRead470_17());
    __call470_20(__fieldRead470_19(__fieldRead470_18(receiver)), life5_57);
    __call470_22(__call470_21(p0), "packet_handler", life5_57);
    __call470_25(life5_57, new moom.BQ(__fieldRead470_24(__fieldRead470_23(receiver)), life5_57));
    if ((life4_5 != null)) {
        __call470_26(new java.lang.String[5]);
    } else {
        
    }
    return;
}
public static void h470_0(ChannelException p0, moom.o p1, Channel p2, java.lang.String p3, net.minecraft.network.NetworkManager p4) throws Throwable {
    ChannelException life4_2;
    net.minecraft.network.NetworkManager life4_46;
    life4_2 = p0;
    __call3047000_10(__call3047000_8(__call3047000_7(__call3047000_5(__call3047000_4(__call3047000_2(__call3047000_0(p2), "timeout", new ReadTimeoutHandler(((int) __fieldRead3047000_1()))), "legacy_query", new moom.k(__fieldRead3047000_3(p1))), "splitter", new moom.u()), "decoder", new moom.t(__fieldRead3047000_6())), "prepender", new moom.y()), "encoder", new moom.x(__fieldRead3047000_9()));
    life4_46 = new net.minecraft.network.NetworkManager(__fieldRead3047000_11());
    __call3047000_14(__fieldRead3047000_13(__fieldRead3047000_12(p1)), life4_46);
    __call3047000_16(__call3047000_15(p2), "packet_handler", life4_46);
    __call3047000_19(life4_46, new moom.BQ(__fieldRead3047000_18(__fieldRead3047000_17(p1)), life4_46));
    if ((p3 != null)) {
        __call3047000_20(new java.lang.String[5]);
    } else {
        
    }
    return;
}
public static void h470_1(ChannelException p0) throws Throwable {
    throw __call3047001_0(p0);
}
private static native long __fieldRead470_0() throws Throwable;
private static native java.lang.String __call470_1() throws Throwable;
private static native ChannelConfig __call470_2(Channel a0) throws Throwable;
private static native ChannelOption __fieldRead470_3() throws Throwable;
private static native java.lang.Boolean __fieldRead470_4() throws Throwable;
private static native boolean __call470_5(ChannelConfig a0, ChannelOption a1, java.lang.Boolean a2) throws Throwable;
private static native ChannelPipeline __call470_6(Channel a0) throws Throwable;
private static native long __fieldRead470_7() throws Throwable;
private static native ChannelPipeline __call470_8(ChannelPipeline a0, java.lang.String a1, ReadTimeoutHandler a2) throws Throwable;
private static native net.minecraft.network.NetworkSystem __fieldRead470_9(moom.o a0) throws Throwable;
private static native ChannelPipeline __call470_10(ChannelPipeline a0, java.lang.String a1, moom.k a2) throws Throwable;
private static native ChannelPipeline __call470_11(ChannelPipeline a0, java.lang.String a1, moom.u a2) throws Throwable;
private static native net.minecraft.network.EnumPacketDirection __fieldRead470_12() throws Throwable;
private static native ChannelPipeline __call470_13(ChannelPipeline a0, java.lang.String a1, moom.t a2) throws Throwable;
private static native ChannelPipeline __call470_14(ChannelPipeline a0, java.lang.String a1, moom.y a2) throws Throwable;
private static native net.minecraft.network.EnumPacketDirection __fieldRead470_15() throws Throwable;
private static native ChannelPipeline __call470_16(ChannelPipeline a0, java.lang.String a1, moom.x a2) throws Throwable;
private static native net.minecraft.network.EnumPacketDirection __fieldRead470_17() throws Throwable;
private static native net.minecraft.network.NetworkSystem __fieldRead470_18(moom.o a0) throws Throwable;
private static native java.util.List __fieldRead470_19(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native boolean __call470_20(java.util.List a0, net.minecraft.network.NetworkManager a1) throws Throwable;
private static native ChannelPipeline __call470_21(Channel a0) throws Throwable;
private static native ChannelPipeline __call470_22(ChannelPipeline a0, java.lang.String a1, net.minecraft.network.NetworkManager a2) throws Throwable;
private static native net.minecraft.network.NetworkSystem __fieldRead470_23(moom.o a0) throws Throwable;
private static native moom.Bl __fieldRead470_24(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native void __call470_25(net.minecraft.network.NetworkManager a0, moom.BQ a1) throws Throwable;
private static native void __call470_26(java.lang.String[] a0) throws Throwable;
private static native ChannelPipeline __call3047000_0(Channel a0) throws Throwable;
private static native long __fieldRead3047000_1() throws Throwable;
private static native ChannelPipeline __call3047000_2(ChannelPipeline a0, java.lang.String a1, ReadTimeoutHandler a2) throws Throwable;
private static native net.minecraft.network.NetworkSystem __fieldRead3047000_3(moom.o a0) throws Throwable;
private static native ChannelPipeline __call3047000_4(ChannelPipeline a0, java.lang.String a1, moom.k a2) throws Throwable;
private static native ChannelPipeline __call3047000_5(ChannelPipeline a0, java.lang.String a1, moom.u a2) throws Throwable;
private static native net.minecraft.network.EnumPacketDirection __fieldRead3047000_6() throws Throwable;
private static native ChannelPipeline __call3047000_7(ChannelPipeline a0, java.lang.String a1, moom.t a2) throws Throwable;
private static native ChannelPipeline __call3047000_8(ChannelPipeline a0, java.lang.String a1, moom.y a2) throws Throwable;
private static native net.minecraft.network.EnumPacketDirection __fieldRead3047000_9() throws Throwable;
private static native ChannelPipeline __call3047000_10(ChannelPipeline a0, java.lang.String a1, moom.x a2) throws Throwable;
private static native net.minecraft.network.EnumPacketDirection __fieldRead3047000_11() throws Throwable;
private static native net.minecraft.network.NetworkSystem __fieldRead3047000_12(moom.o a0) throws Throwable;
private static native java.util.List __fieldRead3047000_13(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native boolean __call3047000_14(java.util.List a0, net.minecraft.network.NetworkManager a1) throws Throwable;
private static native ChannelPipeline __call3047000_15(Channel a0) throws Throwable;
private static native ChannelPipeline __call3047000_16(ChannelPipeline a0, java.lang.String a1, net.minecraft.network.NetworkManager a2) throws Throwable;
private static native net.minecraft.network.NetworkSystem __fieldRead3047000_17(moom.o a0) throws Throwable;
private static native moom.Bl __fieldRead3047000_18(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native void __call3047000_19(net.minecraft.network.NetworkManager a0, moom.BQ a1) throws Throwable;
private static native void __call3047000_20(java.lang.String[] a0) throws Throwable;
private static native ChannelException __call3047001_0(ChannelException a0) throws Throwable;

}


private static ChannelException a(ChannelException p0) {
return p0;
}


protected void initChannel(Channel p0) throws java.lang.Exception { __sourceHandlerCall_aecc3a83bc01212d7149(this, p0); }

}
