package moom;


public class M4 {

private final java.lang.String a;

private final java.lang.String b;

private static final long c;

private static final java.lang.String d;

public M4(java.lang.String p0, java.lang.String p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(5208106649620265389L)), ((long)(4893570900915092780L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(201272077136796L)))));
    long local0_life6 = (moom.M4.c ^ 81813101307630L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill687_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill687_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill687_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill687_13 = new byte[8];
    (__sourceSpill687_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill687_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation687_15 = __sourceSpill687_13;
    ((javax.crypto.Cipher)(__sourceSpill687_10)).init(((int)(__sourceSpill687_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill687_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation687_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill687_19 = ((java.lang.String)("\"ôI\003øk\026jªg[5*\000|")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill687_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill687_20)).doFinal(((byte[])(__sourceSpill687_19)));
    d = ((java.lang.String)(((java.lang.String)(moom.M4.a(((byte[])(local4_life22))))).intern()));
}


public java.lang.String toString() {
return this.c();
}


public java.lang.String b() {
return this.b;
}


public java.lang.String c() {
long local1_life2 = (moom.M4.c ^ 108136069375938L);
    java.lang.String __stackOp567_6_0 = this.a;
    java.lang.String __stackOp567_6_1 = this.b;
    java.lang.String __stackOp567_6_2 = moom.M4.d;
    java.lang.String __sourceSpill567_8 = __stackOp567_6_2;
    java.lang.String __sourceSpill567_9 = __stackOp567_6_0;
    java.lang.String __sourceSpill567_10 = __stackOp567_6_1;
    recovery.source.CarrierOps.discard(__stackOp567_6_2);
    java.lang.String __stackOp567_11_0 = __sourceSpill567_10;
    java.lang.String __stackOp567_11_1 = " ";
    return __sourceIntrinsic_fe670a2392c4_originalDynamicSite567_12(__sourceSpill567_8, __sourceSpill567_9, __stackOp567_11_1, __stackOp567_11_0);
}


public java.lang.String a() {
return this.a;
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
        byte[] spill3101_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3101_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3101_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3101_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3101_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3101_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_originalDynamicSite567_12(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;
}
