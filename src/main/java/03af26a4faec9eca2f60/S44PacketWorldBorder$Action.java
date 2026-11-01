package net.minecraft.network.play.server;


public class S44PacketWorldBorder$Action extends sourcebuild.EnumConstructor<net.minecraft.network.play.server.S44PacketWorldBorder$Action> {

public static net.minecraft.network.play.server.S44PacketWorldBorder$Action SET_SIZE;

public static net.minecraft.network.play.server.S44PacketWorldBorder$Action LERP_SIZE;

public static net.minecraft.network.play.server.S44PacketWorldBorder$Action SET_CENTER;

public static net.minecraft.network.play.server.S44PacketWorldBorder$Action INITIALIZE;

public static net.minecraft.network.play.server.S44PacketWorldBorder$Action SET_WARNING_TIME;

public static net.minecraft.network.play.server.S44PacketWorldBorder$Action SET_WARNING_BLOCKS;

private static net.minecraft.network.play.server.S44PacketWorldBorder$Action[] a;

private static long b;

private static long c;

private S44PacketWorldBorder$Action(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(3575868499044875252L)), ((long)(-4694391347740748211L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(244049191294634L)))));
    long local0_life6 = (net.minecraft.network.play.server.S44PacketWorldBorder$Action.b ^ 127841057935280L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1204_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1204_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1204_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1204_13 = new byte[8];
    (__sourceSpill1204_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1204_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1204_15 = __sourceSpill1204_13;
    ((javax.crypto.Cipher)(__sourceSpill1204_10)).init(((int)(__sourceSpill1204_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1204_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1204_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4284548954075765923L;
    byte[] __sourceSpill1204_19 = new byte[8];
    (__sourceSpill1204_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1204_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1204_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1204_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1204_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1204_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1204_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1204_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1204_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1204_20)).doFinal(((byte[])(__sourceSpill1204_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    SET_SIZE = ((net.minecraft.network.play.server.S44PacketWorldBorder$Action)(new net.minecraft.network.play.server.S44PacketWorldBorder$Action("SET_SIZE", 0)));
    LERP_SIZE = ((net.minecraft.network.play.server.S44PacketWorldBorder$Action)(new net.minecraft.network.play.server.S44PacketWorldBorder$Action("LERP_SIZE", 1)));
    SET_CENTER = ((net.minecraft.network.play.server.S44PacketWorldBorder$Action)(new net.minecraft.network.play.server.S44PacketWorldBorder$Action("SET_CENTER", 2)));
    INITIALIZE = ((net.minecraft.network.play.server.S44PacketWorldBorder$Action)(new net.minecraft.network.play.server.S44PacketWorldBorder$Action("INITIALIZE", 3)));
    SET_WARNING_TIME = ((net.minecraft.network.play.server.S44PacketWorldBorder$Action)(new net.minecraft.network.play.server.S44PacketWorldBorder$Action("SET_WARNING_TIME", 4)));
    SET_WARNING_BLOCKS = ((net.minecraft.network.play.server.S44PacketWorldBorder$Action)(new net.minecraft.network.play.server.S44PacketWorldBorder$Action("SET_WARNING_BLOCKS", 5)));
    a = ((net.minecraft.network.play.server.S44PacketWorldBorder$Action[])(net.minecraft.network.play.server.S44PacketWorldBorder$Action.a()));
}


public static net.minecraft.network.play.server.S44PacketWorldBorder$Action[] values() {
return ((net.minecraft.network.play.server.S44PacketWorldBorder$Action[])(((net.minecraft.network.play.server.S44PacketWorldBorder$Action[])(net.minecraft.network.play.server.S44PacketWorldBorder$Action.a)).clone()));
}


public static net.minecraft.network.play.server.S44PacketWorldBorder$Action valueOf(java.lang.String p0) {
return ((net.minecraft.network.play.server.S44PacketWorldBorder$Action)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.network.play.server.S44PacketWorldBorder$Action.class)), ((java.lang.String)(p0)))));
}


private static net.minecraft.network.play.server.S44PacketWorldBorder$Action[] a() {
long local0_life1 = (net.minecraft.network.play.server.S44PacketWorldBorder$Action.b ^ 53184137319002L);
    net.minecraft.network.play.server.S44PacketWorldBorder$Action[] __sourceSharedArray1148_4 = new net.minecraft.network.play.server.S44PacketWorldBorder$Action[((int) net.minecraft.network.play.server.S44PacketWorldBorder$Action.c)];
    __sourceSharedArray1148_4[0] = net.minecraft.network.play.server.S44PacketWorldBorder$Action.SET_SIZE;
    __sourceSharedArray1148_4[1] = net.minecraft.network.play.server.S44PacketWorldBorder$Action.LERP_SIZE;
    __sourceSharedArray1148_4[2] = net.minecraft.network.play.server.S44PacketWorldBorder$Action.SET_CENTER;
    __sourceSharedArray1148_4[3] = net.minecraft.network.play.server.S44PacketWorldBorder$Action.INITIALIZE;
    __sourceSharedArray1148_4[4] = net.minecraft.network.play.server.S44PacketWorldBorder$Action.SET_WARNING_TIME;
    __sourceSharedArray1148_4[5] = net.minecraft.network.play.server.S44PacketWorldBorder$Action.SET_WARNING_BLOCKS;
    return __sourceSharedArray1148_4;
}

}
