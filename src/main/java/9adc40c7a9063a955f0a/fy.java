package moom;


public class fy extends moom.fu<java.lang.Integer> {

private com.google.common.collect.ImmutableSet<java.lang.Integer> d;

private static long e;

private static long f;

protected fy(java.lang.String p0, int p1, int p2) { super((java.lang.String)null, (java.lang.Class)null); }

private static void __sourceConstructorBody_d9050492b5dc66c9(moom.fy receiver, java.lang.String p0, int p1, int p2) throws Throwable {
long local4_life1 = (moom.fy.e ^ 113320519985541L);
    moom.fy.__sourceConstructorInit_d9050492b5dc66c9_0(((moom.fy)(receiver)), ((java.lang.String)(p0)), ((java.lang.Class)(java.lang.Integer.class)));
    if ((p1 < 0)) {
        throw new java.lang.IllegalArgumentException(__sourceIntrinsic_d9050492b5dc66c9_originalDynamicSite722_4(p0));
    }
    if ((p2 <= p1)) {
        throw new java.lang.IllegalArgumentException(__sourceIntrinsic_d9050492b5dc66c9_originalDynamicSite722_5(p0, p1));
    }
    java.util.HashSet local6_life7 = com.google.common.collect.Sets.newHashSet();
    int local7_life8 = p1;
    while ((local7_life8 <= p2)) {
        ((java.util.Set)(local6_life7)).add(((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7_life8))))));
        local7_life8 += 1;
    }
    ((moom.fy)(receiver)).d = ((com.google.common.collect.ImmutableSet)(com.google.common.collect.ImmutableSet.copyOf(((java.util.Collection)(local6_life7)))));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_d9050492b5dc66c9_0(moom.fy a0, java.lang.String a1, java.lang.Class a2) throws E;

static {
e = ((long)(((moom._a)(moom._c.a(((long)(-5180899496160263748L)), ((long)(-7878834312567044724L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(131392647733196L)))));
    long local0_life6 = (moom.fy.e ^ 95985720621207L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill842_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill842_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill842_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill842_13 = new byte[8];
    (__sourceSpill842_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill842_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation842_15 = __sourceSpill842_13;
    ((javax.crypto.Cipher)(__sourceSpill842_10)).init(((int)(__sourceSpill842_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill842_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation842_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -1659974966618950007L;
    byte[] __sourceSpill842_19 = new byte[8];
    (__sourceSpill842_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill842_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill842_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill842_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill842_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill842_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill842_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill842_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill842_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill842_20)).doFinal(((byte[])(__sourceSpill842_19)));
    f = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue3546_14_0;
    moom.fy forwardValue3546_23_0;
    moom.fy forwardValue3546_32_0;
    moom.fy spill3546_0;
    moom.fy spill3546_1;
    long life2_3;
    java.lang.String[] life4_5;
    moom.fy life5_51;
    forward_join_39: {
    forward_join_32: {
    forward_join_30: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.fy.e ^ 127155013741292L);
    life4_5 = moom.fu.b();
    spill3546_0 = this;
    if (!((life4_5 != null))) {
        forwardValue3546_14_0 = spill3546_0;
        break forward_join_14;
    }
    if (!((spill3546_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue3546_14_0 = p0;
    }
    if (!((forwardValue3546_14_0 != null))) {
        break forward_join_39;
    }
    spill3546_1 = this;
    if (!((life4_5 != null))) {
        forwardValue3546_23_0 = spill3546_1;
        break forward_join_23;
    }
    if (!((((java.lang.Object)(spill3546_1)).getClass() == ((java.lang.Object)(p0)).getClass()))) {
        break forward_join_39;
    }
    forwardValue3546_23_0 = this;
    }
    if (!((life4_5 != null))) {
        forwardValue3546_32_0 = forwardValue3546_23_0;
        break forward_join_32;
    }
    if (!((!__sourceIntrinsic_eb1342255c6f_call3546_5(forwardValue3546_23_0, p0)))) {
        break forward_join_30;
    }
    return ((0) != 0);
    }
    forwardValue3546_32_0 = ((moom.fy)(p0));
    }
    life5_51 = forwardValue3546_32_0;
    return ((com.google.common.collect.ImmutableSet)(this.d)).equals(((java.lang.Object)(((moom.fy)(life5_51)).d)));
    }
    return ((0) != 0);
}


public int hashCode() {
long life1_3;
    int life4_7;
    int life4_16;
    java.lang.String[] life3_17;
    life1_3 = (moom.fy.e ^ 38016598998406L);
    java.lang.String[] spill6395_0 = moom.fu.b();
    life4_7 = super.hashCode();
    life4_16 = ((((int) moom.fy.f) * life4_7) + ((com.google.common.collect.ImmutableSet)(this.d)).hashCode());
    life3_17 = spill6395_0;
    int spill6395_1 = life4_16;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        moom.fu.b(((java.lang.String[])(new java.lang.String[5])));
    }
    return spill6395_1;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public java.lang.String a(java.lang.Integer p0) {
return ((java.lang.Integer)(p0)).toString();
}


public static moom.fy a(java.lang.String p0, int p1, int p2) {
return new moom.fy(p0, p1, p2);
}


public java.util.Collection<java.lang.Integer> a__Collection() {
return this.d;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d9050492b5dc66c9_originalDynamicSite722_4(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d9050492b5dc66c9_originalDynamicSite722_5(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> boolean __sourceIntrinsic_eb1342255c6f_call3546_5(moom.fy a0, java.lang.Object a1) throws E;
}
