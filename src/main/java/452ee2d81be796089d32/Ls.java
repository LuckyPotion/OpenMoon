package moom;


public class Ls implements moom.Ly {

private final moom.bT a;

private final moom.Lu[] b;

private static final long c;

private static final java.lang.String d;

public Ls(moom.bT p0, moom.Lu[] p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(3293037478708257161L)), ((long)(-4569587269228379655L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(106748681178935L)))));
    long local0_life6 = (moom.Ls.c ^ 133736386964988L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill684_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill684_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill684_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill684_13 = new byte[8];
    (__sourceSpill684_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill684_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation684_15 = __sourceSpill684_13;
    ((javax.crypto.Cipher)(__sourceSpill684_10)).init(((int)(__sourceSpill684_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill684_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation684_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill684_19 = ((java.lang.String)("\033ÅÙ+]\\a")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill684_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill684_20)).doFinal(((byte[])(__sourceSpill684_19)));
    d = ((java.lang.String)(((java.lang.String)(moom.Ls.a(((byte[])(local4_life22))))).intern()));
}


public java.lang.String toString() {
long local1 = (moom.Ls.c ^ 86278704112362L);
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1270_3(this.a, moom.Ls.d);
}


public moom.bS a__bS() {
return moom.bS.FLOAT_ARRAY;
}


public float[] a__ArrayFloat() {
return ((moom.bT)(this.a)).a__ArrayFloat(((moom.Lu[])(this.b)));
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
        byte[] spill3066_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3066_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3066_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3066_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3066_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3066_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1270_3(moom.bT a0, java.lang.String a1) throws E;
}
