package moom;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;


public class u extends ByteToMessageDecoder {

private static long a;

public u() {
super();
}


static {
moom.u.a = (moom._c.a(7038961433182094000L, -580305987075622788L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(117462536036682L);
}

private static native <E extends Throwable> void __sourceHandlerCall_6e047c0b1af5a3175156(moom.u a0, ChannelHandlerContext a1, ByteBuf a2, java.util.List a3) throws E;
private static final class __SourceHandler_6e047c0b1af5a3175156 {

public static void f471(moom.u receiver, ChannelHandlerContext p0, ByteBuf p1, java.util.List p2) throws Throwable {
    int lexicalValue471_37_0;
    int lexicalValue471_68_0;
    boolean spill471_0;
    boolean spill471_1;
    int spill471_2;
    long life4_3;
    byte[] life7_10;
    int life6_11;
    int life8_13;
    net.minecraft.network.PacketBuffer life9_51;
    int life10_54;
    lexical_join_73: {
    life4_3 = (__fieldRead471_0() ^ 92830472877453L);
    spill471_0 = __call471_1();
    __call471_2(p1);
    life7_10 = new byte[3];
    life6_11 = __integerCategory471_3(spill471_0);
    life8_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_71: {
    lexical_join_70: {
    lexical_join_68: {
    lexical_join_63: {
    lexical_join_37: {
    lexical_join_27: {
    if (!((life8_13 < (life7_10).length))) {
        break lexical_join_73;
    }
    spill471_1 = __call471_4(p1);
    if (!((life6_11 != 0))) {
        lexicalValue471_37_0 = __integerCategory471_5(spill471_1);
        break lexical_join_37;
    }
    if (!((!spill471_1))) {
        break lexical_join_27;
    }
    __call471_6(p1);
    return;
    }
    (life7_10)[life8_13] = __call471_7(p1);
    if (!((life6_11 != 0))) {
        break lexical_join_71;
    }
    lexicalValue471_37_0 = __integerCategory471_8((life7_10)[life8_13]);
    }
    if (!((lexicalValue471_37_0 >= 0))) {
        break lexical_join_70;
    }
    life9_51 = new net.minecraft.network.PacketBuffer(__call471_9(life7_10));
    life10_54 = __call471_10(life9_51);
    spill471_2 = __call471_11(p1);
    if (!((life6_11 != 0))) {
        lexicalValue471_68_0 = spill471_2;
        break lexical_join_68;
    }
    if (!((spill471_2 >= life10_54))) {
        break lexical_join_63;
    }
    __call471_13(p2, __call471_12(p1, life10_54));
    __call471_14(life9_51);
    return;
    }
    __call471_15(p1);
    lexicalValue471_68_0 = __integerCategory471_17(__call471_16(life9_51));
    }
    __discardScalar471_18(lexicalValue471_68_0);
    return;
    }
    life8_13 += 1;
    }
    if (!((life6_11 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    throw new CorruptedFrameException("length wider than 21-bit");
}
public static void h471_0(java.lang.Exception p0) throws Throwable {
    throw __call2047100_0(p0);
}
public static void h471_1(java.lang.Exception p0) throws Throwable {
    throw __call2047101_0(p0);
}
public static void h471_2(java.lang.Exception p0) throws Throwable {
    throw __call2047102_0(p0);
}
public static void h471_3(java.lang.Exception p0) throws Throwable {
    throw __call2047103_0(p0);
}
public static void h471_4(java.lang.Throwable p0, net.minecraft.network.PacketBuffer p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2047104_0(p1);
    throw local2;
}
private static native long __fieldRead471_0() throws Throwable;
private static native boolean __call471_1() throws Throwable;
private static native ByteBuf __call471_2(ByteBuf a0) throws Throwable;
private static native int __integerCategory471_3(boolean value) throws Throwable;
private static native boolean __call471_4(ByteBuf a0) throws Throwable;
private static native int __integerCategory471_5(boolean value) throws Throwable;
private static native ByteBuf __call471_6(ByteBuf a0) throws Throwable;
private static native byte __call471_7(ByteBuf a0) throws Throwable;
private static native int __integerCategory471_8(byte value) throws Throwable;
private static native ByteBuf __call471_9(byte[] a0) throws Throwable;
private static native int __call471_10(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call471_11(ByteBuf a0) throws Throwable;
private static native ByteBuf __call471_12(ByteBuf a0, int a1) throws Throwable;
private static native boolean __call471_13(java.util.List a0, ByteBuf a1) throws Throwable;
private static native boolean __call471_14(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native ByteBuf __call471_15(ByteBuf a0) throws Throwable;
private static native boolean __call471_16(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __integerCategory471_17(boolean value) throws Throwable;
private static native void __discardScalar471_18(int a0) throws Throwable;
private static native java.lang.Exception __call2047100_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2047101_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2047102_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2047103_0(java.lang.Exception a0) throws Throwable;
private static native boolean __call2047104_0(net.minecraft.network.PacketBuffer a0) throws Throwable;

}


protected void decode(ChannelHandlerContext p0, ByteBuf p1, java.util.List<java.lang.Object> p2) throws java.lang.Exception { __sourceHandlerCall_6e047c0b1af5a3175156(this, p0, p1, p2); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}

}
