package net.minecraft.block;


public class BlockDoublePlant$EnumPlantType extends sourcebuild.EnumConstructor<net.minecraft.block.BlockDoublePlant$EnumPlantType> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockDoublePlant$EnumPlantType SUNFLOWER;

public static net.minecraft.block.BlockDoublePlant$EnumPlantType SYRINGA;

public static net.minecraft.block.BlockDoublePlant$EnumPlantType GRASS;

public static net.minecraft.block.BlockDoublePlant$EnumPlantType FERN;

public static net.minecraft.block.BlockDoublePlant$EnumPlantType ROSE;

public static net.minecraft.block.BlockDoublePlant$EnumPlantType PAEONIA;

private static net.minecraft.block.BlockDoublePlant$EnumPlantType[] a;

private int b;

private java.lang.String c;

private java.lang.String d;

private static net.minecraft.block.BlockDoublePlant$EnumPlantType[] e;

private static long f;

private static long g;

private BlockDoublePlant$EnumPlantType(java.lang.String p0, int p1, int p2, java.lang.String p3) {
this(p0, p1, p2, p3, p3);
    return;
}


private BlockDoublePlant$EnumPlantType(java.lang.String p0, int p1, int p2, java.lang.String p3, java.lang.String p4) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p4;
}


private static void initialize() {
f = ((long)(((moom._a)(moom._c.a(((long)(-4878352852213881023L)), ((long)(2223775490829534909L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(268381082427693L)))));
    long local0_life6 = (net.minecraft.block.BlockDoublePlant$EnumPlantType.f ^ 110528018682442L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1154_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1154_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1154_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1154_13 = new byte[8];
    (__sourceSpill1154_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1154_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1154_15 = __sourceSpill1154_13;
    ((javax.crypto.Cipher)(__sourceSpill1154_10)).init(((int)(__sourceSpill1154_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1154_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1154_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7214901658839685138L;
    byte[] __sourceSpill1154_19 = new byte[8];
    (__sourceSpill1154_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1154_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1154_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1154_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1154_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1154_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1154_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1154_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1154_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1154_20)).doFinal(((byte[])(__sourceSpill1154_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    SUNFLOWER = ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(new net.minecraft.block.BlockDoublePlant$EnumPlantType("SUNFLOWER", 0, 0, "sunflower")));
    SYRINGA = ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(new net.minecraft.block.BlockDoublePlant$EnumPlantType("SYRINGA", 1, 1, "syringa")));
    GRASS = ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(new net.minecraft.block.BlockDoublePlant$EnumPlantType("GRASS", 2, 2, "double_grass", "grass")));
    FERN = ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(new net.minecraft.block.BlockDoublePlant$EnumPlantType("FERN", 3, 3, "double_fern", "fern")));
    ROSE = ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(new net.minecraft.block.BlockDoublePlant$EnumPlantType("ROSE", 4, 4, "double_rose", "rose")));
    PAEONIA = ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(new net.minecraft.block.BlockDoublePlant$EnumPlantType("PAEONIA", 5, 5, "paeonia")));
    e = ((net.minecraft.block.BlockDoublePlant$EnumPlantType[])(net.minecraft.block.BlockDoublePlant$EnumPlantType.a__ArrayL()));
    a = ((net.minecraft.block.BlockDoublePlant$EnumPlantType[])(new net.minecraft.block.BlockDoublePlant$EnumPlantType[(net.minecraft.block.BlockDoublePlant$EnumPlantType.values()).length]));
    net.minecraft.block.BlockDoublePlant$EnumPlantType[] local7_life35 = net.minecraft.block.BlockDoublePlant$EnumPlantType.values();
    int local8_life36 = (local7_life35).length;
    int local9_life37 = 0;
    while ((local9_life37 < local8_life36)) {
        net.minecraft.block.BlockDoublePlant$EnumPlantType local10_life38 = (local7_life35)[local9_life37];
        (net.minecraft.block.BlockDoublePlant$EnumPlantType.a)[((net.minecraft.block.BlockDoublePlant$EnumPlantType)(local10_life38)).a()] = local10_life38;
        local9_life37 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static net.minecraft.block.BlockDoublePlant$EnumPlantType[] values() {
return ((net.minecraft.block.BlockDoublePlant$EnumPlantType[])(((net.minecraft.block.BlockDoublePlant$EnumPlantType[])(net.minecraft.block.BlockDoublePlant$EnumPlantType.e)).clone()));
}


public static net.minecraft.block.BlockDoublePlant$EnumPlantType valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockDoublePlant$EnumPlantType.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.d;
}


private static net.minecraft.block.BlockDoublePlant$EnumPlantType[] a__ArrayL() {
long local0_life1 = (net.minecraft.block.BlockDoublePlant$EnumPlantType.f ^ 101746351312350L);
    net.minecraft.block.BlockDoublePlant$EnumPlantType[] __sourceSharedArray1019_4 = new net.minecraft.block.BlockDoublePlant$EnumPlantType[((int) net.minecraft.block.BlockDoublePlant$EnumPlantType.g)];
    __sourceSharedArray1019_4[0] = net.minecraft.block.BlockDoublePlant$EnumPlantType.SUNFLOWER;
    __sourceSharedArray1019_4[1] = net.minecraft.block.BlockDoublePlant$EnumPlantType.SYRINGA;
    __sourceSharedArray1019_4[2] = net.minecraft.block.BlockDoublePlant$EnumPlantType.GRASS;
    __sourceSharedArray1019_4[3] = net.minecraft.block.BlockDoublePlant$EnumPlantType.FERN;
    __sourceSharedArray1019_4[4] = net.minecraft.block.BlockDoublePlant$EnumPlantType.ROSE;
    __sourceSharedArray1019_4[5] = net.minecraft.block.BlockDoublePlant$EnumPlantType.PAEONIA;
    return __sourceSharedArray1019_4;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a__String() {
return this.c;
}


public static net.minecraft.block.BlockDoublePlant$EnumPlantType a(int p0) {
int forwardValue4666_17_0;
    int spill4666_0;
    int spill4666_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.block.BlockDoublePlant$EnumPlantType.f ^ 11848154264780L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4666_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue4666_17_0 = spill4666_0;
        break forward_join_17;
    }
    if (!((spill4666_0 >= 0))) {
        break forward_join_16;
    }
    spill4666_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue4666_17_0 = spill4666_1;
        break forward_join_17;
    }
    if (!((spill4666_1 >= (net.minecraft.block.BlockDoublePlant$EnumPlantType.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue4666_17_0 = 0;
    }
    p0 = forwardValue4666_17_0;
    }
    return (net.minecraft.block.BlockDoublePlant$EnumPlantType.a)[p0];
}


public int a() {
return this.b;
}

}
