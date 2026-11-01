package moom;


public class Lm implements moom.Ly, moom.Lw {

private final moom.Ly a;

private boolean b;

private float[] c;

private static final long d;

private static final java.lang.String e;

public Lm(moom.Ly p0) {
super();
    this.a = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(6443062736249819917L)), ((long)(3028415288502387180L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(204445290473373L)))));
    long local0_life6 = (moom.Lm.d ^ 4587589696607L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill679_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill679_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill679_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill679_13 = new byte[8];
    (__sourceSpill679_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill679_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation679_15 = __sourceSpill679_13;
    ((javax.crypto.Cipher)(__sourceSpill679_10)).init(((int)(__sourceSpill679_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill679_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation679_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill679_19 = ((java.lang.String)("zwbÆpgð\006")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill679_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill679_20)).doFinal(((byte[])(__sourceSpill679_19)));
    e = ((java.lang.String)(((java.lang.String)(moom.Lm.a(((byte[])(local4_life22))))).intern()));
}


public java.lang.String toString() {
long local1_life2 = (moom.Lm.d ^ 88264853620682L);
    moom.Ly __stackOp563_5_0 = this.a;
    java.lang.String __stackOp563_5_1 = moom.Lm.e;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite563_6(__stackOp563_5_1, __stackOp563_5_0, ")");
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill3044_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3044_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3044_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3044_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3044_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3044_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public float[] a__ArrayFloat() {
moom.Lm forwardValue2584_20_0;
    moom.Lm spill2584_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.Lm.d ^ 49124877895430L);
    life3_5 = moom.bS.b();
    spill2584_0 = this;
    if (!((life3_5 != null))) {
        forwardValue2584_20_0 = spill2584_0;
        break forward_join_20;
    }
    if (!((!((moom.Lm)(spill2584_0)).b))) {
        break forward_join_19;
    }
    this.c = ((float[])(((moom.Ly)(this.a)).a__ArrayFloat()));
    this.b = ((boolean)(true));
    }
    forwardValue2584_20_0 = this;
    }
    return ((moom.Lm)(forwardValue2584_20_0)).c;
}


public void a__Void() {
this.b = ((boolean)(false));
    return;
}


public moom.bS a__bS() {
return moom.bS.FLOAT;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite563_6(java.lang.String a0, moom.Ly a1, java.lang.String a2) throws E;
}
