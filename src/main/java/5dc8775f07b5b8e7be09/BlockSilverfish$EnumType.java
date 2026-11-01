package net.minecraft.block;


public abstract class BlockSilverfish$EnumType extends sourcebuild.EnumConstructor<net.minecraft.block.BlockSilverfish$EnumType> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockSilverfish$EnumType STONE;

public static net.minecraft.block.BlockSilverfish$EnumType COBBLESTONE;

public static net.minecraft.block.BlockSilverfish$EnumType STONEBRICK;

public static net.minecraft.block.BlockSilverfish$EnumType MOSSY_STONEBRICK;

public static net.minecraft.block.BlockSilverfish$EnumType CRACKED_STONEBRICK;

public static net.minecraft.block.BlockSilverfish$EnumType CHISELED_STONEBRICK;

private static net.minecraft.block.BlockSilverfish$EnumType[] a;

private int b;

private java.lang.String c;

private java.lang.String d;

private static net.minecraft.block.BlockSilverfish$EnumType[] e;

private static long f;

private static long g;

private BlockSilverfish$EnumType(java.lang.String p0, int p1, int p2, java.lang.String p3) {
this(p0, p1, p2, p3, p3);
    return;
}


private BlockSilverfish$EnumType(java.lang.String p0, int p1, int p2, java.lang.String p3, java.lang.String p4) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p4;
}


