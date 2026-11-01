package net.minecraft.entity.passive;


class EntityRabbit$EnumMoveType extends sourcebuild.EnumConstructor<net.minecraft.entity.passive.EntityRabbit$EnumMoveType> {

public static net.minecraft.entity.passive.EntityRabbit$EnumMoveType NONE;

public static net.minecraft.entity.passive.EntityRabbit$EnumMoveType HOP;

public static net.minecraft.entity.passive.EntityRabbit$EnumMoveType STEP;

public static net.minecraft.entity.passive.EntityRabbit$EnumMoveType SPRINT;

public static net.minecraft.entity.passive.EntityRabbit$EnumMoveType ATTACK;

private float a;

private float b;

private int c;

private int d;

private static net.minecraft.entity.passive.EntityRabbit$EnumMoveType[] e;

private EntityRabbit$EnumMoveType(java.lang.String p0, int p1, float p2, float p3, int p4, int p5) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
    this.c = p4;
    this.d = p5;
}


private static void initialize() {
long local11_life4 = (((moom._a)(moom._c.a(((long)(3222141995531868136L)), ((long)(-4894372172955116240L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(234562590073454L))) ^ 111674488354859L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill1883_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1883_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1883_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1883_11 = new byte[8];
    (__sourceSpill1883_11)[0] = ((byte) ((int) (local11_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill1883_11)[local2_life12] = ((byte) ((int) ((local11_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation1883_13 = __sourceSpill1883_11;
    ((javax.crypto.Cipher)(__sourceSpill1883_8)).init(((int)(__sourceSpill1883_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1883_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1883_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life16 = new long[8];
    int local4_life17 = 0;
    java.lang.String local5_life18;
    int local6_life20 = ((java.lang.String)((local5_life18 = "¤(ö\003\003¨|NÚ$ªJ¤«¨\032\034Â4ÓþvS2^\037Æ¹ÀÊê\032Xå½\035I"))).length();
    int local3_life21 = 0;
    do {
        java.lang.String __sourceSpill1883_22 = local5_life18;
        int __sourceSpill1883_23 = local3_life21;
        local3_life21 += 8;
        byte[] local7_life26 = ((java.lang.String)(((java.lang.String)(__sourceSpill1883_22)).substring(((int)(__sourceSpill1883_23)), ((int)(local3_life21))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1883_27 = local0_life16;
        int __sourceSpill1883_28 = local4_life17;
        local4_life17 += 1;
        long local8_life29 = (((((((((((long) (local7_life26)[0]) & 255L) << 56) | ((((long) (local7_life26)[1]) & 255L) << 48)) | ((((long) (local7_life26)[2]) & 255L) << 40)) | ((((long) (local7_life26)[3]) & 255L) << 32)) | ((((long) (local7_life26)[4]) & 255L) << 24)) | ((((long) (local7_life26)[5]) & 255L) << 16)) | ((((long) (local7_life26)[6]) & 255L) << 8)) | (((long) (local7_life26)[7]) & 255L));
        byte[] __sourceSpill1883_30 = new byte[8];
        (__sourceSpill1883_30)[0] = ((byte) ((int) (local8_life29 >>> 56)));
        (__sourceSpill1883_30)[1] = ((byte) ((int) (local8_life29 >>> 48)));
        (__sourceSpill1883_30)[2] = ((byte) ((int) (local8_life29 >>> 40)));
        (__sourceSpill1883_30)[3] = ((byte) ((int) (local8_life29 >>> 32)));
        (__sourceSpill1883_30)[4] = ((byte) ((int) (local8_life29 >>> 24)));
        (__sourceSpill1883_30)[5] = ((byte) ((int) (local8_life29 >>> 16)));
        (__sourceSpill1883_30)[6] = ((byte) ((int) (local8_life29 >>> 8)));
        (__sourceSpill1883_30)[7] = ((byte) ((int) local8_life29));
        javax.crypto.Cipher __sourceSpill1883_31 = local1_life6;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill1883_31)).doFinal(((byte[])(__sourceSpill1883_30)));
        (__sourceSpill1883_27)[__sourceSpill1883_28] = (((((((((((long) (local10_life33)[0]) & 255L) << 56) | ((((long) (local10_life33)[1]) & 255L) << 48)) | ((((long) (local10_life33)[2]) & 255L) << 40)) | ((((long) (local10_life33)[3]) & 255L) << 32)) | ((((long) (local10_life33)[4]) & 255L) << 24)) | ((((long) (local10_life33)[5]) & 255L) << 16)) | ((((long) (local10_life33)[6]) & 255L) << 8)) | (((long) (local10_life33)[7]) & 255L));
    } while ((!(local3_life21 >= local6_life20)));
    local6_life20 = ((java.lang.String)((local5_life18 = "pû\000»4Ï\017g\021Ú\020õõt"))).length();
    local3_life21 = 0;
    do {
        java.lang.String __sourceSpill1883_35 = local5_life18;
        int __sourceSpill1883_36 = local3_life21;
        local3_life21 += 8;
        byte[] local7_life39 = ((java.lang.String)(((java.lang.String)(__sourceSpill1883_35)).substring(((int)(__sourceSpill1883_36)), ((int)(local3_life21))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1883_40 = local0_life16;
        int __sourceSpill1883_41 = local4_life17;
        local4_life17 += 1;
        long local8_life42 = (((((((((((long) (local7_life39)[0]) & 255L) << 56) | ((((long) (local7_life39)[1]) & 255L) << 48)) | ((((long) (local7_life39)[2]) & 255L) << 40)) | ((((long) (local7_life39)[3]) & 255L) << 32)) | ((((long) (local7_life39)[4]) & 255L) << 24)) | ((((long) (local7_life39)[5]) & 255L) << 16)) | ((((long) (local7_life39)[6]) & 255L) << 8)) | (((long) (local7_life39)[7]) & 255L));
        byte[] __sourceSpill1883_43 = new byte[8];
        (__sourceSpill1883_43)[0] = ((byte) ((int) (local8_life42 >>> 56)));
        (__sourceSpill1883_43)[1] = ((byte) ((int) (local8_life42 >>> 48)));
        (__sourceSpill1883_43)[2] = ((byte) ((int) (local8_life42 >>> 40)));
        (__sourceSpill1883_43)[3] = ((byte) ((int) (local8_life42 >>> 32)));
        (__sourceSpill1883_43)[4] = ((byte) ((int) (local8_life42 >>> 24)));
        (__sourceSpill1883_43)[5] = ((byte) ((int) (local8_life42 >>> 16)));
        (__sourceSpill1883_43)[6] = ((byte) ((int) (local8_life42 >>> 8)));
        (__sourceSpill1883_43)[7] = ((byte) ((int) local8_life42));
        javax.crypto.Cipher __sourceSpill1883_44 = local1_life6;
        byte[] local10_life46 = ((javax.crypto.Cipher)(__sourceSpill1883_44)).doFinal(((byte[])(__sourceSpill1883_43)));
        (__sourceSpill1883_40)[__sourceSpill1883_41] = (((((((((((long) (local10_life46)[0]) & 255L) << 56) | ((((long) (local10_life46)[1]) & 255L) << 48)) | ((((long) (local10_life46)[2]) & 255L) << 40)) | ((((long) (local10_life46)[3]) & 255L) << 32)) | ((((long) (local10_life46)[4]) & 255L) << 24)) | ((((long) (local10_life46)[5]) & 255L) << 16)) | ((((long) (local10_life46)[6]) & 255L) << 8)) | (((long) (local10_life46)[7]) & 255L));
    } while ((!(local3_life21 >= local6_life20)));
    NONE = ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(new net.minecraft.entity.passive.EntityRabbit$EnumMoveType("NONE", 0, 0x0.0p0f, 0x0.0p0f, ((int) (local0_life16)[4]), 1)));
    HOP = ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(new net.minecraft.entity.passive.EntityRabbit$EnumMoveType("HOP", 1, 0x1.99999ap-1f, 0x1.99999ap-3f, ((int) (local0_life16)[3]), ((int) (local0_life16)[6]))));
    STEP = ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(new net.minecraft.entity.passive.EntityRabbit$EnumMoveType("STEP", 2, 0x1.0p0f, 0x1.ccccccp-2f, ((int) (local0_life16)[7]), ((int) (local0_life16)[1]))));
    SPRINT = ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(new net.minecraft.entity.passive.EntityRabbit$EnumMoveType("SPRINT", 3, 0x1.cp0f, 0x1.99999ap-2f, 1, ((int) (local0_life16)[2]))));
    ATTACK = ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(new net.minecraft.entity.passive.EntityRabbit$EnumMoveType("ATTACK", 4, 0x1.0p1f, 0x1.666666p-1f, ((int) (local0_life16)[0]), ((int) (local0_life16)[5]))));
    e = ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType[])(net.minecraft.entity.passive.EntityRabbit$EnumMoveType.a__ArrayaV()));
}


public static net.minecraft.entity.passive.EntityRabbit$EnumMoveType[] values() {
return ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType[])(((net.minecraft.entity.passive.EntityRabbit$EnumMoveType[])(net.minecraft.entity.passive.EntityRabbit$EnumMoveType.e)).clone()));
}


public static net.minecraft.entity.passive.EntityRabbit$EnumMoveType valueOf(java.lang.String p0) {
return ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.entity.passive.EntityRabbit$EnumMoveType.class)), ((java.lang.String)(p0)))));
}


public float b() {
return this.b;
}


public int b__Int() {
return this.d;
}


public float a() {
return this.a;
}


private static net.minecraft.entity.passive.EntityRabbit$EnumMoveType[] a__ArrayaV() {
return new net.minecraft.entity.passive.EntityRabbit$EnumMoveType[] {net.minecraft.entity.passive.EntityRabbit$EnumMoveType.NONE, net.minecraft.entity.passive.EntityRabbit$EnumMoveType.HOP, net.minecraft.entity.passive.EntityRabbit$EnumMoveType.STEP, net.minecraft.entity.passive.EntityRabbit$EnumMoveType.SPRINT, net.minecraft.entity.passive.EntityRabbit$EnumMoveType.ATTACK};
}


public int a__Int() {
return this.c;
}

}
