package moom;


public class v3 {

private final net.minecraft.event.HoverEvent$Action a;

private final net.minecraft.util.IChatComponent b;

private static final long c;

private static final long d;

public v3(net.minecraft.event.HoverEvent$Action p0, net.minecraft.util.IChatComponent p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-9097147901628860987L)), ((long)(1315270955741070657L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(147162225204176L)))));
    long local0_life6 = (moom.v3.c ^ 111518918690172L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1067_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1067_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1067_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1067_13 = new byte[8];
    (__sourceSpill1067_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1067_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1067_15 = __sourceSpill1067_13;
    ((javax.crypto.Cipher)(__sourceSpill1067_10)).init(((int)(__sourceSpill1067_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1067_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1067_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 9033856595518668434L;
    byte[] __sourceSpill1067_19 = new byte[8];
    (__sourceSpill1067_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1067_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1067_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1067_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1067_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1067_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1067_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1067_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1067_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1067_20)).doFinal(((byte[])(__sourceSpill1067_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue4261_14_0;
    java.lang.Object forwardValue4261_23_0;
    moom.v3 forwardValue4261_35_0;
    net.minecraft.util.IChatComponent forwardValue4261_47_0;
    int forwardValue4261_51_0;
    moom.v3 spill4261_0;
    java.lang.Class spill4261_1;
    moom.v3 spill4261_2;
    net.minecraft.util.IChatComponent spill4261_3;
    long life2_3;
    int life4_5;
    moom.v3 life5_38;
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
    life2_3 = (moom.v3.c ^ 45095115512868L);
    life4_5 = ((moom.v2.b()) ? 1 : 0);
    spill4261_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue4261_14_0 = spill4261_0;
        break forward_join_14;
    }
    if (!((spill4261_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue4261_14_0 = p0;
    }
    if (!((forwardValue4261_14_0 != null))) {
        break forward_join_52;
    }
    spill4261_1 = ((java.lang.Object)(this)).getClass();
    if (!((life4_5 == 0))) {
        forwardValue4261_23_0 = spill4261_1;
        break forward_join_23;
    }
    if (!((spill4261_1 == ((java.lang.Object)(p0)).getClass()))) {
        break forward_join_52;
    }
    forwardValue4261_23_0 = p0;
    }
    life5_38 = ((moom.v3)(forwardValue4261_23_0));
    spill4261_2 = this;
    if (!((life4_5 == 0))) {
        forwardValue4261_35_0 = spill4261_2;
        break forward_join_35;
    }
    if (!((((moom.v3)(spill4261_2)).a != ((moom.v3)(life5_38)).a))) {
        break forward_join_34;
    }
    return ((0) != 0);
    }
    forwardValue4261_35_0 = this;
    }
    spill4261_3 = ((moom.v3)(forwardValue4261_35_0)).b;
    if (!((life4_5 == 0))) {
        forwardValue4261_47_0 = spill4261_3;
        break forward_join_47;
    }
    if (!((spill4261_3 != null))) {
        break forward_join_45;
    }
    return ((java.lang.Object)(this.b)).equals(((java.lang.Object)(((moom.v3)(life5_38)).b)));
    }
    forwardValue4261_47_0 = ((moom.v3)(life5_38)).b;
    }
    if (!((forwardValue4261_47_0 == null))) {
        break forward_join_50;
    }
    forwardValue4261_51_0 = 1;
    break forward_join_51;
    }
    forwardValue4261_51_0 = 0;
    }
    return ((forwardValue4261_51_0) != 0);
    }
    return ((0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1684_2(this.a, this.b);
}


public int hashCode() {
int forwardValue4262_21_0;
    net.minecraft.util.IChatComponent forwardValue4262_21_1;
    int forwardValue4262_23_0;
    int forwardValue4262_24_0;
    int forwardValue4262_24_1;
    int forwardValue4262_33_0;
    int forwardValue4262_34_0;
    int forwardValue4262_34_1;
    int forwardValue4262_35_0;
    boolean spill4262_0;
    int spill4262_1;
    net.minecraft.util.IChatComponent spill4262_2;
    int spill4262_3;
    long life1_3;
    int life4_8;
    int life3_9;
    int life4_31;
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_24: {
    forward_join_23: {
    forward_join_21: {
    life1_3 = (moom.v3.c ^ 52397822034503L);
    spill4262_0 = moom.v2.b();
    life4_8 = ((net.minecraft.event.HoverEvent$Action)(this.a)).hashCode();
    life3_9 = ((spill4262_0) ? 1 : 0);
    spill4262_1 = (((int) moom.v3.d) * life4_8);
    spill4262_2 = this.b;
    if (!((life3_9 == 0))) {
        forwardValue4262_21_0 = spill4262_1;
        forwardValue4262_21_1 = spill4262_2;
        break forward_join_21;
    }
    if (!((spill4262_2 != null))) {
        forwardValue4262_23_0 = spill4262_1;
        break forward_join_23;
    }
    forwardValue4262_21_0 = spill4262_1;
    forwardValue4262_21_1 = this.b;
    }
    forwardValue4262_24_0 = forwardValue4262_21_0;
    forwardValue4262_24_1 = ((java.lang.Object)(forwardValue4262_21_1)).hashCode();
    break forward_join_24;
    }
    forwardValue4262_24_0 = forwardValue4262_23_0;
    forwardValue4262_24_1 = 0;
    }
    life4_31 = (forwardValue4262_24_0 + forwardValue4262_24_1);
    spill4262_3 = life4_31;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forwardValue4262_35_0 = spill4262_3;
        break forward_join_35;
    }
    if (!((life3_9 != 0))) {
        forwardValue4262_33_0 = spill4262_3;
        break forward_join_33;
    }
    forwardValue4262_34_0 = spill4262_3;
    forwardValue4262_34_1 = 0;
    break forward_join_34;
    }
    forwardValue4262_34_0 = forwardValue4262_33_0;
    forwardValue4262_34_1 = 1;
    }
    moom.v2.b(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4262_34_1))));
    forwardValue4262_35_0 = forwardValue4262_34_0;
    }
    return forwardValue4262_35_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.event.HoverEvent$Action a__a0() {
return this.a;
}


public net.minecraft.util.IChatComponent a() {
return this.b;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1684_2(net.minecraft.event.HoverEvent$Action a0, net.minecraft.util.IChatComponent a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
