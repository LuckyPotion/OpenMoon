package net.minecraft.network.play.client;


public class C07PacketPlayerDigging$Action extends sourcebuild.EnumConstructor<net.minecraft.network.play.client.C07PacketPlayerDigging$Action> {

public static net.minecraft.network.play.client.C07PacketPlayerDigging$Action START_DESTROY_BLOCK;

public static net.minecraft.network.play.client.C07PacketPlayerDigging$Action ABORT_DESTROY_BLOCK;

public static net.minecraft.network.play.client.C07PacketPlayerDigging$Action STOP_DESTROY_BLOCK;

public static net.minecraft.network.play.client.C07PacketPlayerDigging$Action DROP_ALL_ITEMS;

public static net.minecraft.network.play.client.C07PacketPlayerDigging$Action DROP_ITEM;

public static net.minecraft.network.play.client.C07PacketPlayerDigging$Action RELEASE_USE_ITEM;

private static net.minecraft.network.play.client.C07PacketPlayerDigging$Action[] a;

private static long b;

private static long c;

private C07PacketPlayerDigging$Action(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(-8392960754098397015L)), ((long)(-6591669827634400348L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(99125638940182L)))));
    long local0_life6 = (net.minecraft.network.play.client.C07PacketPlayerDigging$Action.b ^ 114547885609846L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1202_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1202_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1202_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1202_13 = new byte[8];
    (__sourceSpill1202_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1202_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1202_15 = __sourceSpill1202_13;
    ((javax.crypto.Cipher)(__sourceSpill1202_10)).init(((int)(__sourceSpill1202_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1202_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1202_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4328619835714686813L;
    byte[] __sourceSpill1202_19 = new byte[8];
    (__sourceSpill1202_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1202_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1202_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1202_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1202_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1202_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1202_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1202_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1202_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1202_20)).doFinal(((byte[])(__sourceSpill1202_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    START_DESTROY_BLOCK = ((net.minecraft.network.play.client.C07PacketPlayerDigging$Action)(new net.minecraft.network.play.client.C07PacketPlayerDigging$Action("START_DESTROY_BLOCK", 0)));
    ABORT_DESTROY_BLOCK = ((net.minecraft.network.play.client.C07PacketPlayerDigging$Action)(new net.minecraft.network.play.client.C07PacketPlayerDigging$Action("ABORT_DESTROY_BLOCK", 1)));
    STOP_DESTROY_BLOCK = ((net.minecraft.network.play.client.C07PacketPlayerDigging$Action)(new net.minecraft.network.play.client.C07PacketPlayerDigging$Action("STOP_DESTROY_BLOCK", 2)));
    DROP_ALL_ITEMS = ((net.minecraft.network.play.client.C07PacketPlayerDigging$Action)(new net.minecraft.network.play.client.C07PacketPlayerDigging$Action("DROP_ALL_ITEMS", 3)));
    DROP_ITEM = ((net.minecraft.network.play.client.C07PacketPlayerDigging$Action)(new net.minecraft.network.play.client.C07PacketPlayerDigging$Action("DROP_ITEM", 4)));
    RELEASE_USE_ITEM = ((net.minecraft.network.play.client.C07PacketPlayerDigging$Action)(new net.minecraft.network.play.client.C07PacketPlayerDigging$Action("RELEASE_USE_ITEM", 5)));
    a = ((net.minecraft.network.play.client.C07PacketPlayerDigging$Action[])(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.a()));
}


public static net.minecraft.network.play.client.C07PacketPlayerDigging$Action[] values() {
return ((net.minecraft.network.play.client.C07PacketPlayerDigging$Action[])(((net.minecraft.network.play.client.C07PacketPlayerDigging$Action[])(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.a)).clone()));
}


public static net.minecraft.network.play.client.C07PacketPlayerDigging$Action valueOf(java.lang.String p0) {
return ((net.minecraft.network.play.client.C07PacketPlayerDigging$Action)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.class)), ((java.lang.String)(p0)))));
}


private static net.minecraft.network.play.client.C07PacketPlayerDigging$Action[] a() {
long local0_life1 = (net.minecraft.network.play.client.C07PacketPlayerDigging$Action.b ^ 23559231092437L);
    net.minecraft.network.play.client.C07PacketPlayerDigging$Action[] __sourceSharedArray1146_4 = new net.minecraft.network.play.client.C07PacketPlayerDigging$Action[((int) net.minecraft.network.play.client.C07PacketPlayerDigging$Action.c)];
    __sourceSharedArray1146_4[0] = net.minecraft.network.play.client.C07PacketPlayerDigging$Action.START_DESTROY_BLOCK;
    __sourceSharedArray1146_4[1] = net.minecraft.network.play.client.C07PacketPlayerDigging$Action.ABORT_DESTROY_BLOCK;
    __sourceSharedArray1146_4[2] = net.minecraft.network.play.client.C07PacketPlayerDigging$Action.STOP_DESTROY_BLOCK;
    __sourceSharedArray1146_4[3] = net.minecraft.network.play.client.C07PacketPlayerDigging$Action.DROP_ALL_ITEMS;
    __sourceSharedArray1146_4[4] = net.minecraft.network.play.client.C07PacketPlayerDigging$Action.DROP_ITEM;
    __sourceSharedArray1146_4[5] = net.minecraft.network.play.client.C07PacketPlayerDigging$Action.RELEASE_USE_ITEM;
    return __sourceSharedArray1146_4;
}

}
