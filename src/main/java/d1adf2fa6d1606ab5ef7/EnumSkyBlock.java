package net.minecraft.world;


public class EnumSkyBlock extends sourcebuild.EnumConstructor<net.minecraft.world.EnumSkyBlock> {

public static net.minecraft.world.EnumSkyBlock SKY;

public static net.minecraft.world.EnumSkyBlock BLOCK;

public int defaultLightValue;

private static net.minecraft.world.EnumSkyBlock[] a;

private EnumSkyBlock(java.lang.String p0, int p1, int p2) {
super(p0, p1);
    this.defaultLightValue = p2;
}


private static void initialize() {
long local6_life4 = (((moom._a)(moom._c.a(((long)(-1639816277567500199L)), ((long)(9053598789373192524L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(112874122267241L))) ^ 34265136204919L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill1213_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1213_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1213_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1213_11 = new byte[8];
    (__sourceSpill1213_11)[0] = ((byte) ((int) (local6_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill1213_11)[local2_life12] = ((byte) ((int) ((local6_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation1213_13 = __sourceSpill1213_11;
    ((javax.crypto.Cipher)(__sourceSpill1213_8)).init(((int)(__sourceSpill1213_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1213_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1213_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local3_life16 = 5349855949309314617L;
    byte[] __sourceSpill1213_17 = new byte[8];
    (__sourceSpill1213_17)[0] = ((byte) ((int) (local3_life16 >>> 56)));
    (__sourceSpill1213_17)[1] = ((byte) ((int) (local3_life16 >>> 48)));
    (__sourceSpill1213_17)[2] = ((byte) ((int) (local3_life16 >>> 40)));
    (__sourceSpill1213_17)[3] = ((byte) ((int) (local3_life16 >>> 32)));
    (__sourceSpill1213_17)[4] = ((byte) ((int) (local3_life16 >>> 24)));
    (__sourceSpill1213_17)[5] = ((byte) ((int) (local3_life16 >>> 16)));
    (__sourceSpill1213_17)[6] = ((byte) ((int) (local3_life16 >>> 8)));
    (__sourceSpill1213_17)[7] = ((byte) ((int) local3_life16));
    javax.crypto.Cipher __sourceSpill1213_18 = local1_life6;
    byte[] local5_life20 = ((javax.crypto.Cipher)(__sourceSpill1213_18)).doFinal(((byte[])(__sourceSpill1213_17)));
    long local0_life21 = (((((((((((long) (local5_life20)[0]) & 255L) << 56) | ((((long) (local5_life20)[1]) & 255L) << 48)) | ((((long) (local5_life20)[2]) & 255L) << 40)) | ((((long) (local5_life20)[3]) & 255L) << 32)) | ((((long) (local5_life20)[4]) & 255L) << 24)) | ((((long) (local5_life20)[5]) & 255L) << 16)) | ((((long) (local5_life20)[6]) & 255L) << 8)) | (((long) (local5_life20)[7]) & 255L));
    SKY = ((net.minecraft.world.EnumSkyBlock)(new net.minecraft.world.EnumSkyBlock("SKY", 0, ((int) local0_life21))));
    BLOCK = ((net.minecraft.world.EnumSkyBlock)(new net.minecraft.world.EnumSkyBlock("BLOCK", 1, 0)));
    a = ((net.minecraft.world.EnumSkyBlock[])(net.minecraft.world.EnumSkyBlock.a()));
}


public static net.minecraft.world.EnumSkyBlock[] values() {
return ((net.minecraft.world.EnumSkyBlock[])(((net.minecraft.world.EnumSkyBlock[])(net.minecraft.world.EnumSkyBlock.a)).clone()));
}


public static net.minecraft.world.EnumSkyBlock valueOf(java.lang.String p0) {
return ((net.minecraft.world.EnumSkyBlock)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.world.EnumSkyBlock.class)), ((java.lang.String)(p0)))));
}


private static net.minecraft.world.EnumSkyBlock[] a() {
return new net.minecraft.world.EnumSkyBlock[] {net.minecraft.world.EnumSkyBlock.SKY, net.minecraft.world.EnumSkyBlock.BLOCK};
}

}
