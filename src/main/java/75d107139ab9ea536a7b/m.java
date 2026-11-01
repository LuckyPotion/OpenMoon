package moom;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

import com.moon.aI;
import com.moon.o4;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.protocol.ProtocolPipelineImpl;
import io.netty.channel.*;
import io.netty.handler.timeout.ReadTimeoutHandler;
import net.minecraft.network.EnumPacketDirection;
class m extends ChannelInitializer<Channel> {

net.minecraft.network.NetworkManager a;

private static long b;

private static long c;

m(net.minecraft.network.NetworkManager p0) { super(); __sourceHandlerCall_9bbcc9b05b5b2ee07f3c(this, p0); }


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-3914384177424168334L)), ((long)(-3967468639084262868L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(236418781347008L)))));
    long local0_life6 = (moom.m.b ^ 110642794727803L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill927_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill927_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill927_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill927_13 = new byte[8];
    (__sourceSpill927_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill927_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation927_15 = __sourceSpill927_13;
    ((javax.crypto.Cipher)(__sourceSpill927_10)).init(((int)(__sourceSpill927_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill927_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation927_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -9150983288321580985L;
    byte[] __sourceSpill927_19 = new byte[8];
    (__sourceSpill927_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill927_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill927_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill927_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill927_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill927_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill927_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill927_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill927_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill927_20)).doFinal(((byte[])(__sourceSpill927_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceHandlerCall_9bbcc9b05b5b2ee07f3c(moom.m a0, net.minecraft.network.NetworkManager a1) throws E;
private static final class __SourceHandler_9bbcc9b05b5b2ee07f3c {

public static void f2577(moom.m receiver, net.minecraft.network.NetworkManager p0) throws Throwable {
    __fieldWrite2577_0(receiver, p0);
    __directSuperInit2577_1(receiver);
    return;
}
private static native void __fieldWrite2577_0(moom.m a0, net.minecraft.network.NetworkManager a1);
private static native void __directSuperInit2577_1(moom.m a0);

}


private static ChannelException a(ChannelException p0) {
return p0;
}


protected void initChannel(Channel p0) {
outer: {
   int sourceStackValue;
   join: {
    long cipherContext = moom.m.b ^ 24273713515600L;
    String guard = net.minecraft.network.PacketBuffer.b();
    try {
     ((Channel)(p0)).config().setOption(ChannelOption.TCP_NODELAY, Boolean.TRUE);
    } catch (ChannelException ignored) {
    }
    try {
     try {
      ((Channel)(p0)).pipeline().addLast("timeout", new ReadTimeoutHandler((int)moom.m.c))
       .addLast("splitter", new u())
       .addLast("decoder", new t(EnumPacketDirection.CLIENTBOUND))
       .addLast("prepender", new y())
       .addLast("encoder", new x(EnumPacketDirection.SERVERBOUND))
       .addLast("packet_handler", this.a);
      sourceStackValue = ((p0 instanceof SocketChannel) ? 1 : 0);
      if (guard != null) break join;
      if (sourceStackValue == 0) break outer;
     } catch (ChannelException failure) {
      throw moom.m.a(((ChannelException)(failure)));
     }
     sourceStackValue = com.moon.o4.a__o4().b();
    } catch (ChannelException failure) {
     throw moom.m.a(((ChannelException)(failure)));
    }
   }
   if (sourceStackValue != com.moon.o4.a__o4().a()) {
    aI connection = new aI(p0, true);
    new ProtocolPipelineImpl((UserConnection)connection);
    ((Channel)(p0)).pipeline().addLast(new ChannelHandler[]{new j(this, (UserConnection)connection)});
   }
  }
}

}
