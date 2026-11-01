package net.minecraft.server.network;


class NetHandlerLoginServer$LoginState extends sourcebuild.EnumConstructor<net.minecraft.server.network.NetHandlerLoginServer$LoginState> {

public static net.minecraft.server.network.NetHandlerLoginServer$LoginState HELLO;

public static net.minecraft.server.network.NetHandlerLoginServer$LoginState KEY;

public static net.minecraft.server.network.NetHandlerLoginServer$LoginState AUTHENTICATING;

public static net.minecraft.server.network.NetHandlerLoginServer$LoginState READY_TO_ACCEPT;

public static net.minecraft.server.network.NetHandlerLoginServer$LoginState DELAY_ACCEPT;

public static net.minecraft.server.network.NetHandlerLoginServer$LoginState ACCEPTED;

private static net.minecraft.server.network.NetHandlerLoginServer$LoginState[] a;

private static long b;

private static long c;

private NetHandlerLoginServer$LoginState(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(873716745511352181L)), ((long)(2776336349725698937L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(212600348725363L)))));
    long local0_life6 = (net.minecraft.server.network.NetHandlerLoginServer$LoginState.b ^ 63847370385468L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1207_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1207_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1207_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1207_13 = new byte[8];
    (__sourceSpill1207_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1207_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1207_15 = __sourceSpill1207_13;
    ((javax.crypto.Cipher)(__sourceSpill1207_10)).init(((int)(__sourceSpill1207_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1207_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1207_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6009240245615686780L;
    byte[] __sourceSpill1207_19 = new byte[8];
    (__sourceSpill1207_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1207_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1207_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1207_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1207_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1207_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1207_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1207_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1207_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1207_20)).doFinal(((byte[])(__sourceSpill1207_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    HELLO = ((net.minecraft.server.network.NetHandlerLoginServer$LoginState)(new net.minecraft.server.network.NetHandlerLoginServer$LoginState("HELLO", 0)));
    KEY = ((net.minecraft.server.network.NetHandlerLoginServer$LoginState)(new net.minecraft.server.network.NetHandlerLoginServer$LoginState("KEY", 1)));
    AUTHENTICATING = ((net.minecraft.server.network.NetHandlerLoginServer$LoginState)(new net.minecraft.server.network.NetHandlerLoginServer$LoginState("AUTHENTICATING", 2)));
    READY_TO_ACCEPT = ((net.minecraft.server.network.NetHandlerLoginServer$LoginState)(new net.minecraft.server.network.NetHandlerLoginServer$LoginState("READY_TO_ACCEPT", 3)));
    DELAY_ACCEPT = ((net.minecraft.server.network.NetHandlerLoginServer$LoginState)(new net.minecraft.server.network.NetHandlerLoginServer$LoginState("DELAY_ACCEPT", 4)));
    ACCEPTED = ((net.minecraft.server.network.NetHandlerLoginServer$LoginState)(new net.minecraft.server.network.NetHandlerLoginServer$LoginState("ACCEPTED", 5)));
    a = ((net.minecraft.server.network.NetHandlerLoginServer$LoginState[])(net.minecraft.server.network.NetHandlerLoginServer$LoginState.a()));
}


public static net.minecraft.server.network.NetHandlerLoginServer$LoginState[] values() {
return ((net.minecraft.server.network.NetHandlerLoginServer$LoginState[])(((net.minecraft.server.network.NetHandlerLoginServer$LoginState[])(net.minecraft.server.network.NetHandlerLoginServer$LoginState.a)).clone()));
}


public static net.minecraft.server.network.NetHandlerLoginServer$LoginState valueOf(java.lang.String p0) {
return ((net.minecraft.server.network.NetHandlerLoginServer$LoginState)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.server.network.NetHandlerLoginServer$LoginState.class)), ((java.lang.String)(p0)))));
}


private static net.minecraft.server.network.NetHandlerLoginServer$LoginState[] a() {
long local0_life1 = (net.minecraft.server.network.NetHandlerLoginServer$LoginState.b ^ 111148897663621L);
    net.minecraft.server.network.NetHandlerLoginServer$LoginState[] __sourceSharedArray1154_4 = new net.minecraft.server.network.NetHandlerLoginServer$LoginState[((int) net.minecraft.server.network.NetHandlerLoginServer$LoginState.c)];
    __sourceSharedArray1154_4[0] = net.minecraft.server.network.NetHandlerLoginServer$LoginState.HELLO;
    __sourceSharedArray1154_4[1] = net.minecraft.server.network.NetHandlerLoginServer$LoginState.KEY;
    __sourceSharedArray1154_4[2] = net.minecraft.server.network.NetHandlerLoginServer$LoginState.AUTHENTICATING;
    __sourceSharedArray1154_4[3] = net.minecraft.server.network.NetHandlerLoginServer$LoginState.READY_TO_ACCEPT;
    __sourceSharedArray1154_4[4] = net.minecraft.server.network.NetHandlerLoginServer$LoginState.DELAY_ACCEPT;
    __sourceSharedArray1154_4[5] = net.minecraft.server.network.NetHandlerLoginServer$LoginState.ACCEPTED;
    return __sourceSharedArray1154_4;
}

}
