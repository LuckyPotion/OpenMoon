package moom;


public class Lq implements moom.Lv {

private final moom.bT a;

private final moom.Lu[] b;

private static final long c;

private static final java.lang.String d;

public Lq(moom.bT p0, moom.Lu[] p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-1310569199528646860L)), ((long)(677236144484071165L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(46613305898325L)))));
    long local0_life6 = (moom.Lq.c ^ 114364035098716L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill682_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill682_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill682_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill682_13 = new byte[8];
    (__sourceSpill682_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill682_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation682_15 = __sourceSpill682_13;
    ((javax.crypto.Cipher)(__sourceSpill682_10)).init(((int)(__sourceSpill682_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill682_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation682_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill682_19 = ((java.lang.String)("­by×«'÷")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill682_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill682_20)).doFinal(((byte[])(__sourceSpill682_19)));
    d = ((java.lang.String)(((java.lang.String)(moom.Lq.a(((byte[])(local4_life22))))).intern()));
}


public java.lang.String toString() {
long local1 = (moom.Lq.c ^ 9746375671846L);
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1268_3(this.a, moom.Lq.d);
}


public moom.bS a__bS() {
return moom.bS.BOOL;
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((moom.bT)(this.a)).a__Boolean(((moom.Lu[])(this.b))))) != 0);
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
        byte[] spill3063_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3063_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3063_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3063_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3063_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3063_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1268_3(moom.bT a0, java.lang.String a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
