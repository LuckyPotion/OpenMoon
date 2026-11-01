package net.minecraft.entity;


public class EnumCreatureType extends sourcebuild.EnumConstructor<net.minecraft.entity.EnumCreatureType> {

public static net.minecraft.entity.EnumCreatureType MONSTER;

public static net.minecraft.entity.EnumCreatureType CREATURE;

public static net.minecraft.entity.EnumCreatureType AMBIENT;

public static net.minecraft.entity.EnumCreatureType WATER_CREATURE;

private java.lang.Class<? extends net.minecraft.entity.passive.IAnimals> a;

private int b;

private moom.fn c;

private boolean d;

private boolean e;

private static net.minecraft.entity.EnumCreatureType[] f;

private EnumCreatureType(java.lang.String p0, int p1, java.lang.Class<? extends net.minecraft.entity.passive.IAnimals> p2, int p3, moom.fn p4, boolean p5, boolean p6) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
    this.c = p4;
    this.d = p5;
    this.e = p6;
}


private static void initialize() {
long local11_life4 = (((moom._a)(moom._c.a(((long)(7456789818197335897L)), ((long)(8001124164797325376L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(75982767827629L))) ^ 98778879584967L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill1188_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1188_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1188_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1188_11 = new byte[8];
    (__sourceSpill1188_11)[0] = ((byte) ((int) (local11_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill1188_11)[local2_life12] = ((byte) ((int) ((local11_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation1188_13 = __sourceSpill1188_11;
    ((javax.crypto.Cipher)(__sourceSpill1188_8)).init(((int)(__sourceSpill1188_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1188_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1188_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life16 = new long[3];
    int local4_life17 = 0;
    java.lang.String local5_life18;
    int local6_life20 = ((java.lang.String)((local5_life18 = "cí\025½¦\034\\¤}¸$Ì£G\020jéaGIi:"))).length();
    int local3_life21 = 0;
    do {
        java.lang.String __sourceSpill1188_22 = local5_life18;
        int __sourceSpill1188_23 = local3_life21;
        local3_life21 += 8;
        byte[] local7_life26 = ((java.lang.String)(((java.lang.String)(__sourceSpill1188_22)).substring(((int)(__sourceSpill1188_23)), ((int)(local3_life21))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1188_27 = local0_life16;
        int __sourceSpill1188_28 = local4_life17;
        local4_life17 += 1;
        long local8_life29 = (((((((((((long) (local7_life26)[0]) & 255L) << 56) | ((((long) (local7_life26)[1]) & 255L) << 48)) | ((((long) (local7_life26)[2]) & 255L) << 40)) | ((((long) (local7_life26)[3]) & 255L) << 32)) | ((((long) (local7_life26)[4]) & 255L) << 24)) | ((((long) (local7_life26)[5]) & 255L) << 16)) | ((((long) (local7_life26)[6]) & 255L) << 8)) | (((long) (local7_life26)[7]) & 255L));
        byte[] __sourceSpill1188_30 = new byte[8];
        (__sourceSpill1188_30)[0] = ((byte) ((int) (local8_life29 >>> 56)));
        (__sourceSpill1188_30)[1] = ((byte) ((int) (local8_life29 >>> 48)));
        (__sourceSpill1188_30)[2] = ((byte) ((int) (local8_life29 >>> 40)));
        (__sourceSpill1188_30)[3] = ((byte) ((int) (local8_life29 >>> 32)));
        (__sourceSpill1188_30)[4] = ((byte) ((int) (local8_life29 >>> 24)));
        (__sourceSpill1188_30)[5] = ((byte) ((int) (local8_life29 >>> 16)));
        (__sourceSpill1188_30)[6] = ((byte) ((int) (local8_life29 >>> 8)));
        (__sourceSpill1188_30)[7] = ((byte) ((int) local8_life29));
        javax.crypto.Cipher __sourceSpill1188_31 = local1_life6;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill1188_31)).doFinal(((byte[])(__sourceSpill1188_30)));
        (__sourceSpill1188_27)[__sourceSpill1188_28] = (((((((((((long) (local10_life33)[0]) & 255L) << 56) | ((((long) (local10_life33)[1]) & 255L) << 48)) | ((((long) (local10_life33)[2]) & 255L) << 40)) | ((((long) (local10_life33)[3]) & 255L) << 32)) | ((((long) (local10_life33)[4]) & 255L) << 24)) | ((((long) (local10_life33)[5]) & 255L) << 16)) | ((((long) (local10_life33)[6]) & 255L) << 8)) | (((long) (local10_life33)[7]) & 255L));
    } while ((!(local3_life21 >= local6_life20)));
    MONSTER = ((net.minecraft.entity.EnumCreatureType)(new net.minecraft.entity.EnumCreatureType("MONSTER", 0, moom.vP.class, ((int) (local0_life16)[1]), moom.fn.a, false, false)));
    CREATURE = ((net.minecraft.entity.EnumCreatureType)(new net.minecraft.entity.EnumCreatureType("CREATURE", 1, moom.sK.class, ((int) (local0_life16)[0]), moom.fn.a, true, true)));
    AMBIENT = ((net.minecraft.entity.EnumCreatureType)(new net.minecraft.entity.EnumCreatureType("AMBIENT", 2, net.minecraft.entity.passive.EntityAmbientCreature.class, ((int) (local0_life16)[2]), moom.fn.a, true, false)));
    WATER_CREATURE = ((net.minecraft.entity.EnumCreatureType)(new net.minecraft.entity.EnumCreatureType("WATER_CREATURE", 3, moom.tk.class, 5, moom.fn.h, true, false)));
    f = ((net.minecraft.entity.EnumCreatureType[])(net.minecraft.entity.EnumCreatureType.a__ArrayaS()));
}


public static net.minecraft.entity.EnumCreatureType[] values() {
return ((net.minecraft.entity.EnumCreatureType[])(((net.minecraft.entity.EnumCreatureType[])(net.minecraft.entity.EnumCreatureType.f)).clone()));
}


public static net.minecraft.entity.EnumCreatureType valueOf(java.lang.String p0) {
return ((net.minecraft.entity.EnumCreatureType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.entity.EnumCreatureType.class)), ((java.lang.String)(p0)))));
}


public boolean b() {
return ((((this.e) ? 1 : 0)) != 0);
}


private static net.minecraft.entity.EnumCreatureType[] a__ArrayaS() {
return new net.minecraft.entity.EnumCreatureType[] {net.minecraft.entity.EnumCreatureType.MONSTER, net.minecraft.entity.EnumCreatureType.CREATURE, net.minecraft.entity.EnumCreatureType.AMBIENT, net.minecraft.entity.EnumCreatureType.WATER_CREATURE};
}


public int a() {
return this.b;
}


public java.lang.Class<? extends net.minecraft.entity.passive.IAnimals> a__Class() {
return this.a;
}


public boolean a__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}

}