private static void initialize() {
f = ((long)(((moom._a)(moom._c.a(((long)(3024223335176367229L)), ((long)(8957815216191828564L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(255492189167653L)))));
    long local0_life6 = (net.minecraft.block.BlockSilverfish$EnumType.f ^ 99248111448606L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1159_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1159_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1159_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1159_13 = new byte[8];
    (__sourceSpill1159_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1159_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1159_15 = __sourceSpill1159_13;
    ((javax.crypto.Cipher)(__sourceSpill1159_10)).init(((int)(__sourceSpill1159_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1159_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1159_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3728670191034008416L;
    byte[] __sourceSpill1159_19 = new byte[8];
    (__sourceSpill1159_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1159_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1159_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1159_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1159_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1159_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1159_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1159_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1159_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1159_20)).doFinal(((byte[])(__sourceSpill1159_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    STONE = ((net.minecraft.block.BlockSilverfish$EnumType)(new net.minecraft.block.BlockSilverfish$EnumType$1("STONE", 0, 0, "stone")));
    COBBLESTONE = ((net.minecraft.block.BlockSilverfish$EnumType)(new net.minecraft.block.BlockSilverfish$EnumType$2("COBBLESTONE", 1, 1, "cobblestone", "cobble")));
    STONEBRICK = ((net.minecraft.block.BlockSilverfish$EnumType)(new moom.ag("STONEBRICK", 2, 2, "stone_brick", "brick")));
    MOSSY_STONEBRICK = ((net.minecraft.block.BlockSilverfish$EnumType)(new moom.ah("MOSSY_STONEBRICK", 3, 3, "mossy_brick", "mossybrick")));
    CRACKED_STONEBRICK = ((net.minecraft.block.BlockSilverfish$EnumType)(new moom.ai("CRACKED_STONEBRICK", 4, 4, "cracked_brick", "crackedbrick")));
    CHISELED_STONEBRICK = ((net.minecraft.block.BlockSilverfish$EnumType)(new moom.aj("CHISELED_STONEBRICK", 5, 5, "chiseled_brick", "chiseledbrick")));
    e = ((net.minecraft.block.BlockSilverfish$EnumType[])(net.minecraft.block.BlockSilverfish$EnumType.a__Arrayad()));
    a = ((net.minecraft.block.BlockSilverfish$EnumType[])(new net.minecraft.block.BlockSilverfish$EnumType[(net.minecraft.block.BlockSilverfish$EnumType.values()).length]));
    net.minecraft.block.BlockSilverfish$EnumType[] local7_life35 = net.minecraft.block.BlockSilverfish$EnumType.values();
    int local8_life36 = (local7_life35).length;
    int local9_life37 = 0;
    while ((local9_life37 < local8_life36)) {
        net.minecraft.block.BlockSilverfish$EnumType local10_life38 = (local7_life35)[local9_life37];
        (net.minecraft.block.BlockSilverfish$EnumType.a)[((net.minecraft.block.BlockSilverfish$EnumType)(local10_life38)).a()] = local10_life38;
        local9_life37 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static net.minecraft.block.BlockSilverfish$EnumType[] values() {
return ((net.minecraft.block.BlockSilverfish$EnumType[])(((net.minecraft.block.BlockSilverfish$EnumType[])(net.minecraft.block.BlockSilverfish$EnumType.e)).clone()));
}


public static net.minecraft.block.BlockSilverfish$EnumType valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockSilverfish$EnumType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockSilverfish$EnumType.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.d;
}


public static net.minecraft.block.BlockSilverfish$EnumType a(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.BlockSilverfish$EnumType lexicalValue1469_34_0;
    int[] spill1469_0;
    net.minecraft.block.BlockSilverfish$EnumType spill1469_1;
    long life1_3;
    net.minecraft.block.BlockSilverfish$EnumType[] life4_6;
    int life5_9;
    int[] life3_10;
    int life6_12;
    net.minecraft.block.BlockSilverfish$EnumType life7_21;
    lexical_join_34: {
    lexical_join_33: {
    life1_3 = (net.minecraft.block.BlockSilverfish$EnumType.f ^ 93113889000759L);
    spill1469_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life4_6 = net.minecraft.block.BlockSilverfish$EnumType.values();
    life5_9 = (life4_6).length;
    life3_10 = spill1469_0;
    life6_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_31: {
    lexical_join_30: {
    if (!((life6_12 < life5_9))) {
        break lexical_join_33;
    }
    spill1469_1 = (life4_6)[life6_12];
    if (!((life3_10 != null))) {
        lexicalValue1469_34_0 = spill1469_1;
        break lexical_join_34;
    }
    life7_21 = spill1469_1;
    if (!((life3_10 != null))) {
        break lexical_join_31;
    }
    if (!((p0 == ((net.minecraft.block.BlockSilverfish$EnumType)(life7_21)).a__fE()))) {
        break lexical_join_30;
    }
    return life7_21;
    }
    life6_12 += 1;
    }
    if (!((life3_10 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue1469_34_0 = net.minecraft.block.BlockSilverfish$EnumType.STONE;
    }
    return lexicalValue1469_34_0;
}


private static net.minecraft.block.BlockSilverfish$EnumType[] a__Arrayad() {
long local0_life1 = (net.minecraft.block.BlockSilverfish$EnumType.f ^ 56562925506149L);
    net.minecraft.block.BlockSilverfish$EnumType[] __sourceSharedArray1027_4 = new net.minecraft.block.BlockSilverfish$EnumType[((int) net.minecraft.block.BlockSilverfish$EnumType.g)];
    __sourceSharedArray1027_4[0] = net.minecraft.block.BlockSilverfish$EnumType.STONE;
    __sourceSharedArray1027_4[1] = net.minecraft.block.BlockSilverfish$EnumType.COBBLESTONE;
    __sourceSharedArray1027_4[2] = net.minecraft.block.BlockSilverfish$EnumType.STONEBRICK;
    __sourceSharedArray1027_4[3] = net.minecraft.block.BlockSilverfish$EnumType.MOSSY_STONEBRICK;
    __sourceSharedArray1027_4[4] = net.minecraft.block.BlockSilverfish$EnumType.CRACKED_STONEBRICK;
    __sourceSharedArray1027_4[5] = net.minecraft.block.BlockSilverfish$EnumType.CHISELED_STONEBRICK;
    return __sourceSharedArray1027_4;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.b;
}


public static net.minecraft.block.BlockSilverfish$EnumType a(int p0) {
int forwardValue468_17_0;
    int spill468_0;
    int spill468_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.block.BlockSilverfish$EnumType.f ^ 23800355616928L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill468_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue468_17_0 = spill468_0;
        break forward_join_17;
    }
    if (!((spill468_0 >= 0))) {
        break forward_join_16;
    }
    spill468_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue468_17_0 = spill468_1;
        break forward_join_17;
    }
    if (!((spill468_1 >= (net.minecraft.block.BlockSilverfish$EnumType.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue468_17_0 = 0;
    }
    p0 = forwardValue468_17_0;
    }
    return (net.minecraft.block.BlockSilverfish$EnumType.a)[p0];
}


public java.lang.String a__String() {
return this.c;
}


public abstract net.minecraft.block.state.IBlockState a__fE();
}
