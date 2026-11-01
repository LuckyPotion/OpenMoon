package moom;


public abstract class fu<T extends java.lang.Comparable<T>> implements net.minecraft.block.properties.IProperty<T> {

private final java.lang.Class<T> a;

private final java.lang.String b;

private static java.lang.String[] c;

private static final long h;

private static final long i;

protected fu(java.lang.String p0, java.lang.Class<T> p1) {
super();
    this.a = p1;
    this.b = p0;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-4494097148262768720L)), ((long)(-2053958580435742384L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(61985199140528L)))));
    java.lang.String[] __sourceSpill841_6 = new java.lang.String[3];
    long local0_life7 = (moom.fu.h ^ 120392727032358L);
    moom.fu.b(((java.lang.String[])(__sourceSpill841_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill841_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill841_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill841_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill841_15 = new byte[8];
    (__sourceSpill841_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill841_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation841_17 = __sourceSpill841_15;
    ((javax.crypto.Cipher)(__sourceSpill841_12)).init(((int)(__sourceSpill841_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill841_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation841_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = -3477693265683839288L;
    byte[] __sourceSpill841_21 = new byte[8];
    (__sourceSpill841_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill841_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill841_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill841_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill841_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill841_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill841_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill841_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill841_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill841_22)).doFinal(((byte[])(__sourceSpill841_21)));
    i = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue3545_14_0;
    java.lang.Object forwardValue3545_23_0;
    int forwardValue3545_38_0;
    int forwardValue3545_42_0;
    int forwardValue3545_44_0;
    moom.fu spill3545_0;
    java.lang.Class spill3545_1;
    boolean spill3545_2;
    long life2_3;
    java.lang.String[] life4_5;
    moom.fu life5_38;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_38: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.fu.h ^ 113173978052258L);
    life4_5 = moom.fu.b();
    spill3545_0 = this;
    if (!((life4_5 != null))) {
        forwardValue3545_14_0 = spill3545_0;
        break forward_join_14;
    }
    if (!((spill3545_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue3545_14_0 = p0;
    }
    if (!((forwardValue3545_14_0 != null))) {
        break forward_join_45;
    }
    spill3545_1 = ((java.lang.Object)(this)).getClass();
    if (!((life4_5 != null))) {
        forwardValue3545_23_0 = spill3545_1;
        break forward_join_23;
    }
    if (!((spill3545_1 == ((java.lang.Object)(p0)).getClass()))) {
        break forward_join_45;
    }
    forwardValue3545_23_0 = p0;
    }
    life5_38 = ((moom.fu)(forwardValue3545_23_0));
    spill3545_2 = ((java.lang.Object)(this.a)).equals(((java.lang.Object)(((moom.fu)(life5_38)).a)));
    if (!((life4_5 != null))) {
        forwardValue3545_38_0 = ((spill3545_2) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill3545_2)) {
        break forward_join_43;
    }
    forwardValue3545_38_0 = ((((java.lang.String)(this.b)).equals(((java.lang.Object)(((moom.fu)(life5_38)).b)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue3545_42_0 = forwardValue3545_38_0;
        break forward_join_42;
    }
    if (!((forwardValue3545_38_0 != 0))) {
        break forward_join_43;
    }
    forwardValue3545_42_0 = 1;
    }
    forwardValue3545_44_0 = forwardValue3545_42_0;
    break forward_join_44;
    }
    forwardValue3545_44_0 = 0;
    }
    return ((forwardValue3545_44_0) != 0);
    }
    return ((0) != 0);
}


public java.lang.String toString() {
long local1 = (moom.fu.h ^ 62881414868169L);
    java.lang.String[] local3 = moom.fu.b();
    java.lang.String spill6455_0 = ((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(com.google.common.base.MoreObjects.toStringHelper(((java.lang.Object)(this))))).add(((java.lang.String)("name")), ((java.lang.Object)(this.b))))).add(((java.lang.String)("clazz")), ((java.lang.Object)(this.a))))).add(((java.lang.String)("values")), ((java.lang.Object)(((moom.fu)(this)).a__Collection()))))).toString();
    if ((local3 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return spill6455_0;
}


public int hashCode() {
long local1 = (moom.fu.h ^ 113438532522878L);
    return ((((int) moom.fu.i) * ((java.lang.Object)(this.a)).hashCode()) + ((java.lang.String)(this.b)).hashCode());
}


public static java.lang.String[] b() {
return moom.fu.c;
}


public static void b(java.lang.String[] p0) {
moom.fu.c = ((java.lang.String[])(p0));
    return;
}


public java.lang.String a__String() {
return this.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.Class<T> a() {
return this.a;
}

}
