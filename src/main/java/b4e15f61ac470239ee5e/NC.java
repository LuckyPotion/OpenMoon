package moom;


public class NC {

private java.lang.Class a;

private int b;

private final java.util.ArrayDeque c;

private static final long d;

private static final java.lang.String e;

public NC(java.lang.Class p0, int p1) {
super();
    this.a = null;
    this.b = 0;
    this.c = new java.util.ArrayDeque();
    this.a = p0;
    this.b = p1;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(3534578935357465793L)), ((long)(-4236599812388215220L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(142458356831047L)))));
    long local0_life6 = (moom.NC.d ^ 110523213064801L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill719_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill719_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill719_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill719_13 = new byte[8];
    (__sourceSpill719_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill719_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation719_15 = __sourceSpill719_13;
    ((javax.crypto.Cipher)(__sourceSpill719_10)).init(((int)(__sourceSpill719_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill719_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation719_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill719_19 = ((java.lang.String)("\023\026\t\005íµ¦\026õ»\036\036yh\002PÅB)Û\034£")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill719_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill719_20)).doFinal(((byte[])(__sourceSpill719_19)));
    e = ((java.lang.String)(((java.lang.String)(moom.NC.a(((byte[])(local4_life22))))).intern()));
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
        byte[] spill3285_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3285_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3285_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3285_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3285_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3285_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public synchronized java.lang.Object a(int p0) {
java.lang.Object forwardValue2774_24_0;
    java.lang.Object forwardValue2774_26_0;
    int spill2774_0;
    java.lang.Object spill2774_1;
    java.lang.Object spill2774_2;
    long life2_3;
    java.lang.Object life5_8;
    int life4_9;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    life2_3 = (moom.NC.d ^ 35680690361743L);
    spill2774_0 = moom.Ob.c();
    life5_8 = ((java.util.ArrayDeque)(this.c)).pollLast();
    life4_9 = spill2774_0;
    spill2774_1 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue2774_24_0 = spill2774_1;
        break forward_join_24;
    }
    if (!((spill2774_1 != null))) {
        break forward_join_20;
    }
    spill2774_2 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue2774_26_0 = spill2774_2;
        break forward_join_26;
    }
    if (!((java.lang.reflect.Array.getLength(((java.lang.Object)(spill2774_2))) < p0))) {
        break forward_join_25;
    }
    }
    forwardValue2774_24_0 = java.lang.reflect.Array.newInstance(((java.lang.Class)(this.a)), ((int)(p0)));
    }
    life5_8 = forwardValue2774_24_0;
    }
    forwardValue2774_26_0 = life5_8;
    }
    return forwardValue2774_26_0;
}


public synchronized void a(java.lang.Object p0) {
java.lang.Object forwardValue2775_11_0;
    int forwardValue2775_35_0;
    java.lang.Object spill2775_0;
    int spill2775_1;
    long life2_3;
    int life4_5;
    java.lang.Class life5_15;
    forward_join_36: {
    forward_join_35: {
    forward_join_23: {
    forward_join_11: {
    life2_3 = (moom.NC.d ^ 26987482315252L);
    life4_5 = moom.Ob.b();
    spill2775_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue2775_11_0 = spill2775_0;
        break forward_join_11;
    }
    if (!((spill2775_0 != null))) {
        break forward_join_36;
    }
    forwardValue2775_11_0 = p0;
    }
    life5_15 = ((java.lang.Object)(forwardValue2775_11_0)).getClass();
    if (!((((java.lang.Class)(life5_15)).getComponentType() != this.a))) {
        break forward_join_23;
    }
    throw new java.lang.IllegalArgumentException(moom.NC.e);
    }
    spill2775_1 = ((java.util.ArrayDeque)(this.c)).size();
    if (!((life4_5 == 0))) {
        forwardValue2775_35_0 = spill2775_1;
        break forward_join_35;
    }
    if (!((spill2775_1 < this.b))) {
        break forward_join_36;
    }
    forwardValue2775_35_0 = ((((java.util.ArrayDeque)(this.c)).add(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue2775_35_0);
    }
    return;
}

}
