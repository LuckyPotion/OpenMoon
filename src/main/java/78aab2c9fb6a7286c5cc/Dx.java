package moom;


public class Dx<T> implements moom.C8<T> {

private java.util.IdentityHashMap<T, java.lang.Integer> a;

private java.util.List<T> b;

private static long c;

private static long d;

public Dx() { super(); }


private static void __sourceConstructorBody_3d6de654339d838d(moom.Dx receiver) throws Throwable {

long local1 = (moom.Dx.c ^ 99341932383082L);

    moom.Dx.__sourceConstructorInit_3d6de654339d838d_0(((moom.Dx)(receiver)));

    ((moom.Dx)(receiver)).a = ((java.util.IdentityHashMap)(new java.util.IdentityHashMap(((int) moom.Dx.d))));

    ((moom.Dx)(receiver)).b = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_3d6de654339d838d_0(moom.Dx a0) throws E;

static {
c = ((long)(((moom._a)(moom._c.a(((long)(7224185524961768304L)), ((long)(-2954271447968013235L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(171109666975059L)))));
    long local0_life6 = (moom.Dx.c ^ 11705274408704L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill518_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill518_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill518_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill518_13 = new byte[8];
    (__sourceSpill518_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill518_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation518_15 = __sourceSpill518_13;
    ((javax.crypto.Cipher)(__sourceSpill518_10)).init(((int)(__sourceSpill518_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill518_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation518_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4413888075994692259L;
    byte[] __sourceSpill518_19 = new byte[8];
    (__sourceSpill518_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill518_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill518_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill518_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill518_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill518_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill518_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill518_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill518_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill518_20)).doFinal(((byte[])(__sourceSpill518_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public java.util.Iterator<T> iterator() {
return com.google.common.collect.Iterators.filter(((java.util.Iterator)(((java.util.List)(this.b)).iterator())), ((com.google.common.base.Predicate)(com.google.common.base.Predicates.notNull())));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public final T a(int p0) {
int forwardValue1773_11_0;
    java.lang.Object forwardValue1773_21_0;
    int spill1773_0;
    long life2_3;
    int life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_11: {
    life2_3 = (moom.Dx.c ^ 108064500952276L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1773_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1773_11_0 = spill1773_0;
        break forward_join_11;
    }
    if (!((spill1773_0 >= 0))) {
        break forward_join_20;
    }
    forwardValue1773_11_0 = p0;
    }
    if (!((forwardValue1773_11_0 < ((java.util.List)(this.b)).size()))) {
        break forward_join_20;
    }
    forwardValue1773_21_0 = ((java.util.List)(this.b)).get(((int)(p0)));
    break forward_join_21;
    }
    forwardValue1773_21_0 = null;
    }
    return ((T)(forwardValue1773_21_0));
}


public int a(T p0) {
long local2 = (moom.Dx.c ^ 40243323884373L);
    java.lang.Object local4 = ((java.lang.Integer)(((java.util.IdentityHashMap)(this.a)).get(((java.lang.Object)(p0)))));
    return ((local4 == null) ? -1 : ((java.lang.Integer)(local4)).intValue());
}


public void a(T p0, int p1) {
boolean spill569_0;
    long life3_3;
    int life5_12;
    lexical_join_33: {
    lexical_join_27: {
    life3_3 = (moom.Dx.c ^ 122300706061366L);
    spill569_0 = moom.DS.c__Boolean();
    ((java.util.IdentityHashMap)(this.a)).put(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p1))))));
    life5_12 = ((spill569_0) ? 1 : 0);
    lexical_cycle_13: while (true) {
    if (!((((java.util.List)(this.b)).size() <= p1))) {
        break lexical_join_27;
    }
    ((java.util.List)(this.b)).add(((java.lang.Object)(null)));
    if (!((life5_12 != 0))) {
        break lexical_join_33;
    }
    if (!((life5_12 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    ((java.util.List)(this.b)).set(((int)(p1)), ((java.lang.Object)(p0)));
    }
    return;
}

}
