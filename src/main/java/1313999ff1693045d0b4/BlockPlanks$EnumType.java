package net.minecraft.block;


public class BlockPlanks$EnumType extends sourcebuild.EnumConstructor<net.minecraft.block.BlockPlanks$EnumType> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockPlanks$EnumType OAK;

public static net.minecraft.block.BlockPlanks$EnumType SPRUCE;

public static net.minecraft.block.BlockPlanks$EnumType BIRCH;

public static net.minecraft.block.BlockPlanks$EnumType JUNGLE;

public static net.minecraft.block.BlockPlanks$EnumType ACACIA;

public static net.minecraft.block.BlockPlanks$EnumType DARK_OAK;

private static net.minecraft.block.BlockPlanks$EnumType[] a;

private int b;

private java.lang.String c;

private java.lang.String d;

private moom.fm e;

private static net.minecraft.block.BlockPlanks$EnumType[] f;

private static int[] g;

private static long h;

private static long i;

private BlockPlanks$EnumType(java.lang.String p0, int p1, int p2, java.lang.String p3, moom.fm p4) {
this(p0, p1, p2, p3, p3, p4);
    return;
}


private BlockPlanks$EnumType(java.lang.String p0, int p1, int p2, java.lang.String p3, java.lang.String p4, moom.fm p5) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p4;
    this.e = p5;
}


private static void initialize() {
h = ((long)(((moom._a)(moom._c.a(((long)(238706948054625940L)), ((long)(-7995598059244905251L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(75692574961118L)))));
    int[] __sourceSpill1158_6 = new int[4];
    long local0_life7 = (net.minecraft.block.BlockPlanks$EnumType.h ^ 63106559377490L);
    net.minecraft.block.BlockPlanks$EnumType.b(((int[])(__sourceSpill1158_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill1158_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1158_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1158_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1158_15 = new byte[8];
    (__sourceSpill1158_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill1158_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation1158_17 = __sourceSpill1158_15;
    ((javax.crypto.Cipher)(__sourceSpill1158_12)).init(((int)(__sourceSpill1158_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1158_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1158_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = -3624011632639310581L;
    byte[] __sourceSpill1158_21 = new byte[8];
    (__sourceSpill1158_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill1158_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill1158_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill1158_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill1158_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill1158_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill1158_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill1158_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill1158_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill1158_22)).doFinal(((byte[])(__sourceSpill1158_21)));
    i = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
    OAK = ((net.minecraft.block.BlockPlanks$EnumType)(new net.minecraft.block.BlockPlanks$EnumType("OAK", 0, 0, "oak", moom.fm.o)));
    SPRUCE = ((net.minecraft.block.BlockPlanks$EnumType)(new net.minecraft.block.BlockPlanks$EnumType("SPRUCE", 1, 1, "spruce", moom.fm.J)));
    BIRCH = ((net.minecraft.block.BlockPlanks$EnumType)(new net.minecraft.block.BlockPlanks$EnumType("BIRCH", 2, 2, "birch", moom.fm.d)));
    JUNGLE = ((net.minecraft.block.BlockPlanks$EnumType)(new net.minecraft.block.BlockPlanks$EnumType("JUNGLE", 3, 3, "jungle", moom.fm.l)));
    ACACIA = ((net.minecraft.block.BlockPlanks$EnumType)(new net.minecraft.block.BlockPlanks$EnumType("ACACIA", 4, 4, "acacia", moom.fm.q)));
    DARK_OAK = ((net.minecraft.block.BlockPlanks$EnumType)(new net.minecraft.block.BlockPlanks$EnumType("DARK_OAK", 5, 5, "dark_oak", "big_oak", moom.fm.B)));
    f = ((net.minecraft.block.BlockPlanks$EnumType[])(net.minecraft.block.BlockPlanks$EnumType.a__ArrayT()));
    a = ((net.minecraft.block.BlockPlanks$EnumType[])(new net.minecraft.block.BlockPlanks$EnumType[(net.minecraft.block.BlockPlanks$EnumType.values()).length]));
    net.minecraft.block.BlockPlanks$EnumType[] local7_life43 = net.minecraft.block.BlockPlanks$EnumType.values();
    int local8_life44 = (local7_life43).length;
    int local9_life45 = 0;
    while ((local9_life45 < local8_life44)) {
        net.minecraft.block.BlockPlanks$EnumType local10_life46 = (local7_life43)[local9_life45];
        (net.minecraft.block.BlockPlanks$EnumType.a)[((net.minecraft.block.BlockPlanks$EnumType)(local10_life46)).a()] = local10_life46;
        local9_life45 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static net.minecraft.block.BlockPlanks$EnumType[] values() {
return ((net.minecraft.block.BlockPlanks$EnumType[])(((net.minecraft.block.BlockPlanks$EnumType[])(net.minecraft.block.BlockPlanks$EnumType.f)).clone()));
}


public static net.minecraft.block.BlockPlanks$EnumType valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockPlanks$EnumType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockPlanks$EnumType.class)), ((java.lang.String)(p0)))));
}


public static void b(int[] p0) {
g = ((int[])(p0));
    return;
}


public java.lang.String b() {
return this.d;
}


public static int[] b__ArrayInt() {
return net.minecraft.block.BlockPlanks$EnumType.g;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static net.minecraft.block.BlockPlanks$EnumType[] a__ArrayT() {
long local0_life1 = (net.minecraft.block.BlockPlanks$EnumType.h ^ 107465679851664L);
    net.minecraft.block.BlockPlanks$EnumType[] __sourceSharedArray1025_4 = new net.minecraft.block.BlockPlanks$EnumType[((int) net.minecraft.block.BlockPlanks$EnumType.i)];
    __sourceSharedArray1025_4[0] = net.minecraft.block.BlockPlanks$EnumType.OAK;
    __sourceSharedArray1025_4[1] = net.minecraft.block.BlockPlanks$EnumType.SPRUCE;
    __sourceSharedArray1025_4[2] = net.minecraft.block.BlockPlanks$EnumType.BIRCH;
    __sourceSharedArray1025_4[3] = net.minecraft.block.BlockPlanks$EnumType.JUNGLE;
    __sourceSharedArray1025_4[4] = net.minecraft.block.BlockPlanks$EnumType.ACACIA;
    __sourceSharedArray1025_4[5] = net.minecraft.block.BlockPlanks$EnumType.DARK_OAK;
    return __sourceSharedArray1025_4;
}


public int a() {
return this.b;
}


public moom.fm a__fm() {
return this.e;
}


public static net.minecraft.block.BlockPlanks$EnumType a(int p0) {
int forwardValue4720_17_0;
    int spill4720_0;
    int spill4720_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.block.BlockPlanks$EnumType.h ^ 115719609824209L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4720_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue4720_17_0 = spill4720_0;
        break forward_join_17;
    }
    if (!((spill4720_0 >= 0))) {
        break forward_join_16;
    }
    spill4720_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue4720_17_0 = spill4720_1;
        break forward_join_17;
    }
    if (!((spill4720_1 >= (net.minecraft.block.BlockPlanks$EnumType.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue4720_17_0 = 0;
    }
    p0 = forwardValue4720_17_0;
    }
    return (net.minecraft.block.BlockPlanks$EnumType.a)[p0];
}


public java.lang.String a__String() {
return this.c;
}

}
