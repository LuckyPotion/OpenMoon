package moom;


public class Ln implements moom.Lx, moom.Lw {

private final moom.Lx a;

private boolean b;

private float c;

private static final long d;

private static final java.lang.String e;

public Ln(moom.Lx p0) {
super();
    this.a = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(2222626332333698653L)), ((long)(-5949609805810482076L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(104182119352342L)))));
    long local0_life6 = (moom.Ln.d ^ 4641976611214L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill680_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill680_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill680_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill680_13 = new byte[8];
    (__sourceSpill680_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill680_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation680_15 = __sourceSpill680_13;
    ((javax.crypto.Cipher)(__sourceSpill680_10)).init(((int)(__sourceSpill680_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill680_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation680_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill680_19 = ((java.lang.String)("¿^ø8$ªû")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill680_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill680_20)).doFinal(((byte[])(__sourceSpill680_19)));
    e = ((java.lang.String)(((java.lang.String)(moom.Ln.a(((byte[])(local4_life22))))).intern()));
}


public java.lang.String toString() {
long local1_life2 = (moom.Ln.d ^ 61757938853147L);
    moom.Lx __stackOp564_5_0 = this.a;
    java.lang.String __stackOp564_5_1 = moom.Ln.e;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite564_6(__stackOp564_5_1, __stackOp564_5_0, ")");
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
        byte[] spill3047_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3047_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3047_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3047_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3047_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3047_2)[life4_9];
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


public float a() {
moom.Ln forwardValue2585_20_0;
    moom.Ln spill2585_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.Ln.d ^ 54762933883318L);
    life3_5 = moom.bS.b();
    spill2585_0 = this;
    if (!((life3_5 != null))) {
        forwardValue2585_20_0 = spill2585_0;
        break forward_join_20;
    }
    if (!((!((moom.Ln)(spill2585_0)).b))) {
        break forward_join_19;
    }
    this.c = ((float)(((moom.Lx)(this.a)).a()));
    this.b = ((boolean)(true));
    }
    forwardValue2585_20_0 = this;
    }
    return ((moom.Ln)(forwardValue2585_20_0)).c;
}


public void a__Void() {
this.b = ((boolean)(false));
    return;
}


public moom.bS a__bS() {
return moom.bS.FLOAT;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite564_6(java.lang.String a0, moom.Lx a1, java.lang.String a2) throws E;
}
