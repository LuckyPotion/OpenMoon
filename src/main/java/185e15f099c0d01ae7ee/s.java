package moom;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;


public class s extends ByteToMessageDecoder {

private final java.util.zip.Inflater a;

private int b;

private static final long c;

private static final long d;

public s(int p0) {
super();
    this.b = p0;
    this.a = new java.util.zip.Inflater();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(7485550970185891141L)), ((long)(-6988663839592829228L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(94761414258249L)))));
    long local0_life6 = (moom.s.c ^ 108127727203188L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1006_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1006_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1006_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1006_13 = new byte[8];
    (__sourceSpill1006_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1006_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1006_15 = __sourceSpill1006_13;
    ((javax.crypto.Cipher)(__sourceSpill1006_10)).init(((int)(__sourceSpill1006_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1006_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1006_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -5725358377984356967L;
    byte[] __sourceSpill1006_19 = new byte[8];
    (__sourceSpill1006_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1006_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1006_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1006_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1006_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1006_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1006_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1006_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1006_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1006_20)).doFinal(((byte[])(__sourceSpill1006_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


protected void decode(ChannelHandlerContext p0, ByteBuf p1, java.util.List<java.lang.Object> p2) throws java.lang.Exception {
int forwardValue3935_31_0;
    int forwardValue3935_49_0;
    int forwardValue3935_49_1;
    int forwardValue3935_58_0;
    int spill3935_0;
    int spill3935_1;
    int spill3935_2;
    long life4_3;
    java.lang.String life6_5;
    net.minecraft.network.PacketBuffer life7_13;
    int life8_16;
    byte[] life9_78;
    byte[] life10_89;
    forward_join_84: {
    forward_join_58: {
    forward_join_56: {
    forward_join_49: {
    forward_join_44: {
    forward_join_31: {
    forward_join_30: {
    life4_3 = (moom.s.c ^ 101136237667840L);
    life6_5 = net.minecraft.network.PacketBuffer.b();
    if (!((((ByteBuf)(p1)).readableBytes() != 0))) {
        break forward_join_84;
    }
    life7_13 = new net.minecraft.network.PacketBuffer(p1);
    life8_16 = ((net.minecraft.network.PacketBuffer)(life7_13)).a();
    spill3935_0 = life8_16;
    if (!((life6_5 == null))) {
        forwardValue3935_31_0 = spill3935_0;
        break forward_join_31;
    }
    if (!((spill3935_0 == 0))) {
        break forward_join_30;
    }
    ((java.util.List)(p2)).add(((java.lang.Object)(((net.minecraft.network.PacketBuffer)(life7_13)).readBytes(((int)(((net.minecraft.network.PacketBuffer)(life7_13)).readableBytes()))))));
    if (!((life6_5 != null))) {
        break forward_join_84;
    }
    }
    forwardValue3935_31_0 = life8_16;
    }
    spill3935_1 = this.b;
    if (!((life6_5 == null))) {
        forwardValue3935_49_0 = forwardValue3935_31_0;
        forwardValue3935_49_1 = spill3935_1;
        break forward_join_49;
    }
    if (!((forwardValue3935_31_0 < spill3935_1))) {
        break forward_join_44;
    }
    throw new DecoderException(__sourceIntrinsic_aabdb495792f_invokedynamic3935_9(life8_16, this.b));
    }
    spill3935_2 = life8_16;
    if (!((life6_5 == null))) {
        forwardValue3935_58_0 = spill3935_2;
        break forward_join_58;
    }
    forwardValue3935_49_0 = spill3935_2;
    forwardValue3935_49_1 = ((int) moom.s.d);
    }
    if (!((forwardValue3935_49_0 > forwardValue3935_49_1))) {
        break forward_join_56;
    }
    throw new DecoderException(__sourceIntrinsic_aabdb495792f_invokedynamic3935_11(life8_16));
    }
    forwardValue3935_58_0 = ((net.minecraft.network.PacketBuffer)(life7_13)).readableBytes();
    }
    life9_78 = new byte[forwardValue3935_58_0];
    ((net.minecraft.network.PacketBuffer)(life7_13)).readBytes(((byte[])(life9_78)));
    ((java.util.zip.Inflater)(this.a)).setInput(((byte[])(life9_78)));
    life10_89 = new byte[life8_16];
    ((java.util.zip.Inflater)(this.a)).inflate(((byte[])(life10_89)));
    ((java.util.List)(p2)).add(((java.lang.Object)(Unpooled.wrappedBuffer(((byte[])(life10_89))))));
    ((java.util.zip.Inflater)(this.a)).reset();
    }
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(int p0) {
this.b = ((int)(p0));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_aabdb495792f_invokedynamic3935_9(int a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_aabdb495792f_invokedynamic3935_11(int a0) throws E;
}
