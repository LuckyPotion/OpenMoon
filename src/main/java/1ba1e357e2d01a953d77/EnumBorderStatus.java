package net.minecraft.world.border;


public class EnumBorderStatus extends sourcebuild.EnumConstructor<net.minecraft.world.border.EnumBorderStatus> {

public static net.minecraft.world.border.EnumBorderStatus GROWING;

public static net.minecraft.world.border.EnumBorderStatus SHRINKING;

public static net.minecraft.world.border.EnumBorderStatus STATIONARY;

private int a;

private static net.minecraft.world.border.EnumBorderStatus[] b;

private EnumBorderStatus(java.lang.String p0, int p1, int p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local11_life4 = (((moom._a)(moom._c.a(((long)(585035179700427996L)), ((long)(1832096332293400361L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(149586252644957L))) ^ 20397880495137L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill1216_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1216_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1216_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1216_11 = new byte[8];
    (__sourceSpill1216_11)[0] = ((byte) ((int) (local11_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill1216_11)[local2_life12] = ((byte) ((int) ((local11_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation1216_13 = __sourceSpill1216_11;
    ((javax.crypto.Cipher)(__sourceSpill1216_8)).init(((int)(__sourceSpill1216_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1216_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1216_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life16 = new long[3];
    int local4_life17 = 0;
    java.lang.String local5_life18;
    int local6_life20 = ((java.lang.String)((local5_life18 = "·vTî6\"²ú\"\f\017¾µãýËKîÇ#ª"))).length();
    int local3_life21 = 0;
    do {
        java.lang.String __sourceSpill1216_22 = local5_life18;
        int __sourceSpill1216_23 = local3_life21;
        local3_life21 += 8;
        byte[] local7_life26 = ((java.lang.String)(((java.lang.String)(__sourceSpill1216_22)).substring(((int)(__sourceSpill1216_23)), ((int)(local3_life21))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1216_27 = local0_life16;
        int __sourceSpill1216_28 = local4_life17;
        local4_life17 += 1;
        long local8_life29 = (((((((((((long) (local7_life26)[0]) & 255L) << 56) | ((((long) (local7_life26)[1]) & 255L) << 48)) | ((((long) (local7_life26)[2]) & 255L) << 40)) | ((((long) (local7_life26)[3]) & 255L) << 32)) | ((((long) (local7_life26)[4]) & 255L) << 24)) | ((((long) (local7_life26)[5]) & 255L) << 16)) | ((((long) (local7_life26)[6]) & 255L) << 8)) | (((long) (local7_life26)[7]) & 255L));
        byte[] __sourceSpill1216_30 = new byte[8];
        (__sourceSpill1216_30)[0] = ((byte) ((int) (local8_life29 >>> 56)));
        (__sourceSpill1216_30)[1] = ((byte) ((int) (local8_life29 >>> 48)));
        (__sourceSpill1216_30)[2] = ((byte) ((int) (local8_life29 >>> 40)));
        (__sourceSpill1216_30)[3] = ((byte) ((int) (local8_life29 >>> 32)));
        (__sourceSpill1216_30)[4] = ((byte) ((int) (local8_life29 >>> 24)));
        (__sourceSpill1216_30)[5] = ((byte) ((int) (local8_life29 >>> 16)));
        (__sourceSpill1216_30)[6] = ((byte) ((int) (local8_life29 >>> 8)));
        (__sourceSpill1216_30)[7] = ((byte) ((int) local8_life29));
        javax.crypto.Cipher __sourceSpill1216_31 = local1_life6;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill1216_31)).doFinal(((byte[])(__sourceSpill1216_30)));
        (__sourceSpill1216_27)[__sourceSpill1216_28] = (((((((((((long) (local10_life33)[0]) & 255L) << 56) | ((((long) (local10_life33)[1]) & 255L) << 48)) | ((((long) (local10_life33)[2]) & 255L) << 40)) | ((((long) (local10_life33)[3]) & 255L) << 32)) | ((((long) (local10_life33)[4]) & 255L) << 24)) | ((((long) (local10_life33)[5]) & 255L) << 16)) | ((((long) (local10_life33)[6]) & 255L) << 8)) | (((long) (local10_life33)[7]) & 255L));
    } while ((!(local3_life21 >= local6_life20)));
    GROWING = ((net.minecraft.world.border.EnumBorderStatus)(new net.minecraft.world.border.EnumBorderStatus("GROWING", 0, ((int) (local0_life16)[1]))));
    SHRINKING = ((net.minecraft.world.border.EnumBorderStatus)(new net.minecraft.world.border.EnumBorderStatus("SHRINKING", 1, ((int) (local0_life16)[2]))));
    STATIONARY = ((net.minecraft.world.border.EnumBorderStatus)(new net.minecraft.world.border.EnumBorderStatus("STATIONARY", 2, ((int) (local0_life16)[0]))));
    b = ((net.minecraft.world.border.EnumBorderStatus[])(net.minecraft.world.border.EnumBorderStatus.a__ArraybG()));
}


public static net.minecraft.world.border.EnumBorderStatus[] values() {
return ((net.minecraft.world.border.EnumBorderStatus[])(((net.minecraft.world.border.EnumBorderStatus[])(net.minecraft.world.border.EnumBorderStatus.b)).clone()));
}


public static net.minecraft.world.border.EnumBorderStatus valueOf(java.lang.String p0) {
return ((net.minecraft.world.border.EnumBorderStatus)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.world.border.EnumBorderStatus.class)), ((java.lang.String)(p0)))));
}


private static net.minecraft.world.border.EnumBorderStatus[] a__ArraybG() {
return new net.minecraft.world.border.EnumBorderStatus[] {net.minecraft.world.border.EnumBorderStatus.GROWING, net.minecraft.world.border.EnumBorderStatus.SHRINKING, net.minecraft.world.border.EnumBorderStatus.STATIONARY};
}


public int a() {
return this.a;
}

}
