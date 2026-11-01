package moom;


public class Mz implements java.util.Iterator {

private final moom.lv a;

private final moom.Mx b;

private final moom.DX c;

private static final long d;

private static final java.lang.String e;

public Mz(moom.lv p0, moom.DT p1, moom.DT p2, int p3, int p4) {
super();
    this.c = new moom.DX(0, 0, 0);
    this.a = p0;
    this.b = new moom.Mx(p1, p2, p3, p4);
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(8601131283345290477L)), ((long)(-8119971568121808212L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(79020070720420L)))));
    long local0_life6 = (moom.Mz.d ^ 70994975848307L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill713_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill713_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill713_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill713_13 = new byte[8];
    (__sourceSpill713_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill713_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation713_15 = __sourceSpill713_13;
    ((javax.crypto.Cipher)(__sourceSpill713_10)).init(((int)(__sourceSpill713_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill713_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation713_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill713_19 = ((java.lang.String)("8ù\005VaÛ\033Ù@\037b\177öà")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill713_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill713_20)).doFinal(((byte[])(__sourceSpill713_19)));
    e = ((java.lang.String)(((java.lang.String)(moom.Mz.a(((byte[])(local4_life22))))).intern()));
}


public void remove() {
long local1 = (moom.Mz.d ^ 62830384009770L);
    throw new java.lang.RuntimeException(moom.Mz.e);
}


public boolean hasNext() {
return (__sourceIntrinsic_booleanComparison((((moom.Mx)(this.b)).hasNext())) != 0);
}


public java.lang.Object next() {
return this.a();
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
        byte[] spill3264_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3264_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3264_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3264_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3264_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3264_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public moom.mp a() {
java.lang.Object local1 = ((moom.Mx)(this.b)).a();
    ((moom.DX)(this.c)).a__Void(((int)((((moom.DT)(local1)).a() << 4))), ((int)((((moom.DT)(local1)).b() << 4))), ((int)((((moom.DT)(local1)).c() << 4))));
    return ((moom.lv)(this.a)).a(((moom.DT)(this.c)));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
