package moom;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;


public class yH {

private javax.crypto.Cipher a;

private byte[] b;

private byte[] c;

private static long d;

protected yH(javax.crypto.Cipher p0) {
super();
    this.b = new byte[0];
    this.c = new byte[0];
    this.a = p0;
}

private static native <E extends Throwable> void __sourceHandlerCall_8d67cf592b2b49217505(moom.yH a0, ByteBuf a1, ByteBuf a2) throws E;
private static final class __SourceHandler_8d67cf592b2b49217505 {

public static void f2104(moom.yH receiver, ByteBuf p0, ByteBuf p1) throws Throwable {
    long life3_3;
    int life6_6;
    byte[] life7_11;
    int life8_16;
    java.lang.String life5_17;
    life3_3 = (__fieldRead2104_0() ^ 40173724426413L);
    life6_6 = __call2104_1(p0);
    java.lang.String spill2104_0 = __call2104_2();
    life7_11 = __call2104_3(receiver, p0);
    life8_16 = __call2104_5(__fieldRead2104_4(receiver), life6_6);
    life5_17 = spill2104_0;
    if ((life5_17 == null)) {
        if (((__fieldRead2104_6(receiver)).length < life8_16)) {
        __fieldWrite2104_7(receiver, new byte[life8_16]);
    }
        __call2104_12(p1, __fieldRead2104_8(receiver), 0, __call2104_11(__fieldRead2104_9(receiver), life7_11, 0, life6_6, __fieldRead2104_10(receiver)));
    }
    return;
}
public static void h2104_0(javax.crypto.ShortBufferException p0) throws Throwable {
    throw __call1210400_0(p0);
}
public static void h2104_1(javax.crypto.ShortBufferException p0) throws Throwable {
    throw __call1210401_0(p0);
}
private static native long __fieldRead2104_0() throws Throwable;
private static native int __call2104_1(ByteBuf a0) throws Throwable;
private static native java.lang.String __call2104_2() throws Throwable;
private static native byte[] __call2104_3(moom.yH a0, ByteBuf a1) throws Throwable;
private static native javax.crypto.Cipher __fieldRead2104_4(moom.yH a0) throws Throwable;
private static native int __call2104_5(javax.crypto.Cipher a0, int a1) throws Throwable;
private static native byte[] __fieldRead2104_6(moom.yH a0) throws Throwable;
private static native void __fieldWrite2104_7(moom.yH a0, byte[] a1) throws Throwable;
private static native byte[] __fieldRead2104_8(moom.yH a0) throws Throwable;
private static native javax.crypto.Cipher __fieldRead2104_9(moom.yH a0) throws Throwable;
private static native byte[] __fieldRead2104_10(moom.yH a0) throws Throwable;
private static native int __call2104_11(javax.crypto.Cipher a0, byte[] a1, int a2, int a3, byte[] a4) throws Throwable;
private static native ByteBuf __call2104_12(ByteBuf a0, byte[] a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1210400_0(javax.crypto.ShortBufferException a0) throws Throwable;
private static native java.lang.Exception __call1210401_0(javax.crypto.ShortBufferException a0) throws Throwable;

}

private static native <E extends Throwable> byte[] __sourceHandlerCall_fee350559f2530a1e807(moom.yH a0, ByteBuf a1) throws E;
private static final class __SourceHandler_fee350559f2530a1e807 {

public static byte[] f1237(moom.yH receiver, ByteBuf p0) throws Throwable {
    byte[] forwardValue1237_29_0;
    java.lang.String spill1237_0;
    byte[] spill1237_1;
    long life2_3;
    int life5_7;
    java.lang.String life4_8;
    forward_join_29: {
    forward_join_20: {
    life2_3 = (__fieldRead1237_0() ^ 89161533059020L);
    spill1237_0 = __call1237_1();
    life5_7 = __call1237_2(p0);
    life4_8 = spill1237_0;
    spill1237_1 = __fieldRead1237_3(receiver);
    if (!((life4_8 == null))) {
        forwardValue1237_29_0 = spill1237_1;
        break forward_join_29;
    }
    if (!(((spill1237_1).length < life5_7))) {
        break forward_join_20;
    }
    __fieldWrite1237_4(receiver, new byte[life5_7]);
    }
    __call1237_6(p0, __fieldRead1237_5(receiver), 0, life5_7);
    forwardValue1237_29_0 = __fieldRead1237_7(receiver);
    }
    return forwardValue1237_29_0;
}
public static void h1237_0(moom.Oo p0) throws Throwable {
    throw __call1123700_0(p0);
}
public static void h1237_1(moom.Oo p0) throws Throwable {
    throw __call1123701_0(p0);
}
private static native long __fieldRead1237_0() throws Throwable;
private static native java.lang.String __call1237_1() throws Throwable;
private static native int __call1237_2(ByteBuf a0) throws Throwable;
private static native byte[] __fieldRead1237_3(moom.yH a0) throws Throwable;
private static native void __fieldWrite1237_4(moom.yH a0, byte[] a1) throws Throwable;
private static native byte[] __fieldRead1237_5(moom.yH a0) throws Throwable;
private static native ByteBuf __call1237_6(ByteBuf a0, byte[] a1, int a2, int a3) throws Throwable;
private static native byte[] __fieldRead1237_7(moom.yH a0) throws Throwable;
private static native java.lang.Exception __call1123700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1123701_0(moom.Oo a0) throws Throwable;

}


static {
moom.yH.d = (moom._c.a(-5203723774737919400L, 1574939831457584132L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(270354291214791L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


protected void a(ByteBuf p0, ByteBuf p1) throws javax.crypto.ShortBufferException { __sourceHandlerCall_8d67cf592b2b49217505(this, p0, p1); }


protected ByteBuf a(ChannelHandlerContext p0, ByteBuf p1) throws javax.crypto.ShortBufferException {
int local3 = ((ByteBuf)(p1)).readableBytes();
    byte[] local4 = ((moom.yH)(this)).a(((ByteBuf)(p1)));
    java.lang.Object local5 = ((ByteBufAllocator)(((ChannelHandlerContext)(p0)).alloc())).heapBuffer(((int)(((javax.crypto.Cipher)(this.a)).getOutputSize(((int)(local3))))));
    ((ByteBuf)(local5)).writerIndex(((int)(((javax.crypto.Cipher)(this.a)).update(((byte[])(local4)), ((int)(0)), ((int)(local3)), ((byte[])(((ByteBuf)(local5)).array())), ((int)(((ByteBuf)(local5)).arrayOffset()))))));
    return ((ByteBuf)(local5));
}


private byte[] a(ByteBuf p0) { return __sourceHandlerCall_fee350559f2530a1e807(this, p0); }

}
