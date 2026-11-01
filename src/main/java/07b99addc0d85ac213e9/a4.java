package moom;


public class a4 extends sourcebuild.EnumConstructor<moom.a4> {

public static moom.a4 WOOD;

public static moom.a4 STONE;

public static moom.a4 IRON;

public static moom.a4 EMERALD;

public static moom.a4 GOLD;

private int a;

private int b;

private float c;

private float d;

private int e;

private static moom.a4[] f;

private static long g;

private a4(java.lang.String p0, int p1, int p2, int p3, float p4, float p5, int p6) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
    this.c = p4;
    this.d = p5;
    this.e = p6;
}


private static void initialize() {
g = ((long)(((moom._a)(moom._c.a(((long)(-8627498452859725632L)), ((long)(5365528893842307377L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(234124595409640L)))));
    long local11_life6 = (moom.a4.g ^ 85790665121745L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill1087_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1087_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1087_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1087_13 = new byte[8];
    (__sourceSpill1087_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill1087_13)[local2_life14] = ((byte) ((int) ((local11_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation1087_15 = __sourceSpill1087_13;
    ((javax.crypto.Cipher)(__sourceSpill1087_10)).init(((int)(__sourceSpill1087_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1087_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1087_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life18 = new long[9];
    int local4_life19 = 0;
    java.lang.String local5_life20;
    int local6_life22 = ((java.lang.String)((local5_life20 = "çeë\020Y6}>häóÖ®t>\007H8izëÈpäø<ñÍ%}wïXoß\030\000Þ Gåã`DÝV"))).length();
    int local3_life23 = 0;
    do {
        java.lang.String __sourceSpill1087_24 = local5_life20;
        int __sourceSpill1087_25 = local3_life23;
        local3_life23 += 8;
        byte[] local7_life28 = ((java.lang.String)(((java.lang.String)(__sourceSpill1087_24)).substring(((int)(__sourceSpill1087_25)), ((int)(local3_life23))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1087_29 = local0_life18;
        int __sourceSpill1087_30 = local4_life19;
        local4_life19 += 1;
        long local8_life31 = (((((((((((long) (local7_life28)[0]) & 255L) << 56) | ((((long) (local7_life28)[1]) & 255L) << 48)) | ((((long) (local7_life28)[2]) & 255L) << 40)) | ((((long) (local7_life28)[3]) & 255L) << 32)) | ((((long) (local7_life28)[4]) & 255L) << 24)) | ((((long) (local7_life28)[5]) & 255L) << 16)) | ((((long) (local7_life28)[6]) & 255L) << 8)) | (((long) (local7_life28)[7]) & 255L));
        byte[] __sourceSpill1087_32 = new byte[8];
        (__sourceSpill1087_32)[0] = ((byte) ((int) (local8_life31 >>> 56)));
        (__sourceSpill1087_32)[1] = ((byte) ((int) (local8_life31 >>> 48)));
        (__sourceSpill1087_32)[2] = ((byte) ((int) (local8_life31 >>> 40)));
        (__sourceSpill1087_32)[3] = ((byte) ((int) (local8_life31 >>> 32)));
        (__sourceSpill1087_32)[4] = ((byte) ((int) (local8_life31 >>> 24)));
        (__sourceSpill1087_32)[5] = ((byte) ((int) (local8_life31 >>> 16)));
        (__sourceSpill1087_32)[6] = ((byte) ((int) (local8_life31 >>> 8)));
        (__sourceSpill1087_32)[7] = ((byte) ((int) local8_life31));
        javax.crypto.Cipher __sourceSpill1087_33 = local1_life8;
        byte[] local10_life35 = ((javax.crypto.Cipher)(__sourceSpill1087_33)).doFinal(((byte[])(__sourceSpill1087_32)));
        (__sourceSpill1087_29)[__sourceSpill1087_30] = (((((((((((long) (local10_life35)[0]) & 255L) << 56) | ((((long) (local10_life35)[1]) & 255L) << 48)) | ((((long) (local10_life35)[2]) & 255L) << 40)) | ((((long) (local10_life35)[3]) & 255L) << 32)) | ((((long) (local10_life35)[4]) & 255L) << 24)) | ((((long) (local10_life35)[5]) & 255L) << 16)) | ((((long) (local10_life35)[6]) & 255L) << 8)) | (((long) (local10_life35)[7]) & 255L));
    } while ((!(local3_life23 >= local6_life22)));
    local6_life22 = ((java.lang.String)((local5_life20 = "°pA\005Å«\004ªmã­\025Øq{"))).length();
    local3_life23 = 0;
    do {
        java.lang.String __sourceSpill1087_37 = local5_life20;
        int __sourceSpill1087_38 = local3_life23;
        local3_life23 += 8;
        byte[] local7_life41 = ((java.lang.String)(((java.lang.String)(__sourceSpill1087_37)).substring(((int)(__sourceSpill1087_38)), ((int)(local3_life23))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1087_42 = local0_life18;
        int __sourceSpill1087_43 = local4_life19;
        local4_life19 += 1;
        long local8_life44 = (((((((((((long) (local7_life41)[0]) & 255L) << 56) | ((((long) (local7_life41)[1]) & 255L) << 48)) | ((((long) (local7_life41)[2]) & 255L) << 40)) | ((((long) (local7_life41)[3]) & 255L) << 32)) | ((((long) (local7_life41)[4]) & 255L) << 24)) | ((((long) (local7_life41)[5]) & 255L) << 16)) | ((((long) (local7_life41)[6]) & 255L) << 8)) | (((long) (local7_life41)[7]) & 255L));
        byte[] __sourceSpill1087_45 = new byte[8];
        (__sourceSpill1087_45)[0] = ((byte) ((int) (local8_life44 >>> 56)));
        (__sourceSpill1087_45)[1] = ((byte) ((int) (local8_life44 >>> 48)));
        (__sourceSpill1087_45)[2] = ((byte) ((int) (local8_life44 >>> 40)));
        (__sourceSpill1087_45)[3] = ((byte) ((int) (local8_life44 >>> 32)));
        (__sourceSpill1087_45)[4] = ((byte) ((int) (local8_life44 >>> 24)));
        (__sourceSpill1087_45)[5] = ((byte) ((int) (local8_life44 >>> 16)));
        (__sourceSpill1087_45)[6] = ((byte) ((int) (local8_life44 >>> 8)));
        (__sourceSpill1087_45)[7] = ((byte) ((int) local8_life44));
        javax.crypto.Cipher __sourceSpill1087_46 = local1_life8;
        byte[] local10_life48 = ((javax.crypto.Cipher)(__sourceSpill1087_46)).doFinal(((byte[])(__sourceSpill1087_45)));
        (__sourceSpill1087_42)[__sourceSpill1087_43] = (((((((((((long) (local10_life48)[0]) & 255L) << 56) | ((((long) (local10_life48)[1]) & 255L) << 48)) | ((((long) (local10_life48)[2]) & 255L) << 40)) | ((((long) (local10_life48)[3]) & 255L) << 32)) | ((((long) (local10_life48)[4]) & 255L) << 24)) | ((((long) (local10_life48)[5]) & 255L) << 16)) | ((((long) (local10_life48)[6]) & 255L) << 8)) | (((long) (local10_life48)[7]) & 255L));
    } while ((!(local3_life23 >= local6_life22)));
    WOOD = ((moom.a4)(new moom.a4("WOOD", 0, 0, ((int) (local0_life18)[7]), 0x1.0p1f, 0x0.0p0f, ((int) (local0_life18)[2]))));
    STONE = ((moom.a4)(new moom.a4("STONE", 1, 1, ((int) (local0_life18)[1]), 0x1.0p2f, 0x1.0p0f, 5)));
    IRON = ((moom.a4)(new moom.a4("IRON", 2, 2, ((int) (local0_life18)[0]), 0x1.8p2f, 0x1.0p1f, ((int) (local0_life18)[3]))));
    EMERALD = ((moom.a4)(new moom.a4("EMERALD", 3, 3, ((int) (local0_life18)[6]), 0x1.0p3f, 0x1.8p1f, ((int) (local0_life18)[5]))));
    GOLD = ((moom.a4)(new moom.a4("GOLD", 4, 0, ((int) (local0_life18)[8]), 0x1.8p3f, 0x0.0p0f, ((int) (local0_life18)[4]))));
    f = ((moom.a4[])(moom.a4.a__Arraya4()));
}


public static moom.a4[] values() {
return ((moom.a4[])(((moom.a4[])(moom.a4.f)).clone()));
}


public static moom.a4 valueOf(java.lang.String p0) {
return ((moom.a4)(java.lang.Enum.valueOf(((java.lang.Class)(moom.a4.class)), ((java.lang.String)(p0)))));
}


public int b__Int() {
return this.a;
}


public float b() {
return this.d;
}


public int c() {
return this.e;
}


private static moom.a4[] a__Arraya4() {
return new moom.a4[] {moom.a4.WOOD, moom.a4.STONE, moom.a4.IRON, moom.a4.EMERALD, moom.a4.GOLD};
}


public int a__Int() {
return this.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.Item a__wQ() {
moom.a4 forwardValue2951_16_0;
    moom.a4 forwardValue2951_16_1;
    moom.a4 forwardValue2951_24_0;
    moom.a4 forwardValue2951_24_1;
    moom.a4 forwardValue2951_31_0;
    moom.a4 forwardValue2951_31_1;
    moom.a4 forwardValue2951_38_0;
    moom.a4 forwardValue2951_38_1;
    net.minecraft.item.Item forwardValue2951_42_0;
    moom.a4 spill2951_0;
    moom.a4 spill2951_1;
    long life1_3;
    int life3_5;
    forward_join_42: {
    forward_join_41: {
    forward_join_38: {
    forward_join_36: {
    forward_join_31: {
    forward_join_29: {
    forward_join_24: {
    forward_join_22: {
    forward_join_16: {
    forward_join_14: {
    life1_3 = (moom.a4.g ^ 78219426394672L);
    life3_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill2951_0 = this;
    spill2951_1 = moom.a4.WOOD;
    if (!((life3_5 != 0))) {
        forwardValue2951_16_0 = spill2951_0;
        forwardValue2951_16_1 = spill2951_1;
        break forward_join_16;
    }
    if (!((spill2951_0 == spill2951_1))) {
        break forward_join_14;
    }
    forwardValue2951_42_0 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)));
    break forward_join_42;
    }
    forwardValue2951_16_0 = this;
    forwardValue2951_16_1 = moom.a4.STONE;
    }
    if (!((life3_5 != 0))) {
        forwardValue2951_24_0 = forwardValue2951_16_0;
        forwardValue2951_24_1 = forwardValue2951_16_1;
        break forward_join_24;
    }
    if (!((forwardValue2951_16_0 == forwardValue2951_16_1))) {
        break forward_join_22;
    }
    forwardValue2951_42_0 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)));
    break forward_join_42;
    }
    forwardValue2951_24_0 = this;
    forwardValue2951_24_1 = moom.a4.GOLD;
    }
    if (!((life3_5 != 0))) {
        forwardValue2951_31_0 = forwardValue2951_24_0;
        forwardValue2951_31_1 = forwardValue2951_24_1;
        break forward_join_31;
    }
    if (!((forwardValue2951_24_0 == forwardValue2951_24_1))) {
        break forward_join_29;
    }
    forwardValue2951_42_0 = net.minecraft.init.Items.k;
    break forward_join_42;
    }
    forwardValue2951_31_0 = this;
    forwardValue2951_31_1 = moom.a4.IRON;
    }
    if (!((life3_5 != 0))) {
        forwardValue2951_38_0 = forwardValue2951_31_0;
        forwardValue2951_38_1 = forwardValue2951_31_1;
        break forward_join_38;
    }
    if (!((forwardValue2951_31_0 == forwardValue2951_31_1))) {
        break forward_join_36;
    }
    forwardValue2951_42_0 = net.minecraft.init.Items.j;
    break forward_join_42;
    }
    forwardValue2951_38_0 = this;
    forwardValue2951_38_1 = moom.a4.EMERALD;
    }
    if (!((forwardValue2951_38_0 == forwardValue2951_38_1))) {
        break forward_join_41;
    }
    forwardValue2951_42_0 = net.minecraft.init.Items.i;
    break forward_join_42;
    }
    forwardValue2951_42_0 = null;
    }
    return forwardValue2951_42_0;
}


public float a() {
return this.c;
}

}
