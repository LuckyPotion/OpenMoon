package moom;


public class v2 {

private final net.minecraft.event.ClickEvent$Action a;

private final java.lang.String b;

private static boolean c;

private static final long d;

private static final long e;

public v2(net.minecraft.event.ClickEvent$Action p0, java.lang.String p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(1540915346189988716L)), ((long)(-6730881499189981987L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(141427993957040L)))));
    int __sourceSpill1066_6 = 0;
    long local0_life7 = (moom.v2.d ^ 38429897967214L);
    moom.v2.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill1066_6))));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill1066_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1066_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1066_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1066_15 = new byte[8];
    (__sourceSpill1066_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill1066_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation1066_17 = __sourceSpill1066_15;
    ((javax.crypto.Cipher)(__sourceSpill1066_12)).init(((int)(__sourceSpill1066_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1066_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1066_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = -5174113238865976860L;
    byte[] __sourceSpill1066_21 = new byte[8];
    (__sourceSpill1066_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill1066_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill1066_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill1066_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill1066_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill1066_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill1066_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill1066_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill1066_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill1066_22)).doFinal(((byte[])(__sourceSpill1066_21)));
    e = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue4259_14_0;
    java.lang.Object forwardValue4259_23_0;
    moom.v2 forwardValue4259_35_0;
    java.lang.String forwardValue4259_47_0;
    int forwardValue4259_51_0;
    moom.v2 spill4259_0;
    java.lang.Class spill4259_1;
    moom.v2 spill4259_2;
    java.lang.String spill4259_3;
    long life2_3;
    int life4_5;
    moom.v2 life5_38;
    forward_join_52: {
    forward_join_51: {
    forward_join_50: {
    forward_join_47: {
    forward_join_45: {
    forward_join_35: {
    forward_join_34: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.v2.d ^ 57455961737802L);
    life4_5 = ((moom.v2.b()) ? 1 : 0);
    spill4259_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue4259_14_0 = spill4259_0;
        break forward_join_14;
    }
    if (!((spill4259_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue4259_14_0 = p0;
    }
    if (!((forwardValue4259_14_0 != null))) {
        break forward_join_52;
    }
    spill4259_1 = ((java.lang.Object)(this)).getClass();
    if (!((life4_5 == 0))) {
        forwardValue4259_23_0 = spill4259_1;
        break forward_join_23;
    }
    if (!((spill4259_1 == ((java.lang.Object)(p0)).getClass()))) {
        break forward_join_52;
    }
    forwardValue4259_23_0 = p0;
    }
    life5_38 = ((moom.v2)(forwardValue4259_23_0));
    spill4259_2 = this;
    if (!((life4_5 == 0))) {
        forwardValue4259_35_0 = spill4259_2;
        break forward_join_35;
    }
    if (!((((moom.v2)(spill4259_2)).a != ((moom.v2)(life5_38)).a))) {
        break forward_join_34;
    }
    return ((0) != 0);
    }
    forwardValue4259_35_0 = this;
    }
    spill4259_3 = ((moom.v2)(forwardValue4259_35_0)).b;
    if (!((life4_5 == 0))) {
        forwardValue4259_47_0 = spill4259_3;
        break forward_join_47;
    }
    if (!((spill4259_3 != null))) {
        break forward_join_45;
    }
    return ((java.lang.String)(this.b)).equals(((java.lang.Object)(((moom.v2)(life5_38)).b)));
    }
    forwardValue4259_47_0 = ((moom.v2)(life5_38)).b;
    }
    if (!((forwardValue4259_47_0 == null))) {
        break forward_join_50;
    }
    forwardValue4259_51_0 = 1;
    break forward_join_51;
    }
    forwardValue4259_51_0 = 0;
    }
    return ((forwardValue4259_51_0) != 0);
    }
    return ((0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1683_2(this.a, this.b);
}


public int hashCode() {
int forwardValue4260_21_0;
    java.lang.String forwardValue4260_21_1;
    int forwardValue4260_23_0;
    int forwardValue4260_24_0;
    int forwardValue4260_24_1;
    int forwardValue4260_32_0;
    boolean spill4260_0;
    int spill4260_1;
    java.lang.String spill4260_2;
    int spill4260_3;
    long life1_3;
    int life4_8;
    int life3_9;
    int life4_31;
    forward_join_32: {
    forward_join_24: {
    forward_join_23: {
    forward_join_21: {
    life1_3 = (moom.v2.d ^ 137256941541700L);
    spill4260_0 = moom.v2.c();
    life4_8 = ((net.minecraft.event.ClickEvent$Action)(this.a)).hashCode();
    life3_9 = ((spill4260_0) ? 1 : 0);
    spill4260_1 = (((int) moom.v2.e) * life4_8);
    spill4260_2 = this.b;
    if (!((life3_9 != 0))) {
        forwardValue4260_21_0 = spill4260_1;
        forwardValue4260_21_1 = spill4260_2;
        break forward_join_21;
    }
    if (!((spill4260_2 != null))) {
        forwardValue4260_23_0 = spill4260_1;
        break forward_join_23;
    }
    forwardValue4260_21_0 = spill4260_1;
    forwardValue4260_21_1 = this.b;
    }
    forwardValue4260_24_0 = forwardValue4260_21_0;
    forwardValue4260_24_1 = ((java.lang.String)(forwardValue4260_21_1)).hashCode();
    break forward_join_24;
    }
    forwardValue4260_24_0 = forwardValue4260_23_0;
    forwardValue4260_24_1 = 0;
    }
    life4_31 = (forwardValue4260_24_0 + forwardValue4260_24_1);
    spill4260_3 = life4_31;
    if (!((life3_9 == 0))) {
        forwardValue4260_32_0 = spill4260_3;
        break forward_join_32;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    forwardValue4260_32_0 = spill4260_3;
    }
    return forwardValue4260_32_0;
}


public static boolean b() {
return ((((moom.v2.c) ? 1 : 0)) != 0);
}


public static void b(boolean p0) {
moom.v2.c = ((boolean)(p0));
    return;
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(moom.v2.b());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.event.ClickEvent$Action a__aZ() {
return this.a;
}


public java.lang.String a() {
return this.b;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1683_2(net.minecraft.event.ClickEvent$Action a0, java.lang.String a1) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
