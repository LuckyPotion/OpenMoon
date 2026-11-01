package moom;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class v extends MessageToByteEncoder<ByteBuf> {

private byte[] a;

private java.util.zip.Deflater b;

private int c;

private static long d;

private static long e;

public v(int p0) { super(); }


private static void __sourceConstructorBody_1ed7783fa0eae163(moom.v receiver, int p0) throws Throwable {

long local2 = (moom.v.d ^ 135756816393485L);

    moom.v.__sourceConstructorInit_1ed7783fa0eae163_0(((moom.v)(receiver)));

    ((moom.v)(receiver)).a = ((byte[])(new byte[((int) moom.v.e)]));

    ((moom.v)(receiver)).c = ((int)(p0));

    ((moom.v)(receiver)).b = ((java.util.zip.Deflater)(new java.util.zip.Deflater()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_1ed7783fa0eae163_0(moom.v a0) throws E;

static {
d = ((long)(((moom._a)(moom._c.a(((long)(3486403449957086360L)), ((long)(-8369528310946052783L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(218274088032633L)))));
    long local0_life6 = (moom.v.d ^ 82807503806099L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1065_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1065_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1065_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1065_13 = new byte[8];
    (__sourceSpill1065_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1065_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1065_15 = __sourceSpill1065_13;
    ((javax.crypto.Cipher)(__sourceSpill1065_10)).init(((int)(__sourceSpill1065_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1065_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1065_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 154440367010287178L;
    byte[] __sourceSpill1065_19 = new byte[8];
    (__sourceSpill1065_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1065_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1065_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1065_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1065_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1065_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1065_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1065_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1065_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1065_20)).doFinal(((byte[])(__sourceSpill1065_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void a(int p0) {
this.c = ((int)(p0));
    return;
}


protected void a(ChannelHandlerContext p0, ByteBuf p1, ByteBuf p2) throws java.lang.Exception {
int lexicalValue1341_30_0;
    java.lang.String spill1341_0;
    int spill1341_1;
    long life4_3;
    int life7_7;
    java.lang.String life6_8;
    net.minecraft.network.PacketBuffer life8_13;
    byte[] life9_40;
    int life10_67;
    lexical_join_73: {
    lexical_join_70: {
    lexical_join_30: {
    lexical_join_29: {
    life4_3 = (moom.v.d ^ 73263403359723L);
    spill1341_0 = net.minecraft.network.PacketBuffer.b();
    life7_7 = ((ByteBuf)(p1)).readableBytes();
    life6_8 = spill1341_0;
    life8_13 = new net.minecraft.network.PacketBuffer(p2);
    spill1341_1 = life7_7;
    if (!((life6_8 == null))) {
        lexicalValue1341_30_0 = spill1341_1;
        break lexical_join_30;
    }
    if (!((spill1341_1 < this.c))) {
        break lexical_join_29;
    }
    ((net.minecraft.network.PacketBuffer)(life8_13)).a__Void(((int)(0)));
    ((net.minecraft.network.PacketBuffer)(life8_13)).writeBytes(((ByteBuf)(p1)));
    if (!((life6_8 != null))) {
        break lexical_join_73;
    }
    }
    lexicalValue1341_30_0 = life7_7;
    }
    life9_40 = new byte[lexicalValue1341_30_0];
    ((ByteBuf)(p1)).readBytes(((byte[])(life9_40)));
    ((net.minecraft.network.PacketBuffer)(life8_13)).a__Void(((int)((life9_40).length)));
    ((java.util.zip.Deflater)(this.b)).setInput(((byte[])(life9_40)), ((int)(0)), ((int)(life7_7)));
    ((java.util.zip.Deflater)(this.b)).finish();
    lexical_cycle_49: while (true) {
    if (!((!((java.util.zip.Deflater)(this.b)).finished()))) {
        break lexical_join_70;
    }
    life10_67 = ((java.util.zip.Deflater)(this.b)).deflate(((byte[])(this.a)));
    ((net.minecraft.network.PacketBuffer)(life8_13)).writeBytes(((byte[])(this.a)), ((int)(0)), ((int)(life10_67)));
    if (!((life6_8 == null))) {
        break lexical_join_73;
    }
    if (!((life6_8 != null))) { continue lexical_cycle_49; }
    break lexical_cycle_49;
    }
    }
    ((java.util.zip.Deflater)(this.b)).reset();
    }
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


protected void encode__sourceBridge_21e6cb8471(ChannelHandlerContext p0, java.lang.Object p1, ByteBuf p2) throws java.lang.Exception {
((moom.v)(this)).a(((ChannelHandlerContext)(p0)), ((ByteBuf)(((ByteBuf)(p1)))), ((ByteBuf)(p2)));
}

public void encode(ChannelHandlerContext __bridgeParam0, ByteBuf __bridgeParam1, ByteBuf __bridgeParam2) throws java.lang.Exception { this.encode__sourceBridge_21e6cb8471(((ChannelHandlerContext)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1)), ((ByteBuf)(__bridgeParam2))); }
}
