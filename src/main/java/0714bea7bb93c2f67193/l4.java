package moom;


public class l4 {

private final java.lang.String a;

private final java.util.List<moom.l2> b;

private static final long c;

private static final long d;

public l4(java.lang.String p0, java.util.List<moom.l2> p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-7529411827822859152L)), ((long)(-5198042019913760051L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(195301280298194L)))));
    long local0_life6 = (moom.l4.c ^ 117042262371988L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill914_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill914_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill914_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill914_13 = new byte[8];
    (__sourceSpill914_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill914_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation914_15 = __sourceSpill914_13;
    ((javax.crypto.Cipher)(__sourceSpill914_10)).init(((int)(__sourceSpill914_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill914_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation914_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 7987239658247892201L;
    byte[] __sourceSpill914_19 = new byte[8];
    (__sourceSpill914_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill914_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill914_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill914_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill914_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill914_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill914_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill914_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill914_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill914_20)).doFinal(((byte[])(__sourceSpill914_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public boolean equals(java.lang.Object p0) {
int forwardValue3739_29_0;
    moom.l4 life2_12;
    forward_join_29: {
    forward_join_28: {
    forward_join_14: {
    forward_join_12: {
    forward_join_5: {
    if (!((this == p0))) {
        break forward_join_5;
    }
    return ((1) != 0);
    }
    if (!((((p0 instanceof moom.l4) ? 1 : 0) != 0))) {
        break forward_join_12;
    }
    life2_12 = ((moom.l4)(p0));
    break forward_join_14;
    }
    return ((0) != 0);
    }
    if (!(((java.lang.String)(this.a)).equals(((java.lang.Object)(((moom.l4)(life2_12)).a))))) {
        break forward_join_28;
    }
    if (!(((java.util.List)(this.b)).equals(((java.lang.Object)(((moom.l4)(life2_12)).b))))) {
        break forward_join_28;
    }
    forwardValue3739_29_0 = 1;
    break forward_join_29;
    }
    forwardValue3739_29_0 = 0;
    }
    return ((forwardValue3739_29_0) != 0);
}


public int hashCode() {
long local1 = (moom.l4.c ^ 134891722249576L);
    int local3 = ((java.lang.String)(this.a)).hashCode();
    local3 = ((((int) moom.l4.d) * local3) + ((java.util.List)(this.b)).hashCode());
    return local3;
}


public java.util.List<moom.l2> a() {
return this.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
